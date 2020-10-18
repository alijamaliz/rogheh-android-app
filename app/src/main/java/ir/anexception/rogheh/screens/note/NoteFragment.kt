package ir.anexception.rogheh.screens.note

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import ir.anexception.rogheh.screens.note.NoteFragmentArgs
import ir.anexception.rogheh.R
import ir.anexception.rogheh.database.NotesDatabase
import ir.anexception.rogheh.databinding.FragmentNoteBinding

class NoteFragment : Fragment() {

    val args: NoteFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val binding: FragmentNoteBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_note, container, false)

        val application = requireNotNull(this.activity).application
        val dataSource = NotesDatabase.getInstance(application).notesDatabaseDao
        val noteId = args.noteId

        val model: NoteViewModel by viewModels {
            NoteViewModelFactory(
                dataSource,
                application,
                noteId
            )
        }

        binding.noteViewModel = model
        binding.lifecycleOwner = this

        setHasOptionsMenu(true);

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.note_menu, menu)

        // Check if the activity resolves
        if (getShareIntent().resolveActivity(activity!!.packageManager) == null) {
            // Hide share item from menu
            menu.findItem(R.id.shareNote).isVisible = false
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.copyNote -> true
            R.id.shareNote -> {
                shareNote()
                return true
            }
            R.id.editNote -> false
            R.id.removeNote -> false
            else -> false
        }
    }

    private fun getShareIntent(): Intent {
        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent
            .setType("text/plain")
            .putExtra(Intent.EXTRA_TEXT, "You are sharing ${args.noteId} note!")
        return shareIntent
    }

    private fun shareNote() {
        startActivity(getShareIntent())
    }

}
package ir.anexception.rogheh

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
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

        binding.noteText.text = "This is ${args.noteId} note!"

        setHasOptionsMenu(true);

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.note_menu, menu);
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.copyNote -> {
                Log.d("SHALGHAM", "FARANGI")
                return true
            }
            R.id.editNote -> false
            R.id.removeNote -> false
            else -> false
        }
    }

}
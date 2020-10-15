package ir.anexception.rogheh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import ir.anexception.rogheh.databinding.FragmentNotesListBinding

class NotesListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentNotesListBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_notes_list, container, false)
        binding.noteButton.setOnClickListener (
            Navigation.createNavigateOnClickListener(NotesListFragmentDirections.actionNotesListFragmentToNoteFragment(5))
        )
        return binding.root
    }

}
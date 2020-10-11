package ir.anexception.rogheh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import ir.anexception.rogheh.databinding.FragmentNotesListBinding

class NotesListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentNotesListBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_notes_list, container, false)
        return binding.root
    }

}
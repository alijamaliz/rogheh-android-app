package ir.anexception.rogheh.screens.notes

import android.util.Log
import androidx.lifecycle.ViewModel

class NotesViewModel : ViewModel() {

    private var notes = "Notes array"

    init {
        Log.i("NotesView", "Created")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("NotesView", "Destroyed")
    }

    fun getNotes(): String {
        return notes
    }

}
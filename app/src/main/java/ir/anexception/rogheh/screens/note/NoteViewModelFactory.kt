package ir.anexception.rogheh.screens.note

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ir.anexception.rogheh.database.NotesDatabase
import ir.anexception.rogheh.database.NotesDatabaseDao
import java.lang.IllegalArgumentException

class NoteViewModelFactory(
    private val dataSource: NotesDatabaseDao,
    private val application: Application,
    private val noteId: Int
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(NoteViewModel::class.java)) {
            return NoteViewModel(dataSource, application, noteId) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
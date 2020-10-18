package ir.anexception.rogheh.screens.note

import androidx.lifecycle.ViewModel

class NoteViewModel: ViewModel() {
    init {

    }

    fun getNoteText(): String {
        return "با سلام. این یک رقعه آزمایشی می‌باشد!"
    }
}
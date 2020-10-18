package ir.anexception.rogheh.screens.note

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NoteViewModel : ViewModel() {

    var noteText = MutableLiveData<String>()

    init {
        noteText.value = "با سلام. این یک رقعه آزمایشی می‌باشد!"
    }

    fun getNote() {}
}
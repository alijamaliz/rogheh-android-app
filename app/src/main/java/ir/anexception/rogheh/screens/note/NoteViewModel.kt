package ir.anexception.rogheh.screens.note

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NoteViewModel(private val noteId: Int) : ViewModel() {

    private var _noteText = MutableLiveData<String>()
    val noteText: LiveData<String>
        get() = _noteText

    init {
        _noteText.value = "با سلام. این یک رقعه آزمایشی می‌باشد!"
    }

    fun getNote() {}
}
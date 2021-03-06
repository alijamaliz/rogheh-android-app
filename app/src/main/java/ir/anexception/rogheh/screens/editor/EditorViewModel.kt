package ir.anexception.rogheh.screens.editor

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ir.anexception.rogheh.database.NotesDatabaseDao

class EditorViewModel(
    private val dataSource: NotesDatabaseDao,
    application: Application,
    private val noteId: Int
) : AndroidViewModel(application) {

    private var _noteText = MutableLiveData<String>()
    val noteText: LiveData<String>
        get() = _noteText

    init {
        _noteText.value = "با سلام. این یک رقعه آزمایشی می‌باشد!"
    }

    fun getNote() {}

    fun generateNote() {
        _noteText.value = (_noteText.value)?.substring(3) + _noteText.value
    }
}
package ir.anexception.rogheh.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NotesDatabaseDao {

    @Insert
    fun createNote(note: Note)

    @Update
    fun updateNote(note: Note)

    @Query("SELECT * FROM notes_table WHERE id = :noteId")
    fun getNote(noteId: Long): Note

    @Query("SELECT * FROM notes_table")
    fun getNotes(): LiveData<List<Note>>

    @Delete
    fun deleteNote(note: Note)

    @Delete
    fun deleteNotes(notes: List<Note>): Int
}
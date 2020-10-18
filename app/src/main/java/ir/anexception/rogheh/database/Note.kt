package ir.anexception.rogheh.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")
data class Note(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var noteId: Long = 0L,

    @ColumnInfo(name = "create_date")
    var createDate: Long = System.currentTimeMillis(),

    @ColumnInfo(name = "title")
    var title: String = "",

    @ColumnInfo(name = "text")
    var text: String = ""

)
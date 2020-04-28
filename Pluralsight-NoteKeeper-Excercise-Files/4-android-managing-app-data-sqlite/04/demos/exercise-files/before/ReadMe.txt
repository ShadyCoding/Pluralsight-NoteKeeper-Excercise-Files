As we're transitioning our app from using the in-memory lists to using the database, some features that we haven't yet converted to use the database may stop working or may possibly even create an error until those features are transitioned to the database.

-------------------------------------------
Open the NoteListActivity class and locate the method initializeDisplayContent. Change the line that constructs the NoteRecyclerAdapter instance to pass null as the 2nd parameter...

   mNoteRecyclerAdapter = new NoteRecyclerAdapter(this, null);

Our application no longer uses the NoteListActivity class so this change will have no effect on app execution. Without this change, the program will encounter compilation errors after the NoteRecyclerAdapter constructor is changed to accept a Cursor rather than a List.
-------------------------------------------
Open the NoteActivity class and locate the method saveNote. Comment out the line that gets that calls mSpinnerCourses.getSelectedItem()...

  private void saveNote() {
    // mNote.setCourse((CourseInfo) mSpinnerCourses.getSelectedItem());
    mNote.setTitle(mTextNoteTitle.getText().toString());
    mNote.setText(mTextNoteText.getText().toString());
  }

Once you've changed the mSpinnerCourses to be populated by a CursorAdapter, the attempt to cast the selected item to a CourseInfo reference would encounter an error.

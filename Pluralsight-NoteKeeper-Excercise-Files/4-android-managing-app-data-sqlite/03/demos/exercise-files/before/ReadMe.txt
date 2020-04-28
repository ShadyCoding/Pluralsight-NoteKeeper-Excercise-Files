As we're transitioning our app from using the in-memory lists to using the database, some features that we haven't yet converted to use the database may stop working or may possibly even create an error until those features are transitioned to the database.

-------------------------------------------

If your following allowing with the code, change the mNote decleration in NoteActivity to the following...

    private NoteInfo mNote = 
      new NoteInfo(DataManager.getInstance().getCourses().get(0), "", "");

This change is necessary because we're incrementally changing the program from using the in-memory list to using the database. Without the above decleration change, some aspects of the not-yet-changed code would encounter a NullReferenceException once we stop setting the value of mNote during the regular application behavior

-------------------------------------------


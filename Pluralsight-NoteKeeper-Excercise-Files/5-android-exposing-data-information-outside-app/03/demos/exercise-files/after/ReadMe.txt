The NoteKeeper project in this folder contains the complete NoteKeeperProvider implementation. NoteKeeperProvider includes the following:
  • getType supports courses, notes, and notes_expanded Table URIs and Row URIs
  • query supports courses, notes, and notes_expanded Table URIs and Row URIs
  • insert supports courses and notes Table URIs (Row URIs are invalid for inserts)
  • update and delete support courses and notes Table URIs and Row URIs

The NoteActivity class utilizes these additional NoteKeeperProvider capabilities and there no longer needs to perform 
direct database interaction. 
  • The NoteActivity class performs all queries, inserts, updates, and deletes using Note Row URIs and the 
NoteKeeperProvider.

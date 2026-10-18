# MusicPlaylistJava

**MusicPlaylistJava** is a simple Java console application that demonstrates how to create and manage a basic music playlist using Java's `LinkedList` collection.

The program stores song titles and artist names in separate lists, combines them into playlist entries, and displays the results in the console.

## Features

- Uses Java's built-in `LinkedList` collection.
- Stores five song titles and their corresponding artists.
- Combines song titles and artist names into playlist entries.
- Displays the song list and artist list separately.
- Prints each combined playlist entry using an enhanced `for` loop.
- Demonstrates basic Java collections, loops, and string concatenation.

## Sample Playlist

| Song Title | Artist |
|---|---|
| Back To December (Taylor's Version) | Taylor Swift |
| Look at the Sky | Porter Robinson |
| vampire | Olivia Rodrigo |
| Super Shy | NewJeans |
| Home To Another One | Madison Beer |

## Requirements

- Java Development Kit (JDK)
- A Java-compatible IDE or code editor, or a terminal

## Project Structure

```text
MusicPlaylistJava/
├── MusicPlaylist.java
└── README.md
```

## How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/ichiroyamazaki/MusicPlaylistJava.git
```

### 2. Open the Project Directory

```bash
cd MusicPlaylistJava
```

### 3. Compile the Java Source

The source file declares the `MusicPlaylist` package. Compile it with:

```bash
javac -d . MusicPlaylist.java
```

### 4. Run the Program

```bash
java MusicPlaylist.MusicPlaylist
```

You can also import the source file into a Java IDE and run the `main` method.

## Example Output

```text
[Back To December (Taylor's Version), Look at the Sky, vampire, Super Shy, Home To Another One]
[Taylor Swift, Porter Robinson, Olivia Rodrigo, NewJeans, Madison Beer]
Back To December (Taylor's Version) - Taylor Swift
Look at the Sky - Porter Robinson
vampire - Olivia Rodrigo
Super Shy - NewJeans
Home To Another One - Madison Beer
```

## Concepts Demonstrated

**LinkedList:** Stores song titles, artist names, and formatted playlist entries.

**Loops:** Uses a `for` loop to combine corresponding songs and artists, followed by an enhanced `for` loop to display playlist entries.

**String Concatenation:** Combines each song title with its corresponding artist name.

**Java Packages:** Organizes the class under the `MusicPlaylist` package.

## Limitations

- The playlist entries are predefined in the source code.
- The program does not accept user input or play audio files.
- Songs and artists are matched by their list positions.
- There are no features for adding, deleting, searching, or rearranging songs at runtime.

## Author

**Ichiro Yamazaki**

## License

No license is specified in this repository. Check the repository for licensing information before redistributing or modifying the project.

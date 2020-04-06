public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isRepeatingPlaylist() {
        Song song = this.nextSong;
        Song temp = song == null ? null : song.nextSong;
        while (temp != null) {
            // the playlist only has one song 单曲循环
            if (song == this || song == temp)
                return true;
            // others
            song = song.nextSong;
            temp = temp.nextSong;
            if (temp != null)
                temp = temp.nextSong;
        }
        return false;
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first);

        System.out.println(first.isRepeatingPlaylist());
    }
}
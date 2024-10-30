package chapter10.song;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayList {
    private List<Song> tracks = new ArrayList<Song>();
    private Map<String, String> singers = new HashMap<>();

    public void append(Song song){
        tracks.add(song);
//        singers.put(song.getSinger(), song.getTitle());  기능 추가
    }

    public List<Song> getTracks(){
        return tracks;
    }

    public Map<String, String> getSingers() {
        return singers;
    }
}

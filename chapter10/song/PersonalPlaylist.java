package chapter10.song;

public class PersonalPlaylist extends PlayList{
    public void remove(Song song) {
        getTracks().remove(song);
//        getSingers().remove(song.getSinger()); 부모 클래스의 기능 추가로 자식 클래스도 변경해줘야됨
    }
}

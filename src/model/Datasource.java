package model;

import java.sql.*;

public class Datasource {
    public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DB_NAME = "musicdb";
    public static final String url = "jdbc:mysql://localhost:3306/" + DB_NAME;
    public static final String user = "root";
    public static final String pass = "";

    public static final String TABLE_ALBUM = "albums";
    public static final String COLUMN_ALBUM_ID = "_id";
    public static final String COLUMN_ALBUM_NAME = "name";
    public static final String COLUMN_ALBUM_ARTIST = "artist";

    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTIST_ID = "_id";
    public static final String COLUMN_ARTIST_NAME = "name";


    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONGS_ID = "_id";
    public static final String COLUMN_SONGS_TRACK = "track";
    public static final String COLUMN_SONGS_TITLE = "title";
    public static final String COLUMN_SONGS_ALBUM = "album";

    private Connection connection = null;

    public boolean open() {
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(url,user,pass);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void close() {
        try {
            if(connection != null){
                connection.close();
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public List<Artist> queryArtist() {
        Statement statement = null;
        ResultSet results = null;

        try {

        } catch (SQLException e){
            System.out.println("Artist query failed: " + e.getMessage());
            return null;
        }
    }
}

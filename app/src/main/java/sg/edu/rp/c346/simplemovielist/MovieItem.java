package sg.edu.rp.c346.simplemovielist;

import android.graphics.Movie;

/**
 * Created by 17010578 on 18/7/2018.
 */

public class MovieItem {

    private String movieName;
    private String releaseDate;

    public MovieItem (String movieName, String releaseDate){
    this.movieName = movieName;
    this.releaseDate = releaseDate;
    }

    public String getMovieName() {
        return  movieName;
    }

    public void setMovieName (String movieName) {
        this.movieName=movieName;
    }

    public String getReleaseDate(){
        return  releaseDate;
    }

    public void setReleaseDate(String releaseDate){
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "MovieItem{" +
                "movieName='" + movieName + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}


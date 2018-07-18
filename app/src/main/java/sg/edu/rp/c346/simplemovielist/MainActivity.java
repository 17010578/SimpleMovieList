package sg.edu.rp.c346.simplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<MovieItem> alMovieList;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovie);

        alMovieList = new ArrayList<>();

        MovieItem item1 = new MovieItem("Avengers","2018.04");

        MovieItem item2 = new MovieItem("Justice Leauge","2017.11");
        alMovieList.add(item1);
        alMovieList.add(item2);

        caMovie= new CustomAdapter(this,R.layout.movie_item,alMovieList);

        lvMovie.setAdapter(caMovie);

    }
}

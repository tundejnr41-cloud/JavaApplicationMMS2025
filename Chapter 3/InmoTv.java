com.inmotv.app
 ├── MainActivity.java
 ├── adapters/
 │     └── MovieAdapter.java
 ├── models/
 │     └── Movie.java
 ├── fragments/
 │     ├── HomeFragment.java
 │     ├── LiveFragment.java
 │     ├── BrowseFragment.java
 │     └── ProfileFragment.java
 dependencies {

    implementation 'androidx.recyclerview:recyclerview:1.3.2'
    implementation 'com.google.android.material:material:1.11.0'
    implementation 'androidx.cardview:cardview:1.0.0'
}
<application
    android:theme="@style/Theme.Material3.Dark.NoActionBar"
    android:label="INMO TV">

    <activity android:name=".MainActivity">
        <intent-filter>
            <action android:name="android.intent.action.MAIN"/>
            <category android:name="android.intent.category.LAUNCHER"/>
        </intent-filter>
    </activity>

</application>
package com.inmotv.app;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNav);

        loadFragment(new HomeFragment());

        bottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment fragment = null;

            switch (item.getItemId()) {
                case R.id.nav_home:
                    fragment = new HomeFragment();
                    break;
                case R.id.nav_live:
                    fragment = new LiveFragment();
                    break;
                case R.id.nav_browse:
                    fragment = new BrowseFragment();
                    break;
                case R.id.nav_profile:
                    fragment = new ProfileFragment();
                    break;
            }

            return loadFragment(fragment);
        });
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
            return true;
        }
        return false;
    }
}
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:background="#0D0D0D"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <FrameLayout
        android:id="@+id/fragment_container"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_above="@id/bottomNav"/>

    <com.google.android.material.bottomnavigation.BottomNavigationView
        android:id="@+id/bottomNav"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:background="#111111"
        app:menu="@menu/bottom_menu"
        app:itemIconTint="@color/white"
        app:itemTextColor="@color/white"/>
</RelativeLayout>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:id="@+id/nav_home"
        android:title="Home"
        android:icon="@drawable/ic_home"/>
    <item android:id="@+id/nav_live"
        android:title="Live"
        android:icon="@drawable/ic_live"/>
    <item android:id="@+id/nav_browse"
        android:title="Browse"
        android:icon="@drawable/ic_browse"/>
    <item android:id="@+id/nav_profile"
        android:title="Profile"
        android:icon="@drawable/ic_profile"/>
</menu>
package com.inmotv.app.models;

public class Movie {

    String title;
    int image;

    public Movie(String title, int image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() { return title; }
    public int getImage() { return image; }
}
package com.inmotv.app.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.inmotv.app.R;
import com.inmotv.app.models.Movie;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    List<Movie> movieList;

    public MovieAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_movie, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Movie movie = movieList.get(position);
        holder.title.setText(movie.getTitle());
        holder.image.setImageResource(movie.getImage());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView title;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.movieImage);
            title = itemView.findViewById(R.id.movieTitle);
        }
    }
}
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="140dp"
    android:layout_height="wrap_content"
    android:padding="8dp">

    <ImageView
        android:id="@+id/movieImage"
        android:layout_width="match_parent"
        android:layout_height="180dp"
        android:scaleType="centerCrop"
        android:background="@drawable/sample_poster"/>

    <TextView
        android:id="@+id/movieTitle"
        android:textColor="#FFFFFF"
        android:textSize="14sp"
        android:paddingTop="5dp"
        android:text="Movie Title"/>
</LinearLayout>
package com.inmotv.app.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.inmotv.app.R;
import com.inmotv.app.adapters.MovieAdapter;
import com.inmotv.app.models.Movie;
import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerMovies);
        recyclerView.setLayoutManager(
                new LinearLayoutManager(getContext(),
                        LinearLayoutManager.HORIZONTAL, false));

        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Galactic War", R.drawable.sample_poster));
        movieList.add(new Movie("Crime Syndicate", R.drawable.sample_poster));
        movieList.add(new Movie("Jungle Pursuit", R.drawable.sample_poster));

        recyclerView.setAdapter(new MovieAdapter(movieList));

        return view;
    }
}
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:background="#0D0D0D"
    android:orientation="vertical"
    android:padding="16dp"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:text="INMO TV"
        android:textColor="#FF2E8B"
        android:textSize="26sp"
        android:textStyle="bold"/>

    <TextView
        android:text="Trending Now"
        android:textColor="#FFFFFF"
        android:textSize="18sp"
        android:paddingTop="16dp"/>

    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/recyclerMovies"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>
</LinearLayout>
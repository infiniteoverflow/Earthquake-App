package com.example.android.quakereport;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private static final String LOG_TAG = EarthquakeAdapter.class.getSimpleName();

    EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes)
    {
        super(context,0,earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;

        if(listItemView==null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_view,parent,false);
        }

        Earthquake setOfEarthquakes = getItem(position);

        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude);

        magnitudeTextView.setText(Double.toString(setOfEarthquakes.getMagnitude()));

        TextView PlaceTextView = (TextView) listItemView.findViewById(R.id.place);

        PlaceTextView.setText(setOfEarthquakes.getPlace());

        TextView DateTextView = (TextView) listItemView.findViewById(R.id.time);

        DateTextView.setText(setOfEarthquakes.getDate());


        return listItemView;
    }
}

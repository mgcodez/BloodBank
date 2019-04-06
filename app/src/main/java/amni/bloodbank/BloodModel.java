package amni.bloodbank;

import android.app.Activity;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


/**
 * Created by Belal on 2/26/2017.
 */

public class BloodModel extends ArrayAdapter<AddEntry> {
    private Activity context;
    List<AddEntry> artists;

    public BloodModel(Activity context, List<AddEntry> artists) {
        super(context, R.layout.activity_blood_model, artists);
        this.context = context;
        this.artists = artists;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.activity_blood_model, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.mtext);
        TextView textViewGenre = (TextView) listViewItem.findViewById(R.id.mDate);
        TextView textViewTag = (TextView) listViewItem.findViewById(R.id.Tags);

        AddEntry artist = artists.get(position);
        textViewName.setText(artist.getmAName());
        textViewGenre.setText(artist.getmDBlood());
        textViewTag.setText(artist.getmBPhone());
        return listViewItem;
    }
}

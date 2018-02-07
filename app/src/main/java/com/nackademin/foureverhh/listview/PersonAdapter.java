package com.nackademin.foureverhh.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by foureverhh on 2018-02-01.
 */

public class PersonAdapter extends ArrayAdapter<String>
{
    private Context context;
    private String[] values;

    private LayoutInflater inflater; //what does inflater mean

    public PersonAdapter(Context context,String[] values)
    {
        super(context,-1,values); //what does -1 mean here
        this.context = context;
        this.values = values;

        inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);// initialize the inflater

    }
    //Create own listView layout
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItem = inflater.inflate(R.layout.list_item_layout,parent,false); //Check this later
        ImageView imageView = listItem.findViewById(R.id.picture);
        TextView title = listItem.findViewById(R.id.title);
        TextView subtitle = listItem.findViewById(R.id.subtitle);

        title.setText(values[position]);
        subtitle.setText("Here is subtitle");
        //all images are profile
        //imageView.setImageResource(R.drawable.profile);

        String s =values[position];
        if(s.equals("David"))
        {
            imageView.setImageResource(R.drawable.david);
        }else
        {
            imageView.setImageResource(R.drawable.profile);
        }

        return listItem;
    }
}

package com.pwk.app.test005;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by pwk82_000 on 2016-01-09.
 */
public class CustomListAdapter extends BaseAdapter{
    String[] title;
    String[] date;
    Context mContext;



    public CustomListAdapter(Context context, String[] Title, String[] Date){
        title = Title;
        date = Date;
        mContext = context;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public class ViewHolder{
        TextView mTitle;
        TextView mDate;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder Holder;

        LayoutInflater LI = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView==null){
            //Inflate VIew -- bbsrow.xml을 view 객체로 만든다?
            convertView = LI.inflate(R.layout.bbsrow, null);
            Holder = new ViewHolder();
            Holder.mTitle = (TextView)convertView.findViewById(R.id.title);
            Holder.mDate = (TextView)convertView.findViewById(R.id.date);
        }else{
            //Nothing
            Holder = (ViewHolder) convertView.getTag();
        }

        Holder.mTitle.setText(title[position]);
        Holder.mDate.setText(date[position]);
        Log.d("TAG", "Returning View...");
        return convertView;
    }
}

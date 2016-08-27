package com.mradovan.Sample_EventMapping;

import android.view.View;
import android.widget.TextView;

/**
 * Created by mradovan on 2016/08/22.
 */
public class EventOnClick implements View.OnClickListener {

    private TextView txtTopLeft;
    private MainActivity mainActivity;

    EventOnClick(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View view){
        txtTopLeft = (TextView) mainActivity.findViewById(com.mradovan.Sample_EventMapping.R.id.txtTopLeft);
        txtTopLeft.setText("Changed!");
    }
}

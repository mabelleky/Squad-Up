package com.mash.squadup.Screen;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toolbar;

import java.util.ArrayList;

public class ScreenLayout
{
    private Context m_context;
    private LinearLayout m_layout;
    public ArrayList<View> screenViews = new ArrayList<>();

    public ScreenLayout(Context context, LinearLayout layout)
    {
        m_context = context;
        m_layout = layout;
    }
    public Button AddButton(String text)
    {
        Button button = new Button(m_context);
        button.setText(text);
        m_layout.addView(button);
        screenViews.add(button);
        return button;
    }
    public Button AddButton(String text, int color)
    {
        Button button = AddButton(text);
        button.setBackgroundColor(color);
        return button;
    }

    public void ButtonOnClicked(Button button, View.OnClickListener listener)
    {
        button.setOnClickListener(listener);
    }
}

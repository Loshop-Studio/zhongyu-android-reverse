package com.lljjcoder.style.citypickerview.widget.wheel.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* loaded from: classes3.dex */
public abstract class AbstractWheelTextAdapter extends AbstractWheelAdapter {
    public static final int DEFAULT_TEXT_COLOR = -10987432;
    public static final int DEFAULT_TEXT_SIZE = 18;
    public static final int LABEL_COLOR = -9437072;
    protected static final int NO_RESOURCE = 0;
    public static final int TEXT_VIEW_ITEM_RESOURCE = -1;
    protected Context context;
    protected int emptyItemResourceId;
    protected LayoutInflater inflater;
    protected int itemResourceId;
    protected int itemTextResourceId;
    private int padding;
    private int textColor;
    private int textSize;

    public AbstractWheelTextAdapter(Context context) {
        this(context, -1);
    }

    private TextView getTextView(View view, int i6) {
        if (i6 == 0) {
            try {
                if (view instanceof TextView) {
                    return (TextView) view;
                }
            } catch (ClassCastException e6) {
                Log.e("AbstractWheelAdapter", "You must supply a resource ID for a TextView");
                throw new IllegalStateException("AbstractWheelAdapter requires the resource ID to be a TextView", e6);
            }
        }
        if (i6 != 0) {
            return (TextView) view.findViewById(i6);
        }
        return null;
    }

    private View getView(int i6, ViewGroup viewGroup) {
        if (i6 == -1) {
            return new TextView(this.context);
        }
        if (i6 != 0) {
            return this.inflater.inflate(i6, viewGroup, false);
        }
        return null;
    }

    public void configureTextView(TextView textView) {
        textView.setTextColor(this.textColor);
        textView.setGravity(17);
        int i6 = this.padding;
        textView.setPadding(0, i6, 0, i6);
        textView.setTextSize(this.textSize);
    }

    @Override // com.lljjcoder.style.citypickerview.widget.wheel.adapters.AbstractWheelAdapter, com.lljjcoder.style.citypickerview.widget.wheel.adapters.WheelViewAdapter
    public View getEmptyItem(View view, ViewGroup viewGroup) {
        if (view == null) {
            view = getView(this.emptyItemResourceId, viewGroup);
        }
        if (this.emptyItemResourceId == -1 && (view instanceof TextView)) {
            configureTextView((TextView) view);
        }
        return view;
    }

    public int getEmptyItemResource() {
        return this.emptyItemResourceId;
    }

    @Override // com.lljjcoder.style.citypickerview.widget.wheel.adapters.WheelViewAdapter
    public View getItem(int i6, View view, ViewGroup viewGroup) {
        if (i6 < 0 || i6 >= getItemsCount()) {
            return null;
        }
        if (view == null) {
            view = getView(this.itemResourceId, viewGroup);
        }
        TextView textView = getTextView(view, this.itemTextResourceId);
        if (textView != null) {
            CharSequence itemText = getItemText(i6);
            if (itemText == null) {
                itemText = "";
            }
            textView.setText(itemText);
            if (this.itemResourceId == -1) {
                configureTextView(textView);
            }
        }
        return view;
    }

    public int getItemResource() {
        return this.itemResourceId;
    }

    public abstract CharSequence getItemText(int i6);

    public int getItemTextResource() {
        return this.itemTextResourceId;
    }

    public int getPadding() {
        return this.padding;
    }

    public int getTextColor() {
        return this.textColor;
    }

    public int getTextSize() {
        return this.textSize;
    }

    public void setEmptyItemResource(int i6) {
        this.emptyItemResourceId = i6;
    }

    public void setItemResource(int i6) {
        this.itemResourceId = i6;
    }

    public void setItemTextResource(int i6) {
        this.itemTextResourceId = i6;
    }

    public void setPadding(int i6) {
        this.padding = i6;
    }

    public void setTextColor(int i6) {
        this.textColor = i6;
    }

    public void setTextSize(int i6) {
        this.textSize = i6;
    }

    public AbstractWheelTextAdapter(Context context, int i6) {
        this(context, i6, 0);
    }

    public AbstractWheelTextAdapter(Context context, int i6, int i7) {
        this.textColor = DEFAULT_TEXT_COLOR;
        this.textSize = 18;
        this.padding = 5;
        this.context = context;
        this.itemResourceId = i6;
        this.itemTextResourceId = i7;
        this.inflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}

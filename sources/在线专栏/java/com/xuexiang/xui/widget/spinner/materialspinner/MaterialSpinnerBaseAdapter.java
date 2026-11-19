package com.xuexiang.xui.widget.spinner.materialspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import java.util.List;

/* loaded from: classes.dex */
public abstract class MaterialSpinnerBaseAdapter<T> extends BaseAdapter {
    private int backgroundSelector;
    private final Context context;
    private int selectedIndex;
    private int textColor;
    private float textSize;

    private static class ViewHolder {
        private TextView textView;

        private ViewHolder(TextView textView) {
            this.textView = textView;
        }
    }

    public MaterialSpinnerBaseAdapter(Context context) {
        this.context = context;
    }

    public abstract T get(int i4);

    @Override // android.widget.Adapter
    public abstract int getCount();

    @Override // android.widget.Adapter
    public abstract T getItem(int i4);

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    public String getItemText(int i4) {
        return getItem(i4).toString();
    }

    public abstract List<T> getItems();

    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        TextView textView;
        if (view == null) {
            view = LayoutInflater.from(this.context).inflate(C2042R.layout.ms_layout_list_item, viewGroup, false);
            textView = (TextView) view.findViewById(C2042R.id.tv_tinted_spinner);
            textView.setTextColor(this.textColor);
            textView.setTextSize(0, this.textSize);
            int i5 = this.backgroundSelector;
            if (i5 != 0) {
                textView.setBackgroundResource(i5);
            }
            if (this.context.getResources().getConfiguration().getLayoutDirection() == 1) {
                textView.setTextDirection(4);
            }
            view.setTag(new ViewHolder(textView));
        } else {
            textView = ((ViewHolder) view.getTag()).textView;
        }
        textView.setText(getItemText(i4));
        return view;
    }

    public void notifyItemSelected(int i4) {
        this.selectedIndex = i4;
    }

    public MaterialSpinnerBaseAdapter<T> setBackgroundSelector(int i4) {
        this.backgroundSelector = i4;
        return this;
    }

    public MaterialSpinnerBaseAdapter<T> setTextColor(int i4) {
        this.textColor = i4;
        return this;
    }

    public MaterialSpinnerBaseAdapter<T> setTextSize(float f4) {
        this.textSize = f4;
        return this;
    }
}

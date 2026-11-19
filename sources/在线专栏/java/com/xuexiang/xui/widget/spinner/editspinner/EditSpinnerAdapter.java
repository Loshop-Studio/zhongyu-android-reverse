package com.xuexiang.xui.widget.spinner.editspinner;

import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import java.util.List;

/* loaded from: classes.dex */
public class EditSpinnerAdapter<T> extends BaseEditSpinnerAdapter<T> implements EditSpinnerFilter {
    private int mBackgroundSelector;
    private String mFilterColor;
    private boolean mIsFilterKey;
    private int mTextColor;
    private float mTextSize;

    private static class ViewHolder {
        private TextView mTextView;

        private ViewHolder(View view, int i4, float f4, int i5) {
            TextView textView = (TextView) view.findViewById(C2042R.id.tv_tinted_spinner);
            this.mTextView = textView;
            textView.setTextColor(i4);
            this.mTextView.setTextSize(0, f4);
            if (i5 != 0) {
                this.mTextView.setBackgroundResource(i5);
            }
            if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
                this.mTextView.setTextDirection(4);
            }
        }
    }

    public EditSpinnerAdapter(List<T> list) {
        super(list);
        this.mFilterColor = "#F15C58";
        this.mIsFilterKey = false;
    }

    @Override // com.xuexiang.xui.widget.spinner.editspinner.BaseEditSpinnerAdapter
    public EditSpinnerFilter getEditSpinnerFilter() {
        return this;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C2042R.layout.ms_layout_list_item, viewGroup, false);
            viewHolder = new ViewHolder(view, this.mTextColor, this.mTextSize, this.mBackgroundSelector);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.mTextView.setText(Html.fromHtml(getItem(i4)));
        return view;
    }

    @Override // com.xuexiang.xui.widget.spinner.editspinner.EditSpinnerFilter
    public boolean onFilter(String str) {
        this.mDisplayData.clear();
        if (TextUtils.isEmpty(str)) {
            initDisplayData(this.mDataSource);
            int i4 = 0;
            while (true) {
                int[] iArr = this.mIndexs;
                if (i4 >= iArr.length) {
                    break;
                }
                iArr[i4] = i4;
                i4++;
            }
        } else {
            try {
                for (int i5 = 0; i5 < this.mDataSource.size(); i5++) {
                    if (getDataSourceString(i5).replaceAll("\\s+", "|").matches("[^\\s]*" + str + "[^\\s]*")) {
                        this.mIndexs[this.mDisplayData.size()] = i5;
                        if (this.mIsFilterKey) {
                            this.mDisplayData.add(getDataSourceString(i5).replaceFirst(str, "<font color=\"" + this.mFilterColor + "\">" + str + "</font>"));
                        } else {
                            this.mDisplayData.add(getDataSourceString(i5));
                        }
                    }
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        notifyDataSetChanged();
        return this.mDisplayData.size() > 0;
    }

    public EditSpinnerAdapter setBackgroundSelector(int i4) {
        this.mBackgroundSelector = i4;
        return this;
    }

    public EditSpinnerAdapter setFilterColor(String str) {
        this.mFilterColor = str;
        return this;
    }

    public EditSpinnerAdapter setIsFilterKey(boolean z3) {
        this.mIsFilterKey = z3;
        return this;
    }

    public EditSpinnerAdapter setTextColor(int i4) {
        this.mTextColor = i4;
        return this;
    }

    public EditSpinnerAdapter setTextSize(float f4) {
        this.mTextSize = f4;
        return this;
    }

    public EditSpinnerAdapter(T[] tArr) {
        super(tArr);
        this.mFilterColor = "#F15C58";
        this.mIsFilterKey = false;
    }
}

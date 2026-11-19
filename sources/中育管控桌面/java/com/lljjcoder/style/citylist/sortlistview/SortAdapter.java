package com.lljjcoder.style.citylist.sortlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.lljjcoder.style.citypickerview.C5752R;
import java.util.List;

/* loaded from: classes3.dex */
public class SortAdapter extends BaseAdapter implements SectionIndexer {
    private List<SortModel> list;
    private Context mContext;

    public static final class ViewHolder {
        TextView tvLetter;
        TextView tvTitle;
    }

    public SortAdapter(Context context, List<SortModel> list) {
        this.mContext = context;
        this.list = list;
    }

    private String getAlpha(String str) {
        String upperCase = str.trim().substring(0, 1).toUpperCase();
        return upperCase.matches("[A-Z]") ? upperCase : "#";
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i6) {
        return this.list.get(i6);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i6) {
        return i6;
    }

    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int i6) {
        for (int i7 = 0; i7 < getCount(); i7++) {
            if (this.list.get(i7).getSortLetters().toUpperCase().charAt(0) == i6) {
                return i7;
            }
        }
        return -1;
    }

    @Override // android.widget.SectionIndexer
    public int getSectionForPosition(int i6) {
        return this.list.get(i6).getSortLetters().charAt(0);
    }

    @Override // android.widget.SectionIndexer
    public Object[] getSections() {
        return null;
    }

    @Override // android.widget.Adapter
    public View getView(int i6, View view, ViewGroup viewGroup) {
        View viewInflate;
        ViewHolder viewHolder;
        if (view == null) {
            viewHolder = new ViewHolder();
            viewInflate = LayoutInflater.from(this.mContext).inflate(C5752R.layout.sortlistview_item, (ViewGroup) null);
            viewHolder.tvTitle = (TextView) viewInflate.findViewById(C5752R.id.title);
            viewHolder.tvLetter = (TextView) viewInflate.findViewById(C5752R.id.catalog);
            viewInflate.setTag(viewHolder);
        } else {
            viewInflate = view;
            viewHolder = (ViewHolder) view.getTag();
        }
        List<SortModel> list = this.list;
        if (list != null && !list.isEmpty()) {
            SortModel sortModel = this.list.get(i6);
            if (i6 == getPositionForSection(getSectionForPosition(i6))) {
                viewHolder.tvLetter.setVisibility(0);
                viewHolder.tvLetter.setText(sortModel.getSortLetters());
            } else {
                viewHolder.tvLetter.setVisibility(8);
            }
            viewHolder.tvTitle.setText(this.list.get(i6).getName());
        }
        return viewInflate;
    }

    public void updateListView(List<SortModel> list) {
        this.list = list;
        notifyDataSetChanged();
    }
}

package com.xuexiang.xui.widget.searchview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.searchview.AbstractSearchFilter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class SearchAdapter extends BaseAdapter implements Filterable, AbstractSearchFilter.OnFilterResultListener {
    private List<String> mData = new ArrayList();
    private boolean mEllipsize;
    private LayoutInflater mInflater;
    private AbstractSearchFilter mSearchFilter;
    private Drawable mSuggestionIcon;
    private String[] mSuggestions;

    private class SuggestionsViewHolder {
        ImageView imageView;
        TextView textView;

        public SuggestionsViewHolder(View view) {
            this.textView = (TextView) view.findViewById(C2042R.id.suggestion_text);
            if (SearchAdapter.this.mSuggestionIcon != null) {
                ImageView imageView = (ImageView) view.findViewById(C2042R.id.suggestion_icon);
                this.imageView = imageView;
                imageView.setImageDrawable(SearchAdapter.this.mSuggestionIcon);
            }
        }
    }

    public SearchAdapter(Context context, String[] strArr) {
        this.mInflater = LayoutInflater.from(context);
        this.mSuggestions = strArr;
        setSearchFilter(new DefaultSearchFilter());
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.mData.size();
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.mSearchFilter;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.mData.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        SuggestionsViewHolder suggestionsViewHolder;
        if (view == null) {
            view = this.mInflater.inflate(C2042R.layout.xui_layout_search_view_suggest_item, viewGroup, false);
            suggestionsViewHolder = new SuggestionsViewHolder(view);
            view.setTag(suggestionsViewHolder);
        } else {
            suggestionsViewHolder = (SuggestionsViewHolder) view.getTag();
        }
        suggestionsViewHolder.textView.setText((String) getItem(i4));
        if (this.mEllipsize) {
            suggestionsViewHolder.textView.setSingleLine();
            suggestionsViewHolder.textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        return view;
    }

    @Override // com.xuexiang.xui.widget.searchview.AbstractSearchFilter.OnFilterResultListener
    public void publishResults(List<String> list) {
        this.mData = list;
        notifyDataSetChanged();
    }

    public SearchAdapter setSearchFilter(AbstractSearchFilter abstractSearchFilter) {
        this.mSearchFilter = abstractSearchFilter;
        abstractSearchFilter.setSuggestions(this.mSuggestions);
        this.mSearchFilter.setOnFilterResultListener(this);
        return this;
    }

    public SearchAdapter(Context context, String[] strArr, Drawable drawable, boolean z3) {
        this.mInflater = LayoutInflater.from(context);
        this.mSuggestions = strArr;
        this.mSuggestionIcon = drawable;
        this.mEllipsize = z3;
        setSearchFilter(new DefaultSearchFilter());
    }
}

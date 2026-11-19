package com.xuexiang.xui.widget.searchview;

import android.widget.Filter;
import java.util.List;

/* loaded from: classes.dex */
public abstract class AbstractSearchFilter extends Filter {
    private OnFilterResultListener mOnFilterResultListener;
    private String[] mSuggestions;

    public interface OnFilterResultListener {
        void publishResults(List<String> list);
    }

    public String[] getSuggestions() {
        return this.mSuggestions;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        OnFilterResultListener onFilterResultListener;
        Object obj = filterResults.values;
        if (obj == null || (onFilterResultListener = this.mOnFilterResultListener) == null) {
            return;
        }
        onFilterResultListener.publishResults((List) obj);
    }

    public AbstractSearchFilter setOnFilterResultListener(OnFilterResultListener onFilterResultListener) {
        this.mOnFilterResultListener = onFilterResultListener;
        return this;
    }

    public AbstractSearchFilter setSuggestions(String[] strArr) {
        this.mSuggestions = strArr;
        return this;
    }
}

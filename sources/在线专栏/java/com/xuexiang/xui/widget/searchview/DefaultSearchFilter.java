package com.xuexiang.xui.widget.searchview;

import android.text.TextUtils;
import android.widget.Filter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class DefaultSearchFilter extends AbstractSearchFilter {
    protected boolean filter(String str, String str2) {
        return str.toLowerCase().startsWith(str2.toLowerCase());
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (!TextUtils.isEmpty(charSequence)) {
            ArrayList arrayList = new ArrayList();
            for (String str : getSuggestions()) {
                if (filter(str, charSequence.toString())) {
                    arrayList.add(str);
                }
            }
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
        }
        return filterResults;
    }
}

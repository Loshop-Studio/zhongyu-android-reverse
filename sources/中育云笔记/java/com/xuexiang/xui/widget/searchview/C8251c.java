package com.xuexiang.xui.widget.searchview;

import android.text.TextUtils;
import android.widget.Filter;
import java.util.ArrayList;

/* renamed from: com.xuexiang.xui.widget.searchview.c */
/* loaded from: classes5.dex */
public class C8251c extends AbstractC8249a {
    /* renamed from: d */
    public boolean m13221d(String str, String str2) {
        return str.toLowerCase().startsWith(str2.toLowerCase());
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (!TextUtils.isEmpty(charSequence)) {
            ArrayList arrayList = new ArrayList();
            for (String str : m13216a()) {
                if (m13221d(str, charSequence.toString())) {
                    arrayList.add(str);
                }
            }
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
        }
        return filterResults;
    }
}

package com.xuexiang.xui.widget.searchview;

import android.text.TextUtils;
import android.widget.Filter;
import java.util.ArrayList;

/* renamed from: com.xuexiang.xui.widget.searchview.c */
/* loaded from: classes3.dex */
public final class C4212c extends AbstractC4210a {
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (!TextUtils.isEmpty(charSequence)) {
            ArrayList arrayList = new ArrayList();
            for (String str : this.f4853a) {
                if (str.toLowerCase().startsWith(charSequence.toString().toLowerCase())) {
                    arrayList.add(str);
                }
            }
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
        }
        return filterResults;
    }
}

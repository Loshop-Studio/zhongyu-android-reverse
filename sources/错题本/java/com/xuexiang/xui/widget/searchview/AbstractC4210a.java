package com.xuexiang.xui.widget.searchview;

import android.widget.Filter;
import java.util.List;

/* renamed from: com.xuexiang.xui.widget.searchview.a */
/* loaded from: classes3.dex */
public abstract class AbstractC4210a extends Filter {

    /* renamed from: a */
    public String[] f4853a;

    /* renamed from: b */
    public C4222m f4854b;

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        C4222m c4222m;
        Object obj = filterResults.values;
        if (obj == null || (c4222m = this.f4854b) == null) {
            return;
        }
        c4222m.f4866a = (List) obj;
        c4222m.notifyDataSetChanged();
    }
}

package com.xuexiang.xui.widget.searchview;

import android.widget.Filter;
import java.util.List;

/* renamed from: com.xuexiang.xui.widget.searchview.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8249a extends Filter {

    /* renamed from: a */
    public String[] f16931a;

    /* renamed from: b */
    public a f16932b;

    /* renamed from: com.xuexiang.xui.widget.searchview.a$a */
    public interface a {
        /* renamed from: a */
        void mo13219a(List list);
    }

    /* renamed from: a */
    public String[] m13216a() {
        return this.f16931a;
    }

    /* renamed from: b */
    public AbstractC8249a m13217b(a aVar) {
        this.f16932b = aVar;
        return this;
    }

    /* renamed from: c */
    public AbstractC8249a m13218c(String[] strArr) {
        this.f16931a = strArr;
        return this;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar;
        Object obj = filterResults.values;
        if (obj == null || (aVar = this.f16932b) == null) {
            return;
        }
        aVar.mo13219a((List) obj);
    }
}

package com.xuexiang.xui.widget.searchview;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.xuexiang.xui.widget.searchview.g */
/* loaded from: classes3.dex */
public final class C4216g implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C4222m f4862a;

    /* renamed from: b */
    public final /* synthetic */ MaterialSearchView f4863b;

    public C4216g(MaterialSearchView materialSearchView, C4222m c4222m) {
        this.f4863b = materialSearchView;
        this.f4862a = c4222m;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j7) {
        String str = (String) this.f4862a.f4866a.get(i);
        MaterialSearchView materialSearchView = this.f4863b;
        materialSearchView.m3569d(str, materialSearchView.f4845n);
    }
}

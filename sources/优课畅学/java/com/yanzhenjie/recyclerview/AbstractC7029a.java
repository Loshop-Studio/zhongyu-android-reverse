package com.yanzhenjie.recyclerview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;

/* renamed from: com.yanzhenjie.recyclerview.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7029a {

    /* renamed from: a */
    public int f8533a;

    /* renamed from: b */
    public View f8534b;

    /* renamed from: c */
    public a f8535c = new a();

    /* renamed from: com.yanzhenjie.recyclerview.a$a */
    public static final class a {

        /* renamed from: a */
        public int f8536a;

        /* renamed from: b */
        public int f8537b;

        /* renamed from: c */
        public boolean f8538c;
    }

    public AbstractC7029a(int i10, View view) {
        this.f8533a = i10;
        this.f8534b = view;
    }

    /* renamed from: a */
    public abstract void mo7305a(OverScroller overScroller, int i10, int i11);

    /* renamed from: b */
    public abstract void mo7306b(OverScroller overScroller, int i10, int i11);

    /* renamed from: c */
    public boolean m7307c() {
        View view = this.f8534b;
        return (view instanceof ViewGroup) && ((ViewGroup) view).getChildCount() > 0;
    }

    /* renamed from: d */
    public abstract a mo7308d(int i10, int i11);

    /* renamed from: e */
    public int m7309e() {
        return this.f8533a;
    }

    /* renamed from: f */
    public View m7310f() {
        return this.f8534b;
    }

    /* renamed from: g */
    public int m7311g() {
        return this.f8534b.getWidth();
    }

    /* renamed from: h */
    public abstract boolean mo7312h(int i10, float f10);

    /* renamed from: i */
    public boolean m7313i(int i10) {
        return i10 == 0 && (-m7310f().getWidth()) * m7309e() != 0;
    }
}

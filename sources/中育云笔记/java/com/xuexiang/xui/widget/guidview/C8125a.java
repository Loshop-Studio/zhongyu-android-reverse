package com.xuexiang.xui.widget.guidview;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.xuexiang.xui.widget.guidview.a */
/* loaded from: classes5.dex */
public class C8125a {

    /* renamed from: a */
    public final int f16036a;

    /* renamed from: b */
    public final int f16037b;

    /* renamed from: c */
    public FocusShape f16038c;

    /* renamed from: d */
    public int f16039d;

    /* renamed from: e */
    public int f16040e;

    /* renamed from: f */
    public int f16041f;

    /* renamed from: g */
    public int f16042g;

    /* renamed from: h */
    public int f16043h;

    /* renamed from: i */
    public boolean f16044i;

    public C8125a(Activity activity, FocusShape focusShape, View view, double d10, boolean z10, int i10, int i11) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i12 = displayMetrics.widthPixels;
        int i13 = displayMetrics.heightPixels;
        this.f16036a = i12;
        this.f16037b = i13 - (z10 ? 0 : AbstractC8128d.m12695a(activity));
        if (view == null) {
            this.f16044i = false;
            return;
        }
        i10 = i10 == -1 ? z10 ? 0 : AbstractC8128d.m12695a(activity) : i10;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        this.f16039d = view.getWidth();
        int height = view.getHeight();
        this.f16040e = height;
        this.f16038c = focusShape;
        this.f16041f = iArr[0] + (this.f16039d / 2) + i11;
        this.f16042g = (iArr[1] + (height / 2)) - i10;
        this.f16043h = (int) (((int) (Math.hypot(view.getWidth(), view.getHeight()) / 2.0d)) * d10);
        this.f16044i = true;
    }

    /* renamed from: a */
    public float m12682a(int i10, double d10) {
        return (float) (this.f16043h + (i10 * d10));
    }

    /* renamed from: b */
    public int m12683b() {
        return this.f16041f;
    }

    /* renamed from: c */
    public int m12684c() {
        return this.f16042g;
    }

    /* renamed from: d */
    public int m12685d() {
        return this.f16040e;
    }

    /* renamed from: e */
    public FocusShape m12686e() {
        return this.f16038c;
    }

    /* renamed from: f */
    public int m12687f() {
        return this.f16039d;
    }

    /* renamed from: g */
    public boolean m12688g() {
        return this.f16044i;
    }

    /* renamed from: h */
    public float m12689h(int i10, double d10) {
        return (float) (this.f16042g + (this.f16040e / 2) + (i10 * d10));
    }

    /* renamed from: i */
    public float m12690i(int i10, double d10) {
        return (float) ((this.f16041f - (this.f16039d / 2)) - (i10 * d10));
    }

    /* renamed from: j */
    public float m12691j(int i10, double d10) {
        return (float) (this.f16041f + (this.f16039d / 2) + (i10 * d10));
    }

    /* renamed from: k */
    public float m12692k(int i10, double d10) {
        return (float) ((this.f16042g - (this.f16040e / 2)) - (i10 * d10));
    }

    /* renamed from: l */
    public void m12693l(int i10, int i11, int i12) {
        this.f16041f = i10;
        this.f16043h = i12;
        this.f16042g = i11;
        this.f16038c = FocusShape.CIRCLE;
        this.f16044i = true;
    }

    /* renamed from: m */
    public void m12694m(int i10, int i11, int i12, int i13) {
        this.f16041f = i10;
        this.f16042g = i11;
        this.f16039d = i12;
        this.f16040e = i13;
        this.f16038c = FocusShape.ROUNDED_RECTANGLE;
        this.f16044i = true;
    }
}

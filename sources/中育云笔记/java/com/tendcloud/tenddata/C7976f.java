package com.tendcloud.tenddata;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

/* renamed from: com.tendcloud.tenddata.f */
/* loaded from: classes5.dex */
final class C7976f {

    /* renamed from: a */
    private static boolean f14900a;

    /* renamed from: b */
    private static boolean f14901b;

    /* renamed from: c */
    private static boolean f14902c;

    /* renamed from: d */
    private static boolean f14903d;

    /* renamed from: e */
    private static boolean f14904e;

    /* renamed from: f */
    private static boolean f14905f;

    static {
        try {
            int i10 = RecyclerView.HORIZONTAL;
            RecyclerView.class.getDeclaredMethod("getChildAdapterPosition", View.class);
            f14900a = true;
        } catch (Throwable unused) {
            f14900a = false;
        }
        try {
            int i11 = RecyclerView.HORIZONTAL;
            RecyclerView.class.getDeclaredMethod("getChildAdapterPosition", View.class);
            f14901b = true;
        } catch (Throwable unused2) {
            f14901b = false;
        }
        try {
            int i12 = Fragment.f1475c;
            f14902c = true;
        } catch (Throwable unused3) {
            f14902c = false;
        }
        try {
            int i13 = Fragment.f1475c;
            f14903d = true;
        } catch (Throwable unused4) {
            f14903d = false;
        }
        try {
            int i14 = ViewPager.SCROLL_STATE_IDLE;
            f14904e = true;
        } catch (Throwable unused5) {
            f14904e = false;
        }
        try {
            int i15 = ViewPager.SCROLL_STATE_IDLE;
            f14905f = true;
        } catch (Throwable unused6) {
            f14905f = false;
        }
    }

    private C7976f() {
        throw new IllegalStateException("CodelessClassExistUtils can't be instantiated!");
    }

    /* renamed from: a */
    public static boolean m11931a() {
        return f14900a;
    }

    /* renamed from: b */
    public static boolean m11932b() {
        return f14901b;
    }

    /* renamed from: c */
    public static boolean m11933c() {
        return f14902c;
    }

    /* renamed from: d */
    public static boolean m11934d() {
        return f14903d;
    }

    /* renamed from: e */
    public static boolean m11935e() {
        return f14904e;
    }

    /* renamed from: f */
    public static boolean m11936f() {
        return f14905f;
    }
}

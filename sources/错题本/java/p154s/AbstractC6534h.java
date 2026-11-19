package p154s;

import android.graphics.Bitmap;
import coil3.AbstractC3330o;
import coil3.C3298i;
import coil3.C3304j;
import coil3.util.AbstractC3348l;
import java.util.LinkedHashMap;
import p129o2.C6268a;
import p179v.C6653a;

/* renamed from: s.h */
/* loaded from: classes2.dex */
public abstract class AbstractC6534h {

    /* renamed from: a */
    public static final C6268a f10885a;

    /* renamed from: b */
    public static final C6268a f10886b;

    /* renamed from: c */
    public static final C6268a f10887c;

    /* renamed from: d */
    public static final C6268a f10888d;

    /* renamed from: e */
    public static final C6268a f10889e;

    /* renamed from: f */
    public static final C6268a f10890f;

    /* renamed from: g */
    public static final C6268a f10891g;

    static {
        int i = 6;
        f10885a = new C6268a(C6653a.f11224a, i);
        f10886b = new C6268a(AbstractC3348l.f2084b, i);
        Object obj = null;
        f10887c = new C6268a(obj, 6);
        Boolean bool = Boolean.TRUE;
        int i8 = 6;
        f10888d = new C6268a(bool, i8);
        f10889e = new C6268a(obj, i8);
        int i9 = 6;
        f10890f = new C6268a(bool, i9);
        f10891g = new C6268a(Boolean.FALSE, i9);
    }

    /* renamed from: a */
    public static final void m6185a(C6529c c6529c) {
        C3298i c3298i;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Object obj = c6529c.f10834q;
        if (obj instanceof C3298i) {
            c3298i = (C3298i) obj;
        } else {
            if (!(obj instanceof C3304j)) {
                throw new AssertionError();
            }
            C3304j c3304j = (C3304j) obj;
            c3304j.getClass();
            C3298i c3298i2 = new C3298i(c3304j);
            c6529c.f10834q = c3298i2;
            c3298i = c3298i2;
        }
        LinkedHashMap linkedHashMap = c3298i.f1979a;
        C6268a c6268a = f10886b;
        if (config != null) {
            linkedHashMap.put(c6268a, config);
        } else {
            linkedHashMap.remove(c6268a);
        }
    }

    /* renamed from: b */
    public static final Bitmap.Config m6186b(C6538l c6538l) {
        return (Bitmap.Config) AbstractC3330o.m2268f(c6538l, f10886b);
    }
}

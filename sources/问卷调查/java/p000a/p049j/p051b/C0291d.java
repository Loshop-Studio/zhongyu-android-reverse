package p000a.p049j.p051b;

import android.graphics.Rect;
import java.util.Comparator;
import p000a.p049j.p051b.AbstractC0288a;

/* renamed from: a.j.b.d */
/* loaded from: classes.dex */
public class C0291d<T> implements Comparator<T> {

    /* renamed from: a */
    public final Rect f1733a = new Rect();

    /* renamed from: b */
    public final Rect f1734b = new Rect();

    /* renamed from: c */
    public final boolean f1735c;

    /* renamed from: d */
    public final InterfaceC0289b<T> f1736d;

    public C0291d(boolean z, InterfaceC0289b<T> interfaceC0289b) {
        this.f1735c = z;
        this.f1736d = interfaceC0289b;
    }

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        Rect rect = this.f1733a;
        Rect rect2 = this.f1734b;
        ((AbstractC0288a.a) this.f1736d).m941a(t, rect);
        ((AbstractC0288a.a) this.f1736d).m941a(t2, rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        if (i3 < i4) {
            return this.f1735c ? 1 : -1;
        }
        if (i3 > i4) {
            return this.f1735c ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return this.f1735c ? 1 : -1;
        }
        if (i7 > i8) {
            return this.f1735c ? -1 : 1;
        }
        return 0;
    }
}

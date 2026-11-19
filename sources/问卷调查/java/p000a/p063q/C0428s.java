package p000a.p063q;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;

/* renamed from: a.q.s */
/* loaded from: classes.dex */
public class C0428s {

    /* renamed from: a */
    public static final C0434y f2464a;

    /* renamed from: b */
    public static final Property<View, Float> f2465b;

    /* renamed from: a.q.s$a */
    public static class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(C0428s.m1477a(view));
        }

        @Override // android.util.Property
        public void set(View view, Float f2) {
            float fFloatValue = f2.floatValue();
            C0428s.f2464a.mo1482e(view, fFloatValue);
        }
    }

    /* renamed from: a.q.s$b */
    public static class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Rect get(View view) {
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            return view.getClipBounds();
        }

        @Override // android.util.Property
        public void set(View view, Rect rect) {
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            view.setClipBounds(rect);
        }
    }

    static {
        f2464a = Build.VERSION.SDK_INT >= 29 ? new C0433x() : new C0432w();
        f2465b = new a(Float.class, "translationAlpha");
        new b(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    public static float m1477a(View view) {
        return f2464a.mo1480b(view);
    }

    /* renamed from: b */
    public static void m1478b(View view, int i, int i2, int i3, int i4) {
        f2464a.mo1485d(view, i, i2, i3, i4);
    }
}

package p070b.p074b.p075a.p076a.p081d;

import android.view.View;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;

/* renamed from: b.b.a.a.d.h */
/* loaded from: classes.dex */
public class C0587h {

    /* renamed from: a */
    public final View f3581a;

    /* renamed from: b */
    public int f3582b;

    /* renamed from: c */
    public int f3583c;

    /* renamed from: d */
    public int f3584d;

    /* renamed from: e */
    public int f3585e;

    public C0587h(View view) {
        this.f3581a = view;
    }

    /* renamed from: a */
    public void m2117a() {
        View view = this.f3581a;
        int top = this.f3584d - (view.getTop() - this.f3582b);
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        view.offsetTopAndBottom(top);
        View view2 = this.f3581a;
        view2.offsetLeftAndRight(this.f3585e - (view2.getLeft() - this.f3583c));
    }
}

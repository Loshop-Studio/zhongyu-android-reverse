package p000a.p052k.p053b;

import android.graphics.Rect;
import android.view.View;

/* renamed from: a.k.b.i */
/* loaded from: classes.dex */
public class RunnableC0312i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AbstractC0337u0 f1885b;

    /* renamed from: c */
    public final /* synthetic */ View f1886c;

    /* renamed from: d */
    public final /* synthetic */ Rect f1887d;

    public RunnableC0312i(C0300c c0300c, AbstractC0337u0 abstractC0337u0, View view, Rect rect) {
        this.f1885b = abstractC0337u0;
        this.f1886c = view;
        this.f1887d = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1885b.m1239j(this.f1886c, this.f1887d);
    }
}

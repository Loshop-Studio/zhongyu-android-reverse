package p160u0;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p016b1.AbstractC4409k;
import p118o0.C7509t;

/* renamed from: u0.h */
/* loaded from: classes3.dex */
public final class C7755h implements InterfaceC7756i {

    /* renamed from: a */
    public final Set f10245a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public volatile boolean f10246b;

    /* renamed from: u0.h$a */
    public class a implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a */
        public final /* synthetic */ View f10247a;

        /* renamed from: u0.h$a$a, reason: collision with other inner class name */
        public class RunnableC8040a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ ViewTreeObserver.OnDrawListener f10249a;

            public RunnableC8040a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f10249a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                C7509t.m8633b().m8640h();
                C7755h.this.f10246b = true;
                C7755h.m9264b(a.this.f10247a, this.f10249a);
                C7755h.this.f10245a.clear();
            }
        }

        public a(View view) {
            this.f10247a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AbstractC4409k.m1460u(new RunnableC8040a(this));
        }
    }

    /* renamed from: b */
    public static void m9264b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // p160u0.InterfaceC7756i
    /* renamed from: a */
    public void mo9262a(Activity activity) {
        if (!this.f10246b && this.f10245a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}

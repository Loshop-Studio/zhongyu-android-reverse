package p381w0;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p109d1.AbstractC8910k;
import p298q0.C10710s;

/* renamed from: w0.h */
/* loaded from: classes3.dex */
public final class C11648h implements InterfaceC11649i {

    /* renamed from: a */
    public final Set f27647a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public volatile boolean f27648b;

    /* renamed from: w0.h$a */
    public class a implements ViewTreeObserver.OnDrawListener {

        /* renamed from: c */
        public final /* synthetic */ View f27649c;

        /* renamed from: w0.h$a$a, reason: collision with other inner class name */
        public class RunnableC12153a implements Runnable {

            /* renamed from: c */
            public final /* synthetic */ ViewTreeObserver.OnDrawListener f27651c;

            public RunnableC12153a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f27651c = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                C10710s.m22673b().m22680h();
                C11648h.this.f27648b = true;
                C11648h.m25765b(a.this.f27649c, this.f27651c);
                C11648h.this.f27647a.clear();
            }
        }

        public a(View view) {
            this.f27649c = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AbstractC8910k.m17491v(new RunnableC12153a(this));
        }
    }

    /* renamed from: b */
    public static void m25765b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // p381w0.InterfaceC11649i
    /* renamed from: a */
    public void mo25763a(Activity activity) {
        if (!this.f27648b && this.f27647a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}

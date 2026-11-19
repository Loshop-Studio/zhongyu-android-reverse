package p020b1;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p117i1.AbstractC7652k;
import p261v0.C9647t;

/* renamed from: b1.h */
/* loaded from: classes3.dex */
public final class C4949h implements InterfaceC4950i {

    /* renamed from: a */
    public final Set f2355a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public volatile boolean f2356b;

    /* renamed from: b1.h$a */
    public class a implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a */
        public final /* synthetic */ View f2357a;

        /* renamed from: b1.h$a$a, reason: collision with other inner class name */
        public class RunnableC10128a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ ViewTreeObserver.OnDrawListener f2359a;

            public RunnableC10128a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f2359a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                C9647t.m16016b().m16023h();
                C4949h.this.f2356b = true;
                C4949h.m2336b(a.this.f2357a, this.f2359a);
                C4949h.this.f2355a.clear();
            }
        }

        public a(View view) {
            this.f2357a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AbstractC7652k.m12705u(new RunnableC10128a(this));
        }
    }

    /* renamed from: b */
    public static void m2336b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // p020b1.InterfaceC4950i
    /* renamed from: a */
    public void mo2334a(Activity activity) {
        if (!this.f2356b && this.f2355a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}

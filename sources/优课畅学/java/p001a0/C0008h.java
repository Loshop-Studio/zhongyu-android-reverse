package p001a0;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p116h0.AbstractC8707k;
import p259u.C10159w;

/* renamed from: a0.h */
/* loaded from: classes3.dex */
public final class C0008h implements InterfaceC0009i {

    /* renamed from: a */
    public final Set f17a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public volatile boolean f18b;

    /* renamed from: a0.h$a */
    public class a implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a */
        public final /* synthetic */ View f19a;

        /* renamed from: a0.h$a$a, reason: collision with other inner class name */
        public class RunnableC10749a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ ViewTreeObserver.OnDrawListener f21a;

            public RunnableC10749a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f21a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                C10159w.m19013b().m19020h();
                C0008h.this.f18b = true;
                C0008h.m8b(a.this.f19a, this.f21a);
                C0008h.this.f17a.clear();
            }
        }

        public a(View view) {
            this.f19a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AbstractC8707k.m14204v(new RunnableC10749a(this));
        }
    }

    /* renamed from: b */
    public static void m8b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // p001a0.InterfaceC0009i
    /* renamed from: a */
    public void mo6a(Activity activity) {
        if (!this.f18b && this.f17a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}

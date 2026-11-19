package p000a.p031h.p033c.p034b;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: a.h.c.b.h */
/* loaded from: classes.dex */
public final class C0200h {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f1443a = new ThreadLocal<>();

    /* renamed from: b */
    public static final WeakHashMap<Object, SparseArray<Object>> f1444b = new WeakHashMap<>(0);

    /* renamed from: c */
    public static final Object f1445c = new Object();

    /* renamed from: a.h.c.b.h$a */
    public static abstract class a {

        /* renamed from: a.h.c.b.h$a$a, reason: collision with other inner class name */
        public class RunnableC1089a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Typeface f1446b;

            public RunnableC1089a(Typeface typeface) {
                this.f1446b = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.mo412e(this.f1446b);
            }
        }

        /* renamed from: a.h.c.b.h$a$b */
        public class b implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ int f1448b;

            public b(int i) {
                this.f1448b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.mo411d(this.f1448b);
            }
        }

        /* renamed from: c */
        public static Handler m752c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: a */
        public final void m753a(int i, Handler handler) {
            m752c(handler).post(new b(i));
        }

        /* renamed from: b */
        public final void m754b(Typeface typeface, Handler handler) {
            m752c(handler).post(new RunnableC1089a(typeface));
        }

        /* renamed from: d */
        public abstract void mo411d(int i);

        /* renamed from: e */
        public abstract void mo412e(Typeface typeface);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad A[ADDED_TO_REGION] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface m751a(android.content.Context r16, int r17, android.util.TypedValue r18, int r19, p000a.p031h.p033c.p034b.C0200h.a r20, android.os.Handler r21, boolean r22, boolean r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p031h.p033c.p034b.C0200h.m751a(android.content.Context, int, android.util.TypedValue, int, a.h.c.b.h$a, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}

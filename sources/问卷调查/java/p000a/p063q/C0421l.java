package p000a.p063q;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p021e.C0129a;

/* renamed from: a.q.l */
/* loaded from: classes.dex */
public class C0421l {

    /* renamed from: a */
    public static AbstractC0417h f2439a = new C0407a();

    /* renamed from: b */
    public static ThreadLocal<WeakReference<C0129a<ViewGroup, ArrayList<AbstractC0417h>>>> f2440b = new ThreadLocal<>();

    /* renamed from: c */
    public static ArrayList<ViewGroup> f2441c = new ArrayList<>();

    /* renamed from: a.q.l$a */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b */
        public AbstractC0417h f2442b;

        /* renamed from: c */
        public ViewGroup f2443c;

        /* renamed from: a.q.l$a$a, reason: collision with other inner class name */
        public class C1090a extends C0420k {

            /* renamed from: a */
            public final /* synthetic */ C0129a f2444a;

            public C1090a(C0129a c0129a) {
                this.f2444a = c0129a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p000a.p063q.AbstractC0417h.d
            /* renamed from: c */
            public void mo1434c(AbstractC0417h abstractC0417h) {
                ((ArrayList) this.f2444a.get(a.this.f2443c)).remove(abstractC0417h);
                abstractC0417h.mo1467v(this);
            }
        }

        public a(AbstractC0417h abstractC0417h, ViewGroup viewGroup) {
            this.f2442b = abstractC0417h;
            this.f2443c = viewGroup;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:103:0x021a  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0247  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x01f4 A[EDGE_INSN: B:139:0x01f4->B:93:0x01f4 BREAK  A[LOOP:1: B:19:0x009a->B:92:0x01ea], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01f9  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onPreDraw() {
            /*
                Method dump skipped, instructions count: 697
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p000a.p063q.C0421l.a.onPreDraw():boolean");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f2443c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f2443c.removeOnAttachStateChangeListener(this);
            C0421l.f2441c.remove(this.f2443c);
            ArrayList<AbstractC0417h> arrayList = C0421l.m1472a().get(this.f2443c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractC0417h> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo1469x(this.f2443c);
                }
            }
            this.f2442b.m1459i(true);
        }
    }

    /* renamed from: a */
    public static C0129a<ViewGroup, ArrayList<AbstractC0417h>> m1472a() {
        C0129a<ViewGroup, ArrayList<AbstractC0417h>> c0129a;
        WeakReference<C0129a<ViewGroup, ArrayList<AbstractC0417h>>> weakReference = f2440b.get();
        if (weakReference != null && (c0129a = weakReference.get()) != null) {
            return c0129a;
        }
        C0129a<ViewGroup, ArrayList<AbstractC0417h>> c0129a2 = new C0129a<>();
        f2440b.set(new WeakReference<>(c0129a2));
        return c0129a2;
    }
}

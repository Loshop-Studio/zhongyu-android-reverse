package p090g1;

import androidx.lifecycle.C0509q;
import androidx.lifecycle.InterfaceC0512t;
import androidx.lifecycle.LiveData;
import p095h1.InterfaceC2654a;
import p103j.InterfaceC2685a;

/* renamed from: g1.d */
/* loaded from: classes.dex */
public class C2632d {

    /* JADX INFO: Add missing generic type declarations: [In] */
    /* renamed from: g1.d$a */
    class a<In> implements InterfaceC0512t<In> {

        /* renamed from: a */
        Out f10410a = null;

        /* renamed from: b */
        final /* synthetic */ InterfaceC2654a f10411b;

        /* renamed from: c */
        final /* synthetic */ Object f10412c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC2685a f10413d;

        /* renamed from: e */
        final /* synthetic */ C0509q f10414e;

        /* renamed from: g1.d$a$a, reason: collision with other inner class name */
        class RunnableC3537a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Object f10415a;

            RunnableC3537a(Object obj) {
                this.f10415a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [Out, java.lang.Object] */
            @Override // java.lang.Runnable
            public void run() {
                synchronized (a.this.f10412c) {
                    ?? Apply = a.this.f10413d.apply(this.f10415a);
                    a aVar = a.this;
                    Out out = aVar.f10410a;
                    if (out == 0 && Apply != 0) {
                        aVar.f10410a = Apply;
                        aVar.f10414e.postValue(Apply);
                    } else if (out != 0 && !out.equals(Apply)) {
                        a aVar2 = a.this;
                        aVar2.f10410a = Apply;
                        aVar2.f10414e.postValue(Apply);
                    }
                }
            }
        }

        a(InterfaceC2654a interfaceC2654a, Object obj, InterfaceC2685a interfaceC2685a, C0509q c0509q) {
            this.f10411b = interfaceC2654a;
            this.f10412c = obj;
            this.f10413d = interfaceC2685a;
            this.f10414e = c0509q;
        }

        @Override // androidx.lifecycle.InterfaceC0512t
        /* renamed from: a */
        public void mo2584a(In in) {
            this.f10411b.mo8914b(new RunnableC3537a(in));
        }
    }

    /* renamed from: a */
    public static <In, Out> LiveData<Out> m8833a(LiveData<In> liveData, InterfaceC2685a<In, Out> interfaceC2685a, InterfaceC2654a interfaceC2654a) {
        Object obj = new Object();
        C0509q c0509q = new C0509q();
        c0509q.m2902a(liveData, new a(interfaceC2654a, obj, interfaceC2685a, c0509q));
        return c0509q;
    }
}

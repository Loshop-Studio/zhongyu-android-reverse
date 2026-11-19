package p016b0;

import android.support.v4.media.C0039h;
import com.bumptech.glide.C3409c;
import com.bumptech.glide.C3410d;
import com.bumptech.glide.Priority;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C5834o;
import p055f0.C5510o;
import p055f0.InterfaceC5511p;
import p069h0.C5618a;
import p120n0.C6208b;
import p120n0.C6209c;
import p120n0.InterfaceC6207a;
import p141q0.C6407b;
import p141q0.C6408c;
import p180v0.C6662i;
import p202y.C6763f;
import p202y.InterfaceC6760c;
import p202y.InterfaceC6766i;

/* renamed from: b0.j */
/* loaded from: classes2.dex */
public final class C3077j {

    /* renamed from: a */
    public final ArrayList f1442a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f1443b = new ArrayList();

    /* renamed from: c */
    public C3409c f1444c;

    /* renamed from: d */
    public Object f1445d;

    /* renamed from: e */
    public int f1446e;

    /* renamed from: f */
    public int f1447f;

    /* renamed from: g */
    public Class f1448g;

    /* renamed from: h */
    public C3090t f1449h;

    /* renamed from: i */
    public C6763f f1450i;

    /* renamed from: j */
    public Map f1451j;

    /* renamed from: k */
    public Class f1452k;

    /* renamed from: l */
    public boolean f1453l;

    /* renamed from: m */
    public boolean f1454m;

    /* renamed from: n */
    public InterfaceC6760c f1455n;

    /* renamed from: o */
    public Priority f1456o;

    /* renamed from: p */
    public AbstractC3085o f1457p;

    /* renamed from: q */
    public boolean f1458q;

    /* renamed from: r */
    public boolean f1459r;

    /* renamed from: a */
    public final ArrayList m2025a() {
        boolean z8 = this.f1454m;
        ArrayList arrayList = this.f1443b;
        if (!z8) {
            this.f1454m = true;
            arrayList.clear();
            ArrayList arrayListM2026b = m2026b();
            int size = arrayListM2026b.size();
            for (int i = 0; i < size; i++) {
                C5510o c5510o = (C5510o) arrayListM2026b.get(i);
                InterfaceC6760c interfaceC6760c = c5510o.f8529a;
                List list = c5510o.f8530b;
                if (!arrayList.contains(interfaceC6760c)) {
                    arrayList.add(c5510o.f8529a);
                }
                for (int i8 = 0; i8 < list.size(); i8++) {
                    if (!arrayList.contains(list.get(i8))) {
                        arrayList.add(list.get(i8));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final ArrayList m2026b() {
        boolean z8 = this.f1453l;
        ArrayList arrayList = this.f1442a;
        if (!z8) {
            this.f1453l = true;
            arrayList.clear();
            List listM2370f = this.f1444c.f2209b.m2370f(this.f1445d);
            int size = listM2370f.size();
            for (int i = 0; i < size; i++) {
                C5510o c5510oMo4874b = ((InterfaceC5511p) listM2370f.get(i)).mo4874b(this.f1445d, this.f1446e, this.f1447f, this.f1450i);
                if (c5510oMo4874b != null) {
                    arrayList.add(c5510oMo4874b);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final C3068e0 m2027c(Class cls) {
        C3068e0 c3068e0;
        Class cls2;
        Class cls3;
        Class cls4;
        C3068e0 c3068e02;
        ArrayList arrayList;
        ArrayList arrayList2;
        InterfaceC6207a interfaceC6207a;
        Class cls5 = cls;
        C3410d c3410d = this.f1444c.f2209b;
        Class cls6 = this.f1448g;
        Class cls7 = this.f1452k;
        C6407b c6407b = c3410d.f2225i;
        C6662i c6662i = (C6662i) c6407b.f10518b.getAndSet(null);
        if (c6662i == null) {
            c6662i = new C6662i();
        }
        c6662i.f11239a = cls5;
        c6662i.f11240b = cls6;
        c6662i.f11241c = cls7;
        synchronized (c6407b.f10517a) {
            c3068e0 = (C3068e0) c6407b.f10517a.get(c6662i);
        }
        c6407b.f10518b.set(c6662i);
        c3410d.f2225i.getClass();
        if (C6407b.f10516c.equals(c3068e0)) {
            return null;
        }
        if (c3068e0 != null) {
            return c3068e0;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayListM130y = c3410d.f2219c.m130y(cls5, cls6);
        int size = arrayListM130y.size();
        int i = 0;
        while (i < size) {
            int i8 = i + 1;
            Class<?> cls8 = (Class) arrayListM130y.get(i);
            ArrayList arrayListM5350h = c3410d.f2222f.m5350h(cls8, cls7);
            int size2 = arrayListM5350h.size();
            int i9 = 0;
            while (i9 < size2) {
                int i10 = i9 + 1;
                Class cls9 = (Class) arrayListM5350h.get(i9);
                C0039h c0039h = c3410d.f2219c;
                synchronized (c0039h) {
                    arrayList = new ArrayList();
                    ArrayList arrayList4 = (ArrayList) c0039h.f96b;
                    int size3 = arrayList4.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        Object obj = arrayList4.get(i11);
                        int i12 = i11 + 1;
                        String str = (String) obj;
                        ArrayList arrayList5 = arrayListM5350h;
                        List list = (List) ((HashMap) c0039h.f97c).get(str);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                C6408c c6408c = (C6408c) it.next();
                                Iterator it2 = it;
                                if (c6408c.f10519a.isAssignableFrom(cls5) && cls8.isAssignableFrom(c6408c.f10520b)) {
                                    arrayList.add(c6408c.f10521c);
                                }
                                it = it2;
                            }
                        }
                        arrayListM5350h = arrayList5;
                        i11 = i12;
                    }
                    arrayList2 = arrayListM5350h;
                }
                C5834o c5834o = c3410d.f2222f;
                synchronized (c5834o) {
                    if (!cls9.isAssignableFrom(cls8)) {
                        ArrayList arrayList6 = c5834o.f9224a;
                        int size4 = arrayList6.size();
                        int i13 = 0;
                        while (i13 < size4) {
                            Object obj2 = arrayList6.get(i13);
                            i13++;
                            C6208b c6208b = (C6208b) obj2;
                            ArrayList arrayList7 = arrayList6;
                            if (c6208b.f9925a.isAssignableFrom(cls8) && cls9.isAssignableFrom(c6208b.f9926b)) {
                                interfaceC6207a = c6208b.f9927c;
                            } else {
                                cls5 = cls;
                                arrayList6 = arrayList7;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                    }
                    interfaceC6207a = C6209c.f9928b;
                }
                arrayList3.add(new C3081l(cls5, cls8, cls9, arrayList, interfaceC6207a, c3410d.f2226j));
                cls5 = cls;
                size2 = size2;
                i9 = i10;
                arrayListM5350h = arrayList2;
            }
            cls5 = cls;
            i = i8;
        }
        if (arrayList3.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c3068e02 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c3068e02 = new C3068e0(cls2, cls3, cls4, arrayList3, c3410d.f2226j);
        }
        C6407b c6407b2 = c3410d.f2225i;
        synchronized (c6407b2.f10517a) {
            c6407b2.f10517a.put(new C6662i(cls2, cls3, cls4), c3068e02 != null ? c3068e02 : C6407b.f10516c);
        }
        return c3068e02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        r1 = r5.f10515b;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p202y.InterfaceC6758a m2028d(java.lang.Object r8) {
        /*
            r7 = this;
            com.bumptech.glide.c r0 = r7.f1444c
            com.bumptech.glide.d r0 = r0.f2209b
            kotlin.jvm.internal.o r0 = r0.f2218b
            java.lang.Class r1 = r8.getClass()
            monitor-enter(r0)
            java.util.ArrayList r2 = r0.f9224a     // Catch: java.lang.Throwable -> L28
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L28
            r4 = 0
        L12:
            if (r4 >= r3) goto L2a
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Throwable -> L28
            int r4 = r4 + 1
            q0.a r5 = (p141q0.C6406a) r5     // Catch: java.lang.Throwable -> L28
            java.lang.Class r6 = r5.f10514a     // Catch: java.lang.Throwable -> L28
            boolean r6 = r6.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L28
            if (r6 == 0) goto L12
            y.a r1 = r5.f10515b     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)
            goto L2c
        L28:
            r8 = move-exception
            goto L39
        L2a:
            monitor-exit(r0)
            r1 = 0
        L2c:
            if (r1 == 0) goto L2f
            return r1
        L2f:
            com.bumptech.glide.Registry$NoSourceEncoderAvailableException r0 = new com.bumptech.glide.Registry$NoSourceEncoderAvailableException
            java.lang.Class r8 = r8.getClass()
            r0.<init>(r8)
            throw r0
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p016b0.C3077j.m2028d(java.lang.Object):y.a");
    }

    /* renamed from: e */
    public final InterfaceC6766i m2029e(Class cls) {
        InterfaceC6766i interfaceC6766i = (InterfaceC6766i) this.f1451j.get(cls);
        if (interfaceC6766i == null) {
            Iterator it = this.f1451j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC6766i = (InterfaceC6766i) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC6766i != null) {
            return interfaceC6766i;
        }
        if (!this.f1451j.isEmpty() || !this.f1458q) {
            return C5618a.f8750b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}

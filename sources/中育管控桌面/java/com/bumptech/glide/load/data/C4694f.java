package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.InterfaceC4693e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p016b1.AbstractC4408j;

/* renamed from: com.bumptech.glide.load.data.f */
/* loaded from: classes3.dex */
public class C4694f {

    /* renamed from: b */
    public static final InterfaceC4693e.a f2293b = new a();

    /* renamed from: a */
    public final Map f2294a = new HashMap();

    /* renamed from: com.bumptech.glide.load.data.f$a */
    public class a implements InterfaceC4693e.a {
        @Override // com.bumptech.glide.load.data.InterfaceC4693e.a
        /* renamed from: a */
        public Class mo2577a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4693e.a
        /* renamed from: b */
        public InterfaceC4693e mo2578b(Object obj) {
            return new b(obj);
        }
    }

    /* renamed from: com.bumptech.glide.load.data.f$b */
    public static final class b implements InterfaceC4693e {

        /* renamed from: a */
        public final Object f2295a;

        public b(Object obj) {
            this.f2295a = obj;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4693e
        /* renamed from: a */
        public Object mo2574a() {
            return this.f2295a;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4693e
        /* renamed from: b */
        public void mo2575b() {
        }
    }

    /* renamed from: a */
    public synchronized InterfaceC4693e m2595a(Object obj) {
        InterfaceC4693e.a aVar;
        try {
            AbstractC4408j.m1438d(obj);
            aVar = (InterfaceC4693e.a) this.f2294a.get(obj.getClass());
            if (aVar == null) {
                Iterator it = this.f2294a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InterfaceC4693e.a aVar2 = (InterfaceC4693e.a) it.next();
                    if (aVar2.mo2577a().isAssignableFrom(obj.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f2293b;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar.mo2578b(obj);
    }

    /* renamed from: b */
    public synchronized void m2596b(InterfaceC4693e.a aVar) {
        this.f2294a.put(aVar.mo2577a(), aVar);
    }
}

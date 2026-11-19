package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.InterfaceC5406e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p116h0.AbstractC8706j;

/* renamed from: com.bumptech.glide.load.data.f */
/* loaded from: classes3.dex */
public class C5407f {

    /* renamed from: b */
    public static final InterfaceC5406e.a f2935b = new a();

    /* renamed from: a */
    public final Map f2936a = new HashMap();

    /* renamed from: com.bumptech.glide.load.data.f$a */
    public class a implements InterfaceC5406e.a {
        @Override // com.bumptech.glide.load.data.InterfaceC5406e.a
        /* renamed from: a */
        public Class mo2843a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5406e.a
        /* renamed from: b */
        public InterfaceC5406e mo2844b(Object obj) {
            return new b(obj);
        }
    }

    /* renamed from: com.bumptech.glide.load.data.f$b */
    public static final class b implements InterfaceC5406e {

        /* renamed from: a */
        public final Object f2937a;

        public b(Object obj) {
            this.f2937a = obj;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5406e
        /* renamed from: a */
        public Object mo2840a() {
            return this.f2937a;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5406e
        /* renamed from: b */
        public void mo2841b() {
        }
    }

    /* renamed from: a */
    public synchronized InterfaceC5406e m2860a(Object obj) {
        InterfaceC5406e.a aVar;
        try {
            AbstractC8706j.m14181d(obj);
            aVar = (InterfaceC5406e.a) this.f2936a.get(obj.getClass());
            if (aVar == null) {
                Iterator it = this.f2936a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InterfaceC5406e.a aVar2 = (InterfaceC5406e.a) it.next();
                    if (aVar2.mo2843a().isAssignableFrom(obj.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f2935b;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar.mo2844b(obj);
    }

    /* renamed from: b */
    public synchronized void m2861b(InterfaceC5406e.a aVar) {
        this.f2936a.put(aVar.mo2843a(), aVar);
    }
}

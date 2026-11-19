package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.InterfaceC5825e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p109d1.AbstractC8909j;

/* renamed from: com.bumptech.glide.load.data.f */
/* loaded from: classes3.dex */
public class C5826f {

    /* renamed from: b */
    public static final InterfaceC5825e.a f4705b = new a();

    /* renamed from: a */
    public final Map f4706a = new HashMap();

    /* renamed from: com.bumptech.glide.load.data.f$a */
    public class a implements InterfaceC5825e.a {
        @Override // com.bumptech.glide.load.data.InterfaceC5825e.a
        /* renamed from: a */
        public Class mo4048a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5825e.a
        /* renamed from: b */
        public InterfaceC5825e mo4049b(Object obj) {
            return new b(obj);
        }
    }

    /* renamed from: com.bumptech.glide.load.data.f$b */
    public static final class b implements InterfaceC5825e {

        /* renamed from: a */
        public final Object f4707a;

        public b(Object obj) {
            this.f4707a = obj;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5825e
        /* renamed from: a */
        public Object mo4046a() {
            return this.f4707a;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5825e
        public void cleanup() {
        }
    }

    /* renamed from: a */
    public synchronized InterfaceC5825e m4064a(Object obj) {
        InterfaceC5825e.a aVar;
        try {
            AbstractC8909j.m17468d(obj);
            aVar = (InterfaceC5825e.a) this.f4706a.get(obj.getClass());
            if (aVar == null) {
                Iterator it = this.f4706a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InterfaceC5825e.a aVar2 = (InterfaceC5825e.a) it.next();
                    if (aVar2.mo4048a().isAssignableFrom(obj.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f4705b;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar.mo4049b(obj);
    }

    /* renamed from: b */
    public synchronized void m4065b(InterfaceC5825e.a aVar) {
        this.f4706a.put(aVar.mo4048a(), aVar);
    }
}

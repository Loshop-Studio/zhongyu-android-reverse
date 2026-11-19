package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.InterfaceC5357e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p117i1.AbstractC7651j;

/* renamed from: com.bumptech.glide.load.data.f */
/* loaded from: classes3.dex */
public class C5358f {

    /* renamed from: b */
    public static final InterfaceC5357e.a f3502b = new a();

    /* renamed from: a */
    public final Map f3503a = new HashMap();

    /* renamed from: com.bumptech.glide.load.data.f$a */
    public class a implements InterfaceC5357e.a {
        @Override // com.bumptech.glide.load.data.InterfaceC5357e.a
        /* renamed from: a */
        public Class mo3396a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5357e.a
        /* renamed from: b */
        public InterfaceC5357e mo3397b(Object obj) {
            return new b(obj);
        }
    }

    /* renamed from: com.bumptech.glide.load.data.f$b */
    public static final class b implements InterfaceC5357e {

        /* renamed from: a */
        public final Object f3504a;

        public b(Object obj) {
            this.f3504a = obj;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5357e
        /* renamed from: a */
        public Object mo3393a() {
            return this.f3504a;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5357e
        /* renamed from: b */
        public void mo3394b() {
        }
    }

    /* renamed from: a */
    public synchronized InterfaceC5357e m3414a(Object obj) {
        InterfaceC5357e.a aVar;
        try {
            AbstractC7651j.m12683d(obj);
            aVar = (InterfaceC5357e.a) this.f3503a.get(obj.getClass());
            if (aVar == null) {
                Iterator it = this.f3503a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InterfaceC5357e.a aVar2 = (InterfaceC5357e.a) it.next();
                    if (aVar2.mo3396a().isAssignableFrom(obj.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f3502b;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar.mo3397b(obj);
    }

    /* renamed from: b */
    public synchronized void m3415b(InterfaceC5357e.a aVar) {
        this.f3503a.put(aVar.mo3396a(), aVar);
    }
}

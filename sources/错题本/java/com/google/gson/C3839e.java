package com.google.gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: com.google.gson.e */
/* loaded from: classes2.dex */
public final class C3839e extends AbstractC3869p {

    /* renamed from: a */
    public final /* synthetic */ int f2978a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC3869p f2979b;

    public /* synthetic */ C3839e(AbstractC3869p abstractC3869p, int i) {
        this.f2978a = i;
        this.f2979b = abstractC3869p;
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) throws IOException {
        switch (this.f2978a) {
            case 0:
                return new AtomicLong(((Number) this.f2979b.mo2779b(c6046a)).longValue());
            default:
                ArrayList arrayList = new ArrayList();
                c6046a.m5743a();
                while (c6046a.m5751k()) {
                    arrayList.add(Long.valueOf(((Number) this.f2979b.mo2779b(c6046a)).longValue()));
                }
                c6046a.m5747e();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
        }
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException {
        switch (this.f2978a) {
            case 0:
                this.f2979b.mo2780c(c6047b, Long.valueOf(((AtomicLong) obj).get()));
                break;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                c6047b.m5768b();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    this.f2979b.mo2780c(c6047b, Long.valueOf(atomicLongArray.get(i)));
                }
                c6047b.m5771e();
                break;
        }
    }
}

package com.efs.sdk.base.p035a.p046h.p047a;

import com.efs.sdk.base.p035a.p046h.C1329d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.efs.sdk.base.a.h.a.e */
/* loaded from: classes.dex */
public class RunnableC1320e<T> implements Runnable {

    /* renamed from: a */
    private List<InterfaceC1317b<T>> f7107a = new ArrayList(5);

    /* renamed from: b */
    private InterfaceC1318c<T> f7108b;

    public RunnableC1320e(InterfaceC1318c<T> interfaceC1318c) {
        this.f7108b = interfaceC1318c;
    }

    /* renamed from: a */
    public final void m5538a(List<InterfaceC1317b<T>> list) {
        this.f7107a.addAll(list);
    }

    @Override // java.lang.Runnable
    public void run() {
        m5537a();
    }

    /* renamed from: a */
    public final T m5537a() {
        T tMo5535a = null;
        try {
            Iterator<InterfaceC1317b<T>> it = this.f7107a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            tMo5535a = this.f7108b.mo5535a();
            Iterator<InterfaceC1317b<T>> it2 = this.f7107a.iterator();
            while (it2.hasNext()) {
                it2.next().mo5422a(this.f7108b, tMo5535a);
            }
            Iterator<InterfaceC1317b<T>> it3 = this.f7107a.iterator();
            while (it3.hasNext()) {
                it3.next().result(tMo5535a);
            }
        } catch (Throwable th) {
            C1329d.m5572a("efs.base", "efs.util.concurrent", th);
            Iterator<InterfaceC1317b<T>> it4 = this.f7107a.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
        return tMo5535a;
    }
}

package com.efs.sdk.base.p020a.p031h.p032a;

import android.support.annotation.NonNull;
import com.efs.sdk.base.p020a.p031h.C2957d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.efs.sdk.base.a.h.a.e */
/* loaded from: classes2.dex */
public class RunnableC2948e<T> implements Runnable {

    /* renamed from: a */
    private List<InterfaceC2945b<T>> f1137a = new ArrayList(5);

    /* renamed from: b */
    private InterfaceC2946c<T> f1138b;

    public RunnableC2948e(@NonNull InterfaceC2946c<T> interfaceC2946c) {
        this.f1138b = interfaceC2946c;
    }

    /* renamed from: a */
    public final void m2179a(@NonNull List<InterfaceC2945b<T>> list) {
        this.f1137a.addAll(list);
    }

    @Override // java.lang.Runnable
    public void run() {
        m2178a();
    }

    /* renamed from: a */
    public final T m2178a() {
        T tMo2176a = null;
        try {
            Iterator<InterfaceC2945b<T>> it = this.f1137a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            tMo2176a = this.f1138b.mo2176a();
            Iterator<InterfaceC2945b<T>> it2 = this.f1137a.iterator();
            while (it2.hasNext()) {
                it2.next().mo2063a(this.f1138b, tMo2176a);
            }
            Iterator<InterfaceC2945b<T>> it3 = this.f1137a.iterator();
            while (it3.hasNext()) {
                it3.next().result(tMo2176a);
            }
        } catch (Throwable th) {
            C2957d.m2213a("efs.base", "efs.util.concurrent", th);
            Iterator<InterfaceC2945b<T>> it4 = this.f1137a.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
        return tMo2176a;
    }
}

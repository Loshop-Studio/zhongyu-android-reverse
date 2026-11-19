package com.efs.sdk.base.p039a.p050h.p051a;

import androidx.annotation.NonNull;
import com.efs.sdk.base.p039a.p050h.C5697d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.efs.sdk.base.a.h.a.e */
/* loaded from: classes3.dex */
public class RunnableC5688e<T> implements Runnable {

    /* renamed from: a */
    private List<InterfaceC5685b<T>> f4741a = new ArrayList(5);

    /* renamed from: b */
    private InterfaceC5686c<T> f4742b;

    public RunnableC5688e(@NonNull InterfaceC5686c<T> interfaceC5686c) {
        this.f4742b = interfaceC5686c;
    }

    /* renamed from: a */
    public final void m4148a(@NonNull List<InterfaceC5685b<T>> list) {
        this.f4741a.addAll(list);
    }

    @Override // java.lang.Runnable
    public void run() {
        m4147a();
    }

    /* renamed from: a */
    public final T m4147a() {
        T tMo4145a = null;
        try {
            Iterator<InterfaceC5685b<T>> it = this.f4741a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            tMo4145a = this.f4742b.mo4145a();
            Iterator<InterfaceC5685b<T>> it2 = this.f4741a.iterator();
            while (it2.hasNext()) {
                it2.next().mo4032a(this.f4742b, tMo4145a);
            }
            Iterator<InterfaceC5685b<T>> it3 = this.f4741a.iterator();
            while (it3.hasNext()) {
                it3.next().result(tMo4145a);
            }
            return tMo4145a;
        } catch (Throwable th) {
            C5697d.m4182a("efs.base", "efs.util.concurrent", th);
            Iterator<InterfaceC5685b<T>> it4 = this.f4741a.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
            return tMo4145a;
        }
    }
}

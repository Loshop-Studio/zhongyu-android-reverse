package p016b0;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p185v7.AbstractC6675d;
import p202y.InterfaceC6760c;

/* renamed from: b0.c */
/* loaded from: classes2.dex */
public final class C3063c extends WeakReference {

    /* renamed from: a */
    public final InterfaceC6760c f1392a;

    /* renamed from: b */
    public final boolean f1393b;

    /* renamed from: c */
    public InterfaceC3072g0 f1394c;

    public C3063c(InterfaceC6760c interfaceC6760c, C3060a0 c3060a0, ReferenceQueue referenceQueue) {
        super(c3060a0, referenceQueue);
        AbstractC6675d.m6344f(interfaceC6760c, "Argument must not be null");
        this.f1392a = interfaceC6760c;
        boolean z8 = c3060a0.f1382a;
        this.f1394c = null;
        this.f1393b = z8;
    }
}

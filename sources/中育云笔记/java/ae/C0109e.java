package ae;

import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9545q;

/* renamed from: ae.e */
/* loaded from: classes6.dex */
public final class C0109e implements InterfaceC0108d {

    /* renamed from: a */
    public final Object f116a;

    /* renamed from: b */
    public final InterfaceC9545q f117b;

    /* renamed from: c */
    public final InterfaceC9545q f118c;

    /* renamed from: d */
    public final InterfaceC9545q f119d;

    public C0109e(Object obj, InterfaceC9545q interfaceC9545q, InterfaceC9545q interfaceC9545q2) {
        this.f116a = obj;
        this.f117b = interfaceC9545q;
        this.f118c = interfaceC9545q2;
        this.f119d = AbstractC0117m.f128a;
    }

    @Override // ae.InterfaceC0114j
    /* renamed from: a */
    public InterfaceC9545q mo282a() {
        return this.f117b;
    }

    @Override // ae.InterfaceC0114j
    /* renamed from: b */
    public InterfaceC9545q mo283b() {
        return this.f118c;
    }

    @Override // ae.InterfaceC0114j
    /* renamed from: c */
    public InterfaceC9545q mo284c() {
        return this.f119d;
    }

    @Override // ae.InterfaceC0114j
    /* renamed from: d */
    public Object mo285d() {
        return this.f116a;
    }

    public /* synthetic */ C0109e(Object obj, InterfaceC9545q interfaceC9545q, InterfaceC9545q interfaceC9545q2, int i10, AbstractC9972n abstractC9972n) {
        this(obj, interfaceC9545q, (i10 & 4) != 0 ? null : interfaceC9545q2);
    }
}

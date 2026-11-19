package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import p101k7.InterfaceC5765g;
import p152r6.InterfaceC6473e;

/* renamed from: m7.w */
/* loaded from: classes4.dex */
public final class C6184w {

    /* renamed from: e */
    public static final long[] f9879e = new long[0];

    /* renamed from: a */
    public final InterfaceC5765g f9880a;

    /* renamed from: b */
    public final InterfaceC6473e f9881b;

    /* renamed from: c */
    public long f9882c;

    /* renamed from: d */
    public final long[] f9883d;

    public C6184w(InterfaceC5765g descriptor, InterfaceC6473e interfaceC6473e) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        this.f9880a = descriptor;
        this.f9881b = interfaceC6473e;
        int iMo5101d = descriptor.mo5101d();
        if (iMo5101d <= 64) {
            this.f9882c = iMo5101d != 64 ? (-1) << iMo5101d : 0L;
            this.f9883d = f9879e;
            return;
        }
        this.f9882c = 0L;
        int i = (iMo5101d - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iMo5101d & 63) != 0) {
            jArr[i - 1] = (-1) << iMo5101d;
        }
        this.f9883d = jArr;
    }
}

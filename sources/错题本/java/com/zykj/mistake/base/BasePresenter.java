package com.zykj.mistake.base;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import p000a.AbstractC0000a;
import p030c6.AbstractC3234f;
import p081i4.C5678a;
import p081i4.InterfaceC5679b;
import p145q5.AbstractC6434e;
import p151r5.AbstractC6465b;
import p159s5.C6558a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"Lcom/zykj/mistake/base/BasePresenter;", "Li4/b;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class BasePresenter<V extends InterfaceC5679b> {

    /* renamed from: a */
    public final String f5999a = getClass().getSimpleName();

    /* renamed from: b */
    public C6558a f6000b;

    /* renamed from: c */
    public Object f6001c;

    /* renamed from: a */
    public final void m3969a(AbstractC6434e observable, AbstractC0000a abstractC0000a) {
        AbstractC5830k.m5330g(observable, "observable");
        m3970b(observable, abstractC0000a, true);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [i4.b, java.lang.Object] */
    /* renamed from: b */
    public final void m3970b(AbstractC6434e observable, AbstractC0000a abstractC0000a, boolean z8) {
        ?? r02;
        AbstractC5830k.m5330g(observable, "observable");
        if (z8 && (r02 = this.f6001c) != 0) {
            r02.mo3964d(true);
        }
        C5678a c5678a = new C5678a(this, abstractC0000a, z8);
        observable.m6079d(AbstractC3234f.f1799a).m6077a(AbstractC6465b.m6127a()).m6078b(c5678a);
        if (this.f6000b == null) {
            this.f6000b = new C6558a(0);
        }
        C6558a c6558a = this.f6000b;
        if (c6558a != null) {
            c6558a.mo6200a(c5678a);
        }
    }
}

package kotlin.jvm.internal;

import p019c3.InterfaceC1085b;
import p019c3.InterfaceC1093j;

/* renamed from: kotlin.jvm.internal.r */
/* loaded from: classes.dex */
public abstract class AbstractC2775r extends AbstractC2777t implements InterfaceC1093j {
    public AbstractC2775r(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, i4);
    }

    @Override // kotlin.jvm.internal.AbstractC2760c
    protected InterfaceC1085b computeReflected() {
        return C2782y.m9261e(this);
    }

    @Override // p019c3.InterfaceC1093j
    public InterfaceC1093j.a getGetter() {
        return ((InterfaceC1093j) getReflected()).getGetter();
    }

    @Override // p171x2.InterfaceC3470l
    public Object invoke(Object obj) {
        return get(obj);
    }
}

package p080j3;

import java.lang.annotation.Annotation;

/* renamed from: j3.h0 */
/* loaded from: classes2.dex */
public final class C3820h0 implements InterfaceC3818g0 {

    /* renamed from: a */
    public static final InterfaceC3818g0 f4640a = new C3820h0();

    /* renamed from: a */
    public static Annotation[] m5049a(Annotation[] annotationArr) {
        if (AbstractC3822i0.m5064l(annotationArr, InterfaceC3818g0.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f4640a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return InterfaceC3818g0.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof InterfaceC3818g0;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + InterfaceC3818g0.class.getName() + "()";
    }
}

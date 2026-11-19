package ca;

import java.lang.annotation.Annotation;

/* renamed from: ca.g0 */
/* loaded from: classes5.dex */
public final class C5289g0 implements InterfaceC5287f0 {

    /* renamed from: a */
    public static final InterfaceC5287f0 f2500a = new C5289g0();

    /* renamed from: a */
    public static Annotation[] m2277a(Annotation[] annotationArr) {
        if (AbstractC5291h0.m2292l(annotationArr, InterfaceC5287f0.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f2500a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return InterfaceC5287f0.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof InterfaceC5287f0;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + InterfaceC5287f0.class.getName() + "()";
    }
}

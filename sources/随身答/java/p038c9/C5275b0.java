package p038c9;

import java.lang.annotation.Annotation;

/* renamed from: c9.b0 */
/* loaded from: classes5.dex */
public final class C5275b0 implements InterfaceC5273a0 {

    /* renamed from: a */
    public static final InterfaceC5273a0 f2523a = new C5275b0();

    /* renamed from: a */
    public static Annotation[] m2422a(Annotation[] annotationArr) {
        if (AbstractC5277c0.m2436l(annotationArr, InterfaceC5273a0.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f2523a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return InterfaceC5273a0.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof InterfaceC5273a0;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + InterfaceC5273a0.class.getName() + "()";
    }
}

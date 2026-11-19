package p226r9;

import java.lang.annotation.Annotation;

/* renamed from: r9.g0 */
/* loaded from: classes5.dex */
public final class C9065g0 implements InterfaceC9063f0 {

    /* renamed from: a */
    public static final InterfaceC9063f0 f15606a = new C9065g0();

    /* renamed from: a */
    public static Annotation[] m15275a(Annotation[] annotationArr) {
        if (AbstractC9067h0.m15290l(annotationArr, InterfaceC9063f0.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f15606a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return InterfaceC9063f0.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof InterfaceC9063f0;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + InterfaceC9063f0.class.getName() + "()";
    }
}

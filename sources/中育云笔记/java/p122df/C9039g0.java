package p122df;

import java.lang.annotation.Annotation;

/* renamed from: df.g0 */
/* loaded from: classes6.dex */
public final class C9039g0 implements InterfaceC9037f0 {

    /* renamed from: a */
    public static final InterfaceC9037f0 f21109a = new C9039g0();

    /* renamed from: a */
    public static Annotation[] m17738a(Annotation[] annotationArr) {
        if (AbstractC9041h0.m17750l(annotationArr, InterfaceC9037f0.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f21109a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return InterfaceC9037f0.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof InterfaceC9037f0;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + InterfaceC9037f0.class.getName() + "()";
    }
}

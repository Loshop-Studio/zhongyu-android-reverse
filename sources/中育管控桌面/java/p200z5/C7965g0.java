package p200z5;

import java.lang.annotation.Annotation;

/* renamed from: z5.g0 */
/* loaded from: classes4.dex */
public final class C7965g0 implements InterfaceC7963f0 {

    /* renamed from: a */
    public static final InterfaceC7963f0 f10761a = new C7965g0();

    /* renamed from: a */
    public static Annotation[] m9817a(Annotation[] annotationArr) {
        if (AbstractC7967h0.m9832l(annotationArr, InterfaceC7963f0.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f10761a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return InterfaceC7963f0.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof InterfaceC7963f0;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + InterfaceC7963f0.class.getName() + "()";
    }
}

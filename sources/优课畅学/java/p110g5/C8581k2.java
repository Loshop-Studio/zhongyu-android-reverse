package p110g5;

import com.zykj.study.data.PdfEntity;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: g5.k2 */
/* loaded from: classes5.dex */
public final class C8581k2 {

    /* renamed from: a */
    public final PdfEntity f16143a;

    public C8581k2(PdfEntity pdfEntity) {
        this.f16143a = pdfEntity;
    }

    /* renamed from: a */
    public final PdfEntity m13911a() {
        return this.f16143a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8581k2) && AbstractC9133u.m16128b(this.f16143a, ((C8581k2) obj).f16143a);
    }

    public int hashCode() {
        PdfEntity pdfEntity = this.f16143a;
        if (pdfEntity == null) {
            return 0;
        }
        return pdfEntity.hashCode();
    }

    public String toString() {
        return "PdfViewState(pdfEntity=" + this.f16143a + ")";
    }
}

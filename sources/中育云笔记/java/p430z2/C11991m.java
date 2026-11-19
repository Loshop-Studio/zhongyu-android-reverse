package p430z2;

import com.friday.common.entity.PdfEntity;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: z2.m */
/* loaded from: classes3.dex */
public final class C11991m {

    /* renamed from: b */
    public static final int f28366b = PdfEntity.$stable;

    /* renamed from: a */
    public final PdfEntity f28367a;

    public C11991m(PdfEntity pdfEntity) {
        this.f28367a = pdfEntity;
    }

    /* renamed from: a */
    public final PdfEntity m26603a() {
        return this.f28367a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11991m) && AbstractC9979u.m20289b(this.f28367a, ((C11991m) obj).f28367a);
    }

    public int hashCode() {
        PdfEntity pdfEntity = this.f28367a;
        if (pdfEntity == null) {
            return 0;
        }
        return pdfEntity.hashCode();
    }

    public String toString() {
        return "PdfViewState(pdfEntity=" + this.f28367a + ")";
    }

    public /* synthetic */ C11991m(PdfEntity pdfEntity, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : pdfEntity);
    }
}

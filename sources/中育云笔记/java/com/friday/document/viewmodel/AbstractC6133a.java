package com.friday.document.viewmodel;

import com.friday.common.entity.PdfEntity;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: com.friday.document.viewmodel.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6133a {

    /* renamed from: com.friday.document.viewmodel.a$a */
    public static final class a extends AbstractC6133a {

        /* renamed from: a */
        public final String f8436a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String filePath) {
            super(null);
            AbstractC9979u.m20294g(filePath, "filePath");
            this.f8436a = filePath;
        }

        /* renamed from: a */
        public final String m6490a() {
            return this.f8436a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC9979u.m20289b(this.f8436a, ((a) obj).f8436a);
        }

        public int hashCode() {
            return this.f8436a.hashCode();
        }

        public String toString() {
            return "Open(filePath=" + this.f8436a + ")";
        }
    }

    /* renamed from: com.friday.document.viewmodel.a$b */
    public static final class b extends AbstractC6133a {

        /* renamed from: b */
        public static final int f8437b = PdfEntity.$stable;

        /* renamed from: a */
        public final PdfEntity f8438a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PdfEntity pdfEntity) {
            super(null);
            AbstractC9979u.m20294g(pdfEntity, "pdfEntity");
            this.f8438a = pdfEntity;
        }

        /* renamed from: a */
        public final PdfEntity m6491a() {
            return this.f8438a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC9979u.m20289b(this.f8438a, ((b) obj).f8438a);
        }

        public int hashCode() {
            return this.f8438a.hashCode();
        }

        public String toString() {
            return "SavePage(pdfEntity=" + this.f8438a + ")";
        }
    }

    public /* synthetic */ AbstractC6133a(AbstractC9972n abstractC9972n) {
        this();
    }

    public AbstractC6133a() {
    }
}

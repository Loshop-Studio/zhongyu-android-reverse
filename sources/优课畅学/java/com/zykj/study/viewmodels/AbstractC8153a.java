package com.zykj.study.viewmodels;

import com.zykj.study.data.PdfEntity;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.study.viewmodels.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8153a {

    /* renamed from: com.zykj.study.viewmodels.a$a */
    public static final class a extends AbstractC8153a {

        /* renamed from: a */
        public final String f14526a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String filePath) {
            super(null);
            AbstractC9133u.m16133g(filePath, "filePath");
            this.f14526a = filePath;
        }

        /* renamed from: a */
        public final String m12321a() {
            return this.f14526a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC9133u.m16128b(this.f14526a, ((a) obj).f14526a);
        }

        public int hashCode() {
            return this.f14526a.hashCode();
        }

        public String toString() {
            return "Open(filePath=" + this.f14526a + ")";
        }
    }

    /* renamed from: com.zykj.study.viewmodels.a$b */
    public static final class b extends AbstractC8153a {

        /* renamed from: a */
        public final PdfEntity f14527a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PdfEntity pdfEntity) {
            super(null);
            AbstractC9133u.m16133g(pdfEntity, "pdfEntity");
            this.f14527a = pdfEntity;
        }

        /* renamed from: a */
        public final PdfEntity m12322a() {
            return this.f14527a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC9133u.m16128b(this.f14527a, ((b) obj).f14527a);
        }

        public int hashCode() {
            return this.f14527a.hashCode();
        }

        public String toString() {
            return "SavePage(pdfEntity=" + this.f14527a + ")";
        }
    }

    public /* synthetic */ AbstractC8153a(AbstractC9126n abstractC9126n) {
        this();
    }

    public AbstractC8153a() {
    }
}

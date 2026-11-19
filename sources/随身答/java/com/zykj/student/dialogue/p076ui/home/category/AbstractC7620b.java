package com.zykj.student.dialogue.p076ui.home.category;

import com.zykj.student.dialogue.bean.resp.CatalogResp;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.student.dialogue.ui.home.category.b */
/* loaded from: classes5.dex */
public abstract class AbstractC7620b {

    /* renamed from: com.zykj.student.dialogue.ui.home.category.b$a */
    public static final class a extends AbstractC7620b {

        /* renamed from: a */
        public static final a f11851a = new a();

        public a() {
            super(null);
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.home.category.b$b */
    public static final class b extends AbstractC7620b {

        /* renamed from: a */
        public final CatalogResp f11852a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CatalogResp category) {
            super(null);
            Intrinsics.checkNotNullParameter(category, "category");
            this.f11852a = category;
        }

        /* renamed from: a */
        public final CatalogResp m10990a() {
            return this.f11852a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f11852a, ((b) obj).f11852a);
        }

        public int hashCode() {
            return this.f11852a.hashCode();
        }

        public String toString() {
            return "DeleteCategory(category=" + this.f11852a + ")";
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.home.category.b$c */
    public static final class c extends AbstractC7620b {

        /* renamed from: a */
        public final CatalogResp f11853a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CatalogResp category) {
            super(null);
            Intrinsics.checkNotNullParameter(category, "category");
            this.f11853a = category;
        }

        /* renamed from: a */
        public final CatalogResp m10991a() {
            return this.f11853a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f11853a, ((c) obj).f11853a);
        }

        public int hashCode() {
            return this.f11853a.hashCode();
        }

        public String toString() {
            return "UpdateCategory(category=" + this.f11853a + ")";
        }
    }

    public /* synthetic */ AbstractC7620b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC7620b() {
    }
}

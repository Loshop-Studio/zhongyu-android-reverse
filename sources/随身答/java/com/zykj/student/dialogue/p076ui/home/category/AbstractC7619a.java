package com.zykj.student.dialogue.p076ui.home.category;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.student.dialogue.ui.home.category.a */
/* loaded from: classes5.dex */
public abstract class AbstractC7619a {

    /* renamed from: com.zykj.student.dialogue.ui.home.category.a$a */
    public static final class a extends AbstractC7619a {

        /* renamed from: a */
        public final boolean f11849a;

        public a(boolean z9) {
            super(null);
            this.f11849a = z9;
        }

        /* renamed from: a */
        public final boolean m10988a() {
            return this.f11849a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f11849a == ((a) obj).f11849a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f11849a);
        }

        public String toString() {
            return "AddCategoryResult(succeed=" + this.f11849a + ")";
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.home.category.a$b */
    public static final class b extends AbstractC7619a {

        /* renamed from: a */
        public final boolean f11850a;

        public b(boolean z9) {
            super(null);
            this.f11850a = z9;
        }

        /* renamed from: a */
        public final boolean m10989a() {
            return this.f11850a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f11850a == ((b) obj).f11850a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f11850a);
        }

        public String toString() {
            return "UpdateCategoryResult(succeed=" + this.f11850a + ")";
        }
    }

    public /* synthetic */ AbstractC7619a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC7619a() {
    }
}

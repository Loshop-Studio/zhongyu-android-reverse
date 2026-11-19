package com.zykj.student.dialogue.p076ui.detail.viewmodel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.student.dialogue.ui.detail.viewmodel.a */
/* loaded from: classes5.dex */
public abstract class AbstractC7538a {

    /* renamed from: com.zykj.student.dialogue.ui.detail.viewmodel.a$a */
    public static final class a extends AbstractC7538a {

        /* renamed from: a */
        public final long f11249a;

        public a(long j9) {
            super(null);
            this.f11249a = j9;
        }

        /* renamed from: a */
        public final long m10498a() {
            return this.f11249a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f11249a == ((a) obj).f11249a;
        }

        public int hashCode() {
            return Long.hashCode(this.f11249a);
        }

        public String toString() {
            return "ExitFullscreenEnd(time=" + this.f11249a + ")";
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.detail.viewmodel.a$b */
    public static final class b extends AbstractC7538a {

        /* renamed from: a */
        public final long f11250a;

        public b(long j9) {
            super(null);
            this.f11250a = j9;
        }

        /* renamed from: a */
        public final long m10499a() {
            return this.f11250a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f11250a == ((b) obj).f11250a;
        }

        public int hashCode() {
            return Long.hashCode(this.f11250a);
        }

        public String toString() {
            return "FullscreenEnd(time=" + this.f11250a + ")";
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.detail.viewmodel.a$c */
    public static final class c extends AbstractC7538a {

        /* renamed from: a */
        public final int f11251a;

        public c(int i9) {
            super(null);
            this.f11251a = i9;
        }

        /* renamed from: a */
        public final int m10500a() {
            return this.f11251a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f11251a == ((c) obj).f11251a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f11251a);
        }

        public String toString() {
            return "ItemSelect(position=" + this.f11251a + ")";
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.detail.viewmodel.a$d */
    public static final class d extends AbstractC7538a {

        /* renamed from: a */
        public final boolean f11252a;

        public d(boolean z9) {
            super(null);
            this.f11252a = z9;
        }

        /* renamed from: a */
        public final boolean m10501a() {
            return this.f11252a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f11252a == ((d) obj).f11252a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f11252a);
        }

        public String toString() {
            return "RefreshList(selectLast=" + this.f11252a + ")";
        }

        public /* synthetic */ d(boolean z9, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            this((i9 & 1) != 0 ? false : z9);
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.detail.viewmodel.a$e */
    public static final class e extends AbstractC7538a {

        /* renamed from: a */
        public final Tab f11253a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Tab tab) {
            super(null);
            Intrinsics.checkNotNullParameter(tab, "tab");
            this.f11253a = tab;
        }

        /* renamed from: a */
        public final Tab m10502a() {
            return this.f11253a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f11253a == ((e) obj).f11253a;
        }

        public int hashCode() {
            return this.f11253a.hashCode();
        }

        public String toString() {
            return "TabSwitch(tab=" + this.f11253a + ")";
        }
    }

    public /* synthetic */ AbstractC7538a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC7538a() {
    }
}

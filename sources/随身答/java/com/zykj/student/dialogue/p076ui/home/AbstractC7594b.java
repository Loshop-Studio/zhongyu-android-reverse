package com.zykj.student.dialogue.p076ui.home;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.student.dialogue.ui.home.b */
/* loaded from: classes5.dex */
public abstract class AbstractC7594b {

    /* renamed from: com.zykj.student.dialogue.ui.home.b$a */
    public static final class a extends AbstractC7594b {

        /* renamed from: a */
        public final boolean f11732a;

        public a(boolean z9) {
            super(null);
            this.f11732a = z9;
        }

        /* renamed from: a */
        public final boolean m10904a() {
            return this.f11732a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f11732a == ((a) obj).f11732a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f11732a);
        }

        public String toString() {
            return "CameraPermission(isAvailable=" + this.f11732a + ")";
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.home.b$b */
    public static final class b extends AbstractC7594b {

        /* renamed from: a */
        public final List f11733a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List ids) {
            super(null);
            Intrinsics.checkNotNullParameter(ids, "ids");
            this.f11733a = ids;
        }

        /* renamed from: a */
        public final List m10905a() {
            return this.f11733a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f11733a, ((b) obj).f11733a);
        }

        public int hashCode() {
            return this.f11733a.hashCode();
        }

        public String toString() {
            return "ItemsMove(ids=" + this.f11733a + ")";
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.home.b$c */
    public static final class c extends AbstractC7594b {

        /* renamed from: a */
        public final long f11734a;

        public c(long j9) {
            super(null);
            this.f11734a = j9;
        }

        /* renamed from: a */
        public final long m10906a() {
            return this.f11734a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f11734a == ((c) obj).f11734a;
        }

        public int hashCode() {
            return Long.hashCode(this.f11734a);
        }

        public String toString() {
            return "Refresh(catalogId=" + this.f11734a + ")";
        }
    }

    public /* synthetic */ AbstractC7594b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC7594b() {
    }
}

package com.zykj.huiwei.launcher.p035ui.dialog.changePsdDialog;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.b */
/* loaded from: classes4.dex */
public abstract class AbstractC6128b {

    /* renamed from: com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.b$a */
    public static final class a extends AbstractC6128b {

        /* renamed from: a */
        public final String f6571a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6571a = value;
        }

        /* renamed from: a */
        public final String m5809a() {
            return this.f6571a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f6571a, ((a) obj).f6571a);
        }

        public int hashCode() {
            return this.f6571a.hashCode();
        }

        public String toString() {
            return "ConfirmPwdChanged(value=" + this.f6571a + ")";
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.b$b */
    public static final class b extends AbstractC6128b {

        /* renamed from: a */
        public final String f6572a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6572a = value;
        }

        /* renamed from: a */
        public final String m5810a() {
            return this.f6572a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f6572a, ((b) obj).f6572a);
        }

        public int hashCode() {
            return this.f6572a.hashCode();
        }

        public String toString() {
            return "NewPwdChanged(value=" + this.f6572a + ")";
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.b$c */
    public static final class c extends AbstractC6128b {

        /* renamed from: a */
        public final String f6573a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6573a = value;
        }

        /* renamed from: a */
        public final String m5811a() {
            return this.f6573a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f6573a, ((c) obj).f6573a);
        }

        public int hashCode() {
            return this.f6573a.hashCode();
        }

        public String toString() {
            return "OldPwdChanged(value=" + this.f6573a + ")";
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.b$d */
    public static final class d extends AbstractC6128b {

        /* renamed from: a */
        public static final d f6574a = new d();

        public d() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC6128b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC6128b() {
    }
}

package com.zykj.huiwei.launcher.viewmodels;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.huiwei.launcher.viewmodels.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6194a {

    /* renamed from: com.zykj.huiwei.launcher.viewmodels.a$a */
    public static final class a extends AbstractC6194a {

        /* renamed from: a */
        public final String f7326a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7326a = value;
        }

        /* renamed from: a */
        public final String m6201a() {
            return this.f7326a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f7326a, ((a) obj).f7326a);
        }

        public int hashCode() {
            return this.f7326a.hashCode();
        }

        public String toString() {
            return "ConfirmPwdChanged(value=" + this.f7326a + ")";
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.viewmodels.a$b */
    public static final class b extends AbstractC6194a {

        /* renamed from: a */
        public final String f7327a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7327a = value;
        }

        /* renamed from: a */
        public final String m6202a() {
            return this.f7327a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f7327a, ((b) obj).f7327a);
        }

        public int hashCode() {
            return this.f7327a.hashCode();
        }

        public String toString() {
            return "NewPwdChanged(value=" + this.f7327a + ")";
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.viewmodels.a$c */
    public static final class c extends AbstractC6194a {

        /* renamed from: a */
        public static final c f7328a = new c();

        public c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC6194a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC6194a() {
    }
}

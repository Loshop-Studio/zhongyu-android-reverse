package com.zykj.huiwei.launcher.p035ui.dialog.changePsdDialog;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.c */
/* loaded from: classes4.dex */
public abstract class AbstractC6129c {

    /* renamed from: com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.c$a */
    public static final class a extends AbstractC6129c {

        /* renamed from: a */
        public final String f6575a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String msg) {
            super(null);
            Intrinsics.checkNotNullParameter(msg, "msg");
            this.f6575a = msg;
        }

        /* renamed from: a */
        public final String m5812a() {
            return this.f6575a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f6575a, ((a) obj).f6575a);
        }

        public int hashCode() {
            return this.f6575a.hashCode();
        }

        public String toString() {
            return "ShowError(msg=" + this.f6575a + ")";
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.c$b */
    public static final class b extends AbstractC6129c {

        /* renamed from: a */
        public static final b f6576a = new b();

        public b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC6129c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC6129c() {
    }
}

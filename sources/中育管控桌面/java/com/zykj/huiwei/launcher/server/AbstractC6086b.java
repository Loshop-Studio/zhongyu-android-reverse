package com.zykj.huiwei.launcher.server;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.huiwei.launcher.server.b */
/* loaded from: classes4.dex */
public abstract class AbstractC6086b {

    /* renamed from: com.zykj.huiwei.launcher.server.b$a */
    public static final class a extends AbstractC6086b {

        /* renamed from: a */
        public final String f6283a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.f6283a = message;
        }

        /* renamed from: a */
        public final String m5510a() {
            return this.f6283a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f6283a, ((a) obj).f6283a);
        }

        public int hashCode() {
            return this.f6283a.hashCode();
        }

        public String toString() {
            return "ShowToast(message=" + this.f6283a + ")";
        }
    }

    public /* synthetic */ AbstractC6086b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC6086b() {
    }
}

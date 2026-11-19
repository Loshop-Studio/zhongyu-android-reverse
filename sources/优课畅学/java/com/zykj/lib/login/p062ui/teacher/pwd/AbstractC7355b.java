package com.zykj.lib.login.p062ui.teacher.pwd;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.lib.login.ui.teacher.pwd.b */
/* loaded from: classes4.dex */
public abstract class AbstractC7355b {

    /* renamed from: com.zykj.lib.login.ui.teacher.pwd.b$a */
    public static final class a extends AbstractC7355b {

        /* renamed from: a */
        public final String f10094a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String message) {
            super(null);
            AbstractC9133u.m16133g(message, "message");
            this.f10094a = message;
        }

        /* renamed from: a */
        public final String m9388a() {
            return this.f10094a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC9133u.m16128b(this.f10094a, ((a) obj).f10094a);
        }

        public int hashCode() {
            return this.f10094a.hashCode();
        }

        public String toString() {
            return "ShowToast(message=" + this.f10094a + ")";
        }
    }

    /* renamed from: com.zykj.lib.login.ui.teacher.pwd.b$b */
    public static final class b extends AbstractC7355b {

        /* renamed from: a */
        public static final b f10095a = new b();

        public b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 506111012;
        }

        public String toString() {
            return "Success";
        }
    }

    public /* synthetic */ AbstractC7355b(AbstractC9126n abstractC9126n) {
        this();
    }

    public AbstractC7355b() {
    }
}

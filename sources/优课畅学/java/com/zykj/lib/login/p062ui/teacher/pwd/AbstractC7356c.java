package com.zykj.lib.login.p062ui.teacher.pwd;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.lib.login.ui.teacher.pwd.c */
/* loaded from: classes4.dex */
public abstract class AbstractC7356c {

    /* renamed from: com.zykj.lib.login.ui.teacher.pwd.c$a */
    public static final class a extends AbstractC7356c {

        /* renamed from: a */
        public final String f10096a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String value) {
            super(null);
            AbstractC9133u.m16133g(value, "value");
            this.f10096a = value;
        }

        /* renamed from: a */
        public final String m9389a() {
            return this.f10096a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC9133u.m16128b(this.f10096a, ((a) obj).f10096a);
        }

        public int hashCode() {
            return this.f10096a.hashCode();
        }

        public String toString() {
            return "ConfirmPwdChanged(value=" + this.f10096a + ")";
        }
    }

    /* renamed from: com.zykj.lib.login.ui.teacher.pwd.c$b */
    public static final class b extends AbstractC7356c {

        /* renamed from: a */
        public final String f10097a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String value) {
            super(null);
            AbstractC9133u.m16133g(value, "value");
            this.f10097a = value;
        }

        /* renamed from: a */
        public final String m9390a() {
            return this.f10097a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC9133u.m16128b(this.f10097a, ((b) obj).f10097a);
        }

        public int hashCode() {
            return this.f10097a.hashCode();
        }

        public String toString() {
            return "NewPwdChanged(value=" + this.f10097a + ")";
        }
    }

    /* renamed from: com.zykj.lib.login.ui.teacher.pwd.c$c */
    public static final class c extends AbstractC7356c {

        /* renamed from: a */
        public static final c f10098a = new c();

        public c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC7356c(AbstractC9126n abstractC9126n) {
        this();
    }

    public AbstractC7356c() {
    }
}

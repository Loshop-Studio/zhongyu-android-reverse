package com.zykj.lib.login.p062ui.teacher;

import kotlin.jvm.internal.AbstractC9126n;

/* renamed from: com.zykj.lib.login.ui.teacher.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7343a {

    /* renamed from: com.zykj.lib.login.ui.teacher.a$a */
    public static final class a extends AbstractC7343a {

        /* renamed from: a */
        public final int f10009a;

        public a(int i10) {
            super(null);
            this.f10009a = i10;
        }

        /* renamed from: a */
        public final int m9331a() {
            return this.f10009a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f10009a == ((a) obj).f10009a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f10009a);
        }

        public String toString() {
            return "ShowChangePwdDialog(level=" + this.f10009a + ")";
        }
    }

    /* renamed from: com.zykj.lib.login.ui.teacher.a$b */
    public static final class b extends AbstractC7343a {

        /* renamed from: a */
        public static final b f10010a = new b();

        public b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC7343a(AbstractC9126n abstractC9126n) {
        this();
    }

    public AbstractC7343a() {
    }
}

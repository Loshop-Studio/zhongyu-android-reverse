package com.zykj.evaluation.p057ui.home;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p101g7.C7588d;

/* renamed from: com.zykj.evaluation.ui.home.c */
/* loaded from: classes4.dex */
public abstract class AbstractC6930c {

    /* renamed from: a */
    public final String f9879a;

    /* renamed from: com.zykj.evaluation.ui.home.c$a */
    public static abstract class a extends AbstractC6930c {

        /* renamed from: b */
        public final Integer f9880b;

        /* renamed from: c */
        public final String f9881c;

        /* renamed from: com.zykj.evaluation.ui.home.c$a$a, reason: collision with other inner class name */
        public static final class C10137a extends a {

            /* renamed from: d */
            public static final C10137a f9882d = new C10137a();

            public C10137a() {
                super(1, "免交", null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C10137a);
            }

            public int hashCode() {
                return 99040489;
            }

            public String toString() {
                return "Exemption";
            }
        }

        /* renamed from: com.zykj.evaluation.ui.home.c$a$b */
        public static final class b extends a {

            /* renamed from: d */
            public static final b f9883d = new b();

            public b() {
                super(3, "网阅", null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -1749477069;
            }

            public String toString() {
                return "Online";
            }
        }

        /* renamed from: com.zykj.evaluation.ui.home.c$a$c */
        public static final class c extends a {

            /* renamed from: d */
            public static final c f9884d = new c();

            public c() {
                super(2, "自批", null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -1338021332;
            }

            public String toString() {
                return "Self";
            }
        }

        /* renamed from: com.zykj.evaluation.ui.home.c$a$d */
        public static final class d extends a {

            /* renamed from: d */
            public static final d f9885d = new d();

            /* JADX WARN: Multi-variable type inference failed */
            public d() {
                super(null, "全部", 0 == true ? 1 : 0);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -1498707455;
            }

            public String toString() {
                return "Unlimited";
            }
        }

        /* renamed from: com.zykj.evaluation.ui.home.c$a$e */
        public static final class e extends a {

            /* renamed from: d */
            public static final e f9886d = new e();

            public e() {
                super(4, "催交", null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -1337949413;
            }

            public String toString() {
                return "Urge";
            }
        }

        public /* synthetic */ a(Integer num, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, str);
        }

        /* renamed from: b */
        public final Integer m10076b() {
            return this.f9880b;
        }

        public a(Integer num, String str) {
            super(str, null);
            this.f9880b = num;
            this.f9881c = str;
        }
    }

    /* renamed from: com.zykj.evaluation.ui.home.c$b */
    public static class b extends AbstractC6930c {

        /* renamed from: b */
        public final Long f9887b;

        /* renamed from: c */
        public final String f9888c;

        /* renamed from: com.zykj.evaluation.ui.home.c$b$a */
        public static final class a extends b {

            /* renamed from: d */
            public static final a f9889d = new a();

            public a() {
                super(null, "全部");
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 750382034;
            }

            public String toString() {
                return "Unlimited";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Long l10, String gradeName) {
            super(gradeName, null);
            Intrinsics.checkNotNullParameter(gradeName, "gradeName");
            this.f9887b = l10;
            this.f9888c = gradeName;
        }

        /* renamed from: b */
        public final Long m10077b() {
            return this.f9887b;
        }
    }

    /* renamed from: com.zykj.evaluation.ui.home.c$c */
    public static abstract class c extends AbstractC6930c {

        /* renamed from: b */
        public final Integer f9890b;

        /* renamed from: c */
        public final String f9891c;

        /* renamed from: com.zykj.evaluation.ui.home.c$c$a */
        public static final class a extends c {

            /* renamed from: d */
            public static final a f9892d = new a();

            public a() {
                super(1, "未逾期", null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 460573561;
            }

            public String toString() {
                return "NotOverdue";
            }
        }

        /* renamed from: com.zykj.evaluation.ui.home.c$c$b */
        public static final class b extends c {

            /* renamed from: d */
            public static final b f9893d = new b();

            public b() {
                super(0, "已逾期", null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -923099404;
            }

            public String toString() {
                return "Overdue";
            }
        }

        /* renamed from: com.zykj.evaluation.ui.home.c$c$c, reason: collision with other inner class name */
        public static final class C10138c extends c {

            /* renamed from: d */
            public static final C10138c f9894d = new C10138c();

            /* JADX WARN: Multi-variable type inference failed */
            public C10138c() {
                super(null, "全部", 0 == true ? 1 : 0);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C10138c);
            }

            public int hashCode() {
                return 315198005;
            }

            public String toString() {
                return "Unlimited";
            }
        }

        public /* synthetic */ c(Integer num, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, str);
        }

        /* renamed from: b */
        public final Integer m10078b() {
            return this.f9890b;
        }

        public c(Integer num, String str) {
            super(str, null);
            this.f9890b = num;
            this.f9891c = str;
        }
    }

    /* renamed from: com.zykj.evaluation.ui.home.c$d */
    public static class d extends AbstractC6930c {

        /* renamed from: b */
        public final long f9895b;

        /* renamed from: c */
        public final String f9896c;

        /* renamed from: com.zykj.evaluation.ui.home.c$d$a */
        public static final class a extends d {

            /* renamed from: d */
            public static final a f9897d = new a();

            public a() {
                super(0L, "全部");
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 79569127;
            }

            public String toString() {
                return "Unlimited";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j10, String topicName) {
            super(topicName, null);
            Intrinsics.checkNotNullParameter(topicName, "topicName");
            this.f9895b = j10;
            this.f9896c = topicName;
        }

        /* renamed from: b */
        public final long m10079b() {
            return this.f9895b;
        }
    }

    /* renamed from: com.zykj.evaluation.ui.home.c$e */
    public static abstract class e extends AbstractC6930c {

        /* renamed from: b */
        public final String f9898b;

        /* renamed from: c */
        public final String f9899c;

        /* renamed from: d */
        public final String f9900d;

        /* renamed from: com.zykj.evaluation.ui.home.c$e$a */
        public static final class a extends e {

            /* renamed from: e */
            public final String f9901e;

            /* renamed from: f */
            public final String f9902f;

            public /* synthetic */ a(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
            }

            /* renamed from: d */
            public final boolean m10082d() {
                String strM10081c = m10081c();
                if (strM10081c != null && strM10081c.length() != 0) {
                    return false;
                }
                String strM10080b = m10080b();
                return strM10080b == null || strM10080b.length() == 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f9901e, aVar.f9901e) && Intrinsics.areEqual(this.f9902f, aVar.f9902f);
            }

            public int hashCode() {
                String str = this.f9901e;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f9902f;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "Custom(customStart=" + this.f9901e + ", customEnd=" + this.f9902f + ")";
            }

            public a(String str, String str2) {
                super("自定义", str, str2, null);
                this.f9901e = str;
                this.f9902f = str2;
            }
        }

        /* renamed from: com.zykj.evaluation.ui.home.c$e$b */
        public static final class b extends e {

            /* renamed from: e */
            public static final b f9903e = new b();

            /* JADX WARN: Multi-variable type inference failed */
            public b() {
                super("本月", C7588d.f12716a.m12451a(), null, 0 == true ? 1 : 0);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -1868229863;
            }

            public String toString() {
                return "ThisMonth";
            }
        }

        /* renamed from: com.zykj.evaluation.ui.home.c$e$c */
        public static final class c extends e {

            /* renamed from: e */
            public static final c f9904e = new c();

            /* JADX WARN: Multi-variable type inference failed */
            public c() {
                super("本周", C7588d.f12716a.m12452b(), null, 0 == true ? 1 : 0);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1879685179;
            }

            public String toString() {
                return "ThisWeek";
            }
        }

        /* renamed from: com.zykj.evaluation.ui.home.c$e$d */
        public static final class d extends e {

            /* renamed from: e */
            public static final d f9905e = new d();

            /* JADX WARN: Multi-variable type inference failed */
            public d() {
                super("全部", null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 596841848;
            }

            public String toString() {
                return "Unlimited";
            }
        }

        public /* synthetic */ e(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3);
        }

        /* renamed from: b */
        public final String m10080b() {
            return this.f9900d;
        }

        /* renamed from: c */
        public final String m10081c() {
            return this.f9899c;
        }

        public e(String str, String str2, String str3) {
            super(str, null);
            this.f9898b = str;
            this.f9899c = str2;
            this.f9900d = str3;
        }
    }

    public /* synthetic */ AbstractC6930c(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: a */
    public final String m10075a() {
        String strM10080b;
        if (!(this instanceof e.a)) {
            return this.f9879a;
        }
        e.a aVar = (e.a) this;
        String strM10081c = aVar.m10081c();
        if (strM10081c != null && strM10081c.length() != 0 && (strM10080b = aVar.m10080b()) != null && strM10080b.length() != 0) {
            return ((Object) aVar.m10081c().subSequence(0, 10)) + "~" + ((Object) aVar.m10080b().subSequence(0, 10));
        }
        String strM10081c2 = aVar.m10081c();
        if (strM10081c2 != null && strM10081c2.length() != 0) {
            return ((Object) aVar.m10081c().subSequence(0, 10)) + "以后";
        }
        String strM10080b2 = aVar.m10080b();
        if (strM10080b2 == null || strM10080b2.length() == 0) {
            return this.f9879a;
        }
        return ((Object) aVar.m10080b().subSequence(0, 10)) + "以前";
    }

    public AbstractC6930c(String str) {
        this.f9879a = str;
    }
}

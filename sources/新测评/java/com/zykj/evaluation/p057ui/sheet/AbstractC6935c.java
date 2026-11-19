package com.zykj.evaluation.p057ui.sheet;

import androidx.compose.p013ui.graphics.ColorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.evaluation.ui.sheet.c */
/* loaded from: classes4.dex */
public abstract class AbstractC6935c {

    /* renamed from: a */
    public final long f9958a;

    /* renamed from: b */
    public final long f9959b;

    /* renamed from: c */
    public final long f9960c;

    /* renamed from: com.zykj.evaluation.ui.sheet.c$a */
    public static abstract class a extends AbstractC6935c {

        /* renamed from: com.zykj.evaluation.ui.sheet.c$a$a, reason: collision with other inner class name */
        public static final class C10139a extends a {

            /* renamed from: d */
            public static final C10139a f9961d = new C10139a();

            public C10139a() {
                super(ColorKt.Color(4294916912L), null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C10139a);
            }

            public int hashCode() {
                return 1796390633;
            }

            public String toString() {
                return "Error";
            }
        }

        /* renamed from: com.zykj.evaluation.ui.sheet.c$a$b */
        public static final class b extends a {

            /* renamed from: d */
            public static final b f9962d = new b();

            public b() {
                super(ColorKt.Color(4282949880L), null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 108424230;
            }

            public String toString() {
                return "Normal";
            }
        }

        public /* synthetic */ a(long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10);
        }

        public a(long j10) {
            super(ColorKt.Color(4283782485L), ColorKt.Color(4294967295L), j10, null);
        }
    }

    /* renamed from: com.zykj.evaluation.ui.sheet.c$b */
    public static abstract class b extends AbstractC6935c {

        /* renamed from: com.zykj.evaluation.ui.sheet.c$b$a */
        public static final class a extends b {

            /* renamed from: d */
            public static final a f9963d = new a();

            public a() {
                super(ColorKt.Color(4294916912L), null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 2102141574;
            }

            public String toString() {
                return "Error";
            }
        }

        /* renamed from: com.zykj.evaluation.ui.sheet.c$b$b, reason: collision with other inner class name */
        public static final class C10140b extends b {

            /* renamed from: d */
            public static final C10140b f9964d = new C10140b();

            public C10140b() {
                super(ColorKt.Color(4282949880L), null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C10140b);
            }

            public int hashCode() {
                return 996768809;
            }

            public String toString() {
                return "Normal";
            }
        }

        public /* synthetic */ b(long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10);
        }

        public b(long j10) {
            super(ColorKt.Color(4294967295L), j10, ColorKt.Color(0), null);
        }
    }

    /* renamed from: com.zykj.evaluation.ui.sheet.c$c */
    public static final class c extends AbstractC6935c {

        /* renamed from: d */
        public static final c f9965d = new c();

        public c() {
            super(ColorKt.Color(4283782485L), ColorKt.Color(4294967295L), ColorKt.Color(4291611852L), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1430941232;
        }

        public String toString() {
            return "Todo";
        }
    }

    public /* synthetic */ AbstractC6935c(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12);
    }

    /* renamed from: a */
    public final long m10220a() {
        return this.f9959b;
    }

    /* renamed from: b */
    public final long m10221b() {
        return this.f9960c;
    }

    /* renamed from: c */
    public final long m10222c() {
        return this.f9958a;
    }

    public AbstractC6935c(long j10, long j11, long j12) {
        this.f9958a = j10;
        this.f9959b = j11;
        this.f9960c = j12;
    }
}

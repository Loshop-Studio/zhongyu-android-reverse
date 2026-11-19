package com.zykj.view.board.board;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.board.o */
/* loaded from: classes5.dex */
public abstract class AbstractC7228o {

    /* renamed from: a */
    public final boolean f11071a;

    /* renamed from: b */
    public final boolean f11072b;

    /* renamed from: c */
    public final boolean f11073c;

    /* renamed from: d */
    public final boolean f11074d;

    /* renamed from: e */
    public final boolean f11075e;

    /* renamed from: com.zykj.view.board.board.o$a */
    public static final class a extends AbstractC7228o {

        /* renamed from: f */
        public static final a f11076f = new a();

        public a() {
            super(false, false, false, false, true, 15, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 2112759979;
        }

        public String toString() {
            return "Background";
        }
    }

    /* renamed from: com.zykj.view.board.board.o$b */
    public static final class b extends AbstractC7228o {

        /* renamed from: f */
        public static final b f11077f = new b();

        public b() {
            super(false, false, true, false, false, 27, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 678091913;
        }

        public String toString() {
            return "Eraser";
        }
    }

    /* renamed from: com.zykj.view.board.board.o$c */
    public static final class c extends AbstractC7228o {

        /* renamed from: f */
        public static final c f11078f = new c();

        public c() {
            super(false, false, false, true, false, 23, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 23720881;
        }

        public String toString() {
            return "Graph";
        }
    }

    /* renamed from: com.zykj.view.board.board.o$d */
    public static final class d extends AbstractC7228o {

        /* renamed from: f */
        public static final d f11079f = new d();

        public d() {
            super(false, false, false, false, false, 31, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 693713604;
        }

        public String toString() {
            return "Null";
        }
    }

    /* renamed from: com.zykj.view.board.board.o$e */
    public static final class e extends AbstractC7228o {

        /* renamed from: f */
        public static final e f11080f = new e();

        public e() {
            super(false, true, false, false, false, 29, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 1407852604;
        }

        public String toString() {
            return "Pen";
        }
    }

    /* renamed from: com.zykj.view.board.board.o$f */
    public static final class f extends AbstractC7228o {

        /* renamed from: f */
        public static final f f11081f = new f();

        public f() {
            super(true, false, false, false, false, 30, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return 1067208441;
        }

        public String toString() {
            return "Select";
        }
    }

    public /* synthetic */ AbstractC7228o(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z9, z10, z11, z12, z13);
    }

    /* renamed from: a */
    public final boolean m11016a() {
        return this.f11075e;
    }

    /* renamed from: b */
    public final boolean m11017b() {
        return this.f11073c;
    }

    /* renamed from: c */
    public final boolean m11018c() {
        return this.f11074d;
    }

    /* renamed from: d */
    public final boolean m11019d() {
        return this.f11072b;
    }

    /* renamed from: e */
    public final boolean m11020e() {
        return this.f11071a;
    }

    public AbstractC7228o(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f11071a = z9;
        this.f11072b = z10;
        this.f11073c = z11;
        this.f11074d = z12;
        this.f11075e = z13;
    }

    public /* synthetic */ AbstractC7228o(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z9, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? false : z13, null);
    }
}

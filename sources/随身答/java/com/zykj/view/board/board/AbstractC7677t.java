package com.zykj.view.board.board;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.board.t */
/* loaded from: classes5.dex */
public abstract class AbstractC7677t {

    /* renamed from: a */
    public final boolean f12290a;

    /* renamed from: b */
    public final boolean f12291b;

    /* renamed from: c */
    public final boolean f12292c;

    /* renamed from: d */
    public final boolean f12293d;

    /* renamed from: e */
    public final boolean f12294e;

    /* renamed from: com.zykj.view.board.board.t$a */
    public static final class a extends AbstractC7677t {

        /* renamed from: f */
        public static final a f12295f = new a();

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

    /* renamed from: com.zykj.view.board.board.t$b */
    public static final class b extends AbstractC7677t {

        /* renamed from: f */
        public static final b f12296f = new b();

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

    /* renamed from: com.zykj.view.board.board.t$c */
    public static final class c extends AbstractC7677t {

        /* renamed from: f */
        public static final c f12297f = new c();

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

    /* renamed from: com.zykj.view.board.board.t$d */
    public static final class d extends AbstractC7677t {

        /* renamed from: f */
        public static final d f12298f = new d();

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

    /* renamed from: com.zykj.view.board.board.t$e */
    public static final class e extends AbstractC7677t {

        /* renamed from: f */
        public static final e f12299f = new e();

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

    /* renamed from: com.zykj.view.board.board.t$f */
    public static final class f extends AbstractC7677t {

        /* renamed from: f */
        public static final f f12300f = new f();

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

    public /* synthetic */ AbstractC7677t(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z9, z10, z11, z12, z13);
    }

    /* renamed from: a */
    public final boolean m11446a() {
        return this.f12294e;
    }

    /* renamed from: b */
    public final boolean m11447b() {
        return this.f12292c;
    }

    /* renamed from: c */
    public final boolean m11448c() {
        return this.f12293d;
    }

    /* renamed from: d */
    public final boolean m11449d() {
        return this.f12291b;
    }

    /* renamed from: e */
    public final boolean m11450e() {
        return this.f12290a;
    }

    public AbstractC7677t(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f12290a = z9;
        this.f12291b = z10;
        this.f12292c = z11;
        this.f12293d = z12;
        this.f12294e = z13;
    }

    public /* synthetic */ AbstractC7677t(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? false : z9, (i9 & 2) != 0 ? false : z10, (i9 & 4) != 0 ? false : z11, (i9 & 8) != 0 ? false : z12, (i9 & 16) != 0 ? false : z13, null);
    }
}

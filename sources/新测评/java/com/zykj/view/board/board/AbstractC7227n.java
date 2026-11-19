package com.zykj.view.board.board;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.board.n */
/* loaded from: classes5.dex */
public abstract class AbstractC7227n {

    /* renamed from: a */
    public final boolean f11063a;

    /* renamed from: b */
    public final boolean f11064b;

    /* renamed from: c */
    public final boolean f11065c;

    /* renamed from: d */
    public final boolean f11066d;

    /* renamed from: com.zykj.view.board.board.n$a */
    public static final class a extends AbstractC7227n {

        /* renamed from: e */
        public static final a f11067e = new a();

        public a() {
            super(false, false, true, false, 11, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 331843481;
        }

        public String toString() {
            return "Eraser";
        }
    }

    /* renamed from: com.zykj.view.board.board.n$b */
    public static final class b extends AbstractC7227n {

        /* renamed from: e */
        public static final b f11068e = new b();

        public b() {
            super(false, false, false, true, 7, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 289646241;
        }

        public String toString() {
            return "Graph";
        }
    }

    /* renamed from: com.zykj.view.board.board.n$c */
    public static final class c extends AbstractC7227n {

        /* renamed from: e */
        public static final c f11069e = new c();

        public c() {
            super(false, true, false, false, 13, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 527683372;
        }

        public String toString() {
            return "Pen";
        }
    }

    /* renamed from: com.zykj.view.board.board.n$d */
    public static final class d extends AbstractC7227n {

        /* renamed from: e */
        public static final d f11070e = new d();

        public d() {
            super(true, false, false, false, 14, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 720960009;
        }

        public String toString() {
            return "Select";
        }
    }

    public /* synthetic */ AbstractC7227n(boolean z9, boolean z10, boolean z11, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
        this(z9, z10, z11, z12);
    }

    /* renamed from: a */
    public final boolean m11012a() {
        return this.f11065c;
    }

    /* renamed from: b */
    public final boolean m11013b() {
        return this.f11066d;
    }

    /* renamed from: c */
    public final boolean m11014c() {
        return this.f11064b;
    }

    /* renamed from: d */
    public final boolean m11015d() {
        return this.f11063a;
    }

    public AbstractC7227n(boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f11063a = z9;
        this.f11064b = z10;
        this.f11065c = z11;
        this.f11066d = z12;
    }

    public /* synthetic */ AbstractC7227n(boolean z9, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z9, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, null);
    }
}

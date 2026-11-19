package com.zykj.view.board.board;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.board.s */
/* loaded from: classes5.dex */
public abstract class AbstractC7676s {

    /* renamed from: a */
    public final boolean f12282a;

    /* renamed from: b */
    public final boolean f12283b;

    /* renamed from: c */
    public final boolean f12284c;

    /* renamed from: d */
    public final boolean f12285d;

    /* renamed from: com.zykj.view.board.board.s$a */
    public static final class a extends AbstractC7676s {

        /* renamed from: e */
        public static final a f12286e = new a();

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

    /* renamed from: com.zykj.view.board.board.s$b */
    public static final class b extends AbstractC7676s {

        /* renamed from: e */
        public static final b f12287e = new b();

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

    /* renamed from: com.zykj.view.board.board.s$c */
    public static final class c extends AbstractC7676s {

        /* renamed from: e */
        public static final c f12288e = new c();

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

    /* renamed from: com.zykj.view.board.board.s$d */
    public static final class d extends AbstractC7676s {

        /* renamed from: e */
        public static final d f12289e = new d();

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

    public /* synthetic */ AbstractC7676s(boolean z9, boolean z10, boolean z11, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
        this(z9, z10, z11, z12);
    }

    /* renamed from: a */
    public final boolean m11442a() {
        return this.f12284c;
    }

    /* renamed from: b */
    public final boolean m11443b() {
        return this.f12285d;
    }

    /* renamed from: c */
    public final boolean m11444c() {
        return this.f12283b;
    }

    /* renamed from: d */
    public final boolean m11445d() {
        return this.f12282a;
    }

    public AbstractC7676s(boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f12282a = z9;
        this.f12283b = z10;
        this.f12284c = z11;
        this.f12285d = z12;
    }

    public /* synthetic */ AbstractC7676s(boolean z9, boolean z10, boolean z11, boolean z12, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? false : z9, (i9 & 2) != 0 ? false : z10, (i9 & 4) != 0 ? false : z11, (i9 & 8) != 0 ? false : z12, null);
    }
}

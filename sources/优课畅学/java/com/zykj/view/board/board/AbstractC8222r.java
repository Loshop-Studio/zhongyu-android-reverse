package com.zykj.view.board.board;

import kotlin.jvm.internal.AbstractC9126n;

/* renamed from: com.zykj.view.board.board.r */
/* loaded from: classes5.dex */
public abstract class AbstractC8222r {

    /* renamed from: a */
    public final boolean f15079a;

    /* renamed from: b */
    public final boolean f15080b;

    /* renamed from: c */
    public final boolean f15081c;

    /* renamed from: d */
    public final boolean f15082d;

    /* renamed from: com.zykj.view.board.board.r$a */
    public static final class a extends AbstractC8222r {

        /* renamed from: e */
        public static final a f15083e = new a();

        public a() {
            super(false, false, false, true, 7, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.r$b */
    public static final class b extends AbstractC8222r {

        /* renamed from: e */
        public static final b f15084e = new b();

        public b() {
            super(false, true, false, false, 13, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.r$c */
    public static final class c extends AbstractC8222r {

        /* renamed from: e */
        public static final c f15085e = new c();

        public c() {
            super(false, false, true, false, 11, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.r$d */
    public static final class d extends AbstractC8222r {

        /* renamed from: e */
        public static final d f15086e = new d();

        public d() {
            super(false, false, false, false, 15, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.r$e */
    public static final class e extends AbstractC8222r {

        /* renamed from: e */
        public static final e f15087e = new e();

        public e() {
            super(true, false, false, false, 14, null);
        }
    }

    public /* synthetic */ AbstractC8222r(boolean z10, boolean z11, boolean z12, boolean z13, AbstractC9126n abstractC9126n) {
        this(z10, z11, z12, z13);
    }

    /* renamed from: a */
    public final boolean m12895a() {
        return this.f15082d;
    }

    /* renamed from: b */
    public final boolean m12896b() {
        return this.f15080b;
    }

    /* renamed from: c */
    public final boolean m12897c() {
        return this.f15081c;
    }

    /* renamed from: d */
    public final boolean m12898d() {
        return this.f15079a;
    }

    public AbstractC8222r(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f15079a = z10;
        this.f15080b = z11;
        this.f15081c = z12;
        this.f15082d = z13;
    }

    public /* synthetic */ AbstractC8222r(boolean z10, boolean z11, boolean z12, boolean z13, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, null);
    }
}

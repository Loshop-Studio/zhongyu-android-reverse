package com.zykj.view.board.board;

import kotlin.jvm.internal.AbstractC9972n;

/* renamed from: com.zykj.view.board.board.r */
/* loaded from: classes6.dex */
public abstract class AbstractC8856r {

    /* renamed from: a */
    public final boolean f20295a;

    /* renamed from: b */
    public final boolean f20296b;

    /* renamed from: c */
    public final boolean f20297c;

    /* renamed from: d */
    public final boolean f20298d;

    /* renamed from: com.zykj.view.board.board.r$a */
    public static final class a extends AbstractC8856r {

        /* renamed from: e */
        public static final a f20299e = new a();

        public a() {
            super(false, false, false, true, 7, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.r$b */
    public static final class b extends AbstractC8856r {

        /* renamed from: e */
        public static final b f20300e = new b();

        public b() {
            super(false, true, false, false, 13, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.r$c */
    public static final class c extends AbstractC8856r {

        /* renamed from: e */
        public static final c f20301e = new c();

        public c() {
            super(false, false, true, false, 11, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.r$d */
    public static final class d extends AbstractC8856r {

        /* renamed from: e */
        public static final d f20302e = new d();

        public d() {
            super(false, false, false, false, 15, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.r$e */
    public static final class e extends AbstractC8856r {

        /* renamed from: e */
        public static final e f20303e = new e();

        public e() {
            super(true, false, false, false, 14, null);
        }
    }

    public /* synthetic */ AbstractC8856r(boolean z10, boolean z11, boolean z12, boolean z13, AbstractC9972n abstractC9972n) {
        this(z10, z11, z12, z13);
    }

    /* renamed from: a */
    public final boolean m17011a() {
        return this.f20298d;
    }

    /* renamed from: b */
    public final boolean m17012b() {
        return this.f20296b;
    }

    /* renamed from: c */
    public final boolean m17013c() {
        return this.f20297c;
    }

    /* renamed from: d */
    public final boolean m17014d() {
        return this.f20295a;
    }

    public AbstractC8856r(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f20295a = z10;
        this.f20296b = z11;
        this.f20297c = z12;
        this.f20298d = z13;
    }

    public /* synthetic */ AbstractC8856r(boolean z10, boolean z11, boolean z12, boolean z13, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, null);
    }
}

package com.zykj.view.board.board;

import kotlin.jvm.internal.AbstractC9126n;

/* renamed from: com.zykj.view.board.board.q */
/* loaded from: classes5.dex */
public abstract class AbstractC8221q {

    /* renamed from: a */
    public final boolean f15071a;

    /* renamed from: b */
    public final boolean f15072b;

    /* renamed from: c */
    public final boolean f15073c;

    /* renamed from: d */
    public final boolean f15074d;

    /* renamed from: com.zykj.view.board.board.q$a */
    public static final class a extends AbstractC8221q {

        /* renamed from: e */
        public static final a f15075e = new a();

        public a() {
            super(false, false, true, false, 11, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.q$b */
    public static final class b extends AbstractC8221q {

        /* renamed from: e */
        public static final b f15076e = new b();

        public b() {
            super(false, false, false, true, 7, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.q$c */
    public static final class c extends AbstractC8221q {

        /* renamed from: e */
        public static final c f15077e = new c();

        public c() {
            super(false, true, false, false, 13, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.q$d */
    public static final class d extends AbstractC8221q {

        /* renamed from: e */
        public static final d f15078e = new d();

        public d() {
            super(true, false, false, false, 14, null);
        }
    }

    public /* synthetic */ AbstractC8221q(boolean z10, boolean z11, boolean z12, boolean z13, AbstractC9126n abstractC9126n) {
        this(z10, z11, z12, z13);
    }

    /* renamed from: a */
    public final boolean m12891a() {
        return this.f15073c;
    }

    /* renamed from: b */
    public final boolean m12892b() {
        return this.f15074d;
    }

    /* renamed from: c */
    public final boolean m12893c() {
        return this.f15072b;
    }

    /* renamed from: d */
    public final boolean m12894d() {
        return this.f15071a;
    }

    public AbstractC8221q(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f15071a = z10;
        this.f15072b = z11;
        this.f15073c = z12;
        this.f15074d = z13;
    }

    public /* synthetic */ AbstractC8221q(boolean z10, boolean z11, boolean z12, boolean z13, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, null);
    }
}

package com.zykj.view.board.board;

import kotlin.jvm.internal.AbstractC9972n;

/* renamed from: com.zykj.view.board.board.q */
/* loaded from: classes6.dex */
public abstract class AbstractC8855q {

    /* renamed from: a */
    public final boolean f20287a;

    /* renamed from: b */
    public final boolean f20288b;

    /* renamed from: c */
    public final boolean f20289c;

    /* renamed from: d */
    public final boolean f20290d;

    /* renamed from: com.zykj.view.board.board.q$a */
    public static final class a extends AbstractC8855q {

        /* renamed from: e */
        public static final a f20291e = new a();

        public a() {
            super(false, false, true, false, 11, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.q$b */
    public static final class b extends AbstractC8855q {

        /* renamed from: e */
        public static final b f20292e = new b();

        public b() {
            super(false, false, false, true, 7, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.q$c */
    public static final class c extends AbstractC8855q {

        /* renamed from: e */
        public static final c f20293e = new c();

        public c() {
            super(false, true, false, false, 13, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.q$d */
    public static final class d extends AbstractC8855q {

        /* renamed from: e */
        public static final d f20294e = new d();

        public d() {
            super(true, false, false, false, 14, null);
        }
    }

    public /* synthetic */ AbstractC8855q(boolean z10, boolean z11, boolean z12, boolean z13, AbstractC9972n abstractC9972n) {
        this(z10, z11, z12, z13);
    }

    /* renamed from: a */
    public final boolean m17007a() {
        return this.f20289c;
    }

    /* renamed from: b */
    public final boolean m17008b() {
        return this.f20290d;
    }

    /* renamed from: c */
    public final boolean m17009c() {
        return this.f20288b;
    }

    /* renamed from: d */
    public final boolean m17010d() {
        return this.f20287a;
    }

    public AbstractC8855q(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f20287a = z10;
        this.f20288b = z11;
        this.f20289c = z12;
        this.f20290d = z13;
    }

    public /* synthetic */ AbstractC8855q(boolean z10, boolean z11, boolean z12, boolean z13, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, null);
    }
}

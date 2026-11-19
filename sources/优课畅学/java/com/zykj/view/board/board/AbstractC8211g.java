package com.zykj.view.board.board;

import kotlin.jvm.internal.AbstractC9126n;

/* renamed from: com.zykj.view.board.board.g */
/* loaded from: classes5.dex */
public abstract class AbstractC8211g {

    /* renamed from: a */
    public final boolean f15024a;

    /* renamed from: b */
    public final boolean f15025b;

    /* renamed from: com.zykj.view.board.board.g$a */
    public static final class a extends AbstractC8211g {

        /* renamed from: c */
        public static final a f15026c = new a();

        public a() {
            super(false, true, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.g$b */
    public static final class b extends AbstractC8211g {

        /* renamed from: c */
        public static final b f15027c = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            boolean z10 = false;
            super(z10, z10, 3, null);
        }
    }

    public /* synthetic */ AbstractC8211g(boolean z10, boolean z11, AbstractC9126n abstractC9126n) {
        this(z10, z11);
    }

    /* renamed from: a */
    public final boolean m12847a() {
        return this.f15024a;
    }

    /* renamed from: b */
    public final boolean m12848b() {
        return this.f15025b;
    }

    public AbstractC8211g(boolean z10, boolean z11) {
        this.f15024a = z10;
        this.f15025b = z11;
    }

    public /* synthetic */ AbstractC8211g(boolean z10, boolean z11, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, null);
    }
}

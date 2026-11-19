package com.zykj.view.board.board;

import kotlin.jvm.internal.AbstractC9972n;

/* renamed from: com.zykj.view.board.board.g */
/* loaded from: classes6.dex */
public abstract class AbstractC8845g {

    /* renamed from: a */
    public final boolean f20241a;

    /* renamed from: b */
    public final boolean f20242b;

    /* renamed from: com.zykj.view.board.board.g$a */
    public static final class a extends AbstractC8845g {

        /* renamed from: c */
        public static final a f20243c = new a();

        /* JADX WARN: Illegal instructions before constructor call */
        public a() {
            boolean z10 = false;
            super(z10, z10, 3, null);
        }
    }

    public /* synthetic */ AbstractC8845g(boolean z10, boolean z11, AbstractC9972n abstractC9972n) {
        this(z10, z11);
    }

    /* renamed from: a */
    public final boolean m16963a() {
        return this.f20241a;
    }

    /* renamed from: b */
    public final boolean m16964b() {
        return this.f20242b;
    }

    public AbstractC8845g(boolean z10, boolean z11) {
        this.f20241a = z10;
        this.f20242b = z11;
    }

    public /* synthetic */ AbstractC8845g(boolean z10, boolean z11, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, null);
    }
}

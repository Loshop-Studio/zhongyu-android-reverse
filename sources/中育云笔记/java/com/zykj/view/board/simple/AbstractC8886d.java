package com.zykj.view.board.simple;

import kotlin.jvm.internal.AbstractC9972n;

/* renamed from: com.zykj.view.board.simple.d */
/* loaded from: classes6.dex */
public abstract class AbstractC8886d {

    /* renamed from: a */
    public final int f20502a;

    /* renamed from: b */
    public final int f20503b;

    /* renamed from: c */
    public final boolean f20504c;

    /* renamed from: com.zykj.view.board.simple.d$a */
    public static final class a extends AbstractC8886d {

        /* renamed from: d */
        public static final a f20505d = new a();

        public a() {
            super(0, 0, false, 4, null);
        }
    }

    /* renamed from: com.zykj.view.board.simple.d$b */
    public static final class b extends AbstractC8886d {

        /* renamed from: d */
        public static final b f20506d = new b();

        public b() {
            super(2, 1, 1 == true ? 1 : 0, null);
        }
    }

    /* renamed from: com.zykj.view.board.simple.d$c */
    public static final class c extends AbstractC8886d {

        /* renamed from: d */
        public static final c f20507d = new c();

        public c() {
            super(1, 1, false, 4, null);
        }
    }

    public /* synthetic */ AbstractC8886d(int i10, int i11, boolean z10, AbstractC9972n abstractC9972n) {
        this(i10, i11, z10);
    }

    /* renamed from: a */
    public final int m17317a() {
        return this.f20503b;
    }

    /* renamed from: b */
    public final int m17318b() {
        return this.f20502a;
    }

    /* renamed from: c */
    public final boolean m17319c() {
        return this.f20504c;
    }

    public AbstractC8886d(int i10, int i11, boolean z10) {
        this.f20502a = i10;
        this.f20503b = i11;
        this.f20504c = z10;
    }

    public /* synthetic */ AbstractC8886d(int i10, int i11, boolean z10, int i12, AbstractC9972n abstractC9972n) {
        this(i10, i11, (i12 & 4) != 0 ? false : z10, null);
    }
}

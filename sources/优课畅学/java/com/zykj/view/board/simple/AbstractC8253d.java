package com.zykj.view.board.simple;

import kotlin.jvm.internal.AbstractC9126n;

/* renamed from: com.zykj.view.board.simple.d */
/* loaded from: classes5.dex */
public abstract class AbstractC8253d {

    /* renamed from: a */
    public final int f15291a;

    /* renamed from: b */
    public final int f15292b;

    /* renamed from: c */
    public final boolean f15293c;

    /* renamed from: com.zykj.view.board.simple.d$a */
    public static final class a extends AbstractC8253d {

        /* renamed from: d */
        public static final a f15294d = new a();

        public a() {
            super(0, 0, false, 4, null);
        }
    }

    /* renamed from: com.zykj.view.board.simple.d$b */
    public static final class b extends AbstractC8253d {

        /* renamed from: d */
        public static final b f15295d = new b();

        public b() {
            super(2, 1, 1 == true ? 1 : 0, null);
        }
    }

    /* renamed from: com.zykj.view.board.simple.d$c */
    public static final class c extends AbstractC8253d {

        /* renamed from: d */
        public static final c f15296d = new c();

        public c() {
            super(1, 1, false, 4, null);
        }
    }

    public /* synthetic */ AbstractC8253d(int i10, int i11, boolean z10, AbstractC9126n abstractC9126n) {
        this(i10, i11, z10);
    }

    /* renamed from: a */
    public final int m13245a() {
        return this.f15292b;
    }

    /* renamed from: b */
    public final int m13246b() {
        return this.f15291a;
    }

    /* renamed from: c */
    public final boolean m13247c() {
        return this.f15293c;
    }

    public AbstractC8253d(int i10, int i11, boolean z10) {
        this.f15291a = i10;
        this.f15292b = i11;
        this.f15293c = z10;
    }

    public /* synthetic */ AbstractC8253d(int i10, int i11, boolean z10, int i12, AbstractC9126n abstractC9126n) {
        this(i10, i11, (i12 & 4) != 0 ? false : z10, null);
    }
}

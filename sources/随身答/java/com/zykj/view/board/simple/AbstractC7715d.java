package com.zykj.view.board.simple;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.simple.d */
/* loaded from: classes5.dex */
public abstract class AbstractC7715d {

    /* renamed from: a */
    public final int f12530a;

    /* renamed from: b */
    public final int f12531b;

    /* renamed from: c */
    public final boolean f12532c;

    /* renamed from: com.zykj.view.board.simple.d$a */
    public static final class a extends AbstractC7715d {

        /* renamed from: d */
        public static final a f12533d = new a();

        public a() {
            super(0, 0, false, 4, null);
        }
    }

    /* renamed from: com.zykj.view.board.simple.d$b */
    public static final class b extends AbstractC7715d {

        /* renamed from: d */
        public static final b f12534d = new b();

        public b() {
            super(2, 1, 1 == true ? 1 : 0, null);
        }
    }

    /* renamed from: com.zykj.view.board.simple.d$c */
    public static final class c extends AbstractC7715d {

        /* renamed from: d */
        public static final c f12535d = new c();

        public c() {
            super(1, 1, false, 4, null);
        }
    }

    public /* synthetic */ AbstractC7715d(int i9, int i10, boolean z9, DefaultConstructorMarker defaultConstructorMarker) {
        this(i9, i10, z9);
    }

    /* renamed from: a */
    public final int m11862a() {
        return this.f12531b;
    }

    /* renamed from: b */
    public final int m11863b() {
        return this.f12530a;
    }

    /* renamed from: c */
    public final boolean m11864c() {
        return this.f12532c;
    }

    public AbstractC7715d(int i9, int i10, boolean z9) {
        this.f12530a = i9;
        this.f12531b = i10;
        this.f12532c = z9;
    }

    public /* synthetic */ AbstractC7715d(int i9, int i10, boolean z9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i9, i10, (i11 & 4) != 0 ? false : z9, null);
    }
}

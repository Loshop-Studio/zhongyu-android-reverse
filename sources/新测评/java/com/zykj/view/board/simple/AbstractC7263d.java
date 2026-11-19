package com.zykj.view.board.simple;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.simple.d */
/* loaded from: classes5.dex */
public abstract class AbstractC7263d {

    /* renamed from: a */
    public final int f11293a;

    /* renamed from: b */
    public final int f11294b;

    /* renamed from: c */
    public final boolean f11295c;

    /* renamed from: com.zykj.view.board.simple.d$a */
    public static final class a extends AbstractC7263d {

        /* renamed from: d */
        public static final a f11296d = new a();

        public a() {
            super(0, 0, false, 4, null);
        }
    }

    /* renamed from: com.zykj.view.board.simple.d$b */
    public static final class b extends AbstractC7263d {

        /* renamed from: d */
        public static final b f11297d = new b();

        public b() {
            super(2, 1, 1 == true ? 1 : 0, null);
        }
    }

    /* renamed from: com.zykj.view.board.simple.d$c */
    public static final class c extends AbstractC7263d {

        /* renamed from: d */
        public static final c f11298d = new c();

        public c() {
            super(1, 1, false, 4, null);
        }
    }

    public /* synthetic */ AbstractC7263d(int i10, int i11, boolean z9, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, z9);
    }

    /* renamed from: a */
    public final int m11373a() {
        return this.f11294b;
    }

    /* renamed from: b */
    public final int m11374b() {
        return this.f11293a;
    }

    /* renamed from: c */
    public final boolean m11375c() {
        return this.f11295c;
    }

    public AbstractC7263d(int i10, int i11, boolean z9) {
        this.f11293a = i10;
        this.f11294b = i11;
        this.f11295c = z9;
    }

    public /* synthetic */ AbstractC7263d(int i10, int i11, boolean z9, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, (i12 & 4) != 0 ? false : z9, null);
    }
}

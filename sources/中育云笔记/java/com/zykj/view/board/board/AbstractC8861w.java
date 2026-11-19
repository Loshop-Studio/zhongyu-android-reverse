package com.zykj.view.board.board;

import com.zykj.view.R$drawable;
import kotlin.jvm.internal.AbstractC9972n;

/* renamed from: com.zykj.view.board.board.w */
/* loaded from: classes6.dex */
public abstract class AbstractC8861w {

    /* renamed from: a */
    public final int f20332a;

    /* renamed from: b */
    public final boolean f20333b;

    /* renamed from: c */
    public final boolean f20334c;

    /* renamed from: d */
    public final boolean f20335d;

    /* renamed from: e */
    public final boolean f20336e;

    /* renamed from: com.zykj.view.board.board.w$a */
    public static final class a extends AbstractC8861w {

        /* renamed from: f */
        public static final a f20337f = new a();

        public a() {
            super(R$drawable.view_icon_record_resume2, true, true, false, false, 24, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.w$b */
    public static final class b extends AbstractC8861w {

        /* renamed from: f */
        public static final b f20338f = new b();

        public b() {
            super(R$drawable.view_icon_record_resume, false, true, false, false, 24, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.w$c */
    public static final class c extends AbstractC8861w {

        /* renamed from: f */
        public static final c f20339f = new c();

        public c() {
            super(R$drawable.view_icon_record_stop, true, false, false, false, 24, null);
        }
    }

    public /* synthetic */ AbstractC8861w(int i10, boolean z10, boolean z11, boolean z12, boolean z13, AbstractC9972n abstractC9972n) {
        this(i10, z10, z11, z12, z13);
    }

    /* renamed from: a */
    public final int m17034a() {
        return this.f20332a;
    }

    /* renamed from: b */
    public final boolean m17035b() {
        return this.f20335d;
    }

    /* renamed from: c */
    public final boolean m17036c() {
        return this.f20334c;
    }

    /* renamed from: d */
    public final boolean m17037d() {
        return this.f20336e;
    }

    public AbstractC8861w(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f20332a = i10;
        this.f20333b = z10;
        this.f20334c = z11;
        this.f20335d = z12;
        this.f20336e = z13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AbstractC8861w(int i10, boolean z10, boolean z11, boolean z12, boolean z13, int i11, AbstractC9972n abstractC9972n) {
        boolean z14 = (i11 & 8) != 0 ? z10 && z11 : z12;
        this(i10, z10, z11, z14, (i11 & 16) != 0 ? z10 || z14 : z13, null);
    }
}

package com.zykj.view.board.board;

import com.zykj.view.R$drawable;
import kotlin.jvm.internal.AbstractC9126n;

/* renamed from: com.zykj.view.board.board.w */
/* loaded from: classes5.dex */
public abstract class AbstractC8227w {

    /* renamed from: a */
    public final int f15116a;

    /* renamed from: b */
    public final boolean f15117b;

    /* renamed from: c */
    public final boolean f15118c;

    /* renamed from: d */
    public final boolean f15119d;

    /* renamed from: e */
    public final boolean f15120e;

    /* renamed from: com.zykj.view.board.board.w$a */
    public static final class a extends AbstractC8227w {

        /* renamed from: f */
        public static final a f15121f = new a();

        public a() {
            super(R$drawable.view_icon_record_resume2, true, true, false, false, 24, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.w$b */
    public static final class b extends AbstractC8227w {

        /* renamed from: f */
        public static final b f15122f = new b();

        public b() {
            super(R$drawable.view_icon_record_resume, false, true, false, false, 24, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.w$c */
    public static final class c extends AbstractC8227w {

        /* renamed from: f */
        public static final c f15123f = new c();

        public c() {
            super(R$drawable.view_icon_record_stop, true, false, false, false, 24, null);
        }
    }

    public /* synthetic */ AbstractC8227w(int i10, boolean z10, boolean z11, boolean z12, boolean z13, AbstractC9126n abstractC9126n) {
        this(i10, z10, z11, z12, z13);
    }

    /* renamed from: a */
    public final int m12918a() {
        return this.f15116a;
    }

    /* renamed from: b */
    public final boolean m12919b() {
        return this.f15119d;
    }

    /* renamed from: c */
    public final boolean m12920c() {
        return this.f15118c;
    }

    /* renamed from: d */
    public final boolean m12921d() {
        return this.f15120e;
    }

    public AbstractC8227w(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f15116a = i10;
        this.f15117b = z10;
        this.f15118c = z11;
        this.f15119d = z12;
        this.f15120e = z13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AbstractC8227w(int i10, boolean z10, boolean z11, boolean z12, boolean z13, int i11, AbstractC9126n abstractC9126n) {
        boolean z14 = (i11 & 8) != 0 ? z10 && z11 : z12;
        this(i10, z10, z11, z14, (i11 & 16) != 0 ? z10 || z14 : z13, null);
    }
}

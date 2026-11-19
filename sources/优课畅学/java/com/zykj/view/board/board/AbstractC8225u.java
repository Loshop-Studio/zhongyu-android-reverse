package com.zykj.view.board.board;

import com.zykj.board.EzyModeEnum;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import p134i7.AbstractC8809v;

/* renamed from: com.zykj.view.board.board.u */
/* loaded from: classes5.dex */
public abstract class AbstractC8225u {

    /* renamed from: a */
    public final int f15103a;

    /* renamed from: b */
    public final EzyModeEnum.ModeEnum f15104b;

    /* renamed from: c */
    public final boolean f15105c;

    /* renamed from: d */
    public final List f15106d;

    /* renamed from: e */
    public final float f15107e;

    /* renamed from: com.zykj.view.board.board.u$a */
    public static final class a extends AbstractC8225u {

        /* renamed from: f */
        public static final a f15108f = new a();

        public a() {
            super(4, EzyModeEnum.ModeEnum.ACTION_CURSOR, false, null, 0.0f, 28, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.u$b */
    public static final class b extends AbstractC8225u {

        /* renamed from: f */
        public static final b f15109f = new b();

        public b() {
            super(0, EzyModeEnum.ModeEnum.ACTION_WRITING, false, null, 0.0f, 28, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.u$c */
    public static final class c extends AbstractC8225u {

        /* renamed from: f */
        public static final c f15110f = new c();

        public c() {
            super(2, EzyModeEnum.ModeEnum.ACTION_WRITING_BEELINE, true, null, 0.0f, 24, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.u$d */
    public static final class d extends AbstractC8225u {

        /* renamed from: f */
        public static final d f15111f = new d();

        public d() {
            super(3, EzyModeEnum.ModeEnum.ACTION_WRITING, false, AbstractC8809v.m14774q(Float.valueOf(28.0f), Float.valueOf(36.0f), Float.valueOf(56.0f)), 0.5f, 4, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.u$e */
    public static final class e extends AbstractC8225u {

        /* renamed from: f */
        public static final e f15112f = new e();

        public e() {
            super(1, EzyModeEnum.ModeEnum.ACTION_WRITING_BEELINE, false, null, 0.0f, 28, null);
        }
    }

    public /* synthetic */ AbstractC8225u(int i10, EzyModeEnum.ModeEnum modeEnum, boolean z10, List list, float f10, AbstractC9126n abstractC9126n) {
        this(i10, modeEnum, z10, list, f10);
    }

    /* renamed from: a */
    public final EzyModeEnum.ModeEnum m12908a() {
        return this.f15104b;
    }

    /* renamed from: b */
    public final int m12909b() {
        return this.f15103a;
    }

    /* renamed from: c */
    public final float m12910c() {
        return this.f15107e;
    }

    /* renamed from: d */
    public final List m12911d() {
        return this.f15106d;
    }

    /* renamed from: e */
    public final boolean m12912e() {
        return this.f15105c;
    }

    public AbstractC8225u(int i10, EzyModeEnum.ModeEnum modeEnum, boolean z10, List list, float f10) {
        this.f15103a = i10;
        this.f15104b = modeEnum;
        this.f15105c = z10;
        this.f15106d = list;
        this.f15107e = f10;
    }

    public /* synthetic */ AbstractC8225u(int i10, EzyModeEnum.ModeEnum modeEnum, boolean z10, List list, float f10, int i11, AbstractC9126n abstractC9126n) {
        this(i10, modeEnum, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? AbstractC8809v.m14774q(Float.valueOf(3.0f), Float.valueOf(8.0f), Float.valueOf(15.0f)) : list, (i11 & 16) != 0 ? 1.0f : f10, null);
    }
}

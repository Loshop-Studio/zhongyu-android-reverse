package com.zykj.view.board.board;

import com.zykj.board.EzyModeEnum;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import p325rc.AbstractC10978w;

/* renamed from: com.zykj.view.board.board.u */
/* loaded from: classes6.dex */
public abstract class AbstractC8859u {

    /* renamed from: a */
    public final int f20319a;

    /* renamed from: b */
    public final EzyModeEnum.ModeEnum f20320b;

    /* renamed from: c */
    public final boolean f20321c;

    /* renamed from: d */
    public final List f20322d;

    /* renamed from: e */
    public final float f20323e;

    /* renamed from: com.zykj.view.board.board.u$a */
    public static final class a extends AbstractC8859u {

        /* renamed from: f */
        public static final a f20324f = new a();

        public a() {
            super(4, EzyModeEnum.ModeEnum.ACTION_CURSOR, false, null, 0.0f, 28, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.u$b */
    public static final class b extends AbstractC8859u {

        /* renamed from: f */
        public static final b f20325f = new b();

        public b() {
            super(0, EzyModeEnum.ModeEnum.ACTION_WRITING, false, null, 0.0f, 28, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.u$c */
    public static final class c extends AbstractC8859u {

        /* renamed from: f */
        public static final c f20326f = new c();

        public c() {
            super(2, EzyModeEnum.ModeEnum.ACTION_WRITING_BEELINE, true, null, 0.0f, 24, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.u$d */
    public static final class d extends AbstractC8859u {

        /* renamed from: f */
        public static final d f20327f = new d();

        public d() {
            super(3, EzyModeEnum.ModeEnum.ACTION_WRITING, false, AbstractC10978w.m24139q(Float.valueOf(28.0f), Float.valueOf(36.0f), Float.valueOf(56.0f)), 0.5f, 4, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.u$e */
    public static final class e extends AbstractC8859u {

        /* renamed from: f */
        public static final e f20328f = new e();

        public e() {
            super(1, EzyModeEnum.ModeEnum.ACTION_WRITING_BEELINE, false, null, 0.0f, 28, null);
        }
    }

    public /* synthetic */ AbstractC8859u(int i10, EzyModeEnum.ModeEnum modeEnum, boolean z10, List list, float f10, AbstractC9972n abstractC9972n) {
        this(i10, modeEnum, z10, list, f10);
    }

    /* renamed from: a */
    public final EzyModeEnum.ModeEnum m17024a() {
        return this.f20320b;
    }

    /* renamed from: b */
    public final int m17025b() {
        return this.f20319a;
    }

    /* renamed from: c */
    public final float m17026c() {
        return this.f20323e;
    }

    /* renamed from: d */
    public final List m17027d() {
        return this.f20322d;
    }

    /* renamed from: e */
    public final boolean m17028e() {
        return this.f20321c;
    }

    public AbstractC8859u(int i10, EzyModeEnum.ModeEnum modeEnum, boolean z10, List list, float f10) {
        this.f20319a = i10;
        this.f20320b = modeEnum;
        this.f20321c = z10;
        this.f20322d = list;
        this.f20323e = f10;
    }

    public /* synthetic */ AbstractC8859u(int i10, EzyModeEnum.ModeEnum modeEnum, boolean z10, List list, float f10, int i11, AbstractC9972n abstractC9972n) {
        this(i10, modeEnum, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? AbstractC10978w.m24139q(Float.valueOf(3.0f), Float.valueOf(8.0f), Float.valueOf(15.0f)) : list, (i11 & 16) != 0 ? 1.0f : f10, null);
    }
}

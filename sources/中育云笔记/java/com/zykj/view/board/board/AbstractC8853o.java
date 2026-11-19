package com.zykj.view.board.board;

import com.zykj.blackboard.core.action.GeometryActionEnum;
import kotlin.jvm.internal.AbstractC9972n;

/* renamed from: com.zykj.view.board.board.o */
/* loaded from: classes6.dex */
public abstract class AbstractC8853o {

    /* renamed from: a */
    public final boolean f20273a;

    /* renamed from: b */
    public final boolean f20274b;

    /* renamed from: c */
    public final boolean f20275c;

    /* renamed from: d */
    public final GeometryActionEnum f20276d;

    /* renamed from: com.zykj.view.board.board.o$a */
    public static final class a extends AbstractC8853o {

        /* renamed from: e */
        public static final a f20277e = new a();

        public a() {
            super(false, false, false, null, 15, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.o$b */
    public static final class b extends AbstractC8853o {

        /* renamed from: e */
        public static final b f20278e = new b();

        public b() {
            super(false, true, false, GeometryActionEnum.OVAL, 5, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.o$c */
    public static final class c extends AbstractC8853o {

        /* renamed from: e */
        public static final c f20279e = new c();

        public c() {
            super(true, false, false, GeometryActionEnum.RECTANGLE, 6, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.o$d */
    public static final class d extends AbstractC8853o {

        /* renamed from: e */
        public static final d f20280e = new d();

        public d() {
            super(false, false, true, GeometryActionEnum.TRIANGLE, 3, null);
        }
    }

    public /* synthetic */ AbstractC8853o(boolean z10, boolean z11, boolean z12, GeometryActionEnum geometryActionEnum, AbstractC9972n abstractC9972n) {
        this(z10, z11, z12, geometryActionEnum);
    }

    /* renamed from: a */
    public final GeometryActionEnum m16995a() {
        return this.f20276d;
    }

    /* renamed from: b */
    public final boolean m16996b() {
        return this.f20274b;
    }

    /* renamed from: c */
    public final boolean m16997c() {
        return this.f20273a;
    }

    /* renamed from: d */
    public final boolean m16998d() {
        return this.f20275c;
    }

    public AbstractC8853o(boolean z10, boolean z11, boolean z12, GeometryActionEnum geometryActionEnum) {
        this.f20273a = z10;
        this.f20274b = z11;
        this.f20275c = z12;
        this.f20276d = geometryActionEnum;
    }

    public /* synthetic */ AbstractC8853o(boolean z10, boolean z11, boolean z12, GeometryActionEnum geometryActionEnum, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? GeometryActionEnum.RECTANGLE : geometryActionEnum, null);
    }
}

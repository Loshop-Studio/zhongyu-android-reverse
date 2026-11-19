package com.zykj.view.board.board;

import com.zykj.blackboard.core.action.GeometryActionEnum;
import kotlin.jvm.internal.AbstractC9126n;

/* renamed from: com.zykj.view.board.board.o */
/* loaded from: classes5.dex */
public abstract class AbstractC8219o {

    /* renamed from: a */
    public final boolean f15057a;

    /* renamed from: b */
    public final boolean f15058b;

    /* renamed from: c */
    public final boolean f15059c;

    /* renamed from: d */
    public final GeometryActionEnum f15060d;

    /* renamed from: com.zykj.view.board.board.o$a */
    public static final class a extends AbstractC8219o {

        /* renamed from: e */
        public static final a f15061e = new a();

        public a() {
            super(false, false, false, null, 15, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.o$b */
    public static final class b extends AbstractC8219o {

        /* renamed from: e */
        public static final b f15062e = new b();

        public b() {
            super(false, true, false, GeometryActionEnum.OVAL, 5, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.o$c */
    public static final class c extends AbstractC8219o {

        /* renamed from: e */
        public static final c f15063e = new c();

        public c() {
            super(true, false, false, GeometryActionEnum.RECTANGLE, 6, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.o$d */
    public static final class d extends AbstractC8219o {

        /* renamed from: e */
        public static final d f15064e = new d();

        public d() {
            super(false, false, true, GeometryActionEnum.TRIANGLE, 3, null);
        }
    }

    public /* synthetic */ AbstractC8219o(boolean z10, boolean z11, boolean z12, GeometryActionEnum geometryActionEnum, AbstractC9126n abstractC9126n) {
        this(z10, z11, z12, geometryActionEnum);
    }

    /* renamed from: a */
    public final GeometryActionEnum m12879a() {
        return this.f15060d;
    }

    /* renamed from: b */
    public final boolean m12880b() {
        return this.f15058b;
    }

    /* renamed from: c */
    public final boolean m12881c() {
        return this.f15057a;
    }

    /* renamed from: d */
    public final boolean m12882d() {
        return this.f15059c;
    }

    public AbstractC8219o(boolean z10, boolean z11, boolean z12, GeometryActionEnum geometryActionEnum) {
        this.f15057a = z10;
        this.f15058b = z11;
        this.f15059c = z12;
        this.f15060d = geometryActionEnum;
    }

    public /* synthetic */ AbstractC8219o(boolean z10, boolean z11, boolean z12, GeometryActionEnum geometryActionEnum, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? GeometryActionEnum.RECTANGLE : geometryActionEnum, null);
    }
}

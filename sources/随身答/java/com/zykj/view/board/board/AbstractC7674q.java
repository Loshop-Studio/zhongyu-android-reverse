package com.zykj.view.board.board;

import com.zykj.blackboard.core.action.GeometryActionEnum;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.board.q */
/* loaded from: classes5.dex */
public abstract class AbstractC7674q {

    /* renamed from: a */
    public final boolean f12268a;

    /* renamed from: b */
    public final boolean f12269b;

    /* renamed from: c */
    public final boolean f12270c;

    /* renamed from: d */
    public final GeometryActionEnum f12271d;

    /* renamed from: com.zykj.view.board.board.q$a */
    public static final class a extends AbstractC7674q {

        /* renamed from: e */
        public static final a f12272e = new a();

        public a() {
            super(false, false, false, null, 15, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 15832195;
        }

        public String toString() {
            return "Null";
        }
    }

    /* renamed from: com.zykj.view.board.board.q$b */
    public static final class b extends AbstractC7674q {

        /* renamed from: e */
        public static final b f12273e = new b();

        public b() {
            super(false, true, false, GeometryActionEnum.OVAL, 5, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 15862606;
        }

        public String toString() {
            return "Oval";
        }
    }

    /* renamed from: com.zykj.view.board.board.q$c */
    public static final class c extends AbstractC7674q {

        /* renamed from: e */
        public static final c f12274e = new c();

        public c() {
            super(true, false, false, GeometryActionEnum.RECTANGLE, 6, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1687018483;
        }

        public String toString() {
            return "Rectangle";
        }
    }

    /* renamed from: com.zykj.view.board.board.q$d */
    public static final class d extends AbstractC7674q {

        /* renamed from: e */
        public static final d f12275e = new d();

        public d() {
            super(false, false, true, GeometryActionEnum.TRIANGLE, 3, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 407632644;
        }

        public String toString() {
            return "Triangle";
        }
    }

    public /* synthetic */ AbstractC7674q(boolean z9, boolean z10, boolean z11, GeometryActionEnum geometryActionEnum, DefaultConstructorMarker defaultConstructorMarker) {
        this(z9, z10, z11, geometryActionEnum);
    }

    /* renamed from: a */
    public final GeometryActionEnum m11430a() {
        return this.f12271d;
    }

    /* renamed from: b */
    public final boolean m11431b() {
        return this.f12269b;
    }

    /* renamed from: c */
    public final boolean m11432c() {
        return this.f12268a;
    }

    /* renamed from: d */
    public final boolean m11433d() {
        return this.f12270c;
    }

    public AbstractC7674q(boolean z9, boolean z10, boolean z11, GeometryActionEnum geometryActionEnum) {
        this.f12268a = z9;
        this.f12269b = z10;
        this.f12270c = z11;
        this.f12271d = geometryActionEnum;
    }

    public /* synthetic */ AbstractC7674q(boolean z9, boolean z10, boolean z11, GeometryActionEnum geometryActionEnum, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? false : z9, (i9 & 2) != 0 ? false : z10, (i9 & 4) != 0 ? false : z11, (i9 & 8) != 0 ? GeometryActionEnum.RECTANGLE : geometryActionEnum, null);
    }
}

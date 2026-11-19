package com.zykj.view.board.board;

import com.zykj.blackboard.core.action.GeometryActionEnum;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.board.l */
/* loaded from: classes5.dex */
public abstract class AbstractC7225l {

    /* renamed from: a */
    public final boolean f11049a;

    /* renamed from: b */
    public final boolean f11050b;

    /* renamed from: c */
    public final boolean f11051c;

    /* renamed from: d */
    public final GeometryActionEnum f11052d;

    /* renamed from: com.zykj.view.board.board.l$a */
    public static final class a extends AbstractC7225l {

        /* renamed from: e */
        public static final a f11053e = new a();

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

    /* renamed from: com.zykj.view.board.board.l$b */
    public static final class b extends AbstractC7225l {

        /* renamed from: e */
        public static final b f11054e = new b();

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

    /* renamed from: com.zykj.view.board.board.l$c */
    public static final class c extends AbstractC7225l {

        /* renamed from: e */
        public static final c f11055e = new c();

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

    /* renamed from: com.zykj.view.board.board.l$d */
    public static final class d extends AbstractC7225l {

        /* renamed from: e */
        public static final d f11056e = new d();

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

    public /* synthetic */ AbstractC7225l(boolean z9, boolean z10, boolean z11, GeometryActionEnum geometryActionEnum, DefaultConstructorMarker defaultConstructorMarker) {
        this(z9, z10, z11, geometryActionEnum);
    }

    /* renamed from: a */
    public final GeometryActionEnum m11000a() {
        return this.f11052d;
    }

    /* renamed from: b */
    public final boolean m11001b() {
        return this.f11050b;
    }

    /* renamed from: c */
    public final boolean m11002c() {
        return this.f11049a;
    }

    /* renamed from: d */
    public final boolean m11003d() {
        return this.f11051c;
    }

    public AbstractC7225l(boolean z9, boolean z10, boolean z11, GeometryActionEnum geometryActionEnum) {
        this.f11049a = z9;
        this.f11050b = z10;
        this.f11051c = z11;
        this.f11052d = geometryActionEnum;
    }

    public /* synthetic */ AbstractC7225l(boolean z9, boolean z10, boolean z11, GeometryActionEnum geometryActionEnum, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z9, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? GeometryActionEnum.RECTANGLE : geometryActionEnum, null);
    }
}

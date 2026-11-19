package com.zykj.view.board.simple;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.simple.b */
/* loaded from: classes5.dex */
public abstract class AbstractC7261b {

    /* renamed from: com.zykj.view.board.simple.b$a */
    public static final class a extends AbstractC7261b {

        /* renamed from: a */
        public static final a f11280a = new a();

        public a() {
            super(null);
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$b */
    public static final class b extends AbstractC7261b {

        /* renamed from: a */
        public final boolean f11281a;

        public b(boolean z9) {
            super(null);
            this.f11281a = z9;
        }

        /* renamed from: a */
        public final boolean m11364a() {
            return this.f11281a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f11281a == ((b) obj).f11281a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f11281a);
        }

        public String toString() {
            return "ExpandAnimate(isOpen=" + this.f11281a + ")";
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$c */
    public static final class c extends AbstractC7261b {

        /* renamed from: a */
        public final float f11282a;

        public c(float f10) {
            super(null);
            this.f11282a = f10;
        }

        /* renamed from: a */
        public final float m11365a() {
            return this.f11282a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Float.compare(this.f11282a, ((c) obj).f11282a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f11282a);
        }

        public String toString() {
            return "SetEraserSize(eraserSize=" + this.f11282a + ")";
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$d */
    public static final class d extends AbstractC7261b {

        /* renamed from: a */
        public final boolean f11283a;

        public d(boolean z9) {
            super(null);
            this.f11283a = z9;
        }

        /* renamed from: a */
        public final boolean m11366a() {
            return this.f11283a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f11283a == ((d) obj).f11283a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f11283a);
        }

        public String toString() {
            return "SetFingerTouchable(enable=" + this.f11283a + ")";
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$e */
    public static final class e extends AbstractC7261b {

        /* renamed from: a */
        public final int f11284a;

        public e(int i10) {
            super(null);
            this.f11284a = i10;
        }

        /* renamed from: a */
        public final int m11367a() {
            return this.f11284a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f11284a == ((e) obj).f11284a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f11284a);
        }

        public String toString() {
            return "SetPenColor(penColor=" + this.f11284a + ")";
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$f */
    public static final class f extends AbstractC7261b {

        /* renamed from: a */
        public final int f11285a;

        /* renamed from: b */
        public final boolean f11286b;

        public f(int i10, boolean z9) {
            super(null);
            this.f11285a = i10;
            this.f11286b = z9;
        }

        /* renamed from: a */
        public final int m11368a() {
            return this.f11285a;
        }

        /* renamed from: b */
        public final boolean m11369b() {
            return this.f11286b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f11285a == fVar.f11285a && this.f11286b == fVar.f11286b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f11285a) * 31) + Boolean.hashCode(this.f11286b);
        }

        public String toString() {
            return "SetPenMode(actionMode=" + this.f11285a + ", isPenDashed=" + this.f11286b + ")";
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$g */
    public static final class g extends AbstractC7261b {

        /* renamed from: a */
        public final float f11287a;

        public g(float f10) {
            super(null);
            this.f11287a = f10;
        }

        /* renamed from: a */
        public final float m11370a() {
            return this.f11287a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Float.compare(this.f11287a, ((g) obj).f11287a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f11287a);
        }

        public String toString() {
            return "SetPenSize(penSize=" + this.f11287a + ")";
        }
    }

    public /* synthetic */ AbstractC7261b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC7261b() {
    }
}

package com.zykj.view.board.simple;

import kotlin.jvm.internal.AbstractC9126n;

/* renamed from: com.zykj.view.board.simple.b */
/* loaded from: classes5.dex */
public abstract class AbstractC8251b {

    /* renamed from: com.zykj.view.board.simple.b$a */
    public static final class a extends AbstractC8251b {

        /* renamed from: a */
        public static final a f15278a = new a();

        public a() {
            super(null);
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$b */
    public static final class b extends AbstractC8251b {

        /* renamed from: a */
        public final boolean f15279a;

        public b(boolean z10) {
            super(null);
            this.f15279a = z10;
        }

        /* renamed from: a */
        public final boolean m13236a() {
            return this.f15279a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f15279a == ((b) obj).f15279a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f15279a);
        }

        public String toString() {
            return "ExpandAnimate(isOpen=" + this.f15279a + ")";
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$c */
    public static final class c extends AbstractC8251b {

        /* renamed from: a */
        public final float f15280a;

        public c(float f10) {
            super(null);
            this.f15280a = f10;
        }

        /* renamed from: a */
        public final float m13237a() {
            return this.f15280a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Float.compare(this.f15280a, ((c) obj).f15280a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f15280a);
        }

        public String toString() {
            return "SetEraserSize(eraserSize=" + this.f15280a + ")";
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$d */
    public static final class d extends AbstractC8251b {

        /* renamed from: a */
        public final boolean f15281a;

        public d(boolean z10) {
            super(null);
            this.f15281a = z10;
        }

        /* renamed from: a */
        public final boolean m13238a() {
            return this.f15281a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f15281a == ((d) obj).f15281a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f15281a);
        }

        public String toString() {
            return "SetFingerTouchable(enable=" + this.f15281a + ")";
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$e */
    public static final class e extends AbstractC8251b {

        /* renamed from: a */
        public final int f15282a;

        public e(int i10) {
            super(null);
            this.f15282a = i10;
        }

        /* renamed from: a */
        public final int m13239a() {
            return this.f15282a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f15282a == ((e) obj).f15282a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f15282a);
        }

        public String toString() {
            return "SetPenColor(penColor=" + this.f15282a + ")";
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$f */
    public static final class f extends AbstractC8251b {

        /* renamed from: a */
        public final int f15283a;

        /* renamed from: b */
        public final boolean f15284b;

        public f(int i10, boolean z10) {
            super(null);
            this.f15283a = i10;
            this.f15284b = z10;
        }

        /* renamed from: a */
        public final int m13240a() {
            return this.f15283a;
        }

        /* renamed from: b */
        public final boolean m13241b() {
            return this.f15284b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f15283a == fVar.f15283a && this.f15284b == fVar.f15284b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f15283a) * 31) + Boolean.hashCode(this.f15284b);
        }

        public String toString() {
            return "SetPenMode(actionMode=" + this.f15283a + ", isPenDashed=" + this.f15284b + ")";
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$g */
    public static final class g extends AbstractC8251b {

        /* renamed from: a */
        public final float f15285a;

        public g(float f10) {
            super(null);
            this.f15285a = f10;
        }

        /* renamed from: a */
        public final float m13242a() {
            return this.f15285a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Float.compare(this.f15285a, ((g) obj).f15285a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f15285a);
        }

        public String toString() {
            return "SetPenSize(penSize=" + this.f15285a + ")";
        }
    }

    public /* synthetic */ AbstractC8251b(AbstractC9126n abstractC9126n) {
        this();
    }

    public AbstractC8251b() {
    }
}

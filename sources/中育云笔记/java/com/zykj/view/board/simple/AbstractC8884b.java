package com.zykj.view.board.simple;

import kotlin.jvm.internal.AbstractC9972n;

/* renamed from: com.zykj.view.board.simple.b */
/* loaded from: classes6.dex */
public abstract class AbstractC8884b {

    /* renamed from: com.zykj.view.board.simple.b$a */
    public static final class a extends AbstractC8884b {

        /* renamed from: a */
        public static final a f20489a = new a();

        public a() {
            super(null);
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$b */
    public static final class b extends AbstractC8884b {

        /* renamed from: a */
        public final boolean f20490a;

        public b(boolean z10) {
            super(null);
            this.f20490a = z10;
        }

        /* renamed from: a */
        public final boolean m17308a() {
            return this.f20490a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f20490a == ((b) obj).f20490a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f20490a);
        }

        public String toString() {
            return "ExpandAnimate(isOpen=" + this.f20490a + ")";
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$c */
    public static final class c extends AbstractC8884b {

        /* renamed from: a */
        public final float f20491a;

        public c(float f10) {
            super(null);
            this.f20491a = f10;
        }

        /* renamed from: a */
        public final float m17309a() {
            return this.f20491a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Float.compare(this.f20491a, ((c) obj).f20491a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f20491a);
        }

        public String toString() {
            return "SetEraserSize(eraserSize=" + this.f20491a + ")";
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$d */
    public static final class d extends AbstractC8884b {

        /* renamed from: a */
        public final boolean f20492a;

        public d(boolean z10) {
            super(null);
            this.f20492a = z10;
        }

        /* renamed from: a */
        public final boolean m17310a() {
            return this.f20492a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f20492a == ((d) obj).f20492a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f20492a);
        }

        public String toString() {
            return "SetFingerTouchable(enable=" + this.f20492a + ")";
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$e */
    public static final class e extends AbstractC8884b {

        /* renamed from: a */
        public final int f20493a;

        public e(int i10) {
            super(null);
            this.f20493a = i10;
        }

        /* renamed from: a */
        public final int m17311a() {
            return this.f20493a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f20493a == ((e) obj).f20493a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f20493a);
        }

        public String toString() {
            return "SetPenColor(penColor=" + this.f20493a + ")";
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$f */
    public static final class f extends AbstractC8884b {

        /* renamed from: a */
        public final int f20494a;

        /* renamed from: b */
        public final boolean f20495b;

        public f(int i10, boolean z10) {
            super(null);
            this.f20494a = i10;
            this.f20495b = z10;
        }

        /* renamed from: a */
        public final int m17312a() {
            return this.f20494a;
        }

        /* renamed from: b */
        public final boolean m17313b() {
            return this.f20495b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f20494a == fVar.f20494a && this.f20495b == fVar.f20495b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f20494a) * 31) + Boolean.hashCode(this.f20495b);
        }

        public String toString() {
            return "SetPenMode(actionMode=" + this.f20494a + ", isPenDashed=" + this.f20495b + ")";
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$g */
    public static final class g extends AbstractC8884b {

        /* renamed from: a */
        public final float f20496a;

        public g(float f10) {
            super(null);
            this.f20496a = f10;
        }

        /* renamed from: a */
        public final float m17314a() {
            return this.f20496a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Float.compare(this.f20496a, ((g) obj).f20496a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f20496a);
        }

        public String toString() {
            return "SetPenSize(penSize=" + this.f20496a + ")";
        }
    }

    public /* synthetic */ AbstractC8884b(AbstractC9972n abstractC9972n) {
        this();
    }

    public AbstractC8884b() {
    }
}

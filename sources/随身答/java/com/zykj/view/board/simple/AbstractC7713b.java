package com.zykj.view.board.simple;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.simple.b */
/* loaded from: classes5.dex */
public abstract class AbstractC7713b {

    /* renamed from: com.zykj.view.board.simple.b$a */
    public static final class a extends AbstractC7713b {

        /* renamed from: a */
        public static final a f12517a = new a();

        public a() {
            super(null);
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$b */
    public static final class b extends AbstractC7713b {

        /* renamed from: a */
        public final boolean f12518a;

        public b(boolean z9) {
            super(null);
            this.f12518a = z9;
        }

        /* renamed from: a */
        public final boolean m11853a() {
            return this.f12518a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f12518a == ((b) obj).f12518a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f12518a);
        }

        public String toString() {
            return "ExpandAnimate(isOpen=" + this.f12518a + ")";
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$c */
    public static final class c extends AbstractC7713b {

        /* renamed from: a */
        public final float f12519a;

        public c(float f10) {
            super(null);
            this.f12519a = f10;
        }

        /* renamed from: a */
        public final float m11854a() {
            return this.f12519a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Float.compare(this.f12519a, ((c) obj).f12519a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f12519a);
        }

        public String toString() {
            return "SetEraserSize(eraserSize=" + this.f12519a + ")";
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$d */
    public static final class d extends AbstractC7713b {

        /* renamed from: a */
        public final boolean f12520a;

        public d(boolean z9) {
            super(null);
            this.f12520a = z9;
        }

        /* renamed from: a */
        public final boolean m11855a() {
            return this.f12520a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f12520a == ((d) obj).f12520a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f12520a);
        }

        public String toString() {
            return "SetFingerTouchable(enable=" + this.f12520a + ")";
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$e */
    public static final class e extends AbstractC7713b {

        /* renamed from: a */
        public final int f12521a;

        public e(int i9) {
            super(null);
            this.f12521a = i9;
        }

        /* renamed from: a */
        public final int m11856a() {
            return this.f12521a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f12521a == ((e) obj).f12521a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f12521a);
        }

        public String toString() {
            return "SetPenColor(penColor=" + this.f12521a + ")";
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$f */
    public static final class f extends AbstractC7713b {

        /* renamed from: a */
        public final int f12522a;

        /* renamed from: b */
        public final boolean f12523b;

        public f(int i9, boolean z9) {
            super(null);
            this.f12522a = i9;
            this.f12523b = z9;
        }

        /* renamed from: a */
        public final int m11857a() {
            return this.f12522a;
        }

        /* renamed from: b */
        public final boolean m11858b() {
            return this.f12523b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f12522a == fVar.f12522a && this.f12523b == fVar.f12523b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f12522a) * 31) + Boolean.hashCode(this.f12523b);
        }

        public String toString() {
            return "SetPenMode(actionMode=" + this.f12522a + ", isPenDashed=" + this.f12523b + ")";
        }
    }

    /* renamed from: com.zykj.view.board.simple.b$g */
    public static final class g extends AbstractC7713b {

        /* renamed from: a */
        public final float f12524a;

        public g(float f10) {
            super(null);
            this.f12524a = f10;
        }

        /* renamed from: a */
        public final float m11859a() {
            return this.f12524a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Float.compare(this.f12524a, ((g) obj).f12524a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f12524a);
        }

        public String toString() {
            return "SetPenSize(penSize=" + this.f12524a + ")";
        }
    }

    public /* synthetic */ AbstractC7713b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC7713b() {
    }
}

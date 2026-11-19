package com.zykj.view.board.board;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.board.g */
/* loaded from: classes5.dex */
public abstract class AbstractC7220g {

    /* renamed from: a */
    public final int f11026a;

    /* renamed from: b */
    public final float f11027b;

    /* renamed from: com.zykj.view.board.board.g$a */
    public static final class a extends AbstractC7220g {

        /* renamed from: c */
        public static final a f11028c = new a();

        public a() {
            super(2, 60.0f, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1913150441;
        }

        public String toString() {
            return "Large";
        }
    }

    /* renamed from: com.zykj.view.board.board.g$b */
    public static final class b extends AbstractC7220g {

        /* renamed from: c */
        public static final b f11029c = new b();

        public b() {
            super(0, 20.0f, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -814417912;
        }

        public String toString() {
            return "Little";
        }
    }

    /* renamed from: com.zykj.view.board.board.g$c */
    public static final class c extends AbstractC7220g {

        /* renamed from: c */
        public static final c f11030c = new c();

        public c() {
            super(1, 40.0f, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -786280793;
        }

        public String toString() {
            return "Middle";
        }
    }

    public /* synthetic */ AbstractC7220g(int i10, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, f10);
    }

    /* renamed from: a */
    public final int m10977a() {
        return this.f11026a;
    }

    /* renamed from: b */
    public final float m10978b() {
        return this.f11027b;
    }

    public AbstractC7220g(int i10, float f10) {
        this.f11026a = i10;
        this.f11027b = f10;
    }
}

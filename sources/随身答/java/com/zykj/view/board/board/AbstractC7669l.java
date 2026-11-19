package com.zykj.view.board.board;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.board.l */
/* loaded from: classes5.dex */
public abstract class AbstractC7669l {

    /* renamed from: a */
    public final int f12245a;

    /* renamed from: b */
    public final float f12246b;

    /* renamed from: com.zykj.view.board.board.l$a */
    public static final class a extends AbstractC7669l {

        /* renamed from: c */
        public static final a f12247c = new a();

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

    /* renamed from: com.zykj.view.board.board.l$b */
    public static final class b extends AbstractC7669l {

        /* renamed from: c */
        public static final b f12248c = new b();

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

    /* renamed from: com.zykj.view.board.board.l$c */
    public static final class c extends AbstractC7669l {

        /* renamed from: c */
        public static final c f12249c = new c();

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

    public /* synthetic */ AbstractC7669l(int i9, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i9, f10);
    }

    /* renamed from: a */
    public final int m11407a() {
        return this.f12245a;
    }

    /* renamed from: b */
    public final float m11408b() {
        return this.f12246b;
    }

    public AbstractC7669l(int i9, float f10) {
        this.f12245a = i9;
        this.f12246b = f10;
    }
}

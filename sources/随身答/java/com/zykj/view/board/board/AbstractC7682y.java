package com.zykj.view.board.board;

import com.zykj.view.R$drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.board.y */
/* loaded from: classes5.dex */
public abstract class AbstractC7682y {

    /* renamed from: a */
    public final int f12326a;

    /* renamed from: b */
    public final boolean f12327b;

    /* renamed from: c */
    public final boolean f12328c;

    /* renamed from: d */
    public final boolean f12329d;

    /* renamed from: e */
    public final boolean f12330e;

    /* renamed from: com.zykj.view.board.board.y$a */
    public static final class a extends AbstractC7682y {

        /* renamed from: f */
        public static final a f12331f = new a();

        public a() {
            super(R$drawable.view_icon_record_resume2, true, true, false, false, 24, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -266170468;
        }

        public String toString() {
            return "Continue";
        }
    }

    /* renamed from: com.zykj.view.board.board.y$b */
    public static final class b extends AbstractC7682y {

        /* renamed from: f */
        public static final b f12332f = new b();

        public b() {
            super(R$drawable.view_icon_record_resume, false, true, false, false, 24, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1204587141;
        }

        public String toString() {
            return "Init";
        }
    }

    /* renamed from: com.zykj.view.board.board.y$c */
    public static final class c extends AbstractC7682y {

        /* renamed from: f */
        public static final c f12333f = new c();

        public c() {
            super(R$drawable.view_icon_record_stop, true, false, false, false, 24, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1735621020;
        }

        public String toString() {
            return "Recording";
        }
    }

    public /* synthetic */ AbstractC7682y(int i9, boolean z9, boolean z10, boolean z11, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i9, z9, z10, z11, z12);
    }

    /* renamed from: a */
    public final int m11472a() {
        return this.f12326a;
    }

    /* renamed from: b */
    public final boolean m11473b() {
        return this.f12329d;
    }

    /* renamed from: c */
    public final boolean m11474c() {
        return this.f12328c;
    }

    /* renamed from: d */
    public final boolean m11475d() {
        return this.f12330e;
    }

    public AbstractC7682y(int i9, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f12326a = i9;
        this.f12327b = z9;
        this.f12328c = z10;
        this.f12329d = z11;
        this.f12330e = z12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AbstractC7682y(int i9, boolean z9, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z13 = (i10 & 8) != 0 ? z9 && z10 : z11;
        this(i9, z9, z10, z13, (i10 & 16) != 0 ? z9 || z13 : z12, null);
    }
}

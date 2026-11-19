package com.zykj.view.board.board;

import com.zykj.view.R$drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.board.t */
/* loaded from: classes5.dex */
public abstract class AbstractC7233t {

    /* renamed from: a */
    public final int f11107a;

    /* renamed from: b */
    public final boolean f11108b;

    /* renamed from: c */
    public final boolean f11109c;

    /* renamed from: d */
    public final boolean f11110d;

    /* renamed from: e */
    public final boolean f11111e;

    /* renamed from: com.zykj.view.board.board.t$a */
    public static final class a extends AbstractC7233t {

        /* renamed from: f */
        public static final a f11112f = new a();

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

    /* renamed from: com.zykj.view.board.board.t$b */
    public static final class b extends AbstractC7233t {

        /* renamed from: f */
        public static final b f11113f = new b();

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

    /* renamed from: com.zykj.view.board.board.t$c */
    public static final class c extends AbstractC7233t {

        /* renamed from: f */
        public static final c f11114f = new c();

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

    public /* synthetic */ AbstractC7233t(int i10, boolean z9, boolean z10, boolean z11, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z9, z10, z11, z12);
    }

    /* renamed from: a */
    public final int m11042a() {
        return this.f11107a;
    }

    /* renamed from: b */
    public final boolean m11043b() {
        return this.f11110d;
    }

    /* renamed from: c */
    public final boolean m11044c() {
        return this.f11109c;
    }

    /* renamed from: d */
    public final boolean m11045d() {
        return this.f11111e;
    }

    public AbstractC7233t(int i10, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f11107a = i10;
        this.f11108b = z9;
        this.f11109c = z10;
        this.f11110d = z11;
        this.f11111e = z12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AbstractC7233t(int i10, boolean z9, boolean z10, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z13 = (i11 & 8) != 0 ? z9 && z10 : z11;
        this(i10, z9, z10, z13, (i11 & 16) != 0 ? z9 || z13 : z12, null);
    }
}

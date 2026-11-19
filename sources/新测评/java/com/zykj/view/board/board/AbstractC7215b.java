package com.zykj.view.board.board;

import android.graphics.Color;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.board.b */
/* loaded from: classes5.dex */
public abstract class AbstractC7215b {

    /* renamed from: a */
    public final int f11004a;

    /* renamed from: b */
    public final int f11005b;

    /* renamed from: c */
    public final BackgroundLineConfig.BackgroundLineType f11006c;

    /* renamed from: d */
    public final int f11007d;

    /* renamed from: e */
    public final float f11008e;

    /* renamed from: com.zykj.view.board.board.b$a */
    public static final class a extends AbstractC7215b {

        /* renamed from: f */
        public static final a f11009f = new a();

        public a() {
            super(1, Color.parseColor("#1A1A1A"), null, 0, 0.0f, 28, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -269335924;
        }

        public String toString() {
            return "ColorBlack";
        }
    }

    /* renamed from: com.zykj.view.board.board.b$b */
    public static final class b extends AbstractC7215b {

        /* renamed from: f */
        public static final b f11010f = new b();

        public b() {
            super(2, Color.parseColor("#435772"), null, 0, 0.0f, 28, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -2086897619;
        }

        public String toString() {
            return "ColorBlue";
        }
    }

    /* renamed from: com.zykj.view.board.board.b$c */
    public static final class c extends AbstractC7215b {

        /* renamed from: f */
        public static final c f11011f = new c();

        public c() {
            super(3, Color.parseColor("#4C7068"), null, 0, 0.0f, 28, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -264535664;
        }

        public String toString() {
            return "ColorGreen";
        }
    }

    /* renamed from: com.zykj.view.board.board.b$d */
    public static final class d extends AbstractC7215b {

        /* renamed from: f */
        public static final d f11012f = new d();

        public d() {
            super(0, Color.parseColor("#FFFFFF"), null, 0, 0.0f, 28, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -250052938;
        }

        public String toString() {
            return "ColorWhite";
        }
    }

    /* renamed from: com.zykj.view.board.board.b$e */
    public static final class e extends AbstractC7215b {

        /* renamed from: f */
        public static final e f11013f = new e();

        /* JADX WARN: Illegal instructions before constructor call */
        public e() {
            int i10 = 5;
            super(i10, Color.parseColor("#F6F0E8"), BackgroundLineConfig.BackgroundLineType.Horizontal, Color.parseColor("#B0AEAE"), 108.0f, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 587451240;
        }

        public String toString() {
            return "LineHorizontal";
        }
    }

    /* renamed from: com.zykj.view.board.board.b$f */
    public static final class f extends AbstractC7215b {

        /* renamed from: f */
        public static final f f11014f = new f();

        /* JADX WARN: Illegal instructions before constructor call */
        public f() {
            int i10 = 4;
            super(i10, Color.parseColor("#F6F0E9"), BackgroundLineConfig.BackgroundLineType.Interweave, Color.parseColor("#B0AEAE"), 64.0f, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return 1912067370;
        }

        public String toString() {
            return "LineInterweave";
        }
    }

    public /* synthetic */ AbstractC7215b(int i10, int i11, BackgroundLineConfig.BackgroundLineType backgroundLineType, int i12, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, backgroundLineType, i12, f10);
    }

    /* renamed from: a */
    public final int m10962a() {
        return this.f11005b;
    }

    /* renamed from: b */
    public final int m10963b() {
        return this.f11007d;
    }

    /* renamed from: c */
    public final float m10964c() {
        return this.f11008e;
    }

    /* renamed from: d */
    public final BackgroundLineConfig.BackgroundLineType m10965d() {
        return this.f11006c;
    }

    /* renamed from: e */
    public final int m10966e() {
        return this.f11004a;
    }

    public AbstractC7215b(int i10, int i11, BackgroundLineConfig.BackgroundLineType backgroundLineType, int i12, float f10) {
        this.f11004a = i10;
        this.f11005b = i11;
        this.f11006c = backgroundLineType;
        this.f11007d = i12;
        this.f11008e = f10;
    }

    public /* synthetic */ AbstractC7215b(int i10, int i11, BackgroundLineConfig.BackgroundLineType backgroundLineType, int i12, float f10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i13 & 2) != 0 ? -1 : i11, (i13 & 4) != 0 ? BackgroundLineConfig.BackgroundLineType.Horizontal : backgroundLineType, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? 64.0f : f10, null);
    }
}

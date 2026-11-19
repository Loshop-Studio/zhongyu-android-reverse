package com.zykj.view.board.board;

import android.graphics.Color;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.board.b */
/* loaded from: classes5.dex */
public abstract class AbstractC7659b {

    /* renamed from: a */
    public final int f12206a;

    /* renamed from: b */
    public final int f12207b;

    /* renamed from: c */
    public final BackgroundLineConfig.BackgroundLineType f12208c;

    /* renamed from: d */
    public final int f12209d;

    /* renamed from: e */
    public final float f12210e;

    /* renamed from: com.zykj.view.board.board.b$a */
    public static final class a extends AbstractC7659b {

        /* renamed from: f */
        public static final a f12211f = new a();

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
    public static final class b extends AbstractC7659b {

        /* renamed from: f */
        public static final b f12212f = new b();

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
    public static final class c extends AbstractC7659b {

        /* renamed from: f */
        public static final c f12213f = new c();

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
    public static final class d extends AbstractC7659b {

        /* renamed from: f */
        public static final d f12214f = new d();

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
    public static final class e extends AbstractC7659b {

        /* renamed from: f */
        public static final e f12215f = new e();

        /* JADX WARN: Illegal instructions before constructor call */
        public e() {
            int i9 = 5;
            super(i9, Color.parseColor("#F6F0E8"), BackgroundLineConfig.BackgroundLineType.Horizontal, Color.parseColor("#B0AEAE"), 108.0f, null);
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
    public static final class f extends AbstractC7659b {

        /* renamed from: f */
        public static final f f12216f = new f();

        /* JADX WARN: Illegal instructions before constructor call */
        public f() {
            int i9 = 4;
            super(i9, Color.parseColor("#F6F0E9"), BackgroundLineConfig.BackgroundLineType.Interweave, Color.parseColor("#B0AEAE"), 64.0f, null);
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

    public /* synthetic */ AbstractC7659b(int i9, int i10, BackgroundLineConfig.BackgroundLineType backgroundLineType, int i11, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i9, i10, backgroundLineType, i11, f10);
    }

    /* renamed from: a */
    public final int m11381a() {
        return this.f12207b;
    }

    /* renamed from: b */
    public final int m11382b() {
        return this.f12209d;
    }

    /* renamed from: c */
    public final float m11383c() {
        return this.f12210e;
    }

    /* renamed from: d */
    public final BackgroundLineConfig.BackgroundLineType m11384d() {
        return this.f12208c;
    }

    /* renamed from: e */
    public final int m11385e() {
        return this.f12206a;
    }

    public AbstractC7659b(int i9, int i10, BackgroundLineConfig.BackgroundLineType backgroundLineType, int i11, float f10) {
        this.f12206a = i9;
        this.f12207b = i10;
        this.f12208c = backgroundLineType;
        this.f12209d = i11;
        this.f12210e = f10;
    }

    public /* synthetic */ AbstractC7659b(int i9, int i10, BackgroundLineConfig.BackgroundLineType backgroundLineType, int i11, float f10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i9, (i12 & 2) != 0 ? -1 : i10, (i12 & 4) != 0 ? BackgroundLineConfig.BackgroundLineType.Horizontal : backgroundLineType, (i12 & 8) != 0 ? 0 : i11, (i12 & 16) != 0 ? 64.0f : f10, null);
    }
}

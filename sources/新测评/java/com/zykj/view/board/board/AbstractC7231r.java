package com.zykj.view.board.board;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.board.EzyModeEnum;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.board.r */
/* loaded from: classes5.dex */
public abstract class AbstractC7231r {

    /* renamed from: a */
    public final int f11094a;

    /* renamed from: b */
    public final EzyModeEnum.ModeEnum f11095b;

    /* renamed from: c */
    public final boolean f11096c;

    /* renamed from: d */
    public final List f11097d;

    /* renamed from: e */
    public final float f11098e;

    /* renamed from: com.zykj.view.board.board.r$a */
    public static final class a extends AbstractC7231r {

        /* renamed from: f */
        public static final a f11099f = new a();

        public a() {
            super(4, EzyModeEnum.ModeEnum.ACTION_CURSOR, false, null, 0.0f, 28, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1769350183;
        }

        public String toString() {
            return "Cursor";
        }
    }

    /* renamed from: com.zykj.view.board.board.r$b */
    public static final class b extends AbstractC7231r {

        /* renamed from: f */
        public static final b f11100f = new b();

        public b() {
            super(0, EzyModeEnum.ModeEnum.ACTION_WRITING, false, null, 0.0f, 28, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1769380930;
        }

        public String toString() {
            return TypedValues.Custom.NAME;
        }
    }

    /* renamed from: com.zykj.view.board.board.r$c */
    public static final class c extends AbstractC7231r {

        /* renamed from: f */
        public static final c f11101f = new c();

        public c() {
            super(2, EzyModeEnum.ModeEnum.ACTION_WRITING_BEELINE, true, null, 0.0f, 24, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 697272719;
        }

        public String toString() {
            return "DottedLine";
        }
    }

    /* renamed from: com.zykj.view.board.board.r$d */
    public static final class d extends AbstractC7231r {

        /* renamed from: f */
        public static final d f11102f = new d();

        public d() {
            super(3, EzyModeEnum.ModeEnum.ACTION_WRITING, false, CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(28.0f), Float.valueOf(36.0f), Float.valueOf(56.0f)}), 0.5f, 4, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -1199307216;
        }

        public String toString() {
            return "Highlighter";
        }
    }

    /* renamed from: com.zykj.view.board.board.r$e */
    public static final class e extends AbstractC7231r {

        /* renamed from: f */
        public static final e f11103f = new e();

        public e() {
            super(1, EzyModeEnum.ModeEnum.ACTION_WRITING_BEELINE, false, null, 0.0f, 28, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return -1580023547;
        }

        public String toString() {
            return "Line";
        }
    }

    public /* synthetic */ AbstractC7231r(int i10, EzyModeEnum.ModeEnum modeEnum, boolean z9, List list, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, modeEnum, z9, list, f10);
    }

    /* renamed from: a */
    public final EzyModeEnum.ModeEnum m11032a() {
        return this.f11095b;
    }

    /* renamed from: b */
    public final int m11033b() {
        return this.f11094a;
    }

    /* renamed from: c */
    public final float m11034c() {
        return this.f11098e;
    }

    /* renamed from: d */
    public final List m11035d() {
        return this.f11097d;
    }

    /* renamed from: e */
    public final boolean m11036e() {
        return this.f11096c;
    }

    public AbstractC7231r(int i10, EzyModeEnum.ModeEnum modeEnum, boolean z9, List list, float f10) {
        this.f11094a = i10;
        this.f11095b = modeEnum;
        this.f11096c = z9;
        this.f11097d = list;
        this.f11098e = f10;
    }

    public /* synthetic */ AbstractC7231r(int i10, EzyModeEnum.ModeEnum modeEnum, boolean z9, List list, float f10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, modeEnum, (i11 & 4) != 0 ? false : z9, (i11 & 8) != 0 ? CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(3.0f), Float.valueOf(8.0f), Float.valueOf(15.0f)}) : list, (i11 & 16) != 0 ? 1.0f : f10, null);
    }
}

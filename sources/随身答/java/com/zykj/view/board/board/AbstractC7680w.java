package com.zykj.view.board.board;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.board.EzyModeEnum;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.board.w */
/* loaded from: classes5.dex */
public abstract class AbstractC7680w {

    /* renamed from: a */
    public final int f12313a;

    /* renamed from: b */
    public final EzyModeEnum.ModeEnum f12314b;

    /* renamed from: c */
    public final boolean f12315c;

    /* renamed from: d */
    public final List f12316d;

    /* renamed from: e */
    public final float f12317e;

    /* renamed from: com.zykj.view.board.board.w$a */
    public static final class a extends AbstractC7680w {

        /* renamed from: f */
        public static final a f12318f = new a();

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

    /* renamed from: com.zykj.view.board.board.w$b */
    public static final class b extends AbstractC7680w {

        /* renamed from: f */
        public static final b f12319f = new b();

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

    /* renamed from: com.zykj.view.board.board.w$c */
    public static final class c extends AbstractC7680w {

        /* renamed from: f */
        public static final c f12320f = new c();

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

    /* renamed from: com.zykj.view.board.board.w$d */
    public static final class d extends AbstractC7680w {

        /* renamed from: f */
        public static final d f12321f = new d();

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

    /* renamed from: com.zykj.view.board.board.w$e */
    public static final class e extends AbstractC7680w {

        /* renamed from: f */
        public static final e f12322f = new e();

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

    public /* synthetic */ AbstractC7680w(int i9, EzyModeEnum.ModeEnum modeEnum, boolean z9, List list, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i9, modeEnum, z9, list, f10);
    }

    /* renamed from: a */
    public final EzyModeEnum.ModeEnum m11462a() {
        return this.f12314b;
    }

    /* renamed from: b */
    public final int m11463b() {
        return this.f12313a;
    }

    /* renamed from: c */
    public final float m11464c() {
        return this.f12317e;
    }

    /* renamed from: d */
    public final List m11465d() {
        return this.f12316d;
    }

    /* renamed from: e */
    public final boolean m11466e() {
        return this.f12315c;
    }

    public AbstractC7680w(int i9, EzyModeEnum.ModeEnum modeEnum, boolean z9, List list, float f10) {
        this.f12313a = i9;
        this.f12314b = modeEnum;
        this.f12315c = z9;
        this.f12316d = list;
        this.f12317e = f10;
    }

    public /* synthetic */ AbstractC7680w(int i9, EzyModeEnum.ModeEnum modeEnum, boolean z9, List list, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i9, modeEnum, (i10 & 4) != 0 ? false : z9, (i10 & 8) != 0 ? CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(3.0f), Float.valueOf(8.0f), Float.valueOf(15.0f)}) : list, (i10 & 16) != 0 ? 1.0f : f10, null);
    }
}

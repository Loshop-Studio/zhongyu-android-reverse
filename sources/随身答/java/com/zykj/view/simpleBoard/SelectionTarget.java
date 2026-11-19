package com.zykj.view.simpleBoard;

import android.graphics.PointF;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p129h7.C8108d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13412d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\b\u0082\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u0013j\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b\u0016j\u0002\b j\u0002\b!j\u0002\b\u0007j\u0002\b\"j\u0002\b#j\u0002\b\u000fj\u0002\b$j\u0002\b%j\u0002\b\tj\u0002\b\rj\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*¨\u0006+"}, m13413d2 = {"Lcom/zykj/view/simpleBoard/SelectionTarget;", "", "<init>", "(Ljava/lang/String;I)V", "Lh7/d;", "config", "", "n", "(Lh7/d;)Z", "t", "Landroid/graphics/RectF;", "bounds", "Landroid/graphics/PointF;", "u", "(Landroid/graphics/RectF;)Landroid/graphics/PointF;", "q", "()Z", "isTransformTarget", "", "g", "()I", "colorIndex", "k", "widthIndex", "a", "c", "d", "e", "f", "h", "i", "j", "l", "m", "o", "p", "r", "s", "v", "w", "x", "y", "z", "view_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
final class SelectionTarget {

    /* renamed from: A */
    public static final /* synthetic */ SelectionTarget[] f12818A;

    /* renamed from: B */
    public static final /* synthetic */ EnumEntries f12819B;

    /* renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: b */
    public static final List f12821b;

    /* renamed from: c */
    public static final SelectionTarget f12822c = new SelectionTarget("NONE", 0);

    /* renamed from: d */
    public static final SelectionTarget f12823d = new SelectionTarget("CONTENT", 1);

    /* renamed from: e */
    public static final SelectionTarget f12824e;

    /* renamed from: f */
    public static final SelectionTarget f12825f;

    /* renamed from: g */
    public static final SelectionTarget f12826g;

    /* renamed from: h */
    public static final SelectionTarget f12827h;

    /* renamed from: i */
    public static final SelectionTarget f12828i;

    /* renamed from: j */
    public static final SelectionTarget f12829j;

    /* renamed from: k */
    public static final SelectionTarget f12830k;

    /* renamed from: l */
    public static final SelectionTarget f12831l;

    /* renamed from: m */
    public static final SelectionTarget f12832m;

    /* renamed from: n */
    public static final SelectionTarget f12833n;

    /* renamed from: o */
    public static final SelectionTarget f12834o;

    /* renamed from: p */
    public static final SelectionTarget f12835p;

    /* renamed from: q */
    public static final SelectionTarget f12836q;

    /* renamed from: r */
    public static final SelectionTarget f12837r;

    /* renamed from: s */
    public static final SelectionTarget f12838s;

    /* renamed from: t */
    public static final SelectionTarget f12839t;

    /* renamed from: u */
    public static final SelectionTarget f12840u;

    /* renamed from: v */
    public static final SelectionTarget f12841v;

    /* renamed from: w */
    public static final SelectionTarget f12842w;

    /* renamed from: x */
    public static final SelectionTarget f12843x;

    /* renamed from: y */
    public static final SelectionTarget f12844y;

    /* renamed from: z */
    public static final SelectionTarget f12845z;

    /* renamed from: com.zykj.view.simpleBoard.SelectionTarget$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final SelectionTarget m11922a(int i9) {
            SelectionTarget[] selectionTargetArrValues = SelectionTarget.values();
            int iOrdinal = SelectionTarget.f12836q.ordinal() + i9;
            return (iOrdinal < 0 || iOrdinal >= selectionTargetArrValues.length) ? SelectionTarget.f12822c : selectionTargetArrValues[iOrdinal];
        }

        /* renamed from: b */
        public final List m11923b() {
            return SelectionTarget.f12821b;
        }

        /* renamed from: c */
        public final SelectionTarget m11924c(int i9) {
            SelectionTarget[] selectionTargetArrValues = SelectionTarget.values();
            int iOrdinal = SelectionTarget.f12841v.ordinal() + i9;
            return (iOrdinal < 0 || iOrdinal >= selectionTargetArrValues.length) ? SelectionTarget.f12822c : selectionTargetArrValues[iOrdinal];
        }

        public Companion() {
        }
    }

    /* renamed from: com.zykj.view.simpleBoard.SelectionTarget$b */
    public static final /* synthetic */ class C7718b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12846a;

        static {
            int[] iArr = new int[SelectionTarget.values().length];
            try {
                iArr[SelectionTarget.f12824e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectionTarget.f12826g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelectionTarget.f12830k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SelectionTarget.f12828i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SelectionTarget.f12825f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SelectionTarget.f12827h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SelectionTarget.f12829j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SelectionTarget.f12831l.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SelectionTarget.f12832m.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SelectionTarget.f12823d.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SelectionTarget.f12836q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SelectionTarget.f12837r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SelectionTarget.f12838s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SelectionTarget.f12839t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SelectionTarget.f12840u.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SelectionTarget.f12841v.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SelectionTarget.f12842w.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SelectionTarget.f12843x.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[SelectionTarget.f12844y.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[SelectionTarget.f12845z.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            f12846a = iArr;
        }
    }

    static {
        SelectionTarget selectionTarget = new SelectionTarget("SCALE_TOP_LEFT", 2);
        f12824e = selectionTarget;
        SelectionTarget selectionTarget2 = new SelectionTarget("STRETCH_TOP", 3);
        f12825f = selectionTarget2;
        SelectionTarget selectionTarget3 = new SelectionTarget("SCALE_TOP_RIGHT", 4);
        f12826g = selectionTarget3;
        SelectionTarget selectionTarget4 = new SelectionTarget("STRETCH_RIGHT", 5);
        f12827h = selectionTarget4;
        SelectionTarget selectionTarget5 = new SelectionTarget("SCALE_BOTTOM_RIGHT", 6);
        f12828i = selectionTarget5;
        SelectionTarget selectionTarget6 = new SelectionTarget("STRETCH_BOTTOM", 7);
        f12829j = selectionTarget6;
        SelectionTarget selectionTarget7 = new SelectionTarget("SCALE_BOTTOM_LEFT", 8);
        f12830k = selectionTarget7;
        SelectionTarget selectionTarget8 = new SelectionTarget("STRETCH_LEFT", 9);
        f12831l = selectionTarget8;
        f12832m = new SelectionTarget("ROTATE", 10);
        f12833n = new SelectionTarget("EDIT", 11);
        f12834o = new SelectionTarget("DELETE", 12);
        f12835p = new SelectionTarget("STYLE_PANEL", 13);
        f12836q = new SelectionTarget("COLOR_0", 14);
        f12837r = new SelectionTarget("COLOR_1", 15);
        f12838s = new SelectionTarget("COLOR_2", 16);
        f12839t = new SelectionTarget("COLOR_3", 17);
        f12840u = new SelectionTarget("COLOR_4", 18);
        f12841v = new SelectionTarget("WIDTH_0", 19);
        f12842w = new SelectionTarget("WIDTH_1", 20);
        f12843x = new SelectionTarget("WIDTH_2", 21);
        f12844y = new SelectionTarget("WIDTH_3", 22);
        f12845z = new SelectionTarget("WIDTH_4", 23);
        SelectionTarget[] selectionTargetArrM11914a = m11914a();
        f12818A = selectionTargetArrM11914a;
        f12819B = EnumEntriesKt.enumEntries(selectionTargetArrM11914a);
        INSTANCE = new Companion(null);
        f12821b = CollectionsKt.listOf((Object[]) new SelectionTarget[]{selectionTarget, selectionTarget2, selectionTarget3, selectionTarget4, selectionTarget5, selectionTarget6, selectionTarget7, selectionTarget8});
    }

    public SelectionTarget(String str, int i9) {
    }

    /* renamed from: a */
    public static final /* synthetic */ SelectionTarget[] m11914a() {
        return new SelectionTarget[]{f12822c, f12823d, f12824e, f12825f, f12826g, f12827h, f12828i, f12829j, f12830k, f12831l, f12832m, f12833n, f12834o, f12835p, f12836q, f12837r, f12838s, f12839t, f12840u, f12841v, f12842w, f12843x, f12844y, f12845z};
    }

    public static SelectionTarget valueOf(String str) {
        return (SelectionTarget) Enum.valueOf(SelectionTarget.class, str);
    }

    public static SelectionTarget[] values() {
        return (SelectionTarget[]) f12818A.clone();
    }

    /* renamed from: g */
    public final int m11916g() {
        switch (C7718b.f12846a[ordinal()]) {
            case 11:
                return 0;
            case 12:
                return 1;
            case 13:
                return 2;
            case 14:
                return 3;
            case 15:
                return 4;
            default:
                return -1;
        }
    }

    /* renamed from: k */
    public final int m11917k() {
        switch (C7718b.f12846a[ordinal()]) {
            case 16:
                return 0;
            case 17:
                return 1;
            case 18:
                return 2;
            case 19:
                return 3;
            case 20:
                return 4;
            default:
                return -1;
        }
    }

    /* renamed from: n */
    public final boolean m11918n(C8108d config) {
        Intrinsics.checkNotNullParameter(config, "config");
        switch (C7718b.f12846a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return config.m12974f();
            case 5:
            case 6:
            case 7:
            case 8:
                return config.m12975g();
            case 9:
                return config.m12973e();
            case 10:
                return config.m12972d();
            default:
                return true;
        }
    }

    /* renamed from: q */
    public final boolean m11919q() {
        return this == f12823d || this == f12832m || this == f12824e || this == f12826g || this == f12830k || this == f12828i || this == f12825f || this == f12827h || this == f12829j || this == f12831l;
    }

    /* renamed from: t */
    public final boolean m11920t(C8108d config) {
        Intrinsics.checkNotNullParameter(config, "config");
        switch (C7718b.f12846a[ordinal()]) {
            case 1:
            case 2:
            case 3:
                return false;
            case 4:
                return config.m12974f();
            case 5:
            case 6:
            case 7:
            case 8:
                return config.m12975g();
            default:
                return m11918n(config);
        }
    }

    /* renamed from: u */
    public final PointF m11921u(RectF bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        int i9 = C7718b.f12846a[ordinal()];
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? new PointF(bounds.centerX(), bounds.centerY()) : new PointF(bounds.left, bounds.top) : new PointF(bounds.right, bounds.top) : new PointF(bounds.left, bounds.bottom) : new PointF(bounds.right, bounds.bottom);
    }
}

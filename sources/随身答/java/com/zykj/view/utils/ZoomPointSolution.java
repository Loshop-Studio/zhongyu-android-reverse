package com.zykj.view.utils;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13412d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m13413d2 = {"Lcom/zykj/view/utils/ZoomPointSolution;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "a", "I", "getValue", "()I", "setValue", "(I)V", "b", "c", "d", "e", "f", "g", "h", "i", "j", "view_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class ZoomPointSolution {

    /* renamed from: b */
    public static final ZoomPointSolution f12913b = new ZoomPointSolution("TOP_LEFT", 0, 0);

    /* renamed from: c */
    public static final ZoomPointSolution f12914c = new ZoomPointSolution("TOP_RIGHT", 1, 1);

    /* renamed from: d */
    public static final ZoomPointSolution f12915d = new ZoomPointSolution("BOTTOM_LEFT", 2, 2);

    /* renamed from: e */
    public static final ZoomPointSolution f12916e = new ZoomPointSolution("BOTTOM_RIGHT", 3, 3);

    /* renamed from: f */
    public static final ZoomPointSolution f12917f = new ZoomPointSolution("CENTER_TOP", 4, 4);

    /* renamed from: g */
    public static final ZoomPointSolution f12918g = new ZoomPointSolution("CENTER_LEFT", 5, 5);

    /* renamed from: h */
    public static final ZoomPointSolution f12919h = new ZoomPointSolution("CENTER_RIGHT", 6, 6);

    /* renamed from: i */
    public static final ZoomPointSolution f12920i = new ZoomPointSolution("CENTER_BOTTOM", 7, 7);

    /* renamed from: j */
    public static final ZoomPointSolution f12921j = new ZoomPointSolution("CENTER", 8, 8);

    /* renamed from: k */
    public static final /* synthetic */ ZoomPointSolution[] f12922k;

    /* renamed from: l */
    public static final /* synthetic */ EnumEntries f12923l;

    /* renamed from: a, reason: from kotlin metadata */
    public int value;

    static {
        ZoomPointSolution[] zoomPointSolutionArrM12024a = m12024a();
        f12922k = zoomPointSolutionArrM12024a;
        f12923l = EnumEntriesKt.enumEntries(zoomPointSolutionArrM12024a);
    }

    public ZoomPointSolution(String str, int i9, int i10) {
        this.value = i10;
    }

    /* renamed from: a */
    public static final /* synthetic */ ZoomPointSolution[] m12024a() {
        return new ZoomPointSolution[]{f12913b, f12914c, f12915d, f12916e, f12917f, f12918g, f12919h, f12920i, f12921j};
    }

    public static ZoomPointSolution valueOf(String str) {
        return (ZoomPointSolution) Enum.valueOf(ZoomPointSolution.class, str);
    }

    public static ZoomPointSolution[] values() {
        return (ZoomPointSolution[]) f12922k.clone();
    }
}

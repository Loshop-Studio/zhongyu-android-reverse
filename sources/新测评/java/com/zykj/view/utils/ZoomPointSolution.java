package com.zykj.view.utils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13557d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m13558d2 = {"Lcom/zykj/view/utils/ZoomPointSolution;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "a", "I", "getValue", "()I", "setValue", "(I)V", "b", "c", "d", "e", "f", "g", "h", "i", "j", "view_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class ZoomPointSolution {

    /* renamed from: b */
    public static final ZoomPointSolution f11604b = new ZoomPointSolution("TOP_LEFT", 0, 0);

    /* renamed from: c */
    public static final ZoomPointSolution f11605c = new ZoomPointSolution("TOP_RIGHT", 1, 1);

    /* renamed from: d */
    public static final ZoomPointSolution f11606d = new ZoomPointSolution("BOTTOM_LEFT", 2, 2);

    /* renamed from: e */
    public static final ZoomPointSolution f11607e = new ZoomPointSolution("BOTTOM_RIGHT", 3, 3);

    /* renamed from: f */
    public static final ZoomPointSolution f11608f = new ZoomPointSolution("CENTER_TOP", 4, 4);

    /* renamed from: g */
    public static final ZoomPointSolution f11609g = new ZoomPointSolution("CENTER_LEFT", 5, 5);

    /* renamed from: h */
    public static final ZoomPointSolution f11610h = new ZoomPointSolution("CENTER_RIGHT", 6, 6);

    /* renamed from: i */
    public static final ZoomPointSolution f11611i = new ZoomPointSolution("CENTER_BOTTOM", 7, 7);

    /* renamed from: j */
    public static final ZoomPointSolution f11612j = new ZoomPointSolution("CENTER", 8, 8);

    /* renamed from: k */
    public static final /* synthetic */ ZoomPointSolution[] f11613k;

    /* renamed from: l */
    public static final /* synthetic */ EnumEntries f11614l;

    /* renamed from: a, reason: from kotlin metadata */
    public int value;

    static {
        ZoomPointSolution[] zoomPointSolutionArrM11466a = m11466a();
        f11613k = zoomPointSolutionArrM11466a;
        f11614l = EnumEntriesKt.enumEntries(zoomPointSolutionArrM11466a);
    }

    public ZoomPointSolution(String str, int i10, int i11) {
        this.value = i11;
    }

    /* renamed from: a */
    public static final /* synthetic */ ZoomPointSolution[] m11466a() {
        return new ZoomPointSolution[]{f11604b, f11605c, f11606d, f11607e, f11608f, f11609g, f11610h, f11611i, f11612j};
    }

    public static ZoomPointSolution valueOf(String str) {
        return (ZoomPointSolution) Enum.valueOf(ZoomPointSolution.class, str);
    }

    public static ZoomPointSolution[] values() {
        return (ZoomPointSolution[]) f11613k.clone();
    }
}

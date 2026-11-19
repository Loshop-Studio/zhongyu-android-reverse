package com.zykj.view.utils;

import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ZoomPointSolution {

    /* renamed from: b */
    public static final ZoomPointSolution f15557b = new ZoomPointSolution("TOP_LEFT", 0, 0);

    /* renamed from: c */
    public static final ZoomPointSolution f15558c = new ZoomPointSolution("TOP_RIGHT", 1, 1);

    /* renamed from: d */
    public static final ZoomPointSolution f15559d = new ZoomPointSolution("BOTTOM_LEFT", 2, 2);

    /* renamed from: e */
    public static final ZoomPointSolution f15560e = new ZoomPointSolution("BOTTOM_RIGHT", 3, 3);

    /* renamed from: f */
    public static final ZoomPointSolution f15561f = new ZoomPointSolution("CENTER_TOP", 4, 4);

    /* renamed from: g */
    public static final ZoomPointSolution f15562g = new ZoomPointSolution("CENTER_LEFT", 5, 5);

    /* renamed from: h */
    public static final ZoomPointSolution f15563h = new ZoomPointSolution("CENTER_RIGHT", 6, 6);

    /* renamed from: i */
    public static final ZoomPointSolution f15564i = new ZoomPointSolution("CENTER_BOTTOM", 7, 7);

    /* renamed from: j */
    public static final ZoomPointSolution f15565j = new ZoomPointSolution("CENTER", 8, 8);

    /* renamed from: k */
    public static final /* synthetic */ ZoomPointSolution[] f15566k;

    /* renamed from: l */
    public static final /* synthetic */ InterfaceC9760a f15567l;

    /* renamed from: a */
    public int f15568a;

    static {
        ZoomPointSolution[] zoomPointSolutionArrM13322a = m13322a();
        f15566k = zoomPointSolutionArrM13322a;
        f15567l = AbstractC9108a.m16085a(zoomPointSolutionArrM13322a);
    }

    public ZoomPointSolution(String str, int i10, int i11) {
        this.f15568a = i11;
    }

    /* renamed from: a */
    public static final /* synthetic */ ZoomPointSolution[] m13322a() {
        return new ZoomPointSolution[]{f15557b, f15558c, f15559d, f15560e, f15561f, f15562g, f15563h, f15564i, f15565j};
    }

    public static ZoomPointSolution valueOf(String str) {
        return (ZoomPointSolution) Enum.valueOf(ZoomPointSolution.class, str);
    }

    public static ZoomPointSolution[] values() {
        return (ZoomPointSolution[]) f15566k.clone();
    }
}

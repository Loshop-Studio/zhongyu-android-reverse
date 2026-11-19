package com.zykj.view.utils;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ZoomPointSolution {

    /* renamed from: d */
    public static final ZoomPointSolution f20771d = new ZoomPointSolution("TOP_LEFT", 0, 0);

    /* renamed from: e */
    public static final ZoomPointSolution f20772e = new ZoomPointSolution("TOP_RIGHT", 1, 1);

    /* renamed from: f */
    public static final ZoomPointSolution f20773f = new ZoomPointSolution("BOTTOM_LEFT", 2, 2);

    /* renamed from: g */
    public static final ZoomPointSolution f20774g = new ZoomPointSolution("BOTTOM_RIGHT", 3, 3);

    /* renamed from: h */
    public static final ZoomPointSolution f20775h = new ZoomPointSolution("CENTER_TOP", 4, 4);

    /* renamed from: i */
    public static final ZoomPointSolution f20776i = new ZoomPointSolution("CENTER_LEFT", 5, 5);

    /* renamed from: j */
    public static final ZoomPointSolution f20777j = new ZoomPointSolution("CENTER_RIGHT", 6, 6);

    /* renamed from: k */
    public static final ZoomPointSolution f20778k = new ZoomPointSolution("CENTER_BOTTOM", 7, 7);

    /* renamed from: l */
    public static final ZoomPointSolution f20779l = new ZoomPointSolution("CENTER", 8, 8);

    /* renamed from: m */
    public static final /* synthetic */ ZoomPointSolution[] f20780m;

    /* renamed from: n */
    public static final /* synthetic */ InterfaceC11943a f20781n;

    /* renamed from: c */
    public int f20782c;

    static {
        ZoomPointSolution[] zoomPointSolutionArrM17397a = m17397a();
        f20780m = zoomPointSolutionArrM17397a;
        f20781n = AbstractC9953a.m20230a(zoomPointSolutionArrM17397a);
    }

    public ZoomPointSolution(String str, int i10, int i11) {
        this.f20782c = i11;
    }

    /* renamed from: a */
    public static final /* synthetic */ ZoomPointSolution[] m17397a() {
        return new ZoomPointSolution[]{f20771d, f20772e, f20773f, f20774g, f20775h, f20776i, f20777j, f20778k, f20779l};
    }

    public static ZoomPointSolution valueOf(String str) {
        return (ZoomPointSolution) Enum.valueOf(ZoomPointSolution.class, str);
    }

    public static ZoomPointSolution[] values() {
        return (ZoomPointSolution[]) f20780m.clone();
    }
}

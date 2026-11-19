package com.friday.lecture.floatwindow;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class FloatWindowStatus {

    /* renamed from: c */
    public static final FloatWindowStatus f8677c = new FloatWindowStatus("SHOW_OPTIONS", 0);

    /* renamed from: d */
    public static final FloatWindowStatus f8678d = new FloatWindowStatus("SHOW_HOMEWORK", 1);

    /* renamed from: e */
    public static final FloatWindowStatus f8679e = new FloatWindowStatus("SHOW_SUBJECTIVE_ANSWER", 2);

    /* renamed from: f */
    public static final FloatWindowStatus f8680f = new FloatWindowStatus("SHOW_OBJECTIVE_ANSWER", 3);

    /* renamed from: g */
    public static final FloatWindowStatus f8681g = new FloatWindowStatus("SHOW_STUDENT_DEMO", 4);

    /* renamed from: h */
    public static final /* synthetic */ FloatWindowStatus[] f8682h;

    /* renamed from: i */
    public static final /* synthetic */ InterfaceC11943a f8683i;

    static {
        FloatWindowStatus[] floatWindowStatusArrM6521a = m6521a();
        f8682h = floatWindowStatusArrM6521a;
        f8683i = AbstractC9953a.m20230a(floatWindowStatusArrM6521a);
    }

    public FloatWindowStatus(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ FloatWindowStatus[] m6521a() {
        return new FloatWindowStatus[]{f8677c, f8678d, f8679e, f8680f, f8681g};
    }

    public static FloatWindowStatus valueOf(String str) {
        return (FloatWindowStatus) Enum.valueOf(FloatWindowStatus.class, str);
    }

    public static FloatWindowStatus[] values() {
        return (FloatWindowStatus[]) f8682h.clone();
    }
}

package com.friday.common.util;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class StudentState {

    /* renamed from: c */
    public static final StudentState f6163c = new StudentState("SCREEN_OFF_ONLINE", 0);

    /* renamed from: d */
    public static final StudentState f6164d = new StudentState("SCREEN_ON_ONLINE", 1);

    /* renamed from: e */
    public static final StudentState f6165e = new StudentState("OFFLINE", 2);

    /* renamed from: f */
    public static final /* synthetic */ StudentState[] f6166f;

    /* renamed from: g */
    public static final /* synthetic */ InterfaceC11943a f6167g;

    static {
        StudentState[] studentStateArrM5375a = m5375a();
        f6166f = studentStateArrM5375a;
        f6167g = AbstractC9953a.m20230a(studentStateArrM5375a);
    }

    public StudentState(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ StudentState[] m5375a() {
        return new StudentState[]{f6163c, f6164d, f6165e};
    }

    public static StudentState valueOf(String str) {
        return (StudentState) Enum.valueOf(StudentState.class, str);
    }

    public static StudentState[] values() {
        return (StudentState[]) f6166f.clone();
    }
}

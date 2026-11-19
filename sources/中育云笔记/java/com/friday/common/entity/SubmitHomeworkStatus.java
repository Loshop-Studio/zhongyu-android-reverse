package com.friday.common.entity;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SubmitHomeworkStatus {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
    private static final /* synthetic */ SubmitHomeworkStatus[] $VALUES;
    public static final SubmitHomeworkStatus NORMAL = new SubmitHomeworkStatus("NORMAL", 0);
    public static final SubmitHomeworkStatus TIME_UP = new SubmitHomeworkStatus("TIME_UP", 1);
    public static final SubmitHomeworkStatus END_CLASS = new SubmitHomeworkStatus("END_CLASS", 2);
    public static final SubmitHomeworkStatus ID_ERROR = new SubmitHomeworkStatus("ID_ERROR", 3);

    private static final /* synthetic */ SubmitHomeworkStatus[] $values() {
        return new SubmitHomeworkStatus[]{NORMAL, TIME_UP, END_CLASS, ID_ERROR};
    }

    static {
        SubmitHomeworkStatus[] submitHomeworkStatusArr$values = $values();
        $VALUES = submitHomeworkStatusArr$values;
        $ENTRIES = AbstractC9953a.m20230a(submitHomeworkStatusArr$values);
    }

    private SubmitHomeworkStatus(String str, int i10) {
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static SubmitHomeworkStatus valueOf(String str) {
        return (SubmitHomeworkStatus) Enum.valueOf(SubmitHomeworkStatus.class, str);
    }

    public static SubmitHomeworkStatus[] values() {
        return (SubmitHomeworkStatus[]) $VALUES.clone();
    }
}

package com.friday.common.entity;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HomeworkStatus {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
    private static final /* synthetic */ HomeworkStatus[] $VALUES;
    public static final HomeworkStatus UNFINISHED = new HomeworkStatus("UNFINISHED", 0);
    public static final HomeworkStatus SUBMITTED = new HomeworkStatus("SUBMITTED", 1);
    public static final HomeworkStatus TIME_UP = new HomeworkStatus("TIME_UP", 2);
    public static final HomeworkStatus END_CLASS = new HomeworkStatus("END_CLASS", 3);

    private static final /* synthetic */ HomeworkStatus[] $values() {
        return new HomeworkStatus[]{UNFINISHED, SUBMITTED, TIME_UP, END_CLASS};
    }

    static {
        HomeworkStatus[] homeworkStatusArr$values = $values();
        $VALUES = homeworkStatusArr$values;
        $ENTRIES = AbstractC9953a.m20230a(homeworkStatusArr$values);
    }

    private HomeworkStatus(String str, int i10) {
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static HomeworkStatus valueOf(String str) {
        return (HomeworkStatus) Enum.valueOf(HomeworkStatus.class, str);
    }

    public static HomeworkStatus[] values() {
        return (HomeworkStatus[]) $VALUES.clone();
    }
}

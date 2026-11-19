package com.zykj.study.bean.exercise;

import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ChoiceStatus {
    private static final /* synthetic */ InterfaceC9760a $ENTRIES;
    private static final /* synthetic */ ChoiceStatus[] $VALUES;
    public static final ChoiceStatus CUSTOM = new ChoiceStatus("CUSTOM", 0);
    public static final ChoiceStatus NULL = new ChoiceStatus("NULL", 1);
    public static final ChoiceStatus SELECTED = new ChoiceStatus("SELECTED", 2);
    public static final ChoiceStatus RIGHT = new ChoiceStatus("RIGHT", 3);
    public static final ChoiceStatus ERROR = new ChoiceStatus("ERROR", 4);

    private static final /* synthetic */ ChoiceStatus[] $values() {
        return new ChoiceStatus[]{CUSTOM, NULL, SELECTED, RIGHT, ERROR};
    }

    static {
        ChoiceStatus[] choiceStatusArr$values = $values();
        $VALUES = choiceStatusArr$values;
        $ENTRIES = AbstractC9108a.m16085a(choiceStatusArr$values);
    }

    private ChoiceStatus(String str, int i10) {
    }

    public static InterfaceC9760a getEntries() {
        return $ENTRIES;
    }

    public static ChoiceStatus valueOf(String str) {
        return (ChoiceStatus) Enum.valueOf(ChoiceStatus.class, str);
    }

    public static ChoiceStatus[] values() {
        return (ChoiceStatus[]) $VALUES.clone();
    }
}

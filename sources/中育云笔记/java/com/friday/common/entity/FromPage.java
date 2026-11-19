package com.friday.common.entity;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class FromPage {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
    private static final /* synthetic */ FromPage[] $VALUES;
    public static final FromPage FROM_NEWEST = new FromPage("FROM_NEWEST", 0);
    public static final FromPage FROM_FOLDER = new FromPage("FROM_FOLDER", 1);
    public static final FromPage FROM_SHARE = new FromPage("FROM_SHARE", 2);
    public static final FromPage NONE = new FromPage("NONE", 3);
    public static final FromPage FROM_CLASS = new FromPage("FROM_CLASS", 4);

    private static final /* synthetic */ FromPage[] $values() {
        return new FromPage[]{FROM_NEWEST, FROM_FOLDER, FROM_SHARE, NONE, FROM_CLASS};
    }

    static {
        FromPage[] fromPageArr$values = $values();
        $VALUES = fromPageArr$values;
        $ENTRIES = AbstractC9953a.m20230a(fromPageArr$values);
    }

    private FromPage(String str, int i10) {
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static FromPage valueOf(String str) {
        return (FromPage) Enum.valueOf(FromPage.class, str);
    }

    public static FromPage[] values() {
        return (FromPage[]) $VALUES.clone();
    }
}

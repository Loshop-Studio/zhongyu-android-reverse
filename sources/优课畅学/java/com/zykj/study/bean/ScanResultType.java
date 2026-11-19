package com.zykj.study.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.AbstractC9108a;
import p123h7.InterfaceC8721a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ScanResultType {
    private static final /* synthetic */ InterfaceC9760a $ENTRIES;
    private static final /* synthetic */ ScanResultType[] $VALUES;

    @SerializedName("0")
    @InterfaceC8721a
    public static final ScanResultType EDIT = new ScanResultType("EDIT", 0);

    @SerializedName("1")
    public static final ScanResultType CREATE_MICRO = new ScanResultType("CREATE_MICRO", 1);

    private static final /* synthetic */ ScanResultType[] $values() {
        return new ScanResultType[]{EDIT, CREATE_MICRO};
    }

    static {
        ScanResultType[] scanResultTypeArr$values = $values();
        $VALUES = scanResultTypeArr$values;
        $ENTRIES = AbstractC9108a.m16085a(scanResultTypeArr$values);
    }

    private ScanResultType(String str, int i10) {
    }

    public static InterfaceC9760a getEntries() {
        return $ENTRIES;
    }

    public static ScanResultType valueOf(String str) {
        return (ScanResultType) Enum.valueOf(ScanResultType.class, str);
    }

    public static ScanResultType[] values() {
        return (ScanResultType[]) $VALUES.clone();
    }
}

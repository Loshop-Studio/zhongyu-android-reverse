package com.friday.common.entity;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PayloadKey {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
    private static final /* synthetic */ PayloadKey[] $VALUES;
    public static final PayloadKey SELECTED = new PayloadKey("SELECTED", 0);
    public static final PayloadKey IN_CLASS = new PayloadKey("IN_CLASS", 1);
    public static final PayloadKey THUMBNAIL = new PayloadKey("THUMBNAIL", 2);

    private static final /* synthetic */ PayloadKey[] $values() {
        return new PayloadKey[]{SELECTED, IN_CLASS, THUMBNAIL};
    }

    static {
        PayloadKey[] payloadKeyArr$values = $values();
        $VALUES = payloadKeyArr$values;
        $ENTRIES = AbstractC9953a.m20230a(payloadKeyArr$values);
    }

    private PayloadKey(String str, int i10) {
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static PayloadKey valueOf(String str) {
        return (PayloadKey) Enum.valueOf(PayloadKey.class, str);
    }

    public static PayloadKey[] values() {
        return (PayloadKey[]) $VALUES.clone();
    }
}

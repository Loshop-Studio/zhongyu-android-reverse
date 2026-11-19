package com.zykj.study.bean;

import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class RoleType {
    private static final /* synthetic */ InterfaceC9760a $ENTRIES;
    private static final /* synthetic */ RoleType[] $VALUES;
    public static final RoleType TEACHER = new RoleType("TEACHER", 0);
    public static final RoleType STUDENT = new RoleType("STUDENT", 1);

    private static final /* synthetic */ RoleType[] $values() {
        return new RoleType[]{TEACHER, STUDENT};
    }

    static {
        RoleType[] roleTypeArr$values = $values();
        $VALUES = roleTypeArr$values;
        $ENTRIES = AbstractC9108a.m16085a(roleTypeArr$values);
    }

    private RoleType(String str, int i10) {
    }

    public static InterfaceC9760a getEntries() {
        return $ENTRIES;
    }

    public static RoleType valueOf(String str) {
        return (RoleType) Enum.valueOf(RoleType.class, str);
    }

    public static RoleType[] values() {
        return (RoleType[]) $VALUES.clone();
    }
}

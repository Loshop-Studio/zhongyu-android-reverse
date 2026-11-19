package com.zykj.lib.ota.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
/* loaded from: classes4.dex */
public final class AppType {
    private static final /* synthetic */ InterfaceC9760a $ENTRIES;
    private static final /* synthetic */ AppType[] $VALUES;

    @SerializedName("0")
    public static final AppType STUDENT = new AppType("STUDENT", 0);

    @SerializedName("1")
    public static final AppType TEACHER = new AppType("TEACHER", 1);

    private static final /* synthetic */ AppType[] $values() {
        return new AppType[]{STUDENT, TEACHER};
    }

    static {
        AppType[] appTypeArr$values = $values();
        $VALUES = appTypeArr$values;
        $ENTRIES = AbstractC9108a.m16085a(appTypeArr$values);
    }

    private AppType(String str, int i10) {
    }

    public static InterfaceC9760a getEntries() {
        return $ENTRIES;
    }

    public static AppType valueOf(String str) {
        return (AppType) Enum.valueOf(AppType.class, str);
    }

    public static AppType[] values() {
        return (AppType[]) $VALUES.clone();
    }
}

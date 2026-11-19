package com.zykj.huiwei.launcher.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(m7879d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/AppType;", "", "<init>", "(Ljava/lang/String;I)V", "STUDENT", "TEACHER", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class AppType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
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
        $ENTRIES = EnumEntriesKt.enumEntries(appTypeArr$values);
    }

    private AppType(String str, int i6) {
    }

    public static EnumEntries<AppType> getEntries() {
        return $ENTRIES;
    }

    public static AppType valueOf(String str) {
        return (AppType) Enum.valueOf(AppType.class, str);
    }

    public static AppType[] values() {
        return (AppType[]) $VALUES.clone();
    }
}

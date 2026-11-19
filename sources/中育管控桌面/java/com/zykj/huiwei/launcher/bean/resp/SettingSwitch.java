package com.zykj.huiwei.launcher.bean.resp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m7879d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/resp/SettingSwitch;", "", "<init>", "(Ljava/lang/String;I)V", "OPEN", "CLOSE", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class SettingSwitch {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SettingSwitch[] $VALUES;

    @SerializedName("1")
    public static final SettingSwitch OPEN = new SettingSwitch("OPEN", 0);

    @SerializedName("0")
    public static final SettingSwitch CLOSE = new SettingSwitch("CLOSE", 1);

    private static final /* synthetic */ SettingSwitch[] $values() {
        return new SettingSwitch[]{OPEN, CLOSE};
    }

    static {
        SettingSwitch[] settingSwitchArr$values = $values();
        $VALUES = settingSwitchArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(settingSwitchArr$values);
    }

    private SettingSwitch(String str, int i6) {
    }

    public static EnumEntries<SettingSwitch> getEntries() {
        return $ENTRIES;
    }

    public static SettingSwitch valueOf(String str) {
        return (SettingSwitch) Enum.valueOf(SettingSwitch.class, str);
    }

    public static SettingSwitch[] values() {
        return (SettingSwitch[]) $VALUES.clone();
    }
}

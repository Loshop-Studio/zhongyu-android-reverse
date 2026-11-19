package com.zykj.evaluation.bean.constant;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/RevisingResultEnum;", "", "<init>", "(Ljava/lang/String;I)V", "NOTHING", "ING", "RIGHT", "ERROR", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class RevisingResultEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RevisingResultEnum[] $VALUES;
    public static final RevisingResultEnum NOTHING = new RevisingResultEnum("NOTHING", 0);
    public static final RevisingResultEnum ING = new RevisingResultEnum("ING", 1);
    public static final RevisingResultEnum RIGHT = new RevisingResultEnum("RIGHT", 2);
    public static final RevisingResultEnum ERROR = new RevisingResultEnum("ERROR", 3);

    private static final /* synthetic */ RevisingResultEnum[] $values() {
        return new RevisingResultEnum[]{NOTHING, ING, RIGHT, ERROR};
    }

    static {
        RevisingResultEnum[] revisingResultEnumArr$values = $values();
        $VALUES = revisingResultEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(revisingResultEnumArr$values);
    }

    private RevisingResultEnum(String str, int i10) {
    }

    public static EnumEntries<RevisingResultEnum> getEntries() {
        return $ENTRIES;
    }

    public static RevisingResultEnum valueOf(String str) {
        return (RevisingResultEnum) Enum.valueOf(RevisingResultEnum.class, str);
    }

    public static RevisingResultEnum[] values() {
        return (RevisingResultEnum[]) $VALUES.clone();
    }
}

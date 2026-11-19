package com.zykj.evaluation.bean.constant;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/QuestionStateEnum;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR", "RIGHT", "REVISING_RIGHT", "NO_CORRECT", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class QuestionStateEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ QuestionStateEnum[] $VALUES;
    public static final QuestionStateEnum ERROR = new QuestionStateEnum("ERROR", 0);
    public static final QuestionStateEnum RIGHT = new QuestionStateEnum("RIGHT", 1);
    public static final QuestionStateEnum REVISING_RIGHT = new QuestionStateEnum("REVISING_RIGHT", 2);
    public static final QuestionStateEnum NO_CORRECT = new QuestionStateEnum("NO_CORRECT", 3);

    private static final /* synthetic */ QuestionStateEnum[] $values() {
        return new QuestionStateEnum[]{ERROR, RIGHT, REVISING_RIGHT, NO_CORRECT};
    }

    static {
        QuestionStateEnum[] questionStateEnumArr$values = $values();
        $VALUES = questionStateEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(questionStateEnumArr$values);
    }

    private QuestionStateEnum(String str, int i10) {
    }

    public static EnumEntries<QuestionStateEnum> getEntries() {
        return $ENTRIES;
    }

    public static QuestionStateEnum valueOf(String str) {
        return (QuestionStateEnum) Enum.valueOf(QuestionStateEnum.class, str);
    }

    public static QuestionStateEnum[] values() {
        return (QuestionStateEnum[]) $VALUES.clone();
    }
}

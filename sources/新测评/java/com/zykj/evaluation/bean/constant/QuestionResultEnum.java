package com.zykj.evaluation.bean.constant;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;", "", "<init>", "(Ljava/lang/String;I)V", "NO_CORRECT", "RIGHT", "NO_RIGHT", "ERROR", "REVISING_RIGHT", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class QuestionResultEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ QuestionResultEnum[] $VALUES;
    public static final QuestionResultEnum NO_CORRECT = new QuestionResultEnum("NO_CORRECT", 0);
    public static final QuestionResultEnum RIGHT = new QuestionResultEnum("RIGHT", 1);
    public static final QuestionResultEnum NO_RIGHT = new QuestionResultEnum("NO_RIGHT", 2);
    public static final QuestionResultEnum ERROR = new QuestionResultEnum("ERROR", 3);
    public static final QuestionResultEnum REVISING_RIGHT = new QuestionResultEnum("REVISING_RIGHT", 4);

    private static final /* synthetic */ QuestionResultEnum[] $values() {
        return new QuestionResultEnum[]{NO_CORRECT, RIGHT, NO_RIGHT, ERROR, REVISING_RIGHT};
    }

    static {
        QuestionResultEnum[] questionResultEnumArr$values = $values();
        $VALUES = questionResultEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(questionResultEnumArr$values);
    }

    private QuestionResultEnum(String str, int i10) {
    }

    public static EnumEntries<QuestionResultEnum> getEntries() {
        return $ENTRIES;
    }

    public static QuestionResultEnum valueOf(String str) {
        return (QuestionResultEnum) Enum.valueOf(QuestionResultEnum.class, str);
    }

    public static QuestionResultEnum[] values() {
        return (QuestionResultEnum[]) $VALUES.clone();
    }
}

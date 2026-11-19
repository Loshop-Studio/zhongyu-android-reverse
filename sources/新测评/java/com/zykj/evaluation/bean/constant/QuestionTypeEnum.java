package com.zykj.evaluation.bean.constant;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13557d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "<init>", "(Ljava/lang/String;II)V", "getType", "()I", "SINGLE", "MULTIPLE", "TRUEORFALSE", "FILLINBLANK", "QSTANDANSWER", "READING", "WRITING", "LISTENING", "COMPREHENSION", "SEVENCHOICESFIVE", "COMPOSITION", "Correction", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class QuestionTypeEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ QuestionTypeEnum[] $VALUES;
    private final int type;
    public static final QuestionTypeEnum SINGLE = new QuestionTypeEnum("SINGLE", 0, 1);
    public static final QuestionTypeEnum MULTIPLE = new QuestionTypeEnum("MULTIPLE", 1, 2);
    public static final QuestionTypeEnum TRUEORFALSE = new QuestionTypeEnum("TRUEORFALSE", 2, 3);
    public static final QuestionTypeEnum FILLINBLANK = new QuestionTypeEnum("FILLINBLANK", 3, 4);
    public static final QuestionTypeEnum QSTANDANSWER = new QuestionTypeEnum("QSTANDANSWER", 4, 5);
    public static final QuestionTypeEnum READING = new QuestionTypeEnum("READING", 5, 6);
    public static final QuestionTypeEnum WRITING = new QuestionTypeEnum("WRITING", 6, 7);
    public static final QuestionTypeEnum LISTENING = new QuestionTypeEnum("LISTENING", 7, 8);
    public static final QuestionTypeEnum COMPREHENSION = new QuestionTypeEnum("COMPREHENSION", 8, 9);
    public static final QuestionTypeEnum SEVENCHOICESFIVE = new QuestionTypeEnum("SEVENCHOICESFIVE", 9, 10);
    public static final QuestionTypeEnum COMPOSITION = new QuestionTypeEnum("COMPOSITION", 10, 11);
    public static final QuestionTypeEnum Correction = new QuestionTypeEnum("Correction", 11, 12);

    private static final /* synthetic */ QuestionTypeEnum[] $values() {
        return new QuestionTypeEnum[]{SINGLE, MULTIPLE, TRUEORFALSE, FILLINBLANK, QSTANDANSWER, READING, WRITING, LISTENING, COMPREHENSION, SEVENCHOICESFIVE, COMPOSITION, Correction};
    }

    static {
        QuestionTypeEnum[] questionTypeEnumArr$values = $values();
        $VALUES = questionTypeEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(questionTypeEnumArr$values);
    }

    private QuestionTypeEnum(String str, int i10, int i11) {
        this.type = i11;
    }

    public static EnumEntries<QuestionTypeEnum> getEntries() {
        return $ENTRIES;
    }

    public static QuestionTypeEnum valueOf(String str) {
        return (QuestionTypeEnum) Enum.valueOf(QuestionTypeEnum.class, str);
    }

    public static QuestionTypeEnum[] values() {
        return (QuestionTypeEnum[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}

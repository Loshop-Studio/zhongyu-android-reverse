package com.zykj.study.bean.exercise;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.annotations.SerializedName;
import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class QuestionType {
    private static final /* synthetic */ InterfaceC9760a $ENTRIES;
    private static final /* synthetic */ QuestionType[] $VALUES;

    @SerializedName("0")
    public static final QuestionType SINGLE_CHOICE = new QuestionType("SINGLE_CHOICE", 0);

    @SerializedName("1")
    public static final QuestionType MULTIPLE_CHOICE = new QuestionType("MULTIPLE_CHOICE", 1);

    @SerializedName(ExifInterface.GPS_MEASUREMENT_2D)
    public static final QuestionType ANSWER = new QuestionType("ANSWER", 2);

    private static final /* synthetic */ QuestionType[] $values() {
        return new QuestionType[]{SINGLE_CHOICE, MULTIPLE_CHOICE, ANSWER};
    }

    static {
        QuestionType[] questionTypeArr$values = $values();
        $VALUES = questionTypeArr$values;
        $ENTRIES = AbstractC9108a.m16085a(questionTypeArr$values);
    }

    private QuestionType(String str, int i10) {
    }

    public static InterfaceC9760a getEntries() {
        return $ENTRIES;
    }

    public static QuestionType valueOf(String str) {
        return (QuestionType) Enum.valueOf(QuestionType.class, str);
    }

    public static QuestionType[] values() {
        return (QuestionType[]) $VALUES.clone();
    }
}

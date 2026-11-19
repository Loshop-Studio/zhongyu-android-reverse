package com.zykj.study.bean.exercise;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.annotations.SerializedName;
import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class QuestionStatus {
    private static final /* synthetic */ InterfaceC9760a $ENTRIES;
    private static final /* synthetic */ QuestionStatus[] $VALUES;

    @SerializedName("0")
    public static final QuestionStatus UN_ANSWERED = new QuestionStatus("UN_ANSWERED", 0);

    @SerializedName("1")
    public static final QuestionStatus ANSWERED = new QuestionStatus("ANSWERED", 1);

    @SerializedName(ExifInterface.GPS_MEASUREMENT_2D)
    public static final QuestionStatus TO_BE_REVISED = new QuestionStatus("TO_BE_REVISED", 2);

    private static final /* synthetic */ QuestionStatus[] $values() {
        return new QuestionStatus[]{UN_ANSWERED, ANSWERED, TO_BE_REVISED};
    }

    static {
        QuestionStatus[] questionStatusArr$values = $values();
        $VALUES = questionStatusArr$values;
        $ENTRIES = AbstractC9108a.m16085a(questionStatusArr$values);
    }

    private QuestionStatus(String str, int i10) {
    }

    public static InterfaceC9760a getEntries() {
        return $ENTRIES;
    }

    public static QuestionStatus valueOf(String str) {
        return (QuestionStatus) Enum.valueOf(QuestionStatus.class, str);
    }

    public static QuestionStatus[] values() {
        return (QuestionStatus[]) $VALUES.clone();
    }
}

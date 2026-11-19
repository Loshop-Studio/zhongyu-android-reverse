package com.zykj.study.bean.exercise;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.annotations.SerializedName;
import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ExerciseType {
    private static final /* synthetic */ InterfaceC9760a $ENTRIES;
    private static final /* synthetic */ ExerciseType[] $VALUES;

    @SerializedName("0")
    public static final ExerciseType NOT_STARTED = new ExerciseType("NOT_STARTED", 0);

    @SerializedName("1")
    public static final ExerciseType ONGOING = new ExerciseType("ONGOING", 1);

    @SerializedName(ExifInterface.GPS_MEASUREMENT_2D)
    public static final ExerciseType COMPLETED = new ExerciseType("COMPLETED", 2);

    private static final /* synthetic */ ExerciseType[] $values() {
        return new ExerciseType[]{NOT_STARTED, ONGOING, COMPLETED};
    }

    static {
        ExerciseType[] exerciseTypeArr$values = $values();
        $VALUES = exerciseTypeArr$values;
        $ENTRIES = AbstractC9108a.m16085a(exerciseTypeArr$values);
    }

    private ExerciseType(String str, int i10) {
    }

    public static InterfaceC9760a getEntries() {
        return $ENTRIES;
    }

    public static ExerciseType valueOf(String str) {
        return (ExerciseType) Enum.valueOf(ExerciseType.class, str);
    }

    public static ExerciseType[] values() {
        return (ExerciseType[]) $VALUES.clone();
    }
}

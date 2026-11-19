package com.zykj.study.bean.course;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class StudyStatus {
    private static final /* synthetic */ InterfaceC9760a $ENTRIES;
    private static final /* synthetic */ StudyStatus[] $VALUES;

    @SerializedName("0")
    public static final StudyStatus NOT_COMPLETE = new StudyStatus("NOT_COMPLETE", 0);

    @SerializedName("1")
    public static final StudyStatus COMPLETE = new StudyStatus("COMPLETE", 1);

    private static final /* synthetic */ StudyStatus[] $values() {
        return new StudyStatus[]{NOT_COMPLETE, COMPLETE};
    }

    static {
        StudyStatus[] studyStatusArr$values = $values();
        $VALUES = studyStatusArr$values;
        $ENTRIES = AbstractC9108a.m16085a(studyStatusArr$values);
    }

    private StudyStatus(String str, int i10) {
    }

    public static InterfaceC9760a getEntries() {
        return $ENTRIES;
    }

    public static StudyStatus valueOf(String str) {
        return (StudyStatus) Enum.valueOf(StudyStatus.class, str);
    }

    public static StudyStatus[] values() {
        return (StudyStatus[]) $VALUES.clone();
    }
}

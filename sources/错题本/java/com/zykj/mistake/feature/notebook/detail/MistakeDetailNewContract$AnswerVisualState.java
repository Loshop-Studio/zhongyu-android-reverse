package com.zykj.mistake.feature.notebook.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m5110d2 = {"com/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState", "", "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;", "EMPTY", "UNCORRECTED", "CORRECT", "WRONG", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MistakeDetailNewContract$AnswerVisualState {
    public static final MistakeDetailNewContract$AnswerVisualState CORRECT;
    public static final MistakeDetailNewContract$AnswerVisualState EMPTY;
    public static final MistakeDetailNewContract$AnswerVisualState UNCORRECTED;
    public static final MistakeDetailNewContract$AnswerVisualState WRONG;

    /* renamed from: a */
    public static final /* synthetic */ MistakeDetailNewContract$AnswerVisualState[] f6862a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f6863b;

    static {
        MistakeDetailNewContract$AnswerVisualState mistakeDetailNewContract$AnswerVisualState = new MistakeDetailNewContract$AnswerVisualState("EMPTY", 0);
        EMPTY = mistakeDetailNewContract$AnswerVisualState;
        MistakeDetailNewContract$AnswerVisualState mistakeDetailNewContract$AnswerVisualState2 = new MistakeDetailNewContract$AnswerVisualState("UNCORRECTED", 1);
        UNCORRECTED = mistakeDetailNewContract$AnswerVisualState2;
        MistakeDetailNewContract$AnswerVisualState mistakeDetailNewContract$AnswerVisualState3 = new MistakeDetailNewContract$AnswerVisualState("CORRECT", 2);
        CORRECT = mistakeDetailNewContract$AnswerVisualState3;
        MistakeDetailNewContract$AnswerVisualState mistakeDetailNewContract$AnswerVisualState4 = new MistakeDetailNewContract$AnswerVisualState("WRONG", 3);
        WRONG = mistakeDetailNewContract$AnswerVisualState4;
        MistakeDetailNewContract$AnswerVisualState[] mistakeDetailNewContract$AnswerVisualStateArr = {mistakeDetailNewContract$AnswerVisualState, mistakeDetailNewContract$AnswerVisualState2, mistakeDetailNewContract$AnswerVisualState3, mistakeDetailNewContract$AnswerVisualState4};
        f6862a = mistakeDetailNewContract$AnswerVisualStateArr;
        f6863b = AbstractC5817a.m5310a(mistakeDetailNewContract$AnswerVisualStateArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f6863b;
    }

    public static MistakeDetailNewContract$AnswerVisualState valueOf(String str) {
        return (MistakeDetailNewContract$AnswerVisualState) Enum.valueOf(MistakeDetailNewContract$AnswerVisualState.class, str);
    }

    public static MistakeDetailNewContract$AnswerVisualState[] values() {
        return (MistakeDetailNewContract$AnswerVisualState[]) f6862a.clone();
    }
}

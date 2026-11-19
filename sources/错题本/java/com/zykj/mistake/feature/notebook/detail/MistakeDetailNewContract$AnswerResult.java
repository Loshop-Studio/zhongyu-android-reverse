package com.zykj.mistake.feature.notebook.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m5110d2 = {"com/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult", "", "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;", "NONE", "CORRECT", "WRONG", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MistakeDetailNewContract$AnswerResult {
    public static final MistakeDetailNewContract$AnswerResult CORRECT;
    public static final MistakeDetailNewContract$AnswerResult NONE;
    public static final MistakeDetailNewContract$AnswerResult WRONG;

    /* renamed from: a */
    public static final /* synthetic */ MistakeDetailNewContract$AnswerResult[] f6860a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f6861b;

    static {
        MistakeDetailNewContract$AnswerResult mistakeDetailNewContract$AnswerResult = new MistakeDetailNewContract$AnswerResult("NONE", 0);
        NONE = mistakeDetailNewContract$AnswerResult;
        MistakeDetailNewContract$AnswerResult mistakeDetailNewContract$AnswerResult2 = new MistakeDetailNewContract$AnswerResult("CORRECT", 1);
        CORRECT = mistakeDetailNewContract$AnswerResult2;
        MistakeDetailNewContract$AnswerResult mistakeDetailNewContract$AnswerResult3 = new MistakeDetailNewContract$AnswerResult("WRONG", 2);
        WRONG = mistakeDetailNewContract$AnswerResult3;
        MistakeDetailNewContract$AnswerResult[] mistakeDetailNewContract$AnswerResultArr = {mistakeDetailNewContract$AnswerResult, mistakeDetailNewContract$AnswerResult2, mistakeDetailNewContract$AnswerResult3};
        f6860a = mistakeDetailNewContract$AnswerResultArr;
        f6861b = AbstractC5817a.m5310a(mistakeDetailNewContract$AnswerResultArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f6861b;
    }

    public static MistakeDetailNewContract$AnswerResult valueOf(String str) {
        return (MistakeDetailNewContract$AnswerResult) Enum.valueOf(MistakeDetailNewContract$AnswerResult.class, str);
    }

    public static MistakeDetailNewContract$AnswerResult[] values() {
        return (MistakeDetailNewContract$AnswerResult[]) f6860a.clone();
    }
}

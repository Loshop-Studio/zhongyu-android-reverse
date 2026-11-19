package com.zykj.mistake.feature.notebook.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m5110d2 = {"com/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerDisplayType", "", "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerDisplayType;", "TEXT", "IMAGE", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MistakeDetailNewContract$AnswerDisplayType {
    public static final MistakeDetailNewContract$AnswerDisplayType IMAGE;
    public static final MistakeDetailNewContract$AnswerDisplayType TEXT;

    /* renamed from: a */
    public static final /* synthetic */ MistakeDetailNewContract$AnswerDisplayType[] f6858a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f6859b;

    static {
        MistakeDetailNewContract$AnswerDisplayType mistakeDetailNewContract$AnswerDisplayType = new MistakeDetailNewContract$AnswerDisplayType("TEXT", 0);
        TEXT = mistakeDetailNewContract$AnswerDisplayType;
        MistakeDetailNewContract$AnswerDisplayType mistakeDetailNewContract$AnswerDisplayType2 = new MistakeDetailNewContract$AnswerDisplayType("IMAGE", 1);
        IMAGE = mistakeDetailNewContract$AnswerDisplayType2;
        MistakeDetailNewContract$AnswerDisplayType[] mistakeDetailNewContract$AnswerDisplayTypeArr = {mistakeDetailNewContract$AnswerDisplayType, mistakeDetailNewContract$AnswerDisplayType2};
        f6858a = mistakeDetailNewContract$AnswerDisplayTypeArr;
        f6859b = AbstractC5817a.m5310a(mistakeDetailNewContract$AnswerDisplayTypeArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f6859b;
    }

    public static MistakeDetailNewContract$AnswerDisplayType valueOf(String str) {
        return (MistakeDetailNewContract$AnswerDisplayType) Enum.valueOf(MistakeDetailNewContract$AnswerDisplayType.class, str);
    }

    public static MistakeDetailNewContract$AnswerDisplayType[] values() {
        return (MistakeDetailNewContract$AnswerDisplayType[]) f6858a.clone();
    }
}

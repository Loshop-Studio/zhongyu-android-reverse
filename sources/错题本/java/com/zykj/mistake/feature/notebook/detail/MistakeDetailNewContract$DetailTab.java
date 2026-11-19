package com.zykj.mistake.feature.notebook.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m5110d2 = {"com/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab", "", "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;", "MY_ANSWER", "SUPPLEMENT", "NOTE", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MistakeDetailNewContract$DetailTab {
    public static final MistakeDetailNewContract$DetailTab MY_ANSWER;
    public static final MistakeDetailNewContract$DetailTab NOTE;
    public static final MistakeDetailNewContract$DetailTab SUPPLEMENT;

    /* renamed from: a */
    public static final /* synthetic */ MistakeDetailNewContract$DetailTab[] f6866a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f6867b;

    static {
        MistakeDetailNewContract$DetailTab mistakeDetailNewContract$DetailTab = new MistakeDetailNewContract$DetailTab("MY_ANSWER", 0);
        MY_ANSWER = mistakeDetailNewContract$DetailTab;
        MistakeDetailNewContract$DetailTab mistakeDetailNewContract$DetailTab2 = new MistakeDetailNewContract$DetailTab("SUPPLEMENT", 1);
        SUPPLEMENT = mistakeDetailNewContract$DetailTab2;
        MistakeDetailNewContract$DetailTab mistakeDetailNewContract$DetailTab3 = new MistakeDetailNewContract$DetailTab("NOTE", 2);
        NOTE = mistakeDetailNewContract$DetailTab3;
        MistakeDetailNewContract$DetailTab[] mistakeDetailNewContract$DetailTabArr = {mistakeDetailNewContract$DetailTab, mistakeDetailNewContract$DetailTab2, mistakeDetailNewContract$DetailTab3};
        f6866a = mistakeDetailNewContract$DetailTabArr;
        f6867b = AbstractC5817a.m5310a(mistakeDetailNewContract$DetailTabArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f6867b;
    }

    public static MistakeDetailNewContract$DetailTab valueOf(String str) {
        return (MistakeDetailNewContract$DetailTab) Enum.valueOf(MistakeDetailNewContract$DetailTab.class, str);
    }

    public static MistakeDetailNewContract$DetailTab[] values() {
        return (MistakeDetailNewContract$DetailTab[]) f6866a.clone();
    }
}

package com.zykj.mistake.feature.notebook.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m5110d2 = {"com/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode", "", "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;", "NORMAL", "REVIEW_RECOMMEND", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MistakeDetailNewContract$EntryMode {
    public static final MistakeDetailNewContract$EntryMode NORMAL;
    public static final MistakeDetailNewContract$EntryMode REVIEW_RECOMMEND;

    /* renamed from: a */
    public static final /* synthetic */ MistakeDetailNewContract$EntryMode[] f6870a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f6871b;

    static {
        MistakeDetailNewContract$EntryMode mistakeDetailNewContract$EntryMode = new MistakeDetailNewContract$EntryMode("NORMAL", 0);
        NORMAL = mistakeDetailNewContract$EntryMode;
        MistakeDetailNewContract$EntryMode mistakeDetailNewContract$EntryMode2 = new MistakeDetailNewContract$EntryMode("REVIEW_RECOMMEND", 1);
        REVIEW_RECOMMEND = mistakeDetailNewContract$EntryMode2;
        MistakeDetailNewContract$EntryMode[] mistakeDetailNewContract$EntryModeArr = {mistakeDetailNewContract$EntryMode, mistakeDetailNewContract$EntryMode2};
        f6870a = mistakeDetailNewContract$EntryModeArr;
        f6871b = AbstractC5817a.m5310a(mistakeDetailNewContract$EntryModeArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f6871b;
    }

    public static MistakeDetailNewContract$EntryMode valueOf(String str) {
        return (MistakeDetailNewContract$EntryMode) Enum.valueOf(MistakeDetailNewContract$EntryMode.class, str);
    }

    public static MistakeDetailNewContract$EntryMode[] values() {
        return (MistakeDetailNewContract$EntryMode[]) f6870a.clone();
    }
}

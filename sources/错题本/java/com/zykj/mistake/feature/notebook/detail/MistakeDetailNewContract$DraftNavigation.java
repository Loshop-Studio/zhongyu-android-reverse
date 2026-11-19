package com.zykj.mistake.feature.notebook.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m5110d2 = {"com/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation", "", "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;", "BACK", "PREV", "NEXT", "END_REVIEW", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MistakeDetailNewContract$DraftNavigation {
    public static final MistakeDetailNewContract$DraftNavigation BACK;
    public static final MistakeDetailNewContract$DraftNavigation END_REVIEW;
    public static final MistakeDetailNewContract$DraftNavigation NEXT;
    public static final MistakeDetailNewContract$DraftNavigation PREV;

    /* renamed from: a */
    public static final /* synthetic */ MistakeDetailNewContract$DraftNavigation[] f6868a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f6869b;

    static {
        MistakeDetailNewContract$DraftNavigation mistakeDetailNewContract$DraftNavigation = new MistakeDetailNewContract$DraftNavigation("BACK", 0);
        BACK = mistakeDetailNewContract$DraftNavigation;
        MistakeDetailNewContract$DraftNavigation mistakeDetailNewContract$DraftNavigation2 = new MistakeDetailNewContract$DraftNavigation("PREV", 1);
        PREV = mistakeDetailNewContract$DraftNavigation2;
        MistakeDetailNewContract$DraftNavigation mistakeDetailNewContract$DraftNavigation3 = new MistakeDetailNewContract$DraftNavigation("NEXT", 2);
        NEXT = mistakeDetailNewContract$DraftNavigation3;
        MistakeDetailNewContract$DraftNavigation mistakeDetailNewContract$DraftNavigation4 = new MistakeDetailNewContract$DraftNavigation("END_REVIEW", 3);
        END_REVIEW = mistakeDetailNewContract$DraftNavigation4;
        MistakeDetailNewContract$DraftNavigation[] mistakeDetailNewContract$DraftNavigationArr = {mistakeDetailNewContract$DraftNavigation, mistakeDetailNewContract$DraftNavigation2, mistakeDetailNewContract$DraftNavigation3, mistakeDetailNewContract$DraftNavigation4};
        f6868a = mistakeDetailNewContract$DraftNavigationArr;
        f6869b = AbstractC5817a.m5310a(mistakeDetailNewContract$DraftNavigationArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f6869b;
    }

    public static MistakeDetailNewContract$DraftNavigation valueOf(String str) {
        return (MistakeDetailNewContract$DraftNavigation) Enum.valueOf(MistakeDetailNewContract$DraftNavigation.class, str);
    }

    public static MistakeDetailNewContract$DraftNavigation[] values() {
        return (MistakeDetailNewContract$DraftNavigation[]) f6868a.clone();
    }
}

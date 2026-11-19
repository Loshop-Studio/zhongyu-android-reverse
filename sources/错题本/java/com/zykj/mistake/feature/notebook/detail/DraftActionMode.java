package com.zykj.mistake.feature.notebook.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m5110d2 = {"Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;", "", "SELECT", "PEN", "LINE", "DOTTED_LINE", "ERASER", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class DraftActionMode {
    public static final DraftActionMode DOTTED_LINE;
    public static final DraftActionMode ERASER;
    public static final DraftActionMode LINE;
    public static final DraftActionMode PEN;
    public static final DraftActionMode SELECT;

    /* renamed from: a */
    public static final /* synthetic */ DraftActionMode[] f6851a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f6852b;

    static {
        DraftActionMode draftActionMode = new DraftActionMode("SELECT", 0);
        SELECT = draftActionMode;
        DraftActionMode draftActionMode2 = new DraftActionMode("PEN", 1);
        PEN = draftActionMode2;
        DraftActionMode draftActionMode3 = new DraftActionMode("LINE", 2);
        LINE = draftActionMode3;
        DraftActionMode draftActionMode4 = new DraftActionMode("DOTTED_LINE", 3);
        DOTTED_LINE = draftActionMode4;
        DraftActionMode draftActionMode5 = new DraftActionMode("ERASER", 4);
        ERASER = draftActionMode5;
        DraftActionMode[] draftActionModeArr = {draftActionMode, draftActionMode2, draftActionMode3, draftActionMode4, draftActionMode5};
        f6851a = draftActionModeArr;
        f6852b = AbstractC5817a.m5310a(draftActionModeArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f6852b;
    }

    public static DraftActionMode valueOf(String str) {
        return (DraftActionMode) Enum.valueOf(DraftActionMode.class, str);
    }

    public static DraftActionMode[] values() {
        return (DraftActionMode[]) f6851a.clone();
    }
}

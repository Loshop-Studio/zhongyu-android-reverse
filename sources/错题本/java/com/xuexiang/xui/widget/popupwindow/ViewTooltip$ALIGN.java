package com.xuexiang.xui.widget.popupwindow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ViewTooltip$ALIGN {
    public static final ViewTooltip$ALIGN CENTER;
    public static final ViewTooltip$ALIGN START;

    /* renamed from: a */
    public static final /* synthetic */ ViewTooltip$ALIGN[] f4609a;

    static {
        ViewTooltip$ALIGN viewTooltip$ALIGN = new ViewTooltip$ALIGN("START", 0);
        START = viewTooltip$ALIGN;
        ViewTooltip$ALIGN viewTooltip$ALIGN2 = new ViewTooltip$ALIGN("CENTER", 1);
        CENTER = viewTooltip$ALIGN2;
        f4609a = new ViewTooltip$ALIGN[]{viewTooltip$ALIGN, viewTooltip$ALIGN2};
    }

    public static ViewTooltip$ALIGN valueOf(String str) {
        return (ViewTooltip$ALIGN) Enum.valueOf(ViewTooltip$ALIGN.class, str);
    }

    public static ViewTooltip$ALIGN[] values() {
        return (ViewTooltip$ALIGN[]) f4609a.clone();
    }
}

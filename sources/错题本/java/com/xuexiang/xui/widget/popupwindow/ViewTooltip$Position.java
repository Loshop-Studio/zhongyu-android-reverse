package com.xuexiang.xui.widget.popupwindow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ViewTooltip$Position {
    public static final ViewTooltip$Position BOTTOM;
    public static final ViewTooltip$Position LEFT;
    public static final ViewTooltip$Position RIGHT;
    public static final ViewTooltip$Position TOP;

    /* renamed from: a */
    public static final /* synthetic */ ViewTooltip$Position[] f4610a;

    static {
        ViewTooltip$Position viewTooltip$Position = new ViewTooltip$Position("LEFT", 0);
        LEFT = viewTooltip$Position;
        ViewTooltip$Position viewTooltip$Position2 = new ViewTooltip$Position("RIGHT", 1);
        RIGHT = viewTooltip$Position2;
        ViewTooltip$Position viewTooltip$Position3 = new ViewTooltip$Position("TOP", 2);
        TOP = viewTooltip$Position3;
        ViewTooltip$Position viewTooltip$Position4 = new ViewTooltip$Position("BOTTOM", 3);
        BOTTOM = viewTooltip$Position4;
        f4610a = new ViewTooltip$Position[]{viewTooltip$Position, viewTooltip$Position2, viewTooltip$Position3, viewTooltip$Position4};
    }

    public static ViewTooltip$Position valueOf(String str) {
        return (ViewTooltip$Position) Enum.valueOf(ViewTooltip$Position.class, str);
    }

    public static ViewTooltip$Position[] values() {
        return (ViewTooltip$Position[]) f4610a.clone();
    }
}

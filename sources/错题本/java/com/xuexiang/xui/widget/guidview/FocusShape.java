package com.xuexiang.xui.widget.guidview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class FocusShape {
    public static final FocusShape CIRCLE;
    public static final FocusShape ROUNDED_RECTANGLE;

    /* renamed from: a */
    public static final /* synthetic */ FocusShape[] f4319a;

    static {
        FocusShape focusShape = new FocusShape("CIRCLE", 0);
        CIRCLE = focusShape;
        FocusShape focusShape2 = new FocusShape("ROUNDED_RECTANGLE", 1);
        ROUNDED_RECTANGLE = focusShape2;
        f4319a = new FocusShape[]{focusShape, focusShape2};
    }

    public static FocusShape valueOf(String str) {
        return (FocusShape) Enum.valueOf(FocusShape.class, str);
    }

    public static FocusShape[] values() {
        return (FocusShape[]) f4319a.clone();
    }
}

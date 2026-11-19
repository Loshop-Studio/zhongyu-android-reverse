package com.xuexiang.xui.widget.imageview.preview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PreviewBuilder$IndicatorType {
    public static final PreviewBuilder$IndicatorType Dot;
    public static final PreviewBuilder$IndicatorType Number;

    /* renamed from: a */
    public static final /* synthetic */ PreviewBuilder$IndicatorType[] f4440a;

    static {
        PreviewBuilder$IndicatorType previewBuilder$IndicatorType = new PreviewBuilder$IndicatorType("Dot", 0);
        Dot = previewBuilder$IndicatorType;
        PreviewBuilder$IndicatorType previewBuilder$IndicatorType2 = new PreviewBuilder$IndicatorType("Number", 1);
        Number = previewBuilder$IndicatorType2;
        f4440a = new PreviewBuilder$IndicatorType[]{previewBuilder$IndicatorType, previewBuilder$IndicatorType2};
    }

    public static PreviewBuilder$IndicatorType valueOf(String str) {
        return (PreviewBuilder$IndicatorType) Enum.valueOf(PreviewBuilder$IndicatorType.class, str);
    }

    public static PreviewBuilder$IndicatorType[] values() {
        return (PreviewBuilder$IndicatorType[]) f4440a.clone();
    }
}

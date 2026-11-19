package com.xuexiang.xui.widget.imageview.edit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PhotoFilter {
    public static final PhotoFilter AUTO_FIX;
    public static final PhotoFilter BLACK_WHITE;
    public static final PhotoFilter BRIGHTNESS;
    public static final PhotoFilter CONTRAST;
    public static final PhotoFilter CROSS_PROCESS;
    public static final PhotoFilter DOCUMENTARY;
    public static final PhotoFilter DUE_TONE;
    public static final PhotoFilter FILL_LIGHT;
    public static final PhotoFilter FISH_EYE;
    public static final PhotoFilter FLIP_HORIZONTAL;
    public static final PhotoFilter FLIP_VERTICAL;
    public static final PhotoFilter GRAIN;
    public static final PhotoFilter GRAY_SCALE;
    public static final PhotoFilter LOMISH;
    public static final PhotoFilter NEGATIVE;
    public static final PhotoFilter NONE;
    public static final PhotoFilter POSTERIZE;
    public static final PhotoFilter ROTATE;
    public static final PhotoFilter SATURATE;
    public static final PhotoFilter SEPIA;
    public static final PhotoFilter SHARPEN;
    public static final PhotoFilter TEMPERATURE;
    public static final PhotoFilter TINT;
    public static final PhotoFilter VIGNETTE;

    /* renamed from: a */
    public static final /* synthetic */ PhotoFilter[] f4404a;

    static {
        PhotoFilter photoFilter = new PhotoFilter("NONE", 0);
        NONE = photoFilter;
        PhotoFilter photoFilter2 = new PhotoFilter("AUTO_FIX", 1);
        AUTO_FIX = photoFilter2;
        PhotoFilter photoFilter3 = new PhotoFilter("BLACK_WHITE", 2);
        BLACK_WHITE = photoFilter3;
        PhotoFilter photoFilter4 = new PhotoFilter("BRIGHTNESS", 3);
        BRIGHTNESS = photoFilter4;
        PhotoFilter photoFilter5 = new PhotoFilter("CONTRAST", 4);
        CONTRAST = photoFilter5;
        PhotoFilter photoFilter6 = new PhotoFilter("CROSS_PROCESS", 5);
        CROSS_PROCESS = photoFilter6;
        PhotoFilter photoFilter7 = new PhotoFilter("DOCUMENTARY", 6);
        DOCUMENTARY = photoFilter7;
        PhotoFilter photoFilter8 = new PhotoFilter("DUE_TONE", 7);
        DUE_TONE = photoFilter8;
        PhotoFilter photoFilter9 = new PhotoFilter("FILL_LIGHT", 8);
        FILL_LIGHT = photoFilter9;
        PhotoFilter photoFilter10 = new PhotoFilter("FISH_EYE", 9);
        FISH_EYE = photoFilter10;
        PhotoFilter photoFilter11 = new PhotoFilter("FLIP_VERTICAL", 10);
        FLIP_VERTICAL = photoFilter11;
        PhotoFilter photoFilter12 = new PhotoFilter("FLIP_HORIZONTAL", 11);
        FLIP_HORIZONTAL = photoFilter12;
        PhotoFilter photoFilter13 = new PhotoFilter("GRAIN", 12);
        GRAIN = photoFilter13;
        PhotoFilter photoFilter14 = new PhotoFilter("GRAY_SCALE", 13);
        GRAY_SCALE = photoFilter14;
        PhotoFilter photoFilter15 = new PhotoFilter("LOMISH", 14);
        LOMISH = photoFilter15;
        PhotoFilter photoFilter16 = new PhotoFilter("NEGATIVE", 15);
        NEGATIVE = photoFilter16;
        PhotoFilter photoFilter17 = new PhotoFilter("POSTERIZE", 16);
        POSTERIZE = photoFilter17;
        PhotoFilter photoFilter18 = new PhotoFilter("ROTATE", 17);
        ROTATE = photoFilter18;
        PhotoFilter photoFilter19 = new PhotoFilter("SATURATE", 18);
        SATURATE = photoFilter19;
        PhotoFilter photoFilter20 = new PhotoFilter("SEPIA", 19);
        SEPIA = photoFilter20;
        PhotoFilter photoFilter21 = new PhotoFilter("SHARPEN", 20);
        SHARPEN = photoFilter21;
        PhotoFilter photoFilter22 = new PhotoFilter("TEMPERATURE", 21);
        TEMPERATURE = photoFilter22;
        PhotoFilter photoFilter23 = new PhotoFilter("TINT", 22);
        TINT = photoFilter23;
        PhotoFilter photoFilter24 = new PhotoFilter("VIGNETTE", 23);
        VIGNETTE = photoFilter24;
        f4404a = new PhotoFilter[]{photoFilter, photoFilter2, photoFilter3, photoFilter4, photoFilter5, photoFilter6, photoFilter7, photoFilter8, photoFilter9, photoFilter10, photoFilter11, photoFilter12, photoFilter13, photoFilter14, photoFilter15, photoFilter16, photoFilter17, photoFilter18, photoFilter19, photoFilter20, photoFilter21, photoFilter22, photoFilter23, photoFilter24};
    }

    public static PhotoFilter valueOf(String str) {
        return (PhotoFilter) Enum.valueOf(PhotoFilter.class, str);
    }

    public static PhotoFilter[] values() {
        return (PhotoFilter[]) f4404a.clone();
    }
}

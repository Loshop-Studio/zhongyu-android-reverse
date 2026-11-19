package com.canhub.cropper;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m5110d2 = {"com/canhub/cropper/CropWindowMoveHandler$Type", "", "Lcom/canhub/cropper/CropWindowMoveHandler$Type;", "TOP_LEFT", "TOP_RIGHT", "BOTTOM_LEFT", "BOTTOM_RIGHT", "LEFT", "TOP", "RIGHT", "BOTTOM", "CENTER", "cropper_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class CropWindowMoveHandler$Type {
    public static final CropWindowMoveHandler$Type BOTTOM;
    public static final CropWindowMoveHandler$Type BOTTOM_LEFT;
    public static final CropWindowMoveHandler$Type BOTTOM_RIGHT;
    public static final CropWindowMoveHandler$Type CENTER;
    public static final CropWindowMoveHandler$Type LEFT;
    public static final CropWindowMoveHandler$Type RIGHT;
    public static final CropWindowMoveHandler$Type TOP;
    public static final CropWindowMoveHandler$Type TOP_LEFT;
    public static final CropWindowMoveHandler$Type TOP_RIGHT;

    /* renamed from: a */
    public static final /* synthetic */ CropWindowMoveHandler$Type[] f2531a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f2532b;

    static {
        CropWindowMoveHandler$Type cropWindowMoveHandler$Type = new CropWindowMoveHandler$Type("TOP_LEFT", 0);
        TOP_LEFT = cropWindowMoveHandler$Type;
        CropWindowMoveHandler$Type cropWindowMoveHandler$Type2 = new CropWindowMoveHandler$Type("TOP_RIGHT", 1);
        TOP_RIGHT = cropWindowMoveHandler$Type2;
        CropWindowMoveHandler$Type cropWindowMoveHandler$Type3 = new CropWindowMoveHandler$Type("BOTTOM_LEFT", 2);
        BOTTOM_LEFT = cropWindowMoveHandler$Type3;
        CropWindowMoveHandler$Type cropWindowMoveHandler$Type4 = new CropWindowMoveHandler$Type("BOTTOM_RIGHT", 3);
        BOTTOM_RIGHT = cropWindowMoveHandler$Type4;
        CropWindowMoveHandler$Type cropWindowMoveHandler$Type5 = new CropWindowMoveHandler$Type("LEFT", 4);
        LEFT = cropWindowMoveHandler$Type5;
        CropWindowMoveHandler$Type cropWindowMoveHandler$Type6 = new CropWindowMoveHandler$Type("TOP", 5);
        TOP = cropWindowMoveHandler$Type6;
        CropWindowMoveHandler$Type cropWindowMoveHandler$Type7 = new CropWindowMoveHandler$Type("RIGHT", 6);
        RIGHT = cropWindowMoveHandler$Type7;
        CropWindowMoveHandler$Type cropWindowMoveHandler$Type8 = new CropWindowMoveHandler$Type("BOTTOM", 7);
        BOTTOM = cropWindowMoveHandler$Type8;
        CropWindowMoveHandler$Type cropWindowMoveHandler$Type9 = new CropWindowMoveHandler$Type("CENTER", 8);
        CENTER = cropWindowMoveHandler$Type9;
        CropWindowMoveHandler$Type[] cropWindowMoveHandler$TypeArr = {cropWindowMoveHandler$Type, cropWindowMoveHandler$Type2, cropWindowMoveHandler$Type3, cropWindowMoveHandler$Type4, cropWindowMoveHandler$Type5, cropWindowMoveHandler$Type6, cropWindowMoveHandler$Type7, cropWindowMoveHandler$Type8, cropWindowMoveHandler$Type9};
        f2531a = cropWindowMoveHandler$TypeArr;
        f2532b = AbstractC5817a.m5310a(cropWindowMoveHandler$TypeArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f2532b;
    }

    public static CropWindowMoveHandler$Type valueOf(String str) {
        return (CropWindowMoveHandler$Type) Enum.valueOf(CropWindowMoveHandler$Type.class, str);
    }

    public static CropWindowMoveHandler$Type[] values() {
        return (CropWindowMoveHandler$Type[]) f2531a.clone();
    }
}

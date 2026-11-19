package org.angmarch.views;

/* loaded from: classes5.dex */
enum PopUpTextAlignment {
    START(0),
    END(1),
    CENTER(2);


    /* renamed from: a */
    public final int f14901a;

    PopUpTextAlignment(int i10) {
        this.f14901a = i10;
    }

    /* renamed from: a */
    public static PopUpTextAlignment m14671a(int i10) {
        for (PopUpTextAlignment popUpTextAlignment : values()) {
            if (popUpTextAlignment.f14901a == i10) {
                return popUpTextAlignment;
            }
        }
        return CENTER;
    }
}

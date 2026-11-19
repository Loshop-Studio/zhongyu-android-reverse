package org.angmarch.views;

/* loaded from: classes4.dex */
enum PopUpTextAlignment {
    START(0),
    END(1),
    CENTER(2);


    /* renamed from: id */
    private final int f10383id;

    PopUpTextAlignment(int i) {
        this.f10383id = i;
    }

    public static PopUpTextAlignment fromId(int i) {
        for (PopUpTextAlignment popUpTextAlignment : values()) {
            if (popUpTextAlignment.f10383id == i) {
                return popUpTextAlignment;
            }
        }
        return CENTER;
    }
}

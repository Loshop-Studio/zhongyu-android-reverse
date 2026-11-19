package com.xuexiang.xui.widget.dialog.materialdialog;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;

/* loaded from: classes.dex */
public enum GravityEnum {
    START,
    CENTER,
    END;

    private static final boolean HAS_RTL = true;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum$1 */
    static /* synthetic */ class C21281 {

        /* renamed from: $SwitchMap$com$xuexiang$xui$widget$dialog$materialdialog$GravityEnum */
        static final /* synthetic */ int[] f9685x65f71c2e;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            f9685x65f71c2e = iArr;
            try {
                iArr[GravityEnum.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9685x65f71c2e[GravityEnum.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9685x65f71c2e[GravityEnum.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @SuppressLint({"RtlHardcoded"})
    public int getGravityInt() {
        int i4 = C21281.f9685x65f71c2e[ordinal()];
        if (i4 == 1) {
            return HAS_RTL ? 8388611 : 3;
        }
        if (i4 == 2) {
            return 1;
        }
        if (i4 == 3) {
            return HAS_RTL ? 8388613 : 5;
        }
        throw new IllegalStateException("Invalid gravity constant");
    }

    @TargetApi(17)
    public int getTextAlignment() {
        int i4 = C21281.f9685x65f71c2e[ordinal()];
        if (i4 != 2) {
            return i4 != 3 ? 5 : 6;
        }
        return 4;
    }
}

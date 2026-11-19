package com.xuexiang.xui.widget.dialog.materialdialog;

import androidx.core.view.GravityCompat;

/* loaded from: classes5.dex */
public enum GravityEnum {
    START,
    CENTER,
    END;


    /* renamed from: f */
    public static final boolean f15830f = true;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum$a */
    public static /* synthetic */ class C8097a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15832a;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            f15832a = iArr;
            try {
                iArr[GravityEnum.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15832a[GravityEnum.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15832a[GravityEnum.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    public int m12536a() {
        int i10 = C8097a.f15832a[ordinal()];
        if (i10 == 1) {
            if (f15830f) {
                return GravityCompat.START;
            }
            return 3;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 != 3) {
            throw new IllegalStateException("Invalid gravity constant");
        }
        if (f15830f) {
            return GravityCompat.END;
        }
        return 5;
    }

    /* renamed from: c */
    public int m12537c() {
        int i10 = C8097a.f15832a[ordinal()];
        if (i10 != 2) {
            return i10 != 3 ? 5 : 6;
        }
        return 4;
    }
}

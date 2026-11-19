package com.xuexiang.xui.widget.dialog.materialdialog;

import androidx.core.view.GravityCompat;

/* loaded from: classes2.dex */
public enum GravityEnum {
    START,
    CENTER,
    END;


    /* renamed from: d */
    public static final boolean f3399d = true;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum$a */
    public static /* synthetic */ class C3554a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3401a;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            f3401a = iArr;
            try {
                iArr[GravityEnum.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3401a[GravityEnum.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3401a[GravityEnum.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    public int m4257a() {
        int i4 = C3554a.f3401a[ordinal()];
        if (i4 == 1) {
            if (f3399d) {
                return GravityCompat.START;
            }
            return 3;
        }
        if (i4 == 2) {
            return 1;
        }
        if (i4 != 3) {
            throw new IllegalStateException("Invalid gravity constant");
        }
        if (f3399d) {
            return GravityCompat.END;
        }
        return 5;
    }

    /* renamed from: b */
    public int m4258b() {
        int i4 = C3554a.f3401a[ordinal()];
        if (i4 != 2) {
            return i4 != 3 ? 5 : 6;
        }
        return 4;
    }
}

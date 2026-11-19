package com.xuexiang.xui.widget.dialog.materialdialog;

import androidx.core.view.GravityCompat;

/* loaded from: classes4.dex */
public enum GravityEnum {
    START,
    CENTER,
    END;


    /* renamed from: d */
    public static final boolean f6065d = true;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum$a */
    public static /* synthetic */ class C6506a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6067a;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            f6067a = iArr;
            try {
                iArr[GravityEnum.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6067a[GravityEnum.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6067a[GravityEnum.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    public int m5573a() {
        int i10 = C6506a.f6067a[ordinal()];
        if (i10 == 1) {
            if (f6065d) {
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
        if (f6065d) {
            return GravityCompat.END;
        }
        return 5;
    }

    /* renamed from: f */
    public int m5574f() {
        int i10 = C6506a.f6067a[ordinal()];
        if (i10 != 2) {
            return i10 != 3 ? 5 : 6;
        }
        return 4;
    }
}

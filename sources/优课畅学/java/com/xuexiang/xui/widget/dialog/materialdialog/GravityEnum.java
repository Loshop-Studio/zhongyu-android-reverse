package com.xuexiang.xui.widget.dialog.materialdialog;

import androidx.core.view.GravityCompat;

/* loaded from: classes4.dex */
public enum GravityEnum {
    START,
    CENTER,
    END;


    /* renamed from: d */
    public static final boolean f7446d = true;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum$a */
    public static /* synthetic */ class C6906a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7448a;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            f7448a = iArr;
            try {
                iArr[GravityEnum.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7448a[GravityEnum.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7448a[GravityEnum.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    public int m6706a() {
        int i10 = C6906a.f7448a[ordinal()];
        if (i10 == 1) {
            if (f7446d) {
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
        if (f7446d) {
            return GravityCompat.END;
        }
        return 5;
    }

    /* renamed from: b */
    public int m6707b() {
        int i10 = C6906a.f7448a[ordinal()];
        if (i10 != 2) {
            return i10 != 3 ? 5 : 6;
        }
        return 4;
    }
}

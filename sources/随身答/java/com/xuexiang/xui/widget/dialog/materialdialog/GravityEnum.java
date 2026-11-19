package com.xuexiang.xui.widget.dialog.materialdialog;

import androidx.core.view.GravityCompat;

/* loaded from: classes4.dex */
public enum GravityEnum {
    START,
    CENTER,
    END;


    /* renamed from: d */
    public static final boolean f7318d = true;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum$a */
    public static /* synthetic */ class C6824a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7320a;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            f7320a = iArr;
            try {
                iArr[GravityEnum.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7320a[GravityEnum.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7320a[GravityEnum.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    public int m6667a() {
        int i9 = C6824a.f7320a[ordinal()];
        if (i9 == 1) {
            if (f7318d) {
                return GravityCompat.START;
            }
            return 3;
        }
        if (i9 == 2) {
            return 1;
        }
        if (i9 != 3) {
            throw new IllegalStateException("Invalid gravity constant");
        }
        if (f7318d) {
            return GravityCompat.END;
        }
        return 5;
    }

    /* renamed from: c */
    public int m6668c() {
        int i9 = C6824a.f7320a[ordinal()];
        if (i9 != 2) {
            return i9 != 3 ? 5 : 6;
        }
        return 4;
    }
}

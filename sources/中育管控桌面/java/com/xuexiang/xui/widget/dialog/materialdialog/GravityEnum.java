package com.xuexiang.xui.widget.dialog.materialdialog;

import androidx.core.view.GravityCompat;

/* loaded from: classes3.dex */
public enum GravityEnum {
    START,
    CENTER,
    END;


    /* renamed from: d */
    public static final boolean f4789d = true;

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum$a */
    public static /* synthetic */ class C5884a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4791a;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            f4791a = iArr;
            try {
                iArr[GravityEnum.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4791a[GravityEnum.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4791a[GravityEnum.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    public int m4583a() {
        int i6 = C5884a.f4791a[ordinal()];
        if (i6 == 1) {
            if (f4789d) {
                return GravityCompat.START;
            }
            return 3;
        }
        if (i6 == 2) {
            return 1;
        }
        if (i6 != 3) {
            throw new IllegalStateException("Invalid gravity constant");
        }
        if (f4789d) {
            return GravityCompat.END;
        }
        return 5;
    }

    /* renamed from: b */
    public int m4584b() {
        int i6 = C5884a.f4791a[ordinal()];
        if (i6 != 2) {
            return i6 != 3 ? 5 : 6;
        }
        return 4;
    }
}

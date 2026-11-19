package com.xuexiang.xui.widget.dialog.materialdialog;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import androidx.core.view.GravityCompat;
import p079i2.AbstractC5674a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class GravityEnum {
    public static final GravityEnum CENTER;
    public static final GravityEnum END;
    public static final GravityEnum START;

    /* renamed from: a */
    public static final /* synthetic */ GravityEnum[] f4255a;

    static {
        GravityEnum gravityEnum = new GravityEnum("START", 0);
        START = gravityEnum;
        GravityEnum gravityEnum2 = new GravityEnum("CENTER", 1);
        CENTER = gravityEnum2;
        GravityEnum gravityEnum3 = new GravityEnum("END", 2);
        END = gravityEnum3;
        f4255a = new GravityEnum[]{gravityEnum, gravityEnum2, gravityEnum3};
    }

    public static GravityEnum valueOf(String str) {
        return (GravityEnum) Enum.valueOf(GravityEnum.class, str);
    }

    public static GravityEnum[] values() {
        return (GravityEnum[]) f4255a.clone();
    }

    @SuppressLint({"RtlHardcoded"})
    public int getGravityInt() {
        int i = AbstractC5674a.f8843a[ordinal()];
        if (i == 1) {
            return GravityCompat.START;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return GravityCompat.END;
        }
        throw new IllegalStateException("Invalid gravity constant");
    }

    @TargetApi(17)
    public int getTextAlignment() {
        int i = AbstractC5674a.f8843a[ordinal()];
        if (i != 2) {
            return i != 3 ? 5 : 6;
        }
        return 4;
    }
}

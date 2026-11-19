package com.jaredrummler.android.colorpicker;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* renamed from: com.jaredrummler.android.colorpicker.a */
/* loaded from: classes3.dex */
public final class C4031a {

    /* renamed from: a */
    public int f3202a;

    /* renamed from: b */
    public int f3203b;

    /* renamed from: c */
    public int f3204c;

    /* renamed from: d */
    public int f3205d;

    /* renamed from: e */
    public int f3206e;

    /* renamed from: f */
    public int[] f3207f;

    /* renamed from: g */
    public int f3208g;

    /* renamed from: h */
    public boolean f3209h;

    /* renamed from: i */
    public boolean f3210i;

    /* renamed from: j */
    public boolean f3211j;

    /* renamed from: k */
    public boolean f3212k;

    /* renamed from: l */
    public int f3213l;

    /* renamed from: a */
    public final ColorPickerDialog m2848a() {
        ColorPickerDialog colorPickerDialog = new ColorPickerDialog();
        Bundle bundle = new Bundle();
        bundle.putInt("id", 0);
        bundle.putInt("dialogType", this.f3206e);
        bundle.putInt(TypedValues.Custom.S_COLOR, this.f3208g);
        bundle.putIntArray("presets", this.f3207f);
        bundle.putBoolean("alpha", this.f3209h);
        bundle.putBoolean("allowCustom", this.f3211j);
        bundle.putBoolean("allowPresets", this.f3210i);
        bundle.putInt("dialogTitle", this.f3202a);
        bundle.putBoolean("showColorShades", this.f3212k);
        bundle.putInt("colorShape", this.f3213l);
        bundle.putInt("presetsButtonText", this.f3203b);
        bundle.putInt("customButtonText", this.f3204c);
        bundle.putInt("selectedButtonText", this.f3205d);
        colorPickerDialog.setArguments(bundle);
        return colorPickerDialog;
    }
}

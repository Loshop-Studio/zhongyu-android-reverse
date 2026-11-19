package p070b.p074b.p075a.p076a.p097s;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import io.github.inflationx.calligraphy3.C1088R;
import p070b.p074b.p075a.p076a.C0562a;
import p070b.p074b.p075a.p076a.C0564b;
import p070b.p074b.p075a.p076a.p077a0.p078a.C0563a;
import p070b.p074b.p075a.p076a.p096r.C0655j;

/* renamed from: b.b.a.a.s.a */
/* loaded from: classes.dex */
public class C0661a extends AppCompatRadioButton {

    /* renamed from: g */
    public static final int[][] f3956g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e */
    public ColorStateList f3957e;

    /* renamed from: f */
    public boolean f3958f;

    public C0661a(Context context, AttributeSet attributeSet) {
        super(C0563a.m2100a(context, attributeSet, C1088R.attr.radioButtonStyle, C1088R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, C1088R.attr.radioButtonStyle);
        Context context2 = getContext();
        TypedArray typedArrayM2269d = C0655j.m2269d(context2, attributeSet, C0564b.f3519n, C1088R.attr.radioButtonStyle, C1088R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayM2269d.hasValue(0)) {
            setButtonTintList(C0562a.m2086g(context2, typedArrayM2269d, 0));
        }
        this.f3958f = typedArrayM2269d.getBoolean(1, false);
        typedArrayM2269d.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f3957e == null) {
            int iM2085f = C0562a.m2085f(this, C1088R.attr.colorControlActivated);
            int iM2085f2 = C0562a.m2085f(this, C1088R.attr.colorOnSurface);
            int iM2085f3 = C0562a.m2085f(this, C1088R.attr.colorSurface);
            int[][] iArr = f3956g;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C0562a.m2090k(iM2085f3, iM2085f, 1.0f);
            iArr2[1] = C0562a.m2090k(iM2085f3, iM2085f2, 0.54f);
            iArr2[2] = C0562a.m2090k(iM2085f3, iM2085f2, 0.38f);
            iArr2[3] = C0562a.m2090k(iM2085f3, iM2085f2, 0.38f);
            this.f3957e = new ColorStateList(iArr, iArr2);
        }
        return this.f3957e;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3958f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f3958f = z;
        setButtonTintList(z ? getMaterialThemeColorsTintList() : null);
    }
}

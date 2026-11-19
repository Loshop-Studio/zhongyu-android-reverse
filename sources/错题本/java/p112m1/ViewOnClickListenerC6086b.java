package p112m1;

import android.content.res.Resources;
import android.view.View;
import com.jaredrummler.android.colorpicker.ColorPickerDialog;
import p129o2.C6268a;

/* renamed from: m1.b */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC6086b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f9720a;

    /* renamed from: b */
    public final /* synthetic */ C6088d f9721b;

    public ViewOnClickListenerC6086b(C6088d c6088d, int i) {
        this.f9721b = c6088d;
        this.f9720a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Resources.NotFoundException {
        C6088d c6088d = this.f9721b;
        C6089e c6089e = c6088d.f9728e;
        int i = c6089e.f9731c;
        int i8 = this.f9720a;
        if (i != i8) {
            c6089e.f9731c = i8;
            c6089e.notifyDataSetChanged();
        }
        C6089e c6089e2 = c6088d.f9728e;
        C6268a c6268a = c6089e2.f9729a;
        int i9 = c6089e2.f9730b[i8];
        ColorPickerDialog colorPickerDialog = (ColorPickerDialog) c6268a.f10022b;
        int i10 = colorPickerDialog.f3131d;
        if (i10 == i9) {
            ColorPickerDialog.m2834e(colorPickerDialog, i10);
            colorPickerDialog.dismiss();
        } else {
            colorPickerDialog.f3131d = i9;
            if (colorPickerDialog.f3133f) {
                colorPickerDialog.m2837f(i9);
            }
        }
    }
}

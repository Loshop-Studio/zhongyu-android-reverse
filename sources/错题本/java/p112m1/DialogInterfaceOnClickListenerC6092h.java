package p112m1;

import android.content.DialogInterface;
import com.jaredrummler.android.colorpicker.ColorPickerDialog;

/* renamed from: m1.h */
/* loaded from: classes3.dex */
public final class DialogInterfaceOnClickListenerC6092h implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ColorPickerDialog f9735a;

    public DialogInterfaceOnClickListenerC6092h(ColorPickerDialog colorPickerDialog) {
        this.f9735a = colorPickerDialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ColorPickerDialog colorPickerDialog = this.f9735a;
        ColorPickerDialog.m2834e(colorPickerDialog, colorPickerDialog.f3131d);
    }
}

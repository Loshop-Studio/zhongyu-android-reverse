package p112m1;

import android.view.View;
import android.widget.Button;
import com.jaredrummler.android.colorpicker.ColorPickerDialog;
import com.jaredrummler.android.colorpicker.R$string;

/* renamed from: m1.i */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC6093i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f9736a;

    /* renamed from: b */
    public final /* synthetic */ ColorPickerDialog f9737b;

    public /* synthetic */ ViewOnClickListenerC6093i(ColorPickerDialog colorPickerDialog, int i) {
        this.f9736a = i;
        this.f9737b = colorPickerDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9736a) {
            case 0:
                ColorPickerDialog colorPickerDialog = this.f9737b;
                colorPickerDialog.f3129b.removeAllViews();
                int i = colorPickerDialog.f3132e;
                if (i == 0) {
                    colorPickerDialog.f3132e = 1;
                    Button button = (Button) view;
                    int i8 = colorPickerDialog.f3145r;
                    if (i8 == 0) {
                        i8 = R$string.cpv_custom;
                    }
                    button.setText(i8);
                    colorPickerDialog.f3129b.addView(colorPickerDialog.m2839h());
                    break;
                } else if (i == 1) {
                    colorPickerDialog.f3132e = 0;
                    Button button2 = (Button) view;
                    int i9 = colorPickerDialog.f3143p;
                    if (i9 == 0) {
                        i9 = R$string.cpv_presets;
                    }
                    button2.setText(i9);
                    colorPickerDialog.f3129b.addView(colorPickerDialog.m2838g());
                    break;
                }
                break;
            default:
                ColorPickerDialog colorPickerDialog2 = this.f9737b;
                int color = colorPickerDialog2.f3140m.getColor();
                int i10 = colorPickerDialog2.f3131d;
                if (color == i10) {
                    ColorPickerDialog.m2834e(colorPickerDialog2, i10);
                    colorPickerDialog2.dismiss();
                    break;
                }
                break;
        }
    }
}

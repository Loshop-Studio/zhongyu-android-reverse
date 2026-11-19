package p112m1;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import com.jaredrummler.android.colorpicker.ColorPanelView;
import com.jaredrummler.android.colorpicker.ColorPickerDialog;
import com.jaredrummler.android.colorpicker.R$id;
import java.util.Locale;

/* renamed from: m1.f */
/* loaded from: classes3.dex */
public final class C6090f implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    public final /* synthetic */ ColorPickerDialog f9733a;

    public C6090f(ColorPickerDialog colorPickerDialog) {
        this.f9733a = colorPickerDialog;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z8) {
        C6089e c6089e;
        ColorPickerDialog colorPickerDialog = this.f9733a;
        TextView textView = colorPickerDialog.f3138k;
        Locale locale = Locale.ENGLISH;
        textView.setText(((int) ((i * 100.0d) / 255.0d)) + "%");
        int i8 = 255 - i;
        int i9 = 0;
        while (true) {
            c6089e = colorPickerDialog.f3135h;
            int[] iArr = c6089e.f9730b;
            if (i9 >= iArr.length) {
                break;
            }
            int i10 = iArr[i9];
            colorPickerDialog.f3135h.f9730b[i9] = Color.argb(i8, Color.red(i10), Color.green(i10), Color.blue(i10));
            i9++;
        }
        c6089e.notifyDataSetChanged();
        for (int i11 = 0; i11 < colorPickerDialog.f3136i.getChildCount(); i11++) {
            FrameLayout frameLayout = (FrameLayout) colorPickerDialog.f3136i.getChildAt(i11);
            ColorPanelView colorPanelView = (ColorPanelView) frameLayout.findViewById(R$id.cpv_color_panel_view);
            ImageView imageView = (ImageView) frameLayout.findViewById(R$id.cpv_color_image_view);
            if (frameLayout.getTag() == null) {
                frameLayout.setTag(Integer.valueOf(colorPanelView.getBorderColor()));
            }
            int color = colorPanelView.getColor();
            int iArgb = Color.argb(i8, Color.red(color), Color.green(color), Color.blue(color));
            if (i8 <= 165) {
                colorPanelView.setBorderColor(iArgb | ViewCompat.MEASURED_STATE_MASK);
            } else {
                colorPanelView.setBorderColor(((Integer) frameLayout.getTag()).intValue());
            }
            if (colorPanelView.getTag() != null && ((Boolean) colorPanelView.getTag()).booleanValue()) {
                if (i8 <= 165) {
                    imageView.setColorFilter(ViewCompat.MEASURED_STATE_MASK, PorterDuff.Mode.SRC_IN);
                } else if (ColorUtils.calculateLuminance(iArgb) >= 0.65d) {
                    imageView.setColorFilter(ViewCompat.MEASURED_STATE_MASK, PorterDuff.Mode.SRC_IN);
                } else {
                    imageView.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
                }
            }
            colorPanelView.setColor(iArgb);
        }
        colorPickerDialog.f3131d = Color.argb(i8, Color.red(colorPickerDialog.f3131d), Color.green(colorPickerDialog.f3131d), Color.blue(colorPickerDialog.f3131d));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}

package p112m1;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import com.jaredrummler.android.colorpicker.ColorPanelView;
import com.jaredrummler.android.colorpicker.ColorPickerDialog;
import com.jaredrummler.android.colorpicker.R$drawable;
import com.jaredrummler.android.colorpicker.R$id;

/* renamed from: m1.j */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC6094j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ColorPanelView f9738a;

    /* renamed from: b */
    public final /* synthetic */ ColorPickerDialog f9739b;

    public ViewOnClickListenerC6094j(ColorPickerDialog colorPickerDialog, ColorPanelView colorPanelView) {
        this.f9739b = colorPickerDialog;
        this.f9738a = colorPanelView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z8 = view.getTag() instanceof Boolean;
        ColorPickerDialog colorPickerDialog = this.f9739b;
        if (z8 && ((Boolean) view.getTag()).booleanValue()) {
            ColorPickerDialog.m2834e(colorPickerDialog, colorPickerDialog.f3131d);
            colorPickerDialog.dismiss();
            return;
        }
        colorPickerDialog.f3131d = this.f9738a.getColor();
        C6089e c6089e = colorPickerDialog.f3135h;
        c6089e.f9731c = -1;
        c6089e.notifyDataSetChanged();
        for (int i = 0; i < colorPickerDialog.f3136i.getChildCount(); i++) {
            FrameLayout frameLayout = (FrameLayout) colorPickerDialog.f3136i.getChildAt(i);
            ColorPanelView colorPanelView = (ColorPanelView) frameLayout.findViewById(R$id.cpv_color_panel_view);
            ImageView imageView = (ImageView) frameLayout.findViewById(R$id.cpv_color_image_view);
            imageView.setImageResource(colorPanelView == view ? R$drawable.cpv_preset_checked : 0);
            if ((colorPanelView != view || ColorUtils.calculateLuminance(colorPanelView.getColor()) < 0.65d) && Color.alpha(colorPanelView.getColor()) > 165) {
                imageView.setColorFilter((ColorFilter) null);
            } else {
                imageView.setColorFilter(ViewCompat.MEASURED_STATE_MASK, PorterDuff.Mode.SRC_IN);
            }
            colorPanelView.setTag(Boolean.valueOf(colorPanelView == view));
        }
    }
}

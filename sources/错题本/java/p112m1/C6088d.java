package p112m1;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.jaredrummler.android.colorpicker.ColorPanelView;
import com.jaredrummler.android.colorpicker.R$id;
import com.jaredrummler.android.colorpicker.R$layout;

/* renamed from: m1.d */
/* loaded from: classes3.dex */
public final class C6088d {

    /* renamed from: a */
    public final View f9724a;

    /* renamed from: b */
    public final ColorPanelView f9725b;

    /* renamed from: c */
    public final ImageView f9726c;

    /* renamed from: d */
    public final int f9727d;

    /* renamed from: e */
    public final /* synthetic */ C6089e f9728e;

    public C6088d(C6089e c6089e, Context context) {
        this.f9728e = c6089e;
        View viewInflate = View.inflate(context, c6089e.f9732d == 0 ? R$layout.cpv_color_item_square : R$layout.cpv_color_item_circle, null);
        this.f9724a = viewInflate;
        ColorPanelView colorPanelView = (ColorPanelView) viewInflate.findViewById(R$id.cpv_color_panel_view);
        this.f9725b = colorPanelView;
        this.f9726c = (ImageView) viewInflate.findViewById(R$id.cpv_color_image_view);
        this.f9727d = colorPanelView.getBorderColor();
        viewInflate.setTag(this);
    }
}

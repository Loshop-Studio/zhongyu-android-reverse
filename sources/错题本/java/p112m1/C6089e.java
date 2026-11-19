package p112m1;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import com.jaredrummler.android.colorpicker.ColorPanelView;
import com.jaredrummler.android.colorpicker.R$drawable;
import p129o2.C6268a;

/* renamed from: m1.e */
/* loaded from: classes3.dex */
public final class C6089e extends BaseAdapter {

    /* renamed from: a */
    public final C6268a f9729a;

    /* renamed from: b */
    public final int[] f9730b;

    /* renamed from: c */
    public int f9731c;

    /* renamed from: d */
    public final int f9732d;

    public C6089e(C6268a c6268a, int[] iArr, int i, int i8) {
        this.f9729a = c6268a;
        this.f9730b = iArr;
        this.f9731c = i;
        this.f9732d = i8;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f9730b.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return Integer.valueOf(this.f9730b[i]);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        C6088d c6088d;
        if (view == null) {
            c6088d = new C6088d(this, viewGroup.getContext());
            view2 = c6088d.f9724a;
        } else {
            view2 = view;
            c6088d = (C6088d) view.getTag();
        }
        C6089e c6089e = c6088d.f9728e;
        int[] iArr = c6089e.f9730b;
        int i8 = iArr[i];
        int iAlpha = Color.alpha(i8);
        ColorPanelView colorPanelView = c6088d.f9725b;
        colorPanelView.setColor(i8);
        ImageView imageView = c6088d.f9726c;
        imageView.setImageResource(c6089e.f9731c == i ? R$drawable.cpv_preset_checked : 0);
        if (iAlpha != 255) {
            if (iAlpha <= 165) {
                colorPanelView.setBorderColor(i8 | ViewCompat.MEASURED_STATE_MASK);
                imageView.setColorFilter(ViewCompat.MEASURED_STATE_MASK, PorterDuff.Mode.SRC_IN);
            } else {
                colorPanelView.setBorderColor(c6088d.f9727d);
                imageView.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
            }
        } else if (i != c6089e.f9731c || ColorUtils.calculateLuminance(iArr[i]) < 0.65d) {
            imageView.setColorFilter((ColorFilter) null);
        } else {
            imageView.setColorFilter(ViewCompat.MEASURED_STATE_MASK, PorterDuff.Mode.SRC_IN);
        }
        colorPanelView.setOnClickListener(new ViewOnClickListenerC6086b(c6088d, i));
        colorPanelView.setOnLongClickListener(new ViewOnLongClickListenerC6087c(c6088d, 0));
        return view2;
    }
}

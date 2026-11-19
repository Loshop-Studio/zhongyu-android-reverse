package p112m1;

import android.view.View;
import com.jaredrummler.android.colorpicker.ColorPanelView;

/* renamed from: m1.c */
/* loaded from: classes3.dex */
public final class ViewOnLongClickListenerC6087c implements View.OnLongClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f9722a;

    /* renamed from: b */
    public final /* synthetic */ Object f9723b;

    public /* synthetic */ ViewOnLongClickListenerC6087c(Object obj, int i) {
        this.f9722a = i;
        this.f9723b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f9722a) {
            case 0:
                ((C6088d) this.f9723b).f9725b.m2833a();
                break;
            default:
                ((ColorPanelView) this.f9723b).m2833a();
                break;
        }
        return true;
    }
}

package p009a8;

import android.view.View;
import android.widget.PopupWindow;
import com.xuexiang.xui.widget.spinner.editspinner.EditSpinner;
import org.angmarch.views.NiceSpinner;

/* renamed from: a8.c */
/* loaded from: classes4.dex */
public final class C0025c implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ int f65a;

    /* renamed from: b */
    public final /* synthetic */ View f66b;

    public /* synthetic */ C0025c(View view, int i) {
        this.f65a = i;
        this.f66b = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.f65a) {
            case 0:
                NiceSpinner niceSpinner = (NiceSpinner) this.f66b;
                if (!niceSpinner.f10370h) {
                    niceSpinner.m6018c(false);
                    break;
                }
                break;
            default:
                EditSpinner editSpinner = (EditSpinner) this.f66b;
                System.currentTimeMillis();
                editSpinner.f4883b.startAnimation(editSpinner.f4886e);
                break;
        }
    }
}

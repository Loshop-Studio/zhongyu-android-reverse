package p123n3;

import android.content.Context;
import android.widget.ListPopupWindow;
import com.xuexiang.xui.widget.spinner.editspinner.EditSpinner;

/* renamed from: n3.a */
/* loaded from: classes3.dex */
public final class C6214a extends ListPopupWindow {

    /* renamed from: a */
    public final /* synthetic */ EditSpinner f9944a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6214a(EditSpinner editSpinner, Context context) {
        super(context);
        this.f9944a = editSpinner;
    }

    @Override // android.widget.ListPopupWindow
    public final void show() {
        super.show();
        EditSpinner editSpinner = this.f9944a;
        editSpinner.f4883b.startAnimation(editSpinner.f4885d);
    }
}

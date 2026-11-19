package p248m6;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$style;

/* renamed from: m6.b */
/* loaded from: classes5.dex */
public class DialogC10205b extends Dialog {
    public DialogC10205b(Context context) {
        super(context, R$style.Picture_Theme_AlertDialog);
        setCancelable(true);
        setCanceledOnTouchOutside(false);
    }

    /* renamed from: a */
    public final void m21332a() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setWindowAnimations(R$style.PictureThemeDialogWindowStyle);
        getWindow().setAttributes(attributes);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.ps_alert_dialog);
        m21332a();
    }
}

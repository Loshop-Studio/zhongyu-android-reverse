package p248m6;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$style;

/* renamed from: m6.c */
/* loaded from: classes5.dex */
public class DialogC10206c extends Dialog implements View.OnClickListener {

    /* renamed from: c */
    public final TextView f24309c;

    /* renamed from: d */
    public final TextView f24310d;

    public DialogC10206c(Context context, String str) {
        super(context, R$style.Picture_Theme_Dialog);
        setContentView(R$layout.ps_remind_dialog);
        TextView textView = (TextView) findViewById(R$id.btnOk);
        this.f24309c = textView;
        TextView textView2 = (TextView) findViewById(R$id.tv_content);
        this.f24310d = textView2;
        textView2.setText(str);
        textView.setOnClickListener(this);
        m21334b();
    }

    /* renamed from: a */
    public static DialogC10206c m21333a(Context context, String str) {
        return new DialogC10206c(context, str);
    }

    /* renamed from: b */
    public final void m21334b() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setWindowAnimations(R$style.PictureThemeDialogWindowStyle);
        getWindow().setAttributes(attributes);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R$id.btnOk) {
            dismiss();
        }
    }
}

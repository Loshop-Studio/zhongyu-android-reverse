package p106l4;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.TextView;
import androidx.navigation.ViewOnClickListenerC2869j;
import com.zykj.mistake.R;
import p152r6.InterfaceC6469a;

/* renamed from: l4.e */
/* loaded from: classes3.dex */
public final class DialogC6054e extends Dialog {

    /* renamed from: b */
    public static final /* synthetic */ int f9649b = 0;

    /* renamed from: a */
    public InterfaceC6469a f9650a;

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_camera_warning);
        setCanceledOnTouchOutside(false);
        ((TextView) findViewById(R.id.tv_confirm)).setOnClickListener(new ViewOnClickListenerC2869j(this, 4));
    }
}

package p052e5;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;
import com.zykj.mistake.R;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: e5.a */
/* loaded from: classes3.dex */
public final class DialogC5456a extends Dialog {
    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_update_process);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent event) throws Resources.NotFoundException {
        AbstractC5830k.m5330g(event, "event");
        if (i != 4 || event.getRepeatCount() != 0) {
            return false;
        }
        Context context = getContext();
        AbstractC5830k.m5329f(context, "getContext(...)");
        Toast toastMakeText = Toast.makeText(context, R.string.downloading_wait, 0);
        toastMakeText.setGravity(81, 0, 220);
        toastMakeText.show();
        return true;
    }
}

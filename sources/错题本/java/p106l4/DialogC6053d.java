package p106l4;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import androidx.navigation.ViewOnClickListenerC2869j;
import com.zykj.mistake.R;
import com.zykj.view.board.play.C5353b;

/* renamed from: l4.d */
/* loaded from: classes3.dex */
public final class DialogC6053d extends Dialog {

    /* renamed from: b */
    public static final /* synthetic */ int f9647b = 0;

    /* renamed from: a */
    public final C5353b f9648a;

    public DialogC6053d(Context context) {
        super(context, R.style.AppTheme_Dialog);
        this.f9648a = new C5353b(9);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_camera_forbidden);
        ((TextView) findViewById(R.id.tv_confirm)).setOnClickListener(new ViewOnClickListenerC2869j(this, 3));
    }
}

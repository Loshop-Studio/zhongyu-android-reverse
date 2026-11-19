package p264u6;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.zykj.student.dialogue.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u6.d */
/* loaded from: classes5.dex */
public final class DialogC9705d extends Dialog {
    public /* synthetic */ DialogC9705d(Context context, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? R.style.AppTheme_Dialog : i9);
    }

    /* renamed from: b */
    public static final void m16223b(DialogC9705d dialogC9705d, View view) {
        dialogC9705d.dismiss();
    }

    /* renamed from: c */
    public final void m16224c(boolean z9) {
        show();
        ((TextView) findViewById(R.id.tv_content)).setText(z9 ? getContext().getString(R.string.camera_permit) : getContext().getString(R.string.camera_forbid));
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_camera_warning);
        setCanceledOnTouchOutside(false);
        findViewById(R.id.tv_confirm).setOnClickListener(new View.OnClickListener() { // from class: u6.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC9705d.m16223b(this.f17141a, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC9705d(Context context, int i9) {
        super(context, i9);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}

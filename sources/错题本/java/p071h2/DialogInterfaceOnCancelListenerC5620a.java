package p071h2;

import android.content.DialogInterface;
import com.xuexiang.xui.widget.dialog.BaseDialog;
import com.xuexiang.xui.widget.dialog.LoadingDialog;
import com.xuexiang.xui.widget.dialog.MiniLoadingDialog;

/* renamed from: h2.a */
/* loaded from: classes3.dex */
public final class DialogInterfaceOnCancelListenerC5620a implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ int f8752a;

    /* renamed from: b */
    public final /* synthetic */ BaseDialog f8753b;

    public /* synthetic */ DialogInterfaceOnCancelListenerC5620a(BaseDialog baseDialog, int i) {
        this.f8752a = i;
        this.f8753b = baseDialog;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.f8752a;
        BaseDialog baseDialog = this.f8753b;
        switch (i) {
            case 0:
                int i8 = LoadingDialog.f4250a;
                ((LoadingDialog) baseDialog).getClass();
                break;
            default:
                int i9 = MiniLoadingDialog.f4251a;
                ((MiniLoadingDialog) baseDialog).getClass();
                break;
        }
    }
}

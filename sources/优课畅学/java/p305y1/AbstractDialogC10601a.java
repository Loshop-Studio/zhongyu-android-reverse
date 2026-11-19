package p305y1;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.xuexiang.xui.utils.AbstractViewTreeObserverOnGlobalLayoutListenerC6874d;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout;

/* renamed from: y1.a */
/* loaded from: classes4.dex */
public abstract class AbstractDialogC10601a extends Dialog implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public MDRootLayout f21003a;

    /* renamed from: b */
    public DialogInterface.OnShowListener f21004b;

    public AbstractDialogC10601a(Context context, int i10) {
        super(context, i10);
    }

    /* renamed from: b */
    public final void m19769b() {
        super.setOnShowListener(this);
    }

    /* renamed from: c */
    public final void m19770c(View view) {
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public View findViewById(int i10) {
        return this.f21003a.findViewById(i10);
    }

    public void onShow(DialogInterface dialogInterface) {
        DialogInterface.OnShowListener onShowListener = this.f21004b;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewTreeObserverOnGlobalLayoutListenerC6874d.m6432a(motionEvent, this);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f21004b = onShowListener;
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }
}

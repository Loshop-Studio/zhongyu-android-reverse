package p211p3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.xuexiang.xui.utils.AbstractViewTreeObserverOnGlobalLayoutListenerC6798d;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout;

/* renamed from: p3.a */
/* loaded from: classes4.dex */
public abstract class AbstractDialogC9320a extends Dialog implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public MDRootLayout f16162a;

    /* renamed from: b */
    public DialogInterface.OnShowListener f16163b;

    public AbstractDialogC9320a(Context context, int i9) {
        super(context, i9);
    }

    /* renamed from: b */
    public final void m15202b() {
        super.setOnShowListener(this);
    }

    /* renamed from: c */
    public final void m15203c(View view) {
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public View findViewById(int i9) {
        return this.f16162a.findViewById(i9);
    }

    public void onShow(DialogInterface dialogInterface) {
        DialogInterface.OnShowListener onShowListener = this.f16163b;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewTreeObserverOnGlobalLayoutListenerC6798d.m6446a(motionEvent, this);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog
    public void setContentView(int i9) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f16163b = onShowListener;
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

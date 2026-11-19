package p003a2;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.xuexiang.xui.utils.AbstractViewTreeObserverOnGlobalLayoutListenerC5856d;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout;

/* renamed from: a2.a */
/* loaded from: classes3.dex */
public abstract class AbstractDialogC0008a extends Dialog implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public MDRootLayout f3a;

    /* renamed from: b */
    public DialogInterface.OnShowListener f4b;

    public AbstractDialogC0008a(Context context, int i6) {
        super(context, i6);
    }

    /* renamed from: b */
    public final void m10b() {
        super.setOnShowListener(this);
    }

    /* renamed from: c */
    public final void m11c(View view) {
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public View findViewById(int i6) {
        return this.f3a.findViewById(i6);
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        DialogInterface.OnShowListener onShowListener = this.f4b;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewTreeObserverOnGlobalLayoutListenerC5856d.m4350a(motionEvent, this);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog
    public void setContentView(int i6) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f4b = onShowListener;
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

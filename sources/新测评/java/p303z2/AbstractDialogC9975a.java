package p303z2;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.xuexiang.xui.utils.AbstractViewTreeObserverOnGlobalLayoutListenerC6479d;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout;

/* renamed from: z2.a */
/* loaded from: classes4.dex */
public abstract class AbstractDialogC9975a extends Dialog implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public MDRootLayout f17831a;

    /* renamed from: b */
    public DialogInterface.OnShowListener f17832b;

    public AbstractDialogC9975a(Context context, int i10) {
        super(context, i10);
    }

    /* renamed from: b */
    public final void m16799b() {
        super.setOnShowListener(this);
    }

    /* renamed from: c */
    public final void m16800c(View view) {
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public View findViewById(int i10) {
        return this.f17831a.findViewById(i10);
    }

    public void onShow(DialogInterface dialogInterface) {
        DialogInterface.OnShowListener onShowListener = this.f17832b;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewTreeObserverOnGlobalLayoutListenerC6479d.m5345a(motionEvent, this);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f17832b = onShowListener;
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

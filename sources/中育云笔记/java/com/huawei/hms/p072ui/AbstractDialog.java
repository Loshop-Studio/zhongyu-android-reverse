package com.huawei.hms.p072ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.UIUtil;

/* loaded from: classes5.dex */
public abstract class AbstractDialog {

    /* renamed from: a */
    public Activity f11790a;

    /* renamed from: b */
    public AlertDialog f11791b;

    /* renamed from: c */
    public Callback f11792c;

    public interface Callback {
        void onCancel(AbstractDialog abstractDialog);

        void onDoWork(AbstractDialog abstractDialog);
    }

    /* renamed from: com.huawei.hms.ui.AbstractDialog$a */
    public class DialogInterfaceOnClickListenerC7347a implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC7347a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            AbstractDialog.this.m8731b();
        }
    }

    /* renamed from: com.huawei.hms.ui.AbstractDialog$b */
    public class DialogInterfaceOnClickListenerC7348b implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC7348b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            AbstractDialog.this.cancel();
        }
    }

    /* renamed from: com.huawei.hms.ui.AbstractDialog$c */
    public class DialogInterfaceOnCancelListenerC7349c implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC7349c() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            AbstractDialog.this.m8730a();
        }
    }

    /* renamed from: com.huawei.hms.ui.AbstractDialog$d */
    public class DialogInterfaceOnKeyListenerC7350d implements DialogInterface.OnKeyListener {
        public DialogInterfaceOnKeyListenerC7350d() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
            if (4 != i10 || keyEvent.getAction() != 1) {
                return false;
            }
            AbstractDialog.this.cancel();
            return true;
        }
    }

    /* renamed from: a */
    public void m8730a() {
        Callback callback = this.f11792c;
        if (callback != null) {
            callback.onCancel(this);
        }
    }

    /* renamed from: b */
    public void m8731b() {
        Callback callback = this.f11792c;
        if (callback != null) {
            callback.onDoWork(this);
        }
    }

    /* renamed from: c */
    public Activity m8732c() {
        return this.f11790a;
    }

    public void cancel() {
        AlertDialog alertDialog = this.f11791b;
        if (alertDialog != null) {
            alertDialog.cancel();
        }
    }

    /* renamed from: d */
    public int m8733d() {
        return UIUtil.getDialogThemeId(m8732c());
    }

    public void dismiss() {
        AlertDialog alertDialog = this.f11791b;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        this.f11791b.dismiss();
    }

    /* renamed from: e */
    public AlertDialog m8734e(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(m8732c(), m8733d());
        String strOnGetTitleString = onGetTitleString(activity);
        if (strOnGetTitleString != null) {
            builder.setTitle(strOnGetTitleString);
        }
        String strOnGetMessageString = onGetMessageString(activity);
        if (strOnGetMessageString != null) {
            builder.setMessage(strOnGetMessageString);
        }
        String strOnGetPositiveButtonString = onGetPositiveButtonString(activity);
        if (strOnGetPositiveButtonString != null) {
            builder.setPositiveButton(strOnGetPositiveButtonString, new DialogInterfaceOnClickListenerC7347a());
        }
        String strMo8735f = mo8735f(activity);
        if (strMo8735f != null) {
            builder.setNegativeButton(strMo8735f, new DialogInterfaceOnClickListenerC7348b());
        }
        return builder.create();
    }

    /* renamed from: f */
    public abstract String mo8735f(Context context);

    public abstract String onGetMessageString(Context context);

    public abstract String onGetPositiveButtonString(Context context);

    public abstract String onGetTitleString(Context context);

    public void setMessage(CharSequence charSequence) {
        AlertDialog alertDialog = this.f11791b;
        if (alertDialog != null) {
            alertDialog.setMessage(charSequence);
        }
    }

    public void setTitle(CharSequence charSequence) {
        AlertDialog alertDialog = this.f11791b;
        if (alertDialog != null) {
            alertDialog.setTitle(charSequence);
        }
    }

    public void show(Activity activity, Callback callback) {
        this.f11790a = activity;
        this.f11792c = callback;
        if (activity == null || activity.isFinishing()) {
            HMSLog.m8725e("AbstractDialog", "In show, The activity is null or finishing.");
            return;
        }
        AlertDialog alertDialogM8734e = m8734e(this.f11790a);
        this.f11791b = alertDialogM8734e;
        alertDialogM8734e.setCanceledOnTouchOutside(false);
        this.f11791b.setOnCancelListener(new DialogInterfaceOnCancelListenerC7349c());
        this.f11791b.setOnKeyListener(new DialogInterfaceOnKeyListenerC7350d());
        UIUtil.enableFocusedForButtonsInTV(this.f11791b);
        this.f11791b.show();
    }
}

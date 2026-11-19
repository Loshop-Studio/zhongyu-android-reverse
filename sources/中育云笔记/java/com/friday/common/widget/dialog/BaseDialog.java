package com.friday.common.widget.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class BaseDialog extends AppCompatDialogFragment {

    /* renamed from: e */
    public static final C5973a f6188e = new C5973a(null);

    /* renamed from: f */
    public static final int f6189f = 8;

    /* renamed from: d */
    public InterfaceC9540l f6190d;

    /* renamed from: com.friday.common.widget.dialog.BaseDialog$a */
    public static final class C5973a {
        public /* synthetic */ C5973a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ BaseDialog m5383b(C5973a c5973a, boolean z10, float f10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                f10 = 0.5f;
            }
            return c5973a.m5384a(z10, f10, interfaceC9540l);
        }

        /* renamed from: a */
        public final BaseDialog m5384a(boolean z10, float f10, InterfaceC9540l callDialog) {
            AbstractC9979u.m20294g(callDialog, "callDialog");
            BaseDialog baseDialog = new BaseDialog();
            Dialog dialog = baseDialog.getDialog();
            if (dialog != null) {
                dialog.requestWindowFeature(1);
            }
            baseDialog.setCancelable(z10);
            Bundle bundle = new Bundle();
            bundle.putFloat("dimAmount", f10);
            baseDialog.setArguments(bundle);
            baseDialog.m5382o(callDialog);
            return baseDialog;
        }

        public C5973a() {
        }
    }

    /* renamed from: o */
    public final void m5382o(InterfaceC9540l onCallDialogListener) {
        AbstractC9979u.m20294g(onCallDialogListener, "onCallDialogListener");
        this.f6190d = onCallDialogListener;
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        InterfaceC9540l interfaceC9540l = this.f6190d;
        if (interfaceC9540l == null) {
            Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
            AbstractC9979u.m20291d(dialogOnCreateDialog);
            return dialogOnCreateDialog;
        }
        AbstractC9979u.m20291d(interfaceC9540l);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        AbstractC9979u.m20293f(fragmentActivityRequireActivity, "requireActivity(...)");
        return (Dialog) interfaceC9540l.invoke(fragmentActivityRequireActivity);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            AbstractC9979u.m20291d(window);
            WindowManager.LayoutParams attributes = window.getAttributes();
            Bundle arguments = getArguments();
            Float fValueOf = arguments != null ? Float.valueOf(arguments.getFloat("dimAmount", 0.5f)) : null;
            attributes.dimAmount = fValueOf != null ? fValueOf.floatValue() : 0.5f;
            window.setAttributes(attributes);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager manager, String str) {
        AbstractC9979u.m20294g(manager, "manager");
        try {
            manager.beginTransaction().remove(this).commit();
            super.show(manager, str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}

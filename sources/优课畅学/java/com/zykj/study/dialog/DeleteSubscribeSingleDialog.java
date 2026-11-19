package com.zykj.study.dialog;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.base.BaseDialogFragment;
import com.zykj.study.R$layout;
import com.zykj.study.databinding.DialogSingleSubscribeDeleteBinding;
import com.zykj.study.dialog.DeleteSubscribeSingleDialog;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class DeleteSubscribeSingleDialog extends BaseDialogFragment<DialogSingleSubscribeDeleteBinding> {

    /* renamed from: a */
    public static final C7714a f11180a = new C7714a(null);

    /* renamed from: b */
    public static final int f11181b = 8;

    /* renamed from: com.zykj.study.dialog.DeleteSubscribeSingleDialog$a */
    public static final class C7714a {
        public /* synthetic */ C7714a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7714a() {
        }
    }

    /* renamed from: h */
    public static final void m10256h(DeleteSubscribeSingleDialog deleteSubscribeSingleDialog, View view) {
        FragmentKt.findNavController(deleteSubscribeSingleDialog).navigateUp();
    }

    /* renamed from: i */
    public static final void m10257i(DeleteSubscribeSingleDialog deleteSubscribeSingleDialog, View view) {
        Bundle bundle = new Bundle();
        Bundle arguments = deleteSubscribeSingleDialog.getArguments();
        bundle.putString("accountId", arguments != null ? arguments.getString("accountId") : null);
        C8736p c8736p = C8736p.f16368a;
        androidx.fragment.app.FragmentKt.setFragmentResult(deleteSubscribeSingleDialog, "DELETE_SUB_SING", bundle);
        FragmentKt.findNavController(deleteSubscribeSingleDialog).navigateUp();
    }

    @Override // com.zykj.base.BaseDialogFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        getMBindView().tvCancel.setOnClickListener(new View.OnClickListener() { // from class: p4.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteSubscribeSingleDialog.m10256h(this.f19347a, view);
            }
        });
        getMBindView().tvSure.setOnClickListener(new View.OnClickListener() { // from class: p4.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteSubscribeSingleDialog.m10257i(this.f19348a, view);
            }
        });
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R$layout.dialog_single_subscribe_delete;
    }
}

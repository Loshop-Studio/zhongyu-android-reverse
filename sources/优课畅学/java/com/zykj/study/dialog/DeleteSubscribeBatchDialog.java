package com.zykj.study.dialog;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.internal.view.SupportMenu;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.base.BaseDialogFragment;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.databinding.DialogBatchSubscribeDeleteBinding;
import com.zykj.study.dialog.DeleteSubscribeBatchDialog;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p201o7.AbstractC9536a;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class DeleteSubscribeBatchDialog extends BaseDialogFragment<DialogBatchSubscribeDeleteBinding> {

    /* renamed from: a */
    public static final C7712a f11176a = new C7712a(null);

    /* renamed from: b */
    public static final int f11177b = 8;

    /* renamed from: com.zykj.study.dialog.DeleteSubscribeBatchDialog$a */
    public static final class C7712a {
        public /* synthetic */ C7712a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7712a() {
        }
    }

    /* renamed from: h */
    public static final void m10251h(DeleteSubscribeBatchDialog deleteSubscribeBatchDialog, View view) {
        FragmentKt.findNavController(deleteSubscribeBatchDialog).navigateUp();
    }

    /* renamed from: i */
    public static final void m10252i(DeleteSubscribeBatchDialog deleteSubscribeBatchDialog, View view) {
        androidx.fragment.app.FragmentKt.setFragmentResult(deleteSubscribeBatchDialog, "DELETE_SUB_BATCH", new Bundle());
        FragmentKt.findNavController(deleteSubscribeBatchDialog).navigateUp();
    }

    @Override // com.zykj.base.BaseDialogFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        Object objM17798c;
        int i10 = R$string.batch_delete_dialog_message;
        Bundle arguments = getArguments();
        if (arguments == null || (objM17798c = arguments.getString("number")) == null) {
            objM17798c = AbstractC9536a.m17798c(0);
        }
        String string = getString(i10, objM17798c);
        AbstractC9133u.m16132f(string, "getString(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(SupportMenu.CATEGORY_MASK), 21, string.length() - 21, 33);
        getMBindView().tvMessage.setText(spannableStringBuilder);
        getMBindView().tvCancel.setOnClickListener(new View.OnClickListener() { // from class: p4.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteSubscribeBatchDialog.m10251h(this.f19345a, view);
            }
        });
        getMBindView().tvSure.setOnClickListener(new View.OnClickListener() { // from class: p4.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteSubscribeBatchDialog.m10252i(this.f19346a, view);
            }
        });
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R$layout.dialog_batch_subscribe_delete;
    }
}

package com.zykj.lib.ota;

import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.lib.ota.LatestVersionDialog;
import com.zykj.lib.ota.databinding.DialogLatestVersionBinding;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10559a;

/* loaded from: classes4.dex */
public final class LatestVersionDialog extends Hilt_LatestVersionDialog<DialogLatestVersionBinding> {

    /* renamed from: f */
    public final NavArgsLazy f10196f = new NavArgsLazy(AbstractC9137y.m16154b(LatestVersionDialogArgs.class), new C7366a(this));

    /* renamed from: com.zykj.lib.ota.LatestVersionDialog$a */
    public static final class C7366a implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f10197a;

        public C7366a(Fragment fragment) {
            this.f10197a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f10197a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f10197a + " has null arguments");
        }
    }

    /* renamed from: i */
    public static final C8736p m9435i(LatestVersionDialog latestVersionDialog) {
        FragmentKt.findNavController(latestVersionDialog).navigateUp();
        return C8736p.f16368a;
    }

    /* renamed from: h */
    public final LatestVersionDialogArgs m9436h() {
        return (LatestVersionDialogArgs) this.f10196f.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseDialogFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((DialogLatestVersionBinding) getMBindView()).mo9477a(m9436h().m9438a());
        TextView tvKnow = ((DialogLatestVersionBinding) getMBindView()).f10268a;
        AbstractC9133u.m16132f(tvKnow, "tvKnow");
        BindingAdaptersKt.onClick(tvKnow, new InterfaceC10559a() { // from class: s3.f
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return LatestVersionDialog.m9435i(this.f20022a);
            }
        });
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R$layout.dialog_latest_version;
    }
}

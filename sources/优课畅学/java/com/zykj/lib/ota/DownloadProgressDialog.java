package com.zykj.lib.ota;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavArgsLazy;
import com.zykj.lib.ota.databinding.DialogDownloadBinding;
import kotlin.jvm.internal.AbstractC9137y;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10559a;

/* loaded from: classes4.dex */
public final class DownloadProgressDialog extends Hilt_DownloadProgressDialog<DialogDownloadBinding> {

    /* renamed from: f */
    public final NavArgsLazy f10171f = new NavArgsLazy(AbstractC9137y.m16154b(DownloadProgressDialogArgs.class), new C7364a(this));

    /* renamed from: com.zykj.lib.ota.DownloadProgressDialog$a */
    public static final class C7364a implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f10172a;

        public C7364a(Fragment fragment) {
            this.f10172a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f10172a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f10172a + " has null arguments");
        }
    }

    /* renamed from: g */
    public final DownloadProgressDialogArgs m9425g() {
        return (DownloadProgressDialogArgs) this.f10171f.getValue();
    }

    @Override // com.zykj.base.BaseDialogFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        setCancelable(!m9425g().m9428b());
        m9425g().m9427a();
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R$layout.dialog_download;
    }
}

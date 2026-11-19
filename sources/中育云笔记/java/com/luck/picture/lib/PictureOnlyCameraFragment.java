package com.luck.picture.lib;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import com.luck.picture.lib.basic.PictureCommonFragment;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import p008a7.AbstractC0077j;
import p008a7.AbstractC0083p;
import p260n6.InterfaceC10322a;
import p387w6.AbstractC11707b;
import p387w6.C11706a;
import p387w6.InterfaceC11708c;

/* loaded from: classes5.dex */
public class PictureOnlyCameraFragment extends PictureCommonFragment {

    /* renamed from: m */
    public static final String f12028m = "PictureOnlyCameraFragment";

    /* renamed from: com.luck.picture.lib.PictureOnlyCameraFragment$a */
    public class C7389a implements InterfaceC11708c {
        public C7389a() {
        }

        @Override // p387w6.InterfaceC11708c
        public void onDenied() {
            PictureOnlyCameraFragment.this.m9282Y(AbstractC11707b.f27818c);
        }

        @Override // p387w6.InterfaceC11708c
        public void onGranted() {
            PictureOnlyCameraFragment.this.m9243A0();
        }
    }

    /* renamed from: U0 */
    public static PictureOnlyCameraFragment m8901U0() {
        return new PictureOnlyCameraFragment();
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    /* renamed from: P */
    public void mo8902P(LocalMedia localMedia) {
        if (m9250E(localMedia, false) == 0) {
            m9274R();
        } else {
            mo9087p0();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    /* renamed from: W */
    public int mo8903W() {
        return R$layout.ps_empty;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    /* renamed from: Z */
    public void mo8904Z(String[] strArr) {
        m9296s0(false, null);
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        boolean zM25879c = C11706a.m25879c(getContext());
        if (!AbstractC0077j.m217e()) {
            zM25879c = (AbstractC0077j.m218f() && this.f12263g.f12317J0) ? Environment.isExternalStorageManager() : C11706a.m25882f(getContext());
        }
        if (zM25879c) {
            m9243A0();
        } else {
            if (C11706a.m25879c(getContext())) {
                if (!((AbstractC0077j.m218f() && this.f12263g.f12317J0) ? Environment.isExternalStorageManager() : C11706a.m25882f(getContext()))) {
                    AbstractC0083p.m235c(getContext(), getString(R$string.ps_jurisdiction));
                }
            } else {
                AbstractC0083p.m235c(getContext(), getString(R$string.ps_camera));
            }
            mo9087p0();
        }
        AbstractC11707b.f27816a = new String[0];
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == 0) {
            mo9087p0();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            if (AbstractC0077j.m217e()) {
                m9243A0();
            } else {
                C11706a.m25878b().m25885i(this, AbstractC11707b.f27818c, new C7389a());
            }
        }
    }
}

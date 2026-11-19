package com.taobao.sophix.aidl;

import android.os.RemoteException;
import com.taobao.sophix.listener.PatchLoadStatusListener;

/* renamed from: com.taobao.sophix.aidl.c */
/* loaded from: classes4.dex */
public class C6355c implements PatchLoadStatusListener {

    /* renamed from: a */
    private InterfaceC6354b f4888a;

    public C6355c(InterfaceC6354b interfaceC6354b) {
        this.f4888a = interfaceC6354b;
    }

    @Override // com.taobao.sophix.listener.PatchLoadStatusListener
    public void onLoad(int i10, int i11, String str, int i12) {
        InterfaceC6354b interfaceC6354b = this.f4888a;
        if (interfaceC6354b != null) {
            try {
                interfaceC6354b.mo4572a(i10, i11, str, i12);
            } catch (RemoteException unused) {
            }
        }
    }
}

package com.taobao.sophix.aidl;

import android.os.RemoteException;
import com.taobao.sophix.listener.PatchLoadStatusListener;

/* renamed from: com.taobao.sophix.aidl.c */
/* loaded from: classes5.dex */
public class C7721c implements PatchLoadStatusListener {

    /* renamed from: a */
    private InterfaceC7720b f13330a;

    public C7721c(InterfaceC7720b interfaceC7720b) {
        this.f13330a = interfaceC7720b;
    }

    @Override // com.taobao.sophix.listener.PatchLoadStatusListener
    public void onLoad(int i10, int i11, String str, int i12) {
        InterfaceC7720b interfaceC7720b = this.f13330a;
        if (interfaceC7720b != null) {
            try {
                interfaceC7720b.mo10263a(i10, i11, str, i12);
            } catch (RemoteException unused) {
            }
        }
    }
}

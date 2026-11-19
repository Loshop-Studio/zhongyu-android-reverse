package com.taobao.sophix.aidl;

import android.os.RemoteException;
import com.taobao.sophix.listener.PatchLoadStatusListener;

/* renamed from: com.taobao.sophix.aidl.c */
/* loaded from: classes4.dex */
public class C6615c implements PatchLoadStatusListener {

    /* renamed from: a */
    private InterfaceC6614b f5465a;

    public C6615c(InterfaceC6614b interfaceC6614b) {
        this.f5465a = interfaceC6614b;
    }

    @Override // com.taobao.sophix.listener.PatchLoadStatusListener
    public void onLoad(int i9, int i10, String str, int i11) {
        InterfaceC6614b interfaceC6614b = this.f5465a;
        if (interfaceC6614b != null) {
            try {
                interfaceC6614b.mo4751a(i9, i10, str, i11);
            } catch (RemoteException unused) {
            }
        }
    }
}

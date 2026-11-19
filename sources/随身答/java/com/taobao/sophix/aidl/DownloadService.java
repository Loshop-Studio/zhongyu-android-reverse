package com.taobao.sophix.aidl;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import com.taobao.sophix.SophixManager;
import com.taobao.sophix.aidl.InterfaceC6613a;
import com.taobao.sophix.p059a.C6611e;
import com.taobao.sophix.p064c.C6627c;

/* loaded from: classes4.dex */
public class DownloadService extends Service {

    /* renamed from: a */
    private final InterfaceC6613a.a f5461a = new InterfaceC6613a.a() { // from class: com.taobao.sophix.aidl.DownloadService.1
        @Override // com.taobao.sophix.aidl.InterfaceC6613a
        /* renamed from: a */
        public void mo4749a(String str, InterfaceC6614b interfaceC6614b) {
            C6627c c6627c = new C6627c(1);
            c6627c.f5503d = -1;
            ((C6611e) SophixManager.getInstance()).m4744a(str, c6627c, new C6615c(interfaceC6614b));
        }

        @Override // com.taobao.sophix.aidl.InterfaceC6613a
        /* renamed from: b */
        public void mo4750b(String str, InterfaceC6614b interfaceC6614b) throws Throwable {
            if (str.startsWith("content://")) {
                ((C6611e) SophixManager.getInstance()).m4743a(Uri.parse(str), new C6615c(interfaceC6614b));
            } else {
                ((C6611e) SophixManager.getInstance()).m4745a(str, new C6615c(interfaceC6614b));
            }
        }
    };

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f5461a;
    }
}

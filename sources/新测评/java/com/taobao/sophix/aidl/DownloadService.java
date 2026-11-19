package com.taobao.sophix.aidl;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import com.taobao.sophix.SophixManager;
import com.taobao.sophix.aidl.InterfaceC6353a;
import com.taobao.sophix.p042a.C6351e;
import com.taobao.sophix.p047c.C6367c;

/* loaded from: classes4.dex */
public class DownloadService extends Service {

    /* renamed from: a */
    private final InterfaceC6353a.a f4884a = new InterfaceC6353a.a() { // from class: com.taobao.sophix.aidl.DownloadService.1
        @Override // com.taobao.sophix.aidl.InterfaceC6353a
        /* renamed from: a */
        public void mo4570a(String str, InterfaceC6354b interfaceC6354b) {
            C6367c c6367c = new C6367c(1);
            c6367c.f4926d = -1;
            ((C6351e) SophixManager.getInstance()).m4565a(str, c6367c, new C6355c(interfaceC6354b));
        }

        @Override // com.taobao.sophix.aidl.InterfaceC6353a
        /* renamed from: b */
        public void mo4571b(String str, InterfaceC6354b interfaceC6354b) throws Throwable {
            if (str.startsWith("content://")) {
                ((C6351e) SophixManager.getInstance()).m4564a(Uri.parse(str), new C6355c(interfaceC6354b));
            } else {
                ((C6351e) SophixManager.getInstance()).m4566a(str, new C6355c(interfaceC6354b));
            }
        }
    };

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f4884a;
    }
}

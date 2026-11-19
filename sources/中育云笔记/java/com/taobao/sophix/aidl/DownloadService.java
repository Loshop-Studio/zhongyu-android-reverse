package com.taobao.sophix.aidl;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import com.taobao.sophix.SophixManager;
import com.taobao.sophix.aidl.InterfaceC7719a;
import com.taobao.sophix.p089a.C7717e;
import com.taobao.sophix.p094c.C7733c;

/* loaded from: classes5.dex */
public class DownloadService extends Service {

    /* renamed from: a */
    private final InterfaceC7719a.a f13326a = new InterfaceC7719a.a() { // from class: com.taobao.sophix.aidl.DownloadService.1
        @Override // com.taobao.sophix.aidl.InterfaceC7719a
        /* renamed from: a */
        public void mo10261a(String str, InterfaceC7720b interfaceC7720b) {
            C7733c c7733c = new C7733c(1);
            c7733c.f13368d = -1;
            ((C7717e) SophixManager.getInstance()).m10256a(str, c7733c, new C7721c(interfaceC7720b));
        }

        @Override // com.taobao.sophix.aidl.InterfaceC7719a
        /* renamed from: b */
        public void mo10262b(String str, InterfaceC7720b interfaceC7720b) throws Throwable {
            if (str.startsWith("content://")) {
                ((C7717e) SophixManager.getInstance()).m10255a(Uri.parse(str), new C7721c(interfaceC7720b));
            } else {
                ((C7717e) SophixManager.getInstance()).m10257a(str, new C7721c(interfaceC7720b));
            }
        }
    };

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f13326a;
    }
}

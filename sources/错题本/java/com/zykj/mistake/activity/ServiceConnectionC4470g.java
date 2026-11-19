package com.zykj.mistake.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.view.LifecycleCoroutineScope;
import android.view.LifecycleOwnerKt;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import p068g7.C5609e;
import p068g7.ExecutorC5608d;
import p128o1.AbstractBinderC6266b;
import p128o1.C6265a;
import p128o1.InterfaceC6267c;

/* renamed from: com.zykj.mistake.activity.g */
/* loaded from: classes3.dex */
public final class ServiceConnectionC4470g implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ MainActivity f5901a;

    public ServiceConnectionC4470g(MainActivity mainActivity) {
        this.f5901a = mainActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [o1.c] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C6265a c6265a;
        int i = AbstractBinderC6266b.f10019c;
        if (iBinder == null) {
            c6265a = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.techvision.aldl.ICheckAppUpdate");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6267c)) {
                C6265a c6265a2 = new C6265a();
                c6265a2.f10018c = iBinder;
                c6265a = c6265a2;
            } else {
                c6265a = (InterfaceC6267c) iInterfaceQueryLocalInterface;
            }
        }
        MainActivity mainActivity = this.f5901a;
        mainActivity.f5787c = c6265a;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(mainActivity);
        C5609e c5609e = AbstractC5896f0.f9343a;
        AbstractC6014x.m5651v(lifecycleScope, ExecutorC5608d.f8730a, null, new MainActivity$connection$1$onServiceConnected$1(mainActivity, null), 2);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}

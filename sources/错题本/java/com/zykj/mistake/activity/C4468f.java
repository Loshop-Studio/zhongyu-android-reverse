package com.zykj.mistake.activity;

import android.view.LifecycleCoroutineScope;
import android.view.LifecycleOwnerKt;
import com.zykj.mistake.main.C5079v0;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import p045d6.C5443s;
import p068g7.C5609e;
import p068g7.ExecutorC5608d;
import p152r6.InterfaceC6469a;

/* renamed from: com.zykj.mistake.activity.f */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4468f implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f5895a;

    /* renamed from: b */
    public final /* synthetic */ MainActivity f5896b;

    public /* synthetic */ C4468f(MainActivity mainActivity, int i) {
        this.f5895a = i;
        this.f5896b = mainActivity;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        int i = this.f5895a;
        C5443s c5443s = C5443s.f8405a;
        MainActivity mainActivity = this.f5896b;
        switch (i) {
            case 0:
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(mainActivity);
                C5609e c5609e = AbstractC5896f0.f9343a;
                AbstractC6014x.m5651v(lifecycleScope, ExecutorC5608d.f8730a, null, new MainActivity$connection$1$onServiceConnected$1$1$1$1(mainActivity, null), 2);
                break;
            case 1:
                int i8 = MainActivity.f5784o;
                mainActivity.m3910o().m4354b(C5079v0.f7967a);
                break;
            default:
                int i9 = MainActivity.f5784o;
                mainActivity.finish();
                break;
        }
        return c5443s;
    }
}

package com.friday.main.view;

import android.app.ActivityManager;
import com.blankj.utilcode.util.AppUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import org.android.agoo.common.AgooConstants;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.view.HomeActivity$messageServerListener$1$serverInfoUpdate$1", m26211f = "HomeActivity.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class HomeActivity$messageServerListener$1$serverInfoUpdate$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f9411c;

    /* renamed from: d */
    public final /* synthetic */ HomeActivity f9412d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeActivity$messageServerListener$1$serverInfoUpdate$1(HomeActivity homeActivity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9412d = homeActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new HomeActivity$messageServerListener$1$serverInfoUpdate$1(this.f9412d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f9411c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        Object systemService = this.f9412d.getBaseContext().getApplicationContext().getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME);
        AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) systemService).getAppTasks();
        AbstractC9979u.m20291d(appTasks);
        Iterator<T> it = appTasks.iterator();
        while (it.hasNext()) {
            ((ActivityManager.AppTask) it.next()).finishAndRemoveTask();
        }
        AppUtils.exitApp();
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((HomeActivity$messageServerListener$1$serverInfoUpdate$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}

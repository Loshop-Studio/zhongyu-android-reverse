package com.zykj.mistake.activity;

import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.compose.FlowExtKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import com.zykj.mistake.main.AbstractC5055k;
import com.zykj.mistake.main.C5046f0;
import com.zykj.mistake.main.MainShellViewModel;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.flow.C5901a0;
import p045d6.C5443s;
import p075h6.InterfaceC5636h;
import p129o2.C6268a;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;
import p167t4.C6592e;
import p191w4.C6716a;
import p204y1.AbstractC6768a;
import p207y6.InterfaceC6781e;

/* renamed from: com.zykj.mistake.activity.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4462c implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f5882a;

    /* renamed from: b */
    public final /* synthetic */ MainActivity f5883b;

    public /* synthetic */ C4462c(MainActivity mainActivity, int i) {
        this.f5882a = i;
        this.f5883b = mainActivity;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f5882a;
        C5443s c5443s = C5443s.f8405a;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i8 = MainActivity.f5784o;
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1657665238, iIntValue, -1, "com.zykj.mistake.activity.MainActivity.onCreate.<anonymous> (MainActivity.kt:129)");
                    }
                    final NavHostController navHostControllerRememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composer, 0);
                    boolean zChanged = composer.changed(navHostControllerRememberNavController);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new C6592e(navHostControllerRememberNavController);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    final C6592e c6592e = (C6592e) objRememberedValue;
                    final MainActivity mainActivity = this.f5883b;
                    C6716a c6716a = mainActivity.f5797m;
                    if (c6716a == null) {
                        AbstractC5830k.m5339p("routeInfrastructure");
                        throw null;
                    }
                    AbstractC6768a.m6438b(mainActivity, c6716a, c6592e, ComposableLambdaKt.rememberComposableLambda(406143108, true, new InterfaceC6473e() { // from class: com.zykj.mistake.activity.d
                        @Override // p152r6.InterfaceC6473e
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i9 = MainActivity.f5784o;
                            if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(406143108, iIntValue2, -1, "com.zykj.mistake.activity.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:136)");
                                }
                                MainActivity mainActivity2 = mainActivity;
                                State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle((C5901a0) mainActivity2.f5796l.f9561d, (LifecycleOwner) null, (Lifecycle.State) null, (InterfaceC5636h) null, composer2, 0, 7);
                                MainShellViewModel mainShellViewModelM3910o = mainActivity2.m3910o();
                                C6268a c6268a = mainActivity2.f5786b;
                                boolean zBooleanValue = ((Boolean) stateCollectAsStateWithLifecycle.getValue()).booleanValue();
                                C6592e c6592e2 = c6592e;
                                boolean zChangedInstance = composer2.changedInstance(c6592e2);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new MainActivity$onCreate$1$1$1$1(c6592e2);
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                InterfaceC6469a interfaceC6469a = (InterfaceC6469a) ((InterfaceC6781e) objRememberedValue2);
                                boolean zChangedInstance2 = composer2.changedInstance(mainActivity2);
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new C4468f(mainActivity2, 2);
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                AbstractC5055k.m4376a(navHostControllerRememberNavController, mainShellViewModelM3910o, c6268a, zBooleanValue, interfaceC6469a, (InterfaceC6469a) objRememberedValue3, composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            return C5443s.f8405a;
                        }
                    }, composer, 54), composer, 3072);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return c5443s;
            default:
                String startTime = (String) obj;
                String endTime = (String) obj2;
                int i9 = MainActivity.f5784o;
                AbstractC5830k.m5330g(startTime, "startTime");
                AbstractC5830k.m5330g(endTime, "endTime");
                this.f5883b.m3910o().m4354b(new C5046f0(startTime, endTime));
                return c5443s;
        }
    }
}

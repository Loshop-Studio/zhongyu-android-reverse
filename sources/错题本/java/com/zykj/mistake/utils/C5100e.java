package com.zykj.mistake.utils;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.navigation.C2856d;
import androidx.navigation.C2857e;
import coil3.AbstractC3336u;
import coil3.C3333r;
import coil3.InterfaceC3308n;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC5830k;
import p006a5.ViewOnClickListenerC0015f;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.mistake.utils.e */
/* loaded from: classes3.dex */
public final class C5100e {

    /* renamed from: a */
    public static final C5100e f8035a = new C5100e();

    /* renamed from: b */
    public static String f8036b = null;

    /* renamed from: c */
    public static C3333r f8037c = null;

    /* renamed from: d */
    public static String f8038d = "";

    /* renamed from: b */
    public static void m4458b(int i, String str, String value) {
        if ((i & 2) != 0) {
            value = "";
        }
        AbstractC5830k.m5330g(value, "value");
        HashMap map = new HashMap();
        if (value.length() == 0) {
            map.put("click", f8038d);
            return;
        }
        map.put("click", f8038d + "_" + value);
    }

    /* renamed from: c */
    public static InterfaceC6469a m4459c(InterfaceC6469a onClick, Composer composer, int i, int i8) {
        AbstractC5830k.m5330g(onClick, "onClick");
        boolean z8 = true;
        long j7 = (i8 & 1) != 0 ? 1000L : 3000L;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1452740947, i, -1, "com.zykj.mistake.utils.SingleClickUtil.rememberSingleClickHandler (SingleClickUtil.kt:38)");
        }
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onClick, composer, (i >> 3) & 14);
        if ((((i & 14) ^ 6) <= 4 || !composer.changed(j7)) && (i & 6) != 4) {
            z8 = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new C5106k(j7);
            composer.updateRememberedValue(objRememberedValue);
        }
        C5106k c5106k = (C5106k) objRememberedValue;
        boolean zChanged = composer.changed(c5106k);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new C2857e(21, c5106k, stateRememberUpdatedState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        InterfaceC6469a interfaceC6469a = (InterfaceC6469a) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return interfaceC6469a;
    }

    /* renamed from: d */
    public static InterfaceC6471c m4460d(Composer composer, InterfaceC6471c onClick) {
        AbstractC5830k.m5330g(onClick, "onClick");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(198788651, 390, -1, "com.zykj.mistake.utils.SingleClickUtil.rememberSingleClickHandler (SingleClickUtil.kt:50)");
        }
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onClick, composer, 0);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new C5106k(3000L);
            composer.updateRememberedValue(objRememberedValue);
        }
        C5106k c5106k = (C5106k) objRememberedValue;
        boolean zChanged = composer.changed(c5106k);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new C2856d(14, c5106k, stateRememberUpdatedState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        InterfaceC6471c interfaceC6471c = (InterfaceC6471c) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return interfaceC6471c;
    }

    /* renamed from: e */
    public static void m4461e(View view, InterfaceC6469a interfaceC6469a) {
        AbstractC5830k.m5330g(view, "<this>");
        view.setOnClickListener(new ViewOnClickListenerC0015f(7, new C5106k(1000L), interfaceC6469a));
    }

    /* renamed from: a */
    public synchronized InterfaceC3308n m4462a(Context context) {
        InterfaceC3308n interfaceC3308nM2283a;
        AbstractC5830k.m5330g(context, "context");
        interfaceC3308nM2283a = f8037c;
        if (interfaceC3308nM2283a == null) {
            Context applicationContext = context.getApplicationContext();
            AbstractC5830k.m5329f(applicationContext, "getApplicationContext(...)");
            interfaceC3308nM2283a = AbstractC3336u.m2283a(applicationContext);
        }
        return interfaceC3308nM2283a;
    }
}

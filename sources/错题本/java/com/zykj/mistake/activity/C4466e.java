package com.zykj.mistake.activity;

import com.zykj.mistake.main.C5029d0;
import com.zykj.mistake.platform.picker.CollectionDatePickerTarget;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p152r6.InterfaceC6474f;

/* renamed from: com.zykj.mistake.activity.e */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4466e implements InterfaceC6474f {

    /* renamed from: a */
    public final /* synthetic */ MainActivity f5892a;

    public /* synthetic */ C4466e(MainActivity mainActivity) {
        this.f5892a = mainActivity;
    }

    @Override // p152r6.InterfaceC6474f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CollectionDatePickerTarget target = (CollectionDatePickerTarget) obj;
        String startTime = (String) obj2;
        String endTime = (String) obj3;
        int i = MainActivity.f5784o;
        AbstractC5830k.m5330g(target, "target");
        AbstractC5830k.m5330g(startTime, "startTime");
        AbstractC5830k.m5330g(endTime, "endTime");
        this.f5892a.m3910o().m4354b(new C5029d0(target, startTime, endTime));
        return C5443s.f8405a;
    }
}

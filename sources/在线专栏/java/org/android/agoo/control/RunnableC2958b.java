package org.android.agoo.control;

import com.taobao.accs.base.TaoBaseService;

/* renamed from: org.android.agoo.control.b */
/* loaded from: classes.dex */
class RunnableC2958b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ byte[] f11431a;

    /* renamed from: b */
    final /* synthetic */ String f11432b;

    /* renamed from: c */
    final /* synthetic */ TaoBaseService.ExtraInfo f11433c;

    /* renamed from: d */
    final /* synthetic */ AgooFactory f11434d;

    RunnableC2958b(AgooFactory agooFactory, byte[] bArr, String str, TaoBaseService.ExtraInfo extraInfo) {
        this.f11434d = agooFactory;
        this.f11431a = bArr;
        this.f11432b = str;
        this.f11433c = extraInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f11434d.msgReceiverPreHandler(this.f11431a, this.f11432b, this.f11433c, true);
    }
}

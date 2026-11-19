package org.android.agoo.control;

import com.taobao.accs.base.TaoBaseService;

/* renamed from: org.android.agoo.control.b */
/* loaded from: classes6.dex */
class RunnableC10558b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ byte[] f25313a;

    /* renamed from: b */
    final /* synthetic */ String f25314b;

    /* renamed from: c */
    final /* synthetic */ TaoBaseService.ExtraInfo f25315c;

    /* renamed from: d */
    final /* synthetic */ AgooFactory f25316d;

    public RunnableC10558b(AgooFactory agooFactory, byte[] bArr, String str, TaoBaseService.ExtraInfo extraInfo) {
        this.f25316d = agooFactory;
        this.f25313a = bArr;
        this.f25314b = str;
        this.f25315c = extraInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f25316d.msgReceiverPreHandler(this.f25313a, this.f25314b, this.f25315c, true);
    }
}

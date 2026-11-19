package org.android.agoo.control;

/* renamed from: org.android.agoo.control.e */
/* loaded from: classes6.dex */
class RunnableC10561e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f25321a;

    /* renamed from: b */
    final /* synthetic */ String f25322b;

    /* renamed from: c */
    final /* synthetic */ AgooFactory f25323c;

    public RunnableC10561e(AgooFactory agooFactory, String str, String str2) {
        this.f25323c = agooFactory;
        this.f25321a = str;
        this.f25322b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f25323c.updateMsgStatus(this.f25321a, this.f25322b);
    }
}

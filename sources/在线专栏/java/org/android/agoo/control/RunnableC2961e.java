package org.android.agoo.control;

/* renamed from: org.android.agoo.control.e */
/* loaded from: classes.dex */
class RunnableC2961e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f11439a;

    /* renamed from: b */
    final /* synthetic */ String f11440b;

    /* renamed from: c */
    final /* synthetic */ AgooFactory f11441c;

    RunnableC2961e(AgooFactory agooFactory, String str, String str2) {
        this.f11441c = agooFactory;
        this.f11439a = str;
        this.f11440b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f11441c.updateMsgStatus(this.f11439a, this.f11440b);
    }
}

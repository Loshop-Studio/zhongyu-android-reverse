package com.google.android.material.timepicker;

/* renamed from: com.google.android.material.timepicker.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3770b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2939a;

    /* renamed from: b */
    public final /* synthetic */ Object f2940b;

    public /* synthetic */ RunnableC3770b(Object obj, int i) {
        this.f2939a = i;
        this.f2940b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2939a) {
            case 0:
                ((RadialViewGroup) this.f2940b).updateLayoutParams();
                break;
            default:
                ((MaterialTimePicker) this.f2940b).lambda$onViewCreated$0();
                break;
        }
    }
}

package com.google.android.material.textfield;

/* renamed from: com.google.android.material.textfield.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3747d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2933a;

    /* renamed from: b */
    public final /* synthetic */ Object f2934b;

    public /* synthetic */ RunnableC3747d(Object obj, int i) {
        this.f2933a = i;
        this.f2934b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2933a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f2934b).lambda$tearDown$2();
                break;
            case 1:
                ((DropdownMenuEndIconDelegate) this.f2934b).lambda$afterEditTextChanged$3();
                break;
            default:
                ((TextInputLayout) this.f2934b).lambda$onGlobalLayout$1();
                break;
        }
    }
}

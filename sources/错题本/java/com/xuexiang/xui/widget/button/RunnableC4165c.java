package com.xuexiang.xui.widget.button;

/* renamed from: com.xuexiang.xui.widget.button.c */
/* loaded from: classes3.dex */
public final class RunnableC4165c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4134a;

    /* renamed from: b */
    public final /* synthetic */ SmoothCheckBox f4135b;

    public /* synthetic */ RunnableC4165c(SmoothCheckBox smoothCheckBox, int i) {
        this.f4134a = i;
        this.f4135b = smoothCheckBox;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4134a) {
            case 0:
                this.f4135b.postInvalidate();
                break;
            default:
                SmoothCheckBox smoothCheckBox = this.f4135b;
                smoothCheckBox.f4113t = true;
                smoothCheckBox.postInvalidate();
                break;
        }
    }
}

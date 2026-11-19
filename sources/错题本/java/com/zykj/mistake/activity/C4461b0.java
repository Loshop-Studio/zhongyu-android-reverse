package com.zykj.mistake.activity;

import android.view.KeyEvent;
import android.view.View;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;

/* renamed from: com.zykj.mistake.activity.b0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4461b0 implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f5880a;

    /* renamed from: b */
    public final /* synthetic */ KeyEvent.Callback f5881b;

    public /* synthetic */ C4461b0(KeyEvent.Callback callback, int i) {
        this.f5880a = i;
        this.f5881b = callback;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        int i = this.f5880a;
        C5443s c5443s = C5443s.f8405a;
        KeyEvent.Callback callback = this.f5881b;
        switch (i) {
            case 0:
                int i8 = SketchActivity.f5853v;
                ((View) callback).setEnabled(true);
                break;
            default:
                int i9 = SketchPlayerActivity.f5871g;
                ((SketchPlayerActivity) callback).finish();
                break;
        }
        return c5443s;
    }
}

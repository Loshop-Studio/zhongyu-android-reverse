package com.zykj.mistake.feature.notebook.detail;

import com.zykj.view.simpleBoard.SimpleBoardView;
import kotlin.collections.AbstractC5806u;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;

/* renamed from: com.zykj.mistake.feature.notebook.detail.c0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4773c0 implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f6937a;

    /* renamed from: b */
    public final /* synthetic */ C4764a5 f6938b;

    public /* synthetic */ C4773c0(C4764a5 c4764a5, int i) {
        this.f6937a = i;
        this.f6938b = c4764a5;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        SimpleBoardView simpleBoardView;
        SimpleBoardView simpleBoardView2;
        switch (this.f6937a) {
            case 0:
                SimpleBoardView simpleBoardView3 = this.f6938b.f6894a;
                if (simpleBoardView3 != null) {
                    simpleBoardView3.clean();
                }
                break;
            case 1:
                C4764a5 c4764a5 = this.f6938b;
                float fM5273l = AbstractC5806u.m5273l(c4764a5.f6898e + 0.1f, 1.0f, 1.5f);
                if (fM5273l != c4764a5.f6898e && (simpleBoardView = c4764a5.f6894a) != null && simpleBoardView.setScale(fM5273l)) {
                    c4764a5.f6898e = fM5273l;
                }
                break;
            case 2:
                C4764a5 c4764a52 = this.f6938b;
                float fM5273l2 = AbstractC5806u.m5273l(c4764a52.f6898e - 0.1f, 1.0f, 1.5f);
                if (fM5273l2 != c4764a52.f6898e && (simpleBoardView2 = c4764a52.f6894a) != null && simpleBoardView2.setScale(fM5273l2)) {
                    c4764a52.f6898e = fM5273l2;
                }
                break;
            default:
                C4764a5 c4764a53 = this.f6938b;
                if (!c4764a53.f6909p) {
                    c4764a53.f6908o = true;
                }
                break;
        }
        return C5443s.f8405a;
    }
}

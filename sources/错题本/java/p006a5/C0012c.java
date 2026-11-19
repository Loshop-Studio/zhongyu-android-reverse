package p006a5;

import android.widget.LinearLayout;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;

/* renamed from: a5.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0012c implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f30a;

    /* renamed from: b */
    public final /* synthetic */ LinearLayout f31b;

    public /* synthetic */ C0012c(LinearLayout linearLayout, int i) {
        this.f30a = i;
        this.f31b = linearLayout;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        switch (this.f30a) {
            case 0:
                this.f31b.setVisibility(0);
                break;
            default:
                this.f31b.setVisibility(0);
                break;
        }
        return C5443s.f8405a;
    }
}

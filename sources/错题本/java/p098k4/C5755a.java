package p098k4;

import com.zykj.mistake.network.InterfaceC5090c;
import com.zykj.view.board.play.C5353b;
import p152r6.InterfaceC6469a;

/* renamed from: k4.a */
/* loaded from: classes3.dex */
public final class C5755a {

    /* renamed from: a */
    public final InterfaceC6469a f9107a;

    public C5755a(int i) {
        switch (i) {
            case 1:
                this.f9107a = new C5353b(6);
                break;
            default:
                this.f9107a = new C5353b(5);
                break;
        }
    }

    /* renamed from: a */
    public InterfaceC5090c m5095a() {
        return (InterfaceC5090c) this.f9107a.invoke();
    }
}

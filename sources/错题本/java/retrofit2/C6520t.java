package retrofit2;

import kotlin.Result;
import kotlinx.coroutines.C5961g;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

/* renamed from: retrofit2.t */
/* loaded from: classes4.dex */
public final class C6520t implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f10791a;

    /* renamed from: b */
    public final /* synthetic */ Object f10792b;

    public /* synthetic */ C6520t(Object obj, int i) {
        this.f10791a = i;
        this.f10792b = obj;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        switch (this.f10791a) {
            case 0:
                ((InterfaceC6490e) this.f10792b).cancel();
                return C5443s.f8405a;
            case 1:
                ((InterfaceC6490e) this.f10792b).cancel();
                return C5443s.f8405a;
            case 2:
                ((InterfaceC6490e) this.f10792b).cancel();
                return C5443s.f8405a;
            default:
                C5961g c5961g = (C5961g) this.f10792b;
                C5443s c5443s = C5443s.f8405a;
                c5961g.resumeWith(Result.m13956constructorimpl(c5443s));
                return c5443s;
        }
    }
}

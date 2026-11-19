package td;

import android.os.Looper;
import java.util.List;
import p410xd.InterfaceC11866q;
import sd.AbstractC11164t1;

/* renamed from: td.a */
/* loaded from: classes6.dex */
public final class C11270a implements InterfaceC11866q {
    @Override // p410xd.InterfaceC11866q
    /* renamed from: a */
    public String mo25199a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // p410xd.InterfaceC11866q
    /* renamed from: b */
    public AbstractC11164t1 mo25200b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C11275f(AbstractC11277h.m25212a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // p410xd.InterfaceC11866q
    /* renamed from: c */
    public int mo25201c() {
        return 1073741823;
    }
}

package p146j8;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.android.HandlerContext;
import p135i8.AbstractC8841h1;
import p191n8.InterfaceC9466s;

/* renamed from: j8.a */
/* loaded from: classes5.dex */
public final class C9026a implements InterfaceC9466s {
    @Override // p191n8.InterfaceC9466s
    /* renamed from: a */
    public String mo15689a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // p191n8.InterfaceC9466s
    /* renamed from: b */
    public AbstractC8841h1 mo15690b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new HandlerContext(AbstractC9030e.m15694a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // p191n8.InterfaceC9466s
    /* renamed from: c */
    public int mo15691c() {
        return 1073741823;
    }
}

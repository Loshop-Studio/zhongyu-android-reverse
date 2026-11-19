package na;

import com.zykj.blackboard.utils.EventKey;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* renamed from: na.i */
/* loaded from: classes5.dex */
public final class C10346i {

    /* renamed from: a */
    public static final C10346i f24652a = new C10346i();

    /* renamed from: b */
    public static final HashMap f24653b = new HashMap();

    /* renamed from: a */
    public final void m21639a() {
        f24653b.clear();
    }

    /* renamed from: b */
    public final void m21640b(EventKey eventKey) {
        InterfaceC9529a interfaceC9529a;
        AbstractC9979u.m20294g(eventKey, "eventKey");
        HashMap map = f24653b;
        if (map.get(eventKey) == null || (interfaceC9529a = (InterfaceC9529a) map.get(eventKey)) == null) {
            return;
        }
        interfaceC9529a.invoke();
    }

    /* renamed from: c */
    public final void m21641c(EventKey eventKey, InterfaceC9529a function) {
        AbstractC9979u.m20294g(eventKey, "eventKey");
        AbstractC9979u.m20294g(function, "function");
        f24653b.put(eventKey, function);
    }
}

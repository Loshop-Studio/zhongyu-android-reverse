package p077e5;

import com.zykj.blackboard.utils.EventKey;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e5.h */
/* loaded from: classes4.dex */
public final class C7347h {

    /* renamed from: a */
    public static final C7347h f11914a = new C7347h();

    /* renamed from: b */
    public static final HashMap f11915b = new HashMap();

    /* renamed from: a */
    public final void m11757a() {
        f11915b.clear();
    }

    /* renamed from: b */
    public final void m11758b(EventKey eventKey) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        HashMap map = f11915b;
        if (map.get(eventKey) == null || (function0 = (Function0) map.get(eventKey)) == null) {
            return;
        }
        function0.invoke();
    }

    /* renamed from: c */
    public final void m11759c(EventKey eventKey, Function0 function) {
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        Intrinsics.checkNotNullParameter(function, "function");
        f11915b.put(eventKey, function);
    }
}

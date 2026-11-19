package p263u5;

import com.zykj.blackboard.utils.EventKey;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u5.i */
/* loaded from: classes4.dex */
public final class C9690i {

    /* renamed from: a */
    public static final C9690i f17127a = new C9690i();

    /* renamed from: b */
    public static final HashMap f17128b = new HashMap();

    /* renamed from: a */
    public final void m16178a() {
        f17128b.clear();
    }

    /* renamed from: b */
    public final void m16179b(EventKey eventKey) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        HashMap map = f17128b;
        if (map.get(eventKey) == null || (function0 = (Function0) map.get(eventKey)) == null) {
            return;
        }
        function0.invoke();
    }

    /* renamed from: c */
    public final void m16180c(EventKey eventKey, Function0 function) {
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        Intrinsics.checkNotNullParameter(function, "function");
        f17128b.put(eventKey, function);
    }
}

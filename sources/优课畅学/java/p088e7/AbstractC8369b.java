package p088e7;

import androidx.camera.view.AbstractC0949q;
import ba.InterfaceC5219c;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import p100f7.AbstractC8462a;
import p321z6.AbstractC10726b;

/* renamed from: e7.b */
/* loaded from: classes5.dex */
public abstract class AbstractC8369b {
    /* renamed from: a */
    public static String m13657a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    /* renamed from: b */
    public static void m13658b(Class cls) {
        AbstractC8462a.m13801k(new ProtocolViolationException(m13657a(cls.getName())));
    }

    /* renamed from: c */
    public static boolean m13659c(AtomicReference atomicReference, InterfaceC5219c interfaceC5219c, Class cls) {
        AbstractC10726b.m20030c(interfaceC5219c, "next is null");
        if (AbstractC0949q.m807a(atomicReference, null, interfaceC5219c)) {
            return true;
        }
        interfaceC5219c.cancel();
        if (atomicReference.get() == SubscriptionHelper.CANCELLED) {
            return false;
        }
        m13658b(cls);
        return false;
    }
}

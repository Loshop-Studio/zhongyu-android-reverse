package p301x8;

import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import p089e8.InterfaceC8375c;
import p134i7.AbstractC8809v;
import p246s8.InterfaceC10051a;
import p246s8.InterfaceC10052b;
import p246s8.InterfaceC10059i;

/* renamed from: x8.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10583a {
    public /* synthetic */ AbstractC10583a(AbstractC9126n abstractC9126n) {
        this();
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC10052b m19741c(AbstractC10583a abstractC10583a, InterfaceC8375c interfaceC8375c, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i10 & 2) != 0) {
            list = AbstractC8809v.m14771n();
        }
        return abstractC10583a.mo16911b(interfaceC8375c, list);
    }

    /* renamed from: a */
    public abstract void mo16910a(InterfaceC10585c interfaceC10585c);

    /* renamed from: b */
    public abstract InterfaceC10052b mo16911b(InterfaceC8375c interfaceC8375c, List list);

    /* renamed from: d */
    public abstract boolean mo16912d();

    /* renamed from: e */
    public abstract InterfaceC10051a mo16913e(InterfaceC8375c interfaceC8375c, String str);

    /* renamed from: f */
    public abstract InterfaceC10059i mo16914f(InterfaceC8375c interfaceC8375c, Object obj);

    public AbstractC10583a() {
    }
}

package p182he;

import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import p049ce.InterfaceC5431a;
import p049ce.InterfaceC5432b;
import p049ce.InterfaceC5439i;
import p280od.InterfaceC10469c;
import p325rc.AbstractC10978w;

/* renamed from: he.a */
/* loaded from: classes6.dex */
public abstract class AbstractC9553a {
    public /* synthetic */ AbstractC9553a(AbstractC9972n abstractC9972n) {
        this();
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC5432b m18776c(AbstractC9553a abstractC9553a, InterfaceC10469c interfaceC10469c, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i10 & 2) != 0) {
            list = AbstractC10978w.m24136n();
        }
        return abstractC9553a.mo18778b(interfaceC10469c, list);
    }

    /* renamed from: a */
    public abstract void mo18777a(InterfaceC9555c interfaceC9555c);

    /* renamed from: b */
    public abstract InterfaceC5432b mo18778b(InterfaceC10469c interfaceC10469c, List list);

    /* renamed from: d */
    public abstract boolean mo18779d();

    /* renamed from: e */
    public abstract InterfaceC5431a mo18780e(InterfaceC10469c interfaceC10469c, String str);

    /* renamed from: f */
    public abstract InterfaceC5439i mo18781f(InterfaceC10469c interfaceC10469c, Object obj);

    public AbstractC9553a() {
    }
}

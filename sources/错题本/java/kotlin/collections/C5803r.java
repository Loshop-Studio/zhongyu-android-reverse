package kotlin.collections;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.C5848i;
import p152r6.InterfaceC6473e;
import p185v7.AbstractC6683l;
import p214z6.InterfaceC6830h;

/* renamed from: kotlin.collections.r */
/* loaded from: classes2.dex */
public final class C5803r implements InterfaceC6830h {

    /* renamed from: a */
    public final /* synthetic */ int f9197a;

    /* renamed from: b */
    public final /* synthetic */ Object f9198b;

    public /* synthetic */ C5803r(Object obj, int i) {
        this.f9197a = i;
        this.f9198b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.coroutines.jvm.internal.RestrictedSuspendLambda, r6.e] */
    @Override // p214z6.InterfaceC6830h
    public final Iterator iterator() {
        switch (this.f9197a) {
            case 0:
                return AbstractC5830k.m5335l((Object[]) this.f9198b);
            case 1:
                return ((Iterable) this.f9198b).iterator();
            case 2:
                return new C5848i((CharSequence) this.f9198b);
            case 3:
                return AbstractC6683l.m6376p((RestrictedSuspendLambda) this.f9198b);
            default:
                return (Iterator) this.f9198b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5803r(InterfaceC6473e interfaceC6473e) {
        this.f9197a = 3;
        this.f9198b = (RestrictedSuspendLambda) interfaceC6473e;
    }
}

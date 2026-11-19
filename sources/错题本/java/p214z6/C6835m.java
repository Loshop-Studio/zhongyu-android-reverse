package p214z6;

import kotlin.jvm.internal.AbstractC5830k;
import okio.ForwardingFileSystem;
import okio.Path;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

/* renamed from: z6.m */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6835m implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f11582a;

    /* renamed from: b */
    public final /* synthetic */ Object f11583b;

    public /* synthetic */ C6835m(Object obj, int i) {
        this.f11582a = i;
        this.f11583b = obj;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object it) {
        switch (this.f11582a) {
            case 0:
                InterfaceC6469a interfaceC6469a = (InterfaceC6469a) this.f11583b;
                AbstractC5830k.m5330g(it, "it");
                return interfaceC6469a.invoke();
            default:
                return ForwardingFileSystem.listRecursively$lambda$2((ForwardingFileSystem) this.f11583b, (Path) it);
        }
    }
}

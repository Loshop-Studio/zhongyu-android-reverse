package p125n7;

import coil3.network.AbstractC3315g;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import p101k7.C5770l;
import p101k7.InterfaceC5765g;
import p118m7.C6128d0;
import p118m7.C6156m1;

/* renamed from: n7.v */
/* loaded from: classes4.dex */
public final class C6247v implements InterfaceC5765g {

    /* renamed from: b */
    public static final C6247v f9994b = new C6247v();

    /* renamed from: c */
    public static final String f9995c = "kotlinx.serialization.json.JsonObject";

    /* renamed from: a */
    public final /* synthetic */ C6128d0 f9996a;

    public C6247v() {
        C6156m1 c6156m1 = C6156m1.f9829a;
        C6238m c6238m = C6238m.f9984a;
        InterfaceC5765g keyDesc = c6156m1.getDescriptor();
        InterfaceC5765g valueDesc = c6238m.getDescriptor();
        AbstractC5830k.m5330g(keyDesc, "keyDesc");
        AbstractC5830k.m5330g(valueDesc, "valueDesc");
        this.f9996a = new C6128d0("kotlin.collections.LinkedHashMap", keyDesc, valueDesc);
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: b */
    public final boolean mo5099b() {
        this.f9996a.getClass();
        return false;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: c */
    public final int mo5100c(String name) {
        AbstractC5830k.m5330g(name, "name");
        return this.f9996a.mo5100c(name);
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: d */
    public final int mo5101d() {
        this.f9996a.getClass();
        return 2;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: e */
    public final String mo5102e(int i) {
        this.f9996a.getClass();
        return String.valueOf(i);
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: f */
    public final List mo5103f(int i) {
        return this.f9996a.mo5103f(i);
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: g */
    public final InterfaceC5765g mo5104g(int i) {
        return this.f9996a.mo5104g(i);
    }

    @Override // p101k7.InterfaceC5765g
    public final List getAnnotations() {
        this.f9996a.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // p101k7.InterfaceC5765g
    public final AbstractC3315g getKind() {
        this.f9996a.getClass();
        return C5770l.f9148d;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: h */
    public final String mo5105h() {
        return f9995c;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: i */
    public final boolean mo5106i(int i) {
        this.f9996a.mo5106i(i);
        return false;
    }

    @Override // p101k7.InterfaceC5765g
    public final boolean isInline() {
        this.f9996a.getClass();
        return false;
    }
}

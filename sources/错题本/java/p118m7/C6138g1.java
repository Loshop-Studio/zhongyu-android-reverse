package p118m7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.AbstractC5830k;
import p084i7.InterfaceC5686b;
import p101k7.InterfaceC5765g;
import p185v7.AbstractC6675d;
import p207y6.InterfaceC6779c;

/* renamed from: m7.g1 */
/* loaded from: classes4.dex */
public final class C6138g1 extends AbstractC6169r {

    /* renamed from: b */
    public final InterfaceC6779c f9803b;

    /* renamed from: c */
    public final C6124c f9804c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6138g1(InterfaceC6779c interfaceC6779c, InterfaceC5686b eSerializer) {
        super(eSerializer);
        AbstractC5830k.m5330g(eSerializer, "eSerializer");
        this.f9803b = interfaceC6779c;
        InterfaceC5765g elementDesc = eSerializer.getDescriptor();
        AbstractC5830k.m5330g(elementDesc, "elementDesc");
        this.f9804c = new C6124c(elementDesc, 0);
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: a */
    public final Object mo5809a() {
        return new ArrayList();
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: b */
    public final int mo5810b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        AbstractC5830k.m5330g(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: c */
    public final void mo5811c(int i, Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        AbstractC5830k.m5330g(arrayList, "<this>");
        arrayList.ensureCapacity(i);
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: d */
    public final Iterator mo5812d(Object obj) {
        Object[] objArr = (Object[]) obj;
        AbstractC5830k.m5330g(objArr, "<this>");
        return AbstractC5830k.m5335l(objArr);
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: e */
    public final int mo5813e(Object obj) {
        Object[] objArr = (Object[]) obj;
        AbstractC5830k.m5330g(objArr, "<this>");
        return objArr.length;
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return this.f9804c;
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: i */
    public final Object mo5817i(Object obj) {
        AbstractC5830k.m5330g(null, "<this>");
        AbstractC5802q.m5208u(null);
        throw null;
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: j */
    public final Object mo5818j(Object obj) throws NegativeArraySizeException {
        ArrayList arrayList = (ArrayList) obj;
        AbstractC5830k.m5330g(arrayList, "<this>");
        InterfaceC6779c eClass = this.f9803b;
        AbstractC5830k.m5330g(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) AbstractC6675d.m6349m(eClass), arrayList.size());
        AbstractC5830k.m5328e(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        AbstractC5830k.m5329f(array, "toArray(...)");
        return array;
    }

    @Override // p118m7.AbstractC6169r
    /* renamed from: k */
    public final void mo5826k(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        AbstractC5830k.m5330g(arrayList, "<this>");
        arrayList.add(i, obj2);
    }
}

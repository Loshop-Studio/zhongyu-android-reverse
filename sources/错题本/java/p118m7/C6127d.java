package p118m7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC5830k;
import p084i7.InterfaceC5686b;
import p101k7.InterfaceC5765g;

/* renamed from: m7.d */
/* loaded from: classes4.dex */
public final class C6127d extends AbstractC6169r {

    /* renamed from: b */
    public final /* synthetic */ int f9783b;

    /* renamed from: c */
    public final AbstractC6152l0 f9784c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6127d(InterfaceC5686b eSerializer, int i) {
        super(eSerializer);
        this.f9783b = i;
        switch (i) {
            case 1:
                AbstractC5830k.m5330g(eSerializer, "eSerializer");
                super(eSerializer);
                InterfaceC5765g elementDesc = eSerializer.getDescriptor();
                AbstractC5830k.m5330g(elementDesc, "elementDesc");
                this.f9784c = new C6124c(elementDesc, 2);
                break;
            case 2:
                AbstractC5830k.m5330g(eSerializer, "eSerializer");
                super(eSerializer);
                InterfaceC5765g elementDesc2 = eSerializer.getDescriptor();
                AbstractC5830k.m5330g(elementDesc2, "elementDesc");
                this.f9784c = new C6124c(elementDesc2, 3);
                break;
            default:
                AbstractC5830k.m5330g(eSerializer, "element");
                InterfaceC5765g elementDesc3 = eSerializer.getDescriptor();
                AbstractC5830k.m5330g(elementDesc3, "elementDesc");
                this.f9784c = new C6124c(elementDesc3, 1);
                break;
        }
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: a */
    public final Object mo5809a() {
        switch (this.f9783b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: b */
    public final int mo5810b(Object obj) {
        switch (this.f9783b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                AbstractC5830k.m5330g(arrayList, "<this>");
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                AbstractC5830k.m5330g(hashSet, "<this>");
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                AbstractC5830k.m5330g(linkedHashSet, "<this>");
                return linkedHashSet.size();
        }
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: c */
    public final void mo5811c(int i, Object obj) {
        switch (this.f9783b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                AbstractC5830k.m5330g(arrayList, "<this>");
                arrayList.ensureCapacity(i);
                break;
            case 1:
                AbstractC5830k.m5330g((HashSet) obj, "<this>");
                break;
            default:
                AbstractC5830k.m5330g((LinkedHashSet) obj, "<this>");
                break;
        }
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: d */
    public final Iterator mo5812d(Object obj) {
        Collection collection = (Collection) obj;
        AbstractC5830k.m5330g(collection, "<this>");
        return collection.iterator();
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: e */
    public final int mo5813e(Object obj) {
        Collection collection = (Collection) obj;
        AbstractC5830k.m5330g(collection, "<this>");
        return collection.size();
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        switch (this.f9783b) {
        }
        return (C6124c) this.f9784c;
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: i */
    public final Object mo5817i(Object obj) {
        switch (this.f9783b) {
            case 0:
                AbstractC5830k.m5330g(null, "<this>");
                return new ArrayList((Collection) null);
            case 1:
                AbstractC5830k.m5330g(null, "<this>");
                return new HashSet((Collection) null);
            default:
                AbstractC5830k.m5330g(null, "<this>");
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: j */
    public final Object mo5818j(Object obj) {
        switch (this.f9783b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                AbstractC5830k.m5330g(arrayList, "<this>");
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                AbstractC5830k.m5330g(hashSet, "<this>");
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                AbstractC5830k.m5330g(linkedHashSet, "<this>");
                return linkedHashSet;
        }
    }

    @Override // p118m7.AbstractC6169r
    /* renamed from: k */
    public final void mo5826k(int i, Object obj, Object obj2) {
        switch (this.f9783b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                AbstractC5830k.m5330g(arrayList, "<this>");
                arrayList.add(i, obj2);
                break;
            case 1:
                HashSet hashSet = (HashSet) obj;
                AbstractC5830k.m5330g(hashSet, "<this>");
                hashSet.add(obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                AbstractC5830k.m5330g(linkedHashSet, "<this>");
                linkedHashSet.add(obj2);
                break;
        }
    }
}

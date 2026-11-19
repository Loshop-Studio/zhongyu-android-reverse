package p290w8;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10052b;

/* renamed from: w8.x */
/* loaded from: classes5.dex */
public abstract class AbstractC10463x extends AbstractC10459w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10463x(InterfaceC10052b element) {
        super(element, null);
        AbstractC9133u.m16133g(element, "element");
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Iterator mo19305d(Collection collection) {
        AbstractC9133u.m16133g(collection, "<this>");
        return collection.iterator();
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int mo19306e(Collection collection) {
        AbstractC9133u.m16133g(collection, "<this>");
        return collection.size();
    }
}

package ge;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;

/* renamed from: ge.x */
/* loaded from: classes6.dex */
public abstract class AbstractC9396x extends AbstractC9392w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9396x(InterfaceC5432b element) {
        super(element, null);
        AbstractC9979u.m20294g(element, "element");
    }

    @Override // ge.AbstractC9294a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Iterator mo18331d(Collection collection) {
        AbstractC9979u.m20294g(collection, "<this>");
        return collection.iterator();
    }

    @Override // ge.AbstractC9294a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int mo18332e(Collection collection) {
        AbstractC9979u.m20294g(collection, "<this>");
        return collection.size();
    }
}

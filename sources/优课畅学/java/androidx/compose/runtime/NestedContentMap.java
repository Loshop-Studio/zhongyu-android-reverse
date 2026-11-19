package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.compose.runtime.collection.MultiValueMap;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class NestedContentMap {
    private final MutableScatterMap<Object, Object> contentMap = MultiValueMap.m23782constructorimpl$default(null, 1, null);
    private final MutableScatterMap<Object, Object> containerMap = MultiValueMap.m23782constructorimpl$default(null, 1, null);

    public final void add(MovableContent<Object> movableContent, NestedMovableContent nestedMovableContent) {
        MultiValueMap.m23778addimpl(this.contentMap, movableContent, nestedMovableContent);
        MultiValueMap.m23778addimpl(this.containerMap, nestedMovableContent.getContainer(), movableContent);
    }

    public final void clear() {
        MultiValueMap.m23780clearimpl(this.contentMap);
        MultiValueMap.m23780clearimpl(this.containerMap);
    }

    public final boolean contains(MovableContent<Object> movableContent) {
        return MultiValueMap.m23783containsimpl(this.contentMap, movableContent);
    }

    public final NestedMovableContent removeLast(MovableContent<Object> movableContent) {
        NestedMovableContent nestedMovableContent = (NestedMovableContent) MultiValueMap.m23792removeLastimpl(this.contentMap, movableContent);
        if (MultiValueMap.m23789isEmptyimpl(this.contentMap)) {
            MultiValueMap.m23780clearimpl(this.containerMap);
        }
        return nestedMovableContent;
    }

    public final void usedContainer(final MovableContentStateReference movableContentStateReference) {
        Object obj = this.containerMap.get(movableContentStateReference);
        if (obj != null) {
            if (!(obj instanceof MutableObjectList)) {
                AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                MultiValueMap.m23793removeValueIfimpl(this.contentMap, (MovableContent) obj, new InterfaceC10570l() { // from class: androidx.compose.runtime.NestedContentMap$usedContainer$1$1
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public final Boolean invoke(NestedMovableContent nestedMovableContent) {
                        return Boolean.valueOf(AbstractC9133u.m16128b(nestedMovableContent.getContainer(), movableContentStateReference));
                    }
                });
                return;
            }
            ObjectList objectList = (ObjectList) obj;
            Object[] objArr = objectList.content;
            int i10 = objectList._size;
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj2 = objArr[i11];
                AbstractC9133u.m16131e(obj2, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                MultiValueMap.m23793removeValueIfimpl(this.contentMap, (MovableContent) obj2, new InterfaceC10570l() { // from class: androidx.compose.runtime.NestedContentMap$usedContainer$1$1
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public final Boolean invoke(NestedMovableContent nestedMovableContent) {
                        return Boolean.valueOf(AbstractC9133u.m16128b(nestedMovableContent.getContainer(), movableContentStateReference));
                    }
                });
            }
        }
    }
}

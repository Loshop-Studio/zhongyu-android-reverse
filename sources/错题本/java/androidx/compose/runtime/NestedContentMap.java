package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003J\u001f\u0010\r\u001a\u0004\u0018\u00010\u00062\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\u00020\u000f2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R.\u0010\u0017\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R.\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u00168\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, m5110d2 = {"Landroidx/compose/runtime/NestedContentMap;", "", "<init>", "()V", "Landroidx/compose/runtime/MovableContent;", "content", "Landroidx/compose/runtime/NestedMovableContent;", "nestedContent", "Ld6/s;", "add", "(Landroidx/compose/runtime/MovableContent;Landroidx/compose/runtime/NestedMovableContent;)V", "clear", "key", "removeLast", "(Landroidx/compose/runtime/MovableContent;)Landroidx/compose/runtime/NestedMovableContent;", "", "contains", "(Landroidx/compose/runtime/MovableContent;)Z", "Landroidx/compose/runtime/MovableContentStateReference;", TypedValues.Custom.S_REFERENCE, "usedContainer", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "Landroidx/compose/runtime/collection/MultiValueMap;", "contentMap", "Landroidx/collection/MutableScatterMap;", "containerMap", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/NestedContentMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MultiValueMap.kt\nandroidx/compose/runtime/collection/MultiValueMap\n+ 4 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1791:1\n1#2:1792\n118#3,4:1793\n123#3,4:1803\n287#4,6:1797\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/NestedContentMap\n*L\n1780#1:1793,4\n1780#1:1803,4\n1780#1:1797,6\n*E\n"})
/* loaded from: classes.dex */
final class NestedContentMap {

    @NotNull
    private final MutableScatterMap<Object, Object> contentMap = MultiValueMap.m10188constructorimpl$default(null, 1, null);

    @NotNull
    private final MutableScatterMap<Object, Object> containerMap = MultiValueMap.m10188constructorimpl$default(null, 1, null);

    public final void add(@NotNull MovableContent<Object> content, @NotNull NestedMovableContent nestedContent) {
        MultiValueMap.m10184addimpl(this.contentMap, content, nestedContent);
        MultiValueMap.m10184addimpl(this.containerMap, nestedContent.getContainer(), content);
    }

    public final void clear() {
        MultiValueMap.m10186clearimpl(this.contentMap);
        MultiValueMap.m10186clearimpl(this.containerMap);
    }

    public final boolean contains(@NotNull MovableContent<Object> key) {
        return MultiValueMap.m10189containsimpl(this.contentMap, key);
    }

    @Nullable
    public final NestedMovableContent removeLast(@NotNull MovableContent<Object> key) {
        NestedMovableContent nestedMovableContent = (NestedMovableContent) MultiValueMap.m10198removeLastimpl(this.contentMap, key);
        if (MultiValueMap.m10195isEmptyimpl(this.contentMap)) {
            MultiValueMap.m10186clearimpl(this.containerMap);
        }
        return nestedMovableContent;
    }

    public final void usedContainer(@NotNull final MovableContentStateReference reference) {
        Object obj = this.containerMap.get(reference);
        if (obj != null) {
            if (!(obj instanceof MutableObjectList)) {
                MultiValueMap.m10199removeValueIfimpl(this.contentMap, (MovableContent) obj, new InterfaceC6471c() { // from class: androidx.compose.runtime.NestedContentMap$usedContainer$1$1
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public final Boolean invoke(NestedMovableContent nestedMovableContent) {
                        return Boolean.valueOf(AbstractC5830k.m5325b(nestedMovableContent.getContainer(), reference));
                    }
                });
                return;
            }
            ObjectList objectList = (ObjectList) obj;
            Object[] objArr = objectList.content;
            int i = objectList._size;
            for (int i8 = 0; i8 < i; i8++) {
                Object obj2 = objArr[i8];
                AbstractC5830k.m5328e(obj2, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                MultiValueMap.m10199removeValueIfimpl(this.contentMap, (MovableContent) obj2, new InterfaceC6471c() { // from class: androidx.compose.runtime.NestedContentMap$usedContainer$1$1
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public final Boolean invoke(NestedMovableContent nestedMovableContent) {
                        return Boolean.valueOf(AbstractC5830k.m5325b(nestedMovableContent.getContainer(), reference));
                    }
                });
            }
        }
    }
}

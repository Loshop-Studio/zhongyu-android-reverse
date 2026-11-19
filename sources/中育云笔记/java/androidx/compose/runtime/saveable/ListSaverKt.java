package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9962d0;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
public final class ListSaverKt {
    public static final <Original, Saveable> Saver<Original, Object> listSaver(final InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l) {
        InterfaceC9544p interfaceC9544p2 = new InterfaceC9544p() { // from class: androidx.compose.runtime.saveable.ListSaverKt.listSaver.1
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((SaverScope) obj, (SaverScope) obj2);
            }

            public final Object invoke(SaverScope saverScope, Original original) {
                List list = (List) interfaceC9544p.invoke(saverScope, original);
                List list2 = list;
                int size = list2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = list.get(i10);
                    if (obj != null && !saverScope.canBeSaved(obj)) {
                        throw new IllegalArgumentException("item can't be saved");
                    }
                }
                if (list2.isEmpty()) {
                    return null;
                }
                return new ArrayList(list2);
            }
        };
        AbstractC9979u.m20292e(interfaceC9540l, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return SaverKt.Saver(interfaceC9544p2, (InterfaceC9540l) AbstractC9962d0.m20254e(interfaceC9540l, 1));
    }
}

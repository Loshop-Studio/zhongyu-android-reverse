package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9116d0;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class ListSaverKt {
    public static final <Original, Saveable> Saver<Original, Object> listSaver(final InterfaceC10574p interfaceC10574p, InterfaceC10570l interfaceC10570l) {
        InterfaceC10574p interfaceC10574p2 = new InterfaceC10574p() { // from class: androidx.compose.runtime.saveable.ListSaverKt.listSaver.1
            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((SaverScope) obj, (SaverScope) obj2);
            }

            public final Object invoke(SaverScope saverScope, Original original) {
                List list = (List) interfaceC10574p.invoke(saverScope, original);
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = list.get(i10);
                    if (obj != null && !saverScope.canBeSaved(obj)) {
                        throw new IllegalArgumentException("item can't be saved");
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            }
        };
        AbstractC9133u.m16131e(interfaceC10570l, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return SaverKt.Saver(interfaceC10574p2, (InterfaceC10570l) AbstractC9116d0.m16096e(interfaceC10570l, 1));
    }
}

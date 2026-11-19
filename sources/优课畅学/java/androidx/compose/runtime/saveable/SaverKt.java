package androidx.compose.runtime.saveable;

import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class SaverKt {
    private static final Saver<Object, Object> AutoSaver = Saver(new InterfaceC10574p() { // from class: androidx.compose.runtime.saveable.SaverKt$AutoSaver$1
        @Override // p300x7.InterfaceC10574p
        public final Object invoke(SaverScope saverScope, Object obj) {
            return obj;
        }
    }, new InterfaceC10570l() { // from class: androidx.compose.runtime.saveable.SaverKt$AutoSaver$2
        @Override // p300x7.InterfaceC10570l
        public final Object invoke(Object obj) {
            return obj;
        }
    });

    public static final <Original, Saveable> Saver<Original, Saveable> Saver(final InterfaceC10574p interfaceC10574p, final InterfaceC10570l interfaceC10570l) {
        return new Saver<Original, Saveable>() { // from class: androidx.compose.runtime.saveable.SaverKt.Saver.1
            @Override // androidx.compose.runtime.saveable.Saver
            public Original restore(Saveable saveable) {
                return (Original) interfaceC10570l.invoke(saveable);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public Saveable save(SaverScope saverScope, Original original) {
                return (Saveable) interfaceC10574p.invoke(saverScope, original);
            }
        };
    }

    public static final <T> Saver<T, Object> autoSaver() {
        Saver<T, Object> saver = (Saver<T, Object>) AutoSaver;
        AbstractC9133u.m16131e(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return saver;
    }
}

package androidx.compose.runtime.saveable;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
public final class SaverKt {
    private static final Saver<Object, Object> AutoSaver = Saver(new InterfaceC9544p() { // from class: androidx.compose.runtime.saveable.SaverKt$AutoSaver$1
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SaverScope saverScope, Object obj) {
            return obj;
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.runtime.saveable.SaverKt$AutoSaver$2
        @Override // p181hd.InterfaceC9540l
        public final Object invoke(Object obj) {
            return obj;
        }
    });

    public static final <Original, Saveable> Saver<Original, Saveable> Saver(final InterfaceC9544p interfaceC9544p, final InterfaceC9540l interfaceC9540l) {
        return new Saver<Original, Saveable>() { // from class: androidx.compose.runtime.saveable.SaverKt.Saver.1
            @Override // androidx.compose.runtime.saveable.Saver
            public Original restore(Saveable saveable) {
                return (Original) interfaceC9540l.invoke(saveable);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public Saveable save(SaverScope saverScope, Original original) {
                return (Saveable) interfaceC9544p.invoke(saverScope, original);
            }
        };
    }

    public static final <T> Saver<T, Object> autoSaver() {
        Saver<T, Object> saver = (Saver<T, Object>) AutoSaver;
        AbstractC9979u.m20292e(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return saver;
    }
}

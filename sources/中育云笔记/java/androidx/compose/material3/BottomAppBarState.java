package androidx.compose.material3;

import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p325rc.AbstractC10978w;

@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public interface BottomAppBarState {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Saver<BottomAppBarState, ?> Saver = ListSaverKt.listSaver(new InterfaceC9544p() { // from class: androidx.compose.material3.BottomAppBarState$Companion$Saver$1
            @Override // p181hd.InterfaceC9544p
            public final List<Float> invoke(SaverScope saverScope, BottomAppBarState bottomAppBarState) {
                return AbstractC10978w.m24139q(Float.valueOf(bottomAppBarState.getHeightOffsetLimit()), Float.valueOf(bottomAppBarState.getHeightOffset()), Float.valueOf(bottomAppBarState.getContentOffset()));
            }
        }, new InterfaceC9540l() { // from class: androidx.compose.material3.BottomAppBarState$Companion$Saver$2
            @Override // p181hd.InterfaceC9540l
            public final BottomAppBarState invoke(List<Float> list) {
                return AppBarKt.BottomAppBarState(list.get(0).floatValue(), list.get(1).floatValue(), list.get(2).floatValue());
            }
        });

        private Companion() {
        }

        public final Saver<BottomAppBarState, ?> getSaver() {
            return Saver;
        }
    }

    float getCollapsedFraction();

    float getContentOffset();

    float getHeightOffset();

    float getHeightOffsetLimit();

    void setContentOffset(float f10);

    void setHeightOffset(float f10);

    void setHeightOffsetLimit(float f10);
}

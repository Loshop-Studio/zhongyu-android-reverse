package androidx.compose.material3;

import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public interface BottomAppBarState {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Saver<BottomAppBarState, ?> Saver = ListSaverKt.listSaver(new InterfaceC10574p() { // from class: androidx.compose.material3.BottomAppBarState$Companion$Saver$1
            @Override // p300x7.InterfaceC10574p
            public final List<Float> invoke(SaverScope saverScope, BottomAppBarState bottomAppBarState) {
                return AbstractC8809v.m14774q(Float.valueOf(bottomAppBarState.getHeightOffsetLimit()), Float.valueOf(bottomAppBarState.getHeightOffset()), Float.valueOf(bottomAppBarState.getContentOffset()));
            }
        }, new InterfaceC10570l() { // from class: androidx.compose.material3.BottomAppBarState$Companion$Saver$2
            @Override // p300x7.InterfaceC10570l
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

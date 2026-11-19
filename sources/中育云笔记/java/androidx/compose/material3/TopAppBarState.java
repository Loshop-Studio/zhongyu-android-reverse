package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p265nd.AbstractC10410o;
import p325rc.AbstractC10978w;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class TopAppBarState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<TopAppBarState, ?> Saver = ListSaverKt.listSaver(new InterfaceC9544p() { // from class: androidx.compose.material3.TopAppBarState$Companion$Saver$1
        @Override // p181hd.InterfaceC9544p
        public final List<Float> invoke(SaverScope saverScope, TopAppBarState topAppBarState) {
            return AbstractC10978w.m24139q(Float.valueOf(topAppBarState.getHeightOffsetLimit()), Float.valueOf(topAppBarState.getHeightOffset()), Float.valueOf(topAppBarState.getContentOffset()));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.material3.TopAppBarState$Companion$Saver$2
        @Override // p181hd.InterfaceC9540l
        public final TopAppBarState invoke(List<Float> list) {
            return new TopAppBarState(list.get(0).floatValue(), list.get(1).floatValue(), list.get(2).floatValue());
        }
    });
    private MutableFloatState _heightOffset;
    private final MutableFloatState contentOffset$delegate;
    private final MutableFloatState heightOffsetLimit$delegate;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final Saver<TopAppBarState, ?> getSaver() {
            return TopAppBarState.Saver;
        }

        private Companion() {
        }
    }

    public TopAppBarState(float f10, float f11, float f12) {
        this.heightOffsetLimit$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f10);
        this.contentOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f12);
        this._heightOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(f11);
    }

    public final float getCollapsedFraction() {
        if (getHeightOffsetLimit() == 0.0f) {
            return 0.0f;
        }
        return getHeightOffset() / getHeightOffsetLimit();
    }

    public final float getContentOffset() {
        return this.contentOffset$delegate.getFloatValue();
    }

    public final float getHeightOffset() {
        return this._heightOffset.getFloatValue();
    }

    public final float getHeightOffsetLimit() {
        return this.heightOffsetLimit$delegate.getFloatValue();
    }

    public final float getOverlappedFraction() {
        if (getHeightOffsetLimit() == 0.0f) {
            return 0.0f;
        }
        return 1 - (AbstractC10410o.m21760m(getHeightOffsetLimit() - getContentOffset(), getHeightOffsetLimit(), 0.0f) / getHeightOffsetLimit());
    }

    public final void setContentOffset(float f10) {
        this.contentOffset$delegate.setFloatValue(f10);
    }

    public final void setHeightOffset(float f10) {
        this._heightOffset.setFloatValue(AbstractC10410o.m21760m(f10, getHeightOffsetLimit(), 0.0f));
    }

    public final void setHeightOffsetLimit(float f10) {
        this.heightOffsetLimit$delegate.setFloatValue(f10);
    }
}

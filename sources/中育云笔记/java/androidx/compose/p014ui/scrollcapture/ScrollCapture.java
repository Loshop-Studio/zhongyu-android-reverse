package androidx.compose.p014ui.scrollcapture;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.RectHelper_androidKt;
import androidx.compose.p014ui.layout.LayoutCoordinatesKt;
import androidx.compose.p014ui.scrollcapture.ComposeScrollCaptureCallback;
import androidx.compose.p014ui.semantics.SemanticsOwner;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntRectKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.function.Consumer;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.AbstractC10006d;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p364uc.AbstractC11382b;

@StabilityInferred(parameters = 1)
@RequiresApi(31)
/* loaded from: classes2.dex */
public final class ScrollCapture implements ComposeScrollCaptureCallback.ScrollCaptureSessionListener {
    public static final int $stable = 0;
    private final MutableState scrollCaptureInProgress$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* renamed from: androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$1 */
    public /* synthetic */ class C30861 extends AdaptedFunctionReference implements InterfaceC9540l {
        public C30861(Object obj) {
            super(1, obj, MutableVector.class, "add", "add(Ljava/lang/Object;)Z", 8);
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ScrollCaptureCandidate) obj);
            return C10786q.f26013a;
        }

        public final void invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
            ((MutableVector) this.receiver).add(scrollCaptureCandidate);
        }
    }

    private final void setScrollCaptureInProgress(boolean z10) {
        this.scrollCaptureInProgress$delegate.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getScrollCaptureInProgress() {
        return ((Boolean) this.scrollCaptureInProgress$delegate.getValue()).booleanValue();
    }

    public final void onScrollCaptureSearch(View view, SemanticsOwner semanticsOwner, InterfaceC9945d interfaceC9945d, Consumer<ScrollCaptureTarget> consumer) {
        MutableVector mutableVector = new MutableVector(new ScrollCaptureCandidate[16], 0);
        ScrollCapture_androidKt.visitScrollCaptureCandidates$default(semanticsOwner.getUnmergedRootSemanticsNode(), 0, new C30861(mutableVector), 2, null);
        mutableVector.sortWith(AbstractC11382b.m25328b(new InterfaceC9540l() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture.onScrollCaptureSearch.2
            @Override // p181hd.InterfaceC9540l
            public final Comparable<?> invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
                return Integer.valueOf(scrollCaptureCandidate.getDepth());
            }
        }, new InterfaceC9540l() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture.onScrollCaptureSearch.3
            @Override // p181hd.InterfaceC9540l
            public final Comparable<?> invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
                return Integer.valueOf(scrollCaptureCandidate.getViewportBoundsInWindow().getHeight());
            }
        }));
        ScrollCaptureCandidate scrollCaptureCandidate = (ScrollCaptureCandidate) (mutableVector.getSize() != 0 ? mutableVector.content[mutableVector.getSize() - 1] : null);
        if (scrollCaptureCandidate == null) {
            return;
        }
        ComposeScrollCaptureCallback composeScrollCaptureCallback = new ComposeScrollCaptureCallback(scrollCaptureCandidate.getNode(), scrollCaptureCandidate.getViewportBoundsInWindow(), AbstractC10006d.m20744a(interfaceC9945d), this, view);
        Rect rectBoundsInRoot = LayoutCoordinatesKt.boundsInRoot(scrollCaptureCandidate.getCoordinates());
        long jM33658getTopLeftnOccac = scrollCaptureCandidate.getViewportBoundsInWindow().m33658getTopLeftnOccac();
        ScrollCaptureTarget scrollCaptureTargetM1333a = AbstractC3094f.m1333a(view, RectHelper_androidKt.toAndroidRect(IntRectKt.roundToIntRect(rectBoundsInRoot)), new Point(IntOffset.m33629getXimpl(jM33658getTopLeftnOccac), IntOffset.m33630getYimpl(jM33658getTopLeftnOccac)), AbstractC3092d.m1331a(composeScrollCaptureCallback));
        scrollCaptureTargetM1333a.setScrollBounds(RectHelper_androidKt.toAndroidRect(scrollCaptureCandidate.getViewportBoundsInWindow()));
        consumer.accept(scrollCaptureTargetM1333a);
    }

    @Override // androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.ScrollCaptureSessionListener
    public void onSessionEnded() {
        setScrollCaptureInProgress(false);
    }

    @Override // androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.ScrollCaptureSessionListener
    public void onSessionStarted() {
        setScrollCaptureInProgress(true);
    }
}

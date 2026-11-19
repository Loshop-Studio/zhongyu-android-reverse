package androidx.compose.p013ui.scrollcapture;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.graphics.RectHelper_androidKt;
import androidx.compose.p013ui.layout.LayoutCoordinatesKt;
import androidx.compose.p013ui.scrollcapture.ComposeScrollCaptureCallback;
import androidx.compose.p013ui.semantics.SemanticsOwner;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntRectKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.function.Consumer;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.AbstractC9165e;
import p123h7.C8736p;
import p168l7.AbstractC9260b;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 1)
@RequiresApi(31)
/* loaded from: classes2.dex */
public final class ScrollCapture implements ComposeScrollCaptureCallback.ScrollCaptureSessionListener {
    public static final int $stable = 0;
    private final MutableState scrollCaptureInProgress$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* renamed from: androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$1 */
    public /* synthetic */ class C30561 extends AdaptedFunctionReference implements InterfaceC10570l {
        public C30561(Object obj) {
            super(1, obj, MutableVector.class, "add", "add(Ljava/lang/Object;)Z", 8);
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ScrollCaptureCandidate) obj);
            return C8736p.f16368a;
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

    public final void onScrollCaptureSearch(View view, SemanticsOwner semanticsOwner, InterfaceC9100d interfaceC9100d, Consumer<ScrollCaptureTarget> consumer) {
        MutableVector mutableVector = new MutableVector(new ScrollCaptureCandidate[16], 0);
        ScrollCapture_androidKt.visitScrollCaptureCandidates$default(semanticsOwner.getUnmergedRootSemanticsNode(), 0, new C30561(mutableVector), 2, null);
        mutableVector.sortWith(AbstractC9260b.m16975b(new InterfaceC10570l() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture.onScrollCaptureSearch.2
            @Override // p300x7.InterfaceC10570l
            public final Comparable<?> invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
                return Integer.valueOf(scrollCaptureCandidate.getDepth());
            }
        }, new InterfaceC10570l() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture.onScrollCaptureSearch.3
            @Override // p300x7.InterfaceC10570l
            public final Comparable<?> invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
                return Integer.valueOf(scrollCaptureCandidate.getViewportBoundsInWindow().getHeight());
            }
        }));
        ScrollCaptureCandidate scrollCaptureCandidate = (ScrollCaptureCandidate) (mutableVector.getSize() != 0 ? mutableVector.content[mutableVector.getSize() - 1] : null);
        if (scrollCaptureCandidate == null) {
            return;
        }
        ComposeScrollCaptureCallback composeScrollCaptureCallback = new ComposeScrollCaptureCallback(scrollCaptureCandidate.getNode(), scrollCaptureCandidate.getViewportBoundsInWindow(), AbstractC9165e.m16552a(interfaceC9100d), this, view);
        Rect rectBoundsInRoot = LayoutCoordinatesKt.boundsInRoot(scrollCaptureCandidate.getCoordinates());
        long jM27056getTopLeftnOccac = scrollCaptureCandidate.getViewportBoundsInWindow().m27056getTopLeftnOccac();
        ScrollCaptureTarget scrollCaptureTargetM1256a = AbstractC3064f.m1256a(view, RectHelper_androidKt.toAndroidRect(IntRectKt.roundToIntRect(rectBoundsInRoot)), new Point(IntOffset.m27027getXimpl(jM27056getTopLeftnOccac), IntOffset.m27028getYimpl(jM27056getTopLeftnOccac)), AbstractC3062d.m1254a(composeScrollCaptureCallback));
        scrollCaptureTargetM1256a.setScrollBounds(RectHelper_androidKt.toAndroidRect(scrollCaptureCandidate.getViewportBoundsInWindow()));
        consumer.accept(scrollCaptureTargetM1256a);
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

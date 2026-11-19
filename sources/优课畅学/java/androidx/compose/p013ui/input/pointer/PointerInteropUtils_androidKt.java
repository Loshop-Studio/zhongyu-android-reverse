package androidx.compose.p013ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class PointerInteropUtils_androidKt {
    public static final void emptyCancelMotionEventScope(long j10, InterfaceC10570l interfaceC10570l) {
        MotionEvent motionEventObtain = MotionEvent.obtain(j10, j10, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setSource(0);
        interfaceC10570l.invoke(motionEventObtain);
        motionEventObtain.recycle();
    }

    public static /* synthetic */ void emptyCancelMotionEventScope$default(long j10, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = SystemClock.uptimeMillis();
        }
        emptyCancelMotionEventScope(j10, interfaceC10570l);
    }

    /* renamed from: toCancelMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m25560toCancelMotionEventScoped4ec7I(PointerEvent pointerEvent, long j10, InterfaceC10570l interfaceC10570l) {
        m25562toMotionEventScopeubNVwUQ(pointerEvent, j10, interfaceC10570l, true);
    }

    /* renamed from: toMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m25561toMotionEventScoped4ec7I(PointerEvent pointerEvent, long j10, InterfaceC10570l interfaceC10570l) {
        m25562toMotionEventScopeubNVwUQ(pointerEvent, j10, interfaceC10570l, false);
    }

    /* renamed from: toMotionEventScope-ubNVwUQ, reason: not valid java name */
    private static final void m25562toMotionEventScopeubNVwUQ(PointerEvent pointerEvent, long j10, InterfaceC10570l interfaceC10570l, boolean z10) {
        MotionEvent motionEvent$ui_release = pointerEvent.getMotionEvent$ui_release();
        if (motionEvent$ui_release == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEvent$ui_release.getAction();
        if (z10) {
            motionEvent$ui_release.setAction(3);
        }
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        motionEvent$ui_release.offsetLocation(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
        interfaceC10570l.invoke(motionEvent$ui_release);
        motionEvent$ui_release.offsetLocation(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        motionEvent$ui_release.setAction(action);
    }
}

package androidx.compose.runtime;

import android.os.Looper;
import kotlin.AbstractC9923a;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10770a;
import p309qc.InterfaceC10773d;

/* loaded from: classes2.dex */
final /* synthetic */ class ActualAndroid_androidKt__MonotonicFrameClock_androidKt {
    private static final InterfaceC10773d DefaultMonotonicFrameClock$delegate = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: androidx.compose.runtime.ActualAndroid_androidKt__MonotonicFrameClock_androidKt$DefaultMonotonicFrameClock$2
        @Override // p181hd.InterfaceC9529a
        public final MonotonicFrameClock invoke() {
            return Looper.getMainLooper() != null ? DefaultChoreographerFrameClock.INSTANCE : FallbackFrameClock.INSTANCE;
        }
    });
    private static final boolean DisallowDefaultMonotonicFrameClock = false;

    public static final MonotonicFrameClock getDefaultMonotonicFrameClock() {
        return (MonotonicFrameClock) DefaultMonotonicFrameClock$delegate.getValue();
    }

    @InterfaceC10770a
    public static /* synthetic */ void getDefaultMonotonicFrameClock$annotations() {
    }
}

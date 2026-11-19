package androidx.compose.runtime;

import android.os.Looper;
import kotlin.AbstractC9078a;
import p123h7.InterfaceC8721a;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
final /* synthetic */ class ActualAndroid_androidKt__MonotonicFrameClock_androidKt {
    private static final InterfaceC8724d DefaultMonotonicFrameClock$delegate = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: androidx.compose.runtime.ActualAndroid_androidKt__MonotonicFrameClock_androidKt$DefaultMonotonicFrameClock$2
        @Override // p300x7.InterfaceC10559a
        public final MonotonicFrameClock invoke() {
            return Looper.getMainLooper() != null ? DefaultChoreographerFrameClock.INSTANCE : FallbackFrameClock.INSTANCE;
        }
    });
    private static final boolean DisallowDefaultMonotonicFrameClock = false;

    public static final MonotonicFrameClock getDefaultMonotonicFrameClock() {
        return (MonotonicFrameClock) DefaultMonotonicFrameClock$delegate.getValue();
    }

    @InterfaceC8721a
    public static /* synthetic */ void getDefaultMonotonicFrameClock$annotations() {
    }
}

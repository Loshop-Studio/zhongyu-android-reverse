package androidx.camera.lifecycle;

import android.content.Context;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.concurrent.futures.ListenableFutureKt;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class ProcessCameraProviderExtKt {
    public static final Object awaitInstance(ProcessCameraProvider.Companion companion, Context context, InterfaceC11588c<? super ProcessCameraProvider> interfaceC11588c) {
        return ListenableFutureKt.await(companion.getInstance(context), interfaceC11588c);
    }
}

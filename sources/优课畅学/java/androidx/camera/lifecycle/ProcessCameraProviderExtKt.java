package androidx.camera.lifecycle;

import android.content.Context;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.concurrent.futures.ListenableFutureKt;
import p179m7.InterfaceC9324c;

/* loaded from: classes.dex */
public final class ProcessCameraProviderExtKt {
    public static final Object awaitInstance(ProcessCameraProvider.Companion companion, Context context, InterfaceC9324c<? super ProcessCameraProvider> interfaceC9324c) {
        return ListenableFutureKt.await(companion.getInstance(context), interfaceC9324c);
    }
}

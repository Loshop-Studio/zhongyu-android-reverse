package p038d;

import android.content.Context;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.impl.UseCaseConfigFactory;

/* renamed from: d.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C5397c implements UseCaseConfigFactory.Provider {
    @Override // androidx.camera.core.impl.UseCaseConfigFactory.Provider
    public final UseCaseConfigFactory newInstance(Context context) {
        return Camera2Config.lambda$defaultConfig$1(context);
    }
}

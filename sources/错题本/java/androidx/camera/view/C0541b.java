package androidx.camera.view;

import androidx.arch.core.util.Function;
import androidx.camera.lifecycle.ProcessCameraProvider;

/* renamed from: androidx.camera.view.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0541b implements Function {
    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        return new ProcessCameraProviderWrapperImpl((ProcessCameraProvider) obj);
    }
}

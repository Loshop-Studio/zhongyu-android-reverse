package androidx.camera.core;

import android.util.Size;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.resolutionselector.ResolutionFilter;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.List;

/* renamed from: androidx.camera.core.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C0325f implements CallbackToFutureAdapter.Resolver, ImageAnalysis.Analyzer, ResolutionFilter {

    /* renamed from: a */
    public final /* synthetic */ Object f400a;

    public /* synthetic */ C0325f(Object obj) {
        this.f400a = obj;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(ImageProxy imageProxy) {
        ((ImageAnalysis.Analyzer) this.f400a).analyze(imageProxy);
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((CameraX) this.f400a).lambda$shutdownInternal$4(completer);
    }

    @Override // androidx.camera.core.resolutionselector.ResolutionFilter
    public List filter(List list, int i) {
        return ImageAnalysis.lambda$onMergeConfig$0((Size) this.f400a, list, i);
    }
}

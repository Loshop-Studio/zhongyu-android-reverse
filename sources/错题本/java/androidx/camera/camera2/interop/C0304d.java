package androidx.camera.camera2.interop;

import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.CameraX;
import androidx.camera.core.impl.Config;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.TextRangeLayoutMeasureResult;
import androidx.compose.foundation.text.TextRangeLayoutMeasureScope;
import androidx.compose.foundation.text.TextRangeScopeMeasurePolicy;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.interop.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C0304d implements Config.OptionMatcher, CallbackToFutureAdapter.Resolver, TextRangeScopeMeasurePolicy {

    /* renamed from: a */
    public final /* synthetic */ Object f380a;

    /* renamed from: b */
    public final /* synthetic */ Object f381b;

    public /* synthetic */ C0304d(Object obj, Object obj2) {
        this.f380a = obj;
        this.f381b = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ProcessCameraProvider.getOrCreateCameraXInstance$lambda$18$lambda$17((ProcessCameraProvider) this.f380a, (CameraX) this.f381b, completer);
    }

    @Override // androidx.compose.foundation.text.TextRangeScopeMeasurePolicy
    public TextRangeLayoutMeasureResult measure(TextRangeLayoutMeasureScope textRangeLayoutMeasureScope) {
        return TextLinkScope.textRange$lambda$0((TextLinkScope) this.f380a, (AnnotatedString.Range) this.f381b, textRangeLayoutMeasureScope);
    }

    @Override // androidx.camera.core.impl.Config.OptionMatcher
    public boolean onOptionMatched(Config.Option option) {
        return CaptureRequestOptions.Builder.lambda$from$0((CaptureRequestOptions.Builder) this.f380a, (Config) this.f381b, option);
    }
}

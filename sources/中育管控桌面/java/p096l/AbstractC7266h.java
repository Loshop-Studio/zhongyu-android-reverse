package p096l;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import coil3.compose.AsyncImagePreviewHandler;
import kotlin.jvm.functions.Function0;

/* renamed from: l.h */
/* loaded from: classes3.dex */
public abstract class AbstractC7266h {

    /* renamed from: a */
    public static final ProvidableCompositionLocal f9169a = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: l.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC7266h.m8188b();
        }
    });

    /* renamed from: b */
    public static final AsyncImagePreviewHandler m8188b() {
        return AsyncImagePreviewHandler.f1547b;
    }

    /* renamed from: c */
    public static final ProvidableCompositionLocal m8189c() {
        return f9169a;
    }
}

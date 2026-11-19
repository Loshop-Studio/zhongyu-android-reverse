package p150l;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import coil3.compose.AsyncImagePreviewHandler;
import kotlin.jvm.functions.Function0;

/* renamed from: l.i */
/* loaded from: classes3.dex */
public abstract class AbstractC8481i {

    /* renamed from: a */
    public static final ProvidableCompositionLocal f14010a = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: l.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC8481i.m13864b();
        }
    });

    /* renamed from: b */
    public static final AsyncImagePreviewHandler m13864b() {
        return AsyncImagePreviewHandler.f2863b;
    }

    /* renamed from: c */
    public static final ProvidableCompositionLocal m13865c() {
        return f14010a;
    }
}

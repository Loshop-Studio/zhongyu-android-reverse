package p163l;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import coil3.compose.AsyncImagePreviewHandler;
import kotlin.jvm.functions.Function0;

/* renamed from: l.i */
/* loaded from: classes3.dex */
public abstract class AbstractC8863i {

    /* renamed from: a */
    public static final ProvidableCompositionLocal f14635a = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: l.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC8863i.m13719b();
        }
    });

    /* renamed from: b */
    public static final AsyncImagePreviewHandler m13719b() {
        return AsyncImagePreviewHandler.f2796b;
    }

    /* renamed from: c */
    public static final ProvidableCompositionLocal m13720c() {
        return f14635a;
    }
}

package androidx.compose.material3;

import androidx.compose.p014ui.graphics.Color;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class ContentColorKt {
    private static final ProvidableCompositionLocal<Color> LocalContentColor = CompositionLocalKt.compositionLocalOf$default(null, new InterfaceC9529a() { // from class: androidx.compose.material3.ContentColorKt$LocalContentColor$1
        @Override // p181hd.InterfaceC9529a
        public /* bridge */ /* synthetic */ Object invoke() {
            return Color.m30868boximpl(m28574invoke0d7_KjU());
        }

        /* renamed from: invoke-0d7_KjU, reason: not valid java name */
        public final long m28574invoke0d7_KjU() {
            return Color.Companion.m30904getBlack0d7_KjU();
        }
    }, 1, null);

    public static final ProvidableCompositionLocal<Color> getLocalContentColor() {
        return LocalContentColor;
    }
}

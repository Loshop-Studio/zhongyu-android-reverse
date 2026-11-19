package androidx.compose.material3;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontStyle;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.text.style.TextAlign;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class ComposableSingletons$DateRangePickerKt {
    public static final ComposableSingletons$DateRangePickerKt INSTANCE = new ComposableSingletons$DateRangePickerKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static InterfaceC9544p f28473lambda1 = ComposableLambdaKt.composableLambdaInstance(766806659, false, new InterfaceC9544p() { // from class: androidx.compose.material3.ComposableSingletons$DateRangePickerKt$lambda-1$1
        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return C10786q.f26013a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(766806659, i10, -1, "androidx.compose.material3.ComposableSingletons$DateRangePickerKt.lambda-1.<anonymous> (DateRangePicker.kt:379)");
            }
            TextKt.m29301Text4IGK_g("-", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC9540l) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final InterfaceC9544p m28547getLambda1$material3_release() {
        return f28473lambda1;
    }
}

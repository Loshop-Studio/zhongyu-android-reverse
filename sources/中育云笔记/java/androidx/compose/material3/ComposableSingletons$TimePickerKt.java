package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
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
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class ComposableSingletons$TimePickerKt {
    public static final ComposableSingletons$TimePickerKt INSTANCE = new ComposableSingletons$TimePickerKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static InterfaceC9545q f28498lambda1 = ComposableLambdaKt.composableLambdaInstance(1425358052, false, new InterfaceC9545q() { // from class: androidx.compose.material3.ComposableSingletons$TimePickerKt$lambda-1$1
        @Override // p181hd.InterfaceC9545q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return C10786q.f26013a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(RowScope rowScope, Composer composer, int i10) {
            if ((i10 & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1425358052, i10, -1, "androidx.compose.material3.ComposableSingletons$TimePickerKt.lambda-1.<anonymous> (TimePicker.kt:1277)");
            }
            Strings.Companion companion = Strings.Companion;
            TextKt.m29301Text4IGK_g(Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2296R.string.m3c_time_picker_am), composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC9540l) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static InterfaceC9545q f28499lambda2 = ComposableLambdaKt.composableLambdaInstance(-1179219109, false, new InterfaceC9545q() { // from class: androidx.compose.material3.ComposableSingletons$TimePickerKt$lambda-2$1
        @Override // p181hd.InterfaceC9545q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return C10786q.f26013a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(RowScope rowScope, Composer composer, int i10) {
            if ((i10 & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1179219109, i10, -1, "androidx.compose.material3.ComposableSingletons$TimePickerKt.lambda-2.<anonymous> (TimePicker.kt:1291)");
            }
            Strings.Companion companion = Strings.Companion;
            TextKt.m29301Text4IGK_g(Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2296R.string.m3c_time_picker_pm), composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC9540l) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final InterfaceC9545q m28572getLambda1$material3_release() {
        return f28498lambda1;
    }

    /* renamed from: getLambda-2$material3_release, reason: not valid java name */
    public final InterfaceC9545q m28573getLambda2$material3_release() {
        return f28499lambda2;
    }
}

package androidx.compose.p014ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9544p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ComposeView extends AbstractComposeView {
    public static final int $stable = 8;
    private final MutableState<InterfaceC9544p> content;
    private boolean shouldCreateCompositionOnAttachedToWindow;

    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // androidx.compose.p014ui.platform.AbstractComposeView
    @Composable
    public void Content(Composer composer, int i10) {
        composer.startReplaceGroup(420213850);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(420213850, i10, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:429)");
        }
        InterfaceC9544p value = this.content.getValue();
        if (value == null) {
            composer.startReplaceGroup(358356153);
        } else {
            composer.startReplaceGroup(150107208);
            value.invoke(composer, 0);
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return ComposeView.class.getName();
    }

    @Override // androidx.compose.p014ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public final void setContent(InterfaceC9544p interfaceC9544p) {
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.content.setValue(interfaceC9544p);
        if (isAttachedToWindow()) {
            createComposition();
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.content = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }
}

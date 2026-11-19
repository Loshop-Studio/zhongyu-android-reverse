package androidx.compose.foundation.contextmenu;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u0003Jn\u0010\u001b\u001a\u00020\u00062\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122*\b\u0002\u0010\u0019\u001a$\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014¢\u0006\u0002\b\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u001b\u0010\u001cR:\u0010\u001e\u001a(\u0012$\u0012\"\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0014¢\u0006\u0002\b\u000e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m5110d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "", "<init>", "()V", "Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "colors", "Ld6/s;", "Content$foundation_release", "(Landroidx/compose/foundation/contextmenu/ContextMenuColors;Landroidx/compose/runtime/Composer;I)V", "Content", "clear$foundation_release", "clear", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "label", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Color;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "iconColor", "leadingIcon", "onClick", "item", "(Lr6/e;Landroidx/compose/ui/Modifier;ZLr6/f;Lr6/a;)V", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "composables", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nContextMenuUi.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,426:1\n34#2,6:427\n*S KotlinDebug\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuScope\n*L\n242#1:427,6\n*E\n"})
/* loaded from: classes.dex */
public final class ContextMenuScope {
    public static final int $stable = 0;

    @NotNull
    private final SnapshotStateList<InterfaceC6474f> composables = SnapshotStateKt.mutableStateListOf();

    public static /* synthetic */ void item$default(ContextMenuScope contextMenuScope, InterfaceC6473e interfaceC6473e, Modifier modifier, boolean z8, InterfaceC6474f interfaceC6474f, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Modifier modifier2 = modifier;
        if ((i & 4) != 0) {
            z8 = true;
        }
        boolean z9 = z8;
        if ((i & 8) != 0) {
            interfaceC6474f = null;
        }
        contextMenuScope.item(interfaceC6473e, modifier2, z9, interfaceC6474f, interfaceC6469a);
    }

    @Composable
    public final void Content$foundation_release(@NotNull final ContextMenuColors contextMenuColors, @Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1320309496);
        int i8 = (i & 6) == 0 ? (composerStartRestartGroup.changed(contextMenuColors) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1320309496, i8, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.android.kt:240)");
            }
            SnapshotStateList<InterfaceC6474f> snapshotStateList = this.composables;
            int size = snapshotStateList.size();
            for (int i9 = 0; i9 < size; i9++) {
                snapshotStateList.get(i9).invoke(contextMenuColors, composerStartRestartGroup, Integer.valueOf(i8 & 14));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.foundation.contextmenu.ContextMenuScope$Content$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(Composer composer2, int i10) {
                    this.$tmp0_rcvr.Content$foundation_release(contextMenuColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public final void clear$foundation_release() {
        this.composables.clear();
    }

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void item(@NotNull final InterfaceC6473e label, @NotNull final Modifier modifier, final boolean enabled, @Nullable final InterfaceC6474f leadingIcon, @NotNull final InterfaceC6469a onClick) {
        this.composables.add(ComposableLambdaKt.composableLambdaInstance(262103052, true, new InterfaceC6474f() { // from class: androidx.compose.foundation.contextmenu.ContextMenuScope.item.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((ContextMenuColors) obj, (Composer) obj2, ((Number) obj3).intValue());
                return C5443s.f8405a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(ContextMenuColors contextMenuColors, Composer composer, int i) {
                if ((i & 6) == 0) {
                    i |= composer.changed(contextMenuColors) ? 4 : 2;
                }
                if (!composer.shouldExecute((i & 19) != 18, i & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(262103052, i, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.item.<anonymous> (ContextMenuUi.android.kt:282)");
                }
                String str = (String) label.invoke(composer, 0);
                if (AbstractC5855p.m5382P(str)) {
                    InlineClassHelperKt.throwIllegalStateException("Label must not be blank");
                }
                ContextMenuUi_androidKt.ContextMenuItem(str, enabled, contextMenuColors, modifier, leadingIcon, onClick, composer, (i << 6) & 896, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }
}

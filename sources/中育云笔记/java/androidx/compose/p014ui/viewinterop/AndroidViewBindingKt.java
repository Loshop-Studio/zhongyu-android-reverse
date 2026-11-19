package androidx.compose.p014ui.viewinterop;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.viewbinding.C3189R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class AndroidViewBindingKt {
    @Composable
    public static final <T extends ViewBinding> void AndroidViewBinding(final InterfaceC9545q interfaceC9545q, Modifier modifier, InterfaceC9540l interfaceC9540l, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        final InterfaceC9540l interfaceC9540l2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1985291610);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(interfaceC9545q) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9540l) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.Companion;
            }
            Modifier modifier3 = modifier;
            InterfaceC9540l interfaceC9540l3 = i14 != 0 ? new InterfaceC9540l() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding.1
                /* JADX WARN: Incorrect types in method signature: (TT;)V */
                public final void invoke(ViewBinding viewBinding) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ViewBinding) obj);
                    return C10786q.f26013a;
                }
            } : interfaceC9540l;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1985291610, i12, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:77)");
            }
            AndroidViewBinding(interfaceC9545q, modifier3, null, null, interfaceC9540l3, composerStartRestartGroup, (i12 & 14) | 384 | (i12 & 112) | (57344 & (i12 << 6)), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            interfaceC9540l2 = interfaceC9540l3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            interfaceC9540l2 = interfaceC9540l;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i15) {
                    AndroidViewBindingKt.AndroidViewBinding(interfaceC9545q, modifier2, interfaceC9540l2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void forEachFragmentContainerView(ViewGroup viewGroup, InterfaceC9540l interfaceC9540l) {
        if (viewGroup instanceof FragmentContainerView) {
            interfaceC9540l.invoke(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof ViewGroup) {
                forEachFragmentContainerView((ViewGroup) childAt, interfaceC9540l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends ViewBinding> T getBinding(View view) {
        Object tag = view.getTag(C3189R.id.binding_reference);
        AbstractC9979u.m20292e(tag, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding");
        return (T) tag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends ViewBinding> void setBinding(View view, T t10) {
        view.setTag(C3189R.id.binding_reference, t10);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends androidx.viewbinding.ViewBinding> void AndroidViewBinding(final p181hd.InterfaceC9545q r19, androidx.compose.p014ui.Modifier r20, p181hd.InterfaceC9540l r21, p181hd.InterfaceC9540l r22, p181hd.InterfaceC9540l r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding(hd.q, androidx.compose.ui.Modifier, hd.l, hd.l, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }
}

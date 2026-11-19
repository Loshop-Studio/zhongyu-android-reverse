package androidx.compose.p013ui.viewinterop;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.viewbinding.C3159R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes2.dex */
public final class AndroidViewBindingKt {
    @Composable
    public static final <T extends ViewBinding> void AndroidViewBinding(final InterfaceC10575q interfaceC10575q, Modifier modifier, InterfaceC10570l interfaceC10570l, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        final InterfaceC10570l interfaceC10570l2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1985291610);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(interfaceC10575q) ? 4 : 2) | i10;
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
            i12 |= composerStartRestartGroup.changedInstance(interfaceC10570l) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.Companion;
            }
            Modifier modifier3 = modifier;
            InterfaceC10570l interfaceC10570l3 = i14 != 0 ? new InterfaceC10570l() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding.1
                /* JADX WARN: Incorrect types in method signature: (TT;)V */
                public final void invoke(ViewBinding viewBinding) {
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ViewBinding) obj);
                    return C8736p.f16368a;
                }
            } : interfaceC10570l;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1985291610, i12, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:77)");
            }
            AndroidViewBinding(interfaceC10575q, modifier3, null, null, interfaceC10570l3, composerStartRestartGroup, (i12 & 14) | 384 | (i12 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) | (57344 & (i12 << 6)), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            interfaceC10570l2 = interfaceC10570l3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            interfaceC10570l2 = interfaceC10570l;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C8736p.f16368a;
                }

                public final void invoke(Composer composer2, int i15) {
                    AndroidViewBindingKt.AndroidViewBinding(interfaceC10575q, modifier2, interfaceC10570l2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void forEachFragmentContainerView(ViewGroup viewGroup, InterfaceC10570l interfaceC10570l) {
        if (viewGroup instanceof FragmentContainerView) {
            interfaceC10570l.invoke(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof ViewGroup) {
                forEachFragmentContainerView((ViewGroup) childAt, interfaceC10570l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends ViewBinding> T getBinding(View view) {
        Object tag = view.getTag(C3159R.id.binding_reference);
        AbstractC9133u.m16131e(tag, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding");
        return (T) tag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends ViewBinding> void setBinding(View view, T t10) {
        view.setTag(C3159R.id.binding_reference, t10);
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
    public static final <T extends androidx.viewbinding.ViewBinding> void AndroidViewBinding(final p300x7.InterfaceC10575q r19, androidx.compose.p013ui.Modifier r20, p300x7.InterfaceC10570l r21, p300x7.InterfaceC10570l r22, p300x7.InterfaceC10570l r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding(x7.q, androidx.compose.ui.Modifier, x7.l, x7.l, x7.l, androidx.compose.runtime.Composer, int, int):void");
    }
}

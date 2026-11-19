package androidx.compose.p013ui.viewinterop;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.autofill.HintConstants;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.viewbinding.C3130R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÁ\u0001\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032K\u0010\u0004\u001aG\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u001b\b\u0002\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011¢\u0006\u0002\b\u00122\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u00122\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0015\u001a\u0089\u0001\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032K\u0010\u0004\u001aG\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0016\u001a$\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\n2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0011H\u0002\u001a\u001b\u0010\u001b\u001a\u0002H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u001cH\u0002¢\u0006\u0002\u0010\u001d\u001a#\u0010\u001e\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u001c2\u0006\u0010\u001f\u001a\u0002H\u0002H\u0002¢\u0006\u0002\u0010 ¨\u0006!"}, m13558d2 = {"AndroidViewBinding", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/viewbinding/ViewBinding;", "factory", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "inflater", "Landroid/view/ViewGroup;", "parent", "", "attachToParent", "modifier", "Landroidx/compose/ui/Modifier;", "onReset", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "onRelease", "update", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "forEachFragmentContainerView", "viewGroup", "action", "Landroidx/fragment/app/FragmentContainerView;", "getBinding", "Landroid/view/View;", "(Landroid/view/View;)Landroidx/viewbinding/ViewBinding;", "setBinding", "binding", "(Landroid/view/View;Landroidx/viewbinding/ViewBinding;)V", "ui-viewbinding_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nAndroidViewBinding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewBinding.kt\nandroidx/compose/ui/viewinterop/AndroidViewBindingKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,218:1\n75#2:219\n75#2:226\n1247#3,6:220\n1247#3,6:227\n1247#3,6:234\n1247#3,6:240\n1247#3,6:246\n1#4:233\n55#5,4:252\n*S KotlinDebug\n*F\n+ 1 AndroidViewBinding.kt\nandroidx/compose/ui/viewinterop/AndroidViewBindingKt\n*L\n150#1:219\n164#1:226\n155#1:220,6\n166#1:227,6\n174#1:234,6\n175#1:240,6\n195#1:246,6\n211#1:252,4\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidViewBindingKt {
    @Composable
    public static final <T extends ViewBinding> void AndroidViewBinding(final Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> function3, Modifier modifier, Function1<? super T, Unit> function1, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        final Function1<? super T, Unit> function12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1985291610);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i10;
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
            i12 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            Function1<? super T, Unit> function13 = i14 != 0 ? new Function1<T, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding.1
                /* JADX WARN: Incorrect types in method signature: (TT;)V */
                public final void invoke(ViewBinding viewBinding) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke((ViewBinding) obj);
                    return Unit.INSTANCE;
                }
            } : function1;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1985291610, i12, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:77)");
            }
            AndroidViewBinding(function3, modifier3, null, null, function13, composerStartRestartGroup, (i12 & 14) | 384 | (i12 & 112) | (57344 & (i12 << 6)), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            function12 = function13;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            function12 = function1;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i15) {
                    AndroidViewBindingKt.AndroidViewBinding(function3, modifier2, function12, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void forEachFragmentContainerView(ViewGroup viewGroup, Function1<? super FragmentContainerView, Unit> function1) {
        if (viewGroup instanceof FragmentContainerView) {
            function1.invoke(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof ViewGroup) {
                forEachFragmentContainerView((ViewGroup) childAt, function1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends ViewBinding> T getBinding(View view) {
        Object tag = view.getTag(C3130R.id.binding_reference);
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding");
        return (T) tag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends ViewBinding> void setBinding(View view, T t10) {
        view.setTag(C3130R.id.binding_reference, t10);
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
    public static final <T extends androidx.viewbinding.ViewBinding> void AndroidViewBinding(final kotlin.jvm.functions.Function3<? super android.view.LayoutInflater, ? super android.view.ViewGroup, ? super java.lang.Boolean, ? extends T> r19, androidx.compose.p013ui.Modifier r20, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r21, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r22, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }
}

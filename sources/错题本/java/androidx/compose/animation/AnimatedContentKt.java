package androidx.compose.animation;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.p011ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000x\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a¶\u0001\u0010\u0016\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001f\b\u0002\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2%\b\u0002\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000421\u0010\u0015\u001a-\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aW\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u0019\u001a\u00020\u00182>\b\u0002\u0010\u001e\u001a8\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001d0\u0011¢\u0006\u0004\b \u0010!\u001a\u001c\u0010%\u001a\u00020\u0006*\u00020\"2\u0006\u0010$\u001a\u00020#H\u0086\u0004¢\u0006\u0004\b%\u0010&\u001a\u001c\u0010'\u001a\u00020\u0006*\u00020\"2\u0006\u0010$\u001a\u00020#H\u0087\u0004¢\u0006\u0004\b'\u0010&\u001a®\u0001\u0010\u0016\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000(2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001f\b\u0002\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072\b\b\u0002\u0010\n\u001a\u00020\t2%\b\u0002\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000421\u0010\u0015\u001a-\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\u0016\u0010)\"\u0014\u0010*\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, m5110d2 = {ExifInterface.LATITUDE_SOUTH, "targetState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "transitionSpec", "Landroidx/compose/ui/Alignment;", "contentAlignment", "", "label", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "", "contentKey", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "content", "AnimatedContent", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lr6/c;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lr6/c;Lr6/g;Landroidx/compose/runtime/Composer;II)V", "", "clip", "Landroidx/compose/ui/unit/IntSize;", "initialSize", "targetSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "sizeAnimationSpec", "Landroidx/compose/animation/SizeTransform;", "SizeTransform", "(ZLr6/e;)Landroidx/compose/animation/SizeTransform;", "Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/ExitTransition;", "exit", "togetherWith", "(Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;)Landroidx/compose/animation/ContentTransform;", "with", "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lr6/c;Landroidx/compose/ui/Alignment;Lr6/c;Lr6/g;Landroidx/compose/runtime/Composer;II)V", "UnspecifiedSize", "J", "animation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 10 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,958:1\n75#2:959\n1247#3,6:960\n1247#3,6:966\n1247#3,6:972\n1247#3,6:991\n1247#3,6:997\n350#4,7:978\n34#5,6:985\n34#5,6:1030\n79#6,6:1003\n86#6,3:1018\n89#6,2:1027\n93#6:1038\n347#7,9:1009\n356#7:1029\n357#7,2:1036\n4206#8,6:1021\n30#9:1039\n80#10:1040\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n*L\n774#1:959\n776#1:960,6\n780#1:966,6\n781#1:972,6\n867#1:991,6\n874#1:997,6\n807#1:978,7\n816#1:985,6\n872#1:1030,6\n869#1:1003,6\n869#1:1018,3\n869#1:1027,2\n869#1:1038\n869#1:1009,9\n869#1:1029\n869#1:1036,2\n869#1:1021,6\n702#1:1039\n702#1:1040\n*E\n"})
/* loaded from: classes.dex */
public final class AnimatedContentKt {
    private static final long UnspecifiedSize;

    static {
        long j7 = Integer.MIN_VALUE;
        UnspecifiedSize = IntSize.m13471constructorimpl((j7 & 4294967295L) | (j7 << 32));
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S> void AnimatedContent(final S r19, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r20, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r21, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Alignment r22, @org.jetbrains.annotations.Nullable java.lang.String r23, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r24, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6475g r25, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(java.lang.Object, androidx.compose.ui.Modifier, r6.c, androidx.compose.ui.Alignment, java.lang.String, r6.c, r6.g, androidx.compose.runtime.Composer, int, int):void");
    }

    @NotNull
    public static final SizeTransform SizeTransform(boolean z8, @NotNull InterfaceC6473e interfaceC6473e) {
        return new SizeTransformImpl(z8, interfaceC6473e);
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean z8, InterfaceC6473e interfaceC6473e, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = true;
        }
        if ((i & 2) != 0) {
            interfaceC6473e = new InterfaceC6473e() { // from class: androidx.compose.animation.AnimatedContentKt.SizeTransform.1
                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return m6544invokeTemP2vQ(((IntSize) obj2).m13480unboximpl(), ((IntSize) obj3).m13480unboximpl());
                }

                /* renamed from: invoke-TemP2vQ, reason: not valid java name */
                public final SpringSpec<IntSize> m6544invokeTemP2vQ(long j7, long j8) {
                    return AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m13468boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
                }
            };
        }
        return SizeTransform(z8, interfaceC6473e);
    }

    @NotNull
    public static final ContentTransform togetherWith(@NotNull EnterTransition enterTransition, @NotNull ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    @Deprecated(message = "Infix fun EnterTransition.with(ExitTransition) has been renamed to togetherWith", replaceWith = @ReplaceWith(expression = "togetherWith(exit)", imports = {}))
    @ExperimentalAnimationApi
    @NotNull
    public static final ContentTransform with(@NotNull EnterTransition enterTransition, @NotNull ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c3  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S> void AnimatedContent(@org.jetbrains.annotations.NotNull final androidx.compose.animation.core.Transition<S> r17, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r18, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r19, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Alignment r20, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r21, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6475g r22, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(androidx.compose.animation.core.Transition, androidx.compose.ui.Modifier, r6.c, androidx.compose.ui.Alignment, r6.c, r6.g, androidx.compose.runtime.Composer, int, int):void");
    }
}

package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.p014ui.unit.IntSize;
import p181hd.InterfaceC9544p;
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
public final class AnimatedContentKt {
    private static final long UnspecifiedSize;

    static {
        long j10 = Integer.MIN_VALUE;
        UnspecifiedSize = IntSize.m33667constructorimpl((j10 & 4294967295L) | (j10 << 32));
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
    public static final <S> void AnimatedContent(final S r19, androidx.compose.p014ui.Modifier r20, p181hd.InterfaceC9540l r21, androidx.compose.p014ui.Alignment r22, java.lang.String r23, p181hd.InterfaceC9540l r24, final p181hd.InterfaceC9546r r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(java.lang.Object, androidx.compose.ui.Modifier, hd.l, androidx.compose.ui.Alignment, java.lang.String, hd.l, hd.r, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final SizeTransform SizeTransform(boolean z10, InterfaceC9544p interfaceC9544p) {
        return new SizeTransformImpl(z10, interfaceC9544p);
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean z10, InterfaceC9544p interfaceC9544p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            interfaceC9544p = new InterfaceC9544p() { // from class: androidx.compose.animation.AnimatedContentKt.SizeTransform.1
                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return m26740invokeTemP2vQ(((IntSize) obj2).m33676unboximpl(), ((IntSize) obj3).m33676unboximpl());
                }

                /* renamed from: invoke-TemP2vQ, reason: not valid java name */
                public final SpringSpec<IntSize> m26740invokeTemP2vQ(long j10, long j11) {
                    return AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m33664boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
                }
            };
        }
        return SizeTransform(z10, interfaceC9544p);
    }

    public static final ContentTransform togetherWith(EnterTransition enterTransition, ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    @InterfaceC10770a
    @ExperimentalAnimationApi
    public static final ContentTransform with(EnterTransition enterTransition, ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0375  */
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
    public static final <S> void AnimatedContent(final androidx.compose.animation.core.Transition<S> r17, androidx.compose.p014ui.Modifier r18, p181hd.InterfaceC9540l r19, androidx.compose.p014ui.Alignment r20, p181hd.InterfaceC9540l r21, final p181hd.InterfaceC9546r r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(androidx.compose.animation.core.Transition, androidx.compose.ui.Modifier, hd.l, androidx.compose.ui.Alignment, hd.l, hd.r, androidx.compose.runtime.Composer, int, int):void");
    }
}

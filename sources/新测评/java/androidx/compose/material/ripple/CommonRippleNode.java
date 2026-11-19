package androidx.compose.material.ripple;

import androidx.collection.MutableScatterMap;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorProducer;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ*\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0013H\u0016J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\f\u0010\u001d\u001a\u00020\u0013*\u00020\u001eH\u0016R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, m13558d2 = {"Landroidx/compose/material/ripple/CommonRippleNode;", "Landroidx/compose/material/ripple/RippleNode;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/ColorProducer;", "rippleAlpha", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "ripples", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "Landroidx/compose/material/ripple/RippleAnimation;", "addRipple", "", "interaction", "size", "Landroidx/compose/ui/geometry/Size;", "targetRadius", "", "addRipple-12SF9DM", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;JF)V", "onDetach", "removeRipple", "drawRipples", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "material-ripple_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nCommonRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleNode\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n357#2,4:174\n329#2,6:178\n339#2,3:185\n342#2,9:189\n361#2:198\n357#2,4:199\n329#2,6:203\n339#2,3:210\n342#2,2:214\n345#2,6:217\n361#2:223\n1399#3:184\n1270#3:188\n1399#3:209\n1270#3:213\n1#4:216\n*S KotlinDebug\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleNode\n*L\n75#1:174,4\n75#1:178,6\n75#1:185,3\n75#1:189,9\n75#1:198\n98#1:199,4\n98#1:203,6\n98#1:210,3\n98#1:214,2\n98#1:217,6\n98#1:223\n75#1:184\n75#1:188\n98#1:209\n98#1:213\n*E\n"})
/* loaded from: classes2.dex */
public final class CommonRippleNode extends RippleNode {
    public static final int $stable = 8;
    private final MutableScatterMap<PressInteraction.Press, RippleAnimation> ripples;

    public /* synthetic */ CommonRippleNode(InteractionSource interactionSource, boolean z9, float f10, ColorProducer colorProducer, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(interactionSource, z9, f10, colorProducer, function0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    @Override // androidx.compose.material.ripple.RippleNode
    /* renamed from: addRipple-12SF9DM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo18472addRipple12SF9DM(androidx.compose.foundation.interaction.PressInteraction.Press r18, long r19, float r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            androidx.collection.MutableScatterMap<androidx.compose.foundation.interaction.PressInteraction$Press, androidx.compose.material.ripple.RippleAnimation> r2 = r0.ripples
            java.lang.Object[] r3 = r2.keys
            java.lang.Object[] r4 = r2.values
            long[] r2 = r2.metadata
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L51
            r6 = 0
            r7 = r6
        L13:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2d:
            if (r12 >= r10) goto L4a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L46
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            androidx.compose.material.ripple.RippleAnimation r13 = (androidx.compose.material.ripple.RippleAnimation) r13
            androidx.compose.foundation.interaction.PressInteraction$Press r14 = (androidx.compose.foundation.interaction.PressInteraction.Press) r14
            r13.finish()
        L46:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2d
        L4a:
            if (r10 != r11) goto L51
        L4c:
            if (r7 == r5) goto L51
            int r7 = r7 + 1
            goto L13
        L51:
            boolean r2 = r0.getBounded()
            r3 = 0
            if (r2 == 0) goto L61
            long r4 = r1.getPressPosition()
            androidx.compose.ui.geometry.Offset r2 = androidx.compose.p013ui.geometry.Offset.m20724boximpl(r4)
            goto L62
        L61:
            r2 = r3
        L62:
            androidx.compose.material.ripple.RippleAnimation r4 = new androidx.compose.material.ripple.RippleAnimation
            boolean r5 = r0.getBounded()
            r6 = r21
            r4.<init>(r2, r6, r5, r3)
            androidx.collection.MutableScatterMap<androidx.compose.foundation.interaction.PressInteraction$Press, androidx.compose.material.ripple.RippleAnimation> r2 = r0.ripples
            r2.set(r1, r4)
            kotlinx.coroutines.CoroutineScope r5 = r0.getCoroutineScope()
            androidx.compose.material.ripple.CommonRippleNode$addRipple$2 r8 = new androidx.compose.material.ripple.CommonRippleNode$addRipple$2
            r8.<init>(r4, r0, r1, r3)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r5, r6, r7, r8, r9, r10)
            androidx.compose.p013ui.node.DrawModifierNodeKt.invalidateDraw(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.CommonRippleNode.mo18472addRipple12SF9DM(androidx.compose.foundation.interaction.PressInteraction$Press, long, float):void");
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void drawRipples(DrawScope drawScope) {
        float f10;
        int i10;
        int i11;
        int i12;
        float f11;
        float pressedAlpha = getRippleAlpha().invoke().getPressedAlpha();
        if (pressedAlpha == 0.0f) {
            return;
        }
        MutableScatterMap<PressInteraction.Press, RippleAnimation> mutableScatterMap = this.ripples;
        Object[] objArr = mutableScatterMap.keys;
        Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j10 = jArr[i13];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i13 - length)) >>> 31);
                long j11 = j10;
                int i16 = 0;
                while (i16 < i15) {
                    if ((j11 & 255) < 128) {
                        int i17 = (i13 << 3) + i16;
                        i10 = i16;
                        i11 = i15;
                        i12 = i14;
                        f11 = pressedAlpha;
                        ((RippleAnimation) objArr2[i17]).m18476draw4WTKRHQ(drawScope, Color.m20975copywmQWz5c$default(m18484getRippleColor0d7_KjU(), pressedAlpha, 0.0f, 0.0f, 0.0f, 14, null));
                    } else {
                        i10 = i16;
                        i11 = i15;
                        i12 = i14;
                        f11 = pressedAlpha;
                    }
                    j11 >>= i12;
                    i16 = i10 + 1;
                    pressedAlpha = f11;
                    i15 = i11;
                    i14 = i12;
                }
                int i18 = i15;
                f10 = pressedAlpha;
                if (i18 != i14) {
                    return;
                }
            } else {
                f10 = pressedAlpha;
            }
            if (i13 == length) {
                return;
            }
            i13++;
            pressedAlpha = f10;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.ripples.clear();
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void removeRipple(PressInteraction.Press interaction) {
        RippleAnimation rippleAnimation = this.ripples.get(interaction);
        if (rippleAnimation != null) {
            rippleAnimation.finish();
        }
    }

    private CommonRippleNode(InteractionSource interactionSource, boolean z9, float f10, ColorProducer colorProducer, Function0<RippleAlpha> function0) {
        super(interactionSource, z9, f10, colorProducer, function0, null);
        this.ripples = new MutableScatterMap<>(0, 1, null);
    }
}

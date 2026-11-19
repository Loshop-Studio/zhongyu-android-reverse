package androidx.compose.material.ripple;

import androidx.collection.MutableScatterMap;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorProducer;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class CommonRippleNode extends RippleNode {
    public static final int $stable = 8;
    private final MutableScatterMap<PressInteraction.Press, RippleAnimation> ripples;

    public /* synthetic */ CommonRippleNode(InteractionSource interactionSource, boolean z10, float f10, ColorProducer colorProducer, InterfaceC9529a interfaceC9529a, AbstractC9972n abstractC9972n) {
        this(interactionSource, z10, f10, colorProducer, interfaceC9529a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    @Override // androidx.compose.material.ripple.RippleNode
    /* renamed from: addRipple-12SF9DM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo28313addRipple12SF9DM(androidx.compose.foundation.interaction.PressInteraction.Press r18, long r19, float r21) {
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
            long r4 = r1.m27280getPressPositionF1C5BW0()
            androidx.compose.ui.geometry.Offset r2 = androidx.compose.p014ui.geometry.Offset.m30626boximpl(r4)
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
            sd.i0 r5 = r0.getCoroutineScope()
            androidx.compose.material.ripple.CommonRippleNode$addRipple$2 r8 = new androidx.compose.material.ripple.CommonRippleNode$addRipple$2
            r8.<init>(r4, r0, r1, r3)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            sd.AbstractC11109f.m24706d(r5, r6, r7, r8, r9, r10)
            androidx.compose.p014ui.node.DrawModifierNodeKt.invalidateDraw(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.CommonRippleNode.mo28313addRipple12SF9DM(androidx.compose.foundation.interaction.PressInteraction$Press, long, float):void");
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void drawRipples(DrawScope drawScope) {
        float f10;
        int i10;
        int i11;
        int i12;
        float f11;
        float pressedAlpha = ((RippleAlpha) getRippleAlpha().invoke()).getPressedAlpha();
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
                        ((RippleAnimation) objArr2[i17]).m28318draw4WTKRHQ(drawScope, Color.m30877copywmQWz5c$default(m28326getRippleColor0d7_KjU(), pressedAlpha, 0.0f, 0.0f, 0.0f, 14, null));
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
    public void removeRipple(PressInteraction.Press press) {
        RippleAnimation rippleAnimation = this.ripples.get(press);
        if (rippleAnimation != null) {
            rippleAnimation.finish();
        }
    }

    private CommonRippleNode(InteractionSource interactionSource, boolean z10, float f10, ColorProducer colorProducer, InterfaceC9529a interfaceC9529a) {
        super(interactionSource, z10, f10, colorProducer, interfaceC9529a, null);
        this.ripples = new MutableScatterMap<>(0, 1, null);
    }
}

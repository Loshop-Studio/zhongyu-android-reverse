package com.zykj.mistake.feature.notebook.list;

import androidx.compose.p011ui.geometry.CornerRadius;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.PathEffect;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.unit.C2331Dp;
import com.zykj.mistake.main.C5066p;
import java.util.Set;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.mistake.feature.notebook.list.h */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4948h implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f7557a;

    /* renamed from: b */
    public final /* synthetic */ long f7558b;

    public /* synthetic */ C4948h(long j7, int i) {
        this.f7557a = i;
        this.f7558b = j7;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        switch (this.f7557a) {
            case 0:
                DrawScope drawBehind = (DrawScope) obj;
                AbstractC5830k.m5330g(drawBehind, "$this$drawBehind");
                float fMo6903toPx0680j_4 = drawBehind.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(1));
                float f = fMo6903toPx0680j_4 / 2;
                long jM10433constructorimpl = Offset.m10433constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo11233getSizeNHjbRc() >> 32)) - fMo6903toPx0680j_4;
                long jM10501constructorimpl = Size.m10501constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo11233getSizeNHjbRc() & 4294967295L)) - fMo6903toPx0680j_4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
                float fMo6903toPx0680j_42 = drawBehind.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(3));
                long jM10395constructorimpl = CornerRadius.m10395constructorimpl((Float.floatToRawIntBits(drawBehind.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(r6))) & 4294967295L) | (Float.floatToRawIntBits(fMo6903toPx0680j_42) << 32));
                float f7 = 5;
                DrawScope.m11229drawRoundRectuAw5IA$default(drawBehind, this.f7558b, jM10433constructorimpl, jM10501constructorimpl, jM10395constructorimpl, new Stroke(fMo6903toPx0680j_4, 0.0f, 0, 0, PathEffect.Companion.dashPathEffect$default(PathEffect.INSTANCE, new float[]{drawBehind.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(f7)), drawBehind.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(f7))}, 0.0f, 2, null), 14, null), 0.0f, null, 0, 224, null);
                return C5443s.f8405a;
            default:
                C5066p draft = (C5066p) obj;
                AbstractC5830k.m5330g(draft, "draft");
                Set setM5220G0 = AbstractC5805t.m5220G0(draft.f7945g);
                long j7 = this.f7558b;
                if (!setM5220G0.add(Long.valueOf(j7))) {
                    setM5220G0.remove(Long.valueOf(j7));
                }
                return C5066p.m4379a(draft, null, null, 0, null, null, false, setM5220G0, null, null, null, false, null, 4031);
        }
    }
}

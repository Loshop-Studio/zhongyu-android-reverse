package com.zykj.mistake.feature.notebook.detail;

import androidx.compose.p011ui.geometry.CornerRadius;
import androidx.compose.p011ui.graphics.PathEffect;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.unit.C2331Dp;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.mistake.feature.notebook.detail.k4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4826k4 implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ float f7084a;

    public /* synthetic */ C4826k4(float f) {
        this.f7084a = f;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        DrawScope drawBehind = (DrawScope) obj;
        AbstractC5830k.m5330g(drawBehind, "$this$drawBehind");
        float fMo6903toPx0680j_4 = drawBehind.mo6903toPx0680j_4(this.f7084a);
        float f = 5;
        DrawScope.m11229drawRoundRectuAw5IA$default(drawBehind, AbstractC4862q4.f7272a, 0L, 0L, CornerRadius.m10395constructorimpl((Float.floatToRawIntBits(fMo6903toPx0680j_4) << 32) | (Float.floatToRawIntBits(fMo6903toPx0680j_4) & 4294967295L)), new Stroke(drawBehind.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(1)), 0.0f, 0, 0, PathEffect.Companion.dashPathEffect$default(PathEffect.INSTANCE, new float[]{drawBehind.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(f)), drawBehind.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(f))}, 0.0f, 2, null), 14, null), 0.0f, null, 0, 230, null);
        return C5443s.f8405a;
    }
}

package com.zykj.mistake.feature.notebook.list;

import androidx.compose.p011ui.geometry.CornerRadius;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.PathEffect;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.unit.C2331Dp;
import com.zykj.mistake.entity.resp.CreateOrUpdateCollectionResp;
import com.zykj.mistake.entity.resp.GetNextReviewQuestionResp;
import com.zykj.mistake.entity.resp.ReviewHomeResp;
import com.zykj.mistake.entity.resp.StartReviewSessionResp;
import com.zykj.mistake.entity.resp.SubmitReviewResultResp;
import com.zykj.mistake.main.C5019a;
import com.zykj.mistake.main.C5021a1;
import com.zykj.mistake.main.C5066p;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.AbstractC5995r;
import p045d6.C5443s;
import p075h6.InterfaceC5634f;
import p084i7.C5687c;
import p084i7.InterfaceC5686b;
import p118m7.AbstractC6191y0;
import p152r6.InterfaceC6471c;
import p204y1.AbstractC6768a;
import p207y6.InterfaceC6779c;

/* renamed from: com.zykj.mistake.feature.notebook.list.k1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4959k1 implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f7573a;

    public /* synthetic */ C4959k1(int i) {
        this.f7573a = i;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        int i = this.f7573a;
        C5443s c5443s = C5443s.f8405a;
        switch (i) {
            case 0:
                CreateOrUpdateCollectionResp createOrUpdateCollectionResp = (CreateOrUpdateCollectionResp) obj;
                break;
            case 1:
                GetNextReviewQuestionResp it = (GetNextReviewQuestionResp) obj;
                AbstractC5830k.m5330g(it, "it");
                break;
            case 2:
                StartReviewSessionResp it2 = (StartReviewSessionResp) obj;
                AbstractC5830k.m5330g(it2, "it");
                break;
            case 3:
                SubmitReviewResultResp it3 = (SubmitReviewResultResp) obj;
                AbstractC5830k.m5330g(it3, "it");
                break;
            case 4:
                ReviewHomeResp it4 = (ReviewHomeResp) obj;
                AbstractC5830k.m5330g(it4, "it");
                break;
            case 5:
                C5021a1 state = (C5021a1) obj;
                AbstractC5830k.m5330g(state, "state");
                C5019a c5019a = state.f7831d;
                break;
            case 6:
                C5021a1 state2 = (C5021a1) obj;
                AbstractC5830k.m5330g(state2, "state");
                C5019a c5019a2 = state2.f7831d;
                break;
            case 7:
                C5021a1 state3 = (C5021a1) obj;
                AbstractC5830k.m5330g(state3, "state");
                break;
            case 8:
                C5066p draft = (C5066p) obj;
                AbstractC5830k.m5330g(draft, "draft");
                break;
            case 9:
                GraphicsLayerScope graphicsLayer = (GraphicsLayerScope) obj;
                AbstractC5830k.m5330g(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.setAlpha(0.01f);
                graphicsLayer.setTranslationX(-10000.0f);
                break;
            case 10:
                C5066p draft2 = (C5066p) obj;
                AbstractC5830k.m5330g(draft2, "draft");
                break;
            case 11:
                C5066p draft3 = (C5066p) obj;
                AbstractC5830k.m5330g(draft3, "draft");
                break;
            case 12:
                C5066p draft4 = (C5066p) obj;
                AbstractC5830k.m5330g(draft4, "draft");
                break;
            case 13:
                DrawScope drawBehind = (DrawScope) obj;
                AbstractC5830k.m5330g(drawBehind, "$this$drawBehind");
                float f = 4;
                DrawScope.m11229drawRoundRectuAw5IA$default(drawBehind, Color.INSTANCE.m10719getWhite0d7_KjU(), 0L, 0L, CornerRadius.m10395constructorimpl((Float.floatToRawIntBits(drawBehind.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(f))) & 4294967295L) | (Float.floatToRawIntBits(drawBehind.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(f))) << 32)), null, 0.0f, null, 0, 246, null);
                float f7 = 3;
                DrawScope.m11229drawRoundRectuAw5IA$default(drawBehind, ColorKt.Color(4291611852L), 0L, 0L, CornerRadius.m10395constructorimpl((Float.floatToRawIntBits(drawBehind.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(f))) << 32) | (Float.floatToRawIntBits(drawBehind.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(f))) & 4294967295L)), new Stroke(drawBehind.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(1)), 0.0f, 0, 0, PathEffect.Companion.dashPathEffect$default(PathEffect.INSTANCE, new float[]{drawBehind.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(f7)), drawBehind.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(f7))}, 0.0f, 2, null), 14, null), 0.0f, null, 0, 230, null);
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                InterfaceC6779c it5 = (InterfaceC6779c) obj;
                AbstractC5830k.m5330g(it5, "it");
                InterfaceC5686b interfaceC5686bM6454s = AbstractC6768a.m6454s(it5);
                if (interfaceC5686bM6454s != null) {
                    break;
                } else if (AbstractC6191y0.m5838h(it5)) {
                    break;
                }
                break;
            case 25:
                InterfaceC6779c it6 = (InterfaceC6779c) obj;
                AbstractC5830k.m5330g(it6, "it");
                InterfaceC5686b interfaceC5686bM6454s2 = AbstractC6768a.m6454s(it6);
                if (interfaceC5686bM6454s2 == null) {
                    interfaceC5686bM6454s2 = AbstractC6191y0.m5838h(it6) ? new C5687c(it6) : null;
                }
                if (interfaceC5686bM6454s2 != null) {
                    break;
                }
                break;
            case 26:
                InterfaceC5634f interfaceC5634f = (InterfaceC5634f) obj;
                if (interfaceC5634f instanceof AbstractC5995r) {
                    break;
                }
                break;
            case 27:
                break;
            case 28:
                AbstractC5830k.m5330g((String) obj, "it");
                break;
            default:
                break;
        }
        return c5443s;
    }
}

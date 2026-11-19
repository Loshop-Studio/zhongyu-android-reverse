package com.zykj.mistake.feature.collection.component;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.foundation.lazy.grid.LazyGridSpanKt;
import androidx.compose.p011ui.geometry.CornerRadius;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.PathEffect;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.unit.C2331Dp;
import com.zykj.mistake.data.C4494c;
import com.zykj.mistake.entity.resp.CreateOrUpdateCollectionResp;
import com.zykj.mistake.entity.resp.MistakeCollectionListResp;
import com.zykj.mistake.entity.resp.MistakeCollectionResp;
import com.zykj.mistake.entity.resp.MistakeDetail;
import com.zykj.mistake.feature.collection.list.C4701b;
import com.zykj.mistake.feature.home.HomeTab;
import com.zykj.mistake.feature.notebook.detail.C4779d;
import com.zykj.mistake.feature.notebook.detail.C4846o0;
import com.zykj.mistake.network.ApiResp;
import com.zykj.view.simpleBoard.SimpleBoardView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5862w;
import p045d6.C5443s;
import p137p4.C6383b;
import p137p4.C6390i;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.mistake.feature.collection.component.j */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4564j implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f6413a;

    public /* synthetic */ C4564j(int i) {
        this.f6413a = i;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        int i = this.f6413a;
        boolean z8 = false;
        C5443s c5443s = C5443s.f8405a;
        switch (i) {
            case 0:
                LazyGridItemSpanScope item = (LazyGridItemSpanScope) obj;
                AbstractC5830k.m5330g(item, "$this$item");
                return GridItemSpan.m7383boximpl(LazyGridSpanKt.GridItemSpan(item.getMaxLineSpan()));
            case 1:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 2:
                C4701b it = (C4701b) obj;
                AbstractC5830k.m5330g(it, "it");
                return it.f6746a;
            case 3:
                AbstractC5830k.m5330g((HomeTab) obj, "it");
                return c5443s;
            case 4:
                C4846o0 it2 = (C4846o0) obj;
                AbstractC5830k.m5330g(it2, "it");
                return it2.f7218d;
            case 5:
                C4846o0 it3 = (C4846o0) obj;
                AbstractC5830k.m5330g(it3, "it");
                return it3.f7220f;
            case 6:
                ContentDrawScope drawWithContent = (ContentDrawScope) obj;
                AbstractC5830k.m5330g(drawWithContent, "$this$drawWithContent");
                drawWithContent.drawContent();
                float f = 4;
                DrawScope.m11229drawRoundRectuAw5IA$default(drawWithContent, ColorKt.Color(4291611852L), 0L, 0L, 0L, new Stroke(drawWithContent.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(1)), 0.0f, 0, 0, PathEffect.Companion.dashPathEffect$default(PathEffect.INSTANCE, new float[]{drawWithContent.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(f)), drawWithContent.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(f))}, 0.0f, 2, null), 14, null), 0.0f, null, 0, 238, null);
                return c5443s;
            case 7:
                Context context = (Context) obj;
                AbstractC5830k.m5330g(context, "context");
                return new C4779d(context);
            case 8:
                DrawScope drawBehind = (DrawScope) obj;
                AbstractC5830k.m5330g(drawBehind, "$this$drawBehind");
                long jColor = ColorKt.Color(4291611852L);
                float f7 = 4;
                float fMo6903toPx0680j_4 = drawBehind.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(f7));
                DrawScope.m11229drawRoundRectuAw5IA$default(drawBehind, jColor, 0L, 0L, CornerRadius.m10395constructorimpl((Float.floatToRawIntBits(fMo6903toPx0680j_4) << 32) | (Float.floatToRawIntBits(fMo6903toPx0680j_4) & 4294967295L)), new Stroke(drawBehind.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(1)), 0.0f, 0, 0, PathEffect.Companion.dashPathEffect$default(PathEffect.INSTANCE, new float[]{drawBehind.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(f7)), drawBehind.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(f7))}, 0.0f, 2, null), 14, null), 0.0f, null, 0, 230, null);
                return c5443s;
            case 9:
                DrawScope drawBehind2 = (DrawScope) obj;
                AbstractC5830k.m5330g(drawBehind2, "$this$drawBehind");
                float f8 = 4;
                DrawScope.m11229drawRoundRectuAw5IA$default(drawBehind2, ColorKt.Color(4291611852L), 0L, 0L, 0L, new Stroke(drawBehind2.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(1)), 0.0f, 0, 0, PathEffect.Companion.dashPathEffect$default(PathEffect.INSTANCE, new float[]{drawBehind2.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(f8)), drawBehind2.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(f8))}, 0.0f, 2, null), 14, null), 0.0f, null, 0, 238, null);
                return c5443s;
            case 10:
                Context context2 = (Context) obj;
                AbstractC5830k.m5330g(context2, "context");
                SimpleBoardView simpleBoardView = new SimpleBoardView(context2, null, 0, 6, null);
                simpleBoardView.getSimpleBoardConfig().setEnableControl(false);
                simpleBoardView.getSimpleBoardConfig().setMinScaleTime(1.0f);
                simpleBoardView.getSimpleBoardConfig().setMaxScaleTime(1.5f);
                return simpleBoardView;
            case 11:
                Context context3 = (Context) obj;
                AbstractC5830k.m5330g(context3, "context");
                FrameLayout frameLayout = new FrameLayout(context3);
                frameLayout.setAlpha(0.01f);
                frameLayout.setClickable(false);
                return frameLayout;
            case 12:
                DrawScope drawBehind3 = (DrawScope) obj;
                AbstractC5830k.m5330g(drawBehind3, "$this$drawBehind");
                float f9 = 1;
                float f10 = 4;
                DrawScope.m11229drawRoundRectuAw5IA$default(drawBehind3, ColorKt.Color(4290757577L), 0L, 0L, CornerRadius.m10395constructorimpl((Float.floatToRawIntBits(drawBehind3.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(f10))) << 32) | (Float.floatToRawIntBits(drawBehind3.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(f10))) & 4294967295L)), new Stroke(drawBehind3.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(f9)), 0.0f, 0, 0, null, 30, null), 0.0f, null, 0, 230, null);
                float f11 = 2;
                DrawScope.m11219drawLineNGM6Ib0$default(drawBehind3, ColorKt.Color(4290757577L), Offset.m10433constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind3.mo11233getSizeNHjbRc() >> 32)) / f11) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m10433constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind3.mo11233getSizeNHjbRc() >> 32)) / f11) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind3.mo11233getSizeNHjbRc() & 4294967295L))) & 4294967295L)), drawBehind3.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(f9)), 0, null, 0.0f, null, 0, 496, null);
                return c5443s;
            case 13:
                DrawScope drawBehind4 = (DrawScope) obj;
                AbstractC5830k.m5330g(drawBehind4, "$this$drawBehind");
                float f12 = 4;
                DrawScope.m11229drawRoundRectuAw5IA$default(drawBehind4, ColorKt.Color(4290757577L), 0L, 0L, CornerRadius.m10395constructorimpl((Float.floatToRawIntBits(drawBehind4.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(f12))) << 32) | (Float.floatToRawIntBits(drawBehind4.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(f12))) & 4294967295L)), new Stroke(drawBehind4.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(1)), 0.0f, 0, 0, null, 30, null), 0.0f, null, 0, 230, null);
                return c5443s;
            case 14:
                ApiResp it4 = (ApiResp) obj;
                AbstractC5830k.m5330g(it4, "it");
                return it4;
            case 15:
                MistakeDetail.AnswerListBean it5 = (MistakeDetail.AnswerListBean) obj;
                AbstractC5830k.m5330g(it5, "it");
                return it5.getExamAnswers();
            case 16:
                MistakeDetail.AnswerListBean it6 = (MistakeDetail.AnswerListBean) obj;
                AbstractC5830k.m5330g(it6, "it");
                return it6.getExamComments();
            case 17:
                MistakeDetail.AnswerListBean it7 = (MistakeDetail.AnswerListBean) obj;
                AbstractC5830k.m5330g(it7, "it");
                return it7.getRevisingAnswers();
            case 18:
                MistakeDetail.AnswerListBean it8 = (MistakeDetail.AnswerListBean) obj;
                AbstractC5830k.m5330g(it8, "it");
                return it8.getRevisingComments();
            case 19:
                MistakeDetail.AnswerListBean it9 = (MistakeDetail.AnswerListBean) obj;
                AbstractC5830k.m5330g(it9, "it");
                return it9.getExamAnswers();
            case 20:
                MistakeDetail.AnswerListBean it10 = (MistakeDetail.AnswerListBean) obj;
                AbstractC5830k.m5330g(it10, "it");
                return it10.getRevisingAnswers();
            case 21:
                CreateOrUpdateCollectionResp createOrUpdateCollectionResp = (CreateOrUpdateCollectionResp) obj;
                return new C4494c(String.valueOf(createOrUpdateCollectionResp.getResult().getId()), createOrUpdateCollectionResp.getResult().getName(), 0, false, 24);
            case 22:
                DrawScope Canvas = (DrawScope) obj;
                AbstractC5830k.m5330g(Canvas, "$this$Canvas");
                float fMo6903toPx0680j_42 = Canvas.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl((float) 1.5d));
                long jColor2 = ColorKt.Color(4288256409L);
                long jM10433constructorimpl = Offset.m10433constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo11233getSizeNHjbRc() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
                float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo11233getSizeNHjbRc() >> 32)) / 2.0f;
                DrawScope.m11219drawLineNGM6Ib0$default(Canvas, jColor2, jM10433constructorimpl, Offset.m10433constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo11233getSizeNHjbRc() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), fMo6903toPx0680j_42, 0, null, 0.0f, null, 0, 496, null);
                long jColor3 = ColorKt.Color(4288256409L);
                long jM10433constructorimpl2 = Offset.m10433constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo11233getSizeNHjbRc() & 4294967295L)) / 2.0f) & 4294967295L));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo11233getSizeNHjbRc() >> 32));
                DrawScope.m11219drawLineNGM6Ib0$default(Canvas, jColor3, jM10433constructorimpl2, Offset.m10433constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo11233getSizeNHjbRc() & 4294967295L)) / 2.0f) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32)), fMo6903toPx0680j_42, 0, null, 0.0f, null, 0, 496, null);
                return c5443s;
            case 23:
                DrawScope Canvas2 = (DrawScope) obj;
                AbstractC5830k.m5330g(Canvas2, "$this$Canvas");
                Path Path = AndroidPath_androidKt.Path();
                Path.moveTo(Float.intBitsToFloat((int) (Canvas2.mo11233getSizeNHjbRc() >> 32)) / 2.0f, 0.0f);
                Path.lineTo(Float.intBitsToFloat((int) (Canvas2.mo11233getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (Canvas2.mo11233getSizeNHjbRc() & 4294967295L)));
                Path.lineTo(0.0f, Float.intBitsToFloat((int) (Canvas2.mo11233getSizeNHjbRc() & 4294967295L)));
                Path.close();
                DrawScope.m11223drawPathLG529CI$default(Canvas2, Path, Color.INSTANCE.m10719getWhite0d7_KjU(), 0.0f, null, null, 0, 60, null);
                return c5443s;
            case 24:
                File it11 = (File) obj;
                AbstractC5830k.m5330g(it11, "it");
                if (it11.isFile()) {
                    String name = it11.getName();
                    AbstractC5830k.m5329f(name, "getName(...)");
                    if (AbstractC5862w.m5414u(name, ".bin", false)) {
                        z8 = true;
                    }
                }
                return Boolean.valueOf(z8);
            case 25:
                C6390i it12 = (C6390i) obj;
                AbstractC5830k.m5330g(it12, "it");
                return it12.f10480a;
            case 26:
                C6383b it13 = (C6383b) obj;
                AbstractC5830k.m5330g(it13, "it");
                return it13.f10446a;
            case 27:
                LazyGridItemSpanScope item2 = (LazyGridItemSpanScope) obj;
                AbstractC5830k.m5330g(item2, "$this$item");
                return GridItemSpan.m7383boximpl(LazyGridSpanKt.GridItemSpan(item2.getMaxLineSpan()));
            case 28:
                ApiResp it14 = (ApiResp) obj;
                AbstractC5830k.m5330g(it14, "it");
                return it14;
            default:
                MistakeCollectionListResp response = (MistakeCollectionListResp) obj;
                AbstractC5830k.m5330g(response, "response");
                List<MistakeCollectionResp> items = response.getResult().getItems();
                ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(items, 10));
                for (MistakeCollectionResp mistakeCollectionResp : items) {
                    arrayList.add(new C4494c(String.valueOf(mistakeCollectionResp.getId()), mistakeCollectionResp.getName(), mistakeCollectionResp.getItemCount(), false, 24));
                }
                return arrayList;
        }
    }
}

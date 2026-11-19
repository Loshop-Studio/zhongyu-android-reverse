package com.zykj.evaluation.p057ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableKt;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.evaluation.R;
import com.zykj.evaluation.bean.PaperBlank;
import com.zykj.evaluation.bean.PaperPosition;
import com.zykj.evaluation.bean.PaperSelect;
import com.zykj.evaluation.p057ui.widget.AbstractC6943a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import p079e7.AnswerCorrectData;
import p079e7.AnswerData;
import p079e7.C7370a;
import p079e7.C7376d;
import p079e7.C7393l0;
import p101g7.C7587c;
import p267v6.AbstractC9696m0;
import p267v6.AbstractC9708y;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010 \u001a\u00020\r2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b \u0010!J&\u0010'\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0086@¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b+\u0010\u0013J\u0017\u0010\n\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\n\u0010\u0013J\u0017\u0010,\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010\u0013J?\u00105\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020\b2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\rH\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\rH\u0002¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020\rH\u0002¢\u0006\u0004\b:\u00108J%\u0010=\u001a\u00020\r2\u0006\u0010;\u001a\u00020%2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b=\u0010>J-\u0010A\u001a\u00020\r2\u0006\u0010?\u001a\u00020\u00162\u0006\u0010;\u001a\u00020%2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\bA\u0010BJ+\u0010G\u001a\u00020-2\u0006\u0010D\u001a\u00020C2\u0012\b\u0002\u0010F\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010E\u0018\u00010\u001dH\u0002¢\u0006\u0004\bG\u0010HJ\u0013\u0010I\u001a\u00020-*\u00020-H\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010M\u001a\u00020\r2\u0006\u0010K\u001a\u0002012\u0006\u0010L\u001a\u000201H\u0002¢\u0006\u0004\bM\u0010NJ\u0013\u0010Q\u001a\u00020P*\u00020OH\u0002¢\u0006\u0004\bQ\u0010RJ\u001f\u0010S\u001a\u00020\u00162\u0006\u0010K\u001a\u0002012\u0006\u0010L\u001a\u000201H\u0002¢\u0006\u0004\bS\u0010TJ\u0013\u0010V\u001a\u00020\r*\u00020UH\u0002¢\u0006\u0004\bV\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010XR\u001e\u0010[\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010ZR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010ZR\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020_0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010ZR\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020U0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010ZR \u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020U0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010cR\u0014\u0010g\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010fR\u0016\u0010j\u001a\u00020h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010iR\u0014\u0010k\u001a\u00020h8\u0002X\u0082D¢\u0006\u0006\n\u0004\b5\u0010iR\u0014\u0010m\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010lR\u0014\u0010o\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010lR\u0014\u0010p\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010lR\u0014\u0010q\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010lR\u0014\u0010r\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010lR\u0014\u0010s\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010lR\u0014\u0010t\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010lR\u0014\u0010u\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010lR\u0016\u0010v\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010XR\u0016\u0010y\u001a\u00020w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010xR\u0016\u0010{\u001a\u00020w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010xR\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0019\u0010\u0082\u0001\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0084\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\t\u0010\u0083\u0001R\u0015\u0010\u0085\u0001\u001a\u0002018\u0002X\u0082D¢\u0006\u0006\n\u0004\bK\u0010lR\u0016\u0010\u0087\u0001\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bL\u0010\u0086\u0001R\u0018\u0010\u0089\u0001\u001a\u00020h8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010iR\u0019\u0010\u008b\u0001\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0086\u0001R,\u0010\u008f\u0001\u001a\u0015\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u001d0\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R>\u0010\u0097\u0001\u001a\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u0004\u0012\u00020\r\u0018\u00010\u0090\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0017\u0010\u009a\u0001\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0019\u0010\u009d\u0001\u001a\u0004\u0018\u00010U8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001¨\u0006\u009e\u0001"}, m13558d2 = {"Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "w", "h", "oldw", "oldh", "", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Bitmap;", "bm", "setImageBitmap", "(Landroid/graphics/Bitmap;)V", "", "Le7/b;", "questionList", "q", "(Ljava/util/List;)V", "Lx6/j;", "pageQuestionAnswerData", "", "", "changedIdSet", "p", "(Lx6/j;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o", "()Ljava/util/List;", "g", "f", "Landroid/graphics/RectF;", "rect", "text", TypedValues.Custom.S_COLOR, "", "textSize", "Landroid/graphics/Typeface;", "typeface", "i", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;Ljava/lang/String;IFLandroid/graphics/Typeface;)V", "m", "()V", "b", "c", "groupKey", "selectAnswerList", "d", "(Ljava/lang/String;Ljava/util/List;)V", "isBlank", "blankAnswerList", "a", "(ZLjava/lang/String;Ljava/util/List;)V", "Lcom/zykj/evaluation/bean/PaperPosition;", RequestParameters.POSITION, "Lcom/zykj/evaluation/bean/PaperSelect;", "selects", "j", "(Lcom/zykj/evaluation/bean/PaperPosition;Ljava/util/List;)Landroid/graphics/RectF;", "r", "(Landroid/graphics/RectF;)Landroid/graphics/RectF;", "x", "y", "l", "(FF)V", "Landroid/graphics/PointF;", "Lcom/zykj/evaluation/ui/widget/a;", "s", "(Landroid/graphics/PointF;)Lcom/zykj/evaluation/ui/widget/a;", "n", "(FF)Z", "Le7/d;", "e", "(Le7/d;)V", "Landroid/graphics/Bitmap;", "originalBitmap", "Ljava/util/List;", "correctDataList", "", "Le7/l0;", "selectQuestionAreaList", "Le7/a;", "answerAreaList", "blankQuestionAreaList", "", "Ljava/util/Map;", "dataAreaMap", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "backgroundPath", "", "J", "mLastClickTime", "minClickInterver", "F", TypedValues.CycleType.S_WAVE_OFFSET, "k", "textWidth", "textHeight", "textRightOffset", "textTopOffset", "dragTextWidth", "dragTextHeight", "dragTextRightOffset", "dragBackgroundBitmap", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "textPaint", "t", "backgroundPaint", "Landroid/graphics/Rect;", "u", "Landroid/graphics/Rect;", "imageRect", "v", "Lcom/zykj/evaluation/ui/widget/a;", "currentMode", "Z", "isClick", "minMoveDistance", "Landroid/graphics/PointF;", "firstPointF", "z", "firstTime", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "firstOffset", "Lkotlin/Pair;", "B", "Lkotlin/Pair;", "currentTouchInfo", "Lkotlin/Function1;", "C", "Lkotlin/jvm/functions/Function1;", "getOnClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnClickListener", "(Lkotlin/jvm/functions/Function1;)V", "onClickListener", "D", "Landroid/graphics/RectF;", "tempRectF", "getCurrentBlankQuestionArea", "()Le7/d;", "currentBlankQuestionArea", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nAnswerSheetCorrectView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerSheetCorrectView.kt\ncom/zykj/evaluation/ui/widget/AnswerSheetCorrectView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CanvasUtils.kt\ncom/zykj/evaluation/utils/CanvasUtils\n+ 4 Color.kt\nandroidx/core/graphics/ColorKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,978:1\n295#2,2:979\n1869#2,2:981\n1869#2:983\n1869#2,2:984\n1870#2:986\n1869#2:995\n1870#2:1000\n1869#2:1001\n1869#2:1002\n1870#2:1004\n1870#2:1006\n1869#2,2:1007\n1869#2,2:1009\n1869#2:1011\n1563#2:1012\n1634#2,3:1013\n1869#2:1016\n1869#2:1017\n1870#2:1020\n1870#2:1021\n1870#2:1023\n1869#2:1024\n1869#2,2:1025\n1870#2:1027\n1869#2,2:1028\n1869#2,2:1030\n1869#2,2:1032\n774#2:1034\n865#2,2:1035\n1869#2:1037\n1869#2,2:1038\n1870#2:1040\n1869#2:1041\n1878#2,2:1042\n1880#2:1049\n1870#2:1050\n1563#2:1051\n1634#2,2:1052\n1563#2:1054\n1634#2,3:1055\n1636#2:1058\n10#3,4:987\n15#3,3:992\n404#4:991\n404#4:996\n404#4:997\n404#4:998\n404#4:999\n404#4:1003\n404#4:1005\n404#4:1018\n404#4:1019\n1#5:1022\n1#5:1045\n293#6:1044\n278#6,3:1046\n*S KotlinDebug\n*F\n+ 1 AnswerSheetCorrectView.kt\ncom/zykj/evaluation/ui/widget/AnswerSheetCorrectView\n*L\n212#1:979,2\n249#1:981,2\n253#1:983\n254#1:984,2\n253#1:986\n271#1:995\n271#1:1000\n305#1:1001\n308#1:1002\n308#1:1004\n305#1:1006\n352#1:1007,2\n459#1:1009,2\n534#1:1011\n539#1:1012\n539#1:1013,3\n542#1:1016\n543#1:1017\n543#1:1020\n542#1:1021\n534#1:1023\n627#1:1024\n629#1:1025,2\n627#1:1027\n646#1:1028,2\n696#1:1030,2\n714#1:1032,2\n788#1:1034\n788#1:1035,2\n885#1:1037\n887#1:1038,2\n885#1:1040\n902#1:1041\n903#1:1042,2\n903#1:1049\n902#1:1050\n946#1:1051\n946#1:1052,2\n957#1:1054\n957#1:1055,3\n946#1:1058\n261#1:987,4\n261#1:992,3\n262#1:991\n276#1:996\n283#1:997\n292#1:998\n299#1:999\n314#1:1003\n340#1:1005\n554#1:1018\n556#1:1019\n918#1:1045\n918#1:1044\n919#1:1046,3\n*E\n"})
/* loaded from: classes4.dex */
public final class AnswerSheetCorrectView extends AppCompatImageView {

    /* renamed from: A, reason: from kotlin metadata */
    public PointF firstOffset;

    /* renamed from: B, reason: from kotlin metadata */
    public Pair currentTouchInfo;

    /* renamed from: C, reason: from kotlin metadata */
    public Function1 onClickListener;

    /* renamed from: D, reason: from kotlin metadata */
    public final RectF tempRectF;

    /* renamed from: a, reason: from kotlin metadata */
    public Bitmap originalBitmap;

    /* renamed from: b, reason: from kotlin metadata */
    public List correctDataList;

    /* renamed from: c, reason: from kotlin metadata */
    public final List selectQuestionAreaList;

    /* renamed from: d, reason: from kotlin metadata */
    public final List answerAreaList;

    /* renamed from: e, reason: from kotlin metadata */
    public final List blankQuestionAreaList;

    /* renamed from: f, reason: from kotlin metadata */
    public final Map dataAreaMap;

    /* renamed from: g, reason: from kotlin metadata */
    public final Path backgroundPath;

    /* renamed from: h, reason: from kotlin metadata */
    public long mLastClickTime;

    /* renamed from: i, reason: from kotlin metadata */
    public final long minClickInterver;

    /* renamed from: j, reason: from kotlin metadata */
    public final float offset;

    /* renamed from: k, reason: from kotlin metadata */
    public final float textWidth;

    /* renamed from: l, reason: from kotlin metadata */
    public final float textHeight;

    /* renamed from: m, reason: from kotlin metadata */
    public final float textRightOffset;

    /* renamed from: n, reason: from kotlin metadata */
    public final float textTopOffset;

    /* renamed from: o, reason: from kotlin metadata */
    public final float dragTextWidth;

    /* renamed from: p, reason: from kotlin metadata */
    public final float dragTextHeight;

    /* renamed from: q, reason: from kotlin metadata */
    public final float dragTextRightOffset;

    /* renamed from: r, reason: from kotlin metadata */
    public final Bitmap dragBackgroundBitmap;

    /* renamed from: s, reason: from kotlin metadata */
    public Paint textPaint;

    /* renamed from: t, reason: from kotlin metadata */
    public Paint backgroundPaint;

    /* renamed from: u, reason: from kotlin metadata */
    public final Rect imageRect;

    /* renamed from: v, reason: from kotlin metadata */
    public AbstractC6943a currentMode;

    /* renamed from: w, reason: from kotlin metadata */
    public boolean isClick;

    /* renamed from: x, reason: from kotlin metadata */
    public final float minMoveDistance;

    /* renamed from: y, reason: from kotlin metadata */
    public final PointF firstPointF;

    /* renamed from: z, reason: from kotlin metadata */
    public long firstTime;

    public /* synthetic */ AnswerSheetCorrectView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    private final C7376d getCurrentBlankQuestionArea() {
        Object next;
        Iterator it = this.blankQuestionAreaList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C7376d c7376d = (C7376d) next;
            if (Intrinsics.areEqual(c7376d.m11829c(), this.currentTouchInfo.getFirst()) && Intrinsics.areEqual(c7376d.m11834h(), this.currentTouchInfo.getSecond())) {
                break;
            }
        }
        return (C7376d) next;
    }

    /* renamed from: k */
    public static /* synthetic */ RectF m10428k(AnswerSheetCorrectView answerSheetCorrectView, PaperPosition paperPosition, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = null;
        }
        return answerSheetCorrectView.m10438j(paperPosition, list);
    }

    /* renamed from: a */
    public final void m10429a(boolean isBlank, String groupKey, List blankAnswerList) {
        String uuid;
        PaperPosition position;
        PointF pointF = new PointF(Float.MAX_VALUE, Float.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        RectF rectF = new RectF();
        if (isBlank) {
            Iterator it = blankAnswerList.iterator();
            while (it.hasNext()) {
                AnswerCorrectData answerCorrectData = (AnswerCorrectData) it.next();
                for (AnswerData answerData : answerCorrectData.getAnswerData()) {
                    PaperBlank blank = answerData.getBlank();
                    if (blank == null || (position = blank.getPosition()) == null) {
                        position = answerCorrectData.getPosition();
                    }
                    arrayList2.add(answerData.getUuid());
                    RectF rectFM10445r = m10445r(AbstractC9708y.m16222g(position));
                    arrayList.add(rectFM10445r);
                    rectF.union(rectFM10445r);
                    float f10 = rectFM10445r.top;
                    if (f10 < pointF.y || rectFM10445r.left < pointF.x) {
                        pointF.set(rectFM10445r.left, f10);
                    }
                }
            }
        } else {
            Iterator it2 = blankAnswerList.iterator();
            while (it2.hasNext()) {
                AnswerCorrectData answerCorrectData2 = (AnswerCorrectData) it2.next();
                RectF rectFM10445r2 = m10445r(AbstractC9708y.m16222g(answerCorrectData2.getPosition()));
                arrayList.add(rectFM10445r2);
                rectF.union(rectFM10445r2);
                float f11 = rectFM10445r2.top;
                if (f11 < pointF.y || rectFM10445r2.left < pointF.x) {
                    pointF.set(rectFM10445r2.left, f11);
                }
                AnswerData answerData2 = (AnswerData) CollectionsKt.firstOrNull(answerCorrectData2.getAnswerData());
                if (answerData2 != null && (uuid = answerData2.getUuid()) != null) {
                    arrayList2.add(uuid);
                }
            }
        }
        RectF rectF2 = new RectF();
        RectF rectF3 = new RectF();
        float f12 = pointF.x;
        if (f12 != Float.MAX_VALUE || pointF.y != Float.MAX_VALUE) {
            float f13 = pointF.y;
            rectF3.set(f12, f13 - this.dragTextHeight, this.dragTextWidth + f12, f13);
            rectF2.set(rectF3);
            rectF2.right -= this.dragTextRightOffset;
        }
        Rect rect = this.imageRect;
        RectF rectF4 = new RectF(rect.left - rectF.left, rect.top - rectF.top, rect.right - rectF.right, rect.bottom - rectF.bottom);
        List list = this.blankQuestionAreaList;
        C7376d c7376d = new C7376d(isBlank, groupKey, arrayList2, arrayList, rectF2, rectF3, rectF4, 0.0f, 0.0f, 384, null);
        Iterator it3 = blankAnswerList.iterator();
        while (it3.hasNext()) {
            this.dataAreaMap.put((AnswerCorrectData) it3.next(), c7376d);
        }
        list.add(c7376d);
    }

    /* renamed from: b */
    public final void m10430b() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int width = getWidth();
        int height = getHeight();
        float f10 = intrinsicHeight / intrinsicWidth;
        float f11 = height;
        float f12 = width;
        if (f10 > f11 / f12) {
            int i10 = (width - ((int) (f11 / f10))) / 2;
            this.imageRect.set(i10, 0, width - i10, height);
        } else {
            int i11 = (height - ((int) (f12 * f10))) / 2;
            this.imageRect.set(0, i11, width, height - i11);
        }
    }

    /* renamed from: c */
    public final void m10431c() {
        this.selectQuestionAreaList.clear();
        this.answerAreaList.clear();
        this.blankQuestionAreaList.clear();
        ArrayList arrayList = new ArrayList();
        List<AnswerCorrectData> list = this.correctDataList;
        int i10 = -1;
        String str = "";
        if (list != null) {
            for (AnswerCorrectData answerCorrectData : list) {
                AnswerData answerData = (AnswerData) CollectionsKt.firstOrNull(answerCorrectData.getAnswerData());
                if (answerData != null) {
                    int iM16209a = answerData.getSelect() != null ? AbstractC9696m0.c.f17012b.m16209a() : answerData.getBlank() != null ? AbstractC9696m0.a.f17010b.m16209a() : AbstractC9696m0.b.f17011b.m16209a();
                    String groupKey = answerCorrectData.getGroupKey();
                    if (i10 == iM16209a && Intrinsics.areEqual(str, groupKey)) {
                        arrayList.add(answerCorrectData);
                    } else {
                        if (i10 == AbstractC9696m0.c.f17012b.m16209a()) {
                            m10432d(str, arrayList);
                        } else if (i10 == AbstractC9696m0.a.f17010b.m16209a()) {
                            m10429a(true, str, arrayList);
                        } else if (i10 == AbstractC9696m0.b.f17011b.m16209a()) {
                            m10429a(false, str, arrayList);
                        }
                        arrayList.clear();
                        arrayList.add(answerCorrectData);
                        i10 = iM16209a;
                        str = groupKey;
                    }
                }
            }
        }
        if (i10 == AbstractC9696m0.c.f17012b.m16209a()) {
            m10432d(str, arrayList);
        } else if (i10 == AbstractC9696m0.a.f17010b.m16209a()) {
            m10429a(true, str, arrayList);
        } else if (i10 == AbstractC9696m0.b.f17011b.m16209a()) {
            m10429a(false, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10432d(java.lang.String r14, java.util.List r15) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.widget.AnswerSheetCorrectView.m10432d(java.lang.String, java.util.List):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/widget/AnswerSheetCorrectView.smali:1941
    }

    /* renamed from: e */
    public final void m10433e(C7376d c7376d) {
        if (c7376d.m11831e() < c7376d.m11830d().left) {
            c7376d.m11836j(c7376d.m11830d().left);
        }
        if (c7376d.m11831e() > c7376d.m11830d().right) {
            c7376d.m11836j(c7376d.m11830d().right);
        }
        if (c7376d.m11832f() < c7376d.m11830d().top) {
            c7376d.m11837k(c7376d.m11830d().top);
        }
        if (c7376d.m11832f() > c7376d.m11830d().bottom) {
            c7376d.m11837k(c7376d.m11830d().bottom);
        }
    }

    /* renamed from: f */
    public final void m10434f(Canvas canvas) throws Resources.NotFoundException {
        for (C7370a c7370a : this.answerAreaList) {
            RectF rectFM11797a = c7370a.m11797a();
            String strM11799c = c7370a.m11799c();
            int iM11798b = c7370a.m11798b();
            float dimension = getResources().getDimension(R.dimen.text_8);
            Typeface DEFAULT_BOLD = Typeface.DEFAULT_BOLD;
            Intrinsics.checkNotNullExpressionValue(DEFAULT_BOLD, "DEFAULT_BOLD");
            m10437i(canvas, rectFM11797a, strM11799c, iM11798b, dimension, DEFAULT_BOLD);
        }
    }

    /* renamed from: g */
    public final void m10435g(Canvas canvas) {
        this.backgroundPath.reset();
        CollectionsKt.getIndices(this.blankQuestionAreaList);
        Iterator it = this.selectQuestionAreaList.iterator();
        while (it.hasNext()) {
            this.backgroundPath.addPath(((C7393l0) it.next()).m11864b());
        }
        for (C7376d c7376d : this.blankQuestionAreaList) {
            Iterator it2 = c7376d.m11833g().iterator();
            while (it2.hasNext()) {
                this.tempRectF.set((RectF) it2.next());
                this.tempRectF.offset(c7376d.m11831e(), c7376d.m11832f());
                this.backgroundPath.addRect(this.tempRectF, Path.Direction.CW);
            }
        }
        C7587c c7587c = C7587c.f12715a;
        Path path = this.backgroundPath;
        int iSave = canvas.save();
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        try {
            canvas.drawColor(Color.parseColor("#4C000000"));
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final Function1<List<AnswerCorrectData>, Unit> getOnClickListener() {
        return this.onClickListener;
    }

    /* renamed from: h */
    public final void m10436h(Canvas canvas) throws Resources.NotFoundException {
        for (C7393l0 c7393l0 : this.selectQuestionAreaList) {
            Path pathM11864b = c7393l0.m11864b();
            Paint paint = this.backgroundPaint;
            paint.setColor(Color.parseColor("#334897F3"));
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            Unit unit = Unit.INSTANCE;
            canvas.drawPath(pathM11864b, paint);
            Path pathM11864b2 = c7393l0.m11864b();
            Paint paint2 = this.backgroundPaint;
            paint2.setColor(Color.parseColor("#1762B9"));
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(2.0f);
            canvas.drawPath(pathM11864b2, paint2);
            Path pathM11863a = c7393l0.m11863a();
            Paint paint3 = this.backgroundPaint;
            paint3.setColor(Color.parseColor("#1762B9"));
            paint3.setStyle(style);
            canvas.drawPath(pathM11863a, paint3);
            RectF rectFM11865c = c7393l0.m11865c();
            int color = Color.parseColor("#FFFFFF");
            float dimension = getResources().getDimension(R.dimen.text_8);
            Typeface DEFAULT = Typeface.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            m10437i(canvas, rectFM11865c, "纠错", color, dimension, DEFAULT);
        }
        for (C7376d c7376d : this.blankQuestionAreaList) {
            Iterator it = c7376d.m11833g().iterator();
            while (it.hasNext()) {
                this.tempRectF.set((RectF) it.next());
                this.tempRectF.offset(c7376d.m11831e(), c7376d.m11832f());
                RectF rectF = this.tempRectF;
                Paint paint4 = this.backgroundPaint;
                paint4.setColor(Color.parseColor("#1762B9"));
                paint4.setStyle(Paint.Style.STROKE);
                paint4.setStrokeWidth(2.0f);
                Unit unit2 = Unit.INSTANCE;
                canvas.drawRect(rectF, paint4);
            }
            this.tempRectF.set(c7376d.m11827a());
            this.tempRectF.offset(c7376d.m11831e(), c7376d.m11832f());
            Bitmap bitmap = this.dragBackgroundBitmap;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), this.tempRectF, (Paint) null);
            }
            this.tempRectF.set(c7376d.m11828b());
            this.tempRectF.offset(c7376d.m11831e(), c7376d.m11832f());
            RectF rectF2 = this.tempRectF;
            int color2 = Color.parseColor("#FFFFFF");
            float dimension2 = getResources().getDimension(R.dimen.text_8);
            Typeface DEFAULT2 = Typeface.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(DEFAULT2, "DEFAULT");
            m10437i(canvas, rectF2, "长按可拖动", color2, dimension2, DEFAULT2);
        }
    }

    /* renamed from: i */
    public final void m10437i(Canvas canvas, RectF rect, String text, int color, float textSize, Typeface typeface) {
        Paint paint = this.textPaint;
        paint.setColor(color);
        paint.setTextSize(textSize);
        paint.setTypeface(typeface);
        Paint.FontMetrics fontMetrics = this.textPaint.getFontMetrics();
        float f10 = 2;
        canvas.drawText(text, rect.centerX(), (int) ((rect.centerY() - (fontMetrics.top / f10)) - (fontMetrics.bottom / f10)), this.textPaint);
    }

    /* renamed from: j */
    public final RectF m10438j(PaperPosition position, List selects) {
        PaperPosition position2;
        RectF rectFM16222g;
        RectF rectFM16222g2 = AbstractC9708y.m16222g(position);
        if (selects != null) {
            Iterator it = selects.iterator();
            while (it.hasNext()) {
                PaperSelect paperSelect = (PaperSelect) it.next();
                if (paperSelect != null && (position2 = paperSelect.getPosition()) != null && (rectFM16222g = AbstractC9708y.m16222g(position2)) != null) {
                    rectFM16222g2.union(rectFM16222g);
                }
            }
        }
        return m10445r(rectFM16222g2);
    }

    /* renamed from: l */
    public final void m10439l(float x9, float y9) {
        C7376d currentBlankQuestionArea = getCurrentBlankQuestionArea();
        if (currentBlankQuestionArea != null) {
            currentBlankQuestionArea.m11836j((this.firstOffset.x + x9) - this.firstPointF.x);
            currentBlankQuestionArea.m11837k((this.firstOffset.y + y9) - this.firstPointF.y);
            m10433e(currentBlankQuestionArea);
        }
        postInvalidate();
    }

    /* renamed from: m */
    public final void m10440m() {
        m10430b();
        m10431c();
    }

    /* renamed from: n */
    public final boolean m10441n(float x9, float y9) {
        double d10 = 2;
        return ((float) Math.sqrt((double) (((float) Math.pow((double) (x9 - this.firstPointF.x), d10)) + ((float) Math.pow((double) (y9 - this.firstPointF.y), d10))))) > this.minMoveDistance;
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, java.util.List] */
    /* renamed from: o */
    public final List m10442o() {
        List<AnswerCorrectData> list = this.correctDataList;
        if (list == null) {
            return null;
        }
        int i10 = 10;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (AnswerCorrectData answerCorrectDataM11801b : list) {
            AnswerData answerData = (AnswerData) CollectionsKt.firstOrNull(answerCorrectDataM11801b.getAnswerData());
            if (answerData != null) {
                PaperPosition position = answerCorrectDataM11801b.getPosition();
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = answerCorrectDataM11801b.getAnswerData();
                C7376d c7376d = (C7376d) this.dataAreaMap.get(answerCorrectDataM11801b);
                if (c7376d != null) {
                    float fM11831e = c7376d.m11831e() / this.imageRect.width();
                    float fM11832f = c7376d.m11832f() / this.imageRect.height();
                    position = AbstractC9708y.m16221f(position, fM11831e, fM11832f);
                    Iterable<AnswerData> iterable = (Iterable) objectRef.element;
                    ?? arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, i10));
                    for (AnswerData answerData2 : iterable) {
                        PaperBlank blank = answerData2.getBlank();
                        arrayList2.add(AnswerData.m11820b(answerData2, null, null, null, 0, blank != null ? PaperBlank.copy$default(blank, null, AbstractC9708y.m16221f(answerData2.getBlank().getPosition(), fM11831e, fM11832f), 1, null) : null, 15, null));
                    }
                    objectRef.element = arrayList2;
                }
                PaperPosition paperPosition = position;
                if (answerData.getSelect() == null) {
                    answerCorrectDataM11801b = AnswerCorrectData.m11801b(answerCorrectDataM11801b, 0L, (List) objectRef.element, paperPosition, null, 0, 0, 57, null);
                }
            }
            arrayList.add(answerCorrectDataM11801b);
            i10 = 10;
        }
        return arrayList;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        m10435g(canvas);
        m10436h(canvas);
        m10434f(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int w9, int h10, int oldw, int oldh) {
        super.onSizeChanged(w9, h10, oldw, oldh);
        m10440m();
        postInvalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        AbstractC6943a.c cVar;
        Collection collectionEmptyList;
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.isClick = true;
            this.firstPointF.set(event.getX(), event.getY());
            this.firstTime = System.currentTimeMillis();
            this.currentMode = m10446s(this.firstPointF);
            C7376d currentBlankQuestionArea = getCurrentBlankQuestionArea();
            this.firstOffset.set(currentBlankQuestionArea != null ? currentBlankQuestionArea.m11831e() : 0.0f, currentBlankQuestionArea != null ? currentBlankQuestionArea.m11832f() : 0.0f);
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.isClick && m10441n(event.getX(), event.getY())) {
                    this.isClick = false;
                }
                if (this.isClick && System.currentTimeMillis() - this.firstTime > this.minClickInterver) {
                    AbstractC6943a abstractC6943a = this.currentMode;
                    cVar = abstractC6943a instanceof AbstractC6943a.c ? (AbstractC6943a.c) abstractC6943a : null;
                    if (cVar != null && !cVar.m10451a()) {
                        this.currentMode = new AbstractC6943a.c(true);
                    }
                }
                AbstractC6943a abstractC6943a2 = this.currentMode;
                if (abstractC6943a2 instanceof AbstractC6943a.c) {
                    Intrinsics.checkNotNull(abstractC6943a2, "null cannot be cast to non-null type com.zykj.evaluation.ui.widget.TouchMode.Drag");
                    if (((AbstractC6943a.c) abstractC6943a2).m10451a()) {
                        m10439l(event.getX(), event.getY());
                    }
                }
            }
        } else if (this.isClick && Intrinsics.areEqual(this.currentMode, AbstractC6943a.a.f10263a)) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (jUptimeMillis - this.mLastClickTime > this.minClickInterver) {
                this.mLastClickTime = jUptimeMillis;
                Function1 function1 = this.onClickListener;
                if (function1 != null) {
                    List list = this.correctDataList;
                    if (list != null) {
                        collectionEmptyList = new ArrayList();
                        for (Object obj : list) {
                            AnswerCorrectData answerCorrectData = (AnswerCorrectData) obj;
                            if (Intrinsics.areEqual(answerCorrectData.getGroupKey(), this.currentTouchInfo.getFirst())) {
                                Iterable iterable = (Iterable) this.currentTouchInfo.getSecond();
                                AnswerData answerData = (AnswerData) CollectionsKt.firstOrNull(answerCorrectData.getAnswerData());
                                if (CollectionsKt.contains(iterable, answerData != null ? answerData.getUuid() : null)) {
                                    collectionEmptyList.add(obj);
                                }
                            }
                        }
                    } else {
                        collectionEmptyList = CollectionsKt.emptyList();
                    }
                    function1.invoke(collectionEmptyList);
                }
            }
        } else if (!this.isClick) {
            AbstractC6943a abstractC6943a3 = this.currentMode;
            cVar = abstractC6943a3 instanceof AbstractC6943a.c ? (AbstractC6943a.c) abstractC6943a3 : null;
            if (cVar == null || cVar.m10451a()) {
                m10439l(event.getX(), event.getY());
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x015c -> B:43:0x017e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0262 -> B:60:0x0270). Please report as a decompilation issue!!! */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10443p(p287x6.C9867j r27, java.util.Set r28, kotlin.coroutines.Continuation r29) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.widget.AnswerSheetCorrectView.m10443p(x6.j, java.util.Set, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/widget/AnswerSheetCorrectView.smali:5579
    }

    /* renamed from: q */
    public final void m10444q(List questionList) {
        Intrinsics.checkNotNullParameter(questionList, "questionList");
        this.correctDataList = questionList;
        m10440m();
        postInvalidate();
    }

    /* renamed from: r */
    public final RectF m10445r(RectF rectF) {
        Rect rect = this.imageRect;
        float fWidth = rect.left + (rectF.left * rect.width()) + this.offset;
        Rect rect2 = this.imageRect;
        float fHeight = rect2.top + (rectF.top * rect2.height()) + this.offset;
        Rect rect3 = this.imageRect;
        float fWidth2 = (rect3.left + (rectF.right * rect3.width())) - this.offset;
        Rect rect4 = this.imageRect;
        return new RectF(fWidth, fHeight, fWidth2, (rect4.top + (rectF.bottom * rect4.height())) - this.offset);
    }

    /* renamed from: s */
    public final AbstractC6943a m10446s(PointF pointF) {
        C7376d c7376d;
        RectF rectF;
        int size = this.blankQuestionAreaList.size();
        do {
            size--;
            if (-1 >= size) {
                for (int size2 = this.selectQuestionAreaList.size() - 1; -1 < size2; size2--) {
                    C7393l0 c7393l0 = (C7393l0) this.selectQuestionAreaList.get(size2);
                    if (c7393l0.m11867e().contains(pointF.x, pointF.y)) {
                        this.currentTouchInfo = new Pair(c7393l0.m11866d(), c7393l0.m11868f());
                        return AbstractC6943a.a.f10263a;
                    }
                }
                return AbstractC6943a.b.f10264a;
            }
            c7376d = (C7376d) this.blankQuestionAreaList.get(size);
            rectF = new RectF(c7376d.m11827a());
            rectF.offset(c7376d.m11831e(), c7376d.m11832f());
        } while (!rectF.contains(pointF.x, pointF.y));
        this.currentTouchInfo = new Pair(c7376d.m11829c(), c7376d.m11834h());
        return new AbstractC6943a.c(false);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bm) {
        super.setImageBitmap(bm);
        this.originalBitmap = bm;
    }

    public final void setOnClickListener(Function1<? super List<AnswerCorrectData>, Unit> function1) {
        this.onClickListener = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerSheetCorrectView(Context context, AttributeSet attributeSet) {
        Object objM24299constructorimpl;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.selectQuestionAreaList = new ArrayList();
        this.answerAreaList = new ArrayList();
        this.blankQuestionAreaList = new ArrayList();
        this.dataAreaMap = new LinkedHashMap();
        this.backgroundPath = new Path();
        this.minClickInterver = 600L;
        this.offset = getResources().getDimension(R.dimen.view_1);
        this.textWidth = getResources().getDimension(R.dimen.view_22);
        this.textHeight = getResources().getDimension(R.dimen.view_12);
        this.textRightOffset = getResources().getDimension(R.dimen.view_3);
        this.textTopOffset = getResources().getDimension(R.dimen.view_2);
        this.dragTextWidth = getResources().getDimension(R.dimen.view_48);
        this.dragTextHeight = getResources().getDimension(R.dimen.view_12);
        this.dragTextRightOffset = getResources().getDimension(R.dimen.view_3);
        try {
            Result.Companion companion = Result.INSTANCE;
            objM24299constructorimpl = Result.m24299constructorimpl(ContextCompat.getDrawable(context, R.drawable.icon_scan_drag));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24299constructorimpl = Result.m24299constructorimpl(ResultKt.createFailure(th));
        }
        Drawable drawable = (Drawable) (Result.m24305isFailureimpl(objM24299constructorimpl) ? null : objM24299constructorimpl);
        this.dragBackgroundBitmap = drawable != null ? DrawableKt.toBitmapOrNull$default(drawable, 0, 0, null, 7, null) : null;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextAlign(Paint.Align.CENTER);
        this.textPaint = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.backgroundPaint = paint2;
        this.imageRect = new Rect();
        this.currentMode = AbstractC6943a.b.f10264a;
        this.isClick = true;
        this.minMoveDistance = 20.0f;
        this.firstPointF = new PointF();
        this.firstOffset = new PointF();
        this.currentTouchInfo = new Pair("", CollectionsKt.emptyList());
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.tempRectF = new RectF();
    }
}

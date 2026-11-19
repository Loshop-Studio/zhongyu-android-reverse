package com.zykj.evaluation.p057ui.sheet.normal;

// RE note 本类字节码直接引用的读写或显示接口包括JSON、位图。

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.blankj.utilcode.util.FileUtils;
import com.zykj.evaluation.base.BaseViewModel;
import com.zykj.evaluation.bean.CommitAnswer;
import com.zykj.evaluation.bean.CommitTaskAnswer;
import com.zykj.evaluation.bean.PaperBlank;
import com.zykj.evaluation.bean.PaperConfig;
import com.zykj.evaluation.bean.PaperHand;
import com.zykj.evaluation.bean.PaperPage;
import com.zykj.evaluation.bean.PaperQuestion;
import com.zykj.evaluation.bean.PaperSelect;
import com.zykj.evaluation.bean.bundle.AnswerSheetBundle;
import com.zykj.evaluation.p056di.AppDatabase;
import com.zykj.evaluation.p057ui.sheet.AbstractC6934b;
import com.zykj.evaluation.p057ui.sheet.AbstractC6935c;
import com.zykj.evaluation.p057ui.sheet.AnswerSheetViewModel;
import com.zykj.evaluation.p057ui.sheet.C6933a;
import com.zykj.evaluation.submit.SubmitTaskManger;
import com.zykj.evaluation.upload.OssTaskManger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.json.JSONObject;
import p026b7.C4997c1;
import p079e7.AnswerCorrectData;
import p079e7.AnswerData;
import p200p5.InterfaceC8843j;
import p200p5.InterfaceC8844k;
import p267v6.AbstractC9694l0;
import p267v6.AbstractC9708y;
import p267v6.C9709z;
import p287x6.AnswerInfo;
import p287x6.C9859b;
import p287x6.C9860c;
import p287x6.C9861d;
import p287x6.C9867j;
import p287x6.QuestionAnswerInfo;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u0013J\u0017\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b&\u0010\"J\u0017\u0010'\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b'\u0010\"J\u0010\u0010(\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b(\u0010%J\u001f\u0010+\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u0014H\u0002¢\u0006\u0004\b+\u0010,J.\u00104\u001a\u0002032\u0006\u0010.\u001a\u00020-2\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00102\u001a\u00020-H\u0082@¢\u0006\u0004\b4\u00105J.\u00106\u001a\u00020\u00112\u0006\u0010.\u001a\u00020-2\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00102\u001a\u00020-H\u0082@¢\u0006\u0004\b6\u00105J\u001d\u0010:\u001a\b\u0012\u0004\u0012\u0002090/2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b:\u0010;JE\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00140A2\f\u0010<\u001a\b\u0012\u0004\u0012\u0002090/2\f\u0010=\u001a\b\u0012\u0004\u0012\u0002090/2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020?0>H\u0002¢\u0006\u0004\bB\u0010CJH\u0010G\u001a\b\u0012\u0004\u0012\u00020F0/2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00140A2\u0006\u0010E\u001a\u00020\u001f2\u0006\u00108\u001a\u0002072\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020?0>H\u0082@¢\u0006\u0004\bG\u0010HJ+\u0010L\u001a\b\u0012\u0004\u0012\u00020K0/2\u0014\b\u0002\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0/0IH\u0002¢\u0006\u0004\bL\u0010MJ,\u0010P\u001a\u00020\u00142\u0006\u0010N\u001a\u00020\u00142\u0012\u0010O\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140I\"\u00020\u0014H\u0082@¢\u0006\u0004\bP\u0010QJ\u0012\u0010S\u001a\u0004\u0018\u00010RH\u0082@¢\u0006\u0004\bS\u0010%J\u0017\u0010V\u001a\u0002032\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020\u0011H\u0096@¢\u0006\u0004\bX\u0010%J\u0017\u0010Z\u001a\u00020\u00112\u0006\u0010Y\u001a\u00020\u001fH\u0014¢\u0006\u0004\bZ\u0010\"J%\u0010_\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020[2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00110]H\u0016¢\u0006\u0004\b_\u0010`J+\u0010b\u001a\u00020\u00112\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00110]2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00110]H\u0016¢\u0006\u0004\bb\u0010cJ\u001b\u0010d\u001a\u00020\u00112\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00110]¢\u0006\u0004\bd\u0010eJ\u001b\u0010f\u001a\u00020\u00112\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00110]¢\u0006\u0004\bf\u0010eJ\u001b\u0010i\u001a\u00020\u00112\f\u0010h\u001a\b\u0012\u0004\u0012\u00020g0/¢\u0006\u0004\bi\u0010jJ\u001d\u0010l\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010k\u001a\u00020\u001f¢\u0006\u0004\bl\u0010mJ\u001d\u0010o\u001a\u00020\u00112\u000e\b\u0002\u0010n\u001a\b\u0012\u0004\u0012\u00020g0/¢\u0006\u0004\bo\u0010jJ\u0010\u0010p\u001a\u00020\u0011H\u0086@¢\u0006\u0004\bp\u0010%J\r\u0010q\u001a\u000203¢\u0006\u0004\bq\u0010rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010sR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010tR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R1\u0010\u0085\u0001\u001a\u00020}2\u0006\u0010~\u001a\u00020}8F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R1\u0010\u008b\u0001\u001a\u00020\u001f2\u0006\u0010~\u001a\u00020\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0005\b\u008a\u0001\u0010\"R\u001b\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0019\u0010\u0095\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R1\u0010\u009a\u0001\u001a\u0002032\u0006\u0010~\u001a\u0002038B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b\u0096\u0001\u0010\u0087\u0001\u001a\u0005\b\u0097\u0001\u0010r\"\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0019\u0010\u009d\u0001\u001a\u00020R8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001f\u0010 \u0001\u001a\b\u0012\u0004\u0012\u0002070I8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R%\u0010£\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090/0I8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R$\u0010¤\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0/0I8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b_\u0010¢\u0001R$\u0010¨\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0005\u0012\u00030¦\u00010¥\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bV\u0010§\u0001R\u0019\u0010«\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0019\u0010\u00ad\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010ª\u0001R\u001a\u0010±\u0001\u001a\u0005\u0018\u00010®\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0017\u0010´\u0001\u001a\u0002078BX\u0082\u0004¢\u0006\b\u001a\u0006\b²\u0001\u0010³\u0001¨\u0006µ\u0001"}, m13558d2 = {"Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;", "Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;", "Lp5/j;", NotificationCompat.CATEGORY_SERVICE, "Lp5/k;", "configService", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/message/server/bean/UserInfo;", "userInfo", "Lcom/zykj/evaluation/upload/OssTaskManger;", "ossTaskManger", "Lcom/zykj/evaluation/submit/SubmitTaskManger;", "submitTaskManger", "Lcom/zykj/evaluation/di/AppDatabase;", "database", "<init>", "(Lp5/j;Lp5/k;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lcom/zykj/evaluation/di/AppDatabase;)V", "", "D0", "()V", "", "address", "", "testPaperId", "W0", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/evaluation/bean/PaperConfig;", "config", "T0", "(Lcom/zykj/evaluation/bean/PaperConfig;)V", "Y0", "", "pageSize", "S0", "(I)V", "V0", "Z0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "E0", "X0", "i1", "questionIndex", "newAnswer", "f1", "(ILjava/lang/String;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "Landroid/graphics/Point;", "points", "previewBitmap", "", "F0", "(Landroid/graphics/Bitmap;Ljava/util/List;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "P0", "Lx6/j;", "pageQuestionAnswerData", "Le7/b;", "B0", "(Lx6/j;)Ljava/util/List;", "oldCorrectList", "newCorrectList", "", "Lx6/a;", "answerInfoMap", "", "y0", "(Ljava/util/List;Ljava/util/List;Ljava/util/Map;)Ljava/util/Set;", "changedIdSet", "pageIndex", "Lx6/k;", "O0", "(Ljava/util/Set;ILx6/j;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "questionAnswerArray", "Lcom/zykj/evaluation/bean/CommitTaskAnswer;", "z0", "([Ljava/util/List;)Ljava/util/List;", "resultPath", "pathArray", "b1", "(Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "N0", "Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;", "answerSheetBundle", "H", "(Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;)Z", "s", "index", "q", "Lb7/c1;", "result", "Lkotlin/Function0;", "callback", "G", "(Lb7/c1;Lkotlin/jvm/functions/Function0;)V", "failedCallback", "r", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "R0", "(Lkotlin/jvm/functions/Function0;)V", "Q0", "Lx6/d;", "newList", "U0", "(Ljava/util/List;)V", "optionIndex", "G0", "(II)V", "correctQuestionList", "g1", "H0", "C0", "()Z", "Lp5/j;", "Lp5/k;", "t", "Lkotlinx/coroutines/flow/MutableStateFlow;", "u", "Lcom/zykj/evaluation/upload/OssTaskManger;", "v", "Lcom/zykj/evaluation/submit/SubmitTaskManger;", "w", "Lcom/zykj/evaluation/di/AppDatabase;", "Lx6/b;", "<set-?>", "x", "Landroidx/compose/runtime/MutableState;", "J0", "()Lx6/b;", "c1", "(Lx6/b;)V", "correctDataState", "y", "Lkotlin/properties/ReadWriteProperty;", "M0", "()I", "e1", "serialNum", "z", "Lcom/zykj/evaluation/bean/PaperConfig;", "paperConfig", "Lorg/json/JSONObject;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lorg/json/JSONObject;", "paperConfigJson", "B", "Ljava/lang/String;", "paperConfigString", "C", "a1", "d1", "(Z)V", "isNewConfig", "D", "[B", "tfLiteBuffer", ExifInterface.LONGITUDE_EAST, "[Lx6/j;", "pageAnswerData", "F", "[Ljava/util/List;", "answerInfoArray", "pageAnswerArray", "", "Lx6/m;", "Ljava/util/Map;", "uploadAnswerMap", "I", "Z", "hasOldData", "J", "isRetakePhoto", "Lcom/zykj/evaluation/bean/PaperPage;", "L0", "()Lcom/zykj/evaluation/bean/PaperPage;", "currentPageConfig", "K0", "()Lx6/j;", "currentPageAnswerData", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nNormalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NormalViewModel.kt\ncom/zykj/evaluation/ui/sheet/normal/NormalViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1441:1\n85#2:1442\n113#2,2:1443\n1878#3,2:1445\n1878#3,2:1447\n1869#3,2:1449\n1869#3,2:1451\n1880#3:1453\n1880#3:1454\n1869#3:1461\n1869#3,2:1462\n1870#3:1464\n1193#3,2:1466\n1267#3,4:1468\n1869#3:1474\n1869#3:1475\n295#3,2:1476\n295#3,2:1478\n1870#3:1487\n1870#3:1488\n1563#3:1508\n1634#3,3:1509\n1869#3:1512\n1740#3,3:1513\n1563#3:1516\n1634#3,3:1517\n1870#3:1524\n1869#3:1525\n1869#3,2:1526\n1761#3,3:1528\n1870#3:1531\n774#3:1532\n865#3,2:1533\n1563#3:1535\n1634#3,3:1536\n1869#3,2:1539\n1573#3:1541\n1604#3,3:1542\n1563#3:1545\n1634#3,3:1546\n1607#3:1549\n1563#3:1550\n1634#3,2:1551\n774#3:1553\n865#3,2:1554\n1563#3:1556\n1634#3,2:1557\n295#3,2:1559\n1869#3,2:1561\n1636#3:1563\n1636#3:1564\n1563#3:1566\n1634#3,3:1567\n1869#3:1570\n1869#3,2:1571\n1869#3,2:1573\n1869#3,2:1575\n1870#3:1577\n1374#3:1578\n1460#3,5:1579\n1208#3,2:1584\n1236#3,4:1586\n1869#3:1590\n1869#3:1591\n295#3,2:1592\n1870#3:1594\n1870#3:1595\n1878#3,2:1596\n1878#3,3:1598\n1880#3:1601\n1869#3:1602\n1869#3:1603\n1870#3:1608\n1870#3:1609\n1869#3:1611\n295#3,2:1612\n1869#3:1614\n295#3,2:1615\n1870#3:1617\n1870#3:1618\n1491#3:1622\n1516#3,3:1623\n1519#3,3:1633\n1761#3,3:1637\n37#4:1455\n36#4,3:1456\n37#4:1520\n36#4,3:1521\n13537#5,2:1459\n13539#5:1465\n13537#5,2:1472\n13539#5:1489\n1790#5,6:1490\n1682#5,6:1496\n1790#5,6:1502\n11308#5:1604\n11643#5,3:1605\n13472#5:1610\n13473#5:1619\n13537#5,2:1620\n13539#5:1641\n382#6,7:1480\n382#6,7:1626\n1#7:1565\n216#8:1636\n217#8:1640\n*S KotlinDebug\n*F\n+ 1 NormalViewModel.kt\ncom/zykj/evaluation/ui/sheet/normal/NormalViewModel\n*L\n154#1:1442\n154#1:1443,2\n305#1:1445,2\n310#1:1447,2\n320#1:1449,2\n339#1:1451,2\n310#1:1453\n305#1:1454\n451#1:1461\n457#1:1462,2\n451#1:1464\n489#1:1466,2\n489#1:1468,4\n494#1:1474\n495#1:1475\n499#1:1476,2\n501#1:1478,2\n495#1:1487\n494#1:1488\n576#1:1508\n576#1:1509,3\n655#1:1512\n659#1:1513,3\n667#1:1516\n667#1:1517,3\n655#1:1524\n700#1:1525\n701#1:1526,2\n706#1:1528,3\n700#1:1531\n864#1:1532\n864#1:1533,2\n867#1:1535\n867#1:1536,3\n872#1:1539,2\n894#1:1541\n894#1:1542,3\n897#1:1545\n897#1:1546,3\n894#1:1549\n924#1:1550\n924#1:1551,2\n925#1:1553\n925#1:1554,2\n928#1:1556\n928#1:1557,2\n929#1:1559,2\n932#1:1561,2\n928#1:1563\n924#1:1564\n1047#1:1566\n1047#1:1567,3\n1076#1:1570\n1080#1:1571,2\n1094#1:1573,2\n1105#1:1575,2\n1076#1:1577\n1139#1:1578\n1139#1:1579,5\n1139#1:1584,2\n1139#1:1586,4\n1185#1:1590\n1186#1:1591\n1190#1:1592,2\n1186#1:1594\n1185#1:1595\n1218#1:1596,2\n1221#1:1598,3\n1218#1:1601\n1271#1:1602\n1275#1:1603\n1275#1:1608\n1271#1:1609\n1341#1:1611\n1343#1:1612,2\n1353#1:1614\n1355#1:1615,2\n1353#1:1617\n1341#1:1618\n1423#1:1622\n1423#1:1623,3\n1423#1:1633,3\n1429#1:1637,3\n392#1:1455\n392#1:1456,3\n667#1:1520\n667#1:1521,3\n450#1:1459,2\n450#1:1465\n493#1:1472,2\n493#1:1489\n553#1:1490,6\n566#1:1496,6\n567#1:1502,6\n1313#1:1604\n1313#1:1605,3\n1340#1:1610\n1340#1:1619\n1422#1:1620,2\n1422#1:1641\n519#1:1480,7\n1423#1:1626,7\n1426#1:1636\n1426#1:1640\n*E\n"})
/* loaded from: classes4.dex */
public class NormalViewModel extends AnswerSheetViewModel {

    /* renamed from: K */
    public static final /* synthetic */ KProperty[] f9990K = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(NormalViewModel.class, "serialNum", "getSerialNum()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(NormalViewModel.class, "isNewConfig", "isNewConfig()Z", 0))};

    /* renamed from: L */
    public static final int f9991L = 8;

    /* renamed from: A, reason: from kotlin metadata */
    public JSONObject paperConfigJson;

    /* renamed from: B, reason: from kotlin metadata */
    public String paperConfigString;

    /* renamed from: C, reason: from kotlin metadata */
    public final ReadWriteProperty isNewConfig;

    /* renamed from: D, reason: from kotlin metadata */
    public byte[] tfLiteBuffer;

    /* renamed from: E, reason: from kotlin metadata */
    public C9867j[] pageAnswerData;

    /* renamed from: F, reason: from kotlin metadata */
    public List[] answerInfoArray;

    /* renamed from: G, reason: from kotlin metadata */
    public List[] pageAnswerArray;

    /* renamed from: H, reason: from kotlin metadata */
    public final Map uploadAnswerMap;

    /* renamed from: I, reason: from kotlin metadata */
    public boolean hasOldData;

    /* renamed from: J, reason: from kotlin metadata */
    public boolean isRetakePhoto;

    /* renamed from: r, reason: from kotlin metadata */
    public final InterfaceC8843j service;

    /* renamed from: s, reason: from kotlin metadata */
    public final InterfaceC8844k configService;

    /* renamed from: t, reason: from kotlin metadata */
    public final MutableStateFlow userInfo;

    /* renamed from: u, reason: from kotlin metadata */
    public final OssTaskManger ossTaskManger;

    /* renamed from: v, reason: from kotlin metadata */
    public final SubmitTaskManger submitTaskManger;

    /* renamed from: w, reason: from kotlin metadata */
    public final AppDatabase database;

    /* renamed from: x, reason: from kotlin metadata */
    public final MutableState correctDataState;

    /* renamed from: y, reason: from kotlin metadata */
    public final ReadWriteProperty serialNum;

    /* renamed from: z, reason: from kotlin metadata */
    public PaperConfig paperConfig;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalViewModel(InterfaceC8843j service, InterfaceC8844k configService, MutableStateFlow userInfo, OssTaskManger ossTaskManger, SubmitTaskManger submitTaskManger, AppDatabase database) {
        super(userInfo, ossTaskManger);
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(ossTaskManger, "ossTaskManger");
        Intrinsics.checkNotNullParameter(submitTaskManger, "submitTaskManger");
        Intrinsics.checkNotNullParameter(database, "database");
        this.service = service;
        this.configService = configService;
        this.userInfo = userInfo;
        this.ossTaskManger = ossTaskManger;
        this.submitTaskManger = submitTaskManger;
        this.database = database;
        this.correctDataState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new C9859b(null, 1, null), null, 2, null);
        Delegates delegates = Delegates.INSTANCE;
        this.serialNum = delegates.notNull();
        this.paperConfigString = "";
        this.isNewConfig = delegates.notNull();
        this.uploadAnswerMap = new LinkedHashMap();
    }

    /* renamed from: A0 */
    public static /* synthetic */ List m10231A0(NormalViewModel normalViewModel, List[] listArr, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildCommitList");
        }
        if ((i10 & 1) != 0 && (listArr = normalViewModel.pageAnswerArray) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageAnswerArray");
            listArr = null;
        }
        return normalViewModel.m10293z0(listArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r5.m10291i1(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: I0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object m10232I0(com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel$doSomethingBeforeChangeIndex$1
            if (r0 == 0) goto L13
            r0 = r6
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel$doSomethingBeforeChangeIndex$1 r0 = (com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel$doSomethingBeforeChangeIndex$1) r0
            int r1 = r0.f10038d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10038d = r1
            goto L18
        L13:
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel$doSomethingBeforeChangeIndex$1 r0 = new com.zykj.evaluation.ui.sheet.normal.NormalViewModel$doSomethingBeforeChangeIndex$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f10036b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f10038d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.f10035a
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r5 = (com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L6d
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.Object r5 = r0.f10035a
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r5 = (com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L5e
        L40:
            kotlin.ResultKt.throwOnFailure(r6)
            com.zykj.evaluation.ui.sheet.a r6 = r5.m10176D()
            com.zykj.evaluation.ui.sheet.b r6 = r6.m10214g()
            com.zykj.evaluation.ui.sheet.b$d r2 = com.zykj.evaluation.p057ui.sheet.AbstractC6934b.d.f9957b
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r2)
            if (r6 == 0) goto L5e
            r0.f10035a = r5
            r0.f10038d = r4
            java.lang.Object r6 = r5.m10266H0(r0)
            if (r6 != r1) goto L5e
            goto L6c
        L5e:
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r0.f10035a = r6
            r0.f10038d = r3
            java.lang.Object r5 = r5.m10291i1(r0)
            if (r5 != r1) goto L6d
        L6c:
            return r1
        L6d:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10232I0(com.zykj.evaluation.ui.sheet.normal.NormalViewModel, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/sheet/normal/NormalViewModel.smali:547
    }

    /* renamed from: h1 */
    public static /* synthetic */ void m10243h1(NormalViewModel normalViewModel, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateQuestionAnswer");
        }
        if ((i10 & 1) != 0) {
            list = normalViewModel.m10267J0().m16523b();
        }
        normalViewModel.m10290g1(list);
    }

    /* renamed from: B0 */
    public final List m10260B0(C9867j pageQuestionAnswerData) {
        List<PaperQuestion> questions;
        List<PaperHand> items;
        ArrayList arrayList = new ArrayList();
        PaperPage paperPageM10269L0 = m10269L0();
        if (paperPageM10269L0 != null && (questions = paperPageM10269L0.getQuestions()) != null) {
            int i10 = 0;
            for (PaperQuestion paperQuestion : questions) {
                ArrayList arrayList2 = new ArrayList();
                if (AbstractC9708y.m16220e(paperQuestion)) {
                    List<PaperSelect> selects = paperQuestion.getSelects();
                    if (selects != null) {
                        for (PaperSelect paperSelect : selects) {
                            String uuid = paperSelect.getUuid();
                            String str = pageQuestionAnswerData.m16545d()[i10];
                            if (str == null) {
                                str = "";
                            }
                            arrayList2.add(new AnswerData(uuid, str, paperSelect, paperSelect.getOrder(), null, 16, null));
                            i10++;
                        }
                    }
                } else if (AbstractC9708y.m16218c(paperQuestion)) {
                    List<PaperBlank> blanks = paperQuestion.getBlanks();
                    if (blanks != null) {
                        for (PaperBlank paperBlank : blanks) {
                            arrayList2.add(new AnswerData(paperBlank.getUuid(), null, null, 0, paperBlank, 14, null));
                        }
                    }
                } else if (AbstractC9708y.m16219d(paperQuestion) && (items = paperQuestion.getItems()) != null) {
                    Iterator<T> it = items.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new AnswerData(((PaperHand) it.next()).getUuid(), null, null, 0, null, 30, null));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new AnswerCorrectData(paperQuestion.getId(), arrayList2, paperQuestion.getPosition(), paperQuestion.getGroupKey(), paperQuestion.getType(), paperQuestion.getNumericalOrder()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: C0 */
    public final boolean m10261C0() {
        List[] listArr = this.answerInfoArray;
        if (listArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("answerInfoArray");
            listArr = null;
        }
        int length = listArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            List list = listArr[i10];
            int i12 = i11 + 1;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                String groupKey = ((AnswerCorrectData) obj).getGroupKey();
                Object arrayList = linkedHashMap.get(groupKey);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(groupKey, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                List listM16217b = AbstractC9708y.m16217b((List) ((Map.Entry) it.next()).getValue());
                if (listM16217b == null || !listM16217b.isEmpty()) {
                    Iterator it2 = listM16217b.iterator();
                    while (it2.hasNext()) {
                        if (((C9861d) it2.next()).m16536h()) {
                            m10198o(i11);
                            m10278U0(listM16217b);
                            return true;
                        }
                    }
                }
            }
            i10++;
            i11 = i12;
        }
        return false;
    }

    /* renamed from: D0 */
    public final void m10262D0() {
        boolean z9 = FileUtils.isFileExists(m10205x().m12456b(m10270M0())) && FileUtils.isFileExists(m10205x().m12458d(m10270M0()));
        this.hasOldData = z9;
        if (z9) {
            return;
        }
        FileUtils.deleteAllInDir(m10205x().m12460f(m10270M0()));
    }

    /* renamed from: E0 */
    public final void m10263E0(int pageSize) {
        Object[] objArrCopyOf = Arrays.copyOf(getMPicArray(), pageSize);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        m10191S((String[]) objArrCopyOf);
        if (this.hasOldData) {
            String[] mPicArray = getMPicArray();
            int length = mPicArray.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    String str = mPicArray[length];
                    if (!(str == null || str.length() == 0)) {
                        break;
                    } else if (i10 < 0) {
                        break;
                    } else {
                        length = i10;
                    }
                }
            } else {
                length = -1;
            }
            if (length != -1) {
                for (int i11 = 0; i11 < length; i11++) {
                    if (getMPicArray()[i11] == null) {
                        getMPicArray()[i11] = "";
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: F0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10264F0(android.graphics.Bitmap r18, java.util.List r19, android.graphics.Bitmap r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10264F0(android.graphics.Bitmap, java.util.List, android.graphics.Bitmap, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/sheet/normal/NormalViewModel.smali:2314
    }

    @Override // com.zykj.evaluation.p057ui.sheet.AnswerSheetViewModel
    /* renamed from: G */
    public void mo10179G(C4997c1 result, Function0 callback) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(callback, "callback");
        super.mo10179G(result, callback);
        BaseViewModel.m8644f(this, null, null, null, null, null, new NormalViewModel$handleSuccessScanned$1(this, result, callback, null), 31, null);
    }

    /* renamed from: G0 */
    public final void m10265G0(int questionIndex, int optionIndex) {
        C9861d c9861d = (C9861d) m10267J0().m16523b().get(questionIndex);
        C9860c c9860c = (C9860c) c9861d.m16533e().get(optionIndex);
        if (c9861d.m16537i()) {
            if (c9860c.m16528d() instanceof AbstractC9694l0.b) {
                m10289f1(questionIndex, "");
                return;
            } else {
                m10289f1(questionIndex, c9860c.m16527c());
                return;
            }
        }
        List listM16533e = c9861d.m16533e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM16533e) {
            if (((C9860c) obj).m16528d() instanceof AbstractC9694l0.b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        boolean z9 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            arrayList2.add(((C9860c) obj2).m16527c());
        }
        StringBuilder sb = new StringBuilder();
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj3 = arrayList2.get(i11);
            i11++;
            String str = (String) obj3;
            if (Intrinsics.areEqual(str, c9860c.m16527c())) {
                z9 = true;
            } else {
                sb.append(str);
            }
        }
        if (!z9) {
            sb.append(c9860c.m16527c());
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        m10289f1(questionIndex, string);
    }

    @Override // com.zykj.evaluation.p057ui.sheet.AnswerSheetViewModel
    /* renamed from: H */
    public boolean mo10180H(AnswerSheetBundle answerSheetBundle) {
        Intrinsics.checkNotNullParameter(answerSheetBundle, "answerSheetBundle");
        if (!super.mo10180H(answerSheetBundle)) {
            return false;
        }
        m10192T(1.4540637f);
        m10288e1(answerSheetBundle.getSerialNum());
        m10262D0();
        m10282Y0();
        BaseViewModel.m8644f(this, null, null, null, null, null, new NormalViewModel$initData$1(this, answerSheetBundle, null), 31, null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r10v4, types: [T, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.util.Set] */
    /* renamed from: H0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10266H0(kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10266H0(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/sheet/normal/NormalViewModel.smali:3389
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: J0 */
    public final C9859b m10267J0() {
        return (C9859b) this.correctDataState.getValue();
    }

    /* renamed from: K0 */
    public final C9867j m10268K0() {
        C9867j[] c9867jArr = this.pageAnswerData;
        if (c9867jArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageAnswerData");
            c9867jArr = null;
        }
        return c9867jArr[m10203v()];
    }

    /* renamed from: L0 */
    public final PaperPage m10269L0() {
        List<PaperPage> pages;
        PaperConfig paperConfig = this.paperConfig;
        if (paperConfig == null || (pages = paperConfig.getPages()) == null) {
            return null;
        }
        return (PaperPage) CollectionsKt.getOrNull(pages, m10203v());
    }

    /* renamed from: M0 */
    public final int m10270M0() {
        return ((Number) this.serialNum.getValue(this, f9990K[0])).intValue();
    }

    /* renamed from: N0 */
    public final Object m10271N0(Continuation continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new NormalViewModel$getTFModelBuffer$2(null), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:42:0x0220, B:49:0x0253], limit reached: 56 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Iterable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00c1 -> B:19:0x00e0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0110 -> B:51:0x0271). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x01c0 -> B:12:0x0090). Please report as a decompilation issue!!! */
    /* renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10272O0(java.util.Set r25, int r26, p287x6.C9867j r27, java.util.Map r28, kotlin.coroutines.Continuation r29) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10272O0(java.util.Set, int, x6.j, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/sheet/normal/NormalViewModel.smali:4726
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: P0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10273P0(android.graphics.Bitmap r22, java.util.List r23, android.graphics.Bitmap r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10273P0(android.graphics.Bitmap, java.util.List, android.graphics.Bitmap, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/sheet/normal/NormalViewModel.smali:6162
    }

    /* renamed from: Q0 */
    public final void m10274Q0(Function0 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseViewModel.m8644f(this, null, null, null, null, null, new NormalViewModel$ignorePageError$1(this, callback, null), 31, null);
    }

    /* renamed from: R0 */
    public final void m10275R0(Function0 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseViewModel.m8644f(this, null, null, null, null, null, new NormalViewModel$ignoreSerialNumError$1(this, callback, null), 31, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* renamed from: S0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10276S0(int r4) {
        /*
            r3 = this;
            g7.e r0 = r3.m10205x()
            int r1 = r3.m10270M0()
            java.lang.String r0 = r0.m12456b(r1)
            boolean r1 = r3.hasOldData
            r2 = 0
            if (r1 == 0) goto L56
            boolean r1 = com.blankj.utilcode.util.FileUtils.isFileExists(r0)
            if (r1 == 0) goto L56
            java.lang.String r0 = com.blankj.utilcode.util.FileIOUtils.readFile2String(r0)
            if (r0 == 0) goto L49
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L33
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel$initAnswerInfoArray$1$1$1 r1 = new com.zykj.evaluation.ui.sheet.normal.NormalViewModel$initAnswerInfoArray$1$1$1     // Catch: java.lang.Throwable -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.reflect.Type r1 = r1.getType()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r0 = com.blankj.utilcode.util.GsonUtils.fromJson(r0, r1)     // Catch: java.lang.Throwable -> L33
            java.util.List[] r0 = (java.util.List[]) r0     // Catch: java.lang.Throwable -> L33
            java.lang.Object r0 = kotlin.Result.m24299constructorimpl(r0)     // Catch: java.lang.Throwable -> L33
            goto L3e
        L33:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m24299constructorimpl(r0)
        L3e:
            boolean r1 = kotlin.Result.m24305isFailureimpl(r0)
            if (r1 == 0) goto L45
            r0 = 0
        L45:
            java.util.List[] r0 = (java.util.List[]) r0
            if (r0 != 0) goto L63
        L49:
            java.util.List[] r0 = new java.util.List[r4]
        L4b:
            if (r2 >= r4) goto L63
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r0[r2] = r1
            int r2 = r2 + 1
            goto L4b
        L56:
            java.util.List[] r0 = new java.util.List[r4]
        L58:
            if (r2 >= r4) goto L63
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r0[r2] = r1
            int r2 = r2 + 1
            goto L58
        L63:
            r3.answerInfoArray = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10276S0(int):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/sheet/normal/NormalViewModel.smali:7057
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011b  */
    /* renamed from: T0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10277T0(com.zykj.evaluation.bean.PaperConfig r27) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10277T0(com.zykj.evaluation.bean.PaperConfig):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/sheet/normal/NormalViewModel.smali:7282
    }

    /* renamed from: U0 */
    public final void m10278U0(List newList) {
        Intrinsics.checkNotNullParameter(newList, "newList");
        m10286c1(m10267J0().m16522a(newList));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* renamed from: V0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10279V0(int r14) {
        /*
            r13 = this;
            g7.e r0 = r13.m10205x()
            int r1 = r13.m10270M0()
            java.lang.String r0 = r0.m12458d(r1)
            boolean r1 = r13.hasOldData
            r2 = 0
            if (r1 == 0) goto L57
            boolean r1 = com.blankj.utilcode.util.FileUtils.isFileExists(r0)
            if (r1 == 0) goto L57
            java.lang.String r0 = com.blankj.utilcode.util.FileIOUtils.readFile2String(r0)
            if (r0 == 0) goto L49
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L33
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel$initPageAnswerArray$1$1$1 r1 = new com.zykj.evaluation.ui.sheet.normal.NormalViewModel$initPageAnswerArray$1$1$1     // Catch: java.lang.Throwable -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.reflect.Type r1 = r1.getType()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r0 = com.blankj.utilcode.util.GsonUtils.fromJson(r0, r1)     // Catch: java.lang.Throwable -> L33
            java.util.List[] r0 = (java.util.List[]) r0     // Catch: java.lang.Throwable -> L33
            java.lang.Object r0 = kotlin.Result.m24299constructorimpl(r0)     // Catch: java.lang.Throwable -> L33
            goto L3e
        L33:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m24299constructorimpl(r0)
        L3e:
            boolean r1 = kotlin.Result.m24305isFailureimpl(r0)
            if (r1 == 0) goto L45
            r0 = 0
        L45:
            java.util.List[] r0 = (java.util.List[]) r0
            if (r0 != 0) goto L65
        L49:
            java.util.List[] r0 = new java.util.List[r14]
            r1 = r2
        L4c:
            if (r1 >= r14) goto L65
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            r0[r1] = r3
            int r1 = r1 + 1
            goto L4c
        L57:
            java.util.List[] r0 = new java.util.List[r14]
            r1 = r2
        L5a:
            if (r1 >= r14) goto L65
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            r0[r1] = r3
            int r1 = r1 + 1
            goto L5a
        L65:
            r13.pageAnswerArray = r0
            int r14 = r0.length
            r1 = r2
            r3 = r1
        L6a:
            if (r1 >= r14) goto Le3
            r4 = r0[r1]
            int r5 = r3 + 1
            java.util.Iterator r4 = r4.iterator()
        L74:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Ldf
            java.lang.Object r6 = r4.next()
            x6.k r6 = (p287x6.QuestionAnswerInfo) r6
            long r7 = r6.getQuestionId()
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            java.lang.String r8 = ""
            if (r7 != 0) goto L93
            java.lang.String[] r6 = r13.getMPicArray()
            r6[r3] = r8
            goto L74
        L93:
            java.util.ArrayList r6 = r6.getAnswerList()
            int r7 = r6.size()
            r9 = r2
        L9c:
            if (r9 >= r7) goto L74
            java.lang.Object r10 = r6.get(r9)
            int r9 = r9 + 1
            x6.a r10 = (p287x6.AnswerInfo) r10
            boolean r11 = r10.m16520g()
            if (r11 == 0) goto L9c
            java.util.List r11 = r10.getLocalAnswer()
            java.lang.Object r11 = kotlin.collections.CollectionsKt.firstOrNull(r11)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto Lc9
            boolean r11 = com.blankj.utilcode.util.FileUtils.isFileExists(r11)
            if (r11 != 0) goto Lc5
            java.util.List r12 = kotlin.collections.CollectionsKt.emptyList()
            r10.m16521h(r12)
        Lc5:
            r10 = 1
            if (r11 != r10) goto Lc9
            goto L9c
        Lc9:
            java.lang.String[] r10 = r13.getMPicArray()
            r10 = r10[r3]
            if (r10 == 0) goto L9c
            int r10 = r10.length()
            if (r10 != 0) goto Ld8
            goto L9c
        Ld8:
            java.lang.String[] r10 = r13.getMPicArray()
            r10[r3] = r8
            goto L9c
        Ldf:
            int r1 = r1 + 1
            r3 = r5
            goto L6a
        Le3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10279V0(int):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/sheet/normal/NormalViewModel.smali:8032
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9 A[PHI: r9 r10 r11
      0x00b9: PHI (r9v30 com.zykj.evaluation.ui.sheet.normal.NormalViewModel) = 
      (r9v10 com.zykj.evaluation.ui.sheet.normal.NormalViewModel)
      (r9v31 com.zykj.evaluation.ui.sheet.normal.NormalViewModel)
     binds: [B:40:0x00b6, B:50:0x00e5] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r10v15 java.lang.String) = (r10v6 java.lang.String), (r10v16 java.lang.String) binds: [B:40:0x00b6, B:50:0x00e5] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r11v12 java.lang.String) = (r11v7 java.lang.String), (r11v15 java.lang.String) binds: [B:40:0x00b6, B:50:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: W0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10280W0(java.lang.String r9, long r10, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10280W0(java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/sheet/normal/NormalViewModel.smali:8533
    }

    /* renamed from: X0 */
    public final void m10281X0(int pageSize) {
        Bitmap bitmapM10204w;
        String[] mPicArray = getMPicArray();
        int length = mPicArray.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            String str = mPicArray[i10];
            if (str != null && str.length() == 0) {
                break;
            } else {
                i10++;
            }
        }
        String[] mPicArray2 = getMPicArray();
        int length2 = mPicArray2.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i11 = length2 - 1;
                String str2 = mPicArray2[length2];
                if (!(str2 == null || str2.length() == 0)) {
                    break;
                } else if (i11 < 0) {
                    break;
                } else {
                    length2 = i11;
                }
            }
            length2 = -1;
        } else {
            length2 = -1;
        }
        if (i10 == -1) {
            i10 = length2 != -1 ? length2 : 0;
        }
        IntRange intRangeUntil = RangesKt.until(0, pageSize);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            String str3 = getMPicArray()[iNextInt];
            arrayList.add(new C9709z(iNextInt, iNextInt == i10 ? (str3 == null || str3.length() != 0) ? AbstractC6935c.a.b.f9962d : AbstractC6935c.a.C10139a.f9961d : str3 == null ? AbstractC6935c.c.f9965d : str3.length() == 0 ? AbstractC6935c.b.a.f9963d : AbstractC6935c.b.C10140b.f9964d));
        }
        String str4 = getMPicArray()[i10];
        if (str4 == null || (bitmapM10204w = BitmapFactory.decodeFile(str4)) == null) {
            bitmapM10204w = m10204w();
        }
        Bitmap bitmap = bitmapM10204w;
        List[] listArr = this.answerInfoArray;
        if (listArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("answerInfoArray");
            listArr = null;
        }
        List list = listArr[i10];
        AbstractC6935c abstractC6935cM16226d = ((C9709z) arrayList.get(i10)).m16226d();
        m10196X(C6933a.m10208b(m10176D(), bitmap, list, null, Intrinsics.areEqual(abstractC6935cM16226d, AbstractC6935c.a.b.f9962d) ? AbstractC6934b.d.f9957b : Intrinsics.areEqual(abstractC6935cM16226d, AbstractC6935c.a.C10139a.f9961d) ? AbstractC6934b.b.f9953b : AbstractC6934b.a.f9952b, arrayList, m10182J(), 4, null));
    }

    /* renamed from: Y0 */
    public final void m10282Y0() {
        if (this.hasOldData) {
            int length = getMPicArray().length;
            for (int i10 = 0; i10 < length; i10++) {
                String strM12461g = m10205x().m12461g(m10270M0(), i10);
                if (FileUtils.isFileExists(strM12461g)) {
                    getMPicArray()[i10] = strM12461g;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e5  */
    /* renamed from: Z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10283Z0(kotlin.coroutines.Continuation r29) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10283Z0(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/sheet/normal/NormalViewModel.smali:9876
    }

    /* renamed from: a1 */
    public final boolean m10284a1() {
        return ((Boolean) this.isNewConfig.getValue(this, f9990K[1])).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10285b1(java.lang.String r7, java.lang.String[] r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel$mergeBitmap$1
            if (r0 == 0) goto L13
            r0 = r9
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel$mergeBitmap$1 r0 = (com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel$mergeBitmap$1) r0
            int r1 = r0.f10126f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10126f = r1
            goto L18
        L13:
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel$mergeBitmap$1 r0 = new com.zykj.evaluation.ui.sheet.normal.NormalViewModel$mergeBitmap$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f10124d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f10126f
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.f10123c
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            java.lang.Object r7 = r0.f10122b
            java.lang.String[] r7 = (java.lang.String[]) r7
            java.lang.Object r7 = r0.f10121a
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r9)
            return r7
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            kotlin.ResultKt.throwOnFailure(r9)
            g7.a r9 = p101g7.C7585a.f12711a
            int r2 = r8.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r8, r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            android.graphics.Bitmap r9 = r9.m12445f(r2)
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getIO()
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel$mergeBitmap$2 r4 = new com.zykj.evaluation.ui.sheet.normal.NormalViewModel$mergeBitmap$2
            r5 = 0
            r4.<init>(r9, r7, r5)
            r0.f10121a = r7
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r0.f10122b = r8
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r0.f10123c = r8
            r0.f10126f = r3
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r2, r4, r0)
            if (r8 != r1) goto L6e
            return r1
        L6e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10285b1(java.lang.String, java.lang.String[], kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/sheet/normal/NormalViewModel.smali:11148
    }

    /* renamed from: c1 */
    public final void m10286c1(C9859b c9859b) {
        Intrinsics.checkNotNullParameter(c9859b, "<set-?>");
        this.correctDataState.setValue(c9859b);
    }

    /* renamed from: d1 */
    public final void m10287d1(boolean z9) {
        this.isNewConfig.setValue(this, f9990K[1], Boolean.valueOf(z9));
    }

    /* renamed from: e1 */
    public final void m10288e1(int i10) {
        this.serialNum.setValue(this, f9990K[0], Integer.valueOf(i10));
    }

    /* renamed from: f1 */
    public final void m10289f1(int questionIndex, String newAnswer) {
        C9861d c9861dM16529b;
        C9859b c9859bM10267J0 = m10267J0();
        List listM16523b = m10267J0().m16523b();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM16523b, 10));
        int i10 = 0;
        for (Object obj : listM16523b) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C9861d c9861d = (C9861d) obj;
            if (i10 == questionIndex) {
                List<C9860c> listM16533e = c9861d.m16533e();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM16533e, 10));
                for (C9860c c9860c : listM16533e) {
                    arrayList2.add(C9860c.m16525b(c9860c, null, StringsKt.contains$default((CharSequence) newAnswer, (CharSequence) c9860c.m16527c(), false, 2, (Object) null) ? AbstractC9694l0.b.f17006c : AbstractC9694l0.a.f17005c, 1, null));
                }
                c9861dM16529b = C9861d.m16529b(c9861d, false, 0, 0, false, arrayList2, 0L, null, 111, null);
            } else {
                c9861dM16529b = C9861d.m16529b(c9861d, false, 0, 0, false, null, 0L, null, 127, null);
            }
            arrayList.add(c9861dM16529b);
            i10 = i11;
        }
        m10286c1(c9859bM10267J0.m16522a(arrayList));
    }

    /* renamed from: g1 */
    public final void m10290g1(List correctQuestionList) {
        AnswerCorrectData answerCorrectDataM11801b;
        Object obj;
        AnswerData answerDataM11820b;
        Intrinsics.checkNotNullParameter(correctQuestionList, "correctQuestionList");
        C6933a c6933aM10176D = m10176D();
        List<AnswerCorrectData> listM10210c = m10176D().m10210c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM10210c, 10));
        for (AnswerCorrectData answerCorrectData : listM10210c) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : correctQuestionList) {
                if (((C9861d) obj2).m16534f() == answerCorrectData.getQuestionId()) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.isEmpty()) {
                answerCorrectDataM11801b = AnswerCorrectData.m11801b(answerCorrectData, 0L, null, null, null, 0, 0, 63, null);
            } else {
                List<AnswerData> answerData = answerCorrectData.getAnswerData();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(answerData, 10));
                for (AnswerData answerData2 : answerData) {
                    int size = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            obj = null;
                            break;
                        }
                        obj = arrayList2.get(i10);
                        i10++;
                        if (Intrinsics.areEqual(((C9861d) obj).m16535g(), answerData2.getUuid())) {
                            break;
                        }
                    }
                    C9861d c9861d = (C9861d) obj;
                    if (c9861d != null) {
                        StringBuilder sb = new StringBuilder();
                        for (C9860c c9860c : c9861d.m16533e()) {
                            if (c9860c.m16528d() instanceof AbstractC9694l0.b) {
                                sb.append(c9860c.m16527c());
                            }
                        }
                        String string = sb.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        answerDataM11820b = AnswerData.m11820b(answerData2, null, string, null, 0, null, 29, null);
                    } else {
                        answerDataM11820b = AnswerData.m11820b(answerData2, null, null, null, 0, null, 31, null);
                    }
                    arrayList3.add(answerDataM11820b);
                }
                answerCorrectDataM11801b = AnswerCorrectData.m11801b(answerCorrectData, 0L, arrayList3, null, null, 0, 0, 61, null);
            }
            arrayList.add(answerCorrectDataM11801b);
        }
        m10196X(C6933a.m10208b(c6933aM10176D, null, arrayList, null, null, null, false, 61, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        r11 = m10205x().m12457c(m10270M0(), r8.m16555b(), -1, -1);
        r12 = r8.m16554a();
        r13 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(r12, 10));
        r12 = r12.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
    
        if (r12.hasNext() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dc, code lost:
    
        r13.add(((p287x6.C9869l) r12.next()).m16551b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ea, code lost:
    
        r12 = (java.lang.String[]) r13.toArray(new java.lang.String[0]);
        r12 = (java.lang.String[]) java.util.Arrays.copyOf(r12, r12.length);
        r2.f10130a = r15;
        r2.f10131b = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10);
        r2.f10132c = r9;
        r2.f10133d = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1);
        r2.f10134e = r8;
        r2.f10135f = r4;
        r2.f10136g = 0;
        r2.f10139j = 1;
        r1 = m10285b1(r11, r12, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0115, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0118, code lost:
    
        r11 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016f, code lost:
    
        if (r9.m10490w(r10, r12, r14, r15, r2) == r3) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0118 -> B:42:0x0119). Please report as a decompilation issue!!! */
    /* renamed from: i1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10291i1(kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10291i1(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/sheet/normal/NormalViewModel.smali:12455
    }

    @Override // com.zykj.evaluation.p057ui.sheet.AnswerSheetViewModel
    /* renamed from: q */
    public void mo10199q(int index) {
        List[] listArr = this.answerInfoArray;
        if (listArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("answerInfoArray");
            listArr = null;
        }
        List list = listArr[index];
        AbstractC6935c abstractC6935cM16226d = ((C9709z) m10176D().m10212e().get(index)).m16226d();
        m10196X(C6933a.m10208b(m10176D(), null, list, null, abstractC6935cM16226d instanceof AbstractC6935c.a.b ? AbstractC6934b.d.f9957b : abstractC6935cM16226d instanceof AbstractC6935c.a.C10139a ? AbstractC6934b.b.f9953b : AbstractC6934b.a.f9952b, null, false, 53, null));
    }

    @Override // com.zykj.evaluation.p057ui.sheet.AnswerSheetViewModel
    /* renamed from: r */
    public void mo10200r(Function0 callback, Function0 failedCallback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(failedCallback, "failedCallback");
        BaseViewModel.m8644f(this, null, null, null, null, null, new NormalViewModel$commit$1(this, failedCallback, callback, null), 31, null);
    }

    @Override // com.zykj.evaluation.p057ui.sheet.AnswerSheetViewModel
    /* renamed from: s */
    public Object mo10201s(Continuation continuation) {
        return m10232I0(this, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dc  */
    /* renamed from: y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Set m10292y0(java.util.List r13, java.util.List r14, java.util.Map r15) {
        /*
            r12 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r14 = r14.iterator()
            r1 = 0
            r2 = r1
        Lb:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto Le6
            java.lang.Object r3 = r14.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto L1c
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L1c:
            e7.b r3 = (p079e7.AnswerCorrectData) r3
            java.lang.Object r2 = kotlin.collections.CollectionsKt.getOrNull(r13, r2)
            e7.b r2 = (p079e7.AnswerCorrectData) r2
            java.util.List r5 = r3.getAnswerData()
            java.util.Iterator r5 = r5.iterator()
            r6 = r1
        L2d:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Le3
            java.lang.Object r7 = r5.next()
            int r8 = r6 + 1
            if (r6 >= 0) goto L3e
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L3e:
            e7.c r7 = (p079e7.AnswerData) r7
            java.lang.String r9 = r7.getUuid()
            java.lang.Object r9 = r15.get(r9)
            x6.a r9 = (p287x6.AnswerInfo) r9
            r10 = 0
            if (r9 == 0) goto L52
            java.util.List r9 = r9.getLocalAnswer()
            goto L53
        L52:
            r9 = r10
        L53:
            if (r9 == 0) goto L63
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L5c
            goto L63
        L5c:
            boolean r9 = r12.isRetakePhoto
            if (r9 == 0) goto L61
            goto L63
        L61:
            r9 = r1
            goto L64
        L63:
            r9 = 1
        L64:
            if (r2 == 0) goto L73
            java.util.List r11 = r2.getAnswerData()
            if (r11 == 0) goto L73
            java.lang.Object r6 = kotlin.collections.CollectionsKt.getOrNull(r11, r6)
            e7.c r6 = (p079e7.AnswerData) r6
            goto L74
        L73:
            r6 = r10
        L74:
            com.zykj.evaluation.bean.PaperSelect r11 = r7.getSelect()
            if (r11 == 0) goto L9e
            if (r9 != 0) goto L96
            com.zykj.evaluation.bean.PaperSelect r9 = r7.getSelect()
            com.zykj.evaluation.bean.PaperPosition r9 = r9.getPosition()
            if (r6 == 0) goto L90
            com.zykj.evaluation.bean.PaperSelect r6 = r6.getSelect()
            if (r6 == 0) goto L90
            com.zykj.evaluation.bean.PaperPosition r10 = r6.getPosition()
        L90:
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r10)
            if (r6 != 0) goto Lc7
        L96:
            java.lang.String r6 = r7.getUuid()
            r0.add(r6)
            goto Lc7
        L9e:
            com.zykj.evaluation.bean.PaperBlank r11 = r7.getBlank()
            if (r11 == 0) goto Lca
            if (r9 != 0) goto Lc0
            com.zykj.evaluation.bean.PaperBlank r9 = r7.getBlank()
            com.zykj.evaluation.bean.PaperPosition r9 = r9.getPosition()
            if (r6 == 0) goto Lba
            com.zykj.evaluation.bean.PaperBlank r6 = r6.getBlank()
            if (r6 == 0) goto Lba
            com.zykj.evaluation.bean.PaperPosition r10 = r6.getPosition()
        Lba:
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r10)
            if (r6 != 0) goto Lc7
        Lc0:
            java.lang.String r6 = r7.getUuid()
            r0.add(r6)
        Lc7:
            r6 = r8
            goto L2d
        Lca:
            if (r9 != 0) goto Ldc
            com.zykj.evaluation.bean.PaperPosition r3 = r3.getPosition()
            if (r2 == 0) goto Ld6
            com.zykj.evaluation.bean.PaperPosition r10 = r2.getPosition()
        Ld6:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r10)
            if (r2 != 0) goto Le3
        Ldc:
            java.lang.String r2 = r7.getUuid()
            r0.add(r2)
        Le3:
            r2 = r4
            goto Lb
        Le6:
            r12.isRetakePhoto = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10292y0(java.util.List, java.util.List, java.util.Map):java.util.Set"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/sheet/normal/NormalViewModel.smali:13467
    }

    /* renamed from: z0 */
    public final List m10293z0(List[] questionAnswerArray) {
        Object obj;
        Object next;
        ArrayList arrayList = new ArrayList();
        for (List<QuestionAnswerInfo> list : questionAnswerArray) {
            for (QuestionAnswerInfo questionAnswerInfo : list) {
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i10);
                    i10++;
                    if (((CommitTaskAnswer) obj).getQuestionId() == questionAnswerInfo.getQuestionId()) {
                        break;
                    }
                }
                CommitTaskAnswer commitTaskAnswer = (CommitTaskAnswer) obj;
                if (commitTaskAnswer == null) {
                    CommitTaskAnswer commitTaskAnswer2 = new CommitTaskAnswer(questionAnswerInfo.getQuestionId(), null, null, 6, null);
                    arrayList.add(commitTaskAnswer2);
                    commitTaskAnswer = commitTaskAnswer2;
                }
                ArrayList answerList = questionAnswerInfo.getAnswerList();
                int size2 = answerList.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = answerList.get(i11);
                    i11++;
                    AnswerInfo answerInfo = (AnswerInfo) obj2;
                    Iterator<T> it = commitTaskAnswer.getAnswers().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.areEqual(((CommitAnswer) next).getUuid(), answerInfo.getUuid())) {
                            break;
                        }
                    }
                    CommitAnswer commitAnswer = (CommitAnswer) next;
                    if (commitAnswer == null) {
                        commitAnswer = new CommitAnswer(answerInfo.getUuid(), null, 2, null);
                        commitTaskAnswer.setAnswers(CollectionsKt.plus((Collection<? extends CommitAnswer>) commitTaskAnswer.getAnswers(), commitAnswer));
                    }
                    if (!answerInfo.m16520g()) {
                        commitAnswer.setAnswers(answerInfo.getLocalAnswer());
                    }
                }
            }
        }
        return arrayList;
    }
}

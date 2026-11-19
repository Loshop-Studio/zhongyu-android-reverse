package com.zykj.evaluation.p057ui.detail;

import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.autofill.HintConstants;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.zykj.evaluation.base.BaseViewModel;
import com.zykj.evaluation.bean.SpecificTrainingType;
import com.zykj.evaluation.bean.TaskDetailInfo;
import com.zykj.evaluation.bean.bundle.DetailBundle;
import com.zykj.evaluation.bean.constant.QuestionResultEnum;
import com.zykj.evaluation.p057ui.detail.AbstractC6899d;
import com.zykj.evaluation.p057ui.detail.AbstractC6901f;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import p089f6.C7459j;
import p101g7.C7589e;
import p200p5.InterfaceC8843j;
import p276w5.C9767e;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b'\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0013\u001a\u00020\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\r0\u0019H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b \u0010!J'\u0010$\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120\"H&¢\u0006\u0004\b$\u0010%J%\u0010'\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00120\"H\u0016¢\u0006\u0004\b'\u0010%J%\u0010(\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00120\"H\u0016¢\u0006\u0004\b(\u0010%J!\u0010-\u001a\u00020\u00122\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J8\u00104\u001a\u00020\u00122'\u0010&\u001a#\b\u0001\u0012\u0004\u0012\u000200\u0012\n\u0012\b\u0012\u0004\u0012\u00020)01\u0012\u0006\u0012\u0004\u0018\u0001020/¢\u0006\u0002\b3H\u0016¢\u0006\u0004\b4\u00105JQ\u0010:\u001a\u00020\u00122B\u0010&\u001a>\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001a0\r¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001a0\r¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020\u00120/¢\u0006\u0004\b:\u00105J\u0015\u0010<\u001a\u00020\u00122\u0006\u0010;\u001a\u00020+¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u00020\u00122\u0006\u0010>\u001a\u00020+¢\u0006\u0004\b?\u0010=J+\u0010A\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00120@¢\u0006\u0004\bA\u0010BJ1\u0010D\u001a\u00020\u00122\b\u0010C\u001a\u0004\u0018\u00010\t2\u0018\u0010&\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\r\u0012\u0004\u0012\u00020\u00120@¢\u0006\u0004\bD\u0010BJ \u0010E\u001a\u00020\u00122\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120\"H\u0084@¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u0012H\u0084@¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020\u0012¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020\u0012¢\u0006\u0004\bK\u0010JJ\r\u0010L\u001a\u00020\u0012¢\u0006\u0004\bL\u0010JJ\u0018\u0010N\u001a\u00020\u00122\u0006\u0010M\u001a\u00020\u000eH\u0084@¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u0012H\u0084@¢\u0006\u0004\bP\u0010HJ&\u0010S\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020\u001a2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001a0\rH\u0084@¢\u0006\u0004\bS\u0010TJ)\u0010Y\u001a\u00020X2\u0006\u0010U\u001a\u00020\u00102\u0006\u0010V\u001a\u00020+2\b\u0010W\u001a\u0004\u0018\u00010+H\u0004¢\u0006\u0004\bY\u0010ZJ!\u0010]\u001a\u00020X2\u0006\u0010[\u001a\u00020\u00102\b\b\u0002\u0010\\\u001a\u00020+H\u0004¢\u0006\u0004\b]\u0010^R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR+\u0010k\u001a\u00020c2\u0006\u0010d\u001a\u00020c8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR+\u0010o\u001a\u00020c2\u0006\u0010d\u001a\u00020c8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bl\u0010f\u001a\u0004\bm\u0010h\"\u0004\bn\u0010jR+\u0010u\u001a\u00020\u001a2\u0006\u0010d\u001a\u00020\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bp\u0010f\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR+\u0010y\u001a\u00020c2\u0006\u0010d\u001a\u00020c8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bv\u0010f\u001a\u0004\bw\u0010h\"\u0004\bx\u0010jR+\u0010\u0080\u0001\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR)\u0010\u0087\u0001\u001a\u00020\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R0\u0010\u008c\u0001\u001a\u00020+2\u0006\u0010d\u001a\u00020+8D@DX\u0084\u008e\u0002¢\u0006\u0016\n\u0005\b\u0088\u0001\u0010f\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0005\b\u008b\u0001\u0010=R0\u0010\u0090\u0001\u001a\u00020+2\u0006\u0010d\u001a\u00020+8D@DX\u0084\u008e\u0002¢\u0006\u0016\n\u0005\b\u008d\u0001\u0010f\u001a\u0006\b\u008e\u0001\u0010\u008a\u0001\"\u0005\b\u008f\u0001\u0010=R'\u0010\u0095\u0001\u001a\u00020\u001a8\u0004@\u0004X\u0084.¢\u0006\u0016\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010r\"\u0005\b\u0094\u0001\u0010tR0\u0010\u0099\u0001\u001a\u00020+2\u0006\u0010d\u001a\u00020+8D@DX\u0084\u008e\u0002¢\u0006\u0016\n\u0005\b\u0096\u0001\u0010f\u001a\u0006\b\u0097\u0001\u0010\u008a\u0001\"\u0005\b\u0098\u0001\u0010=R/\u0010\u009b\u0001\u001a\u00020+2\u0006\u0010d\u001a\u00020+8D@DX\u0084\u008e\u0002¢\u0006\u0015\n\u0004\bK\u0010f\u001a\u0006\b\u0082\u0001\u0010\u008a\u0001\"\u0005\b\u009a\u0001\u0010=R0\u0010\u009e\u0001\u001a\u00020\u00102\u0006\u0010d\u001a\u00020\u00108D@DX\u0084\u008e\u0002¢\u0006\u0016\n\u0004\bE\u0010f\u001a\u0006\b\u009c\u0001\u0010\u0084\u0001\"\u0006\b\u009d\u0001\u0010\u0086\u0001R3\u0010¦\u0001\u001a\u00030\u009f\u00012\b\u0010 \u0001\u001a\u00030\u009f\u00018\u0006@DX\u0086.¢\u0006\u0017\n\u0005\bG\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R3\u0010\u00ad\u0001\u001a\u00030§\u00012\u0007\u0010d\u001a\u00030§\u00018F@DX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b(\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R3\u0010³\u0001\u001a\u00030®\u00012\u0007\u0010d\u001a\u00030®\u00018F@DX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b$\u0010¨\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R0\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\r0´\u00018\u0004X\u0084\u0004¢\u0006\u000f\n\u0005\b \u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R\u0017\u0010¹\u0001\u001a\u00020+8DX\u0084\u0004¢\u0006\b\u001a\u0006\b¸\u0001\u0010\u008a\u0001R\u0013\u0010»\u0001\u001a\u00020c8F¢\u0006\u0007\u001a\u0005\bº\u0001\u0010hR\u0014\u0010½\u0001\u001a\u00020+8F¢\u0006\b\u001a\u0006\b¼\u0001\u0010\u008a\u0001R\u0013\u0010¿\u0001\u001a\u00020c8F¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010hR\u0014\u0010Á\u0001\u001a\u00020+8F¢\u0006\b\u001a\u0006\bÀ\u0001\u0010\u008a\u0001R\u0014\u0010Ã\u0001\u001a\u00020+8F¢\u0006\b\u001a\u0006\bÂ\u0001\u0010\u008a\u0001R\u0014\u0010Å\u0001\u001a\u00020+8F¢\u0006\b\u001a\u0006\bÄ\u0001\u0010\u008a\u0001¨\u0006Æ\u0001"}, m13558d2 = {"Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;", "Lcom/zykj/evaluation/base/BaseViewModel;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/message/server/bean/UserInfo;", "userInfo", "Lp5/j;", NotificationCompat.CATEGORY_SERVICE, "<init>", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lp5/j;)V", "Landroid/graphics/Bitmap;", "bitmap", "v", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "", "Lcom/zykj/evaluation/ui/detail/GuideQuestion;", "questionList", "", "index", "", "y0", "(Ljava/util/List;I)V", "Lcom/zykj/evaluation/bean/TaskDetailInfo;", "taskDetailInfo", "v0", "(Lcom/zykj/evaluation/bean/TaskDetailInfo;)V", "", "", "localAnswerMap", "w0", "(Lcom/zykj/evaluation/bean/TaskDetailInfo;Ljava/util/Map;)V", "Lf6/j;", "draftFunctions", "t", "(Lf6/j;)V", "Lkotlin/Function0;", "lastCallback", "s", "(Lf6/j;Lkotlin/jvm/functions/Function0;)V", "callback", "u", "r", "Lcom/zykj/evaluation/bean/bundle/DetailBundle;", "detailBundle", "", "isSpecial", "U", "(Lcom/zykj/evaluation/bean/bundle/DetailBundle;Z)V", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "noSubmitStudentList", "noCorrectStudentList", "c0", "isAskForHelp", "g0", "(Z)V", "showRightMask", "u0", "Lkotlin/Function1;", "f0", "(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function1;)V", "stemBitmap", "e0", "p", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "q", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b0", "()V", "o", "d0", "guideQuestion", "R", "(Lcom/zykj/evaluation/ui/detail/GuideQuestion;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "B", "uuid", "answers", "x0", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "result", "isSummary", "isHalfScore", "Lcom/zykj/evaluation/ui/detail/f;", "y", "(IZLjava/lang/Boolean;)Lcom/zykj/evaluation/ui/detail/f;", "answerResult", "revisingAnswered", ExifInterface.LATITUDE_SOUTH, "(IZ)Lcom/zykj/evaluation/ui/detail/f;", "c", "Lkotlinx/coroutines/flow/MutableStateFlow;", "d", "Lp5/j;", "", "<set-?>", "e", "Lkotlin/properties/ReadWriteProperty;", "N", "()J", "s0", "(J)V", "mTaskId", "f", "G", "m0", "mExamId", "g", "H", "()Ljava/lang/String;", "n0", "(Ljava/lang/String;)V", "mExamName", "h", "O", "t0", "mTopicId", "i", "Ljava/util/List;", "L", "()Ljava/util/List;", "setMQuestionList", "(Ljava/util/List;)V", "mQuestionList", "j", "I", ExifInterface.LONGITUDE_EAST, "()I", "setMCurrentIndex", "(I)V", "mCurrentIndex", "k", "C", "()Z", "j0", "mCanShowAnswer", "l", "D", "k0", "mCanShowMicroClass", "m", "Ljava/lang/String;", "F", "l0", "mExamDescription", "n", "J", "p0", "mIsNoStem", "o0", "mIsEnableScore", "M", "r0", "mSpecificTrainingType", "Lg7/e;", "value", "Lg7/e;", "K", "()Lg7/e;", "q0", "(Lg7/e;)V", "mPathManager", "Lcom/zykj/evaluation/ui/detail/b;", "Landroidx/compose/runtime/MutableState;", "w", "()Lcom/zykj/evaluation/ui/detail/b;", "h0", "(Lcom/zykj/evaluation/ui/detail/b;)V", "detailCommonState", "Lw5/e;", "x", "()Lw5/e;", "i0", "(Lw5/e;)V", "detailQuestionState", "Landroidx/collection/ArrayMap;", "Landroidx/collection/ArrayMap;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Landroidx/collection/ArrayMap;", "P", "needRevise", "Q", "questionId", "a0", "isRelatedGroup", "z", "groupId", "Y", "isInitialized", "X", "isCompositionQuestion", "Z", "isNoStemAndObjective", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nBaseDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/BaseDetailViewModel\n+ 2 ArrayMap.jvm.kt\nandroidx/collection/ArrayMapKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,684:1\n27#2:685\n85#3:686\n113#3,2:687\n85#3:689\n113#3,2:690\n1761#4,3:692\n12824#5,3:695\n*S KotlinDebug\n*F\n+ 1 BaseDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/BaseDetailViewModel\n*L\n214#1:685\n206#1:686\n206#1:687,2\n210#1:689\n210#1:690,2\n238#1:692,3\n402#1:695,3\n*E\n"})
/* loaded from: classes4.dex */
public abstract class BaseDetailViewModel extends BaseViewModel {

    /* renamed from: u */
    public static final /* synthetic */ KProperty[] f9094u = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseDetailViewModel.class, "mTaskId", "getMTaskId()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseDetailViewModel.class, "mExamId", "getMExamId()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseDetailViewModel.class, "mExamName", "getMExamName()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseDetailViewModel.class, "mTopicId", "getMTopicId()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseDetailViewModel.class, "mCanShowAnswer", "getMCanShowAnswer()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseDetailViewModel.class, "mCanShowMicroClass", "getMCanShowMicroClass()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseDetailViewModel.class, "mIsNoStem", "getMIsNoStem()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseDetailViewModel.class, "mIsEnableScore", "getMIsEnableScore()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseDetailViewModel.class, "mSpecificTrainingType", "getMSpecificTrainingType()I", 0))};

    /* renamed from: v */
    public static final int f9095v = 8;

    /* renamed from: c, reason: from kotlin metadata */
    public final MutableStateFlow userInfo;

    /* renamed from: d, reason: from kotlin metadata */
    public final InterfaceC8843j service;

    /* renamed from: e, reason: from kotlin metadata */
    public final ReadWriteProperty mTaskId;

    /* renamed from: f, reason: from kotlin metadata */
    public final ReadWriteProperty mExamId;

    /* renamed from: g, reason: from kotlin metadata */
    public final ReadWriteProperty mExamName;

    /* renamed from: h, reason: from kotlin metadata */
    public final ReadWriteProperty mTopicId;

    /* renamed from: i, reason: from kotlin metadata */
    public List mQuestionList;

    /* renamed from: j, reason: from kotlin metadata */
    public int mCurrentIndex;

    /* renamed from: k, reason: from kotlin metadata */
    public final ReadWriteProperty mCanShowAnswer;

    /* renamed from: l, reason: from kotlin metadata */
    public final ReadWriteProperty mCanShowMicroClass;

    /* renamed from: m, reason: from kotlin metadata */
    public String mExamDescription;

    /* renamed from: n, reason: from kotlin metadata */
    public final ReadWriteProperty mIsNoStem;

    /* renamed from: o, reason: from kotlin metadata */
    public final ReadWriteProperty mIsEnableScore;

    /* renamed from: p, reason: from kotlin metadata */
    public final ReadWriteProperty mSpecificTrainingType;

    /* renamed from: q, reason: from kotlin metadata */
    public C7589e mPathManager;

    /* renamed from: r, reason: from kotlin metadata */
    public final MutableState detailCommonState;

    /* renamed from: s, reason: from kotlin metadata */
    public final MutableState detailQuestionState;

    /* renamed from: t, reason: from kotlin metadata */
    public final ArrayMap localAnswerMap;

    public BaseDetailViewModel(MutableStateFlow userInfo, InterfaceC8843j service) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(service, "service");
        this.userInfo = userInfo;
        this.service = service;
        Delegates delegates = Delegates.INSTANCE;
        this.mTaskId = delegates.notNull();
        this.mExamId = delegates.notNull();
        this.mExamName = delegates.notNull();
        this.mTopicId = delegates.notNull();
        this.mCanShowAnswer = delegates.notNull();
        this.mCanShowMicroClass = delegates.notNull();
        this.mIsNoStem = delegates.notNull();
        this.mIsEnableScore = delegates.notNull();
        this.mSpecificTrainingType = delegates.notNull();
        this.detailCommonState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new C6897b(null, null, null, null, false, null, null, false, false, null, false, null, null, null, false, false, null, null, 0L, null, 1048575, null), null, 2, null);
        this.detailQuestionState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new C9767e(null, false, false, null, null, null, null, null, null, null, null, null, 4095, null), null, 2, null);
        this.localAnswerMap = new ArrayMap();
    }

    /* renamed from: T */
    public static /* synthetic */ AbstractC6901f m9254T(BaseDetailViewModel baseDetailViewModel, int i10, boolean z9, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getReviseResult");
        }
        if ((i11 & 2) != 0) {
            z9 = false;
        }
        return baseDetailViewModel.m9276S(i10, z9);
    }

    /* renamed from: W */
    public static /* synthetic */ void m9255W(BaseDetailViewModel baseDetailViewModel, DetailBundle detailBundle, boolean z9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initData");
        }
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        baseDetailViewModel.mo9277U(detailBundle, z9);
    }

    /* renamed from: A, reason: from getter */
    public final ArrayMap getLocalAnswerMap() {
        return this.localAnswerMap;
    }

    /* renamed from: B */
    public final Object m9259B(Continuation continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new BaseDetailViewModel$getLocalAnswerMap$2(this, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* renamed from: C */
    public final boolean m9260C() {
        return ((Boolean) this.mCanShowAnswer.getValue(this, f9094u[4])).booleanValue();
    }

    /* renamed from: D */
    public final boolean m9261D() {
        return ((Boolean) this.mCanShowMicroClass.getValue(this, f9094u[5])).booleanValue();
    }

    /* renamed from: E, reason: from getter */
    public final int getMCurrentIndex() {
        return this.mCurrentIndex;
    }

    /* renamed from: F */
    public final String m9263F() {
        String str = this.mExamDescription;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mExamDescription");
        return null;
    }

    /* renamed from: G */
    public final long m9264G() {
        return ((Number) this.mExamId.getValue(this, f9094u[1])).longValue();
    }

    /* renamed from: H */
    public final String m9265H() {
        return (String) this.mExamName.getValue(this, f9094u[2]);
    }

    /* renamed from: I */
    public final boolean m9266I() {
        return ((Boolean) this.mIsEnableScore.getValue(this, f9094u[7])).booleanValue();
    }

    /* renamed from: J */
    public final boolean m9267J() {
        return ((Boolean) this.mIsNoStem.getValue(this, f9094u[6])).booleanValue();
    }

    /* renamed from: K */
    public final C7589e m9268K() {
        C7589e c7589e = this.mPathManager;
        if (c7589e != null) {
            return c7589e;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mPathManager");
        return null;
    }

    /* renamed from: L, reason: from getter */
    public final List getMQuestionList() {
        return this.mQuestionList;
    }

    /* renamed from: M */
    public final int m9270M() {
        return ((Number) this.mSpecificTrainingType.getValue(this, f9094u[8])).intValue();
    }

    /* renamed from: N */
    public final long m9271N() {
        return ((Number) this.mTaskId.getValue(this, f9094u[0])).longValue();
    }

    /* renamed from: O */
    public final long m9272O() {
        return ((Number) this.mTopicId.getValue(this, f9094u[3])).longValue();
    }

    /* renamed from: P */
    public final boolean m9273P() {
        GuideQuestion guideQuestion;
        List list = this.mQuestionList;
        return (list == null || (guideQuestion = (GuideQuestion) CollectionsKt.getOrNull(list, this.mCurrentIndex)) == null || !guideQuestion.getNeedRevise()) ? false : true;
    }

    /* renamed from: Q */
    public final long m9274Q() {
        GuideQuestion guideQuestion;
        List list = this.mQuestionList;
        if (list == null || (guideQuestion = (GuideQuestion) CollectionsKt.getOrNull(list, this.mCurrentIndex)) == null) {
            return 0L;
        }
        return guideQuestion.getQuestionId();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r9 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (r9 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m9275R(com.zykj.evaluation.p057ui.detail.GuideQuestion r8, kotlin.coroutines.Continuation r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.zykj.evaluation.p057ui.detail.BaseDetailViewModel$getQuestionInfo$1
            if (r0 == 0) goto L14
            r0 = r9
            com.zykj.evaluation.ui.detail.BaseDetailViewModel$getQuestionInfo$1 r0 = (com.zykj.evaluation.p057ui.detail.BaseDetailViewModel$getQuestionInfo$1) r0
            int r1 = r0.f9119d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f9119d = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.zykj.evaluation.ui.detail.BaseDetailViewModel$getQuestionInfo$1 r0 = new com.zykj.evaluation.ui.detail.BaseDetailViewModel$getQuestionInfo$1
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.f9117b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f9119d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L42
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r8 = r6.f9116a
            com.zykj.evaluation.ui.detail.GuideQuestion r8 = (com.zykj.evaluation.p057ui.detail.GuideQuestion) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L88
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            java.lang.Object r8 = r6.f9116a
            com.zykj.evaluation.ui.detail.GuideQuestion r8 = (com.zykj.evaluation.p057ui.detail.GuideQuestion) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L65
        L42:
            kotlin.ResultKt.throwOnFailure(r9)
            boolean r9 = r8.isRelatedGroup()
            if (r9 == 0) goto L6e
            p5.j r1 = r7.service
            r9 = r3
            long r2 = r7.m9264G()
            long r4 = r8.getGroupId()
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r6.f9116a = r8
            r6.f9119d = r9
            java.lang.Object r9 = r1.m14830l(r2, r4, r6)
            if (r9 != r0) goto L65
            goto L87
        L65:
            com.zykj.http.bean.ApiResp r9 = (com.zykj.http.bean.ApiResp) r9
            java.lang.Object r8 = p189o5.AbstractC8711g.m14346a(r9)
            java.util.List r8 = (java.util.List) r8
            goto L94
        L6e:
            p5.j r1 = r7.service
            r9 = r2
            long r2 = r7.m9264G()
            long r4 = r8.getQuestionId()
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r6.f9116a = r8
            r6.f9119d = r9
            java.lang.Object r9 = r1.m14836r(r2, r4, r6)
            if (r9 != r0) goto L88
        L87:
            return r0
        L88:
            com.zykj.http.bean.ApiResp r9 = (com.zykj.http.bean.ApiResp) r9
            java.lang.Object r8 = p189o5.AbstractC8711g.m14346a(r9)
            com.zykj.evaluation.bean.TaskDetailInfo r8 = (com.zykj.evaluation.bean.TaskDetailInfo) r8
            java.util.List r8 = kotlin.collections.CollectionsKt.listOf(r8)
        L94:
            com.zykj.evaluation.bean.TaskDetailInfo r8 = p276w5.AbstractC9776h.m16385b(r8)
            r7.mo9311v0(r8)
            androidx.collection.ArrayMap r9 = r7.localAnswerMap
            r7.mo9313w0(r8, r9)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.BaseDetailViewModel.m9275R(com.zykj.evaluation.ui.detail.GuideQuestion, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/BaseDetailViewModel.smali:1506
    }

    /* renamed from: S */
    public final AbstractC6901f m9276S(int answerResult, boolean revisingAnswered) {
        return (answerResult == QuestionResultEnum.ERROR.ordinal() || answerResult == QuestionResultEnum.NO_RIGHT.ordinal()) ? revisingAnswered ? AbstractC6901f.c.f9271b : AbstractC6901f.a.f9269b : answerResult == QuestionResultEnum.REVISING_RIGHT.ordinal() ? AbstractC6901f.d.f9272b : AbstractC6901f.c.f9271b;
    }

    /* renamed from: U */
    public void mo9277U(DetailBundle detailBundle, boolean isSpecial) {
        Intrinsics.checkNotNullParameter(detailBundle, "detailBundle");
        m9305s0(detailBundle.getTaskId());
        m9294m0(detailBundle.getExamId());
        m9295n0(detailBundle.getExamName());
        m9307t0(detailBundle.getTopicId());
        this.mQuestionList = detailBundle.getQuestionList();
        this.mCurrentIndex = detailBundle.getCurrentIndex();
        m9299p0(detailBundle.isNoStem());
        m9297o0(detailBundle.isEnableScore());
        m9291j0(detailBundle.getCanShowAnswer());
        m9292k0(detailBundle.getCanShowMicroClass());
        m9293l0(detailBundle.getExamDescription());
        m9303r0(detailBundle.getSpecificTrainingType());
        m9289h0(C6897b.m9427b(m9312w(), null, null, null, m9263F(), detailBundle.isRepresentative(), null, null, false, false, null, false, null, null, null, false, !isSpecial, null, null, 0L, null, 1015783, null));
        mo9317y0(detailBundle.getQuestionList(), this.mCurrentIndex);
    }

    /* renamed from: V */
    public void m9278V(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseViewModel.m8644f(this, null, null, null, null, null, new BaseDetailViewModel$initData$1(this, callback, null), 31, null);
    }

    /* renamed from: X */
    public final boolean m9279X() {
        return m9270M() == SpecificTrainingType.CompositionTraining.INSTANCE.getType();
    }

    /* renamed from: Y */
    public final boolean m9280Y() {
        return (this.mExamDescription == null || this.mQuestionList == null) ? false : true;
    }

    /* renamed from: Z */
    public final boolean m9281Z() {
        if (!m9267J()) {
            return false;
        }
        List listM16367d = m9314x().m16367d();
        if (listM16367d != null && listM16367d.isEmpty()) {
            return false;
        }
        Iterator it = listM16367d.iterator();
        while (it.hasNext()) {
            if (!((C6898c) it.next()).m9459k().m12882b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a0 */
    public final boolean m9282a0() {
        GuideQuestion guideQuestion;
        List list = this.mQuestionList;
        return (list == null || (guideQuestion = (GuideQuestion) CollectionsKt.getOrNull(list, this.mCurrentIndex)) == null || !guideQuestion.isRelatedGroup()) ? false : true;
    }

    /* renamed from: b0 */
    public final void m9283b0() {
        GuideQuestion guideQuestion;
        List list = this.mQuestionList;
        if (list == null || (guideQuestion = (GuideQuestion) CollectionsKt.getOrNull(list, this.mCurrentIndex)) == null) {
            return;
        }
        BaseViewModel.m8644f(this, null, null, null, null, null, new BaseDetailViewModel$refreshData$1(this, list, guideQuestion, null), 31, null);
    }

    /* renamed from: c0 */
    public final void m9284c0(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseViewModel.m8644f(this, null, null, null, null, null, new BaseDetailViewModel$refreshSubmitProgress$1(this, callback, null), 31, null);
    }

    /* renamed from: d0 */
    public final void m9285d0() {
        BaseViewModel.m8644f(this, null, null, null, null, null, new BaseDetailViewModel$removeMistake$1(this, null), 31, null);
    }

    /* renamed from: e0 */
    public final void m9286e0(Bitmap stemBitmap, Function1 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseViewModel.m8644f(this, null, null, null, null, null, new BaseDetailViewModel$saveBitmapListToAsk$1(stemBitmap, this, callback, null), 31, null);
    }

    /* renamed from: f0 */
    public final void m9287f0(Bitmap bitmap, Function1 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (bitmap != null) {
            BaseViewModel.m8644f(this, null, null, null, null, null, new BaseDetailViewModel$saveBitmapToAddMistake$1$1(this, bitmap, callback, null), 31, null);
        } else {
            callback.invoke("");
        }
    }

    /* renamed from: g0 */
    public final void m9288g0(boolean isAskForHelp) {
        BaseViewModel.m8644f(this, null, null, null, null, null, new BaseDetailViewModel$setAskForHelp$1(this, isAskForHelp, null), 31, null);
    }

    /* renamed from: h0 */
    public final void m9289h0(C6897b c6897b) {
        Intrinsics.checkNotNullParameter(c6897b, "<set-?>");
        this.detailCommonState.setValue(c6897b);
    }

    /* renamed from: i0 */
    public final void m9290i0(C9767e c9767e) {
        Intrinsics.checkNotNullParameter(c9767e, "<set-?>");
        this.detailQuestionState.setValue(c9767e);
    }

    /* renamed from: j0 */
    public final void m9291j0(boolean z9) {
        this.mCanShowAnswer.setValue(this, f9094u[4], Boolean.valueOf(z9));
    }

    /* renamed from: k0 */
    public final void m9292k0(boolean z9) {
        this.mCanShowMicroClass.setValue(this, f9094u[5], Boolean.valueOf(z9));
    }

    /* renamed from: l0 */
    public final void m9293l0(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mExamDescription = str;
    }

    /* renamed from: m0 */
    public final void m9294m0(long j10) {
        this.mExamId.setValue(this, f9094u[1], Long.valueOf(j10));
    }

    /* renamed from: n0 */
    public final void m9295n0(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mExamName.setValue(this, f9094u[2], str);
    }

    /* renamed from: o */
    public final void m9296o() {
        m9289h0(C6897b.m9427b(m9312w(), null, null, null, null, false, null, null, false, false, null, false, null, AbstractC6899d.b.f9246c, null, false, false, null, null, 0L, null, 1044479, null));
    }

    /* renamed from: o0 */
    public final void m9297o0(boolean z9) {
        this.mIsEnableScore.setValue(this, f9094u[7], Boolean.valueOf(z9));
    }

    /* renamed from: p */
    public final Object m9298p(Function0 function0, Continuation continuation) throws Exception {
        List list = this.mQuestionList;
        if (list == null) {
            return Unit.INSTANCE;
        }
        if (this.mCurrentIndex >= list.size() - 1) {
            function0.invoke();
            return Unit.INSTANCE;
        }
        int i10 = this.mCurrentIndex + 1;
        this.mCurrentIndex = i10;
        mo9317y0(list, i10);
        Object objM9275R = m9275R((GuideQuestion) list.get(this.mCurrentIndex), continuation);
        return objM9275R == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM9275R : Unit.INSTANCE;
    }

    /* renamed from: p0 */
    public final void m9299p0(boolean z9) {
        this.mIsNoStem.setValue(this, f9094u[6], Boolean.valueOf(z9));
    }

    /* renamed from: q */
    public final Object m9300q(Continuation continuation) throws Exception {
        List list = this.mQuestionList;
        if (list == null) {
            return Unit.INSTANCE;
        }
        int i10 = this.mCurrentIndex;
        if (i10 <= 0) {
            return Unit.INSTANCE;
        }
        int i11 = i10 - 1;
        this.mCurrentIndex = i11;
        mo9317y0(list, i11);
        Object objM9275R = m9275R((GuideQuestion) list.get(this.mCurrentIndex), continuation);
        return objM9275R == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM9275R : Unit.INSTANCE;
    }

    /* renamed from: q0 */
    public final void m9301q0(C7589e c7589e) {
        Intrinsics.checkNotNullParameter(c7589e, "<set-?>");
        this.mPathManager = c7589e;
    }

    /* renamed from: r */
    public void mo9302r(C7459j draftFunctions, Function0 callback) {
        Intrinsics.checkNotNullParameter(draftFunctions, "draftFunctions");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke();
    }

    /* renamed from: r0 */
    public final void m9303r0(int i10) {
        this.mSpecificTrainingType.setValue(this, f9094u[8], Integer.valueOf(i10));
    }

    /* renamed from: s */
    public abstract void mo9304s(C7459j draftFunctions, Function0 lastCallback);

    /* renamed from: s0 */
    public final void m9305s0(long j10) {
        this.mTaskId.setValue(this, f9094u[0], Long.valueOf(j10));
    }

    /* renamed from: t */
    public abstract void mo9306t(C7459j draftFunctions);

    /* renamed from: t0 */
    public final void m9307t0(long j10) {
        this.mTopicId.setValue(this, f9094u[3], Long.valueOf(j10));
    }

    /* renamed from: u */
    public void mo9308u(C7459j draftFunctions, Function0 callback) {
        Intrinsics.checkNotNullParameter(draftFunctions, "draftFunctions");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    /* renamed from: u0 */
    public final void m9309u0(boolean showRightMask) {
        BaseViewModel.m8644f(this, null, null, null, null, null, new BaseDetailViewModel$setRightMaskVisible$1(this, showRightMask, null), 31, null);
    }

    /* renamed from: v */
    public final Bitmap m9310v(Bitmap bitmap) {
        Bitmap bitmap2;
        int iCoerceAtLeast;
        int width = bitmap.getWidth();
        int[] iArr = new int[width];
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast(Math.min(bitmap.getHeight() / 4, 400), 1);
        int iMax = Math.max(2, bitmap.getWidth() / 500);
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= iCoerceAtLeast2) {
                bitmap2 = bitmap;
                break;
            }
            bitmap2 = bitmap;
            bitmap2.getPixels(iArr, 0, bitmap.getWidth(), 0, i12, bitmap.getWidth(), 1);
            int i14 = 0;
            for (int i15 = 0; i15 < width; i15++) {
                int i16 = iArr[i15];
                if (Color.alpha(i16) > 0 && (Color.red(i16) < 250 || Color.green(i16) < 250 || Color.blue(i16) < 250)) {
                    i14++;
                }
            }
            if (i14 >= iMax) {
                if (i13 == 0) {
                    i11 = i12;
                }
                i13++;
                if (i13 >= 2) {
                    i10 = i11;
                    break;
                }
            } else {
                i11 = -1;
                i13 = 0;
            }
            i12++;
        }
        if (i10 < 0 || (iCoerceAtLeast = RangesKt.coerceAtLeast(i10 - Math.max(8, bitmap2.getWidth() / 100), 0)) == 0) {
            return bitmap2;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, iCoerceAtLeast, bitmap2.getWidth(), bitmap2.getHeight() - iCoerceAtLeast);
        Intrinsics.checkNotNull(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    /* renamed from: v0 */
    public abstract void mo9311v0(TaskDetailInfo taskDetailInfo);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    public final C6897b m9312w() {
        return (C6897b) this.detailCommonState.getValue();
    }

    /* renamed from: w0 */
    public abstract void mo9313w0(TaskDetailInfo taskDetailInfo, Map localAnswerMap);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    public final C9767e m9314x() {
        return (C9767e) this.detailQuestionState.getValue();
    }

    /* renamed from: x0 */
    public final Object m9315x0(String str, List list, Continuation continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new BaseDetailViewModel$updateLocalAnswerMap$2(this, str, list, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* renamed from: y */
    public final AbstractC6901f m9316y(int result, boolean isSummary, Boolean isHalfScore) {
        return result == QuestionResultEnum.RIGHT.ordinal() ? AbstractC6901f.d.f9272b : result == QuestionResultEnum.NO_RIGHT.ordinal() ? !m9266I() ? AbstractC6901f.b.f9270b : AbstractC6901f.a.f9269b : (result == QuestionResultEnum.ERROR.ordinal() || result == QuestionResultEnum.REVISING_RIGHT.ordinal()) ? (!m9266I() && isSummary && Intrinsics.areEqual(isHalfScore, Boolean.TRUE)) ? AbstractC6901f.b.f9270b : AbstractC6901f.a.f9269b : AbstractC6901f.c.f9271b;
    }

    /* renamed from: y0 */
    public abstract void mo9317y0(List questionList, int index);

    /* renamed from: z */
    public final long m9318z() {
        GuideQuestion guideQuestion;
        List list = this.mQuestionList;
        if (list == null || (guideQuestion = (GuideQuestion) CollectionsKt.getOrNull(list, this.mCurrentIndex)) == null) {
            return 0L;
        }
        return guideQuestion.getGroupId();
    }
}

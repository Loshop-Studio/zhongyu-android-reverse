package com.zykj.evaluation.p057ui.detail.toCorrect;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.zykj.evaluation.base.BaseViewModel;
import com.zykj.evaluation.bean.TaskState;
import com.zykj.evaluation.bean.bundle.DetailBundle;
import com.zykj.evaluation.bean.constant.QuestionResultEnum;
import com.zykj.evaluation.p056di.AppDatabase;
import com.zykj.evaluation.p057ui.detail.AbstractC6901f;
import com.zykj.evaluation.p057ui.detail.BaseDetailViewModel;
import com.zykj.evaluation.p057ui.detail.C6897b;
import com.zykj.evaluation.p057ui.detail.C6898c;
import com.zykj.evaluation.p057ui.detail.GuideQuestion;
import com.zykj.evaluation.submit.SubmitTaskManger;
import com.zykj.evaluation.upload.OssTaskManger;
import com.zykj.message.server.bean.UserInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import p089f6.C7459j;
import p101g7.C7589e;
import p200p5.InterfaceC8843j;
import p276w5.AbstractC9755a;
import p276w5.C9758b;
import p276w5.C9767e;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010JË\u0001\u0010*\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00170\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00172\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00172\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\"0!j\b\u0012\u0004\u0012\u00020\"`#2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020%0!j\b\u0012\u0004\u0012\u00020%`#2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020%0!j\b\u0012\u0004\u0012\u00020%`#2\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020%0!j\b\u0012\u0004\u0012\u00020%`#H\u0002¢\u0006\u0004\b*\u0010+J¹\u0001\u00101\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u001b2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00172\b\u0010/\u001a\u0004\u0018\u00010\u001d2\b\u00100\u001a\u0004\u0018\u00010\u001f2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\"0!j\b\u0012\u0004\u0012\u00020\"`#2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020%0!j\b\u0012\u0004\u0012\u00020%`#2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020%0!j\b\u0012\u0004\u0012\u00020%`#2\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020%0!j\b\u0012\u0004\u0012\u00020%`#H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00132\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u00020)2\u0006\u00104\u001a\u000203H\u0082@¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020)H\u0082@¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020)H\u0082@¢\u0006\u0004\b;\u0010:J\u0017\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u00020\u0011H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010C\u001a\u00020)2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\u0013H\u0016¢\u0006\u0004\bC\u0010DJ%\u0010H\u001a\u00020)2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u00172\u0006\u0010G\u001a\u00020\u0011H\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020)2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ1\u0010N\u001a\u00020)2\u0006\u0010K\u001a\u00020J2\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00170\u001aH\u0016¢\u0006\u0004\bN\u0010OJ#\u0010R\u001a\u00020)2\u0006\u0010P\u001a\u00020\u001b2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017¢\u0006\u0004\bR\u0010SJ\u0015\u0010U\u001a\u00020)2\u0006\u0010T\u001a\u00020\u0013¢\u0006\u0004\bU\u0010VJ\u001a\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010P\u001a\u00020\u001bH\u0086@¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020)2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\bZ\u0010[J%\u0010^\u001a\u00020)2\u0006\u00104\u001a\u0002032\f\u0010]\u001a\b\u0012\u0004\u0012\u00020)0\\H\u0016¢\u0006\u0004\b^\u0010_J%\u0010a\u001a\u00020)2\u0006\u00104\u001a\u0002032\f\u0010`\u001a\b\u0012\u0004\u0012\u00020)0\\H\u0016¢\u0006\u0004\ba\u0010_J%\u0010b\u001a\u00020)2\u0006\u00104\u001a\u0002032\f\u0010`\u001a\b\u0012\u0004\u0012\u00020)0\\H\u0016¢\u0006\u0004\bb\u0010_R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010n\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR$\u0010r\u001a\u0012\u0012\u0004\u0012\u00020o0!j\b\u0012\u0004\u0012\u00020o`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010q¨\u0006s"}, m13558d2 = {"Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;", "Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/message/server/bean/UserInfo;", "userInfo", "Lcom/zykj/http/bean/HeaderBean;", "headerBeanFlow", "Lcom/zykj/evaluation/di/AppDatabase;", "database", "Lcom/zykj/evaluation/upload/OssTaskManger;", "ossTaskManger", "Lcom/zykj/evaluation/submit/SubmitTaskManger;", "submitTaskManger", "Lp5/j;", NotificationCompat.CATEGORY_SERVICE, "<init>", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/di/AppDatabase;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lp5/j;)V", "", "specificTrainingType", "", "revisingAnswered", "", "questionId", "", "Lcom/zykj/evaluation/bean/DetailSubQuestion;", "subQuestionList", "", "", "localAnswerMap", "Lcom/zykj/evaluation/bean/DetailAnswerInfo;", "answerList", "Lcom/zykj/evaluation/bean/RevisingRecord;", "lastRevisingRecordList", "Ljava/util/ArrayList;", "Lw5/f;", "Lkotlin/collections/ArrayList;", "scoreList", "Lcom/zykj/evaluation/ui/detail/c;", "localAnswerList", "examAnswerList", "reviseAnswerList", "", "R0", "(IZJLjava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "subQuestion", "numberString", "localAnswers", "answer", "revisingRecord", "Q0", "(IZJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Ljava/util/List;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Lcom/zykj/evaluation/bean/RevisingRecord;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "Lf6/j;", "draftFunctions", "U0", "(Lf6/j;)Z", "N0", "(Lf6/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "S0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T0", "result", "Lcom/zykj/evaluation/ui/detail/f;", "O0", "(I)Lcom/zykj/evaluation/ui/detail/f;", "Lcom/zykj/evaluation/bean/bundle/DetailBundle;", "detailBundle", "isSpecial", "U", "(Lcom/zykj/evaluation/bean/bundle/DetailBundle;Z)V", "Lcom/zykj/evaluation/ui/detail/GuideQuestion;", "questionList", "index", "y0", "(Ljava/util/List;I)V", "Lcom/zykj/evaluation/bean/TaskDetailInfo;", "taskDetailInfo", "v0", "(Lcom/zykj/evaluation/bean/TaskDetailInfo;)V", "w0", "(Lcom/zykj/evaluation/bean/TaskDetailInfo;Ljava/util/Map;)V", "uuid", "localAnswer", "V0", "(Ljava/lang/String;Ljava/util/List;)V", "isInCorrect", "M0", "(Z)V", "Landroid/graphics/Bitmap;", "P0", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "(Lf6/j;)V", "Lkotlin/Function0;", "lastCallback", "s", "(Lf6/j;Lkotlin/jvm/functions/Function0;)V", "callback", "u", "r", "w", "Lkotlinx/coroutines/flow/MutableStateFlow;", "x", "y", "Lcom/zykj/evaluation/di/AppDatabase;", "z", "Lcom/zykj/evaluation/upload/OssTaskManger;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/zykj/evaluation/submit/SubmitTaskManger;", "B", "Z", "hasLocalAnswerChanged", "Lcom/zykj/evaluation/utils/NeedReviseData;", "C", "Ljava/util/ArrayList;", "isQuestionNeedReviseList", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nToCorrectDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToCorrectDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel\n+ 2 ArrayMap.jvm.kt\nandroidx/collection/ArrayMapKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 9 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1099:1\n27#2:1100\n27#2:1103\n27#2:1239\n1869#3,2:1101\n1869#3,2:1104\n1563#3:1106\n1634#3,3:1107\n1869#3:1110\n1869#3,2:1111\n1870#3:1113\n1761#3,3:1114\n1563#3:1117\n1634#3,2:1118\n295#3,2:1120\n1563#3:1122\n1634#3,3:1123\n1636#3:1126\n1878#3,3:1128\n1878#3,3:1131\n774#3:1134\n865#3,2:1135\n295#3,2:1137\n774#3:1139\n865#3,2:1140\n295#3,2:1142\n1563#3:1144\n1634#3,3:1145\n295#3,2:1148\n1563#3:1150\n1634#3,3:1151\n295#3,2:1154\n1563#3:1156\n1634#3,3:1157\n1563#3:1160\n1634#3,3:1161\n1563#3:1164\n1634#3,3:1165\n1563#3:1168\n1634#3,2:1169\n1563#3:1171\n1634#3,3:1172\n1636#3:1175\n295#3,2:1176\n774#3:1179\n865#3,2:1180\n1617#3,9:1182\n1869#3:1191\n1870#3:1193\n1626#3:1194\n1761#3,2:1201\n1761#3,3:1203\n1763#3:1206\n2746#3,3:1207\n1491#3:1210\n1516#3,3:1211\n1519#3,3:1221\n1563#3:1227\n1634#3,3:1228\n774#3:1232\n865#3,2:1233\n1563#3:1235\n1634#3,3:1236\n1869#3,2:1240\n1563#3:1242\n1634#3,2:1243\n295#3,2:1245\n1636#3:1247\n1869#3,2:1248\n1#4:1127\n1#4:1192\n17#5:1178\n37#6:1195\n36#6,3:1196\n13472#7,2:1199\n382#8,7:1214\n126#9:1224\n153#9,2:1225\n155#9:1231\n*S KotlinDebug\n*F\n+ 1 ToCorrectDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel\n*L\n158#1:1100\n164#1:1103\n983#1:1239\n159#1:1101,2\n165#1:1104,2\n186#1:1106\n186#1:1107,3\n200#1:1110\n215#1:1111,2\n200#1:1113\n258#1:1114,3\n260#1:1117\n260#1:1118,2\n264#1:1120,2\n267#1:1122\n267#1:1123,3\n260#1:1126\n337#1:1128,3\n394#1:1131,3\n432#1:1134\n432#1:1135,2\n435#1:1137,2\n451#1:1139\n451#1:1140,2\n454#1:1142,2\n560#1:1144\n560#1:1145,3\n573#1:1148,2\n622#1:1150\n622#1:1151,3\n652#1:1154,2\n655#1:1156\n655#1:1157,3\n677#1:1160\n677#1:1161,3\n701#1:1164\n701#1:1165,3\n744#1:1168\n744#1:1169,2\n748#1:1171\n748#1:1172,3\n744#1:1175\n778#1:1176,2\n794#1:1179\n794#1:1180,2\n796#1:1182,9\n796#1:1191\n796#1:1193\n796#1:1194\n942#1:1201,2\n943#1:1203,3\n942#1:1206\n946#1:1207,3\n953#1:1210\n953#1:1211,3\n953#1:1221,3\n957#1:1227\n957#1:1228,3\n963#1:1232\n963#1:1233,2\n964#1:1235\n964#1:1236,3\n985#1:1240,2\n1007#1:1242\n1007#1:1243,2\n1009#1:1245,2\n1007#1:1247\n1023#1:1248,2\n796#1:1192\n788#1:1178\n807#1:1195\n807#1:1196,3\n909#1:1199,2\n953#1:1214,7\n954#1:1224\n954#1:1225,2\n954#1:1231\n*E\n"})
/* loaded from: classes4.dex */
public final class ToCorrectDetailViewModel extends BaseDetailViewModel {

    /* renamed from: A, reason: from kotlin metadata */
    public final SubmitTaskManger submitTaskManger;

    /* renamed from: B, reason: from kotlin metadata */
    public boolean hasLocalAnswerChanged;

    /* renamed from: C, reason: from kotlin metadata */
    public final ArrayList isQuestionNeedReviseList;

    /* renamed from: w, reason: from kotlin metadata */
    public final MutableStateFlow userInfo;

    /* renamed from: x, reason: from kotlin metadata */
    public final MutableStateFlow headerBeanFlow;

    /* renamed from: y, reason: from kotlin metadata */
    public final AppDatabase database;

    /* renamed from: z, reason: from kotlin metadata */
    public final OssTaskManger ossTaskManger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToCorrectDetailViewModel(MutableStateFlow userInfo, MutableStateFlow headerBeanFlow, AppDatabase database, OssTaskManger ossTaskManger, SubmitTaskManger submitTaskManger, InterfaceC8843j service) {
        super(userInfo, service);
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(headerBeanFlow, "headerBeanFlow");
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(ossTaskManger, "ossTaskManger");
        Intrinsics.checkNotNullParameter(submitTaskManger, "submitTaskManger");
        Intrinsics.checkNotNullParameter(service, "service");
        this.userInfo = userInfo;
        this.headerBeanFlow = headerBeanFlow;
        this.database = database;
        this.ossTaskManger = ossTaskManger;
        this.submitTaskManger = submitTaskManger;
        this.isQuestionNeedReviseList = new ArrayList();
    }

    /* renamed from: M0 */
    public final void m9660M0(boolean isInCorrect) {
        m9290i0(C9767e.m16364b(m9314x(), null, false, isInCorrect, null, null, null, null, null, null, null, null, null, 4091, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x042d, code lost:
    
        if (r7.mo8766b(r8, r11) == r2) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0649, code lost:
    
        if (r7.m10486r(r12, r17, r8, r9, r0, r1, false, r14, r15, r11) != r2) goto L195;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a8 A[EDGE_INSN: B:96:0x02a8->B:97:0x02a9 BREAK  A[LOOP:9: B:90:0x028a->B:224:?]] */
    /* JADX WARN: Type inference failed for: r18v0, types: [T, com.zykj.evaluation.bean.UploadData] */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, com.zykj.evaluation.bean.UploadData] */
    /* renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m9661N0(p089f6.C7459j r38, kotlin.coroutines.Continuation r39) {
        /*
            Method dump skipped, instructions count: 1615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.toCorrect.ToCorrectDetailViewModel.m9661N0(f6.j, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel.smali:528
    }

    /* renamed from: O0 */
    public final AbstractC6901f m9662O0(int result) {
        return result == QuestionResultEnum.NO_CORRECT.ordinal() ? AbstractC6901f.c.f9271b : (result == QuestionResultEnum.RIGHT.ordinal() || result == QuestionResultEnum.REVISING_RIGHT.ordinal()) ? AbstractC6901f.d.f9272b : result == QuestionResultEnum.NO_RIGHT.ordinal() ? AbstractC6901f.b.f9270b : result == QuestionResultEnum.ERROR.ordinal() ? AbstractC6901f.a.f9269b : AbstractC6901f.c.f9271b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Iterable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x01ee -> B:45:0x01fa). Please report as a decompilation issue!!! */
    /* renamed from: P0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m9663P0(java.lang.String r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.toCorrect.ToCorrectDetailViewModel.m9663P0(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel.smali:4013
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0424  */
    /* renamed from: Q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9664Q0(int r38, boolean r39, long r40, com.zykj.evaluation.bean.DetailSubQuestion r42, java.lang.String r43, java.util.List r44, com.zykj.evaluation.bean.DetailAnswerInfo r45, com.zykj.evaluation.bean.RevisingRecord r46, java.util.ArrayList r47, java.util.ArrayList r48, java.util.ArrayList r49, java.util.ArrayList r50) {
        /*
            Method dump skipped, instructions count: 1214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.toCorrect.ToCorrectDetailViewModel.m9664Q0(int, boolean, long, com.zykj.evaluation.bean.DetailSubQuestion, java.lang.String, java.util.List, com.zykj.evaluation.bean.DetailAnswerInfo, com.zykj.evaluation.bean.RevisingRecord, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel.smali:5295
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01fb  */
    /* renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9665R0(int r37, boolean r38, long r39, java.util.List r41, java.util.Map r42, java.util.List r43, java.util.List r44, java.util.ArrayList r45, java.util.ArrayList r46, java.util.ArrayList r47, java.util.ArrayList r48) {
        /*
            Method dump skipped, instructions count: 962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.toCorrect.ToCorrectDetailViewModel.m9665R0(int, boolean, long, java.util.List, java.util.Map, java.util.List, java.util.List, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel.smali:6820
    }

    /* renamed from: S0 */
    public final Object m9666S0(Continuation continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new ToCorrectDetailViewModel$initNeedReviseData$2(this, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* renamed from: T0 */
    public final Object m9667T0(Continuation continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new ToCorrectDetailViewModel$saveNeedReviseData$2(this, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: U */
    public void mo9277U(DetailBundle detailBundle, boolean isSpecial) {
        Intrinsics.checkNotNullParameter(detailBundle, "detailBundle");
        super.mo9277U(detailBundle, isSpecial);
        TaskState.ToCorrect toCorrect = TaskState.ToCorrect.INSTANCE;
        Long lM10602a = ((UserInfo) this.userInfo.getValue()).m10602a();
        Intrinsics.checkNotNullExpressionValue(lM10602a, "getId(...)");
        m9301q0(new C7589e(toCorrect, lM10602a.longValue(), m9271N()));
        m9289h0(C6897b.m9427b(m9312w(), null, null, null, null, false, null, null, false, false, null, false, null, null, null, true, false, null, null, 0L, null, 1032191, null));
        BaseViewModel.m8644f(this, null, null, null, null, null, new ToCorrectDetailViewModel$initData$1(this, null), 31, null);
    }

    /* renamed from: U0 */
    public final boolean m9668U0(C7459j draftFunctions) {
        return ((Boolean) draftFunctions.m12058j().invoke()).booleanValue() || this.hasLocalAnswerChanged;
    }

    /* renamed from: V0 */
    public final void m9669V0(String uuid, List localAnswer) {
        List localAnswer2 = localAnswer;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(localAnswer2, "localAnswer");
        this.hasLocalAnswerChanged = true;
        getLocalAnswerMap().put(uuid, localAnswer2);
        BaseViewModel.m8644f(this, null, null, new ToCorrectDetailViewModel$updateLocalAnswer$1(null), new ToCorrectDetailViewModel$updateLocalAnswer$2(null), null, new ToCorrectDetailViewModel$updateLocalAnswer$3(this, uuid, localAnswer2, null), 19, null);
        C9767e c9767eM9314x = m9314x();
        List<C6898c> listM16369f = m9314x().m16369f();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM16369f, 10));
        for (C6898c c6898cM9449b : listM16369f) {
            if (Intrinsics.areEqual(c6898cM9449b.m9460l(), uuid)) {
                List<C9758b> listM9455g = c6898cM9449b.m9455g();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM9455g, 10));
                for (C9758b c9758b : listM9455g) {
                    arrayList2.add(C9758b.m16353b(c9758b, null, localAnswer2.contains(c9758b.m16356d()) ? AbstractC9755a.a.f17180c : AbstractC9755a.b.f17181c, false, 5, null));
                }
                c6898cM9449b = C6898c.m9449b(c6898cM9449b, 0L, null, null, null, arrayList2, localAnswer2, null, null, null, null, 975, null);
            }
            arrayList.add(c6898cM9449b);
            localAnswer2 = localAnswer;
        }
        m9290i0(C9767e.m16364b(c9767eM9314x, null, false, false, null, null, arrayList, null, null, null, null, null, null, 4063, null));
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: r */
    public void mo9302r(C7459j draftFunctions, Function0 callback) {
        Intrinsics.checkNotNullParameter(draftFunctions, "draftFunctions");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (m9668U0(draftFunctions)) {
            BaseViewModel.m8644f(this, null, null, null, null, null, new ToCorrectDetailViewModel$commitAndBack$1(this, draftFunctions, callback, null), 31, null);
        } else {
            callback.invoke();
        }
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: s */
    public void mo9304s(C7459j draftFunctions, Function0 lastCallback) {
        Intrinsics.checkNotNullParameter(draftFunctions, "draftFunctions");
        Intrinsics.checkNotNullParameter(lastCallback, "lastCallback");
        BaseViewModel.m8644f(this, null, null, null, null, null, new ToCorrectDetailViewModel$commitAndChangeQuestionToNext$1(this, draftFunctions, lastCallback, null), 31, null);
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: t */
    public void mo9306t(C7459j draftFunctions) {
        Intrinsics.checkNotNullParameter(draftFunctions, "draftFunctions");
        BaseViewModel.m8644f(this, null, null, null, null, null, new ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1(this, draftFunctions, null), 31, null);
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: u */
    public void mo9308u(C7459j draftFunctions, Function0 callback) {
        Intrinsics.checkNotNullParameter(draftFunctions, "draftFunctions");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseViewModel.m8644f(this, null, null, null, null, null, new ToCorrectDetailViewModel$commitAndSubmitTask$1(this, draftFunctions, callback, null), 31, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0149  */
    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo9311v0(com.zykj.evaluation.bean.TaskDetailInfo r31) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.toCorrect.ToCorrectDetailViewModel.mo9311v0(com.zykj.evaluation.bean.TaskDetailInfo):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel.smali:9122
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a1  */
    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo9313w0(com.zykj.evaluation.bean.TaskDetailInfo r35, java.util.Map r36) {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.toCorrect.ToCorrectDetailViewModel.mo9313w0(com.zykj.evaluation.bean.TaskDetailInfo, java.util.Map):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel.smali:9924
    }

    @Override // com.zykj.evaluation.p057ui.detail.BaseDetailViewModel
    /* renamed from: y0 */
    public void mo9317y0(List questionList, int index) {
        Intrinsics.checkNotNullParameter(questionList, "questionList");
        if (index >= 0 && index < questionList.size()) {
            GuideQuestion guideQuestion = (GuideQuestion) questionList.get(index);
            m9289h0(C6897b.m9427b(m9312w(), guideQuestion.getTitle(), (index + 1) + "/" + questionList.size(), null, null, false, null, null, false, false, null, false, null, null, null, false, false, index == 0 ? "第一题" : "上一题", index == questionList.size() + (-1) ? "保存答案" : "保存,下一题", 0L, null, 851964, null));
        }
    }
}

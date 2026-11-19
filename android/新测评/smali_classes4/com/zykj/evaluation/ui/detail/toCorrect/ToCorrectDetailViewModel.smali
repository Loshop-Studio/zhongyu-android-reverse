.class public final Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;
.super Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001BG\u0008\u0007\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0008\u0001\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u00cb\u0001\u0010*\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00172\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b0\u00170\u001a2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u00172\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u00172\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\"0!j\u0008\u0012\u0004\u0012\u00020\"`#2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020%0!j\u0008\u0012\u0004\u0012\u00020%`#2\u0016\u0010\'\u001a\u0012\u0012\u0004\u0012\u00020%0!j\u0008\u0012\u0004\u0012\u00020%`#2\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020%0!j\u0008\u0012\u0004\u0012\u00020%`#H\u0002\u00a2\u0006\u0004\u0008*\u0010+J\u00b9\u0001\u00101\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u001b2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u00172\u0008\u0010/\u001a\u0004\u0018\u00010\u001d2\u0008\u00100\u001a\u0004\u0018\u00010\u001f2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\"0!j\u0008\u0012\u0004\u0012\u00020\"`#2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020%0!j\u0008\u0012\u0004\u0012\u00020%`#2\u0016\u0010\'\u001a\u0012\u0012\u0004\u0012\u00020%0!j\u0008\u0012\u0004\u0012\u00020%`#2\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020%0!j\u0008\u0012\u0004\u0012\u00020%`#H\u0002\u00a2\u0006\u0004\u00081\u00102J\u0017\u00105\u001a\u00020\u00132\u0006\u00104\u001a\u000203H\u0002\u00a2\u0006\u0004\u00085\u00106J\u0018\u00107\u001a\u00020)2\u0006\u00104\u001a\u000203H\u0082@\u00a2\u0006\u0004\u00087\u00108J\u0010\u00109\u001a\u00020)H\u0082@\u00a2\u0006\u0004\u00089\u0010:J\u0010\u0010;\u001a\u00020)H\u0082@\u00a2\u0006\u0004\u0008;\u0010:J\u0017\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008>\u0010?J\u001f\u0010C\u001a\u00020)2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008C\u0010DJ%\u0010H\u001a\u00020)2\u000c\u0010F\u001a\u0008\u0012\u0004\u0012\u00020E0\u00172\u0006\u0010G\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008H\u0010IJ\u0017\u0010L\u001a\u00020)2\u0006\u0010K\u001a\u00020JH\u0016\u00a2\u0006\u0004\u0008L\u0010MJ1\u0010N\u001a\u00020)2\u0006\u0010K\u001a\u00020J2\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b0\u00170\u001aH\u0016\u00a2\u0006\u0004\u0008N\u0010OJ#\u0010R\u001a\u00020)2\u0006\u0010P\u001a\u00020\u001b2\u000c\u0010Q\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u0017\u00a2\u0006\u0004\u0008R\u0010SJ\u0015\u0010U\u001a\u00020)2\u0006\u0010T\u001a\u00020\u0013\u00a2\u0006\u0004\u0008U\u0010VJ\u001a\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010P\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0004\u0008X\u0010YJ\u0017\u0010Z\u001a\u00020)2\u0006\u00104\u001a\u000203H\u0016\u00a2\u0006\u0004\u0008Z\u0010[J%\u0010^\u001a\u00020)2\u0006\u00104\u001a\u0002032\u000c\u0010]\u001a\u0008\u0012\u0004\u0012\u00020)0\\H\u0016\u00a2\u0006\u0004\u0008^\u0010_J%\u0010a\u001a\u00020)2\u0006\u00104\u001a\u0002032\u000c\u0010`\u001a\u0008\u0012\u0004\u0012\u00020)0\\H\u0016\u00a2\u0006\u0004\u0008a\u0010_J%\u0010b\u001a\u00020)2\u0006\u00104\u001a\u0002032\u000c\u0010`\u001a\u0008\u0012\u0004\u0012\u00020)0\\H\u0016\u00a2\u0006\u0004\u0008b\u0010_R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008c\u0010dR\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008e\u0010dR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008f\u0010gR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008h\u0010iR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008j\u0010kR\u0016\u0010n\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008l\u0010mR$\u0010r\u001a\u0012\u0012\u0004\u0012\u00020o0!j\u0008\u0012\u0004\u0012\u00020o`#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008p\u0010q\u00a8\u0006s"
    }
    d2 = {
        "Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;",
        "Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "userInfo",
        "Lcom/zykj/http/bean/HeaderBean;",
        "headerBeanFlow",
        "Lcom/zykj/evaluation/di/AppDatabase;",
        "database",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "ossTaskManger",
        "Lcom/zykj/evaluation/submit/SubmitTaskManger;",
        "submitTaskManger",
        "Lp5/j;",
        "service",
        "<init>",
        "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/di/AppDatabase;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lp5/j;)V",
        "",
        "specificTrainingType",
        "",
        "revisingAnswered",
        "",
        "questionId",
        "",
        "Lcom/zykj/evaluation/bean/DetailSubQuestion;",
        "subQuestionList",
        "",
        "",
        "localAnswerMap",
        "Lcom/zykj/evaluation/bean/DetailAnswerInfo;",
        "answerList",
        "Lcom/zykj/evaluation/bean/RevisingRecord;",
        "lastRevisingRecordList",
        "Ljava/util/ArrayList;",
        "Lw5/f;",
        "Lkotlin/collections/ArrayList;",
        "scoreList",
        "Lcom/zykj/evaluation/ui/detail/c;",
        "localAnswerList",
        "examAnswerList",
        "reviseAnswerList",
        "",
        "R0",
        "(IZJLjava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V",
        "subQuestion",
        "numberString",
        "localAnswers",
        "answer",
        "revisingRecord",
        "Q0",
        "(IZJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Ljava/util/List;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Lcom/zykj/evaluation/bean/RevisingRecord;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V",
        "Lf6/j;",
        "draftFunctions",
        "U0",
        "(Lf6/j;)Z",
        "N0",
        "(Lf6/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "S0",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "T0",
        "result",
        "Lcom/zykj/evaluation/ui/detail/f;",
        "O0",
        "(I)Lcom/zykj/evaluation/ui/detail/f;",
        "Lcom/zykj/evaluation/bean/bundle/DetailBundle;",
        "detailBundle",
        "isSpecial",
        "U",
        "(Lcom/zykj/evaluation/bean/bundle/DetailBundle;Z)V",
        "Lcom/zykj/evaluation/ui/detail/GuideQuestion;",
        "questionList",
        "index",
        "y0",
        "(Ljava/util/List;I)V",
        "Lcom/zykj/evaluation/bean/TaskDetailInfo;",
        "taskDetailInfo",
        "v0",
        "(Lcom/zykj/evaluation/bean/TaskDetailInfo;)V",
        "w0",
        "(Lcom/zykj/evaluation/bean/TaskDetailInfo;Ljava/util/Map;)V",
        "uuid",
        "localAnswer",
        "V0",
        "(Ljava/lang/String;Ljava/util/List;)V",
        "isInCorrect",
        "M0",
        "(Z)V",
        "Landroid/graphics/Bitmap;",
        "P0",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "t",
        "(Lf6/j;)V",
        "Lkotlin/Function0;",
        "lastCallback",
        "s",
        "(Lf6/j;Lkotlin/jvm/functions/Function0;)V",
        "callback",
        "u",
        "r",
        "w",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "x",
        "y",
        "Lcom/zykj/evaluation/di/AppDatabase;",
        "z",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "A",
        "Lcom/zykj/evaluation/submit/SubmitTaskManger;",
        "B",
        "Z",
        "hasLocalAnswerChanged",
        "Lcom/zykj/evaluation/utils/NeedReviseData;",
        "C",
        "Ljava/util/ArrayList;",
        "isQuestionNeedReviseList",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nToCorrectDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToCorrectDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel\n+ 2 ArrayMap.jvm.kt\nandroidx/collection/ArrayMapKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 9 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1099:1\n27#2:1100\n27#2:1103\n27#2:1239\n1869#3,2:1101\n1869#3,2:1104\n1563#3:1106\n1634#3,3:1107\n1869#3:1110\n1869#3,2:1111\n1870#3:1113\n1761#3,3:1114\n1563#3:1117\n1634#3,2:1118\n295#3,2:1120\n1563#3:1122\n1634#3,3:1123\n1636#3:1126\n1878#3,3:1128\n1878#3,3:1131\n774#3:1134\n865#3,2:1135\n295#3,2:1137\n774#3:1139\n865#3,2:1140\n295#3,2:1142\n1563#3:1144\n1634#3,3:1145\n295#3,2:1148\n1563#3:1150\n1634#3,3:1151\n295#3,2:1154\n1563#3:1156\n1634#3,3:1157\n1563#3:1160\n1634#3,3:1161\n1563#3:1164\n1634#3,3:1165\n1563#3:1168\n1634#3,2:1169\n1563#3:1171\n1634#3,3:1172\n1636#3:1175\n295#3,2:1176\n774#3:1179\n865#3,2:1180\n1617#3,9:1182\n1869#3:1191\n1870#3:1193\n1626#3:1194\n1761#3,2:1201\n1761#3,3:1203\n1763#3:1206\n2746#3,3:1207\n1491#3:1210\n1516#3,3:1211\n1519#3,3:1221\n1563#3:1227\n1634#3,3:1228\n774#3:1232\n865#3,2:1233\n1563#3:1235\n1634#3,3:1236\n1869#3,2:1240\n1563#3:1242\n1634#3,2:1243\n295#3,2:1245\n1636#3:1247\n1869#3,2:1248\n1#4:1127\n1#4:1192\n17#5:1178\n37#6:1195\n36#6,3:1196\n13472#7,2:1199\n382#8,7:1214\n126#9:1224\n153#9,2:1225\n155#9:1231\n*S KotlinDebug\n*F\n+ 1 ToCorrectDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel\n*L\n158#1:1100\n164#1:1103\n983#1:1239\n159#1:1101,2\n165#1:1104,2\n186#1:1106\n186#1:1107,3\n200#1:1110\n215#1:1111,2\n200#1:1113\n258#1:1114,3\n260#1:1117\n260#1:1118,2\n264#1:1120,2\n267#1:1122\n267#1:1123,3\n260#1:1126\n337#1:1128,3\n394#1:1131,3\n432#1:1134\n432#1:1135,2\n435#1:1137,2\n451#1:1139\n451#1:1140,2\n454#1:1142,2\n560#1:1144\n560#1:1145,3\n573#1:1148,2\n622#1:1150\n622#1:1151,3\n652#1:1154,2\n655#1:1156\n655#1:1157,3\n677#1:1160\n677#1:1161,3\n701#1:1164\n701#1:1165,3\n744#1:1168\n744#1:1169,2\n748#1:1171\n748#1:1172,3\n744#1:1175\n778#1:1176,2\n794#1:1179\n794#1:1180,2\n796#1:1182,9\n796#1:1191\n796#1:1193\n796#1:1194\n942#1:1201,2\n943#1:1203,3\n942#1:1206\n946#1:1207,3\n953#1:1210\n953#1:1211,3\n953#1:1221,3\n957#1:1227\n957#1:1228,3\n963#1:1232\n963#1:1233,2\n964#1:1235\n964#1:1236,3\n985#1:1240,2\n1007#1:1242\n1007#1:1243,2\n1009#1:1245,2\n1007#1:1247\n1023#1:1248,2\n796#1:1192\n788#1:1178\n807#1:1195\n807#1:1196,3\n909#1:1199,2\n953#1:1214,7\n954#1:1224\n954#1:1225,2\n954#1:1231\n*E\n"
    }
.end annotation


# instance fields
.field public final A:Lcom/zykj/evaluation/submit/SubmitTaskManger;

.field public B:Z

.field public final C:Ljava/util/ArrayList;

.field public final w:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final x:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final y:Lcom/zykj/evaluation/di/AppDatabase;

.field public final z:Lcom/zykj/evaluation/upload/OssTaskManger;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/di/AppDatabase;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lp5/j;)V
    .locals 1

    .line 1
    const-string v0, "userInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "headerBeanFlow"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "database"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "ossTaskManger"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "submitTaskManger"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "service"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, p1, p6}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lp5/j;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 35
    .line 36
    iput-object p2, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->x:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 37
    .line 38
    iput-object p3, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->y:Lcom/zykj/evaluation/di/AppDatabase;

    .line 39
    .line 40
    iput-object p4, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->z:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 41
    .line 42
    iput-object p5, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->A:Lcom/zykj/evaluation/submit/SubmitTaskManger;

    .line 43
    .line 44
    new-instance p1, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->C:Ljava/util/ArrayList;

    .line 50
    .line 51
    return-void
.end method

.method public static final synthetic A0(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->q(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic B0(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lf6/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->N0(Lf6/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic C0(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->B(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic D0(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->E()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic E0(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->L()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic F0(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lcom/zykj/evaluation/ui/detail/GuideQuestion;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->R(Lcom/zykj/evaluation/ui/detail/GuideQuestion;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic G0(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;)Lcom/zykj/evaluation/submit/SubmitTaskManger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->A:Lcom/zykj/evaluation/submit/SubmitTaskManger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic H0(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic I0(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->S0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic J0(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->C:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic K0(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->T0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic L0(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x0(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic z0(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->p(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final M0(Z)V
    .locals 15

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v13, 0xffb

    .line 6
    .line 7
    const/4 v14, 0x0

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v9, 0x0

    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v11, 0x0

    .line 18
    const/4 v12, 0x0

    .line 19
    move/from16 v3, p1

    .line 20
    .line 21
    invoke-static/range {v0 .. v14}, Lw5/e;->b(Lw5/e;Ljava/util/List;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lw5/e;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p0, v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i0(Lw5/e;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final N0(Lf6/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->n:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->n:I

    .line 22
    .line 23
    :goto_0
    move-object v11, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->l:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget v3, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->n:I

    .line 38
    .line 39
    const-string v12, "getId(...)"

    .line 40
    .line 41
    const/4 v13, 0x4

    .line 42
    const/4 v14, 0x3

    .line 43
    const/4 v4, 0x2

    .line 44
    const/4 v5, 0x1

    .line 45
    const/4 v6, 0x0

    .line 46
    if-eqz v3, :cond_5

    .line 47
    .line 48
    if-eq v3, v5, :cond_4

    .line 49
    .line 50
    if-eq v3, v4, :cond_3

    .line 51
    .line 52
    if-eq v3, v14, :cond_2

    .line 53
    .line 54
    if-ne v3, v13, :cond_1

    .line 55
    .line 56
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->g:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, Ljava/util/ArrayList;

    .line 59
    .line 60
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->f:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, Ljava/util/List;

    .line 63
    .line 64
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->e:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, Ljava/util/ArrayList;

    .line 67
    .line 68
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->d:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v2, Landroidx/collection/ArrayMap;

    .line 71
    .line 72
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 75
    .line 76
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, Ln5/v;

    .line 79
    .line 80
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->a:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v2, Lf6/j;

    .line 83
    .line 84
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_21

    .line 88
    .line 89
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 92
    .line 93
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw v1

    .line 97
    :cond_2
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->f:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v2, Ljava/util/List;

    .line 100
    .line 101
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->e:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v2, Ljava/util/List;

    .line 104
    .line 105
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->d:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v2, Ln5/v;

    .line 108
    .line 109
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->c:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 112
    .line 113
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->b:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v2, Ln5/v;

    .line 116
    .line 117
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->a:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v2, Lf6/j;

    .line 120
    .line 121
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    goto/16 :goto_15

    .line 125
    .line 126
    :cond_3
    iget v3, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->h:I

    .line 127
    .line 128
    iget-object v4, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->f:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v4, Ljava/io/File;

    .line 131
    .line 132
    iget-object v4, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->e:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v4, Ljava/lang/String;

    .line 135
    .line 136
    iget-object v4, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->d:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v4, Landroid/graphics/Bitmap;

    .line 139
    .line 140
    iget-object v4, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->c:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 143
    .line 144
    iget-object v7, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->b:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v7, Ln5/v;

    .line 147
    .line 148
    iget-object v8, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->a:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v8, Lf6/j;

    .line 151
    .line 152
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    move/from16 v16, v5

    .line 156
    .line 157
    move-object v1, v8

    .line 158
    const/4 v8, 0x0

    .line 159
    goto/16 :goto_6

    .line 160
    .line 161
    :cond_4
    iget-object v3, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->a:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v3, Lf6/j;

    .line 164
    .line 165
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    move-object v13, v3

    .line 169
    move-object v3, v1

    .line 170
    move-object v1, v13

    .line 171
    move v14, v4

    .line 172
    move/from16 v16, v5

    .line 173
    .line 174
    move v13, v6

    .line 175
    goto :goto_2

    .line 176
    :cond_5
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->y:Lcom/zykj/evaluation/di/AppDatabase;

    .line 180
    .line 181
    invoke-virtual {v1}, Lcom/zykj/evaluation/di/AppDatabase;->j()Ln5/w;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 186
    .line 187
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    check-cast v1, Lcom/zykj/message/server/bean/UserInfo;

    .line 192
    .line 193
    invoke-virtual {v1}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-static {v1, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 201
    .line 202
    .line 203
    move-result-wide v7

    .line 204
    move v1, v6

    .line 205
    move-wide v8, v7

    .line 206
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->N()J

    .line 207
    .line 208
    .line 209
    move-result-wide v6

    .line 210
    sget-object v10, Lcom/zykj/evaluation/bean/TaskState$ToCorrect;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$ToCorrect;

    .line 211
    .line 212
    invoke-virtual {v10}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 213
    .line 214
    .line 215
    move-result v10

    .line 216
    move-wide/from16 v16, v8

    .line 217
    .line 218
    move v8, v10

    .line 219
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->Q()J

    .line 220
    .line 221
    .line 222
    move-result-wide v9

    .line 223
    move-object/from16 v1, p1

    .line 224
    .line 225
    iput-object v1, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->a:Ljava/lang/Object;

    .line 226
    .line 227
    iput v5, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->n:I

    .line 228
    .line 229
    move v14, v4

    .line 230
    const/4 v13, 0x0

    .line 231
    move-wide/from16 v35, v16

    .line 232
    .line 233
    move/from16 v16, v5

    .line 234
    .line 235
    move-wide/from16 v4, v35

    .line 236
    .line 237
    invoke-interface/range {v3 .. v11}, Ln5/w;->d(JJIJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    if-ne v3, v2, :cond_6

    .line 242
    .line 243
    goto/16 :goto_20

    .line 244
    .line 245
    :cond_6
    :goto_2
    move-object v7, v3

    .line 246
    check-cast v7, Ln5/v;

    .line 247
    .line 248
    new-instance v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 249
    .line 250
    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 251
    .line 252
    .line 253
    new-instance v18, Lcom/zykj/evaluation/bean/UploadData;

    .line 254
    .line 255
    const/16 v23, 0xd

    .line 256
    .line 257
    const/16 v24, 0x0

    .line 258
    .line 259
    const/16 v19, 0x0

    .line 260
    .line 261
    const-string v20, ""

    .line 262
    .line 263
    const/16 v21, 0x0

    .line 264
    .line 265
    const/16 v22, 0x0

    .line 266
    .line 267
    invoke-direct/range {v18 .. v24}, Lcom/zykj/evaluation/bean/UploadData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 268
    .line 269
    .line 270
    move-object/from16 v3, v18

    .line 271
    .line 272
    iput-object v3, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 273
    .line 274
    invoke-virtual {v1}, Lf6/j;->j()Lkotlin/jvm/functions/Function0;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    check-cast v3, Ljava/lang/Boolean;

    .line 283
    .line 284
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    if-nez v3, :cond_8

    .line 289
    .line 290
    invoke-virtual {v1}, Lf6/j;->k()Lkotlin/jvm/functions/Function0;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    check-cast v3, Ljava/lang/Boolean;

    .line 299
    .line 300
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    if-nez v3, :cond_7

    .line 305
    .line 306
    if-eqz v7, :cond_8

    .line 307
    .line 308
    invoke-virtual {v7}, Ln5/v;->f()Lcom/zykj/evaluation/bean/UploadData;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    if-eqz v3, :cond_8

    .line 313
    .line 314
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/UploadData;->getCommitState()I

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    sget-object v5, Lm5/e$b;->b:Lm5/e$b;

    .line 319
    .line 320
    invoke-virtual {v5}, Lm5/e;->a()I

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    if-ne v3, v5, :cond_8

    .line 325
    .line 326
    :cond_7
    move v5, v13

    .line 327
    goto :goto_3

    .line 328
    :cond_8
    move/from16 v5, v16

    .line 329
    .line 330
    :goto_3
    if-eqz v5, :cond_f

    .line 331
    .line 332
    invoke-virtual {v1}, Lf6/j;->g()Lkotlin/jvm/functions/Function0;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    check-cast v3, Landroid/graphics/Bitmap;

    .line 341
    .line 342
    if-eqz v3, :cond_e

    .line 343
    .line 344
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->K()Lg7/e;

    .line 345
    .line 346
    .line 347
    move-result-object v6

    .line 348
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->Q()J

    .line 349
    .line 350
    .line 351
    move-result-wide v8

    .line 352
    invoke-virtual {v6, v8, v9}, Lg7/e;->i(J)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v6

    .line 356
    new-instance v8, Ljava/io/File;

    .line 357
    .line 358
    invoke-direct {v8, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    .line 362
    .line 363
    .line 364
    move-result v9

    .line 365
    if-nez v9, :cond_9

    .line 366
    .line 367
    invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z

    .line 368
    .line 369
    .line 370
    :cond_9
    invoke-virtual {v8}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 371
    .line 372
    .line 373
    move-result-object v9

    .line 374
    if-eqz v9, :cond_c

    .line 375
    .line 376
    array-length v10, v9

    .line 377
    :goto_4
    if-ge v13, v10, :cond_b

    .line 378
    .line 379
    aget-object v19, v9, v13

    .line 380
    .line 381
    invoke-virtual/range {v19 .. v19}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v14

    .line 385
    const-string v15, "getName(...)"

    .line 386
    .line 387
    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    const-string v15, ".webp"

    .line 391
    .line 392
    move-object/from16 p1, v1

    .line 393
    .line 394
    move-object/from16 v22, v6

    .line 395
    .line 396
    move-object/from16 v23, v8

    .line 397
    .line 398
    const/4 v1, 0x0

    .line 399
    const/4 v6, 0x2

    .line 400
    const/4 v8, 0x0

    .line 401
    invoke-static {v14, v15, v8, v6, v1}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v14

    .line 405
    if-eqz v14, :cond_a

    .line 406
    .line 407
    invoke-virtual/range {v19 .. v19}, Ljava/io/File;->delete()Z

    .line 408
    .line 409
    .line 410
    move-result v1

    .line 411
    invoke-virtual/range {v19 .. v19}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v6

    .line 415
    new-instance v8, Ljava/lang/StringBuilder;

    .line 416
    .line 417
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 418
    .line 419
    .line 420
    const-string v14, "\u6e05\u7406\u65e7\u8349\u7a3f\u56fe\u7247: "

    .line 421
    .line 422
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    const-string v6, ", \u7ed3\u679c: "

    .line 429
    .line 430
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    :cond_a
    add-int/lit8 v13, v13, 0x1

    .line 448
    .line 449
    move-object/from16 v1, p1

    .line 450
    .line 451
    move-object/from16 v6, v22

    .line 452
    .line 453
    move-object/from16 v8, v23

    .line 454
    .line 455
    const/4 v14, 0x2

    .line 456
    goto :goto_4

    .line 457
    :cond_b
    move-object/from16 p1, v1

    .line 458
    .line 459
    move-object/from16 v22, v6

    .line 460
    .line 461
    move-object/from16 v23, v8

    .line 462
    .line 463
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 464
    .line 465
    goto :goto_5

    .line 466
    :cond_c
    move-object/from16 p1, v1

    .line 467
    .line 468
    move-object/from16 v22, v6

    .line 469
    .line 470
    move-object/from16 v23, v8

    .line 471
    .line 472
    :goto_5
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    new-instance v6, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$2$2;

    .line 477
    .line 478
    const/4 v8, 0x0

    .line 479
    invoke-direct {v6, v0, v3, v4, v8}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$2$2;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Landroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    .line 480
    .line 481
    .line 482
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v9

    .line 486
    iput-object v9, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->a:Ljava/lang/Object;

    .line 487
    .line 488
    iput-object v7, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->b:Ljava/lang/Object;

    .line 489
    .line 490
    iput-object v4, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->c:Ljava/lang/Object;

    .line 491
    .line 492
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v3

    .line 496
    iput-object v3, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->d:Ljava/lang/Object;

    .line 497
    .line 498
    invoke-static/range {v22 .. v22}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v3

    .line 502
    iput-object v3, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->e:Ljava/lang/Object;

    .line 503
    .line 504
    invoke-static/range {v23 .. v23}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v3

    .line 508
    iput-object v3, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->f:Ljava/lang/Object;

    .line 509
    .line 510
    iput v5, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->h:I

    .line 511
    .line 512
    const/4 v13, 0x0

    .line 513
    iput v13, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->i:I

    .line 514
    .line 515
    const/4 v14, 0x2

    .line 516
    iput v14, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->n:I

    .line 517
    .line 518
    invoke-static {v1, v6, v11}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    if-ne v1, v2, :cond_d

    .line 523
    .line 524
    goto/16 :goto_20

    .line 525
    .line 526
    :cond_d
    move-object/from16 v1, p1

    .line 527
    .line 528
    move v3, v5

    .line 529
    :goto_6
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 530
    .line 531
    move v5, v3

    .line 532
    :goto_7
    move-object/from16 v19, v7

    .line 533
    .line 534
    goto :goto_9

    .line 535
    :cond_e
    move-object/from16 p1, v1

    .line 536
    .line 537
    const/4 v8, 0x0

    .line 538
    goto :goto_8

    .line 539
    :cond_f
    move-object/from16 p1, v1

    .line 540
    .line 541
    const/4 v8, 0x0

    .line 542
    if-eqz v7, :cond_10

    .line 543
    .line 544
    invoke-virtual {v7}, Ln5/v;->f()Lcom/zykj/evaluation/bean/UploadData;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    if-eqz v1, :cond_10

    .line 549
    .line 550
    iput-object v1, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 551
    .line 552
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 553
    .line 554
    :cond_10
    :goto_8
    move-object/from16 v1, p1

    .line 555
    .line 556
    goto :goto_7

    .line 557
    :goto_9
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 558
    .line 559
    .line 560
    move-result-object v3

    .line 561
    invoke-virtual {v3}, Lw5/e;->f()Ljava/util/List;

    .line 562
    .line 563
    .line 564
    move-result-object v3

    .line 565
    if-eqz v3, :cond_12

    .line 566
    .line 567
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 568
    .line 569
    .line 570
    move-result v6

    .line 571
    if-eqz v6, :cond_12

    .line 572
    .line 573
    :cond_11
    const/4 v3, 0x0

    .line 574
    goto :goto_b

    .line 575
    :cond_12
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 576
    .line 577
    .line 578
    move-result-object v3

    .line 579
    :cond_13
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 580
    .line 581
    .line 582
    move-result v6

    .line 583
    if-eqz v6, :cond_11

    .line 584
    .line 585
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v6

    .line 589
    check-cast v6, Lcom/zykj/evaluation/ui/detail/c;

    .line 590
    .line 591
    invoke-virtual {v6}, Lcom/zykj/evaluation/ui/detail/c;->c()Ljava/util/List;

    .line 592
    .line 593
    .line 594
    move-result-object v6

    .line 595
    if-eqz v6, :cond_14

    .line 596
    .line 597
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 598
    .line 599
    .line 600
    move-result v7

    .line 601
    if-eqz v7, :cond_14

    .line 602
    .line 603
    goto :goto_a

    .line 604
    :cond_14
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 605
    .line 606
    .line 607
    move-result-object v6

    .line 608
    :cond_15
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 609
    .line 610
    .line 611
    move-result v7

    .line 612
    if-eqz v7, :cond_13

    .line 613
    .line 614
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v7

    .line 618
    check-cast v7, Ljava/lang/String;

    .line 619
    .line 620
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 621
    .line 622
    .line 623
    move-result v7

    .line 624
    if-lez v7, :cond_15

    .line 625
    .line 626
    move/from16 v3, v16

    .line 627
    .line 628
    :goto_b
    if-eqz v3, :cond_19

    .line 629
    .line 630
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 631
    .line 632
    .line 633
    move-result-object v6

    .line 634
    invoke-virtual {v6}, Lw5/e;->f()Ljava/util/List;

    .line 635
    .line 636
    .line 637
    move-result-object v6

    .line 638
    if-eqz v6, :cond_16

    .line 639
    .line 640
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 641
    .line 642
    .line 643
    move-result v7

    .line 644
    if-eqz v7, :cond_16

    .line 645
    .line 646
    goto :goto_c

    .line 647
    :cond_16
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 648
    .line 649
    .line 650
    move-result-object v6

    .line 651
    :cond_17
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 652
    .line 653
    .line 654
    move-result v7

    .line 655
    if-eqz v7, :cond_18

    .line 656
    .line 657
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v7

    .line 661
    check-cast v7, Lcom/zykj/evaluation/ui/detail/c;

    .line 662
    .line 663
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->A()Landroidx/collection/ArrayMap;

    .line 664
    .line 665
    .line 666
    move-result-object v9

    .line 667
    invoke-virtual {v7}, Lcom/zykj/evaluation/ui/detail/c;->l()Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v7

    .line 671
    invoke-virtual {v9, v7}, Landroidx/collection/ArrayMap;->containsKey(Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    move-result v7

    .line 675
    if-eqz v7, :cond_17

    .line 676
    .line 677
    goto :goto_d

    .line 678
    :cond_18
    :goto_c
    move/from16 v6, v16

    .line 679
    .line 680
    goto :goto_e

    .line 681
    :cond_19
    :goto_d
    const/4 v6, 0x0

    .line 682
    :goto_e
    const-string v7, ""

    .line 683
    .line 684
    const/16 v9, 0xa

    .line 685
    .line 686
    if-eqz v6, :cond_25

    .line 687
    .line 688
    if-nez v5, :cond_25

    .line 689
    .line 690
    if-eqz v19, :cond_24

    .line 691
    .line 692
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 693
    .line 694
    .line 695
    move-result-object v8

    .line 696
    invoke-virtual {v8}, Lw5/e;->f()Ljava/util/List;

    .line 697
    .line 698
    .line 699
    move-result-object v8

    .line 700
    new-instance v10, Ljava/util/LinkedHashMap;

    .line 701
    .line 702
    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    .line 703
    .line 704
    .line 705
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 706
    .line 707
    .line 708
    move-result-object v8

    .line 709
    :goto_f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 710
    .line 711
    .line 712
    move-result v12

    .line 713
    if-eqz v12, :cond_1b

    .line 714
    .line 715
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v12

    .line 719
    move-object v13, v12

    .line 720
    check-cast v13, Lcom/zykj/evaluation/ui/detail/c;

    .line 721
    .line 722
    invoke-virtual {v13}, Lcom/zykj/evaluation/ui/detail/c;->h()J

    .line 723
    .line 724
    .line 725
    move-result-wide v13

    .line 726
    invoke-static {v13, v14}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 727
    .line 728
    .line 729
    move-result-object v13

    .line 730
    invoke-interface {v10, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v14

    .line 734
    if-nez v14, :cond_1a

    .line 735
    .line 736
    new-instance v14, Ljava/util/ArrayList;

    .line 737
    .line 738
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 739
    .line 740
    .line 741
    invoke-interface {v10, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    :cond_1a
    check-cast v14, Ljava/util/List;

    .line 745
    .line 746
    invoke-interface {v14, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 747
    .line 748
    .line 749
    goto :goto_f

    .line 750
    :cond_1b
    new-instance v8, Ljava/util/ArrayList;

    .line 751
    .line 752
    invoke-interface {v10}, Ljava/util/Map;->size()I

    .line 753
    .line 754
    .line 755
    move-result v12

    .line 756
    invoke-direct {v8, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 757
    .line 758
    .line 759
    invoke-interface {v10}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 760
    .line 761
    .line 762
    move-result-object v10

    .line 763
    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 764
    .line 765
    .line 766
    move-result-object v10

    .line 767
    :goto_10
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 768
    .line 769
    .line 770
    move-result v12

    .line 771
    if-eqz v12, :cond_1d

    .line 772
    .line 773
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v12

    .line 777
    check-cast v12, Ljava/util/Map$Entry;

    .line 778
    .line 779
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    move-result-object v13

    .line 783
    check-cast v13, Ljava/lang/Number;

    .line 784
    .line 785
    invoke-virtual {v13}, Ljava/lang/Number;->longValue()J

    .line 786
    .line 787
    .line 788
    move-result-wide v21

    .line 789
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v12

    .line 793
    check-cast v12, Ljava/util/List;

    .line 794
    .line 795
    new-instance v13, Ljava/util/ArrayList;

    .line 796
    .line 797
    invoke-static {v12, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 798
    .line 799
    .line 800
    move-result v14

    .line 801
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 802
    .line 803
    .line 804
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 805
    .line 806
    .line 807
    move-result-object v12

    .line 808
    :goto_11
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 809
    .line 810
    .line 811
    move-result v14

    .line 812
    if-eqz v14, :cond_1c

    .line 813
    .line 814
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    move-result-object v14

    .line 818
    check-cast v14, Lcom/zykj/evaluation/ui/detail/c;

    .line 819
    .line 820
    new-instance v15, Lcom/zykj/evaluation/bean/CommitAnswer;

    .line 821
    .line 822
    invoke-virtual {v14}, Lcom/zykj/evaluation/ui/detail/c;->l()Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v9

    .line 826
    invoke-virtual {v14}, Lcom/zykj/evaluation/ui/detail/c;->c()Ljava/util/List;

    .line 827
    .line 828
    .line 829
    move-result-object v14

    .line 830
    invoke-direct {v15, v9, v14}, Lcom/zykj/evaluation/bean/CommitAnswer;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 831
    .line 832
    .line 833
    invoke-interface {v13, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 834
    .line 835
    .line 836
    const/16 v9, 0xa

    .line 837
    .line 838
    goto :goto_11

    .line 839
    :cond_1c
    new-instance v20, Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    .line 840
    .line 841
    const/16 v23, 0x0

    .line 842
    .line 843
    const/16 v25, 0x2

    .line 844
    .line 845
    const/16 v26, 0x0

    .line 846
    .line 847
    move-object/from16 v24, v13

    .line 848
    .line 849
    invoke-direct/range {v20 .. v26}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;-><init>(JLjava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 850
    .line 851
    .line 852
    move-object/from16 v9, v20

    .line 853
    .line 854
    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 855
    .line 856
    .line 857
    const/16 v9, 0xa

    .line 858
    .line 859
    goto :goto_10

    .line 860
    :cond_1d
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 861
    .line 862
    .line 863
    move-result-object v9

    .line 864
    invoke-virtual {v9}, Lw5/e;->f()Ljava/util/List;

    .line 865
    .line 866
    .line 867
    move-result-object v9

    .line 868
    new-instance v10, Ljava/util/ArrayList;

    .line 869
    .line 870
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 871
    .line 872
    .line 873
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 874
    .line 875
    .line 876
    move-result-object v9

    .line 877
    :cond_1e
    :goto_12
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 878
    .line 879
    .line 880
    move-result v12

    .line 881
    if-eqz v12, :cond_20

    .line 882
    .line 883
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 884
    .line 885
    .line 886
    move-result-object v12

    .line 887
    move-object v13, v12

    .line 888
    check-cast v13, Lcom/zykj/evaluation/ui/detail/c;

    .line 889
    .line 890
    invoke-virtual {v13}, Lcom/zykj/evaluation/ui/detail/c;->k()Li6/p0;

    .line 891
    .line 892
    .line 893
    move-result-object v14

    .line 894
    instance-of v14, v14, Li6/p0$c;

    .line 895
    .line 896
    if-nez v14, :cond_1f

    .line 897
    .line 898
    invoke-virtual {v13}, Lcom/zykj/evaluation/ui/detail/c;->k()Li6/p0;

    .line 899
    .line 900
    .line 901
    move-result-object v13

    .line 902
    instance-of v13, v13, Li6/p0$a;

    .line 903
    .line 904
    if-eqz v13, :cond_1e

    .line 905
    .line 906
    :cond_1f
    invoke-interface {v10, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 907
    .line 908
    .line 909
    goto :goto_12

    .line 910
    :cond_20
    new-instance v9, Ljava/util/ArrayList;

    .line 911
    .line 912
    const/16 v12, 0xa

    .line 913
    .line 914
    invoke-static {v10, v12}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 915
    .line 916
    .line 917
    move-result v12

    .line 918
    invoke-direct {v9, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 919
    .line 920
    .line 921
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 922
    .line 923
    .line 924
    move-result v12

    .line 925
    const/4 v13, 0x0

    .line 926
    :goto_13
    if-ge v13, v12, :cond_22

    .line 927
    .line 928
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 929
    .line 930
    .line 931
    move-result-object v14

    .line 932
    add-int/lit8 v13, v13, 0x1

    .line 933
    .line 934
    check-cast v14, Lcom/zykj/evaluation/ui/detail/c;

    .line 935
    .line 936
    new-instance v20, Lcom/zykj/evaluation/bean/UploadData;

    .line 937
    .line 938
    invoke-virtual {v14}, Lcom/zykj/evaluation/ui/detail/c;->l()Ljava/lang/String;

    .line 939
    .line 940
    .line 941
    move-result-object v21

    .line 942
    invoke-virtual {v14}, Lcom/zykj/evaluation/ui/detail/c;->c()Ljava/util/List;

    .line 943
    .line 944
    .line 945
    move-result-object v14

    .line 946
    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 947
    .line 948
    .line 949
    move-result-object v14

    .line 950
    check-cast v14, Ljava/lang/String;

    .line 951
    .line 952
    if-nez v14, :cond_21

    .line 953
    .line 954
    move-object/from16 v22, v7

    .line 955
    .line 956
    goto :goto_14

    .line 957
    :cond_21
    move-object/from16 v22, v14

    .line 958
    .line 959
    :goto_14
    sget-object v14, Lm5/e$b;->b:Lm5/e$b;

    .line 960
    .line 961
    invoke-virtual {v14}, Lm5/e;->a()I

    .line 962
    .line 963
    .line 964
    move-result v24

    .line 965
    const/16 v25, 0x4

    .line 966
    .line 967
    const/16 v26, 0x0

    .line 968
    .line 969
    const/16 v23, 0x0

    .line 970
    .line 971
    invoke-direct/range {v20 .. v26}, Lcom/zykj/evaluation/bean/UploadData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 972
    .line 973
    .line 974
    move-object/from16 v14, v20

    .line 975
    .line 976
    invoke-interface {v9, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 977
    .line 978
    .line 979
    goto :goto_13

    .line 980
    :cond_22
    iget-object v7, v0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->y:Lcom/zykj/evaluation/di/AppDatabase;

    .line 981
    .line 982
    invoke-virtual {v7}, Lcom/zykj/evaluation/di/AppDatabase;->j()Ln5/w;

    .line 983
    .line 984
    .line 985
    move-result-object v7

    .line 986
    sget-object v10, Lm5/e$b;->b:Lm5/e$b;

    .line 987
    .line 988
    invoke-virtual {v10}, Lm5/e;->a()I

    .line 989
    .line 990
    .line 991
    move-result v32

    .line 992
    const/16 v33, 0xdf

    .line 993
    .line 994
    const/16 v34, 0x0

    .line 995
    .line 996
    const-wide/16 v20, 0x0

    .line 997
    .line 998
    const-wide/16 v22, 0x0

    .line 999
    .line 1000
    const/16 v24, 0x0

    .line 1001
    .line 1002
    const-wide/16 v25, 0x0

    .line 1003
    .line 1004
    const/16 v27, 0x0

    .line 1005
    .line 1006
    const/16 v29, 0x0

    .line 1007
    .line 1008
    const/16 v30, 0x0

    .line 1009
    .line 1010
    move-object/from16 v31, v8

    .line 1011
    .line 1012
    move-object/from16 v28, v9

    .line 1013
    .line 1014
    invoke-static/range {v19 .. v34}, Ln5/v;->b(Ln5/v;JJIJLcom/zykj/evaluation/bean/UploadData;Ljava/util/List;ZZLjava/util/List;IILjava/lang/Object;)Ln5/v;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v8

    .line 1018
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v1

    .line 1022
    iput-object v1, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->a:Ljava/lang/Object;

    .line 1023
    .line 1024
    invoke-static/range {v19 .. v19}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v1

    .line 1028
    iput-object v1, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->b:Ljava/lang/Object;

    .line 1029
    .line 1030
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v1

    .line 1034
    iput-object v1, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->c:Ljava/lang/Object;

    .line 1035
    .line 1036
    invoke-static/range {v19 .. v19}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v1

    .line 1040
    iput-object v1, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->d:Ljava/lang/Object;

    .line 1041
    .line 1042
    invoke-static/range {v28 .. v28}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v1

    .line 1046
    iput-object v1, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->e:Ljava/lang/Object;

    .line 1047
    .line 1048
    invoke-static/range {v31 .. v31}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v1

    .line 1052
    iput-object v1, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->f:Ljava/lang/Object;

    .line 1053
    .line 1054
    iput v5, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->h:I

    .line 1055
    .line 1056
    iput v3, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->i:I

    .line 1057
    .line 1058
    iput v6, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->j:I

    .line 1059
    .line 1060
    const/4 v13, 0x0

    .line 1061
    iput v13, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->k:I

    .line 1062
    .line 1063
    const/4 v1, 0x3

    .line 1064
    iput v1, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->n:I

    .line 1065
    .line 1066
    invoke-interface {v7, v8, v11}, Ln5/w;->b(Ln5/v;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v1

    .line 1070
    if-ne v1, v2, :cond_23

    .line 1071
    .line 1072
    goto/16 :goto_20

    .line 1073
    .line 1074
    :cond_23
    :goto_15
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 1075
    .line 1076
    :cond_24
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 1077
    .line 1078
    return-object v1

    .line 1079
    :cond_25
    const/4 v13, 0x0

    .line 1080
    new-instance v9, Landroidx/collection/ArrayMap;

    .line 1081
    .line 1082
    invoke-direct {v9}, Landroidx/collection/ArrayMap;-><init>()V

    .line 1083
    .line 1084
    .line 1085
    new-instance v10, Ljava/util/ArrayList;

    .line 1086
    .line 1087
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v14

    .line 1094
    invoke-virtual {v14}, Lw5/e;->f()Ljava/util/List;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v14

    .line 1098
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v14

    .line 1102
    :goto_16
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 1103
    .line 1104
    .line 1105
    move-result v15

    .line 1106
    if-eqz v15, :cond_2b

    .line 1107
    .line 1108
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v15

    .line 1112
    check-cast v15, Lcom/zykj/evaluation/ui/detail/c;

    .line 1113
    .line 1114
    invoke-virtual {v15}, Lcom/zykj/evaluation/ui/detail/c;->h()J

    .line 1115
    .line 1116
    .line 1117
    move-result-wide v16

    .line 1118
    invoke-static/range {v16 .. v17}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v8

    .line 1122
    invoke-virtual {v9, v8}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v8

    .line 1126
    if-nez v8, :cond_26

    .line 1127
    .line 1128
    invoke-virtual {v15}, Lcom/zykj/evaluation/ui/detail/c;->h()J

    .line 1129
    .line 1130
    .line 1131
    move-result-wide v16

    .line 1132
    invoke-static/range {v16 .. v17}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v8

    .line 1136
    new-instance v13, Ljava/util/ArrayList;

    .line 1137
    .line 1138
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 1139
    .line 1140
    .line 1141
    invoke-interface {v9, v8, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1142
    .line 1143
    .line 1144
    :cond_26
    invoke-virtual {v15}, Lcom/zykj/evaluation/ui/detail/c;->h()J

    .line 1145
    .line 1146
    .line 1147
    move-result-wide v16

    .line 1148
    invoke-static/range {v16 .. v17}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v8

    .line 1152
    invoke-virtual {v9, v8}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v8

    .line 1156
    check-cast v8, Ljava/util/ArrayList;

    .line 1157
    .line 1158
    if-eqz v8, :cond_27

    .line 1159
    .line 1160
    new-instance v13, Lcom/zykj/evaluation/bean/CommitAnswer;

    .line 1161
    .line 1162
    move-object/from16 v16, v1

    .line 1163
    .line 1164
    invoke-virtual {v15}, Lcom/zykj/evaluation/ui/detail/c;->l()Ljava/lang/String;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v1

    .line 1168
    move-object/from16 v17, v7

    .line 1169
    .line 1170
    invoke-virtual {v15}, Lcom/zykj/evaluation/ui/detail/c;->c()Ljava/util/List;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v7

    .line 1174
    invoke-direct {v13, v1, v7}, Lcom/zykj/evaluation/bean/CommitAnswer;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 1175
    .line 1176
    .line 1177
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1178
    .line 1179
    .line 1180
    move-result v1

    .line 1181
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 1182
    .line 1183
    .line 1184
    goto :goto_17

    .line 1185
    :cond_27
    move-object/from16 v16, v1

    .line 1186
    .line 1187
    move-object/from16 v17, v7

    .line 1188
    .line 1189
    :goto_17
    invoke-virtual {v15}, Lcom/zykj/evaluation/ui/detail/c;->k()Li6/p0;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v1

    .line 1193
    instance-of v1, v1, Li6/p0$c;

    .line 1194
    .line 1195
    if-nez v1, :cond_28

    .line 1196
    .line 1197
    invoke-virtual {v15}, Lcom/zykj/evaluation/ui/detail/c;->k()Li6/p0;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v1

    .line 1201
    instance-of v1, v1, Li6/p0$a;

    .line 1202
    .line 1203
    if-eqz v1, :cond_2a

    .line 1204
    .line 1205
    :cond_28
    invoke-virtual {v15}, Lcom/zykj/evaluation/ui/detail/c;->c()Ljava/util/List;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v1

    .line 1209
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v1

    .line 1213
    check-cast v1, Ljava/lang/String;

    .line 1214
    .line 1215
    new-instance v22, Lcom/zykj/evaluation/bean/UploadData;

    .line 1216
    .line 1217
    invoke-virtual {v15}, Lcom/zykj/evaluation/ui/detail/c;->l()Ljava/lang/String;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v23

    .line 1221
    invoke-virtual {v15}, Lcom/zykj/evaluation/ui/detail/c;->c()Ljava/util/List;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v1

    .line 1225
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v1

    .line 1229
    check-cast v1, Ljava/lang/String;

    .line 1230
    .line 1231
    if-nez v1, :cond_29

    .line 1232
    .line 1233
    move-object/from16 v24, v17

    .line 1234
    .line 1235
    goto :goto_18

    .line 1236
    :cond_29
    move-object/from16 v24, v1

    .line 1237
    .line 1238
    :goto_18
    sget-object v1, Lm5/e$c;->b:Lm5/e$c;

    .line 1239
    .line 1240
    invoke-virtual {v1}, Lm5/e;->a()I

    .line 1241
    .line 1242
    .line 1243
    move-result v26

    .line 1244
    const/16 v27, 0x4

    .line 1245
    .line 1246
    const/16 v28, 0x0

    .line 1247
    .line 1248
    const/16 v25, 0x0

    .line 1249
    .line 1250
    invoke-direct/range {v22 .. v28}, Lcom/zykj/evaluation/bean/UploadData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1251
    .line 1252
    .line 1253
    move-object/from16 v1, v22

    .line 1254
    .line 1255
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1256
    .line 1257
    .line 1258
    :cond_2a
    move-object/from16 v1, v16

    .line 1259
    .line 1260
    move-object/from16 v7, v17

    .line 1261
    .line 1262
    const/4 v8, 0x0

    .line 1263
    const/4 v13, 0x0

    .line 1264
    goto/16 :goto_16

    .line 1265
    .line 1266
    :cond_2b
    move-object/from16 v16, v1

    .line 1267
    .line 1268
    new-instance v1, Ljava/util/ArrayList;

    .line 1269
    .line 1270
    const/16 v7, 0xa

    .line 1271
    .line 1272
    invoke-static {v10, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 1273
    .line 1274
    .line 1275
    move-result v7

    .line 1276
    invoke-direct {v1, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 1277
    .line 1278
    .line 1279
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 1280
    .line 1281
    .line 1282
    move-result v7

    .line 1283
    const/4 v8, 0x0

    .line 1284
    :goto_19
    if-ge v8, v7, :cond_31

    .line 1285
    .line 1286
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v13

    .line 1290
    add-int/lit8 v8, v8, 0x1

    .line 1291
    .line 1292
    check-cast v13, Lcom/zykj/evaluation/bean/UploadData;

    .line 1293
    .line 1294
    if-eqz v19, :cond_2f

    .line 1295
    .line 1296
    invoke-virtual/range {v19 .. v19}, Ln5/v;->c()Ljava/util/List;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v14

    .line 1300
    if-eqz v14, :cond_2f

    .line 1301
    .line 1302
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v14

    .line 1306
    :goto_1a
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 1307
    .line 1308
    .line 1309
    move-result v15

    .line 1310
    if-eqz v15, :cond_2d

    .line 1311
    .line 1312
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v15

    .line 1316
    move-object/from16 v17, v15

    .line 1317
    .line 1318
    check-cast v17, Lcom/zykj/evaluation/bean/UploadData;

    .line 1319
    .line 1320
    move/from16 p1, v7

    .line 1321
    .line 1322
    invoke-virtual/range {v17 .. v17}, Lcom/zykj/evaluation/bean/UploadData;->getUuid()Ljava/lang/String;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v7

    .line 1326
    move/from16 v17, v8

    .line 1327
    .line 1328
    invoke-virtual {v13}, Lcom/zykj/evaluation/bean/UploadData;->getUuid()Ljava/lang/String;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v8

    .line 1332
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1333
    .line 1334
    .line 1335
    move-result v7

    .line 1336
    if-eqz v7, :cond_2c

    .line 1337
    .line 1338
    goto :goto_1b

    .line 1339
    :cond_2c
    move/from16 v7, p1

    .line 1340
    .line 1341
    move/from16 v8, v17

    .line 1342
    .line 1343
    goto :goto_1a

    .line 1344
    :cond_2d
    move/from16 p1, v7

    .line 1345
    .line 1346
    move/from16 v17, v8

    .line 1347
    .line 1348
    const/4 v15, 0x0

    .line 1349
    :goto_1b
    check-cast v15, Lcom/zykj/evaluation/bean/UploadData;

    .line 1350
    .line 1351
    if-eqz v15, :cond_30

    .line 1352
    .line 1353
    invoke-virtual {v15}, Lcom/zykj/evaluation/bean/UploadData;->getLocalPath()Ljava/lang/String;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v7

    .line 1357
    invoke-virtual {v13}, Lcom/zykj/evaluation/bean/UploadData;->getLocalPath()Ljava/lang/String;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v8

    .line 1361
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1362
    .line 1363
    .line 1364
    move-result v7

    .line 1365
    if-eqz v7, :cond_2e

    .line 1366
    .line 1367
    move-object v13, v15

    .line 1368
    goto :goto_1c

    .line 1369
    :cond_2e
    sget-object v7, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 1370
    .line 1371
    goto :goto_1c

    .line 1372
    :cond_2f
    move/from16 p1, v7

    .line 1373
    .line 1374
    move/from16 v17, v8

    .line 1375
    .line 1376
    :cond_30
    :goto_1c
    invoke-interface {v1, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1377
    .line 1378
    .line 1379
    move/from16 v7, p1

    .line 1380
    .line 1381
    move/from16 v8, v17

    .line 1382
    .line 1383
    goto :goto_19

    .line 1384
    :cond_31
    new-instance v15, Ljava/util/ArrayList;

    .line 1385
    .line 1386
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 1387
    .line 1388
    .line 1389
    invoke-virtual {v9}, Landroidx/collection/ArrayMap;->keySet()Ljava/util/Set;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v7

    .line 1393
    check-cast v7, Ljava/lang/Iterable;

    .line 1394
    .line 1395
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v7

    .line 1399
    :goto_1d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1400
    .line 1401
    .line 1402
    move-result v8

    .line 1403
    if-eqz v8, :cond_33

    .line 1404
    .line 1405
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v8

    .line 1409
    check-cast v8, Ljava/lang/Long;

    .line 1410
    .line 1411
    new-instance v20, Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    .line 1412
    .line 1413
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1414
    .line 1415
    .line 1416
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 1417
    .line 1418
    .line 1419
    move-result-wide v21

    .line 1420
    invoke-virtual {v9, v8}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v8

    .line 1424
    check-cast v8, Ljava/util/ArrayList;

    .line 1425
    .line 1426
    if-eqz v8, :cond_32

    .line 1427
    .line 1428
    :goto_1e
    move-object/from16 v24, v8

    .line 1429
    .line 1430
    goto :goto_1f

    .line 1431
    :cond_32
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v8

    .line 1435
    goto :goto_1e

    .line 1436
    :goto_1f
    const/16 v25, 0x2

    .line 1437
    .line 1438
    const/16 v26, 0x0

    .line 1439
    .line 1440
    const/16 v23, 0x0

    .line 1441
    .line 1442
    invoke-direct/range {v20 .. v26}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;-><init>(JLjava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1443
    .line 1444
    .line 1445
    move-object/from16 v8, v20

    .line 1446
    .line 1447
    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1448
    .line 1449
    .line 1450
    goto :goto_1d

    .line 1451
    :cond_33
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1452
    .line 1453
    .line 1454
    move-result v7

    .line 1455
    if-eqz v7, :cond_34

    .line 1456
    .line 1457
    iget-object v7, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 1458
    .line 1459
    check-cast v7, Lcom/zykj/evaluation/bean/UploadData;

    .line 1460
    .line 1461
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/UploadData;->getLocalPath()Ljava/lang/String;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v7

    .line 1465
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 1466
    .line 1467
    .line 1468
    move-result v7

    .line 1469
    if-lez v7, :cond_34

    .line 1470
    .line 1471
    new-instance v20, Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    .line 1472
    .line 1473
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->Q()J

    .line 1474
    .line 1475
    .line 1476
    move-result-wide v21

    .line 1477
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v24

    .line 1481
    const/16 v25, 0x2

    .line 1482
    .line 1483
    const/16 v26, 0x0

    .line 1484
    .line 1485
    const/16 v23, 0x0

    .line 1486
    .line 1487
    invoke-direct/range {v20 .. v26}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;-><init>(JLjava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1488
    .line 1489
    .line 1490
    move-object/from16 v7, v20

    .line 1491
    .line 1492
    invoke-virtual {v15, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1493
    .line 1494
    .line 1495
    :cond_34
    iget-object v7, v0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->z:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 1496
    .line 1497
    iget-object v8, v0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 1498
    .line 1499
    invoke-interface {v8}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v8

    .line 1503
    check-cast v8, Lcom/zykj/message/server/bean/UserInfo;

    .line 1504
    .line 1505
    invoke-virtual {v8}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v8

    .line 1509
    invoke-static {v8, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1510
    .line 1511
    .line 1512
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 1513
    .line 1514
    .line 1515
    move-result-wide v12

    .line 1516
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->N()J

    .line 1517
    .line 1518
    .line 1519
    move-result-wide v17

    .line 1520
    sget-object v8, Lcom/zykj/evaluation/bean/TaskState$ToCorrect;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$ToCorrect;

    .line 1521
    .line 1522
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 1523
    .line 1524
    .line 1525
    move-result v8

    .line 1526
    move-object v14, v9

    .line 1527
    move-object/from16 v20, v10

    .line 1528
    .line 1529
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->Q()J

    .line 1530
    .line 1531
    .line 1532
    move-result-wide v9

    .line 1533
    iget-object v0, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 1534
    .line 1535
    check-cast v0, Lcom/zykj/evaluation/bean/UploadData;

    .line 1536
    .line 1537
    move-object/from16 v21, v14

    .line 1538
    .line 1539
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->a0()Z

    .line 1540
    .line 1541
    .line 1542
    move-result v14

    .line 1543
    move-object/from16 p1, v0

    .line 1544
    .line 1545
    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v0

    .line 1549
    iput-object v0, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->a:Ljava/lang/Object;

    .line 1550
    .line 1551
    invoke-static/range {v19 .. v19}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v0

    .line 1555
    iput-object v0, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->b:Ljava/lang/Object;

    .line 1556
    .line 1557
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v0

    .line 1561
    iput-object v0, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->c:Ljava/lang/Object;

    .line 1562
    .line 1563
    invoke-static/range {v21 .. v21}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v0

    .line 1567
    iput-object v0, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->d:Ljava/lang/Object;

    .line 1568
    .line 1569
    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v0

    .line 1573
    iput-object v0, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->e:Ljava/lang/Object;

    .line 1574
    .line 1575
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v0

    .line 1579
    iput-object v0, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->f:Ljava/lang/Object;

    .line 1580
    .line 1581
    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v0

    .line 1585
    iput-object v0, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->g:Ljava/lang/Object;

    .line 1586
    .line 1587
    iput v5, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->h:I

    .line 1588
    .line 1589
    iput v3, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->i:I

    .line 1590
    .line 1591
    iput v6, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->j:I

    .line 1592
    .line 1593
    const/4 v0, 0x4

    .line 1594
    iput v0, v11, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAnswer$1;->n:I

    .line 1595
    .line 1596
    move-wide v4, v12

    .line 1597
    const/4 v13, 0x0

    .line 1598
    move-object v12, v1

    .line 1599
    move-object v3, v7

    .line 1600
    move-object/from16 v16, v11

    .line 1601
    .line 1602
    move-wide/from16 v6, v17

    .line 1603
    .line 1604
    move-object/from16 v11, p1

    .line 1605
    .line 1606
    invoke-virtual/range {v3 .. v16}, Lcom/zykj/evaluation/upload/OssTaskManger;->r(JJIJLcom/zykj/evaluation/bean/UploadData;Ljava/util/List;ZZLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 1607
    .line 1608
    .line 1609
    move-result-object v0

    .line 1610
    if-ne v0, v2, :cond_35

    .line 1611
    .line 1612
    :goto_20
    return-object v2

    .line 1613
    :cond_35
    :goto_21
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 1614
    .line 1615
    return-object v0
.end method

.method public final O0(I)Lcom/zykj/evaluation/ui/detail/f;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->NO_CORRECT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    sget-object p1, Lcom/zykj/evaluation/ui/detail/f$c;->b:Lcom/zykj/evaluation/ui/detail/f$c;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object v0, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eq p1, v0, :cond_4

    .line 19
    .line 20
    sget-object v0, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->REVISING_RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-ne p1, v0, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    sget-object v0, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->NO_RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-ne p1, v0, :cond_2

    .line 36
    .line 37
    sget-object p1, Lcom/zykj/evaluation/ui/detail/f$b;->b:Lcom/zykj/evaluation/ui/detail/f$b;

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_2
    sget-object v0, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->ERROR:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-ne p1, v0, :cond_3

    .line 47
    .line 48
    sget-object p1, Lcom/zykj/evaluation/ui/detail/f$a;->b:Lcom/zykj/evaluation/ui/detail/f$a;

    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_3
    sget-object p1, Lcom/zykj/evaluation/ui/detail/f$c;->b:Lcom/zykj/evaluation/ui/detail/f$c;

    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_4
    :goto_0
    sget-object p1, Lcom/zykj/evaluation/ui/detail/f$d;->b:Lcom/zykj/evaluation/ui/detail/f$d;

    .line 55
    .line 56
    return-object p1
.end method

.method public final P0(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    instance-of v1, v0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;

    .line 9
    .line 10
    iget v2, v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->v:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->v:I

    .line 20
    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;

    .line 25
    .line 26
    move-object/from16 v2, p0

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lkotlin/coroutines/Continuation;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->t:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget v4, v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->v:I

    .line 38
    .line 39
    const-string v5, "getApp(...)"

    .line 40
    .line 41
    const/4 v6, 0x1

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    if-ne v4, v6, :cond_1

    .line 45
    .line 46
    iget-boolean v4, v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->s:Z

    .line 47
    .line 48
    iget v9, v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->p:I

    .line 49
    .line 50
    iget v10, v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->o:I

    .line 51
    .line 52
    iget v11, v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->n:I

    .line 53
    .line 54
    iget-object v12, v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->m:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v12, Ljava/lang/String;

    .line 57
    .line 58
    iget-object v12, v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->j:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v12, Ljava/util/Iterator;

    .line 61
    .line 62
    iget-object v13, v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->i:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v13, Ljava/lang/Iterable;

    .line 65
    .line 66
    iget-object v14, v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->h:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v14, Ljava/util/Collection;

    .line 69
    .line 70
    iget-object v15, v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->g:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v15, Ljava/lang/Iterable;

    .line 73
    .line 74
    const/16 p2, 0x0

    .line 75
    .line 76
    iget-object v7, v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->f:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v7, Ljava/lang/Iterable;

    .line 79
    .line 80
    move/from16 v16, v6

    .line 81
    .line 82
    iget-object v6, v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->e:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v6, Lcoil3/e;

    .line 85
    .line 86
    const/16 v17, 0x0

    .line 87
    .line 88
    iget-object v8, v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->d:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v8, Ljava/lang/String;

    .line 91
    .line 92
    move-object/from16 v18, v0

    .line 93
    .line 94
    iget-object v0, v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Ljava/lang/String;

    .line 97
    .line 98
    move-object/from16 p1, v0

    .line 99
    .line 100
    iget-object v0, v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Lcom/zykj/evaluation/ui/detail/c;

    .line 103
    .line 104
    move-object/from16 v19, v0

    .line 105
    .line 106
    iget-object v0, v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->a:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, Ljava/lang/String;

    .line 109
    .line 110
    invoke-static/range {v18 .. v18}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    move-object v2, v1

    .line 114
    move-object/from16 v23, v5

    .line 115
    .line 116
    move/from16 v5, v16

    .line 117
    .line 118
    move-object/from16 v1, p1

    .line 119
    .line 120
    move-object/from16 v16, v15

    .line 121
    .line 122
    move-object v15, v14

    .line 123
    move-object v14, v13

    .line 124
    move-object v13, v12

    .line 125
    move v12, v11

    .line 126
    move v11, v10

    .line 127
    move-object v10, v7

    .line 128
    move-object v7, v0

    .line 129
    move/from16 v0, v17

    .line 130
    .line 131
    goto/16 :goto_4

    .line 132
    .line 133
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 134
    .line 135
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 136
    .line 137
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw v0

    .line 141
    :cond_2
    move-object/from16 v18, v0

    .line 142
    .line 143
    move/from16 v16, v6

    .line 144
    .line 145
    const/16 p2, 0x0

    .line 146
    .line 147
    const/16 v17, 0x0

    .line 148
    .line 149
    invoke-static/range {v18 .. v18}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {v0}, Lw5/e;->d()Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-eqz v4, :cond_4

    .line 169
    .line 170
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    move-object v6, v4

    .line 175
    check-cast v6, Lcom/zykj/evaluation/ui/detail/c;

    .line 176
    .line 177
    invoke-virtual {v6}, Lcom/zykj/evaluation/ui/detail/c;->l()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    move-object/from16 v7, p1

    .line 182
    .line 183
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    if-eqz v6, :cond_3

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_4
    move-object/from16 v7, p1

    .line 191
    .line 192
    move-object/from16 v4, p2

    .line 193
    .line 194
    :goto_1
    check-cast v4, Lcom/zykj/evaluation/ui/detail/c;

    .line 195
    .line 196
    if-nez v4, :cond_5

    .line 197
    .line 198
    return-object p2

    .line 199
    :cond_5
    invoke-virtual {v4}, Lcom/zykj/evaluation/ui/detail/c;->c()Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    check-cast v0, Ljava/lang/String;

    .line 208
    .line 209
    if-nez v0, :cond_6

    .line 210
    .line 211
    const-string v0, ""

    .line 212
    .line 213
    :cond_6
    invoke-virtual {v4}, Lcom/zykj/evaluation/ui/detail/c;->d()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 218
    .line 219
    .line 220
    move-result v8

    .line 221
    if-nez v8, :cond_7

    .line 222
    .line 223
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 224
    .line 225
    .line 226
    move-result v8

    .line 227
    if-nez v8, :cond_7

    .line 228
    .line 229
    return-object p2

    .line 230
    :cond_7
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 231
    .line 232
    .line 233
    move-result-object v8

    .line 234
    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-static {v8}, Lcoil3/l;->a(Landroid/content/Context;)Lcoil3/e;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    invoke-static/range {v17 .. v17}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 242
    .line 243
    .line 244
    move-result-object v9

    .line 245
    invoke-static {v0, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 246
    .line 247
    .line 248
    move-result-object v9

    .line 249
    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 250
    .line 251
    .line 252
    move-result-object v10

    .line 253
    invoke-static {v6, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 254
    .line 255
    .line 256
    move-result-object v10

    .line 257
    filled-new-array {v9, v10}, [Lkotlin/Pair;

    .line 258
    .line 259
    .line 260
    move-result-object v9

    .line 261
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 262
    .line 263
    .line 264
    move-result-object v9

    .line 265
    new-instance v10, Ljava/util/ArrayList;

    .line 266
    .line 267
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 268
    .line 269
    .line 270
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    :cond_8
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 275
    .line 276
    .line 277
    move-result v11

    .line 278
    if-eqz v11, :cond_9

    .line 279
    .line 280
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v11

    .line 284
    move-object v12, v11

    .line 285
    check-cast v12, Lkotlin/Pair;

    .line 286
    .line 287
    invoke-virtual {v12}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v12

    .line 291
    check-cast v12, Ljava/lang/CharSequence;

    .line 292
    .line 293
    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    .line 294
    .line 295
    .line 296
    move-result v12

    .line 297
    if-lez v12, :cond_8

    .line 298
    .line 299
    invoke-interface {v10, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    goto :goto_2

    .line 303
    :cond_9
    new-instance v9, Ljava/util/ArrayList;

    .line 304
    .line 305
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 306
    .line 307
    .line 308
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 309
    .line 310
    .line 311
    move-result-object v11

    .line 312
    move-object v12, v1

    .line 313
    move-object v1, v0

    .line 314
    move-object v0, v4

    .line 315
    move-object v4, v12

    .line 316
    move-object v12, v8

    .line 317
    move-object v8, v6

    .line 318
    move-object v6, v12

    .line 319
    move-object v15, v9

    .line 320
    move-object v14, v10

    .line 321
    move-object/from16 v18, v14

    .line 322
    .line 323
    move-object v13, v11

    .line 324
    move/from16 v9, v17

    .line 325
    .line 326
    move v11, v9

    .line 327
    move v12, v11

    .line 328
    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 329
    .line 330
    .line 331
    move-result v19

    .line 332
    move-object/from16 p1, v0

    .line 333
    .line 334
    if-eqz v19, :cond_f

    .line 335
    .line 336
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v19

    .line 340
    move-object/from16 v20, v19

    .line 341
    .line 342
    check-cast v20, Lkotlin/Pair;

    .line 343
    .line 344
    invoke-virtual/range {v20 .. v20}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v21

    .line 348
    const/16 v22, 0x898

    .line 349
    .line 350
    move-object/from16 v0, v21

    .line 351
    .line 352
    check-cast v0, Ljava/lang/String;

    .line 353
    .line 354
    invoke-virtual/range {v20 .. v20}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v20

    .line 358
    check-cast v20, Ljava/lang/Boolean;

    .line 359
    .line 360
    move-object/from16 v21, v1

    .line 361
    .line 362
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Boolean;->booleanValue()Z

    .line 363
    .line 364
    .line 365
    move-result v1

    .line 366
    new-instance v2, Ly/e$a;

    .line 367
    .line 368
    move-object/from16 v20, v7

    .line 369
    .line 370
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 371
    .line 372
    .line 373
    move-result-object v7

    .line 374
    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    invoke-direct {v2, v7}, Ly/e$a;-><init>(Landroid/content/Context;)V

    .line 378
    .line 379
    .line 380
    invoke-static/range {v22 .. v22}, Lz/b;->a(I)I

    .line 381
    .line 382
    .line 383
    move-result v7

    .line 384
    invoke-static {v7}, Lz/a$a;->a(I)Lz/a$a;

    .line 385
    .line 386
    .line 387
    move-result-object v7

    .line 388
    move-object/from16 v23, v5

    .line 389
    .line 390
    sget-object v5, Lz/a$b;->a:Lz/a$b;

    .line 391
    .line 392
    invoke-virtual {v2, v7, v5}, Ly/e$a;->i(Lz/a;Lz/a;)Ly/e$a;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    invoke-virtual {v2, v0}, Ly/e$a;->c(Ljava/lang/Object;)Ly/e$a;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    invoke-virtual {v2}, Ly/e$a;->a()Ly/e;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v5

    .line 408
    iput-object v5, v4, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->a:Ljava/lang/Object;

    .line 409
    .line 410
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    iput-object v5, v4, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->b:Ljava/lang/Object;

    .line 415
    .line 416
    invoke-static/range {v21 .. v21}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v5

    .line 420
    iput-object v5, v4, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->c:Ljava/lang/Object;

    .line 421
    .line 422
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v5

    .line 426
    iput-object v5, v4, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->d:Ljava/lang/Object;

    .line 427
    .line 428
    iput-object v6, v4, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->e:Ljava/lang/Object;

    .line 429
    .line 430
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v5

    .line 434
    iput-object v5, v4, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->f:Ljava/lang/Object;

    .line 435
    .line 436
    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v5

    .line 440
    iput-object v5, v4, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->g:Ljava/lang/Object;

    .line 441
    .line 442
    iput-object v15, v4, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->h:Ljava/lang/Object;

    .line 443
    .line 444
    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v5

    .line 448
    iput-object v5, v4, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->i:Ljava/lang/Object;

    .line 449
    .line 450
    iput-object v13, v4, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->j:Ljava/lang/Object;

    .line 451
    .line 452
    invoke-static/range {v19 .. v19}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v5

    .line 456
    iput-object v5, v4, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->k:Ljava/lang/Object;

    .line 457
    .line 458
    invoke-static/range {v19 .. v19}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v5

    .line 462
    iput-object v5, v4, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->l:Ljava/lang/Object;

    .line 463
    .line 464
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    iput-object v0, v4, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->m:Ljava/lang/Object;

    .line 469
    .line 470
    iput v12, v4, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->n:I

    .line 471
    .line 472
    iput v11, v4, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->o:I

    .line 473
    .line 474
    iput v9, v4, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->p:I

    .line 475
    .line 476
    move/from16 v0, v17

    .line 477
    .line 478
    iput v0, v4, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->q:I

    .line 479
    .line 480
    iput v0, v4, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->r:I

    .line 481
    .line 482
    iput-boolean v1, v4, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->s:Z

    .line 483
    .line 484
    move/from16 v5, v16

    .line 485
    .line 486
    iput v5, v4, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$createAnswerBitmap$1;->v:I

    .line 487
    .line 488
    invoke-interface {v6, v2, v4}, Lcoil3/e;->c(Ly/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    if-ne v2, v3, :cond_a

    .line 493
    .line 494
    return-object v3

    .line 495
    :cond_a
    move-object/from16 v19, p1

    .line 496
    .line 497
    move-object/from16 v16, v18

    .line 498
    .line 499
    move-object/from16 v7, v20

    .line 500
    .line 501
    move-object/from16 v18, v2

    .line 502
    .line 503
    move-object v2, v4

    .line 504
    move v4, v1

    .line 505
    move-object/from16 v1, v21

    .line 506
    .line 507
    :goto_4
    check-cast v18, Ly/h;

    .line 508
    .line 509
    invoke-interface/range {v18 .. v18}, Ly/h;->getImage()Lk/j;

    .line 510
    .line 511
    .line 512
    move-result-object v5

    .line 513
    move-object/from16 p1, v1

    .line 514
    .line 515
    if-eqz v5, :cond_c

    .line 516
    .line 517
    const/4 v1, 0x3

    .line 518
    move-object/from16 v18, v2

    .line 519
    .line 520
    move-object/from16 v2, p2

    .line 521
    .line 522
    invoke-static {v5, v0, v0, v1, v2}, Lk/o;->g(Lk/j;IIILjava/lang/Object;)Landroid/graphics/Bitmap;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    if-eqz v1, :cond_d

    .line 527
    .line 528
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 529
    .line 530
    invoke-virtual {v1, v5, v0}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    if-eqz v1, :cond_d

    .line 535
    .line 536
    if-eqz v4, :cond_b

    .line 537
    .line 538
    sget-object v4, Lg7/a;->a:Lg7/a;

    .line 539
    .line 540
    const/4 v5, 0x2

    .line 541
    invoke-static {v4, v1, v0, v5, v2}, Lg7/a;->d(Lg7/a;Landroid/graphics/Bitmap;IILjava/lang/Object;)Landroid/graphics/Bitmap;

    .line 542
    .line 543
    .line 544
    move-result-object v1

    .line 545
    :cond_b
    move-object v2, v1

    .line 546
    goto :goto_5

    .line 547
    :cond_c
    move-object/from16 v18, v2

    .line 548
    .line 549
    :cond_d
    const/4 v2, 0x0

    .line 550
    :goto_5
    if-eqz v2, :cond_e

    .line 551
    .line 552
    invoke-interface {v15, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 553
    .line 554
    .line 555
    :cond_e
    move-object/from16 v2, p0

    .line 556
    .line 557
    move-object/from16 v1, p1

    .line 558
    .line 559
    move-object/from16 v4, v18

    .line 560
    .line 561
    move-object/from16 v0, v19

    .line 562
    .line 563
    move-object/from16 v5, v23

    .line 564
    .line 565
    const/16 p2, 0x0

    .line 566
    .line 567
    const/16 v17, 0x0

    .line 568
    .line 569
    move-object/from16 v18, v16

    .line 570
    .line 571
    const/16 v16, 0x1

    .line 572
    .line 573
    goto/16 :goto_3

    .line 574
    .line 575
    :cond_f
    const/16 v22, 0x898

    .line 576
    .line 577
    check-cast v15, Ljava/util/List;

    .line 578
    .line 579
    invoke-interface {v15}, Ljava/util/Collection;->isEmpty()Z

    .line 580
    .line 581
    .line 582
    move-result v0

    .line 583
    if-eqz v0, :cond_10

    .line 584
    .line 585
    const/4 v2, 0x0

    .line 586
    return-object v2

    .line 587
    :cond_10
    const/4 v0, 0x0

    .line 588
    new-array v0, v0, [Landroid/graphics/Bitmap;

    .line 589
    .line 590
    invoke-interface {v15, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    check-cast v0, [Landroid/graphics/Bitmap;

    .line 595
    .line 596
    sget-object v1, Lg7/a;->a:Lg7/a;

    .line 597
    .line 598
    array-length v2, v0

    .line 599
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    check-cast v0, [Landroid/graphics/Bitmap;

    .line 604
    .line 605
    move/from16 v2, v22

    .line 606
    .line 607
    invoke-virtual {v1, v2, v0}, Lg7/a;->h(I[Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    return-object v0
.end method

.method public final Q0(IZJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Ljava/util/List;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Lcom/zykj/evaluation/bean/RevisingRecord;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 37

    move-object/from16 v0, p0

    move-object/from16 v1, p13

    .line 1
    invoke-virtual/range {p5 .. p5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getType()I

    move-result v2

    sget-object v3, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->QSTANDANSWER:Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;

    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->getType()I

    move-result v3

    const/4 v5, 0x0

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v5

    .line 2
    :goto_0
    invoke-virtual/range {p5 .. p5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getDisplayNumber()Ljava/lang/String;

    move-result-object v3

    const-string v6, ""

    if-nez v3, :cond_1

    move-object v3, v6

    :cond_1
    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_2

    move-object/from16 v13, p6

    goto :goto_1

    :cond_2
    move-object v13, v3

    .line 3
    :goto_1
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->I()Z

    move-result v3

    const/4 v7, 0x0

    if-eqz v3, :cond_4

    if-eqz p8, :cond_4

    if-eqz v2, :cond_4

    .line 4
    invoke-virtual/range {p5 .. p5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getScore()D

    move-result-wide v8

    .line 5
    invoke-virtual/range {p8 .. p8}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getScore()D

    move-result-wide v10

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v10, "/"

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-virtual/range {p8 .. p8}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getOriginScore()Ljava/lang/Double;

    move-result-object v11

    if-eqz v11, :cond_3

    .line 7
    invoke-virtual/range {p8 .. p8}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getOriginScore()Ljava/lang/Double;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 8
    new-instance v9, Landroidx/compose/ui/text/AnnotatedString$Builder;

    invoke-direct {v9, v8}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(Ljava/lang/String;)V

    .line 9
    new-instance v14, Landroidx/compose/ui/text/SpanStyle;

    sget-object v10, Landroidx/compose/ui/text/style/TextDecoration;->Companion:Landroidx/compose/ui/text/style/TextDecoration$Companion;

    invoke-virtual {v10}, Landroidx/compose/ui/text/style/TextDecoration$Companion;->getLineThrough()Landroidx/compose/ui/text/style/TextDecoration;

    move-result-object v31

    const v35, 0xefff

    const/16 v36, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    invoke-direct/range {v14 .. v36}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    .line 11
    invoke-virtual {v9, v14, v5, v8}, Landroidx/compose/ui/text/AnnotatedString$Builder;->addStyle(Landroidx/compose/ui/text/SpanStyle;II)V

    .line 12
    invoke-virtual {v9}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v8

    goto :goto_2

    .line 13
    :cond_3
    new-instance v8, Landroidx/compose/ui/text/AnnotatedString;

    const/4 v9, 0x2

    invoke-direct {v8, v6, v7, v9, v7}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    :goto_2
    new-instance v9, Lw5/f;

    invoke-direct {v9, v13, v8, v3}, Lw5/f;-><init>(Ljava/lang/String;Landroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;)V

    move-object/from16 v3, p10

    .line 15
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    :cond_4
    invoke-virtual/range {p5 .. p5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getQstType()I

    move-result v3

    move/from16 v8, p1

    invoke-static {v3, v8}, Lw5/h;->a(II)Li6/p0;

    move-result-object v12

    .line 17
    invoke-virtual/range {p5 .. p5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getQuestionId()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    const-wide/16 v10, 0x0

    cmp-long v8, v8, v10

    if-eqz v8, :cond_5

    goto :goto_3

    :cond_5
    move-object v3, v7

    :goto_3
    if-eqz v3, :cond_6

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    goto :goto_4

    :cond_6
    move-wide/from16 v8, p3

    .line 18
    :goto_4
    new-instance v14, Lcom/zykj/evaluation/ui/detail/c;

    move-wide v15, v8

    .line 19
    invoke-virtual/range {p5 .. p5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getQuestionId()J

    move-result-wide v9

    .line 20
    invoke-virtual/range {p5 .. p5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    move-result-object v11

    const/16 v20, 0x3f0

    const/16 v21, 0x0

    move-object v8, v14

    const/4 v14, 0x0

    move-wide/from16 v16, v15

    const/4 v15, 0x0

    move-wide/from16 v17, v16

    const/16 v16, 0x0

    move-wide/from16 v18, v17

    const/16 v17, 0x0

    move-wide/from16 v22, v18

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v28, v6

    move-wide/from16 v5, v22

    .line 21
    invoke-direct/range {v8 .. v21}, Lcom/zykj/evaluation/ui/detail/c;-><init>(JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v14, v8

    const/4 v8, -0x1

    if-eqz p8, :cond_7

    .line 22
    invoke-virtual/range {p8 .. p8}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getOriginResult()Ljava/lang/Integer;

    move-result-object v9

    if-eqz v9, :cond_7

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    goto :goto_5

    :cond_7
    if-eqz p8, :cond_8

    invoke-virtual/range {p8 .. p8}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getResult()I

    move-result v9

    goto :goto_5

    :cond_8
    move v9, v8

    :goto_5
    if-eqz p8, :cond_9

    .line 23
    invoke-virtual/range {p8 .. p8}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getResult()I

    move-result v8

    .line 24
    :cond_9
    invoke-virtual/range {p5 .. p5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getOptions()Ljava/util/List;

    move-result-object v10

    const/16 v11, 0xa

    if-eqz v10, :cond_c

    .line 25
    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v10, v11}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v13, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_b

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .line 27
    check-cast v15, Ljava/lang/String;

    .line 28
    new-instance v16, Lw5/b;

    move-object/from16 v3, p7

    .line 29
    invoke-interface {v3, v15}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_a

    .line 30
    sget-object v17, Lw5/a$a;->c:Lw5/a$a;

    :goto_7
    move-object/from16 v18, v17

    goto :goto_8

    .line 31
    :cond_a
    sget-object v17, Lw5/a$b;->c:Lw5/a$b;

    goto :goto_7

    :goto_8
    const/16 v20, 0x4

    const/16 v21, 0x0

    const/16 v19, 0x0

    move-object/from16 v17, v15

    .line 32
    invoke-direct/range {v16 .. v21}, Lw5/b;-><init>(Ljava/lang/String;Lw5/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v15, v16

    .line 33
    invoke-interface {v13, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_b
    move-object/from16 v3, p7

    :goto_9
    move-object/from16 v20, v13

    goto :goto_a

    :cond_c
    move-object/from16 v3, p7

    .line 34
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v13

    goto :goto_9

    .line 35
    :goto_a
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->P()Z

    move-result v10

    if-eqz v10, :cond_14

    .line 36
    iget-object v10, v0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->C:Ljava/util/ArrayList;

    .line 37
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v13

    const/4 v15, 0x0

    :goto_b
    if-ge v15, v13, :cond_e

    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v17, v16

    check-cast v17, Lcom/zykj/evaluation/utils/NeedReviseData;

    .line 38
    invoke-virtual/range {v17 .. v17}, Lcom/zykj/evaluation/utils/NeedReviseData;->getUuid()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p5 .. p5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    move-result-object v4

    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    goto :goto_c

    :cond_d
    const/4 v7, 0x0

    goto :goto_b

    :cond_e
    const/16 v16, 0x0

    .line 39
    :goto_c
    check-cast v16, Lcom/zykj/evaluation/utils/NeedReviseData;

    if-eqz v16, :cond_f

    .line 40
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/evaluation/utils/NeedReviseData;->getNeedRevise()Z

    move-result v4

    move-object v13, v12

    goto :goto_f

    .line 41
    :cond_f
    sget-object v4, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->NO_RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    if-eq v9, v4, :cond_11

    .line 42
    sget-object v4, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->ERROR:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    if-ne v9, v4, :cond_10

    goto :goto_d

    :cond_10
    const/4 v4, 0x0

    goto :goto_e

    :cond_11
    :goto_d
    const/4 v4, 0x1

    .line 43
    :goto_e
    iget-object v7, v0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->C:Ljava/util/ArrayList;

    .line 44
    new-instance v9, Lcom/zykj/evaluation/utils/NeedReviseData;

    .line 45
    invoke-virtual/range {p5 .. p5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    move-result-object v10

    move-object v13, v12

    move-wide/from16 v11, p3

    .line 46
    invoke-direct {v9, v11, v12, v10, v4}, Lcom/zykj/evaluation/utils/NeedReviseData;-><init>(JLjava/lang/String;Z)V

    .line 47
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_f
    if-eqz v4, :cond_14

    move-object v12, v13

    .line 48
    instance-of v4, v12, Li6/p0$c$a;

    if-nez v4, :cond_13

    instance-of v4, v12, Li6/p0$a;

    if-eqz v4, :cond_12

    goto :goto_11

    .line 49
    :cond_12
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->K()Lg7/e;

    move-result-object v4

    .line 50
    invoke-virtual/range {p5 .. p5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    move-result-object v7

    .line 51
    invoke-virtual {v4, v5, v6, v7}, Lg7/e;->k(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :goto_10
    move-object/from16 v22, v4

    goto :goto_12

    .line 52
    :cond_13
    :goto_11
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->K()Lg7/e;

    move-result-object v4

    .line 53
    invoke-virtual/range {p5 .. p5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    move-result-object v7

    .line 54
    invoke-virtual {v4, v5, v6, v7}, Lg7/e;->l(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_10

    :goto_12
    const/16 v26, 0x38f

    const/16 v27, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object/from16 v21, v3

    .line 55
    invoke-static/range {v14 .. v27}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    move-result-object v3

    move-object/from16 v4, p11

    .line 56
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_14
    if-eqz p8, :cond_15

    .line 57
    invoke-virtual/range {p8 .. p8}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamAnswers()Ljava/util/List;

    move-result-object v3

    if-nez v3, :cond_16

    :cond_15
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    .line 58
    :cond_16
    sget-object v4, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    if-ne v4, v8, :cond_17

    const/4 v4, 0x1

    goto :goto_13

    :cond_17
    const/4 v4, 0x0

    .line 59
    :goto_13
    invoke-virtual/range {p5 .. p5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getOptions()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_1b

    .line 60
    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v5, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 61
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_14
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 62
    check-cast v7, Ljava/lang/String;

    .line 63
    new-instance v15, Lw5/b;

    .line 64
    invoke-interface {v3, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_19

    if-eqz v4, :cond_18

    .line 65
    sget-object v9, Lw5/a$d;->c:Lw5/a$d;

    :goto_15
    move-object/from16 v17, v9

    goto :goto_16

    .line 66
    :cond_18
    sget-object v9, Lw5/a$c;->c:Lw5/a$c;

    goto :goto_15

    .line 67
    :cond_19
    sget-object v9, Lw5/a$b;->c:Lw5/a$b;

    goto :goto_15

    :goto_16
    const/16 v19, 0x4

    const/16 v20, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v7

    .line 68
    invoke-direct/range {v15 .. v20}, Lw5/b;-><init>(Ljava/lang/String;Lw5/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 69
    invoke-interface {v6, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_14

    :cond_1a
    :goto_17
    move-object/from16 v20, v6

    goto :goto_18

    .line 70
    :cond_1b
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v6

    goto :goto_17

    :goto_18
    if-eqz p8, :cond_1d

    .line 71
    invoke-virtual/range {p8 .. p8}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getScore()D

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmpl-double v6, v4, v6

    if-lez v6, :cond_1c

    invoke-virtual/range {p5 .. p5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getScore()D

    move-result-wide v6

    cmpg-double v4, v4, v6

    if-gez v4, :cond_1c

    const/4 v4, 0x1

    goto :goto_19

    :cond_1c
    const/4 v4, 0x0

    :goto_19
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    goto :goto_1a

    :cond_1d
    const/4 v4, 0x0

    :goto_1a
    if-eqz p8, :cond_1f

    .line 72
    invoke-virtual/range {p8 .. p8}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamComments()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_1f

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-nez v5, :cond_1e

    goto :goto_1b

    :cond_1e
    move-object/from16 v23, v5

    goto :goto_1c

    :cond_1f
    :goto_1b
    move-object/from16 v23, v28

    .line 73
    :goto_1c
    invoke-virtual {v0, v8, v2, v4}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->y(IZLjava/lang/Boolean;)Lcom/zykj/evaluation/ui/detail/f;

    move-result-object v24

    const/16 v26, 0x24f

    const/16 v27, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    move-object/from16 v21, v3

    .line 74
    invoke-static/range {v14 .. v27}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    move-result-object v2

    move-object/from16 v3, p12

    .line 75
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    iget-object v2, v0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->C:Ljava/util/ArrayList;

    .line 77
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :cond_20
    if-ge v4, v3, :cond_21

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v4, v4, 0x1

    move-object v6, v5

    check-cast v6, Lcom/zykj/evaluation/utils/NeedReviseData;

    .line 78
    invoke-virtual {v6}, Lcom/zykj/evaluation/utils/NeedReviseData;->getUuid()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p5 .. p5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_20

    move-object v7, v5

    goto :goto_1d

    :cond_21
    const/4 v7, 0x0

    :goto_1d
    check-cast v7, Lcom/zykj/evaluation/utils/NeedReviseData;

    if-eqz v7, :cond_23

    invoke-virtual {v7}, Lcom/zykj/evaluation/utils/NeedReviseData;->getNeedRevise()Z

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_22

    move v2, v3

    goto :goto_1f

    :cond_22
    :goto_1e
    const/4 v2, 0x0

    goto :goto_1f

    :cond_23
    const/4 v3, 0x1

    goto :goto_1e

    :goto_1f
    if-eqz v2, :cond_2b

    if-eqz p2, :cond_2b

    if-eqz p8, :cond_24

    .line 79
    invoke-virtual/range {p8 .. p8}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getRevisingAnswers()Ljava/util/List;

    move-result-object v2

    if-nez v2, :cond_25

    :cond_24
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    .line 80
    :cond_25
    invoke-virtual/range {p5 .. p5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getOptions()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_28

    .line 81
    new-instance v4, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v3, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_20
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_27

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 83
    check-cast v5, Ljava/lang/String;

    .line 84
    new-instance v6, Lw5/b;

    .line 85
    invoke-interface {v2, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_26

    .line 86
    sget-object v7, Lw5/a$a;->c:Lw5/a$a;

    goto :goto_21

    .line 87
    :cond_26
    sget-object v7, Lw5/a$b;->c:Lw5/a$b;

    :goto_21
    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 p2, v5

    move-object/from16 p1, v6

    move-object/from16 p3, v7

    move/from16 p5, v8

    move-object/from16 p6, v9

    move/from16 p4, v10

    .line 88
    invoke-direct/range {p1 .. p6}, Lw5/b;-><init>(Ljava/lang/String;Lw5/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, p1

    .line 89
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_20

    :cond_27
    :goto_22
    move-object/from16 v20, v4

    goto :goto_23

    .line 90
    :cond_28
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    goto :goto_22

    :goto_23
    if-eqz p8, :cond_2a

    .line 91
    invoke-virtual/range {p8 .. p8}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getRevisingComments()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_2a

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_29

    goto :goto_24

    :cond_29
    move-object/from16 v23, v3

    goto :goto_25

    :cond_2a
    :goto_24
    move-object/from16 v23, v28

    .line 92
    :goto_25
    sget-object v24, Lcom/zykj/evaluation/ui/detail/f$c;->b:Lcom/zykj/evaluation/ui/detail/f$c;

    const/16 v26, 0x24f

    const/16 v27, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    move-object/from16 v21, v2

    .line 93
    invoke-static/range {v14 .. v27}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    move-result-object v2

    .line 94
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 95
    :cond_2b
    sget-object v2, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->REVISING_RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    if-ne v8, v4, :cond_33

    if-eqz p8, :cond_2c

    .line 96
    invoke-virtual/range {p8 .. p8}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getRevisingAnswers()Ljava/util/List;

    move-result-object v2

    if-nez v2, :cond_2d

    :cond_2c
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    .line 97
    :cond_2d
    invoke-virtual/range {p5 .. p5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getOptions()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_30

    .line 98
    new-instance v4, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v3, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 99
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_26
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 100
    check-cast v5, Ljava/lang/String;

    .line 101
    new-instance v6, Lw5/b;

    .line 102
    invoke-interface {v2, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2e

    .line 103
    sget-object v7, Lw5/a$d;->c:Lw5/a$d;

    goto :goto_27

    .line 104
    :cond_2e
    sget-object v7, Lw5/a$b;->c:Lw5/a$b;

    :goto_27
    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 p2, v5

    move-object/from16 p1, v6

    move-object/from16 p3, v7

    move/from16 p5, v8

    move-object/from16 p6, v9

    move/from16 p4, v10

    .line 105
    invoke-direct/range {p1 .. p6}, Lw5/b;-><init>(Ljava/lang/String;Lw5/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, p1

    .line 106
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_26

    :cond_2f
    :goto_28
    move-object/from16 v20, v4

    goto :goto_29

    .line 107
    :cond_30
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    goto :goto_28

    :goto_29
    if-eqz p8, :cond_32

    .line 108
    invoke-virtual/range {p8 .. p8}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getRevisingComments()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_32

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_31

    goto :goto_2a

    :cond_31
    move-object/from16 v23, v3

    goto :goto_2b

    :cond_32
    :goto_2a
    move-object/from16 v23, v28

    .line 109
    :goto_2b
    sget-object v24, Lcom/zykj/evaluation/ui/detail/f$d;->b:Lcom/zykj/evaluation/ui/detail/f$d;

    const/16 v26, 0x24f

    const/16 v27, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    move-object/from16 v21, v2

    .line 110
    invoke-static/range {v14 .. v27}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    move-result-object v2

    .line 111
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_33
    if-eqz p9, :cond_3b

    .line 112
    invoke-virtual/range {p9 .. p9}, Lcom/zykj/evaluation/bean/RevisingRecord;->getRevisingAnswers()Ljava/util/List;

    move-result-object v4

    .line 113
    invoke-virtual/range {p9 .. p9}, Lcom/zykj/evaluation/bean/RevisingRecord;->getResult()I

    move-result v5

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v5, v2, :cond_34

    goto :goto_2c

    :cond_34
    const/4 v3, 0x0

    .line 114
    :goto_2c
    invoke-virtual/range {p5 .. p5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getOptions()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_38

    .line 115
    new-instance v5, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v2, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 116
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_37

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 117
    check-cast v6, Ljava/lang/String;

    .line 118
    new-instance v7, Lw5/b;

    .line 119
    invoke-interface {v4, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_36

    if-eqz v3, :cond_35

    .line 120
    sget-object v8, Lw5/a$d;->c:Lw5/a$d;

    goto :goto_2e

    .line 121
    :cond_35
    sget-object v8, Lw5/a$c;->c:Lw5/a$c;

    goto :goto_2e

    .line 122
    :cond_36
    sget-object v8, Lw5/a$b;->c:Lw5/a$b;

    :goto_2e
    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 p2, v6

    move-object/from16 p1, v7

    move-object/from16 p3, v8

    move/from16 p5, v9

    move-object/from16 p6, v10

    move/from16 p4, v11

    .line 123
    invoke-direct/range {p1 .. p6}, Lw5/b;-><init>(Ljava/lang/String;Lw5/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, p1

    .line 124
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2d

    :cond_37
    :goto_2f
    move-object/from16 v20, v5

    goto :goto_30

    .line 125
    :cond_38
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    goto :goto_2f

    .line 126
    :goto_30
    invoke-virtual/range {p9 .. p9}, Lcom/zykj/evaluation/bean/RevisingRecord;->getRevisingComments()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_39

    move-object/from16 v23, v28

    goto :goto_31

    :cond_39
    move-object/from16 v23, v2

    :goto_31
    if-eqz v3, :cond_3a

    .line 127
    sget-object v2, Lcom/zykj/evaluation/ui/detail/f$d;->b:Lcom/zykj/evaluation/ui/detail/f$d;

    :goto_32
    move-object/from16 v24, v2

    goto :goto_33

    :cond_3a
    sget-object v2, Lcom/zykj/evaluation/ui/detail/f$a;->b:Lcom/zykj/evaluation/ui/detail/f$a;

    goto :goto_32

    :goto_33
    const/16 v26, 0x24f

    const/16 v27, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    move-object/from16 v21, v4

    .line 128
    invoke-static/range {v14 .. v27}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    move-result-object v2

    .line 129
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3b
    return-void
.end method

.method public final R0(IZJLjava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 36

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    move-object/from16 v2, p12

    .line 1
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->I()Z

    move-result v3

    const/4 v4, 0x2

    const-string v5, ""

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    .line 2
    invoke-interface/range {p7 .. p7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v8, v6

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v10, v8, 0x1

    if-gez v8, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast v9, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 3
    invoke-static {v1, v8}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    if-eqz v8, :cond_1

    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getScore()D

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    goto :goto_1

    :cond_1
    move-object v8, v5

    .line 4
    :goto_1
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getScore()D

    move-result-wide v11

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v11, "/"

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 5
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getOriginScore()Ljava/lang/Double;

    move-result-object v13

    if-eqz v13, :cond_2

    .line 6
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getOriginScore()Ljava/lang/Double;

    move-result-object v9

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 7
    new-instance v9, Landroidx/compose/ui/text/AnnotatedString$Builder;

    invoke-direct {v9, v8}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(Ljava/lang/String;)V

    .line 8
    new-instance v13, Landroidx/compose/ui/text/SpanStyle;

    sget-object v11, Landroidx/compose/ui/text/style/TextDecoration;->Companion:Landroidx/compose/ui/text/style/TextDecoration$Companion;

    invoke-virtual {v11}, Landroidx/compose/ui/text/style/TextDecoration$Companion;->getLineThrough()Landroidx/compose/ui/text/style/TextDecoration;

    move-result-object v30

    const v34, 0xefff

    const/16 v35, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v13 .. v35}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    .line 10
    invoke-virtual {v9, v13, v6, v8}, Landroidx/compose/ui/text/AnnotatedString$Builder;->addStyle(Landroidx/compose/ui/text/SpanStyle;II)V

    .line 11
    invoke-virtual {v9}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v8

    goto :goto_2

    .line 12
    :cond_2
    new-instance v8, Landroidx/compose/ui/text/AnnotatedString;

    invoke-direct {v8, v5, v7, v4, v7}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    :goto_2
    new-instance v9, Lw5/f;

    .line 14
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v11

    .line 15
    invoke-direct {v9, v11, v8, v12}, Lw5/f;-><init>(Ljava/lang/String;Landroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;)V

    move-object/from16 v8, p9

    .line 16
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v8, v10

    goto/16 :goto_0

    .line 17
    :cond_3
    new-instance v11, Lcom/zykj/evaluation/ui/detail/c;

    .line 18
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getQuestionId()J

    move-result-wide v8

    move-wide v12, v8

    goto :goto_3

    :cond_4
    move-wide/from16 v12, p3

    .line 19
    :goto_3
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_5

    goto :goto_4

    :cond_5
    move-object v14, v3

    goto :goto_5

    :cond_6
    :goto_4
    move-object v14, v5

    .line 20
    :goto_5
    sget-object v3, Li6/p0$c$a;->b:Li6/p0$c$a;

    invoke-virtual {v3}, Li6/p0;->a()I

    move-result v3

    move/from16 v8, p1

    invoke-static {v3, v8}, Lw5/h;->a(II)Li6/p0;

    move-result-object v15

    const/16 v23, 0x3f8

    const/16 v24, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    .line 21
    invoke-direct/range {v11 .. v24}, Lcom/zykj/evaluation/ui/detail/c;-><init>(JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 22
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->P()Z

    move-result v3

    if-eqz v3, :cond_b

    .line 23
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_8

    move-object/from16 v8, p6

    invoke-interface {v8, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-nez v3, :cond_7

    goto :goto_7

    :cond_7
    :goto_6
    move-object/from16 v18, v3

    goto :goto_8

    :cond_8
    :goto_7
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    goto :goto_6

    .line 24
    :goto_8
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->K()Lg7/e;

    move-result-object v3

    .line 25
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    if-eqz v8, :cond_a

    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_9

    goto :goto_a

    :cond_9
    :goto_9
    move-wide/from16 v9, p3

    goto :goto_b

    :cond_a
    :goto_a
    move-object v8, v5

    goto :goto_9

    .line 26
    :goto_b
    invoke-virtual {v3, v9, v10, v8}, Lg7/e;->l(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const/16 v23, 0x39f

    const/16 v24, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    .line 27
    invoke-static/range {v11 .. v24}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    move-result-object v3

    move-object/from16 v8, p10

    .line 28
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    :cond_b
    sget-object v3, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    .line 30
    sget-object v8, Lcom/zykj/evaluation/ui/detail/f$d;->b:Lcom/zykj/evaluation/ui/detail/f$d;

    .line 31
    invoke-interface/range {p7 .. p7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move v12, v6

    move-object v10, v7

    move-object v13, v10

    move-object v14, v13

    :goto_c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    move-object/from16 p1, v13

    const-string v13, "http"

    move/from16 p3, v15

    if-eqz p3, :cond_14

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    add-int/lit8 v17, v12, 0x1

    if-gez v12, :cond_c

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_c
    check-cast v16, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    if-nez p1, :cond_d

    .line 32
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamAnswers()Ljava/util/List;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v15, v18

    check-cast v15, Ljava/lang/String;

    if-eqz v15, :cond_d

    invoke-static {v15, v13, v6, v4, v7}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v15

    const/4 v4, 0x1

    if-ne v15, v4, :cond_d

    .line 33
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getUuid()Ljava/lang/String;

    move-result-object v10

    .line 34
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamAnswers()Ljava/util/List;

    move-result-object v4

    goto :goto_d

    :cond_d
    move-object/from16 v4, p1

    :goto_d
    if-nez v14, :cond_e

    .line 35
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamComments()Ljava/util/List;

    move-result-object v15

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    if-eqz v15, :cond_e

    move-object/from16 p1, v4

    const/4 v4, 0x2

    .line 36
    invoke-static {v15, v13, v6, v4, v7}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v13

    const/4 v4, 0x1

    if-ne v13, v4, :cond_f

    .line 37
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamComments()Ljava/util/List;

    move-result-object v14

    goto :goto_e

    :cond_e
    move-object/from16 p1, v4

    .line 38
    :cond_f
    :goto_e
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getResult()I

    move-result v4

    .line 39
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getScore()D

    move-result-wide v18

    const-wide/16 v20, 0x0

    cmpl-double v13, v18, v20

    if-lez v13, :cond_11

    invoke-virtual/range {v16 .. v16}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getScore()D

    move-result-wide v18

    invoke-static {v1, v12}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    if-eqz v12, :cond_10

    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getScore()D

    move-result-wide v20

    :cond_10
    cmpg-double v12, v18, v20

    if-gez v12, :cond_11

    const/4 v12, 0x1

    goto :goto_f

    :cond_11
    move v12, v6

    :goto_f
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    const/4 v15, 0x1

    .line 40
    invoke-virtual {v0, v4, v15, v12}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->y(IZLjava/lang/Boolean;)Lcom/zykj/evaluation/ui/detail/f;

    move-result-object v4

    .line 41
    sget-object v12, Lcom/zykj/evaluation/ui/detail/f$a;->b:Lcom/zykj/evaluation/ui/detail/f$a;

    invoke-static {v4, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_12

    .line 42
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getResult()I

    move-result v3

    move-object v8, v12

    goto :goto_10

    .line 43
    :cond_12
    sget-object v13, Lcom/zykj/evaluation/ui/detail/f$b;->b:Lcom/zykj/evaluation/ui/detail/f$b;

    invoke-static {v4, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-static {v8, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_13

    .line 44
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getResult()I

    move-result v3

    move-object v8, v13

    :cond_13
    :goto_10
    move-object/from16 v13, p1

    move/from16 v12, v17

    const/4 v4, 0x2

    goto/16 :goto_c

    :cond_14
    const/4 v15, 0x1

    if-nez v10, :cond_15

    move-object v10, v5

    :cond_15
    if-nez p1, :cond_16

    .line 45
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    move-object/from16 v18, v1

    goto :goto_11

    :cond_16
    move-object/from16 v18, p1

    :goto_11
    if-eqz v14, :cond_18

    .line 46
    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_17

    goto :goto_12

    :cond_17
    move-object/from16 v20, v1

    goto :goto_13

    :cond_18
    :goto_12
    move-object/from16 v20, v5

    :goto_13
    const/16 v23, 0x25d

    const/16 v24, 0x0

    move-object v1, v13

    const-wide/16 v12, 0x0

    move v4, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    move-object/from16 v21, v8

    move-object v14, v10

    .line 47
    invoke-static/range {v11 .. v24}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    move-result-object v8

    move-object/from16 v9, p11

    .line 48
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->P()Z

    move-result v8

    if-eqz v8, :cond_1f

    if-eqz p2, :cond_1f

    .line 50
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 51
    invoke-interface/range {p7 .. p7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_19
    :goto_14
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 52
    invoke-virtual {v10}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getResult()I

    move-result v10

    sget-object v12, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    if-le v10, v12, :cond_19

    .line 53
    invoke-interface {v3, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_14

    .line 54
    :cond_1a
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v8

    move v9, v6

    :cond_1b
    if-ge v9, v8, :cond_1c

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 v9, v9, 0x1

    move-object v12, v10

    check-cast v12, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 55
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getRevisingAnswers()Ljava/util/List;

    move-result-object v12

    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    if-eqz v12, :cond_1b

    const/4 v13, 0x2

    invoke-static {v12, v1, v6, v13, v7}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v12

    if-ne v12, v4, :cond_1b

    move-object v7, v10

    .line 56
    :cond_1c
    check-cast v7, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    if-nez v7, :cond_1d

    .line 57
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    :cond_1d
    if-eqz v7, :cond_28

    .line 58
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getRevisingAnswers()Ljava/util/List;

    move-result-object v18

    .line 59
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getRevisingComments()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_1e

    move-object/from16 v20, v5

    goto :goto_15

    :cond_1e
    move-object/from16 v20, v1

    .line 60
    :goto_15
    sget-object v21, Lcom/zykj/evaluation/ui/detail/f$c;->b:Lcom/zykj/evaluation/ui/detail/f$c;

    const/16 v23, 0x25f

    const/16 v24, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    .line 61
    invoke-static/range {v11 .. v24}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    move-result-object v1

    .line 62
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 63
    :cond_1f
    sget-object v8, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->REVISING_RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    if-ne v3, v8, :cond_26

    .line 64
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 65
    invoke-interface/range {p7 .. p7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_20
    :goto_16
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_21

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 66
    invoke-virtual {v10}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getResult()I

    move-result v10

    sget-object v12, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    if-le v10, v12, :cond_20

    .line 67
    invoke-interface {v3, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_16

    .line 68
    :cond_21
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v8

    move v9, v6

    :cond_22
    if-ge v9, v8, :cond_23

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 v9, v9, 0x1

    move-object v12, v10

    check-cast v12, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 69
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getRevisingAnswers()Ljava/util/List;

    move-result-object v12

    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    const/4 v13, 0x2

    if-eqz v12, :cond_22

    invoke-static {v12, v1, v6, v13, v7}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v12

    if-ne v12, v4, :cond_22

    move-object v7, v10

    .line 70
    :cond_23
    check-cast v7, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    if-nez v7, :cond_24

    .line 71
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    :cond_24
    if-eqz v7, :cond_28

    .line 72
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getRevisingAnswers()Ljava/util/List;

    move-result-object v18

    .line 73
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getRevisingComments()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_25

    move-object/from16 v20, v5

    goto :goto_17

    :cond_25
    move-object/from16 v20, v1

    .line 74
    :goto_17
    sget-object v21, Lcom/zykj/evaluation/ui/detail/f$d;->b:Lcom/zykj/evaluation/ui/detail/f$d;

    const/16 v23, 0x25f

    const/16 v24, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    .line 75
    invoke-static/range {v11 .. v24}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    move-result-object v1

    .line 76
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 77
    :cond_26
    invoke-static/range {p8 .. p8}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/zykj/evaluation/bean/RevisingRecord;

    if-eqz v1, :cond_28

    .line 78
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/RevisingRecord;->getRevisingAnswers()Ljava/util/List;

    move-result-object v18

    .line 79
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/RevisingRecord;->getRevisingComments()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_27

    move-object/from16 v20, v5

    goto :goto_18

    :cond_27
    move-object/from16 v20, v3

    .line 80
    :goto_18
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/RevisingRecord;->getResult()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->O0(I)Lcom/zykj/evaluation/ui/detail/f;

    move-result-object v21

    const/16 v23, 0x25f

    const/16 v24, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    .line 81
    invoke-static/range {v11 .. v24}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    move-result-object v1

    .line 82
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_28
    return-void
.end method

.method public final S0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initNeedReviseData$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initNeedReviseData$2;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p1
.end method

.method public final T0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$saveNeedReviseData$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$saveNeedReviseData$2;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p1
.end method

.method public U(Lcom/zykj/evaluation/bean/bundle/DetailBundle;Z)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "detailBundle"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-super/range {p0 .. p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->U(Lcom/zykj/evaluation/bean/bundle/DetailBundle;Z)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lg7/e;

    .line 14
    .line 15
    sget-object v3, Lcom/zykj/evaluation/bean/TaskState$ToCorrect;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$ToCorrect;

    .line 16
    .line 17
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 18
    .line 19
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/zykj/message/server/bean/UserInfo;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v4, "getId(...)"

    .line 30
    .line 31
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 35
    .line 36
    .line 37
    move-result-wide v4

    .line 38
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->N()J

    .line 39
    .line 40
    .line 41
    move-result-wide v6

    .line 42
    invoke-direct/range {v2 .. v7}, Lg7/e;-><init>(Lcom/zykj/evaluation/bean/TaskState;JJ)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->q0(Lg7/e;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->w()Lcom/zykj/evaluation/ui/detail/b;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    const v25, 0xfbfff

    .line 53
    .line 54
    .line 55
    const/16 v26, 0x0

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    const/4 v5, 0x0

    .line 59
    const/4 v6, 0x0

    .line 60
    const/4 v7, 0x0

    .line 61
    const/4 v8, 0x0

    .line 62
    const/4 v9, 0x0

    .line 63
    const/4 v10, 0x0

    .line 64
    const/4 v11, 0x0

    .line 65
    const/4 v12, 0x0

    .line 66
    const/4 v13, 0x0

    .line 67
    const/4 v14, 0x0

    .line 68
    const/4 v15, 0x0

    .line 69
    const/16 v16, 0x0

    .line 70
    .line 71
    const/16 v17, 0x0

    .line 72
    .line 73
    const/16 v18, 0x1

    .line 74
    .line 75
    const/16 v19, 0x0

    .line 76
    .line 77
    const/16 v20, 0x0

    .line 78
    .line 79
    const/16 v21, 0x0

    .line 80
    .line 81
    const-wide/16 v22, 0x0

    .line 82
    .line 83
    const/16 v24, 0x0

    .line 84
    .line 85
    invoke-static/range {v3 .. v26}, Lcom/zykj/evaluation/ui/detail/b;->b(Lcom/zykj/evaluation/ui/detail/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;ZZLjava/lang/String;ZLcom/zykj/evaluation/ui/detail/a;Lcom/zykj/evaluation/ui/detail/d;Lw5/i;ZZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/b;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->h0(Lcom/zykj/evaluation/ui/detail/b;)V

    .line 90
    .line 91
    .line 92
    new-instance v6, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1;

    .line 93
    .line 94
    const/4 v1, 0x0

    .line 95
    invoke-direct {v6, v0, v1}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lkotlin/coroutines/Continuation;)V

    .line 96
    .line 97
    .line 98
    const/16 v7, 0x1f

    .line 99
    .line 100
    const/4 v8, 0x0

    .line 101
    const/4 v2, 0x0

    .line 102
    const/4 v3, 0x0

    .line 103
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public final U0(Lf6/j;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Lf6/j;->j()Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    iget-boolean p1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->B:Z

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    return p1

    .line 24
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 25
    return p1
.end method

.method public final V0(Ljava/lang/String;Ljava/util/List;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v9, p1

    .line 4
    .line 5
    move-object/from16 v10, p2

    .line 6
    .line 7
    const-string v1, "uuid"

    .line 8
    .line 9
    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "localAnswer"

    .line 13
    .line 14
    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    iput-boolean v1, v0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->B:Z

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->A()Landroidx/collection/ArrayMap;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v1, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    new-instance v3, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$updateLocalAnswer$1;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v3, v1}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$updateLocalAnswer$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 31
    .line 32
    .line 33
    new-instance v4, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$updateLocalAnswer$2;

    .line 34
    .line 35
    invoke-direct {v4, v1}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$updateLocalAnswer$2;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 36
    .line 37
    .line 38
    new-instance v6, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$updateLocalAnswer$3;

    .line 39
    .line 40
    invoke-direct {v6, v0, v9, v10, v1}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$updateLocalAnswer$3;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    .line 41
    .line 42
    .line 43
    const/16 v7, 0x13

    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    const/4 v2, 0x0

    .line 47
    const/4 v5, 0x0

    .line 48
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2}, Lw5/e;->f()Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    new-instance v7, Ljava/util/ArrayList;

    .line 64
    .line 65
    const/16 v3, 0xa

    .line 66
    .line 67
    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    invoke-direct {v7, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_3

    .line 83
    .line 84
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Lcom/zykj/evaluation/ui/detail/c;

    .line 89
    .line 90
    invoke-virtual {v4}, Lcom/zykj/evaluation/ui/detail/c;->l()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-eqz v5, :cond_2

    .line 99
    .line 100
    invoke-virtual {v4}, Lcom/zykj/evaluation/ui/detail/c;->g()Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    new-instance v6, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-static {v5, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    if-eqz v8, :cond_1

    .line 122
    .line 123
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    move-object v11, v8

    .line 128
    check-cast v11, Lw5/b;

    .line 129
    .line 130
    invoke-virtual {v11}, Lw5/b;->d()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    invoke-interface {v10, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v8

    .line 138
    if-eqz v8, :cond_0

    .line 139
    .line 140
    sget-object v8, Lw5/a$a;->c:Lw5/a$a;

    .line 141
    .line 142
    :goto_2
    move-object v13, v8

    .line 143
    goto :goto_3

    .line 144
    :cond_0
    sget-object v8, Lw5/a$b;->c:Lw5/a$b;

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :goto_3
    const/4 v15, 0x5

    .line 148
    const/16 v16, 0x0

    .line 149
    .line 150
    const/4 v12, 0x0

    .line 151
    const/4 v14, 0x0

    .line 152
    invoke-static/range {v11 .. v16}, Lw5/b;->b(Lw5/b;Ljava/lang/String;Lw5/a;ZILjava/lang/Object;)Lw5/b;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_1
    const/16 v22, 0x3cf

    .line 161
    .line 162
    const/16 v23, 0x0

    .line 163
    .line 164
    const-wide/16 v11, 0x0

    .line 165
    .line 166
    const/4 v13, 0x0

    .line 167
    const/4 v14, 0x0

    .line 168
    const/4 v15, 0x0

    .line 169
    const/16 v18, 0x0

    .line 170
    .line 171
    const/16 v19, 0x0

    .line 172
    .line 173
    const/16 v20, 0x0

    .line 174
    .line 175
    const/16 v21, 0x0

    .line 176
    .line 177
    move-object/from16 v16, v6

    .line 178
    .line 179
    move-object/from16 v17, v10

    .line 180
    .line 181
    move-object v10, v4

    .line 182
    invoke-static/range {v10 .. v23}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    goto :goto_4

    .line 187
    :cond_2
    move-object v10, v4

    .line 188
    :goto_4
    invoke-interface {v7, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-object/from16 v10, p2

    .line 192
    .line 193
    goto :goto_0

    .line 194
    :cond_3
    const/16 v14, 0xfdf

    .line 195
    .line 196
    const/4 v15, 0x0

    .line 197
    const/4 v2, 0x0

    .line 198
    const/4 v3, 0x0

    .line 199
    const/4 v4, 0x0

    .line 200
    const/4 v5, 0x0

    .line 201
    const/4 v6, 0x0

    .line 202
    const/4 v8, 0x0

    .line 203
    const/4 v9, 0x0

    .line 204
    const/4 v10, 0x0

    .line 205
    const/4 v11, 0x0

    .line 206
    const/4 v12, 0x0

    .line 207
    const/4 v13, 0x0

    .line 208
    invoke-static/range {v1 .. v15}, Lw5/e;->b(Lw5/e;Ljava/util/List;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lw5/e;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i0(Lw5/e;)V

    .line 213
    .line 214
    .line 215
    return-void
.end method

.method public r(Lf6/j;Lkotlin/jvm/functions/Function0;)V
    .locals 10

    .line 1
    const-string v0, "draftFunctions"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->U0(Lf6/j;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance v7, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndBack$1;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-direct {v7, p0, p1, p2, v0}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndBack$1;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lf6/j;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    .line 27
    const/16 v8, 0x1f

    .line 28
    .line 29
    const/4 v9, 0x0

    .line 30
    const/4 v2, 0x0

    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    move-object v1, p0

    .line 36
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public s(Lf6/j;Lkotlin/jvm/functions/Function0;)V
    .locals 10

    .line 1
    const-string v0, "draftFunctions"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "lastCallback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v7, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndChangeQuestionToNext$1;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {v7, p0, p1, p2, v0}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndChangeQuestionToNext$1;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lf6/j;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    .line 15
    .line 16
    .line 17
    const/16 v8, 0x1f

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x0

    .line 25
    move-object v1, p0

    .line 26
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public t(Lf6/j;)V
    .locals 10

    .line 1
    const-string v0, "draftFunctions"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v7, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v7, p0, p1, v0}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lf6/j;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    .line 12
    const/16 v8, 0x1f

    .line 13
    .line 14
    const/4 v9, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    move-object v1, p0

    .line 21
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public u(Lf6/j;Lkotlin/jvm/functions/Function0;)V
    .locals 10

    .line 1
    const-string v0, "draftFunctions"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v7, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndSubmitTask$1;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {v7, p0, p1, p2, v0}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndSubmitTask$1;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lf6/j;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    .line 15
    .line 16
    .line 17
    const/16 v8, 0x1f

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x0

    .line 25
    move-object v1, p0

    .line 26
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public v0(Lcom/zykj/evaluation/bean/TaskDetailInfo;)V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "taskDetailInfo"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->I()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v3, 0x2

    .line 15
    const-string v4, ""

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getTotalAnswerScore()D

    .line 21
    .line 22
    .line 23
    move-result-wide v6

    .line 24
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getTotalScore()D

    .line 25
    .line 26
    .line 27
    move-result-wide v8

    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v6, "/"

    .line 37
    .line 38
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getOriginScore()Ljava/lang/Double;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    const-string v8, "\u5f97\u5206: "

    .line 53
    .line 54
    if-eqz v7, :cond_0

    .line 55
    .line 56
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getOriginScore()Ljava/lang/Double;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getTotalScore()D

    .line 61
    .line 62
    .line 63
    move-result-wide v9

    .line 64
    new-instance v5, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    new-instance v5, Landroidx/compose/ui/text/AnnotatedString$Builder;

    .line 83
    .line 84
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getOriginScore()Ljava/lang/Double;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getTotalScore()D

    .line 89
    .line 90
    .line 91
    move-result-wide v9

    .line 92
    new-instance v11, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v11, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v6, ", \u4fee\u6b63\u540e\u5f97\u5206: "

    .line 110
    .line 111
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-direct {v5, v1}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    new-instance v6, Landroidx/compose/ui/text/SpanStyle;

    .line 125
    .line 126
    sget-object v1, Landroidx/compose/ui/text/style/TextDecoration;->Companion:Landroidx/compose/ui/text/style/TextDecoration$Companion;

    .line 127
    .line 128
    invoke-virtual {v1}, Landroidx/compose/ui/text/style/TextDecoration$Companion;->getLineThrough()Landroidx/compose/ui/text/style/TextDecoration;

    .line 129
    .line 130
    .line 131
    move-result-object v23

    .line 132
    const v27, 0xefff

    .line 133
    .line 134
    .line 135
    const/16 v28, 0x0

    .line 136
    .line 137
    const-wide/16 v7, 0x0

    .line 138
    .line 139
    const-wide/16 v9, 0x0

    .line 140
    .line 141
    const/4 v11, 0x0

    .line 142
    const/4 v12, 0x0

    .line 143
    const/4 v13, 0x0

    .line 144
    const/4 v14, 0x0

    .line 145
    const/4 v15, 0x0

    .line 146
    const-wide/16 v16, 0x0

    .line 147
    .line 148
    const/16 v18, 0x0

    .line 149
    .line 150
    const/16 v19, 0x0

    .line 151
    .line 152
    const/16 v20, 0x0

    .line 153
    .line 154
    const-wide/16 v21, 0x0

    .line 155
    .line 156
    const/16 v24, 0x0

    .line 157
    .line 158
    const/16 v25, 0x0

    .line 159
    .line 160
    const/16 v26, 0x0

    .line 161
    .line 162
    invoke-direct/range {v6 .. v28}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    const/4 v3, 0x3

    .line 170
    add-int/2addr v1, v3

    .line 171
    invoke-virtual {v5, v6, v3, v1}, Landroidx/compose/ui/text/AnnotatedString$Builder;->addStyle(Landroidx/compose/ui/text/SpanStyle;II)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v5}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    :goto_0
    move-object v12, v1

    .line 179
    goto :goto_1

    .line 180
    :cond_0
    new-instance v6, Landroidx/compose/ui/text/AnnotatedString;

    .line 181
    .line 182
    new-instance v7, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-direct {v6, v1, v5, v3, v5}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 198
    .line 199
    .line 200
    move-object v12, v6

    .line 201
    goto :goto_1

    .line 202
    :cond_1
    new-instance v1, Landroidx/compose/ui/text/AnnotatedString;

    .line 203
    .line 204
    invoke-direct {v1, v4, v5, v3, v5}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 205
    .line 206
    .line 207
    goto :goto_0

    .line 208
    :goto_1
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->w()Lcom/zykj/evaluation/ui/detail/b;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->x:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 213
    .line 214
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    check-cast v1, Lcom/zykj/http/bean/HeaderBean;

    .line 219
    .line 220
    invoke-virtual {v1}, Lcom/zykj/http/bean/HeaderBean;->getServerUrl()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    if-nez v1, :cond_2

    .line 225
    .line 226
    move-object v1, v4

    .line 227
    :cond_2
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getPath()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    if-nez v3, :cond_3

    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_3
    move-object v4, v3

    .line 235
    :goto_2
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->C()Z

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    new-instance v5, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    const-string v1, "?showAnalysis="

    .line 251
    .line 252
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v13

    .line 262
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    const-string v3, "isCorrectShowAnalysis"

    .line 267
    .line 268
    const/4 v4, 0x1

    .line 269
    invoke-virtual {v1, v3, v4}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    xor-int/lit8 v15, v1, 0x1

    .line 274
    .line 275
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->K()Lg7/e;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getId()J

    .line 280
    .line 281
    .line 282
    move-result-wide v3

    .line 283
    invoke-virtual {v1, v3, v4}, Lg7/e;->j(J)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v16

    .line 287
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAskForHelp()Z

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    if-eqz v1, :cond_4

    .line 292
    .line 293
    sget-object v1, Lcom/zykj/evaluation/ui/detail/a$b;->c:Lcom/zykj/evaluation/ui/detail/a$b;

    .line 294
    .line 295
    :goto_3
    move-object/from16 v18, v1

    .line 296
    .line 297
    goto :goto_4

    .line 298
    :cond_4
    sget-object v1, Lcom/zykj/evaluation/ui/detail/a$a;->c:Lcom/zykj/evaluation/ui/detail/a$a;

    .line 299
    .line 300
    goto :goto_3

    .line 301
    :goto_4
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->isInMistakeBook()Z

    .line 302
    .line 303
    .line 304
    move-result v1

    .line 305
    if-eqz v1, :cond_5

    .line 306
    .line 307
    sget-object v1, Lcom/zykj/evaluation/ui/detail/d$b;->c:Lcom/zykj/evaluation/ui/detail/d$b;

    .line 308
    .line 309
    :goto_5
    move-object/from16 v19, v1

    .line 310
    .line 311
    goto :goto_6

    .line 312
    :cond_5
    sget-object v1, Lcom/zykj/evaluation/ui/detail/d$a;->c:Lcom/zykj/evaluation/ui/detail/d$a;

    .line 313
    .line 314
    goto :goto_5

    .line 315
    :goto_6
    sget-object v20, Lw5/i$a;->c:Lw5/i$a;

    .line 316
    .line 317
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstLastModifyTime()Ljava/lang/Long;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    if-eqz v1, :cond_6

    .line 322
    .line 323
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 324
    .line 325
    .line 326
    move-result-wide v3

    .line 327
    :goto_7
    move-wide/from16 v25, v3

    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_6
    const-wide/16 v3, 0x0

    .line 331
    .line 332
    goto :goto_7

    .line 333
    :goto_8
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getStem()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v27

    .line 337
    const v28, 0x3c41f

    .line 338
    .line 339
    .line 340
    const/16 v29, 0x0

    .line 341
    .line 342
    const/4 v7, 0x0

    .line 343
    const/4 v8, 0x0

    .line 344
    const/4 v9, 0x0

    .line 345
    const/4 v10, 0x0

    .line 346
    const/4 v11, 0x0

    .line 347
    const/4 v14, 0x0

    .line 348
    const/16 v17, 0x0

    .line 349
    .line 350
    const/16 v21, 0x0

    .line 351
    .line 352
    const/16 v22, 0x0

    .line 353
    .line 354
    const/16 v23, 0x0

    .line 355
    .line 356
    const/16 v24, 0x0

    .line 357
    .line 358
    invoke-static/range {v6 .. v29}, Lcom/zykj/evaluation/ui/detail/b;->b(Lcom/zykj/evaluation/ui/detail/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;ZZLjava/lang/String;ZLcom/zykj/evaluation/ui/detail/a;Lcom/zykj/evaluation/ui/detail/d;Lw5/i;ZZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/b;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->h0(Lcom/zykj/evaluation/ui/detail/b;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    const/16 v15, 0xffb

    .line 370
    .line 371
    const/16 v16, 0x0

    .line 372
    .line 373
    const/4 v3, 0x0

    .line 374
    const/4 v4, 0x0

    .line 375
    const/4 v5, 0x0

    .line 376
    const/4 v6, 0x0

    .line 377
    const/4 v11, 0x0

    .line 378
    const/4 v12, 0x0

    .line 379
    const/4 v13, 0x0

    .line 380
    const/4 v14, 0x0

    .line 381
    invoke-static/range {v2 .. v16}, Lw5/e;->b(Lw5/e;Ljava/util/List;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lw5/e;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i0(Lw5/e;)V

    .line 386
    .line 387
    .line 388
    return-void
.end method

.method public w0(Lcom/zykj/evaluation/bean/TaskDetailInfo;Ljava/util/Map;)V
    .locals 34

    .line 1
    move-object/from16 v14, p1

    .line 2
    .line 3
    move-object/from16 v6, p2

    .line 4
    .line 5
    const-string v0, "taskDetailInfo"

    .line 6
    .line 7
    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v0, "localAnswerMap"

    .line 11
    .line 12
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v15, Landroidx/collection/ArrayMap;

    .line 16
    .line 17
    invoke-direct {v15}, Landroidx/collection/ArrayMap;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerList()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getUuid()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {v15, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance v0, Landroidx/collection/ArrayMap;

    .line 49
    .line 50
    invoke-direct {v0}, Landroidx/collection/ArrayMap;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getLastRoundRevisingRecords()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Lcom/zykj/evaluation/bean/RevisingRecord;

    .line 72
    .line 73
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/RevisingRecord;->getUuid()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    new-instance v10, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 84
    .line 85
    .line 86
    new-instance v11, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    new-instance v12, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    new-instance v13, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerWithQuestion()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    const/16 v2, 0xa

    .line 106
    .line 107
    const/16 v16, 0x0

    .line 108
    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->M()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getRevisingAnswerd()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getId()J

    .line 120
    .line 121
    .line 122
    move-result-wide v3

    .line 123
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlows()Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    new-instance v7, Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-static {v5, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 134
    .line 135
    .line 136
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    if-eqz v8, :cond_4

    .line 145
    .line 146
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    check-cast v8, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 151
    .line 152
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    if-eqz v9, :cond_3

    .line 157
    .line 158
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v9

    .line 162
    check-cast v9, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 163
    .line 164
    if-nez v9, :cond_2

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_2
    move-object v8, v9

    .line 168
    :cond_3
    :goto_3
    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_4
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerList()Ljava/util/List;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getLastRoundRevisingRecords()Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    move-object v9, v7

    .line 181
    move-object v7, v5

    .line 182
    move-object v5, v9

    .line 183
    move-object v9, v10

    .line 184
    move-object v10, v11

    .line 185
    move-object v11, v12

    .line 186
    move-object v12, v13

    .line 187
    move v13, v2

    .line 188
    move v2, v0

    .line 189
    move-object/from16 v0, p0

    .line 190
    .line 191
    invoke-virtual/range {v0 .. v12}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->R0(IZJLjava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 192
    .line 193
    .line 194
    move-object/from16 v21, v12

    .line 195
    .line 196
    move-object v12, v11

    .line 197
    move-object v14, v6

    .line 198
    move-object v11, v10

    .line 199
    move-object v10, v9

    .line 200
    :goto_4
    move-object/from16 v13, v21

    .line 201
    .line 202
    goto/16 :goto_e

    .line 203
    .line 204
    :cond_5
    move-object v1, v6

    .line 205
    move-object/from16 v21, v13

    .line 206
    .line 207
    move v13, v2

    .line 208
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlows()Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    const/4 v3, 0x1

    .line 217
    if-le v2, v3, :cond_6

    .line 218
    .line 219
    move/from16 v17, v3

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_6
    move/from16 v17, v16

    .line 223
    .line 224
    :goto_5
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlows()Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object v18

    .line 232
    :goto_6
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    if-eqz v2, :cond_11

    .line 237
    .line 238
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    move-object v5, v2

    .line 243
    check-cast v5, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 244
    .line 245
    const-string v2, "."

    .line 246
    .line 247
    const-string v19, ""

    .line 248
    .line 249
    if-eqz v17, :cond_8

    .line 250
    .line 251
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    if-nez v4, :cond_7

    .line 256
    .line 257
    move-object/from16 v4, v19

    .line 258
    .line 259
    goto :goto_7

    .line 260
    :cond_7
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    new-instance v6, Ljava/lang/StringBuilder;

    .line 265
    .line 266
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    :goto_7
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getNumber()I

    .line 280
    .line 281
    .line 282
    move-result v6

    .line 283
    new-instance v7, Ljava/lang/StringBuilder;

    .line 284
    .line 285
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    goto :goto_8

    .line 299
    :cond_8
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    if-nez v4, :cond_9

    .line 304
    .line 305
    move-object/from16 v4, v19

    .line 306
    .line 307
    goto :goto_8

    .line 308
    :cond_9
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    :goto_8
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getType()I

    .line 317
    .line 318
    .line 319
    move-result v6

    .line 320
    if-nez v6, :cond_f

    .line 321
    .line 322
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    if-eqz v6, :cond_f

    .line 327
    .line 328
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 329
    .line 330
    .line 331
    move-result v6

    .line 332
    if-eqz v6, :cond_a

    .line 333
    .line 334
    goto/16 :goto_c

    .line 335
    .line 336
    :cond_a
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 337
    .line 338
    .line 339
    move-result-object v6

    .line 340
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 341
    .line 342
    .line 343
    move-result v6

    .line 344
    if-le v6, v3, :cond_b

    .line 345
    .line 346
    move/from16 v20, v3

    .line 347
    .line 348
    goto :goto_9

    .line 349
    :cond_b
    move/from16 v20, v16

    .line 350
    .line 351
    :goto_9
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 352
    .line 353
    .line 354
    move-result-object v5

    .line 355
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 356
    .line 357
    .line 358
    move-result-object v22

    .line 359
    :goto_a
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    .line 360
    .line 361
    .line 362
    move-result v5

    .line 363
    if-eqz v5, :cond_e

    .line 364
    .line 365
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v5

    .line 369
    check-cast v5, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 370
    .line 371
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->M()I

    .line 372
    .line 373
    .line 374
    move-result v6

    .line 375
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getRevisingAnswerd()Z

    .line 376
    .line 377
    .line 378
    move-result v7

    .line 379
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getId()J

    .line 380
    .line 381
    .line 382
    move-result-wide v8

    .line 383
    if-eqz v20, :cond_c

    .line 384
    .line 385
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getNumber()I

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    new-instance v13, Ljava/lang/StringBuilder;

    .line 390
    .line 391
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    goto :goto_b

    .line 405
    :cond_c
    move-object/from16 v3, v19

    .line 406
    .line 407
    :goto_b
    new-instance v13, Ljava/lang/StringBuilder;

    .line 408
    .line 409
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v13

    .line 426
    invoke-interface {v1, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v13

    .line 430
    check-cast v13, Ljava/util/List;

    .line 431
    .line 432
    if-nez v13, :cond_d

    .line 433
    .line 434
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 435
    .line 436
    .line 437
    move-result-object v13

    .line 438
    :cond_d
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    invoke-virtual {v15, v1}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    check-cast v1, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 447
    .line 448
    move-object/from16 v25, v1

    .line 449
    .line 450
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v1

    .line 454
    invoke-virtual {v0, v1}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    check-cast v1, Lcom/zykj/evaluation/bean/RevisingRecord;

    .line 459
    .line 460
    move-object/from16 v14, p2

    .line 461
    .line 462
    move-object/from16 v31, v0

    .line 463
    .line 464
    move-object/from16 v23, v2

    .line 465
    .line 466
    move v2, v7

    .line 467
    move-object v7, v13

    .line 468
    move-object/from16 v13, v21

    .line 469
    .line 470
    const/16 v24, 0x1

    .line 471
    .line 472
    move-object/from16 v0, p0

    .line 473
    .line 474
    move-object/from16 v21, v4

    .line 475
    .line 476
    move-wide/from16 v32, v8

    .line 477
    .line 478
    move-object v9, v1

    .line 479
    move v1, v6

    .line 480
    move-object/from16 v8, v25

    .line 481
    .line 482
    move-object v6, v3

    .line 483
    move-wide/from16 v3, v32

    .line 484
    .line 485
    invoke-virtual/range {v0 .. v13}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->Q0(IZJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Ljava/util/List;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Lcom/zykj/evaluation/bean/RevisingRecord;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 486
    .line 487
    .line 488
    move-object v1, v14

    .line 489
    move-object/from16 v4, v21

    .line 490
    .line 491
    move-object/from16 v2, v23

    .line 492
    .line 493
    move/from16 v3, v24

    .line 494
    .line 495
    move-object/from16 v0, v31

    .line 496
    .line 497
    move-object/from16 v14, p1

    .line 498
    .line 499
    move-object/from16 v21, v13

    .line 500
    .line 501
    const/16 v13, 0xa

    .line 502
    .line 503
    goto/16 :goto_a

    .line 504
    .line 505
    :cond_e
    move-object v14, v1

    .line 506
    move/from16 v24, v3

    .line 507
    .line 508
    move-object/from16 v31, v0

    .line 509
    .line 510
    move-object/from16 v13, v21

    .line 511
    .line 512
    move-object/from16 v0, p0

    .line 513
    .line 514
    goto :goto_d

    .line 515
    :cond_f
    :goto_c
    move-object/from16 v31, v0

    .line 516
    .line 517
    move-object v14, v1

    .line 518
    move/from16 v24, v3

    .line 519
    .line 520
    move-object/from16 v13, v21

    .line 521
    .line 522
    move-object/from16 v21, v4

    .line 523
    .line 524
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->M()I

    .line 525
    .line 526
    .line 527
    move-result v1

    .line 528
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getRevisingAnswerd()Z

    .line 529
    .line 530
    .line 531
    move-result v2

    .line 532
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getId()J

    .line 533
    .line 534
    .line 535
    move-result-wide v3

    .line 536
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    check-cast v0, Ljava/util/List;

    .line 545
    .line 546
    if-nez v0, :cond_10

    .line 547
    .line 548
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    :cond_10
    move-object v7, v0

    .line 553
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    invoke-virtual {v15, v0}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    move-object v8, v0

    .line 562
    check-cast v8, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 563
    .line 564
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    move-object/from16 v6, v31

    .line 569
    .line 570
    invoke-virtual {v6, v0}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    move-object v9, v0

    .line 575
    check-cast v9, Lcom/zykj/evaluation/bean/RevisingRecord;

    .line 576
    .line 577
    move-object/from16 v0, p0

    .line 578
    .line 579
    move-object/from16 v6, v21

    .line 580
    .line 581
    invoke-virtual/range {v0 .. v13}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->Q0(IZJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Ljava/util/List;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Lcom/zykj/evaluation/bean/RevisingRecord;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 582
    .line 583
    .line 584
    :goto_d
    move-object/from16 v21, v13

    .line 585
    .line 586
    move-object v1, v14

    .line 587
    move/from16 v3, v24

    .line 588
    .line 589
    move-object/from16 v0, v31

    .line 590
    .line 591
    const/16 v13, 0xa

    .line 592
    .line 593
    move-object/from16 v14, p1

    .line 594
    .line 595
    goto/16 :goto_6

    .line 596
    .line 597
    :cond_11
    move-object v14, v1

    .line 598
    move-object/from16 v0, p0

    .line 599
    .line 600
    goto/16 :goto_4

    .line 601
    .line 602
    :goto_e
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getRevisingAnswerd()Z

    .line 603
    .line 604
    .line 605
    move-result v1

    .line 606
    const/4 v2, 0x0

    .line 607
    if-nez v1, :cond_15

    .line 608
    .line 609
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerList()Ljava/util/List;

    .line 610
    .line 611
    .line 612
    move-result-object v1

    .line 613
    if-eqz v1, :cond_12

    .line 614
    .line 615
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 616
    .line 617
    .line 618
    move-result v3

    .line 619
    if-eqz v3, :cond_12

    .line 620
    .line 621
    goto :goto_f

    .line 622
    :cond_12
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 623
    .line 624
    .line 625
    move-result-object v1

    .line 626
    :cond_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 627
    .line 628
    .line 629
    move-result v3

    .line 630
    if-eqz v3, :cond_14

    .line 631
    .line 632
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object v3

    .line 636
    check-cast v3, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 637
    .line 638
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getResult()I

    .line 639
    .line 640
    .line 641
    move-result v3

    .line 642
    sget-object v4, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->REVISING_RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 643
    .line 644
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 645
    .line 646
    .line 647
    move-result v4

    .line 648
    if-ne v3, v4, :cond_13

    .line 649
    .line 650
    goto :goto_10

    .line 651
    :cond_14
    :goto_f
    move-object/from16 v22, v11

    .line 652
    .line 653
    goto/16 :goto_17

    .line 654
    .line 655
    :cond_15
    :goto_10
    new-instance v1, Ljava/util/ArrayList;

    .line 656
    .line 657
    const/16 v3, 0xa

    .line 658
    .line 659
    invoke-static {v11, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 660
    .line 661
    .line 662
    move-result v4

    .line 663
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 664
    .line 665
    .line 666
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 667
    .line 668
    .line 669
    move-result v4

    .line 670
    move/from16 v5, v16

    .line 671
    .line 672
    :goto_11
    if-ge v5, v4, :cond_1d

    .line 673
    .line 674
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v6

    .line 678
    add-int/lit8 v5, v5, 0x1

    .line 679
    .line 680
    move-object/from16 v17, v6

    .line 681
    .line 682
    check-cast v17, Lcom/zykj/evaluation/ui/detail/c;

    .line 683
    .line 684
    invoke-virtual/range {v17 .. v17}, Lcom/zykj/evaluation/ui/detail/c;->l()Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v6

    .line 688
    invoke-interface {v14, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 689
    .line 690
    .line 691
    move-result v6

    .line 692
    if-eqz v6, :cond_16

    .line 693
    .line 694
    goto/16 :goto_16

    .line 695
    .line 696
    :cond_16
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 697
    .line 698
    .line 699
    move-result v6

    .line 700
    move/from16 v7, v16

    .line 701
    .line 702
    :cond_17
    if-ge v7, v6, :cond_18

    .line 703
    .line 704
    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v8

    .line 708
    add-int/lit8 v7, v7, 0x1

    .line 709
    .line 710
    move-object v9, v8

    .line 711
    check-cast v9, Lcom/zykj/evaluation/ui/detail/c;

    .line 712
    .line 713
    invoke-virtual {v9}, Lcom/zykj/evaluation/ui/detail/c;->l()Ljava/lang/String;

    .line 714
    .line 715
    .line 716
    move-result-object v9

    .line 717
    invoke-virtual/range {v17 .. v17}, Lcom/zykj/evaluation/ui/detail/c;->l()Ljava/lang/String;

    .line 718
    .line 719
    .line 720
    move-result-object v15

    .line 721
    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 722
    .line 723
    .line 724
    move-result v9

    .line 725
    if-eqz v9, :cond_17

    .line 726
    .line 727
    goto :goto_12

    .line 728
    :cond_18
    move-object v8, v2

    .line 729
    :goto_12
    check-cast v8, Lcom/zykj/evaluation/ui/detail/c;

    .line 730
    .line 731
    if-eqz v8, :cond_1b

    .line 732
    .line 733
    invoke-virtual {v8}, Lcom/zykj/evaluation/ui/detail/c;->c()Ljava/util/List;

    .line 734
    .line 735
    .line 736
    move-result-object v24

    .line 737
    invoke-virtual/range {v17 .. v17}, Lcom/zykj/evaluation/ui/detail/c;->g()Ljava/util/List;

    .line 738
    .line 739
    .line 740
    move-result-object v6

    .line 741
    new-instance v7, Ljava/util/ArrayList;

    .line 742
    .line 743
    invoke-static {v6, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 744
    .line 745
    .line 746
    move-result v9

    .line 747
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 748
    .line 749
    .line 750
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 751
    .line 752
    .line 753
    move-result-object v6

    .line 754
    :goto_13
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 755
    .line 756
    .line 757
    move-result v9

    .line 758
    if-eqz v9, :cond_1a

    .line 759
    .line 760
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    move-result-object v9

    .line 764
    move-object/from16 v18, v9

    .line 765
    .line 766
    check-cast v18, Lw5/b;

    .line 767
    .line 768
    invoke-virtual {v8}, Lcom/zykj/evaluation/ui/detail/c;->c()Ljava/util/List;

    .line 769
    .line 770
    .line 771
    move-result-object v9

    .line 772
    invoke-virtual/range {v18 .. v18}, Lw5/b;->d()Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object v15

    .line 776
    invoke-interface {v9, v15}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 777
    .line 778
    .line 779
    move-result v9

    .line 780
    if-eqz v9, :cond_19

    .line 781
    .line 782
    sget-object v9, Lw5/a$a;->c:Lw5/a$a;

    .line 783
    .line 784
    :goto_14
    move-object/from16 v20, v9

    .line 785
    .line 786
    goto :goto_15

    .line 787
    :cond_19
    sget-object v9, Lw5/a$b;->c:Lw5/a$b;

    .line 788
    .line 789
    goto :goto_14

    .line 790
    :goto_15
    const/16 v22, 0x5

    .line 791
    .line 792
    const/16 v23, 0x0

    .line 793
    .line 794
    const/16 v19, 0x0

    .line 795
    .line 796
    const/16 v21, 0x0

    .line 797
    .line 798
    invoke-static/range {v18 .. v23}, Lw5/b;->b(Lw5/b;Ljava/lang/String;Lw5/a;ZILjava/lang/Object;)Lw5/b;

    .line 799
    .line 800
    .line 801
    move-result-object v9

    .line 802
    invoke-interface {v7, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 803
    .line 804
    .line 805
    goto :goto_13

    .line 806
    :cond_1a
    const/16 v29, 0x3cf

    .line 807
    .line 808
    const/16 v30, 0x0

    .line 809
    .line 810
    const-wide/16 v18, 0x0

    .line 811
    .line 812
    const/16 v20, 0x0

    .line 813
    .line 814
    const/16 v21, 0x0

    .line 815
    .line 816
    const/16 v22, 0x0

    .line 817
    .line 818
    const/16 v25, 0x0

    .line 819
    .line 820
    const/16 v26, 0x0

    .line 821
    .line 822
    const/16 v27, 0x0

    .line 823
    .line 824
    const/16 v28, 0x0

    .line 825
    .line 826
    move-object/from16 v23, v7

    .line 827
    .line 828
    invoke-static/range {v17 .. v30}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    .line 829
    .line 830
    .line 831
    move-result-object v6

    .line 832
    if-nez v6, :cond_1c

    .line 833
    .line 834
    :cond_1b
    :goto_16
    move-object/from16 v6, v17

    .line 835
    .line 836
    :cond_1c
    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 837
    .line 838
    .line 839
    goto/16 :goto_11

    .line 840
    .line 841
    :cond_1d
    move-object/from16 v22, v1

    .line 842
    .line 843
    :goto_17
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 844
    .line 845
    .line 846
    move-result-object v16

    .line 847
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerWithQuestion()Z

    .line 848
    .line 849
    .line 850
    move-result v18

    .line 851
    invoke-static/range {p1 .. p1}, Lw5/h;->g(Lcom/zykj/evaluation/bean/TaskDetailInfo;)Ljava/lang/String;

    .line 852
    .line 853
    .line 854
    move-result-object v23

    .line 855
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->D()Z

    .line 856
    .line 857
    .line 858
    move-result v1

    .line 859
    move-object/from16 v14, p1

    .line 860
    .line 861
    invoke-static {v14, v1}, Lw5/h;->h(Lcom/zykj/evaluation/bean/TaskDetailInfo;Z)Ljava/util/List;

    .line 862
    .line 863
    .line 864
    move-result-object v25

    .line 865
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->D()Z

    .line 866
    .line 867
    .line 868
    move-result v1

    .line 869
    invoke-static {v14, v1}, Lw5/h;->k(Lcom/zykj/evaluation/bean/TaskDetailInfo;Z)Ljava/util/List;

    .line 870
    .line 871
    .line 872
    move-result-object v26

    .line 873
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->D()Z

    .line 874
    .line 875
    .line 876
    move-result v1

    .line 877
    invoke-static {v14, v1}, Lw5/h;->j(Lcom/zykj/evaluation/bean/TaskDetailInfo;Z)Ljava/util/List;

    .line 878
    .line 879
    .line 880
    move-result-object v27

    .line 881
    new-instance v1, Ljava/util/ArrayList;

    .line 882
    .line 883
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 884
    .line 885
    .line 886
    invoke-static {v14}, Lw5/h;->f(Lcom/zykj/evaluation/bean/TaskDetailInfo;)Lw5/c;

    .line 887
    .line 888
    .line 889
    move-result-object v3

    .line 890
    if-eqz v3, :cond_1e

    .line 891
    .line 892
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 893
    .line 894
    .line 895
    :cond_1e
    invoke-static {v14}, Lw5/h;->e(Lcom/zykj/evaluation/bean/TaskDetailInfo;)Lw5/c;

    .line 896
    .line 897
    .line 898
    move-result-object v3

    .line 899
    if-eqz v3, :cond_1f

    .line 900
    .line 901
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 902
    .line 903
    .line 904
    :cond_1f
    const/16 v29, 0x84

    .line 905
    .line 906
    const/16 v30, 0x0

    .line 907
    .line 908
    const/16 v19, 0x0

    .line 909
    .line 910
    const/16 v24, 0x0

    .line 911
    .line 912
    move-object/from16 v28, v1

    .line 913
    .line 914
    move-object/from16 v17, v10

    .line 915
    .line 916
    move-object/from16 v20, v12

    .line 917
    .line 918
    move-object/from16 v21, v13

    .line 919
    .line 920
    invoke-static/range {v16 .. v30}, Lw5/e;->b(Lw5/e;Ljava/util/List;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lw5/e;

    .line 921
    .line 922
    .line 923
    move-result-object v1

    .line 924
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i0(Lw5/e;)V

    .line 925
    .line 926
    .line 927
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 928
    .line 929
    .line 930
    move-result-object v3

    .line 931
    new-instance v6, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$updateDetailQuestionUI$6;

    .line 932
    .line 933
    invoke-direct {v6, v0, v2}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$updateDetailQuestionUI$6;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lkotlin/coroutines/Continuation;)V

    .line 934
    .line 935
    .line 936
    const/4 v7, 0x3

    .line 937
    const/4 v8, 0x0

    .line 938
    const/4 v4, 0x0

    .line 939
    const/4 v5, 0x0

    .line 940
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 941
    .line 942
    .line 943
    return-void
.end method

.method public y0(Ljava/util/List;I)V
    .locals 26

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    const-string v1, "questionList"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    if-ltz v0, :cond_3

    .line 11
    .line 12
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ge v0, v1, :cond_2

    .line 17
    .line 18
    invoke-interface/range {p1 .. p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/zykj/evaluation/ui/detail/GuideQuestion;

    .line 23
    .line 24
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->w()Lcom/zykj/evaluation/ui/detail/b;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->getTitle()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    add-int/lit8 v1, v0, 0x1

    .line 33
    .line 34
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    new-instance v5, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, "/"

    .line 47
    .line 48
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    if-nez v0, :cond_0

    .line 59
    .line 60
    const-string v1, "\u7b2c\u4e00\u9898"

    .line 61
    .line 62
    :goto_0
    move-object/from16 v19, v1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_0
    const-string v1, "\u4e0a\u4e00\u9898"

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :goto_1
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    add-int/lit8 v1, v1, -0x1

    .line 73
    .line 74
    if-ne v0, v1, :cond_1

    .line 75
    .line 76
    const-string v0, "\u4fdd\u5b58\u7b54\u6848"

    .line 77
    .line 78
    :goto_2
    move-object/from16 v20, v0

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_1
    const-string v0, "\u4fdd\u5b58,\u4e0b\u4e00\u9898"

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :goto_3
    const v24, 0xcfffc

    .line 85
    .line 86
    .line 87
    const/16 v25, 0x0

    .line 88
    .line 89
    const/4 v5, 0x0

    .line 90
    const/4 v6, 0x0

    .line 91
    const/4 v7, 0x0

    .line 92
    const/4 v8, 0x0

    .line 93
    const/4 v9, 0x0

    .line 94
    const/4 v10, 0x0

    .line 95
    const/4 v11, 0x0

    .line 96
    const/4 v12, 0x0

    .line 97
    const/4 v13, 0x0

    .line 98
    const/4 v14, 0x0

    .line 99
    const/4 v15, 0x0

    .line 100
    const/16 v16, 0x0

    .line 101
    .line 102
    const/16 v17, 0x0

    .line 103
    .line 104
    const/16 v18, 0x0

    .line 105
    .line 106
    const-wide/16 v21, 0x0

    .line 107
    .line 108
    const/16 v23, 0x0

    .line 109
    .line 110
    invoke-static/range {v2 .. v25}, Lcom/zykj/evaluation/ui/detail/b;->b(Lcom/zykj/evaluation/ui/detail/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;ZZLjava/lang/String;ZLcom/zykj/evaluation/ui/detail/a;Lcom/zykj/evaluation/ui/detail/d;Lw5/i;ZZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/b;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    move-object/from16 v1, p0

    .line 115
    .line 116
    invoke-virtual {v1, v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->h0(Lcom/zykj/evaluation/ui/detail/b;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_2
    move-object/from16 v1, p0

    .line 121
    .line 122
    return-void

    .line 123
    :cond_3
    move-object/from16 v1, p0

    .line 124
    .line 125
    return-void
.end method

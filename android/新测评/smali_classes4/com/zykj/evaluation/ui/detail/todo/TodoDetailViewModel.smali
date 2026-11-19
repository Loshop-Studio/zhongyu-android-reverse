.class public final Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;
.super Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u0007\u0018\u00002\u00020\u0001BG\u0008\u0007\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0008\u0001\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ%\u0010#\u001a\u00020\u00162\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\"\u001a\u00020!H\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010\'\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%H\u0016\u00a2\u0006\u0004\u0008\'\u0010(J1\u0010,\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020*0\u001e0)H\u0016\u00a2\u0006\u0004\u0008,\u0010-J#\u00100\u001a\u00020\u00162\u0006\u0010.\u001a\u00020*2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020*0\u001e\u00a2\u0006\u0004\u00080\u00101J\u0017\u00102\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u00082\u00103J%\u00106\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u000c\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u001604H\u0016\u00a2\u0006\u0004\u00086\u00107J%\u00109\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u000c\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u001604H\u0016\u00a2\u0006\u0004\u00089\u00107J%\u0010:\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u000c\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u001604H\u0016\u00a2\u0006\u0004\u0008:\u00107J[\u0010D\u001a\u00020\u00162\u0006\u0010;\u001a\u00020!2\u0006\u0010=\u001a\u00020<2\u0008\u0010?\u001a\u0004\u0018\u00010>2\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020*0\u001e0)2\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020A0@j\u0008\u0012\u0004\u0012\u00020A`BH\u0002\u00a2\u0006\u0004\u0008D\u0010EJU\u0010H\u001a\u00020\u00162\u0006\u0010;\u001a\u00020!2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010F\u001a\u00020*2\u000c\u0010G\u001a\u0008\u0012\u0004\u0012\u00020*0\u001e2\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020A0@j\u0008\u0012\u0004\u0012\u00020A`BH\u0002\u00a2\u0006\u0004\u0008H\u0010IR\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008L\u0010KR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Q\u0010RR\u0016\u0010U\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008S\u0010T\u00a8\u0006V"
    }
    d2 = {
        "Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;",
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
        "Lf6/j;",
        "draftFunctions",
        "",
        "M0",
        "(Lf6/j;)Z",
        "",
        "J0",
        "(Lf6/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/zykj/evaluation/bean/bundle/DetailBundle;",
        "detailBundle",
        "isSpecial",
        "U",
        "(Lcom/zykj/evaluation/bean/bundle/DetailBundle;Z)V",
        "",
        "Lcom/zykj/evaluation/ui/detail/GuideQuestion;",
        "questionList",
        "",
        "index",
        "y0",
        "(Ljava/util/List;I)V",
        "Lcom/zykj/evaluation/bean/TaskDetailInfo;",
        "taskDetailInfo",
        "v0",
        "(Lcom/zykj/evaluation/bean/TaskDetailInfo;)V",
        "",
        "",
        "localAnswerMap",
        "w0",
        "(Lcom/zykj/evaluation/bean/TaskDetailInfo;Ljava/util/Map;)V",
        "uuid",
        "localAnswer",
        "N0",
        "(Ljava/lang/String;Ljava/util/List;)V",
        "t",
        "(Lf6/j;)V",
        "Lkotlin/Function0;",
        "lastCallback",
        "s",
        "(Lf6/j;Lkotlin/jvm/functions/Function0;)V",
        "callback",
        "u",
        "r",
        "specificTrainingType",
        "",
        "questionId",
        "Lcom/zykj/evaluation/bean/DetailSubQuestion;",
        "subQuestion",
        "Ljava/util/ArrayList;",
        "Lcom/zykj/evaluation/ui/detail/c;",
        "Lkotlin/collections/ArrayList;",
        "localAnswerList",
        "L0",
        "(IJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/util/Map;Ljava/util/ArrayList;)V",
        "numberString",
        "localAnswers",
        "K0",
        "(IJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V",
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
        "SMAP\nTodoDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodoDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 ArrayMap.jvm.kt\nandroidx/collection/ArrayMapKt\n*L\n1#1,546:1\n1#2:547\n295#3,2:548\n1869#3:550\n1869#3,2:551\n295#3,2:553\n1870#3:555\n1563#3:556\n1634#3,3:557\n1563#3:560\n1634#3,2:561\n1563#3:563\n1634#3,3:564\n1636#3:567\n1761#3,2:568\n1761#3,3:570\n1763#3:573\n2746#3,3:574\n1491#3:577\n1516#3,3:578\n1519#3,3:588\n1563#3:594\n1634#3,3:595\n1869#3,2:600\n1563#3:602\n1634#3,2:603\n295#3,2:605\n1636#3:607\n1869#3,2:608\n382#4,7:581\n126#5:591\n153#5,2:592\n155#5:598\n27#6:599\n*S KotlinDebug\n*F\n+ 1 TodoDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel\n*L\n123#1:548,2\n146#1:550\n161#1:551,2\n183#1:553,2\n146#1:555\n257#1:556\n257#1:557,3\n313#1:560\n313#1:561,2\n317#1:563\n317#1:564,3\n313#1:567\n454#1:568,2\n455#1:570,3\n454#1:573\n460#1:574,3\n467#1:577\n467#1:578,3\n467#1:588,3\n471#1:594\n471#1:595,3\n489#1:600,2\n508#1:602\n508#1:603,2\n510#1:605,2\n508#1:607\n524#1:608,2\n467#1:581,7\n468#1:591\n468#1:592,2\n468#1:598\n487#1:599\n*E\n"
    }
.end annotation


# instance fields
.field public final A:Lcom/zykj/evaluation/submit/SubmitTaskManger;

.field public B:Z

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
    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 35
    .line 36
    iput-object p2, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->x:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 37
    .line 38
    iput-object p3, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->y:Lcom/zykj/evaluation/di/AppDatabase;

    .line 39
    .line 40
    iput-object p4, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->z:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 41
    .line 42
    iput-object p5, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->A:Lcom/zykj/evaluation/submit/SubmitTaskManger;

    .line 43
    .line 44
    return-void
.end method

.method public static final synthetic A0(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

.method public static final synthetic B0(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lf6/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->J0(Lf6/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic C0(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

.method public static final synthetic D0(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;)I
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

.method public static final synthetic E0(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;)Ljava/util/List;
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

.method public static final synthetic F0(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lcom/zykj/evaluation/ui/detail/GuideQuestion;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

.method public static final synthetic G0(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;)Lcom/zykj/evaluation/submit/SubmitTaskManger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->A:Lcom/zykj/evaluation/submit/SubmitTaskManger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic H0(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic I0(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

.method private final J0(Lf6/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->m:I

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
    iput v3, v2, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->m:I

    .line 22
    .line 23
    :goto_0
    move-object v11, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;-><init>(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->k:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget v3, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->m:I

    .line 38
    .line 39
    const-string v12, "getId(...)"

    .line 40
    .line 41
    const/4 v13, 0x5

    .line 42
    const/4 v14, 0x4

    .line 43
    const/4 v15, 0x3

    .line 44
    const/4 v4, 0x2

    .line 45
    const/4 v5, 0x0

    .line 46
    const/4 v6, 0x1

    .line 47
    const/4 v7, 0x0

    .line 48
    if-eqz v3, :cond_6

    .line 49
    .line 50
    if-eq v3, v6, :cond_5

    .line 51
    .line 52
    if-eq v3, v4, :cond_4

    .line 53
    .line 54
    if-eq v3, v15, :cond_3

    .line 55
    .line 56
    if-eq v3, v14, :cond_2

    .line 57
    .line 58
    if-ne v3, v13, :cond_1

    .line 59
    .line 60
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->g:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, Ljava/util/ArrayList;

    .line 63
    .line 64
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->f:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, Ljava/util/List;

    .line 67
    .line 68
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->e:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v2, Ljava/util/ArrayList;

    .line 71
    .line 72
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->d:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, Landroidx/collection/ArrayMap;

    .line 75
    .line 76
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 79
    .line 80
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v2, Ln5/v;

    .line 83
    .line 84
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->a:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, Lf6/j;

    .line 87
    .line 88
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_18

    .line 92
    .line 93
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 94
    .line 95
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 96
    .line 97
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v1

    .line 101
    :cond_2
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->e:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v2, Ljava/util/List;

    .line 104
    .line 105
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->d:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v2, Ln5/v;

    .line 108
    .line 109
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->c:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 112
    .line 113
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->b:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v2, Ln5/v;

    .line 116
    .line 117
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->a:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v2, Lf6/j;

    .line 120
    .line 121
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    goto/16 :goto_e

    .line 125
    .line 126
    :cond_3
    iget-object v3, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->d:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v3, Landroid/graphics/Bitmap;

    .line 129
    .line 130
    iget-object v3, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->c:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 133
    .line 134
    iget-object v4, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->b:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v4, Ln5/v;

    .line 137
    .line 138
    iget-object v8, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->a:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v8, Lf6/j;

    .line 141
    .line 142
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    move-object v1, v5

    .line 146
    move/from16 v16, v6

    .line 147
    .line 148
    move v14, v7

    .line 149
    goto/16 :goto_4

    .line 150
    .line 151
    :cond_4
    iget-object v3, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->c:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 154
    .line 155
    iget-object v4, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->b:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v4, Ln5/v;

    .line 158
    .line 159
    iget-object v8, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->a:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v8, Lf6/j;

    .line 162
    .line 163
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    move-object v1, v5

    .line 167
    move/from16 v16, v6

    .line 168
    .line 169
    move v14, v7

    .line 170
    goto/16 :goto_3

    .line 171
    .line 172
    :cond_5
    iget-object v3, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->a:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v3, Lf6/j;

    .line 175
    .line 176
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    move-object v13, v3

    .line 180
    move v15, v4

    .line 181
    move/from16 v16, v6

    .line 182
    .line 183
    move v14, v7

    .line 184
    move-object v3, v1

    .line 185
    move-object v1, v5

    .line 186
    goto :goto_2

    .line 187
    :cond_6
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->y:Lcom/zykj/evaluation/di/AppDatabase;

    .line 191
    .line 192
    invoke-virtual {v1}, Lcom/zykj/evaluation/di/AppDatabase;->j()Ln5/w;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 197
    .line 198
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    check-cast v1, Lcom/zykj/message/server/bean/UserInfo;

    .line 203
    .line 204
    invoke-virtual {v1}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-static {v1, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 212
    .line 213
    .line 214
    move-result-wide v8

    .line 215
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->N()J

    .line 216
    .line 217
    .line 218
    move-result-wide v16

    .line 219
    sget-object v1, Lcom/zykj/evaluation/bean/TaskState$ToDo;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$ToDo;

    .line 220
    .line 221
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    move-object/from16 v18, v5

    .line 226
    .line 227
    move-wide/from16 v34, v8

    .line 228
    .line 229
    move v8, v4

    .line 230
    move-wide/from16 v4, v34

    .line 231
    .line 232
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->Q()J

    .line 233
    .line 234
    .line 235
    move-result-wide v9

    .line 236
    move-object/from16 v13, p1

    .line 237
    .line 238
    iput-object v13, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->a:Ljava/lang/Object;

    .line 239
    .line 240
    iput v6, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->m:I

    .line 241
    .line 242
    move v14, v7

    .line 243
    move v15, v8

    .line 244
    move v8, v1

    .line 245
    move-object/from16 v1, v18

    .line 246
    .line 247
    move-wide/from16 v34, v16

    .line 248
    .line 249
    move/from16 v16, v6

    .line 250
    .line 251
    move-wide/from16 v6, v34

    .line 252
    .line 253
    invoke-interface/range {v3 .. v11}, Ln5/w;->d(JJIJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    if-ne v3, v2, :cond_7

    .line 258
    .line 259
    goto/16 :goto_17

    .line 260
    .line 261
    :cond_7
    :goto_2
    check-cast v3, Ln5/v;

    .line 262
    .line 263
    new-instance v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 264
    .line 265
    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 266
    .line 267
    .line 268
    new-instance v19, Lcom/zykj/evaluation/bean/UploadData;

    .line 269
    .line 270
    const/16 v24, 0xd

    .line 271
    .line 272
    const/16 v25, 0x0

    .line 273
    .line 274
    const/16 v20, 0x0

    .line 275
    .line 276
    const-string v21, ""

    .line 277
    .line 278
    const/16 v22, 0x0

    .line 279
    .line 280
    const/16 v23, 0x0

    .line 281
    .line 282
    invoke-direct/range {v19 .. v25}, Lcom/zykj/evaluation/bean/UploadData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 283
    .line 284
    .line 285
    move-object/from16 v5, v19

    .line 286
    .line 287
    iput-object v5, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 288
    .line 289
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    new-instance v6, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$2;

    .line 294
    .line 295
    invoke-direct {v6, v13, v1}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$2;-><init>(Lf6/j;Lkotlin/coroutines/Continuation;)V

    .line 296
    .line 297
    .line 298
    iput-object v13, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->a:Ljava/lang/Object;

    .line 299
    .line 300
    iput-object v3, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->b:Ljava/lang/Object;

    .line 301
    .line 302
    iput-object v4, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->c:Ljava/lang/Object;

    .line 303
    .line 304
    iput v15, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->m:I

    .line 305
    .line 306
    invoke-static {v5, v6, v11}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    if-ne v5, v2, :cond_8

    .line 311
    .line 312
    goto/16 :goto_17

    .line 313
    .line 314
    :cond_8
    move-object v8, v4

    .line 315
    move-object v4, v3

    .line 316
    move-object v3, v8

    .line 317
    move-object v8, v13

    .line 318
    :goto_3
    invoke-virtual {v8}, Lf6/j;->j()Lkotlin/jvm/functions/Function0;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    invoke-interface {v5}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    check-cast v5, Ljava/lang/Boolean;

    .line 327
    .line 328
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    if-nez v5, :cond_a

    .line 333
    .line 334
    invoke-virtual {v8}, Lf6/j;->k()Lkotlin/jvm/functions/Function0;

    .line 335
    .line 336
    .line 337
    move-result-object v5

    .line 338
    invoke-interface {v5}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    check-cast v5, Ljava/lang/Boolean;

    .line 343
    .line 344
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 345
    .line 346
    .line 347
    move-result v5

    .line 348
    if-nez v5, :cond_9

    .line 349
    .line 350
    if-eqz v4, :cond_a

    .line 351
    .line 352
    invoke-virtual {v4}, Ln5/v;->f()Lcom/zykj/evaluation/bean/UploadData;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    if-eqz v5, :cond_a

    .line 357
    .line 358
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/UploadData;->getCommitState()I

    .line 359
    .line 360
    .line 361
    move-result v5

    .line 362
    sget-object v6, Lm5/e$b;->b:Lm5/e$b;

    .line 363
    .line 364
    invoke-virtual {v6}, Lm5/e;->a()I

    .line 365
    .line 366
    .line 367
    move-result v6

    .line 368
    if-ne v5, v6, :cond_a

    .line 369
    .line 370
    :cond_9
    if-eqz v4, :cond_c

    .line 371
    .line 372
    invoke-virtual {v4}, Ln5/v;->f()Lcom/zykj/evaluation/bean/UploadData;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    if-eqz v5, :cond_c

    .line 377
    .line 378
    iput-object v5, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 379
    .line 380
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 381
    .line 382
    goto :goto_5

    .line 383
    :cond_a
    invoke-virtual {v8}, Lf6/j;->g()Lkotlin/jvm/functions/Function0;

    .line 384
    .line 385
    .line 386
    move-result-object v5

    .line 387
    invoke-interface {v5}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v5

    .line 391
    check-cast v5, Landroid/graphics/Bitmap;

    .line 392
    .line 393
    if-eqz v5, :cond_c

    .line 394
    .line 395
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 396
    .line 397
    .line 398
    move-result-object v6

    .line 399
    new-instance v7, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$3$1;

    .line 400
    .line 401
    invoke-direct {v7, v0, v5, v3, v1}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$3$1;-><init>(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Landroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    .line 402
    .line 403
    .line 404
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v9

    .line 408
    iput-object v9, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->a:Ljava/lang/Object;

    .line 409
    .line 410
    iput-object v4, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->b:Ljava/lang/Object;

    .line 411
    .line 412
    iput-object v3, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->c:Ljava/lang/Object;

    .line 413
    .line 414
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v5

    .line 418
    iput-object v5, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->d:Ljava/lang/Object;

    .line 419
    .line 420
    iput v14, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->h:I

    .line 421
    .line 422
    const/4 v5, 0x3

    .line 423
    iput v5, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->m:I

    .line 424
    .line 425
    invoke-static {v6, v7, v11}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v5

    .line 429
    if-ne v5, v2, :cond_b

    .line 430
    .line 431
    goto/16 :goto_17

    .line 432
    .line 433
    :cond_b
    :goto_4
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 434
    .line 435
    :cond_c
    :goto_5
    move-object/from16 v18, v4

    .line 436
    .line 437
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 438
    .line 439
    .line 440
    move-result-object v4

    .line 441
    invoke-virtual {v4}, Lw5/e;->f()Ljava/util/List;

    .line 442
    .line 443
    .line 444
    move-result-object v4

    .line 445
    if-eqz v4, :cond_e

    .line 446
    .line 447
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 448
    .line 449
    .line 450
    move-result v5

    .line 451
    if-eqz v5, :cond_e

    .line 452
    .line 453
    :cond_d
    move v6, v14

    .line 454
    goto :goto_7

    .line 455
    :cond_e
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 456
    .line 457
    .line 458
    move-result-object v4

    .line 459
    :cond_f
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 460
    .line 461
    .line 462
    move-result v5

    .line 463
    if-eqz v5, :cond_d

    .line 464
    .line 465
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v5

    .line 469
    check-cast v5, Lcom/zykj/evaluation/ui/detail/c;

    .line 470
    .line 471
    invoke-virtual {v5}, Lcom/zykj/evaluation/ui/detail/c;->c()Ljava/util/List;

    .line 472
    .line 473
    .line 474
    move-result-object v5

    .line 475
    if-eqz v5, :cond_10

    .line 476
    .line 477
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 478
    .line 479
    .line 480
    move-result v6

    .line 481
    if-eqz v6, :cond_10

    .line 482
    .line 483
    goto :goto_6

    .line 484
    :cond_10
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 485
    .line 486
    .line 487
    move-result-object v5

    .line 488
    :cond_11
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 489
    .line 490
    .line 491
    move-result v6

    .line 492
    if-eqz v6, :cond_f

    .line 493
    .line 494
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v6

    .line 498
    check-cast v6, Ljava/lang/String;

    .line 499
    .line 500
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 501
    .line 502
    .line 503
    move-result v6

    .line 504
    if-lez v6, :cond_11

    .line 505
    .line 506
    move/from16 v6, v16

    .line 507
    .line 508
    :goto_7
    if-eqz v6, :cond_15

    .line 509
    .line 510
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 511
    .line 512
    .line 513
    move-result-object v4

    .line 514
    invoke-virtual {v4}, Lw5/e;->f()Ljava/util/List;

    .line 515
    .line 516
    .line 517
    move-result-object v4

    .line 518
    if-eqz v4, :cond_12

    .line 519
    .line 520
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 521
    .line 522
    .line 523
    move-result v5

    .line 524
    if-eqz v5, :cond_12

    .line 525
    .line 526
    goto :goto_8

    .line 527
    :cond_12
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 528
    .line 529
    .line 530
    move-result-object v4

    .line 531
    :cond_13
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 532
    .line 533
    .line 534
    move-result v5

    .line 535
    if-eqz v5, :cond_14

    .line 536
    .line 537
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v5

    .line 541
    check-cast v5, Lcom/zykj/evaluation/ui/detail/c;

    .line 542
    .line 543
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->A()Landroidx/collection/ArrayMap;

    .line 544
    .line 545
    .line 546
    move-result-object v7

    .line 547
    invoke-virtual {v5}, Lcom/zykj/evaluation/ui/detail/c;->l()Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v5

    .line 551
    invoke-virtual {v7, v5}, Landroidx/collection/ArrayMap;->containsKey(Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    move-result v5

    .line 555
    if-eqz v5, :cond_13

    .line 556
    .line 557
    goto :goto_9

    .line 558
    :cond_14
    :goto_8
    move/from16 v4, v16

    .line 559
    .line 560
    goto :goto_a

    .line 561
    :cond_15
    :goto_9
    move v4, v14

    .line 562
    :goto_a
    const/16 v5, 0xa

    .line 563
    .line 564
    if-eqz v4, :cond_1c

    .line 565
    .line 566
    if-eqz v18, :cond_1b

    .line 567
    .line 568
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    invoke-virtual {v1}, Lw5/e;->f()Ljava/util/List;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 577
    .line 578
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 579
    .line 580
    .line 581
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 582
    .line 583
    .line 584
    move-result-object v1

    .line 585
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 586
    .line 587
    .line 588
    move-result v9

    .line 589
    if-eqz v9, :cond_17

    .line 590
    .line 591
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v9

    .line 595
    move-object v10, v9

    .line 596
    check-cast v10, Lcom/zykj/evaluation/ui/detail/c;

    .line 597
    .line 598
    invoke-virtual {v10}, Lcom/zykj/evaluation/ui/detail/c;->h()J

    .line 599
    .line 600
    .line 601
    move-result-wide v12

    .line 602
    invoke-static {v12, v13}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 603
    .line 604
    .line 605
    move-result-object v10

    .line 606
    invoke-interface {v7, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v12

    .line 610
    if-nez v12, :cond_16

    .line 611
    .line 612
    new-instance v12, Ljava/util/ArrayList;

    .line 613
    .line 614
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 615
    .line 616
    .line 617
    invoke-interface {v7, v10, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    :cond_16
    check-cast v12, Ljava/util/List;

    .line 621
    .line 622
    invoke-interface {v12, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 623
    .line 624
    .line 625
    goto :goto_b

    .line 626
    :cond_17
    new-instance v1, Ljava/util/ArrayList;

    .line 627
    .line 628
    invoke-interface {v7}, Ljava/util/Map;->size()I

    .line 629
    .line 630
    .line 631
    move-result v9

    .line 632
    invoke-direct {v1, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 633
    .line 634
    .line 635
    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 636
    .line 637
    .line 638
    move-result-object v7

    .line 639
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 640
    .line 641
    .line 642
    move-result-object v7

    .line 643
    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 644
    .line 645
    .line 646
    move-result v9

    .line 647
    if-eqz v9, :cond_19

    .line 648
    .line 649
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v9

    .line 653
    check-cast v9, Ljava/util/Map$Entry;

    .line 654
    .line 655
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v10

    .line 659
    check-cast v10, Ljava/lang/Number;

    .line 660
    .line 661
    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    .line 662
    .line 663
    .line 664
    move-result-wide v20

    .line 665
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    move-result-object v9

    .line 669
    check-cast v9, Ljava/util/List;

    .line 670
    .line 671
    new-instance v10, Ljava/util/ArrayList;

    .line 672
    .line 673
    invoke-static {v9, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 674
    .line 675
    .line 676
    move-result v12

    .line 677
    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 678
    .line 679
    .line 680
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 681
    .line 682
    .line 683
    move-result-object v9

    .line 684
    :goto_d
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 685
    .line 686
    .line 687
    move-result v12

    .line 688
    if-eqz v12, :cond_18

    .line 689
    .line 690
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v12

    .line 694
    check-cast v12, Lcom/zykj/evaluation/ui/detail/c;

    .line 695
    .line 696
    new-instance v13, Lcom/zykj/evaluation/bean/CommitAnswer;

    .line 697
    .line 698
    invoke-virtual {v12}, Lcom/zykj/evaluation/ui/detail/c;->l()Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v15

    .line 702
    invoke-virtual {v12}, Lcom/zykj/evaluation/ui/detail/c;->c()Ljava/util/List;

    .line 703
    .line 704
    .line 705
    move-result-object v12

    .line 706
    invoke-direct {v13, v15, v12}, Lcom/zykj/evaluation/bean/CommitAnswer;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 707
    .line 708
    .line 709
    invoke-interface {v10, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 710
    .line 711
    .line 712
    goto :goto_d

    .line 713
    :cond_18
    new-instance v19, Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    .line 714
    .line 715
    const/16 v22, 0x0

    .line 716
    .line 717
    const/16 v24, 0x2

    .line 718
    .line 719
    const/16 v25, 0x0

    .line 720
    .line 721
    move-object/from16 v23, v10

    .line 722
    .line 723
    invoke-direct/range {v19 .. v25}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;-><init>(JLjava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 724
    .line 725
    .line 726
    move-object/from16 v9, v19

    .line 727
    .line 728
    invoke-interface {v1, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 729
    .line 730
    .line 731
    goto :goto_c

    .line 732
    :cond_19
    iget-object v5, v0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->y:Lcom/zykj/evaluation/di/AppDatabase;

    .line 733
    .line 734
    invoke-virtual {v5}, Lcom/zykj/evaluation/di/AppDatabase;->j()Ln5/w;

    .line 735
    .line 736
    .line 737
    move-result-object v5

    .line 738
    sget-object v7, Lm5/e$b;->b:Lm5/e$b;

    .line 739
    .line 740
    invoke-virtual {v7}, Lm5/e;->a()I

    .line 741
    .line 742
    .line 743
    move-result v31

    .line 744
    const/16 v32, 0xff

    .line 745
    .line 746
    const/16 v33, 0x0

    .line 747
    .line 748
    const-wide/16 v19, 0x0

    .line 749
    .line 750
    const-wide/16 v21, 0x0

    .line 751
    .line 752
    const/16 v23, 0x0

    .line 753
    .line 754
    const-wide/16 v24, 0x0

    .line 755
    .line 756
    const/16 v26, 0x0

    .line 757
    .line 758
    const/16 v27, 0x0

    .line 759
    .line 760
    const/16 v28, 0x0

    .line 761
    .line 762
    const/16 v29, 0x0

    .line 763
    .line 764
    move-object/from16 v30, v1

    .line 765
    .line 766
    invoke-static/range {v18 .. v33}, Ln5/v;->b(Ln5/v;JJIJLcom/zykj/evaluation/bean/UploadData;Ljava/util/List;ZZLjava/util/List;IILjava/lang/Object;)Ln5/v;

    .line 767
    .line 768
    .line 769
    move-result-object v1

    .line 770
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v7

    .line 774
    iput-object v7, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->a:Ljava/lang/Object;

    .line 775
    .line 776
    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v7

    .line 780
    iput-object v7, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->b:Ljava/lang/Object;

    .line 781
    .line 782
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v3

    .line 786
    iput-object v3, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->c:Ljava/lang/Object;

    .line 787
    .line 788
    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v3

    .line 792
    iput-object v3, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->d:Ljava/lang/Object;

    .line 793
    .line 794
    invoke-static/range {v30 .. v30}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v3

    .line 798
    iput-object v3, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->e:Ljava/lang/Object;

    .line 799
    .line 800
    iput v6, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->h:I

    .line 801
    .line 802
    iput v4, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->i:I

    .line 803
    .line 804
    iput v14, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->j:I

    .line 805
    .line 806
    const/4 v3, 0x4

    .line 807
    iput v3, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->m:I

    .line 808
    .line 809
    invoke-interface {v5, v1, v11}, Ln5/w;->b(Ln5/v;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object v1

    .line 813
    if-ne v1, v2, :cond_1a

    .line 814
    .line 815
    goto/16 :goto_17

    .line 816
    .line 817
    :cond_1a
    :goto_e
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 818
    .line 819
    :cond_1b
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 820
    .line 821
    return-object v1

    .line 822
    :cond_1c
    new-instance v7, Landroidx/collection/ArrayMap;

    .line 823
    .line 824
    invoke-direct {v7}, Landroidx/collection/ArrayMap;-><init>()V

    .line 825
    .line 826
    .line 827
    new-instance v9, Ljava/util/ArrayList;

    .line 828
    .line 829
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 833
    .line 834
    .line 835
    move-result-object v10

    .line 836
    invoke-virtual {v10}, Lw5/e;->f()Ljava/util/List;

    .line 837
    .line 838
    .line 839
    move-result-object v10

    .line 840
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 841
    .line 842
    .line 843
    move-result-object v10

    .line 844
    :goto_f
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 845
    .line 846
    .line 847
    move-result v13

    .line 848
    if-eqz v13, :cond_22

    .line 849
    .line 850
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v13

    .line 854
    check-cast v13, Lcom/zykj/evaluation/ui/detail/c;

    .line 855
    .line 856
    invoke-virtual {v13}, Lcom/zykj/evaluation/ui/detail/c;->h()J

    .line 857
    .line 858
    .line 859
    move-result-wide v15

    .line 860
    invoke-static/range {v15 .. v16}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 861
    .line 862
    .line 863
    move-result-object v15

    .line 864
    invoke-virtual {v7, v15}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 865
    .line 866
    .line 867
    move-result-object v15

    .line 868
    if-nez v15, :cond_1d

    .line 869
    .line 870
    invoke-virtual {v13}, Lcom/zykj/evaluation/ui/detail/c;->h()J

    .line 871
    .line 872
    .line 873
    move-result-wide v15

    .line 874
    invoke-static/range {v15 .. v16}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 875
    .line 876
    .line 877
    move-result-object v15

    .line 878
    new-instance v1, Ljava/util/ArrayList;

    .line 879
    .line 880
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 881
    .line 882
    .line 883
    invoke-interface {v7, v15, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 884
    .line 885
    .line 886
    :cond_1d
    invoke-virtual {v13}, Lcom/zykj/evaluation/ui/detail/c;->h()J

    .line 887
    .line 888
    .line 889
    move-result-wide v19

    .line 890
    invoke-static/range {v19 .. v20}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 891
    .line 892
    .line 893
    move-result-object v1

    .line 894
    invoke-virtual {v7, v1}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 895
    .line 896
    .line 897
    move-result-object v1

    .line 898
    check-cast v1, Ljava/util/ArrayList;

    .line 899
    .line 900
    if-eqz v1, :cond_1e

    .line 901
    .line 902
    new-instance v15, Lcom/zykj/evaluation/bean/CommitAnswer;

    .line 903
    .line 904
    invoke-virtual {v13}, Lcom/zykj/evaluation/ui/detail/c;->l()Ljava/lang/String;

    .line 905
    .line 906
    .line 907
    move-result-object v14

    .line 908
    invoke-virtual {v13}, Lcom/zykj/evaluation/ui/detail/c;->c()Ljava/util/List;

    .line 909
    .line 910
    .line 911
    move-result-object v5

    .line 912
    invoke-direct {v15, v14, v5}, Lcom/zykj/evaluation/bean/CommitAnswer;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 913
    .line 914
    .line 915
    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 916
    .line 917
    .line 918
    move-result v1

    .line 919
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 920
    .line 921
    .line 922
    :cond_1e
    invoke-virtual {v13}, Lcom/zykj/evaluation/ui/detail/c;->k()Li6/p0;

    .line 923
    .line 924
    .line 925
    move-result-object v1

    .line 926
    instance-of v1, v1, Li6/p0$c;

    .line 927
    .line 928
    if-nez v1, :cond_1f

    .line 929
    .line 930
    invoke-virtual {v13}, Lcom/zykj/evaluation/ui/detail/c;->k()Li6/p0;

    .line 931
    .line 932
    .line 933
    move-result-object v1

    .line 934
    instance-of v1, v1, Li6/p0$a;

    .line 935
    .line 936
    if-eqz v1, :cond_21

    .line 937
    .line 938
    :cond_1f
    new-instance v19, Lcom/zykj/evaluation/bean/UploadData;

    .line 939
    .line 940
    invoke-virtual {v13}, Lcom/zykj/evaluation/ui/detail/c;->l()Ljava/lang/String;

    .line 941
    .line 942
    .line 943
    move-result-object v20

    .line 944
    invoke-virtual {v13}, Lcom/zykj/evaluation/ui/detail/c;->c()Ljava/util/List;

    .line 945
    .line 946
    .line 947
    move-result-object v1

    .line 948
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v1

    .line 952
    check-cast v1, Ljava/lang/String;

    .line 953
    .line 954
    if-nez v1, :cond_20

    .line 955
    .line 956
    const-string v1, ""

    .line 957
    .line 958
    :cond_20
    move-object/from16 v21, v1

    .line 959
    .line 960
    const/16 v24, 0xc

    .line 961
    .line 962
    const/16 v25, 0x0

    .line 963
    .line 964
    const/16 v22, 0x0

    .line 965
    .line 966
    const/16 v23, 0x0

    .line 967
    .line 968
    invoke-direct/range {v19 .. v25}, Lcom/zykj/evaluation/bean/UploadData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 969
    .line 970
    .line 971
    move-object/from16 v1, v19

    .line 972
    .line 973
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 974
    .line 975
    .line 976
    :cond_21
    const/4 v1, 0x0

    .line 977
    const/16 v5, 0xa

    .line 978
    .line 979
    const/4 v14, 0x0

    .line 980
    goto/16 :goto_f

    .line 981
    .line 982
    :cond_22
    new-instance v1, Ljava/util/ArrayList;

    .line 983
    .line 984
    const/16 v5, 0xa

    .line 985
    .line 986
    invoke-static {v9, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 987
    .line 988
    .line 989
    move-result v5

    .line 990
    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 991
    .line 992
    .line 993
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 994
    .line 995
    .line 996
    move-result v5

    .line 997
    const/4 v10, 0x0

    .line 998
    :goto_10
    if-ge v10, v5, :cond_28

    .line 999
    .line 1000
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v13

    .line 1004
    add-int/lit8 v10, v10, 0x1

    .line 1005
    .line 1006
    check-cast v13, Lcom/zykj/evaluation/bean/UploadData;

    .line 1007
    .line 1008
    if-eqz v18, :cond_26

    .line 1009
    .line 1010
    invoke-virtual/range {v18 .. v18}, Ln5/v;->c()Ljava/util/List;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v14

    .line 1014
    if-eqz v14, :cond_26

    .line 1015
    .line 1016
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v14

    .line 1020
    :goto_11
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 1021
    .line 1022
    .line 1023
    move-result v15

    .line 1024
    if-eqz v15, :cond_24

    .line 1025
    .line 1026
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v15

    .line 1030
    move-object/from16 v17, v15

    .line 1031
    .line 1032
    check-cast v17, Lcom/zykj/evaluation/bean/UploadData;

    .line 1033
    .line 1034
    move/from16 p1, v5

    .line 1035
    .line 1036
    invoke-virtual/range {v17 .. v17}, Lcom/zykj/evaluation/bean/UploadData;->getUuid()Ljava/lang/String;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v5

    .line 1040
    move-object/from16 v17, v8

    .line 1041
    .line 1042
    invoke-virtual {v13}, Lcom/zykj/evaluation/bean/UploadData;->getUuid()Ljava/lang/String;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v8

    .line 1046
    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1047
    .line 1048
    .line 1049
    move-result v5

    .line 1050
    if-eqz v5, :cond_23

    .line 1051
    .line 1052
    move-object v5, v15

    .line 1053
    goto :goto_12

    .line 1054
    :cond_23
    move/from16 v5, p1

    .line 1055
    .line 1056
    move-object/from16 v8, v17

    .line 1057
    .line 1058
    goto :goto_11

    .line 1059
    :cond_24
    move/from16 p1, v5

    .line 1060
    .line 1061
    move-object/from16 v17, v8

    .line 1062
    .line 1063
    const/4 v5, 0x0

    .line 1064
    :goto_12
    check-cast v5, Lcom/zykj/evaluation/bean/UploadData;

    .line 1065
    .line 1066
    if-eqz v5, :cond_27

    .line 1067
    .line 1068
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/UploadData;->getLocalPath()Ljava/lang/String;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v8

    .line 1072
    invoke-virtual {v13}, Lcom/zykj/evaluation/bean/UploadData;->getLocalPath()Ljava/lang/String;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v14

    .line 1076
    invoke-static {v8, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1077
    .line 1078
    .line 1079
    move-result v8

    .line 1080
    if-eqz v8, :cond_25

    .line 1081
    .line 1082
    move-object v13, v5

    .line 1083
    goto :goto_13

    .line 1084
    :cond_25
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 1085
    .line 1086
    goto :goto_13

    .line 1087
    :cond_26
    move/from16 p1, v5

    .line 1088
    .line 1089
    move-object/from16 v17, v8

    .line 1090
    .line 1091
    :cond_27
    :goto_13
    invoke-interface {v1, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1092
    .line 1093
    .line 1094
    move/from16 v5, p1

    .line 1095
    .line 1096
    move-object/from16 v8, v17

    .line 1097
    .line 1098
    goto :goto_10

    .line 1099
    :cond_28
    move-object/from16 v17, v8

    .line 1100
    .line 1101
    new-instance v15, Ljava/util/ArrayList;

    .line 1102
    .line 1103
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual {v7}, Landroidx/collection/ArrayMap;->keySet()Ljava/util/Set;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v5

    .line 1110
    check-cast v5, Ljava/lang/Iterable;

    .line 1111
    .line 1112
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v5

    .line 1116
    :goto_14
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1117
    .line 1118
    .line 1119
    move-result v8

    .line 1120
    if-eqz v8, :cond_2a

    .line 1121
    .line 1122
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v8

    .line 1126
    check-cast v8, Ljava/lang/Long;

    .line 1127
    .line 1128
    new-instance v19, Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    .line 1129
    .line 1130
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1131
    .line 1132
    .line 1133
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 1134
    .line 1135
    .line 1136
    move-result-wide v20

    .line 1137
    invoke-virtual {v7, v8}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v8

    .line 1141
    check-cast v8, Ljava/util/ArrayList;

    .line 1142
    .line 1143
    if-eqz v8, :cond_29

    .line 1144
    .line 1145
    :goto_15
    move-object/from16 v23, v8

    .line 1146
    .line 1147
    goto :goto_16

    .line 1148
    :cond_29
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v8

    .line 1152
    goto :goto_15

    .line 1153
    :goto_16
    const/16 v24, 0x2

    .line 1154
    .line 1155
    const/16 v25, 0x0

    .line 1156
    .line 1157
    const/16 v22, 0x0

    .line 1158
    .line 1159
    invoke-direct/range {v19 .. v25}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;-><init>(JLjava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1160
    .line 1161
    .line 1162
    move-object/from16 v8, v19

    .line 1163
    .line 1164
    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1165
    .line 1166
    .line 1167
    goto :goto_14

    .line 1168
    :cond_2a
    iget-object v5, v0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->z:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 1169
    .line 1170
    iget-object v8, v0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 1171
    .line 1172
    invoke-interface {v8}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v8

    .line 1176
    check-cast v8, Lcom/zykj/message/server/bean/UserInfo;

    .line 1177
    .line 1178
    invoke-virtual {v8}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v8

    .line 1182
    invoke-static {v8, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1183
    .line 1184
    .line 1185
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 1186
    .line 1187
    .line 1188
    move-result-wide v12

    .line 1189
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->N()J

    .line 1190
    .line 1191
    .line 1192
    move-result-wide v19

    .line 1193
    sget-object v8, Lcom/zykj/evaluation/bean/TaskState$ToDo;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$ToDo;

    .line 1194
    .line 1195
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 1196
    .line 1197
    .line 1198
    move-result v8

    .line 1199
    move-object v14, v9

    .line 1200
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->Q()J

    .line 1201
    .line 1202
    .line 1203
    move-result-wide v9

    .line 1204
    iget-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 1205
    .line 1206
    check-cast v0, Lcom/zykj/evaluation/bean/UploadData;

    .line 1207
    .line 1208
    move-object/from16 v16, v14

    .line 1209
    .line 1210
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->a0()Z

    .line 1211
    .line 1212
    .line 1213
    move-result v14

    .line 1214
    move-object/from16 p1, v0

    .line 1215
    .line 1216
    invoke-static/range {v17 .. v17}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v0

    .line 1220
    iput-object v0, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->a:Ljava/lang/Object;

    .line 1221
    .line 1222
    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v0

    .line 1226
    iput-object v0, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->b:Ljava/lang/Object;

    .line 1227
    .line 1228
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v0

    .line 1232
    iput-object v0, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->c:Ljava/lang/Object;

    .line 1233
    .line 1234
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v0

    .line 1238
    iput-object v0, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->d:Ljava/lang/Object;

    .line 1239
    .line 1240
    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v0

    .line 1244
    iput-object v0, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->e:Ljava/lang/Object;

    .line 1245
    .line 1246
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v0

    .line 1250
    iput-object v0, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->f:Ljava/lang/Object;

    .line 1251
    .line 1252
    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v0

    .line 1256
    iput-object v0, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->g:Ljava/lang/Object;

    .line 1257
    .line 1258
    iput v6, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->h:I

    .line 1259
    .line 1260
    iput v4, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->i:I

    .line 1261
    .line 1262
    const/4 v0, 0x5

    .line 1263
    iput v0, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAnswer$1;->m:I

    .line 1264
    .line 1265
    move-object v3, v5

    .line 1266
    move-wide v4, v12

    .line 1267
    const/4 v13, 0x1

    .line 1268
    move-object v12, v1

    .line 1269
    move-object/from16 v16, v11

    .line 1270
    .line 1271
    move-wide/from16 v6, v19

    .line 1272
    .line 1273
    move-object/from16 v11, p1

    .line 1274
    .line 1275
    invoke-virtual/range {v3 .. v16}, Lcom/zykj/evaluation/upload/OssTaskManger;->r(JJIJLcom/zykj/evaluation/bean/UploadData;Ljava/util/List;ZZLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v0

    .line 1279
    if-ne v0, v2, :cond_2b

    .line 1280
    .line 1281
    :goto_17
    return-object v2

    .line 1282
    :cond_2b
    :goto_18
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 1283
    .line 1284
    return-object v0
.end method

.method private final M0(Lf6/j;)Z
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
    iget-boolean p1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->B:Z

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

.method public static final synthetic z0(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
.method public final K0(IJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V
    .locals 19

    .line 1
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getOptions()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/16 v2, 0xa

    .line 10
    .line 11
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    move-object v4, v2

    .line 33
    check-cast v4, Ljava/lang/String;

    .line 34
    .line 35
    new-instance v3, Lw5/b;

    .line 36
    .line 37
    move-object/from16 v12, p6

    .line 38
    .line 39
    invoke-interface {v12, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    sget-object v2, Lw5/a$a;->c:Lw5/a$a;

    .line 46
    .line 47
    :goto_1
    move-object v5, v2

    .line 48
    goto :goto_2

    .line 49
    :cond_0
    sget-object v2, Lw5/a$b;->c:Lw5/a$b;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :goto_2
    const/4 v7, 0x4

    .line 53
    const/4 v8, 0x0

    .line 54
    const/4 v6, 0x0

    .line 55
    invoke-direct/range {v3 .. v8}, Lw5/b;-><init>(Ljava/lang/String;Lw5/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move-object/from16 v12, p6

    .line 63
    .line 64
    :goto_3
    move-object v11, v1

    .line 65
    goto :goto_4

    .line 66
    :cond_2
    move-object/from16 v12, p6

    .line 67
    .line 68
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    goto :goto_3

    .line 73
    :goto_4
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getQstType()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    move/from16 v1, p1

    .line 78
    .line 79
    invoke-static {v0, v1}, Lw5/h;->a(II)Li6/p0;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getDisplayNumber()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    if-nez v0, :cond_3

    .line 88
    .line 89
    const-string v0, ""

    .line 90
    .line 91
    :cond_3
    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_4

    .line 96
    .line 97
    move-object/from16 v10, p5

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_4
    move-object v10, v0

    .line 101
    :goto_5
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getQuestionId()J

    .line 102
    .line 103
    .line 104
    move-result-wide v0

    .line 105
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 110
    .line 111
    .line 112
    move-result-wide v1

    .line 113
    const-wide/16 v3, 0x0

    .line 114
    .line 115
    cmp-long v1, v1, v3

    .line 116
    .line 117
    if-eqz v1, :cond_5

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_5
    const/4 v0, 0x0

    .line 121
    :goto_6
    if-eqz v0, :cond_6

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 124
    .line 125
    .line 126
    move-result-wide v0

    .line 127
    goto :goto_7

    .line 128
    :cond_6
    move-wide/from16 v0, p2

    .line 129
    .line 130
    :goto_7
    instance-of v2, v9, Li6/p0$c$a;

    .line 131
    .line 132
    if-nez v2, :cond_8

    .line 133
    .line 134
    instance-of v2, v9, Li6/p0$a;

    .line 135
    .line 136
    if-eqz v2, :cond_7

    .line 137
    .line 138
    goto :goto_9

    .line 139
    :cond_7
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->K()Lg7/e;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-virtual {v2, v0, v1, v3}, Lg7/e;->k(JLjava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    :goto_8
    move-object v13, v0

    .line 152
    goto :goto_a

    .line 153
    :cond_8
    :goto_9
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->K()Lg7/e;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {v2, v0, v1, v3}, Lg7/e;->l(JLjava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    goto :goto_8

    .line 166
    :goto_a
    new-instance v5, Lcom/zykj/evaluation/ui/detail/c;

    .line 167
    .line 168
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getQuestionId()J

    .line 169
    .line 170
    .line 171
    move-result-wide v6

    .line 172
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    const/16 v17, 0x380

    .line 177
    .line 178
    const/16 v18, 0x0

    .line 179
    .line 180
    const/4 v14, 0x0

    .line 181
    const/4 v15, 0x0

    .line 182
    const/16 v16, 0x0

    .line 183
    .line 184
    invoke-direct/range {v5 .. v18}, Lcom/zykj/evaluation/ui/detail/c;-><init>(JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 185
    .line 186
    .line 187
    move-object/from16 v0, p7

    .line 188
    .line 189
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    return-void
.end method

.method public final L0(IJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/util/Map;Ljava/util/ArrayList;)V
    .locals 15

    .line 1
    if-eqz p4, :cond_1

    .line 2
    .line 3
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    :goto_0
    move-object v4, v0

    .line 11
    goto :goto_2

    .line 12
    :cond_1
    :goto_1
    const-string v0, ""

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :goto_2
    if-eqz p4, :cond_2

    .line 16
    .line 17
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getQuestionId()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    move-wide v2, v0

    .line 22
    goto :goto_3

    .line 23
    :cond_2
    move-wide/from16 v2, p2

    .line 24
    .line 25
    :goto_3
    sget-object v0, Li6/p0$c$a;->b:Li6/p0$c$a;

    .line 26
    .line 27
    invoke-virtual {v0}, Li6/p0;->a()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    move/from16 v1, p1

    .line 32
    .line 33
    invoke-static {v0, v1}, Lw5/h;->a(II)Li6/p0;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-eqz p4, :cond_4

    .line 38
    .line 39
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    move-object/from16 v1, p5

    .line 46
    .line 47
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ljava/util/List;

    .line 52
    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    goto :goto_5

    .line 56
    :cond_3
    :goto_4
    move-object v8, v0

    .line 57
    goto :goto_6

    .line 58
    :cond_4
    :goto_5
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    goto :goto_4

    .line 63
    :goto_6
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->K()Lg7/e;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    move-wide/from16 v6, p2

    .line 68
    .line 69
    invoke-virtual {v0, v6, v7, v4}, Lg7/e;->l(JLjava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    new-instance v1, Lcom/zykj/evaluation/ui/detail/c;

    .line 74
    .line 75
    const/4 v6, 0x0

    .line 76
    const/4 v7, 0x0

    .line 77
    const/4 v10, 0x0

    .line 78
    const/4 v11, 0x0

    .line 79
    const/4 v12, 0x0

    .line 80
    const/16 v13, 0x398

    .line 81
    .line 82
    const/4 v14, 0x0

    .line 83
    invoke-direct/range {v1 .. v14}, Lcom/zykj/evaluation/ui/detail/c;-><init>(JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 84
    .line 85
    .line 86
    move-object/from16 v0, p6

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final N0(Ljava/lang/String;Ljava/util/List;)V
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
    iput-boolean v1, v0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->B:Z

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
    new-instance v3, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$updateLocalAnswer$1;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v3, v1}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$updateLocalAnswer$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 31
    .line 32
    .line 33
    new-instance v4, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$updateLocalAnswer$2;

    .line 34
    .line 35
    invoke-direct {v4, v1}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$updateLocalAnswer$2;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 36
    .line 37
    .line 38
    new-instance v6, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$updateLocalAnswer$3;

    .line 39
    .line 40
    invoke-direct {v6, v0, v9, v10, v1}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$updateLocalAnswer$3;-><init>(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

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
    sget-object v3, Lcom/zykj/evaluation/bean/TaskState$ToDo;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$ToDo;

    .line 16
    .line 17
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

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
    new-instance v6, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1;

    .line 93
    .line 94
    const/4 v1, 0x0

    .line 95
    invoke-direct {v6, v0, v1}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1;-><init>(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lkotlin/coroutines/Continuation;)V

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
    invoke-direct {p0, p1}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->M0(Lf6/j;)Z

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
    new-instance v7, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndBack$1;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-direct {v7, p0, p1, p2, v0}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndBack$1;-><init>(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lf6/j;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

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
    new-instance v7, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndChangeQuestionToNext$1;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {v7, p0, p1, p2, v0}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndChangeQuestionToNext$1;-><init>(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lf6/j;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

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
    new-instance v7, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndChangeQuestionToPre$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v7, p0, p1, v0}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndChangeQuestionToPre$1;-><init>(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lf6/j;Lkotlin/coroutines/Continuation;)V

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
    new-instance v7, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {v7, p0, p1, p2, v0}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;-><init>(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lf6/j;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

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
    .locals 26

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
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->w()Lcom/zykj/evaluation/ui/detail/b;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->x:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 15
    .line 16
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcom/zykj/http/bean/HeaderBean;

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/zykj/http/bean/HeaderBean;->getServerUrl()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v3, ""

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    move-object v1, v3

    .line 31
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getPath()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v3, v4

    .line 39
    :goto_0
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->C()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    new-instance v5, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, "?showAnalysis="

    .line 55
    .line 56
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->K()Lg7/e;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getId()J

    .line 71
    .line 72
    .line 73
    move-result-wide v3

    .line 74
    invoke-virtual {v1, v3, v4}, Lg7/e;->j(J)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v12

    .line 78
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAskForHelp()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_2

    .line 83
    .line 84
    sget-object v1, Lcom/zykj/evaluation/ui/detail/a$b;->c:Lcom/zykj/evaluation/ui/detail/a$b;

    .line 85
    .line 86
    :goto_1
    move-object v14, v1

    .line 87
    goto :goto_2

    .line 88
    :cond_2
    sget-object v1, Lcom/zykj/evaluation/ui/detail/a$a;->c:Lcom/zykj/evaluation/ui/detail/a$a;

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->isInMistakeBook()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_3

    .line 96
    .line 97
    sget-object v1, Lcom/zykj/evaluation/ui/detail/d$b;->c:Lcom/zykj/evaluation/ui/detail/d$b;

    .line 98
    .line 99
    :goto_3
    move-object v15, v1

    .line 100
    goto :goto_4

    .line 101
    :cond_3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/d$a;->c:Lcom/zykj/evaluation/ui/detail/d$a;

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getStem()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v23

    .line 108
    const v24, 0x7e53f

    .line 109
    .line 110
    .line 111
    const/16 v25, 0x0

    .line 112
    .line 113
    const/4 v3, 0x0

    .line 114
    const/4 v4, 0x0

    .line 115
    const/4 v5, 0x0

    .line 116
    const/4 v6, 0x0

    .line 117
    const/4 v7, 0x0

    .line 118
    const/4 v8, 0x0

    .line 119
    const/4 v10, 0x0

    .line 120
    const/4 v11, 0x0

    .line 121
    const/4 v13, 0x0

    .line 122
    const/16 v16, 0x0

    .line 123
    .line 124
    const/16 v17, 0x0

    .line 125
    .line 126
    const/16 v18, 0x0

    .line 127
    .line 128
    const/16 v19, 0x0

    .line 129
    .line 130
    const/16 v20, 0x0

    .line 131
    .line 132
    const-wide/16 v21, 0x0

    .line 133
    .line 134
    invoke-static/range {v2 .. v25}, Lcom/zykj/evaluation/ui/detail/b;->b(Lcom/zykj/evaluation/ui/detail/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;ZZLjava/lang/String;ZLcom/zykj/evaluation/ui/detail/a;Lcom/zykj/evaluation/ui/detail/d;Lw5/i;ZZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/b;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->h0(Lcom/zykj/evaluation/ui/detail/b;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    const/16 v15, 0xffb

    .line 146
    .line 147
    const/4 v4, 0x0

    .line 148
    const/4 v5, 0x1

    .line 149
    const/4 v7, 0x0

    .line 150
    const/4 v9, 0x0

    .line 151
    const/4 v10, 0x0

    .line 152
    const/4 v11, 0x0

    .line 153
    const/4 v12, 0x0

    .line 154
    const/4 v13, 0x0

    .line 155
    const/4 v14, 0x0

    .line 156
    invoke-static/range {v2 .. v16}, Lw5/e;->b(Lw5/e;Ljava/util/List;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lw5/e;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i0(Lw5/e;)V

    .line 161
    .line 162
    .line 163
    return-void
.end method

.method public w0(Lcom/zykj/evaluation/bean/TaskDetailInfo;Ljava/util/Map;)V
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const-string v2, "taskDetailInfo"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "localAnswerMap"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v9, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerWithQuestion()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v11, 0x0

    .line 25
    if-eqz v2, :cond_f

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlows()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 50
    .line 51
    if-nez v3, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move-object v2, v3

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    move-object v2, v11

    .line 57
    :cond_2
    :goto_0
    if-eqz v2, :cond_9

    .line 58
    .line 59
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    if-eqz v3, :cond_9

    .line 64
    .line 65
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    check-cast v4, Ljava/util/List;

    .line 70
    .line 71
    if-eqz v4, :cond_4

    .line 72
    .line 73
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-nez v5, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    move-object v4, v11

    .line 81
    :goto_1
    if-eqz v4, :cond_4

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_4
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerList()Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    if-eqz v5, :cond_6

    .line 97
    .line 98
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    move-object v6, v5

    .line 103
    check-cast v6, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 104
    .line 105
    invoke-virtual {v6}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getUuid()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-eqz v6, :cond_5

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_6
    move-object v5, v11

    .line 117
    :goto_2
    check-cast v5, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 118
    .line 119
    if-eqz v5, :cond_7

    .line 120
    .line 121
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamAnswers()Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    move-object v4, v3

    .line 126
    goto :goto_3

    .line 127
    :cond_7
    move-object v4, v11

    .line 128
    :goto_3
    if-nez v4, :cond_8

    .line 129
    .line 130
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    :cond_8
    :goto_4
    if-nez v4, :cond_a

    .line 135
    .line 136
    :cond_9
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    :cond_a
    if-eqz v2, :cond_b

    .line 141
    .line 142
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-nez v3, :cond_b

    .line 147
    .line 148
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-static {v1, v2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    :cond_b
    move-object v8, v1

    .line 161
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->M()I

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getId()J

    .line 166
    .line 167
    .line 168
    move-result-wide v5

    .line 169
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlows()Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    check-cast v1, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 178
    .line 179
    if-eqz v1, :cond_e

    .line 180
    .line 181
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    if-eqz v2, :cond_d

    .line 186
    .line 187
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    check-cast v2, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 192
    .line 193
    if-nez v2, :cond_c

    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_c
    move-object v11, v2

    .line 197
    goto :goto_6

    .line 198
    :cond_d
    :goto_5
    move-object v11, v1

    .line 199
    :cond_e
    :goto_6
    move-object/from16 v3, p0

    .line 200
    .line 201
    move-object v7, v11

    .line 202
    invoke-virtual/range {v3 .. v9}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->L0(IJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/util/Map;Ljava/util/ArrayList;)V

    .line 203
    .line 204
    .line 205
    goto/16 :goto_14

    .line 206
    .line 207
    :cond_f
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlows()Ljava/util/List;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    const/4 v12, 0x0

    .line 216
    const/4 v13, 0x1

    .line 217
    if-le v2, v13, :cond_10

    .line 218
    .line 219
    move v2, v13

    .line 220
    goto :goto_7

    .line 221
    :cond_10
    move v2, v12

    .line 222
    :goto_7
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlows()Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v14

    .line 230
    :cond_11
    :goto_8
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    if-eqz v3, :cond_20

    .line 235
    .line 236
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    move-object v7, v3

    .line 241
    check-cast v7, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 242
    .line 243
    const-string v15, "."

    .line 244
    .line 245
    const-string v16, ""

    .line 246
    .line 247
    if-eqz v2, :cond_13

    .line 248
    .line 249
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    if-nez v3, :cond_12

    .line 254
    .line 255
    move-object/from16 v3, v16

    .line 256
    .line 257
    goto :goto_9

    .line 258
    :cond_12
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    new-instance v4, Ljava/lang/StringBuilder;

    .line 263
    .line 264
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    :goto_9
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getNumber()I

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    new-instance v5, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    goto :goto_a

    .line 297
    :cond_13
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    if-nez v3, :cond_14

    .line 302
    .line 303
    move-object/from16 v3, v16

    .line 304
    .line 305
    goto :goto_a

    .line 306
    :cond_14
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    :goto_a
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getType()I

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    if-nez v4, :cond_19

    .line 319
    .line 320
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 321
    .line 322
    .line 323
    move-result-object v4

    .line 324
    if-eqz v4, :cond_19

    .line 325
    .line 326
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 327
    .line 328
    .line 329
    move-result v4

    .line 330
    if-eqz v4, :cond_15

    .line 331
    .line 332
    goto/16 :goto_e

    .line 333
    .line 334
    :cond_15
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 339
    .line 340
    .line 341
    move-result v4

    .line 342
    if-le v4, v13, :cond_16

    .line 343
    .line 344
    move/from16 v17, v13

    .line 345
    .line 346
    goto :goto_b

    .line 347
    :cond_16
    move/from16 v17, v12

    .line 348
    .line 349
    :goto_b
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 354
    .line 355
    .line 356
    move-result-object v18

    .line 357
    :goto_c
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 358
    .line 359
    .line 360
    move-result v4

    .line 361
    if-eqz v4, :cond_11

    .line 362
    .line 363
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    move-object v7, v4

    .line 368
    check-cast v7, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 369
    .line 370
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->M()I

    .line 371
    .line 372
    .line 373
    move-result v4

    .line 374
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getId()J

    .line 375
    .line 376
    .line 377
    move-result-wide v5

    .line 378
    if-eqz v17, :cond_17

    .line 379
    .line 380
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getNumber()I

    .line 381
    .line 382
    .line 383
    move-result v8

    .line 384
    new-instance v10, Ljava/lang/StringBuilder;

    .line 385
    .line 386
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v8

    .line 399
    goto :goto_d

    .line 400
    :cond_17
    move-object/from16 v8, v16

    .line 401
    .line 402
    :goto_d
    new-instance v10, Ljava/lang/StringBuilder;

    .line 403
    .line 404
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v8

    .line 417
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v10

    .line 421
    invoke-interface {v1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v10

    .line 425
    check-cast v10, Ljava/util/List;

    .line 426
    .line 427
    if-nez v10, :cond_18

    .line 428
    .line 429
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 430
    .line 431
    .line 432
    move-result-object v10

    .line 433
    :cond_18
    move-object/from16 v19, v10

    .line 434
    .line 435
    move-object v10, v9

    .line 436
    move-object/from16 v9, v19

    .line 437
    .line 438
    move-object/from16 v19, v3

    .line 439
    .line 440
    move-object/from16 v3, p0

    .line 441
    .line 442
    invoke-virtual/range {v3 .. v10}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->K0(IJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    .line 443
    .line 444
    .line 445
    move-object v9, v10

    .line 446
    move-object/from16 v3, v19

    .line 447
    .line 448
    goto :goto_c

    .line 449
    :cond_19
    :goto_e
    move-object/from16 v19, v3

    .line 450
    .line 451
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->M()I

    .line 452
    .line 453
    .line 454
    move-result v4

    .line 455
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getId()J

    .line 456
    .line 457
    .line 458
    move-result-wide v5

    .line 459
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v3

    .line 463
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    check-cast v3, Ljava/util/List;

    .line 468
    .line 469
    if-eqz v3, :cond_1c

    .line 470
    .line 471
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 472
    .line 473
    .line 474
    move-result v8

    .line 475
    if-nez v8, :cond_1a

    .line 476
    .line 477
    goto :goto_f

    .line 478
    :cond_1a
    move-object v3, v11

    .line 479
    :goto_f
    if-eqz v3, :cond_1c

    .line 480
    .line 481
    :cond_1b
    :goto_10
    move-object v10, v9

    .line 482
    move-object/from16 v8, v19

    .line 483
    .line 484
    move-object v9, v3

    .line 485
    move-object/from16 v3, p0

    .line 486
    .line 487
    goto :goto_13

    .line 488
    :cond_1c
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerList()Ljava/util/List;

    .line 489
    .line 490
    .line 491
    move-result-object v3

    .line 492
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 493
    .line 494
    .line 495
    move-result-object v3

    .line 496
    :cond_1d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 497
    .line 498
    .line 499
    move-result v8

    .line 500
    if-eqz v8, :cond_1e

    .line 501
    .line 502
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v8

    .line 506
    move-object v10, v8

    .line 507
    check-cast v10, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 508
    .line 509
    invoke-virtual {v10}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getUuid()Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v10

    .line 513
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v15

    .line 517
    invoke-static {v10, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    move-result v10

    .line 521
    if-eqz v10, :cond_1d

    .line 522
    .line 523
    goto :goto_11

    .line 524
    :cond_1e
    move-object v8, v11

    .line 525
    :goto_11
    check-cast v8, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 526
    .line 527
    if-eqz v8, :cond_1f

    .line 528
    .line 529
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamAnswers()Ljava/util/List;

    .line 530
    .line 531
    .line 532
    move-result-object v3

    .line 533
    goto :goto_12

    .line 534
    :cond_1f
    move-object v3, v11

    .line 535
    :goto_12
    if-nez v3, :cond_1b

    .line 536
    .line 537
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 538
    .line 539
    .line 540
    move-result-object v3

    .line 541
    goto :goto_10

    .line 542
    :goto_13
    invoke-virtual/range {v3 .. v10}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->K0(IJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    .line 543
    .line 544
    .line 545
    move-object v9, v10

    .line 546
    goto/16 :goto_8

    .line 547
    .line 548
    :cond_20
    :goto_14
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 549
    .line 550
    .line 551
    move-result-object v3

    .line 552
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerWithQuestion()Z

    .line 553
    .line 554
    .line 555
    move-result v5

    .line 556
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->D()Z

    .line 557
    .line 558
    .line 559
    move-result v1

    .line 560
    invoke-static {v0, v1}, Lw5/h;->h(Lcom/zykj/evaluation/bean/TaskDetailInfo;Z)Ljava/util/List;

    .line 561
    .line 562
    .line 563
    move-result-object v12

    .line 564
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->D()Z

    .line 565
    .line 566
    .line 567
    move-result v1

    .line 568
    invoke-static {v0, v1}, Lw5/h;->k(Lcom/zykj/evaluation/bean/TaskDetailInfo;Z)Ljava/util/List;

    .line 569
    .line 570
    .line 571
    move-result-object v13

    .line 572
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->D()Z

    .line 573
    .line 574
    .line 575
    move-result v1

    .line 576
    invoke-static {v0, v1}, Lw5/h;->j(Lcom/zykj/evaluation/bean/TaskDetailInfo;Z)Ljava/util/List;

    .line 577
    .line 578
    .line 579
    move-result-object v14

    .line 580
    const/16 v16, 0x8dd

    .line 581
    .line 582
    const/16 v17, 0x0

    .line 583
    .line 584
    const/4 v4, 0x0

    .line 585
    const/4 v6, 0x0

    .line 586
    const/4 v7, 0x0

    .line 587
    const/4 v8, 0x0

    .line 588
    const/4 v10, 0x0

    .line 589
    const/4 v11, 0x0

    .line 590
    const/4 v15, 0x0

    .line 591
    invoke-static/range {v3 .. v17}, Lw5/e;->b(Lw5/e;Ljava/util/List;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lw5/e;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    move-object/from16 v3, p0

    .line 596
    .line 597
    invoke-virtual {v3, v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i0(Lw5/e;)V

    .line 598
    .line 599
    .line 600
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

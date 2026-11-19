.class public final Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;
.super Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel<",
        "Lcom/zykj/evaluation/bean/GuideNoStemQuestion;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B7\u0008\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00102\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010H\u0082@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J&\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u001bH\u0082@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ(\u0010$\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0082@\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u001d\u0010+\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020)\u00a2\u0006\u0004\u0008+\u0010,J#\u0010.\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u001b\u00a2\u0006\u0004\u0008.\u0010/J\r\u00100\u001a\u00020)\u00a2\u0006\u0004\u00080\u00101J\u001d\u00103\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u0019\u00a2\u0006\u0004\u00083\u00104J\r\u00105\u001a\u00020\u0010\u00a2\u0006\u0004\u00085\u0010\u0012J\u0015\u00106\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u00086\u00107R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR+\u0010J\u001a\u00020B2\u0006\u0010C\u001a\u00020B8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008D\u0010E\u001a\u0004\u0008F\u0010G\"\u0004\u0008H\u0010IR&\u0010N\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00190\u001b0K8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008L\u0010MR \u0010P\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00190O0\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010;R#\u0010V\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00190O0Q8\u0006\u00a2\u0006\u000c\n\u0004\u0008R\u0010S\u001a\u0004\u0008T\u0010U\u00a8\u0006W"
    }
    d2 = {
        "Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;",
        "Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;",
        "Lcom/zykj/evaluation/bean/GuideNoStemQuestion;",
        "Lp5/j;",
        "service",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "userInfo",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "ossTaskManger",
        "Lcom/zykj/evaluation/submit/SubmitTaskManger;",
        "submitTaskManger",
        "Lcom/zykj/evaluation/di/AppDatabase;",
        "database",
        "<init>",
        "(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lcom/zykj/evaluation/di/AppDatabase;)V",
        "",
        "U",
        "()V",
        "Lcom/zykj/evaluation/bean/GuideTaskInfo;",
        "guideTaskInfo",
        "e0",
        "(Lcom/zykj/evaluation/bean/GuideTaskInfo;)V",
        "T",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "uuid",
        "",
        "answers",
        "d0",
        "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "userId",
        "taskId",
        "",
        "state",
        "X",
        "(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "s",
        "(J)V",
        "questionId",
        "",
        "isAskForHelp",
        "Y",
        "(JZ)V",
        "localAnswer",
        "c0",
        "(Ljava/lang/String;Ljava/util/List;)V",
        "W",
        "()Z",
        "localPath",
        "f0",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "a0",
        "b0",
        "(Ljava/lang/String;)V",
        "l",
        "Lp5/j;",
        "m",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "n",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "o",
        "Lcom/zykj/evaluation/submit/SubmitTaskManger;",
        "p",
        "Lcom/zykj/evaluation/di/AppDatabase;",
        "Li6/o0;",
        "<set-?>",
        "q",
        "Landroidx/compose/runtime/MutableState;",
        "V",
        "()Li6/o0;",
        "Z",
        "(Li6/o0;)V",
        "noStemViewState",
        "Landroidx/collection/ArrayMap;",
        "r",
        "Landroidx/collection/ArrayMap;",
        "localAnswerMap",
        "",
        "_failedUuid",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "t",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "S",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "failedUuidStateFlow",
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
        "SMAP\nNoStemViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoStemViewModel.kt\ncom/zykj/evaluation/ui/guide/noStem/NoStemViewModel\n+ 2 ArrayMap.jvm.kt\nandroidx/collection/ArrayMapKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,336:1\n27#2:337\n85#3:338\n113#3,2:339\n1563#4:341\n1634#4,2:342\n1563#4:344\n1634#4,3:345\n1636#4:348\n1740#4,2:349\n1740#4,2:351\n1740#4,3:353\n1742#4:356\n1742#4:357\n774#4:363\n865#4,2:364\n1563#4:366\n1634#4,3:367\n230#5,5:358\n*S KotlinDebug\n*F\n+ 1 NoStemViewModel.kt\ncom/zykj/evaluation/ui/guide/noStem/NoStemViewModel\n*L\n73#1:337\n69#1:338\n69#1:339,2\n165#1:341\n165#1:342,2\n167#1:344\n167#1:345,3\n165#1:348\n185#1:349,2\n186#1:351,2\n187#1:353,3\n186#1:356\n185#1:357\n330#1:363\n330#1:364,2\n334#1:366\n334#1:367,3\n242#1:358,5\n*E\n"
    }
.end annotation


# instance fields
.field public final l:Lp5/j;

.field public final m:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final n:Lcom/zykj/evaluation/upload/OssTaskManger;

.field public final o:Lcom/zykj/evaluation/submit/SubmitTaskManger;

.field public final p:Lcom/zykj/evaluation/di/AppDatabase;

.field public final q:Landroidx/compose/runtime/MutableState;

.field public final r:Landroidx/collection/ArrayMap;

.field public final s:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final t:Lkotlinx/coroutines/flow/StateFlow;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lcom/zykj/evaluation/di/AppDatabase;)V
    .locals 1

    .line 1
    const-string v0, "service"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "userInfo"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "ossTaskManger"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "submitTaskManger"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "database"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, p1, p2}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;-><init>(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->l:Lp5/j;

    .line 30
    .line 31
    iput-object p2, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->m:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 32
    .line 33
    iput-object p3, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->n:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 34
    .line 35
    iput-object p4, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->o:Lcom/zykj/evaluation/submit/SubmitTaskManger;

    .line 36
    .line 37
    iput-object p5, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->p:Lcom/zykj/evaluation/di/AppDatabase;

    .line 38
    .line 39
    new-instance p1, Li6/o0;

    .line 40
    .line 41
    const/4 p2, 0x1

    .line 42
    const/4 p3, 0x0

    .line 43
    invoke-direct {p1, p3, p2, p3}, Li6/o0;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 44
    .line 45
    .line 46
    const/4 p2, 0x2

    .line 47
    invoke-static {p1, p3, p2, p3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->q:Landroidx/compose/runtime/MutableState;

    .line 52
    .line 53
    new-instance p1, Landroidx/collection/ArrayMap;

    .line 54
    .line 55
    invoke-direct {p1}, Landroidx/collection/ArrayMap;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->r:Landroidx/collection/ArrayMap;

    .line 59
    .line 60
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->s:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 69
    .line 70
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->t:Lkotlinx/coroutines/flow/StateFlow;

    .line 75
    .line 76
    return-void
.end method

.method public static final synthetic C(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;)Lcom/zykj/evaluation/bean/GuideTaskInfo;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->n()Lcom/zykj/evaluation/bean/GuideTaskInfo;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic D(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->T(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic E(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;)Landroidx/collection/ArrayMap;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->r:Landroidx/collection/ArrayMap;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic F(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->U()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic G(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;)Lcom/zykj/evaluation/upload/OssTaskManger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->n:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic H(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;)Lp5/j;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->l:Lp5/j;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic I(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;)Lcom/zykj/evaluation/submit/SubmitTaskManger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->o:Lcom/zykj/evaluation/submit/SubmitTaskManger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic J(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->m:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic K(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->X(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic L(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Lcom/zykj/evaluation/bean/GuideTaskInfo;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->u(Lcom/zykj/evaluation/bean/GuideTaskInfo;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic M(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Li6/o0;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->Z(Li6/o0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic N(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Lcom/zykj/evaluation/bean/ExamProgress;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->y(Lcom/zykj/evaluation/bean/ExamProgress;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic O(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->d0(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic P(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Lcom/zykj/evaluation/bean/ExamProgress;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->A(Lcom/zykj/evaluation/bean/ExamProgress;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic Q(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Lcom/zykj/evaluation/bean/GuideTaskInfo;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->e0(Lcom/zykj/evaluation/bean/GuideTaskInfo;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic R(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Lcom/zykj/evaluation/bean/GuideTaskInfo;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->B(Lcom/zykj/evaluation/bean/GuideTaskInfo;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final T(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getLocalAnswerMap$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getLocalAnswerMap$2;-><init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Lkotlin/coroutines/Continuation;)V

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

.method private final d0(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswerMap$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, p2, v2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswerMap$2;-><init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p3}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-ne p1, p2, :cond_0

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


# virtual methods
.method public final S()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->t:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final U()V
    .locals 9

    .line 1
    new-instance v6, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v6, p0, v0}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;-><init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Lkotlin/coroutines/Continuation;)V

    .line 5
    .line 6
    .line 7
    const/16 v7, 0x1f

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    move-object v0, p0

    .line 16
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final V()Li6/o0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->q:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Li6/o0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final W()Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->V()Li6/o0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Li6/o0;->b()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    return v1

    .line 19
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_6

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Li6/b;

    .line 34
    .line 35
    invoke-virtual {v2}, Li6/b;->e()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, Li6/l;

    .line 63
    .line 64
    invoke-virtual {v3}, Li6/l;->d()Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-nez v4, :cond_5

    .line 73
    .line 74
    invoke-virtual {v3}, Li6/l;->d()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    if-eqz v3, :cond_4

    .line 79
    .line 80
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_4

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_3

    .line 96
    .line 97
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    check-cast v4, Ljava/lang/String;

    .line 102
    .line 103
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-lez v4, :cond_5

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_5
    const/4 v0, 0x0

    .line 111
    return v0

    .line 112
    :cond_6
    return v1
.end method

.method public final X(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p6, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$loadFailedUuids$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$loadFailedUuids$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$loadFailedUuids$1;->f:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$loadFailedUuids$1;->f:I

    .line 18
    .line 19
    :goto_0
    move-object v7, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$loadFailedUuids$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p6}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$loadFailedUuids$1;-><init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Lkotlin/coroutines/Continuation;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p6, v7, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$loadFailedUuids$1;->d:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v7, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$loadFailedUuids$1;->f:I

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p6, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->p:Lcom/zykj/evaluation/di/AppDatabase;

    .line 56
    .line 57
    invoke-virtual {p6}, Lcom/zykj/evaluation/di/AppDatabase;->h()Ln5/i;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iput-wide p1, v7, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$loadFailedUuids$1;->a:J

    .line 62
    .line 63
    iput-wide p3, v7, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$loadFailedUuids$1;->b:J

    .line 64
    .line 65
    iput p5, v7, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$loadFailedUuids$1;->c:I

    .line 66
    .line 67
    iput v2, v7, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$loadFailedUuids$1;->f:I

    .line 68
    .line 69
    move-wide v2, p1

    .line 70
    move-wide v4, p3

    .line 71
    move v6, p5

    .line 72
    invoke-interface/range {v1 .. v7}, Ln5/i;->a(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p6

    .line 76
    if-ne p6, v0, :cond_3

    .line 77
    .line 78
    return-object v0

    .line 79
    :cond_3
    :goto_2
    check-cast p6, Ljava/util/List;

    .line 80
    .line 81
    iget-object p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->s:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 82
    .line 83
    new-instance p2, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-interface {p6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    :cond_4
    :goto_3
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result p4

    .line 96
    if-eqz p4, :cond_6

    .line 97
    .line 98
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p4

    .line 102
    move-object p5, p4

    .line 103
    check-cast p5, Ln5/h;

    .line 104
    .line 105
    invoke-virtual {p5}, Ln5/h;->c()Lcom/zykj/evaluation/bean/UploadData;

    .line 106
    .line 107
    .line 108
    move-result-object p6

    .line 109
    invoke-virtual {p6}, Lcom/zykj/evaluation/bean/UploadData;->getCommitState()I

    .line 110
    .line 111
    .line 112
    move-result p6

    .line 113
    sget-object v0, Lm5/e$a;->b:Lm5/e$a;

    .line 114
    .line 115
    invoke-virtual {v0}, Lm5/e;->a()I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eq p6, v0, :cond_5

    .line 120
    .line 121
    invoke-virtual {p5}, Ln5/h;->c()Lcom/zykj/evaluation/bean/UploadData;

    .line 122
    .line 123
    .line 124
    move-result-object p5

    .line 125
    invoke-virtual {p5}, Lcom/zykj/evaluation/bean/UploadData;->getCommitState()I

    .line 126
    .line 127
    .line 128
    move-result p5

    .line 129
    sget-object p6, Lm5/e$d;->b:Lm5/e$d;

    .line 130
    .line 131
    invoke-virtual {p6}, Lm5/e;->a()I

    .line 132
    .line 133
    .line 134
    move-result p6

    .line 135
    if-ne p5, p6, :cond_4

    .line 136
    .line 137
    :cond_5
    invoke-interface {p2, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_6
    new-instance p3, Ljava/util/ArrayList;

    .line 142
    .line 143
    const/16 p4, 0xa

    .line 144
    .line 145
    invoke-static {p2, p4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 146
    .line 147
    .line 148
    move-result p4

    .line 149
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 153
    .line 154
    .line 155
    move-result p4

    .line 156
    const/4 p5, 0x0

    .line 157
    :goto_4
    if-ge p5, p4, :cond_7

    .line 158
    .line 159
    invoke-virtual {p2, p5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p6

    .line 163
    add-int/lit8 p5, p5, 0x1

    .line 164
    .line 165
    check-cast p6, Ln5/h;

    .line 166
    .line 167
    invoke-virtual {p6}, Ln5/h;->e()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p6

    .line 171
    invoke-interface {p3, p6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_7
    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 183
    .line 184
    return-object p1
.end method

.method public final Y(JZ)V
    .locals 9

    .line 1
    new-instance v0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move-wide v2, p1

    .line 6
    move v4, p3

    .line 7
    invoke-direct/range {v0 .. v5}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;-><init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;JZLkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    .line 10
    const/16 v7, 0x1f

    .line 11
    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    move-object v6, v0

    .line 18
    move-object v0, p0

    .line 19
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final Z(Li6/o0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->q:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final a0()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$submitNoStem$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$submitNoStem$1;-><init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Lkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final b0(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "uuid"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->s:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 7
    .line 8
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    move-object v2, v1

    .line 13
    check-cast v2, Ljava/util/Set;

    .line 14
    .line 15
    invoke-static {v2, p1}, Lkotlin/collections/SetsKt;->minus(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    return-void
.end method

.method public final c0(Ljava/lang/String;Ljava/util/List;)V
    .locals 22

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
    new-instance v3, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswer$1;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v3, v1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswer$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 21
    .line 22
    .line 23
    new-instance v4, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswer$2;

    .line 24
    .line 25
    invoke-direct {v4, v1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswer$2;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 26
    .line 27
    .line 28
    new-instance v6, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswer$3;

    .line 29
    .line 30
    invoke-direct {v6, v0, v9, v10, v1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateLocalAnswer$3;-><init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    .line 31
    .line 32
    .line 33
    const/16 v7, 0x13

    .line 34
    .line 35
    const/4 v8, 0x0

    .line 36
    const/4 v2, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual/range {p0 .. p1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->b0(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->V()Li6/o0;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->V()Li6/o0;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2}, Li6/o0;->b()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    new-instance v3, Ljava/util/ArrayList;

    .line 57
    .line 58
    const/16 v4, 0xa

    .line 59
    .line 60
    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-eqz v5, :cond_2

    .line 76
    .line 77
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    check-cast v5, Li6/b;

    .line 82
    .line 83
    invoke-virtual {v5}, Li6/b;->e()Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    new-instance v7, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-static {v6, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    if-eqz v8, :cond_1

    .line 105
    .line 106
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    check-cast v8, Li6/l;

    .line 111
    .line 112
    invoke-virtual {v8}, Li6/l;->i()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    invoke-static {v11, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v11

    .line 120
    if-eqz v11, :cond_0

    .line 121
    .line 122
    const/16 v20, 0x7f

    .line 123
    .line 124
    const/16 v21, 0x0

    .line 125
    .line 126
    const/4 v11, 0x0

    .line 127
    const-wide/16 v12, 0x0

    .line 128
    .line 129
    const/4 v14, 0x0

    .line 130
    const/4 v15, 0x0

    .line 131
    const/16 v16, 0x0

    .line 132
    .line 133
    const/16 v17, 0x0

    .line 134
    .line 135
    const/16 v18, 0x0

    .line 136
    .line 137
    move-object/from16 v19, v10

    .line 138
    .line 139
    move-object v10, v8

    .line 140
    invoke-static/range {v10 .. v21}, Li6/l;->b(Li6/l;Ljava/lang/String;JZZILjava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Li6/l;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    goto :goto_2

    .line 145
    :cond_0
    move-object v10, v8

    .line 146
    :goto_2
    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-object/from16 v10, p2

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_1
    const/4 v15, 0x7

    .line 153
    const/16 v16, 0x0

    .line 154
    .line 155
    const/4 v11, 0x0

    .line 156
    const/4 v12, 0x0

    .line 157
    const/4 v13, 0x0

    .line 158
    move-object v10, v5

    .line 159
    move-object v14, v7

    .line 160
    invoke-static/range {v10 .. v16}, Li6/b;->b(Li6/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Li6/b;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-object/from16 v10, p2

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_2
    invoke-virtual {v1, v3}, Li6/o0;->a(Ljava/util/List;)Li6/o0;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->Z(Li6/o0;)V

    .line 175
    .line 176
    .line 177
    return-void
.end method

.method public final e0(Lcom/zykj/evaluation/bean/GuideTaskInfo;)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, p1, v1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;-><init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Lcom/zykj/evaluation/bean/GuideTaskInfo;Lkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final f0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    .line 1
    const-string v0, "uuid"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "localPath"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v3, Lcom/zykj/evaluation/base/a$a;->c:Lcom/zykj/evaluation/base/a$a;

    .line 12
    .line 13
    new-instance v7, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$uploadAnswer$1;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {v7, p0, p1, p2, v0}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$uploadAnswer$1;-><init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 17
    .line 18
    .line 19
    const/16 v8, 0x1d

    .line 20
    .line 21
    const/4 v9, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x0

    .line 26
    move-object v1, p0

    .line 27
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public s(J)V
    .locals 7

    .line 1
    invoke-super {p0, p1, p2}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->s(J)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lg7/e;

    .line 5
    .line 6
    sget-object v1, Lcom/zykj/evaluation/bean/TaskState$ToDo;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$ToDo;

    .line 7
    .line 8
    iget-object p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->m:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 9
    .line 10
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lcom/zykj/message/server/bean/UserInfo;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string p2, "getId(...)"

    .line 21
    .line 22
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->q()J

    .line 30
    .line 31
    .line 32
    move-result-wide v4

    .line 33
    invoke-direct/range {v0 .. v5}, Lg7/e;-><init>(Lcom/zykj/evaluation/bean/TaskState;JJ)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->w(Lg7/e;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    new-instance v4, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$initData$1;

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    invoke-direct {v4, p0, p1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$initData$1;-><init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Lkotlin/coroutines/Continuation;)V

    .line 47
    .line 48
    .line 49
    const/4 v5, 0x3

    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v2, 0x0

    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 54
    .line 55
    .line 56
    return-void
.end method

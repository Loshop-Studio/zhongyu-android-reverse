.class public final Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;
.super Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B/\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u0096@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001e\u0010\u0017\u001a\u00020\u000f2\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u0096@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0004\u0008\u001e\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010!R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R$\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\'0&j\u0008\u0012\u0004\u0012\u00020\'`(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*\u00a8\u0006,"
    }
    d2 = {
        "Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;",
        "Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;",
        "Lp5/j;",
        "service",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "userInfo",
        "Lcom/zykj/evaluation/submit/SubmitTaskManger;",
        "submitTaskManger",
        "Lcom/zykj/evaluation/di/AppDatabase;",
        "database",
        "<init>",
        "(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lcom/zykj/evaluation/di/AppDatabase;)V",
        "",
        "taskId",
        "",
        "s",
        "(J)V",
        "Lcom/zykj/evaluation/bean/GuideTaskInfo;",
        "Lcom/zykj/evaluation/bean/GuideNormalQuestion;",
        "S",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "guideTaskInfo",
        "Y",
        "(Lcom/zykj/evaluation/bean/GuideTaskInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "whenShowState",
        "",
        "M",
        "(I)Z",
        "b0",
        "r",
        "Lp5/j;",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "t",
        "Lcom/zykj/evaluation/submit/SubmitTaskManger;",
        "u",
        "Lcom/zykj/evaluation/di/AppDatabase;",
        "Ljava/util/ArrayList;",
        "Lcom/zykj/evaluation/utils/NeedReviseData;",
        "Lkotlin/collections/ArrayList;",
        "v",
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
        "SMAP\nToCorrectGuideViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToCorrectGuideViewModel.kt\ncom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n1563#2:204\n1634#2,2:205\n1563#2:207\n1634#2,2:208\n774#2:210\n865#2,2:211\n1761#2,3:213\n295#2,2:216\n295#2,2:218\n1636#2:221\n1636#2:222\n1#3:220\n*S KotlinDebug\n*F\n+ 1 ToCorrectGuideViewModel.kt\ncom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel\n*L\n92#1:204\n92#1:205,2\n101#1:207\n101#1:208,2\n104#1:210\n104#1:211,2\n110#1:213,3\n114#1:216,2\n119#1:218,2\n101#1:221\n92#1:222\n*E\n"
    }
.end annotation


# instance fields
.field public final r:Lp5/j;

.field public final s:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final t:Lcom/zykj/evaluation/submit/SubmitTaskManger;

.field public final u:Lcom/zykj/evaluation/di/AppDatabase;

.field public final v:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lcom/zykj/evaluation/di/AppDatabase;)V
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
    const-string v0, "submitTaskManger"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "database"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;-><init>(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/submit/SubmitTaskManger;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;->r:Lp5/j;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;->s:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;->t:Lcom/zykj/evaluation/submit/SubmitTaskManger;

    .line 29
    .line 30
    iput-object p4, p0, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;->u:Lcom/zykj/evaluation/di/AppDatabase;

    .line 31
    .line 32
    const/4 p1, 0x4

    .line 33
    new-array p1, p1, [Lj6/q;

    .line 34
    .line 35
    sget-object p2, Lj6/q$m;->e:Lj6/q$m;

    .line 36
    .line 37
    const/4 p3, 0x0

    .line 38
    aput-object p2, p1, p3

    .line 39
    .line 40
    sget-object p2, Lj6/q$k;->e:Lj6/q$k;

    .line 41
    .line 42
    const/4 p3, 0x1

    .line 43
    aput-object p2, p1, p3

    .line 44
    .line 45
    sget-object p2, Lj6/q$d;->e:Lj6/q$d;

    .line 46
    .line 47
    const/4 p3, 0x2

    .line 48
    aput-object p2, p1, p3

    .line 49
    .line 50
    sget-object p2, Lj6/q$i;->e:Lj6/q$i;

    .line 51
    .line 52
    const/4 p3, 0x3

    .line 53
    aput-object p2, p1, p3

    .line 54
    .line 55
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->V(Ljava/util/List;)V

    .line 60
    .line 61
    .line 62
    new-instance p1, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;->v:Ljava/util/ArrayList;

    .line 68
    .line 69
    return-void
.end method

.method public static final synthetic Z(Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;->b0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic a0(Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;->v:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public M(I)Z
    .locals 3

    .line 1
    sget-object v0, Lcom/zykj/evaluation/bean/constant/WhenShowState$ToDo;->INSTANCE:Lcom/zykj/evaluation/bean/constant/WhenShowState$ToDo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/constant/WhenShowState;->getState()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Lcom/zykj/evaluation/bean/constant/WhenShowState$Correcting;->INSTANCE:Lcom/zykj/evaluation/bean/constant/WhenShowState$Correcting;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/constant/WhenShowState;->getState()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget-object v2, Lcom/zykj/evaluation/bean/constant/WhenShowState$ToCorrect;->INSTANCE:Lcom/zykj/evaluation/bean/constant/WhenShowState$ToCorrect;

    .line 22
    .line 23
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/constant/WhenShowState;->getState()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    filled-new-array {v0, v1, v2}, [Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1
.end method

.method public S(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$getTaskInfo$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$getTaskInfo$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$getTaskInfo$1;->c:I

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
    iput v1, v0, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$getTaskInfo$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$getTaskInfo$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$getTaskInfo$1;-><init>(Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$getTaskInfo$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$getTaskInfo$1;->c:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;->r:Lp5/j;

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->q()J

    .line 56
    .line 57
    .line 58
    move-result-wide v4

    .line 59
    iput v3, v0, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$getTaskInfo$1;->c:I

    .line 60
    .line 61
    invoke-interface {p1, v4, v5, v0}, Lp5/j;->o(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-ne p1, v1, :cond_3

    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_3
    :goto_1
    check-cast p1, Lcom/zykj/http/bean/ApiResp;

    .line 69
    .line 70
    invoke-static {p1}, Lo5/g;->a(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1
.end method

.method public Y(Lcom/zykj/evaluation/bean/GuideTaskInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 57

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$updateGuideView$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$updateGuideView$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$updateGuideView$1;->d:I

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
    iput v3, v2, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$updateGuideView$1;->d:I

    .line 22
    .line 23
    :goto_0
    move-object v9, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$updateGuideView$1;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$updateGuideView$1;-><init>(Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v9, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$updateGuideView$1;->b:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget v3, v9, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$updateGuideView$1;->d:I

    .line 38
    .line 39
    const/4 v10, 0x1

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    if-ne v3, v10, :cond_1

    .line 43
    .line 44
    iget-object v2, v9, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$updateGuideView$1;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Lcom/zykj/evaluation/bean/GuideTaskInfo;

    .line 47
    .line 48
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    move-object v3, v1

    .line 52
    move-object v1, v2

    .line 53
    goto/16 :goto_4

    .line 54
    .line 55
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v1

    .line 63
    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->o()Lh6/a;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->isNormalTask()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getCorrectWithSelf()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_4

    .line 81
    .line 82
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    const-string v3, "isCorrectShowAnalysis"

    .line 87
    .line 88
    invoke-virtual {v1, v3, v10}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_3

    .line 93
    .line 94
    sget-object v1, Lj6/a$c;->c:Lj6/a$c;

    .line 95
    .line 96
    :goto_2
    move-object/from16 v25, v1

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_3
    sget-object v1, Lj6/a$b;->c:Lj6/a$b;

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_4
    sget-object v1, Lj6/a$a;->c:Lj6/a$a;

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :goto_3
    const/16 v26, 0x1fff

    .line 106
    .line 107
    const/16 v27, 0x0

    .line 108
    .line 109
    const/4 v12, 0x0

    .line 110
    const/4 v13, 0x0

    .line 111
    const/4 v14, 0x0

    .line 112
    const/4 v15, 0x0

    .line 113
    const/16 v16, 0x0

    .line 114
    .line 115
    const/16 v17, 0x0

    .line 116
    .line 117
    const/16 v18, 0x0

    .line 118
    .line 119
    const/16 v19, 0x0

    .line 120
    .line 121
    const/16 v20, 0x0

    .line 122
    .line 123
    const/16 v21, 0x0

    .line 124
    .line 125
    const/16 v22, 0x0

    .line 126
    .line 127
    const/16 v23, 0x0

    .line 128
    .line 129
    const/16 v24, 0x0

    .line 130
    .line 131
    invoke-static/range {v11 .. v27}, Lh6/a;->b(Lh6/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lj6/a;ILjava/lang/Object;)Lh6/a;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->v(Lh6/a;)V

    .line 136
    .line 137
    .line 138
    iget-object v1, v0, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;->u:Lcom/zykj/evaluation/di/AppDatabase;

    .line 139
    .line 140
    invoke-virtual {v1}, Lcom/zykj/evaluation/di/AppDatabase;->j()Ln5/w;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    iget-object v1, v0, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;->s:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 145
    .line 146
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    check-cast v1, Lcom/zykj/message/server/bean/UserInfo;

    .line 151
    .line 152
    invoke-virtual {v1}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    const-string v4, "getId(...)"

    .line 157
    .line 158
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 162
    .line 163
    .line 164
    move-result-wide v4

    .line 165
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->q()J

    .line 166
    .line 167
    .line 168
    move-result-wide v6

    .line 169
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->r()I

    .line 170
    .line 171
    .line 172
    move-result v8

    .line 173
    move-object/from16 v1, p1

    .line 174
    .line 175
    iput-object v1, v9, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$updateGuideView$1;->a:Ljava/lang/Object;

    .line 176
    .line 177
    iput v10, v9, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$updateGuideView$1;->d:I

    .line 178
    .line 179
    invoke-interface/range {v3 .. v9}, Ln5/w;->a(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    if-ne v3, v2, :cond_5

    .line 184
    .line 185
    return-object v2

    .line 186
    :cond_5
    :goto_4
    check-cast v3, Ljava/util/List;

    .line 187
    .line 188
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getGroups()Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    new-instance v4, Ljava/util/ArrayList;

    .line 193
    .line 194
    const/16 v5, 0xa

    .line 195
    .line 196
    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 197
    .line 198
    .line 199
    move-result v6

    .line 200
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 201
    .line 202
    .line 203
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    move v7, v10

    .line 208
    const/4 v8, 0x0

    .line 209
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v9

    .line 213
    if-eqz v9, :cond_1e

    .line 214
    .line 215
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v9

    .line 219
    check-cast v9, Lcom/zykj/evaluation/bean/GuideGroup;

    .line 220
    .line 221
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getWhenShowMicroLesson()I

    .line 222
    .line 223
    .line 224
    move-result v11

    .line 225
    invoke-virtual {v0, v11}, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;->M(I)Z

    .line 226
    .line 227
    .line 228
    move-result v11

    .line 229
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/GuideGroup;->getTitle()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v12

    .line 233
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/GuideGroup;->getQstCount()I

    .line 234
    .line 235
    .line 236
    move-result v13

    .line 237
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getEnableScore()Z

    .line 238
    .line 239
    .line 240
    move-result v14

    .line 241
    if-eqz v14, :cond_6

    .line 242
    .line 243
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/GuideGroup;->getScore()D

    .line 244
    .line 245
    .line 246
    move-result-wide v14

    .line 247
    new-instance v10, Ljava/lang/StringBuilder;

    .line 248
    .line 249
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 250
    .line 251
    .line 252
    const-string v6, "\uff0c\u5171"

    .line 253
    .line 254
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v10, v14, v15}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    const-string v6, "\u5206\uff09"

    .line 261
    .line 262
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    goto :goto_6

    .line 270
    :cond_6
    const-string v6, "\uff09"

    .line 271
    .line 272
    :goto_6
    new-instance v10, Ljava/lang/StringBuilder;

    .line 273
    .line 274
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 275
    .line 276
    .line 277
    const-string v14, "\uff08\u5171"

    .line 278
    .line 279
    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    const-string v13, "\u9898"

    .line 286
    .line 287
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/GuideGroup;->getDescription()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v10

    .line 301
    const-string v13, ""

    .line 302
    .line 303
    if-nez v10, :cond_7

    .line 304
    .line 305
    move-object v10, v13

    .line 306
    :cond_7
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/GuideGroup;->getQuestions()Ljava/util/List;

    .line 307
    .line 308
    .line 309
    move-result-object v9

    .line 310
    new-instance v14, Ljava/util/ArrayList;

    .line 311
    .line 312
    invoke-static {v9, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 313
    .line 314
    .line 315
    move-result v15

    .line 316
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 317
    .line 318
    .line 319
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    :goto_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 324
    .line 325
    .line 326
    move-result v15

    .line 327
    if-eqz v15, :cond_1d

    .line 328
    .line 329
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v15

    .line 333
    check-cast v15, Lcom/zykj/evaluation/bean/GuideNormalQuestion;

    .line 334
    .line 335
    iget-object v5, v0, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;->v:Ljava/util/ArrayList;

    .line 336
    .line 337
    move-object/from16 v17, v1

    .line 338
    .line 339
    new-instance v1, Ljava/util/ArrayList;

    .line 340
    .line 341
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 342
    .line 343
    .line 344
    move-object/from16 v18, v2

    .line 345
    .line 346
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 347
    .line 348
    .line 349
    move-result v2

    .line 350
    move-object/from16 v19, v3

    .line 351
    .line 352
    const/4 v3, 0x0

    .line 353
    :goto_8
    if-ge v3, v2, :cond_9

    .line 354
    .line 355
    move/from16 v20, v2

    .line 356
    .line 357
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    add-int/lit8 v3, v3, 0x1

    .line 362
    .line 363
    move-object/from16 v21, v2

    .line 364
    .line 365
    check-cast v21, Lcom/zykj/evaluation/utils/NeedReviseData;

    .line 366
    .line 367
    invoke-virtual/range {v21 .. v21}, Lcom/zykj/evaluation/utils/NeedReviseData;->getQuestionId()J

    .line 368
    .line 369
    .line 370
    move-result-wide v21

    .line 371
    invoke-virtual {v15}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getId()J

    .line 372
    .line 373
    .line 374
    move-result-wide v23

    .line 375
    cmp-long v21, v21, v23

    .line 376
    .line 377
    if-nez v21, :cond_8

    .line 378
    .line 379
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    :cond_8
    move/from16 v2, v20

    .line 383
    .line 384
    goto :goto_8

    .line 385
    :cond_9
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 386
    .line 387
    .line 388
    move-result v2

    .line 389
    if-eqz v2, :cond_a

    .line 390
    .line 391
    invoke-virtual {v15}, Lcom/zykj/evaluation/bean/GuideNormalQuestion;->getNeedRevise()Z

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    goto :goto_9

    .line 396
    :cond_a
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 397
    .line 398
    .line 399
    move-result v2

    .line 400
    if-eqz v2, :cond_c

    .line 401
    .line 402
    :cond_b
    const/4 v1, 0x0

    .line 403
    goto :goto_9

    .line 404
    :cond_c
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    const/4 v3, 0x0

    .line 409
    :cond_d
    if-ge v3, v2, :cond_b

    .line 410
    .line 411
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v5

    .line 415
    add-int/lit8 v3, v3, 0x1

    .line 416
    .line 417
    check-cast v5, Lcom/zykj/evaluation/utils/NeedReviseData;

    .line 418
    .line 419
    invoke-virtual {v5}, Lcom/zykj/evaluation/utils/NeedReviseData;->getNeedRevise()Z

    .line 420
    .line 421
    .line 422
    move-result v5

    .line 423
    if-eqz v5, :cond_d

    .line 424
    .line 425
    const/4 v1, 0x1

    .line 426
    :goto_9
    invoke-interface/range {v19 .. v19}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    :cond_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 431
    .line 432
    .line 433
    move-result v3

    .line 434
    if-eqz v3, :cond_f

    .line 435
    .line 436
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    move-object/from16 v20, v3

    .line 441
    .line 442
    check-cast v20, Ln5/v;

    .line 443
    .line 444
    invoke-virtual/range {v20 .. v20}, Ln5/v;->g()J

    .line 445
    .line 446
    .line 447
    move-result-wide v20

    .line 448
    invoke-virtual {v15}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getId()J

    .line 449
    .line 450
    .line 451
    move-result-wide v22

    .line 452
    cmp-long v20, v20, v22

    .line 453
    .line 454
    if-nez v20, :cond_e

    .line 455
    .line 456
    goto :goto_a

    .line 457
    :cond_f
    const/4 v3, 0x0

    .line 458
    :goto_a
    check-cast v3, Ln5/v;

    .line 459
    .line 460
    if-eqz v3, :cond_10

    .line 461
    .line 462
    invoke-static {v3}, Lj6/b;->a(Ln5/v;)Z

    .line 463
    .line 464
    .line 465
    move-result v2

    .line 466
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    goto :goto_b

    .line 471
    :cond_10
    const/4 v2, 0x0

    .line 472
    :goto_b
    invoke-interface/range {v19 .. v19}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    :cond_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 477
    .line 478
    .line 479
    move-result v20

    .line 480
    if-eqz v20, :cond_12

    .line 481
    .line 482
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v20

    .line 486
    move-object/from16 v21, v20

    .line 487
    .line 488
    check-cast v21, Ln5/v;

    .line 489
    .line 490
    invoke-virtual/range {v21 .. v21}, Ln5/v;->g()J

    .line 491
    .line 492
    .line 493
    move-result-wide v21

    .line 494
    invoke-virtual {v15}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getId()J

    .line 495
    .line 496
    .line 497
    move-result-wide v23

    .line 498
    cmp-long v21, v21, v23

    .line 499
    .line 500
    if-nez v21, :cond_11

    .line 501
    .line 502
    goto :goto_c

    .line 503
    :cond_12
    const/16 v20, 0x0

    .line 504
    .line 505
    :goto_c
    check-cast v20, Ln5/v;

    .line 506
    .line 507
    if-eqz v20, :cond_13

    .line 508
    .line 509
    invoke-virtual/range {v20 .. v20}, Ln5/v;->d()I

    .line 510
    .line 511
    .line 512
    move-result v3

    .line 513
    const/4 v5, 0x2

    .line 514
    if-ne v3, v5, :cond_13

    .line 515
    .line 516
    const/4 v3, 0x1

    .line 517
    goto :goto_d

    .line 518
    :cond_13
    const/4 v3, 0x0

    .line 519
    :goto_d
    if-eqz v2, :cond_14

    .line 520
    .line 521
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 522
    .line 523
    .line 524
    move-result v2

    .line 525
    goto :goto_e

    .line 526
    :cond_14
    invoke-virtual {v15}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getCompleted()Z

    .line 527
    .line 528
    .line 529
    move-result v2

    .line 530
    :goto_e
    if-eqz v3, :cond_15

    .line 531
    .line 532
    sget-object v1, Lj6/q$m;->e:Lj6/q$m;

    .line 533
    .line 534
    move-object/from16 v24, v1

    .line 535
    .line 536
    const/4 v8, 0x1

    .line 537
    goto :goto_10

    .line 538
    :cond_15
    if-nez v1, :cond_16

    .line 539
    .line 540
    sget-object v1, Lj6/q$i;->e:Lj6/q$i;

    .line 541
    .line 542
    :goto_f
    move-object/from16 v24, v1

    .line 543
    .line 544
    goto :goto_10

    .line 545
    :cond_16
    if-eqz v2, :cond_17

    .line 546
    .line 547
    sget-object v1, Lj6/q$d;->e:Lj6/q$d;

    .line 548
    .line 549
    goto :goto_f

    .line 550
    :cond_17
    sget-object v1, Lj6/q$k;->e:Lj6/q$k;

    .line 551
    .line 552
    move-object/from16 v24, v1

    .line 553
    .line 554
    const/4 v7, 0x0

    .line 555
    :goto_10
    invoke-virtual {v15}, Lcom/zykj/evaluation/bean/GuideNormalQuestion;->getOriginScore()Ljava/lang/Double;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    invoke-virtual {v15}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getScore()D

    .line 560
    .line 561
    .line 562
    move-result-wide v2

    .line 563
    new-instance v5, Ljava/lang/StringBuilder;

    .line 564
    .line 565
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    const-string v1, "/"

    .line 572
    .line 573
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    const-string v2, "\u5206"

    .line 580
    .line 581
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object v3

    .line 588
    invoke-virtual/range {v17 .. v17}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getEnableScore()Z

    .line 589
    .line 590
    .line 591
    move-result v5

    .line 592
    if-eqz v5, :cond_18

    .line 593
    .line 594
    invoke-virtual {v15}, Lcom/zykj/evaluation/bean/GuideNormalQuestion;->getOriginScore()Ljava/lang/Double;

    .line 595
    .line 596
    .line 597
    move-result-object v5

    .line 598
    if-eqz v5, :cond_18

    .line 599
    .line 600
    goto :goto_11

    .line 601
    :cond_18
    const/4 v3, 0x0

    .line 602
    :goto_11
    if-nez v3, :cond_19

    .line 603
    .line 604
    move-object v3, v13

    .line 605
    :cond_19
    move v5, v7

    .line 606
    move/from16 v30, v8

    .line 607
    .line 608
    invoke-virtual {v15}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getMyScore()D

    .line 609
    .line 610
    .line 611
    move-result-wide v7

    .line 612
    move-object/from16 v31, v4

    .line 613
    .line 614
    move/from16 v32, v5

    .line 615
    .line 616
    invoke-virtual {v15}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getScore()D

    .line 617
    .line 618
    .line 619
    move-result-wide v4

    .line 620
    move-object/from16 v33, v9

    .line 621
    .line 622
    new-instance v9, Ljava/lang/StringBuilder;

    .line 623
    .line 624
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v9, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 634
    .line 635
    .line 636
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v1

    .line 643
    invoke-virtual/range {v17 .. v17}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getEnableScore()Z

    .line 644
    .line 645
    .line 646
    move-result v2

    .line 647
    if-eqz v2, :cond_1a

    .line 648
    .line 649
    move-object v5, v1

    .line 650
    goto :goto_12

    .line 651
    :cond_1a
    const/4 v5, 0x0

    .line 652
    :goto_12
    if-nez v5, :cond_1b

    .line 653
    .line 654
    move-object/from16 v29, v13

    .line 655
    .line 656
    goto :goto_13

    .line 657
    :cond_1b
    move-object/from16 v29, v5

    .line 658
    .line 659
    :goto_13
    invoke-virtual {v15}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getId()J

    .line 660
    .line 661
    .line 662
    move-result-wide v22

    .line 663
    invoke-virtual {v15}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getTitle()Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v25

    .line 667
    invoke-virtual {v15}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getAskForHelp()Z

    .line 668
    .line 669
    .line 670
    move-result v26

    .line 671
    if-eqz v11, :cond_1c

    .line 672
    .line 673
    invoke-virtual {v15}, Lcom/zykj/evaluation/bean/GuideNormalQuestion;->getHasMicroClass()Z

    .line 674
    .line 675
    .line 676
    move-result v1

    .line 677
    if-eqz v1, :cond_1c

    .line 678
    .line 679
    const/16 v27, 0x1

    .line 680
    .line 681
    goto :goto_14

    .line 682
    :cond_1c
    const/16 v27, 0x0

    .line 683
    .line 684
    :goto_14
    new-instance v1, Landroidx/compose/ui/text/AnnotatedString$Builder;

    .line 685
    .line 686
    invoke-direct {v1, v3}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(Ljava/lang/String;)V

    .line 687
    .line 688
    .line 689
    new-instance v34, Landroidx/compose/ui/text/SpanStyle;

    .line 690
    .line 691
    sget-object v2, Landroidx/compose/ui/text/style/TextDecoration;->Companion:Landroidx/compose/ui/text/style/TextDecoration$Companion;

    .line 692
    .line 693
    invoke-virtual {v2}, Landroidx/compose/ui/text/style/TextDecoration$Companion;->getLineThrough()Landroidx/compose/ui/text/style/TextDecoration;

    .line 694
    .line 695
    .line 696
    move-result-object v51

    .line 697
    const v55, 0xefff

    .line 698
    .line 699
    .line 700
    const/16 v56, 0x0

    .line 701
    .line 702
    const-wide/16 v35, 0x0

    .line 703
    .line 704
    const-wide/16 v37, 0x0

    .line 705
    .line 706
    const/16 v39, 0x0

    .line 707
    .line 708
    const/16 v40, 0x0

    .line 709
    .line 710
    const/16 v41, 0x0

    .line 711
    .line 712
    const/16 v42, 0x0

    .line 713
    .line 714
    const/16 v43, 0x0

    .line 715
    .line 716
    const-wide/16 v44, 0x0

    .line 717
    .line 718
    const/16 v46, 0x0

    .line 719
    .line 720
    const/16 v47, 0x0

    .line 721
    .line 722
    const/16 v48, 0x0

    .line 723
    .line 724
    const-wide/16 v49, 0x0

    .line 725
    .line 726
    const/16 v52, 0x0

    .line 727
    .line 728
    const/16 v53, 0x0

    .line 729
    .line 730
    const/16 v54, 0x0

    .line 731
    .line 732
    invoke-direct/range {v34 .. v56}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 733
    .line 734
    .line 735
    move-object/from16 v2, v34

    .line 736
    .line 737
    invoke-virtual {v1}, Landroidx/compose/ui/text/AnnotatedString$Builder;->getLength()I

    .line 738
    .line 739
    .line 740
    move-result v3

    .line 741
    const/4 v4, 0x0

    .line 742
    invoke-virtual {v1, v2, v4, v3}, Landroidx/compose/ui/text/AnnotatedString$Builder;->addStyle(Landroidx/compose/ui/text/SpanStyle;II)V

    .line 743
    .line 744
    .line 745
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 746
    .line 747
    invoke-virtual {v1}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    .line 748
    .line 749
    .line 750
    move-result-object v28

    .line 751
    new-instance v21, Lj6/h;

    .line 752
    .line 753
    invoke-direct/range {v21 .. v29}, Lj6/h;-><init>(JLj6/q;Ljava/lang/String;ZZLandroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;)V

    .line 754
    .line 755
    .line 756
    move-object/from16 v1, v21

    .line 757
    .line 758
    invoke-interface {v14, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 759
    .line 760
    .line 761
    move-object/from16 v1, v17

    .line 762
    .line 763
    move-object/from16 v2, v18

    .line 764
    .line 765
    move-object/from16 v3, v19

    .line 766
    .line 767
    move/from16 v8, v30

    .line 768
    .line 769
    move-object/from16 v4, v31

    .line 770
    .line 771
    move/from16 v7, v32

    .line 772
    .line 773
    move-object/from16 v9, v33

    .line 774
    .line 775
    const/16 v5, 0xa

    .line 776
    .line 777
    goto/16 :goto_7

    .line 778
    .line 779
    :cond_1d
    move-object/from16 v17, v1

    .line 780
    .line 781
    move-object/from16 v18, v2

    .line 782
    .line 783
    move-object/from16 v19, v3

    .line 784
    .line 785
    move-object/from16 v31, v4

    .line 786
    .line 787
    const/4 v4, 0x0

    .line 788
    new-instance v1, Lj6/c;

    .line 789
    .line 790
    invoke-direct {v1, v12, v6, v10, v14}, Lj6/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 791
    .line 792
    .line 793
    move-object/from16 v2, v31

    .line 794
    .line 795
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 796
    .line 797
    .line 798
    move-object v4, v2

    .line 799
    move-object/from16 v1, v17

    .line 800
    .line 801
    move-object/from16 v2, v18

    .line 802
    .line 803
    const/16 v5, 0xa

    .line 804
    .line 805
    const/4 v10, 0x1

    .line 806
    goto/16 :goto_5

    .line 807
    .line 808
    :cond_1e
    move-object v2, v4

    .line 809
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->Q()Lj6/p;

    .line 810
    .line 811
    .line 812
    move-result-object v1

    .line 813
    invoke-virtual {v1, v7, v2, v8}, Lj6/p;->a(ZLjava/util/List;Z)Lj6/p;

    .line 814
    .line 815
    .line 816
    move-result-object v1

    .line 817
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->U(Lj6/p;)V

    .line 818
    .line 819
    .line 820
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 821
    .line 822
    return-object v1
.end method

.method public final b0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$getQuestionCommitMap$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$getQuestionCommitMap$2;-><init>(Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;Lkotlin/coroutines/Continuation;)V

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

.method public s(J)V
    .locals 9

    .line 1
    invoke-super {p0, p1, p2}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->s(J)V

    .line 2
    .line 3
    .line 4
    new-instance v6, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$initData$1;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-direct {v6, p0, p1}, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel$initData$1;-><init>(Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;Lkotlin/coroutines/Continuation;)V

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
    const/4 v5, 0x0

    .line 18
    move-object v0, p0

    .line 19
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

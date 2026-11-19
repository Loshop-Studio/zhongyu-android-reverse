.class public final Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;
.super Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0016\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001e\u0010\u0011\u001a\u00020\u00102\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;",
        "Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;",
        "Lp5/j;",
        "service",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "userInfo",
        "Lcom/zykj/evaluation/submit/SubmitTaskManger;",
        "submitTaskManger",
        "<init>",
        "(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/submit/SubmitTaskManger;)V",
        "Lcom/zykj/evaluation/bean/GuideTaskInfo;",
        "Lcom/zykj/evaluation/bean/GuideNormalQuestion;",
        "S",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "guideTaskInfo",
        "",
        "Y",
        "(Lcom/zykj/evaluation/bean/GuideTaskInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "whenShowState",
        "",
        "M",
        "(I)Z",
        "c0",
        "()V",
        "r",
        "Lp5/j;",
        "s",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "t",
        "Lcom/zykj/evaluation/submit/SubmitTaskManger;",
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
        "SMAP\nToCorrectSelfGuideViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToCorrectSelfGuideViewModel.kt\ncom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1563#2:125\n1634#2,2:126\n1563#2:128\n1634#2,2:129\n1636#2:132\n1636#2:133\n1#3:131\n*S KotlinDebug\n*F\n+ 1 ToCorrectSelfGuideViewModel.kt\ncom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel\n*L\n57#1:125\n57#1:126,2\n70#1:128\n70#1:129,2\n70#1:132\n57#1:133\n*E\n"
    }
.end annotation


# instance fields
.field public final r:Lp5/j;

.field public final s:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final t:Lcom/zykj/evaluation/submit/SubmitTaskManger;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/submit/SubmitTaskManger;)V
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
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;-><init>(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/submit/SubmitTaskManger;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;->r:Lp5/j;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;->s:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;->t:Lcom/zykj/evaluation/submit/SubmitTaskManger;

    .line 24
    .line 25
    const/4 p1, 0x3

    .line 26
    new-array p1, p1, [Lj6/q;

    .line 27
    .line 28
    sget-object p2, Lj6/q$g;->e:Lj6/q$g;

    .line 29
    .line 30
    const/4 p3, 0x0

    .line 31
    aput-object p2, p1, p3

    .line 32
    .line 33
    sget-object p2, Lj6/q$j;->e:Lj6/q$j;

    .line 34
    .line 35
    const/4 p3, 0x1

    .line 36
    aput-object p2, p1, p3

    .line 37
    .line 38
    sget-object p2, Lj6/q$b;->e:Lj6/q$b;

    .line 39
    .line 40
    const/4 p3, 0x2

    .line 41
    aput-object p2, p1, p3

    .line 42
    .line 43
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->V(Ljava/util/List;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static final synthetic Z(Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;)Lcom/zykj/evaluation/bean/GuideTaskInfo;
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

.method public static final synthetic a0(Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;)Lcom/zykj/evaluation/submit/SubmitTaskManger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;->t:Lcom/zykj/evaluation/submit/SubmitTaskManger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b0(Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;->s:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public M(I)Z
    .locals 2

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
    filled-new-array {v0, v1}, [Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1
.end method

.method public S(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel$getTaskInfo$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel$getTaskInfo$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel$getTaskInfo$1;->c:I

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
    iput v1, v0, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel$getTaskInfo$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel$getTaskInfo$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel$getTaskInfo$1;-><init>(Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel$getTaskInfo$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel$getTaskInfo$1;->c:I

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
    iget-object p1, p0, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;->r:Lp5/j;

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->q()J

    .line 56
    .line 57
    .line 58
    move-result-wide v4

    .line 59
    iput v3, v0, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel$getTaskInfo$1;->c:I

    .line 60
    .line 61
    invoke-interface {p1, v4, v5, v0}, Lp5/j;->v(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    .locals 25

    .line 1
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getGroups()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Ljava/util/ArrayList;

    .line 6
    .line 7
    const/16 v1, 0xa

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v2, 0x1

    .line 21
    move v4, v2

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_8

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    check-cast v5, Lcom/zykj/evaluation/bean/GuideGroup;

    .line 33
    .line 34
    sget-object v6, Lcom/zykj/evaluation/bean/constant/WhenShowState$ToDo;->INSTANCE:Lcom/zykj/evaluation/bean/constant/WhenShowState$ToDo;

    .line 35
    .line 36
    invoke-virtual {v6}, Lcom/zykj/evaluation/bean/constant/WhenShowState;->getState()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    sget-object v7, Lcom/zykj/evaluation/bean/constant/WhenShowState$Correcting;->INSTANCE:Lcom/zykj/evaluation/bean/constant/WhenShowState$Correcting;

    .line 45
    .line 46
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/constant/WhenShowState;->getState()I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    sget-object v8, Lcom/zykj/evaluation/bean/constant/WhenShowState$ToCorrect;->INSTANCE:Lcom/zykj/evaluation/bean/constant/WhenShowState$ToCorrect;

    .line 55
    .line 56
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/constant/WhenShowState;->getState()I

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    filled-new-array {v6, v7, v8}, [Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getWhenShowMicroLesson()I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-interface {v6, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/GuideGroup;->getTitle()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/GuideGroup;->getQstCount()I

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getEnableScore()Z

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    if-eqz v9, :cond_0

    .line 97
    .line 98
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/GuideGroup;->getScore()D

    .line 99
    .line 100
    .line 101
    move-result-wide v9

    .line 102
    new-instance v11, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    const-string v12, "\uff0c\u5171"

    .line 108
    .line 109
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v11, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v9, "\u5206\uff09"

    .line 116
    .line 117
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    goto :goto_1

    .line 125
    :cond_0
    const-string v9, "\uff09"

    .line 126
    .line 127
    :goto_1
    new-instance v10, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 130
    .line 131
    .line 132
    const-string v11, "\uff08\u5171"

    .line 133
    .line 134
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v8, "\u9898"

    .line 141
    .line 142
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/GuideGroup;->getDescription()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    const-string v10, ""

    .line 157
    .line 158
    if-nez v9, :cond_1

    .line 159
    .line 160
    move-object v9, v10

    .line 161
    :cond_1
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/GuideGroup;->getQuestions()Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    new-instance v11, Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-static {v5, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 168
    .line 169
    .line 170
    move-result v12

    .line 171
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 172
    .line 173
    .line 174
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v12

    .line 182
    if-eqz v12, :cond_7

    .line 183
    .line 184
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v12

    .line 188
    check-cast v12, Lcom/zykj/evaluation/bean/GuideNormalQuestion;

    .line 189
    .line 190
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/GuideNormalQuestion;->getState()I

    .line 191
    .line 192
    .line 193
    move-result v13

    .line 194
    sget-object v14, Lcom/zykj/evaluation/bean/constant/QuestionStateEnum;->ERROR:Lcom/zykj/evaluation/bean/constant/QuestionStateEnum;

    .line 195
    .line 196
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 197
    .line 198
    .line 199
    move-result v14

    .line 200
    const/4 v15, 0x0

    .line 201
    if-ne v13, v14, :cond_2

    .line 202
    .line 203
    sget-object v13, Lj6/q$b;->e:Lj6/q$b;

    .line 204
    .line 205
    :goto_3
    move-object/from16 v19, v13

    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_2
    sget-object v14, Lcom/zykj/evaluation/bean/constant/QuestionStateEnum;->RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionStateEnum;

    .line 209
    .line 210
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 211
    .line 212
    .line 213
    move-result v14

    .line 214
    if-ne v13, v14, :cond_3

    .line 215
    .line 216
    sget-object v13, Lj6/q$j;->e:Lj6/q$j;

    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_3
    sget-object v14, Lcom/zykj/evaluation/bean/constant/QuestionStateEnum;->REVISING_RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionStateEnum;

    .line 220
    .line 221
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 222
    .line 223
    .line 224
    move-result v14

    .line 225
    if-ne v13, v14, :cond_4

    .line 226
    .line 227
    sget-object v13, Lj6/q$b;->e:Lj6/q$b;

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_4
    sget-object v13, Lj6/q$g;->e:Lj6/q$g;

    .line 231
    .line 232
    move-object/from16 v19, v13

    .line 233
    .line 234
    move v2, v15

    .line 235
    :goto_4
    new-instance v16, Lj6/h;

    .line 236
    .line 237
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getId()J

    .line 238
    .line 239
    .line 240
    move-result-wide v17

    .line 241
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getTitle()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v20

    .line 245
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getAskForHelp()Z

    .line 246
    .line 247
    .line 248
    move-result v21

    .line 249
    if-eqz v6, :cond_5

    .line 250
    .line 251
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/GuideNormalQuestion;->getHasMicroClass()Z

    .line 252
    .line 253
    .line 254
    move-result v13

    .line 255
    if-eqz v13, :cond_5

    .line 256
    .line 257
    move/from16 v22, v4

    .line 258
    .line 259
    goto :goto_5

    .line 260
    :cond_5
    move/from16 v22, v15

    .line 261
    .line 262
    :goto_5
    new-instance v13, Landroidx/compose/ui/text/AnnotatedString;

    .line 263
    .line 264
    const/4 v14, 0x2

    .line 265
    const/4 v15, 0x0

    .line 266
    invoke-direct {v13, v10, v15, v14, v15}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getEnableScore()Z

    .line 270
    .line 271
    .line 272
    move-result v14

    .line 273
    if-eqz v14, :cond_6

    .line 274
    .line 275
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getScore()D

    .line 276
    .line 277
    .line 278
    move-result-wide v14

    .line 279
    new-instance v12, Ljava/lang/StringBuilder;

    .line 280
    .line 281
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12, v14, v15}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    const-string v14, "\u5206"

    .line 288
    .line 289
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v12

    .line 296
    move-object/from16 v24, v12

    .line 297
    .line 298
    :goto_6
    move-object/from16 v23, v13

    .line 299
    .line 300
    goto :goto_7

    .line 301
    :cond_6
    move-object/from16 v24, v10

    .line 302
    .line 303
    goto :goto_6

    .line 304
    :goto_7
    invoke-direct/range {v16 .. v24}, Lj6/h;-><init>(JLj6/q;Ljava/lang/String;ZZLandroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    move-object/from16 v12, v16

    .line 308
    .line 309
    invoke-interface {v11, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    goto/16 :goto_2

    .line 313
    .line 314
    :cond_7
    new-instance v5, Lj6/c;

    .line 315
    .line 316
    invoke-direct {v5, v7, v8, v9, v11}, Lj6/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 317
    .line 318
    .line 319
    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    goto/16 :goto_0

    .line 323
    .line 324
    :cond_8
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->Q()Lj6/p;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    const/4 v5, 0x4

    .line 329
    const/4 v6, 0x0

    .line 330
    const/4 v4, 0x0

    .line 331
    invoke-static/range {v1 .. v6}, Lj6/p;->b(Lj6/p;ZLjava/util/List;ZILjava/lang/Object;)Lj6/p;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    move-object/from16 v1, p0

    .line 336
    .line 337
    invoke-virtual {v1, v0}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->U(Lj6/p;)V

    .line 338
    .line 339
    .line 340
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 341
    .line 342
    return-object v0
.end method

.method public final c0()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel$submitCorrectSelfTasK$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel$submitCorrectSelfTasK$1;-><init>(Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Lkotlin/coroutines/Continuation;)V

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

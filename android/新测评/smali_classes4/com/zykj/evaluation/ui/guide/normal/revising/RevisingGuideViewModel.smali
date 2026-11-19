.class public final Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;
.super Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0016\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001e\u0010\u0011\u001a\u00020\u00102\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;",
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
        "SMAP\nRevisingGuideViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RevisingGuideViewModel.kt\ncom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1563#2:116\n1634#2,2:117\n1563#2:119\n1634#2,3:120\n1636#2:123\n*S KotlinDebug\n*F\n+ 1 RevisingGuideViewModel.kt\ncom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel\n*L\n47#1:116\n47#1:117,2\n61#1:119\n61#1:120,3\n47#1:123\n*E\n"
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
    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;->r:Lp5/j;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;->s:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;->t:Lcom/zykj/evaluation/submit/SubmitTaskManger;

    .line 24
    .line 25
    const/4 p1, 0x3

    .line 26
    new-array p1, p1, [Lj6/q;

    .line 27
    .line 28
    sget-object p2, Lj6/q$f;->e:Lj6/q$f;

    .line 29
    .line 30
    const/4 p3, 0x0

    .line 31
    aput-object p2, p1, p3

    .line 32
    .line 33
    sget-object p2, Lj6/q$d;->e:Lj6/q$d;

    .line 34
    .line 35
    const/4 p3, 0x1

    .line 36
    aput-object p2, p1, p3

    .line 37
    .line 38
    sget-object p2, Lj6/q$i;->e:Lj6/q$i;

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
    instance-of v0, p1, Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel$getTaskInfo$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel$getTaskInfo$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel$getTaskInfo$1;->c:I

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
    iput v1, v0, Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel$getTaskInfo$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel$getTaskInfo$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel$getTaskInfo$1;-><init>(Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel$getTaskInfo$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel$getTaskInfo$1;->c:I

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
    iget-object p1, p0, Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;->r:Lp5/j;

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->q()J

    .line 56
    .line 57
    .line 58
    move-result-wide v4

    .line 59
    iput v3, v0, Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel$getTaskInfo$1;->c:I

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
    .locals 46

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
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_8

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lcom/zykj/evaluation/bean/GuideGroup;

    .line 31
    .line 32
    sget-object v4, Lcom/zykj/evaluation/bean/constant/WhenShowState$ToDo;->INSTANCE:Lcom/zykj/evaluation/bean/constant/WhenShowState$ToDo;

    .line 33
    .line 34
    invoke-virtual {v4}, Lcom/zykj/evaluation/bean/constant/WhenShowState;->getState()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    sget-object v5, Lcom/zykj/evaluation/bean/constant/WhenShowState$Correcting;->INSTANCE:Lcom/zykj/evaluation/bean/constant/WhenShowState$Correcting;

    .line 43
    .line 44
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/constant/WhenShowState;->getState()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    sget-object v6, Lcom/zykj/evaluation/bean/constant/WhenShowState$ToCorrect;->INSTANCE:Lcom/zykj/evaluation/bean/constant/WhenShowState$ToCorrect;

    .line 53
    .line 54
    invoke-virtual {v6}, Lcom/zykj/evaluation/bean/constant/WhenShowState;->getState()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    filled-new-array {v4, v5, v6}, [Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getWhenShowMicroLesson()I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/GuideGroup;->getTitle()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/GuideGroup;->getQstCount()I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getEnableScore()Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-eqz v7, :cond_0

    .line 95
    .line 96
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/GuideGroup;->getScore()D

    .line 97
    .line 98
    .line 99
    move-result-wide v7

    .line 100
    new-instance v9, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    const-string v10, "\uff0c\u5171"

    .line 106
    .line 107
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v7, "\u5206\uff09"

    .line 114
    .line 115
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    goto :goto_1

    .line 123
    :cond_0
    const-string v7, "\uff09"

    .line 124
    .line 125
    :goto_1
    new-instance v8, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    const-string v9, "\uff08\u5171"

    .line 131
    .line 132
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string v6, "\u9898"

    .line 139
    .line 140
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/GuideGroup;->getDescription()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    const-string v8, ""

    .line 155
    .line 156
    if-nez v7, :cond_1

    .line 157
    .line 158
    move-object v7, v8

    .line 159
    :cond_1
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/GuideGroup;->getQuestions()Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    new-instance v9, Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 166
    .line 167
    .line 168
    move-result v10

    .line 169
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 170
    .line 171
    .line 172
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v10

    .line 180
    if-eqz v10, :cond_7

    .line 181
    .line 182
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v10

    .line 186
    check-cast v10, Lcom/zykj/evaluation/bean/GuideNormalQuestion;

    .line 187
    .line 188
    invoke-virtual {v10}, Lcom/zykj/evaluation/bean/GuideNormalQuestion;->getNeedRevise()Z

    .line 189
    .line 190
    .line 191
    move-result v11

    .line 192
    if-eqz v11, :cond_3

    .line 193
    .line 194
    invoke-virtual {v10}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getCompleted()Z

    .line 195
    .line 196
    .line 197
    move-result v11

    .line 198
    if-eqz v11, :cond_2

    .line 199
    .line 200
    sget-object v11, Lj6/q$d;->e:Lj6/q$d;

    .line 201
    .line 202
    :goto_3
    move-object v15, v11

    .line 203
    goto :goto_4

    .line 204
    :cond_2
    sget-object v11, Lj6/q$f;->e:Lj6/q$f;

    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_3
    sget-object v11, Lj6/q$i;->e:Lj6/q$i;

    .line 208
    .line 209
    goto :goto_3

    .line 210
    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getEnableScore()Z

    .line 211
    .line 212
    .line 213
    move-result v11

    .line 214
    const-string v12, "\u5206"

    .line 215
    .line 216
    const-string v13, "/"

    .line 217
    .line 218
    if-eqz v11, :cond_4

    .line 219
    .line 220
    invoke-virtual {v10}, Lcom/zykj/evaluation/bean/GuideNormalQuestion;->getOriginScore()Ljava/lang/Double;

    .line 221
    .line 222
    .line 223
    move-result-object v11

    .line 224
    if-eqz v11, :cond_4

    .line 225
    .line 226
    invoke-virtual {v10}, Lcom/zykj/evaluation/bean/GuideNormalQuestion;->getOriginScore()Ljava/lang/Double;

    .line 227
    .line 228
    .line 229
    move-result-object v11

    .line 230
    move-object/from16 v21, v2

    .line 231
    .line 232
    invoke-virtual {v10}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getScore()D

    .line 233
    .line 234
    .line 235
    move-result-wide v1

    .line 236
    new-instance v14, Ljava/lang/StringBuilder;

    .line 237
    .line 238
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v14, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    goto :goto_5

    .line 258
    :cond_4
    move-object/from16 v21, v2

    .line 259
    .line 260
    move-object v1, v8

    .line 261
    :goto_5
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getEnableScore()Z

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    if-eqz v2, :cond_5

    .line 266
    .line 267
    move-object v2, v10

    .line 268
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getMyScore()D

    .line 269
    .line 270
    .line 271
    move-result-wide v10

    .line 272
    move-object/from16 v16, v15

    .line 273
    .line 274
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getScore()D

    .line 275
    .line 276
    .line 277
    move-result-wide v14

    .line 278
    move-object/from16 v22, v0

    .line 279
    .line 280
    new-instance v0, Ljava/lang/StringBuilder;

    .line 281
    .line 282
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0, v14, v15}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    move-object/from16 v20, v0

    .line 302
    .line 303
    goto :goto_6

    .line 304
    :cond_5
    move-object/from16 v22, v0

    .line 305
    .line 306
    move-object v2, v10

    .line 307
    move-object/from16 v16, v15

    .line 308
    .line 309
    move-object/from16 v20, v8

    .line 310
    .line 311
    :goto_6
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getId()J

    .line 312
    .line 313
    .line 314
    move-result-wide v13

    .line 315
    move-object/from16 v15, v16

    .line 316
    .line 317
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getTitle()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v16

    .line 321
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getAskForHelp()Z

    .line 322
    .line 323
    .line 324
    move-result v17

    .line 325
    const/4 v0, 0x0

    .line 326
    if-eqz v4, :cond_6

    .line 327
    .line 328
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/GuideNormalQuestion;->getHasMicroClass()Z

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    if-eqz v2, :cond_6

    .line 333
    .line 334
    const/4 v2, 0x1

    .line 335
    move/from16 v18, v2

    .line 336
    .line 337
    goto :goto_7

    .line 338
    :cond_6
    move/from16 v18, v0

    .line 339
    .line 340
    :goto_7
    new-instance v2, Landroidx/compose/ui/text/AnnotatedString$Builder;

    .line 341
    .line 342
    invoke-direct {v2, v1}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    new-instance v23, Landroidx/compose/ui/text/SpanStyle;

    .line 346
    .line 347
    sget-object v1, Landroidx/compose/ui/text/style/TextDecoration;->Companion:Landroidx/compose/ui/text/style/TextDecoration$Companion;

    .line 348
    .line 349
    invoke-virtual {v1}, Landroidx/compose/ui/text/style/TextDecoration$Companion;->getLineThrough()Landroidx/compose/ui/text/style/TextDecoration;

    .line 350
    .line 351
    .line 352
    move-result-object v40

    .line 353
    const v44, 0xefff

    .line 354
    .line 355
    .line 356
    const/16 v45, 0x0

    .line 357
    .line 358
    const-wide/16 v24, 0x0

    .line 359
    .line 360
    const-wide/16 v26, 0x0

    .line 361
    .line 362
    const/16 v28, 0x0

    .line 363
    .line 364
    const/16 v29, 0x0

    .line 365
    .line 366
    const/16 v30, 0x0

    .line 367
    .line 368
    const/16 v31, 0x0

    .line 369
    .line 370
    const/16 v32, 0x0

    .line 371
    .line 372
    const-wide/16 v33, 0x0

    .line 373
    .line 374
    const/16 v35, 0x0

    .line 375
    .line 376
    const/16 v36, 0x0

    .line 377
    .line 378
    const/16 v37, 0x0

    .line 379
    .line 380
    const-wide/16 v38, 0x0

    .line 381
    .line 382
    const/16 v41, 0x0

    .line 383
    .line 384
    const/16 v42, 0x0

    .line 385
    .line 386
    const/16 v43, 0x0

    .line 387
    .line 388
    invoke-direct/range {v23 .. v45}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 389
    .line 390
    .line 391
    move-object/from16 v1, v23

    .line 392
    .line 393
    invoke-virtual {v2}, Landroidx/compose/ui/text/AnnotatedString$Builder;->getLength()I

    .line 394
    .line 395
    .line 396
    move-result v10

    .line 397
    invoke-virtual {v2, v1, v0, v10}, Landroidx/compose/ui/text/AnnotatedString$Builder;->addStyle(Landroidx/compose/ui/text/SpanStyle;II)V

    .line 398
    .line 399
    .line 400
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 401
    .line 402
    invoke-virtual {v2}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    .line 403
    .line 404
    .line 405
    move-result-object v19

    .line 406
    new-instance v12, Lj6/h;

    .line 407
    .line 408
    invoke-direct/range {v12 .. v20}, Lj6/h;-><init>(JLj6/q;Ljava/lang/String;ZZLandroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    invoke-interface {v9, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-object/from16 v2, v21

    .line 415
    .line 416
    move-object/from16 v0, v22

    .line 417
    .line 418
    const/16 v1, 0xa

    .line 419
    .line 420
    goto/16 :goto_2

    .line 421
    .line 422
    :cond_7
    move-object/from16 v22, v0

    .line 423
    .line 424
    new-instance v0, Lj6/c;

    .line 425
    .line 426
    invoke-direct {v0, v5, v6, v7, v9}, Lj6/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 427
    .line 428
    .line 429
    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-object/from16 v0, v22

    .line 433
    .line 434
    const/16 v1, 0xa

    .line 435
    .line 436
    goto/16 :goto_0

    .line 437
    .line 438
    :cond_8
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->Q()Lj6/p;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    const/4 v5, 0x5

    .line 443
    const/4 v6, 0x0

    .line 444
    const/4 v2, 0x0

    .line 445
    const/4 v4, 0x0

    .line 446
    invoke-static/range {v1 .. v6}, Lj6/p;->b(Lj6/p;ZLjava/util/List;ZILjava/lang/Object;)Lj6/p;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    move-object/from16 v1, p0

    .line 451
    .line 452
    invoke-virtual {v1, v0}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->U(Lj6/p;)V

    .line 453
    .line 454
    .line 455
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 456
    .line 457
    return-object v0
.end method

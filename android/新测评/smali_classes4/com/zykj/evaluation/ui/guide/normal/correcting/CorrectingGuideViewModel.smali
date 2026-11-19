.class public final Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;
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
        "Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;",
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
        "SMAP\nCorrectingGuideViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CorrectingGuideViewModel.kt\ncom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n1563#2:78\n1634#2,2:79\n1563#2:81\n1634#2,3:82\n1636#2:85\n*S KotlinDebug\n*F\n+ 1 CorrectingGuideViewModel.kt\ncom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel\n*L\n45#1:78\n45#1:79,2\n53#1:81\n53#1:82,3\n45#1:85\n*E\n"
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
    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;->r:Lp5/j;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;->s:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;->t:Lcom/zykj/evaluation/submit/SubmitTaskManger;

    .line 24
    .line 25
    const/4 p1, 0x2

    .line 26
    new-array p1, p1, [Lj6/q;

    .line 27
    .line 28
    sget-object p2, Lj6/q$h;->e:Lj6/q$h;

    .line 29
    .line 30
    const/4 p3, 0x0

    .line 31
    aput-object p2, p1, p3

    .line 32
    .line 33
    sget-object p2, Lj6/q$e;->e:Lj6/q$e;

    .line 34
    .line 35
    const/4 p3, 0x1

    .line 36
    aput-object p2, p1, p3

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->V(Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    return-void
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
    instance-of v0, p1, Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel$getTaskInfo$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel$getTaskInfo$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel$getTaskInfo$1;->c:I

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
    iput v1, v0, Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel$getTaskInfo$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel$getTaskInfo$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel$getTaskInfo$1;-><init>(Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel$getTaskInfo$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel$getTaskInfo$1;->c:I

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
    iget-object p1, p0, Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;->r:Lp5/j;

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->q()J

    .line 56
    .line 57
    .line 58
    move-result-wide v4

    .line 59
    iput v3, v0, Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel$getTaskInfo$1;->c:I

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
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getGroups()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v4, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/16 v2, 0xa

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_6

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lcom/zykj/evaluation/bean/GuideGroup;

    .line 33
    .line 34
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getWhenShowMicroLesson()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-virtual {v0, v5}, Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;->M(I)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/GuideGroup;->getTitle()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/GuideGroup;->getQstCount()I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getEnableScore()Z

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    if-eqz v8, :cond_0

    .line 55
    .line 56
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/GuideGroup;->getScore()D

    .line 57
    .line 58
    .line 59
    move-result-wide v8

    .line 60
    new-instance v10, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v11, "\uff0c\u5171"

    .line 66
    .line 67
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v8, "\u5206\uff09"

    .line 74
    .line 75
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    goto :goto_1

    .line 83
    :cond_0
    const-string v8, "\uff09"

    .line 84
    .line 85
    :goto_1
    new-instance v9, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    const-string v10, "\uff08\u5171"

    .line 91
    .line 92
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v7, "\u9898"

    .line 99
    .line 100
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/GuideGroup;->getDescription()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    const-string v9, ""

    .line 115
    .line 116
    if-nez v8, :cond_1

    .line 117
    .line 118
    move-object v8, v9

    .line 119
    :cond_1
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/GuideGroup;->getQuestions()Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    new-instance v10, Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-static {v3, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 126
    .line 127
    .line 128
    move-result v11

    .line 129
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    if-eqz v11, :cond_5

    .line 141
    .line 142
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v11

    .line 146
    check-cast v11, Lcom/zykj/evaluation/bean/GuideNormalQuestion;

    .line 147
    .line 148
    new-instance v12, Lj6/h;

    .line 149
    .line 150
    invoke-virtual {v11}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getId()J

    .line 151
    .line 152
    .line 153
    move-result-wide v13

    .line 154
    invoke-virtual {v11}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getCompleted()Z

    .line 155
    .line 156
    .line 157
    move-result v15

    .line 158
    if-eqz v15, :cond_2

    .line 159
    .line 160
    sget-object v15, Lj6/q$e;->e:Lj6/q$e;

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_2
    sget-object v15, Lj6/q$h;->e:Lj6/q$h;

    .line 164
    .line 165
    :goto_3
    invoke-virtual {v11}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getTitle()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v16

    .line 169
    invoke-virtual {v11}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getAskForHelp()Z

    .line 170
    .line 171
    .line 172
    move-result v17

    .line 173
    if-eqz v5, :cond_3

    .line 174
    .line 175
    invoke-virtual {v11}, Lcom/zykj/evaluation/bean/GuideNormalQuestion;->getHasMicroClass()Z

    .line 176
    .line 177
    .line 178
    move-result v18

    .line 179
    if-eqz v18, :cond_3

    .line 180
    .line 181
    const/16 v18, 0x1

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_3
    const/16 v18, 0x0

    .line 185
    .line 186
    :goto_4
    new-instance v2, Landroidx/compose/ui/text/AnnotatedString;

    .line 187
    .line 188
    move-object/from16 v21, v1

    .line 189
    .line 190
    const/4 v1, 0x2

    .line 191
    move-object/from16 v22, v3

    .line 192
    .line 193
    const/4 v3, 0x0

    .line 194
    invoke-direct {v2, v9, v3, v1, v3}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getEnableScore()Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    move-object/from16 v19, v2

    .line 202
    .line 203
    if-eqz v1, :cond_4

    .line 204
    .line 205
    invoke-virtual {v11}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getScore()D

    .line 206
    .line 207
    .line 208
    move-result-wide v1

    .line 209
    new-instance v3, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    const-string v1, "\u5206"

    .line 218
    .line 219
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    move-object/from16 v20, v1

    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_4
    move-object/from16 v20, v9

    .line 230
    .line 231
    :goto_5
    invoke-direct/range {v12 .. v20}, Lj6/h;-><init>(JLj6/q;Ljava/lang/String;ZZLandroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-interface {v10, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-object/from16 v1, v21

    .line 238
    .line 239
    move-object/from16 v3, v22

    .line 240
    .line 241
    const/16 v2, 0xa

    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_5
    move-object/from16 v21, v1

    .line 245
    .line 246
    new-instance v1, Lj6/c;

    .line 247
    .line 248
    invoke-direct {v1, v6, v7, v8, v10}, Lj6/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 249
    .line 250
    .line 251
    invoke-interface {v4, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-object/from16 v1, v21

    .line 255
    .line 256
    const/16 v2, 0xa

    .line 257
    .line 258
    goto/16 :goto_0

    .line 259
    .line 260
    :cond_6
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->Q()Lj6/p;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    const/4 v6, 0x5

    .line 265
    const/4 v7, 0x0

    .line 266
    const/4 v3, 0x0

    .line 267
    const/4 v5, 0x0

    .line 268
    invoke-static/range {v2 .. v7}, Lj6/p;->b(Lj6/p;ZLjava/util/List;ZILjava/lang/Object;)Lj6/p;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->U(Lj6/p;)V

    .line 273
    .line 274
    .line 275
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 276
    .line 277
    return-object v1
.end method

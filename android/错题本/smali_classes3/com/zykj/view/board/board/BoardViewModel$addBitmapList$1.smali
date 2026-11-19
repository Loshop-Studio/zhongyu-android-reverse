.class final Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardViewModel;->addBitmapList(Ljava/util/List;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.view.board.board.BoardViewModel$addBitmapList$1"
    f = "BoardViewModel.kt"
    i = {
        0x0
    }
    l = {
        0x4ea
    }
    m = "invokeSuspend"
    n = {
        "$this$launch"
    }
    s = {
        "L$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBoardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$addBitmapList$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1494:1\n226#2,5:1495\n*S KotlinDebug\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$addBitmapList$1\n*L\n1277#1:1495,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $isSelected:Z

.field final synthetic $pathList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/zykj/view/board/board/BoardViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;Ljava/util/List;ZLh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/board/board/BoardViewModel;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Lh6/c<",
            "-",
            "Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->$pathList:Ljava/util/List;

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->$isSelected:Z

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->$pathList:Ljava/util/List;

    .line 6
    .line 7
    iget-boolean v3, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->$isSelected:Z

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Ljava/util/List;ZLh6/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/v;

    .line 4
    .line 5
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 6
    .line 7
    iget v2, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->label:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    if-ne v2, v4, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->getLoadFinished()Lkotlinx/coroutines/flow/m0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance v2, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1$1;

    .line 37
    .line 38
    invoke-direct {v2, v3}, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1$1;-><init>(Lh6/c;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->L$0:Ljava/lang/Object;

    .line 42
    .line 43
    iput v4, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->label:I

    .line 44
    .line 45
    invoke-static {p1, v2, p0}, Lkotlinx/coroutines/flow/h;->j(Lkotlinx/coroutines/flow/f;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-ne p1, v1, :cond_2

    .line 50
    .line 51
    return-object v1

    .line 52
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 53
    .line 54
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardViewModel;->access$getPageControl(Lcom/zykj/view/board/board/BoardViewModel;)Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 59
    .line 60
    if-nez p1, :cond_3

    .line 61
    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :cond_3
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->isImageOutOfCount()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    const/4 v2, 0x0

    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    const-string p1, "\u56fe\u7247\u6570\u91cf\u5df2\u8fbe\u4e0a\u9650\uff0c\u4e0d\u53ef\u7ee7\u7eed\u63d2\u5165"

    .line 74
    .line 75
    new-array v0, v2, [Ljava/lang/Object;

    .line 76
    .line 77
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_4
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->$pathList:Ljava/util/List;

    .line 82
    .line 83
    :try_start_0
    sget-object v4, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->CENTER:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    .line 84
    .line 85
    sget-object v5, Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;->MODE_ADAPTER_8:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    .line 86
    .line 87
    invoke-interface {p1, v0, v4, v5}, Lcom/zykj/blackboard/core/edit/IPageControl;->addImageList(Ljava/util/List;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    goto :goto_1

    .line 96
    :catchall_0
    move-exception v0

    .line 97
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    if-eqz v4, :cond_5

    .line 110
    .line 111
    const-string v4, "\u56fe\u7247\u6570\u91cf\u8d85\u8fc7\u4e0a\u9650"

    .line 112
    .line 113
    new-array v2, v2, [Ljava/lang/Object;

    .line 114
    .line 115
    invoke-static {v4, v2}, Lcom/blankj/utilcode/util/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_5
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-eqz v2, :cond_6

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_6
    move-object v3, v0

    .line 126
    :goto_2
    check-cast v3, Ljava/util/List;

    .line 127
    .line 128
    if-eqz v3, :cond_8

    .line 129
    .line 130
    iget-boolean v0, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->$isSelected:Z

    .line 131
    .line 132
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardViewModel$addBitmapList$1;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 133
    .line 134
    if-eqz v0, :cond_8

    .line 135
    .line 136
    invoke-static {v2}, Lcom/zykj/view/board/board/BoardViewModel;->access$get_mainToolState$p(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlinx/coroutines/flow/y;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    :cond_7
    move-object v2, v0

    .line 141
    check-cast v2, Lkotlinx/coroutines/flow/n0;

    .line 142
    .line 143
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    move-object v5, v4

    .line 148
    check-cast v5, Lcom/zykj/view/board/board/MainToolState;

    .line 149
    .line 150
    sget-object v11, Lcom/zykj/view/board/board/MainToolType$Select;->INSTANCE:Lcom/zykj/view/board/board/MainToolType$Select;

    .line 151
    .line 152
    const/16 v12, 0x1f

    .line 153
    .line 154
    const/4 v13, 0x0

    .line 155
    const/4 v6, 0x0

    .line 156
    const/4 v7, 0x0

    .line 157
    const/4 v8, 0x0

    .line 158
    const/4 v9, 0x0

    .line 159
    const/4 v10, 0x0

    .line 160
    invoke-static/range {v5 .. v13}, Lcom/zykj/view/board/board/MainToolState;->copy$default(Lcom/zykj/view/board/board/MainToolState;ZZZZZLcom/zykj/view/board/board/MainToolType;ILjava/lang/Object;)Lcom/zykj/view/board/board/MainToolState;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-virtual {v2, v4, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    if-eqz v2, :cond_7

    .line 169
    .line 170
    invoke-static {v3}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    check-cast v0, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 175
    .line 176
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/graph/Graph;->getId()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v0}, Lkotlin/collections/u;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-interface {p1, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->newSelectGraph(Ljava/util/List;)V

    .line 185
    .line 186
    .line 187
    :cond_8
    :goto_3
    return-object v1
.end method

.class final Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardViewModel;->addImageGraph(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZLjava/lang/String;Lr6/c;)V
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
    c = "com.zykj.view.board.board.BoardViewModel$addImageGraph$1"
    f = "BoardViewModel.kt"
    i = {
        0x0
    }
    l = {
        0x4b7
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
        "SMAP\nBoardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$addImageGraph$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1494:1\n226#2,5:1495\n*S KotlinDebug\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$addImageGraph$1\n*L\n1242#1:1495,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $bitmap:Landroid/graphics/Bitmap;

.field final synthetic $filename:Ljava/lang/String;

.field final synthetic $imagePathCallback:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field final synthetic $isSelected:Z

.field final synthetic $path:Ljava/lang/String;

.field final synthetic $scaleTypeEnum:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/zykj/view/board/board/BoardViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/String;Lr6/c;ZLh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/board/board/BoardViewModel;",
            "Landroid/graphics/Bitmap;",
            "Ljava/lang/String;",
            "Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;",
            "Ljava/lang/String;",
            "Lr6/c;",
            "Z",
            "Lh6/c<",
            "-",
            "Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->$bitmap:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->$filename:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->$scaleTypeEnum:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->$path:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->$imagePathCallback:Lr6/c;

    .line 12
    .line 13
    iput-boolean p7, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->$isSelected:Z

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 9
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
    new-instance v0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->$bitmap:Landroid/graphics/Bitmap;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->$filename:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->$scaleTypeEnum:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->$path:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->$imagePathCallback:Lr6/c;

    .line 14
    .line 15
    iget-boolean v7, p0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->$isSelected:Z

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/String;Lr6/c;ZLh6/c;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->L$0:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->L$0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lkotlinx/coroutines/v;

    .line 6
    .line 7
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 8
    .line 9
    iget v3, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->label:I

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    const/4 v5, 0x0

    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    if-ne v3, v4, :cond_0

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0

    .line 29
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v3, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 33
    .line 34
    invoke-virtual {v3}, Lcom/zykj/view/board/board/BoardViewModel;->getLoadFinished()Lkotlinx/coroutines/flow/m0;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    new-instance v6, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1$1;

    .line 39
    .line 40
    invoke-direct {v6, v5}, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1$1;-><init>(Lh6/c;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    iput v4, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->label:I

    .line 46
    .line 47
    invoke-static {v3, v6, v1}, Lkotlinx/coroutines/flow/h;->j(Lkotlinx/coroutines/flow/f;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-ne v0, v2, :cond_2

    .line 52
    .line 53
    return-object v2

    .line 54
    :cond_2
    :goto_0
    iget-object v0, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 55
    .line 56
    invoke-static {v0}, Lcom/zykj/view/board/board/BoardViewModel;->access$getPageControl(Lcom/zykj/view/board/board/BoardViewModel;)Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    sget-object v2, Ld6/s;->a:Ld6/s;

    .line 61
    .line 62
    if-nez v6, :cond_3

    .line 63
    .line 64
    goto/16 :goto_5

    .line 65
    .line 66
    :cond_3
    iget-object v0, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->isImageOutOfCount()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    const/4 v3, 0x0

    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    const-string v0, "\u56fe\u7247\u6570\u91cf\u5df2\u8fbe\u4e0a\u9650\uff0c\u4e0d\u53ef\u7ee7\u7eed\u63d2\u5165"

    .line 76
    .line 77
    new-array v3, v3, [Ljava/lang/Object;

    .line 78
    .line 79
    invoke-static {v0, v3}, Lcom/blankj/utilcode/util/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-object v2

    .line 83
    :cond_4
    iget-object v7, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->$bitmap:Landroid/graphics/Bitmap;

    .line 84
    .line 85
    iget-object v8, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->$filename:Ljava/lang/String;

    .line 86
    .line 87
    iget-object v9, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->$scaleTypeEnum:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    .line 88
    .line 89
    move-object v0, v7

    .line 90
    iget-object v7, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->$path:Ljava/lang/String;

    .line 91
    .line 92
    if-eqz v0, :cond_5

    .line 93
    .line 94
    move-object v10, v9

    .line 95
    :try_start_0
    sget-object v9, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->CENTER:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    .line 96
    .line 97
    const/16 v13, 0x30

    .line 98
    .line 99
    const/4 v14, 0x0

    .line 100
    const/4 v11, 0x0

    .line 101
    const/4 v12, 0x0

    .line 102
    move-object v7, v0

    .line 103
    invoke-static/range {v6 .. v14}, Lcom/zykj/blackboard/core/edit/IPageControl$DefaultImpls;->addImage$default(Lcom/zykj/blackboard/core/edit/IPageControl;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZZILjava/lang/Object;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    goto :goto_1

    .line 108
    :catchall_0
    move-exception v0

    .line 109
    goto :goto_2

    .line 110
    :cond_5
    move-object v10, v9

    .line 111
    if-eqz v7, :cond_6

    .line 112
    .line 113
    sget-object v8, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->CENTER:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    .line 114
    .line 115
    const/16 v11, 0x8

    .line 116
    .line 117
    const/4 v12, 0x0

    .line 118
    move-object v9, v10

    .line 119
    const/4 v10, 0x0

    .line 120
    invoke-static/range {v6 .. v12}, Lcom/zykj/blackboard/core/edit/IPageControl$DefaultImpls;->addImage$default(Lcom/zykj/blackboard/core/edit/IPageControl;Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZILjava/lang/Object;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    goto :goto_1

    .line 125
    :cond_6
    move-object v0, v5

    .line 126
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    goto :goto_3

    .line 131
    :goto_2
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    :goto_3
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    if-eqz v4, :cond_7

    .line 144
    .line 145
    const-string v4, "\u56fe\u7247\u6570\u91cf\u8d85\u8fc7\u4e0a\u9650"

    .line 146
    .line 147
    new-array v3, v3, [Ljava/lang/Object;

    .line 148
    .line 149
    invoke-static {v4, v3}, Lcom/blankj/utilcode/util/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :cond_7
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    if-eqz v3, :cond_8

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_8
    move-object v5, v0

    .line 160
    :goto_4
    check-cast v5, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 161
    .line 162
    if-eqz v5, :cond_b

    .line 163
    .line 164
    iget-object v0, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->$imagePathCallback:Lr6/c;

    .line 165
    .line 166
    iget-boolean v3, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->$isSelected:Z

    .line 167
    .line 168
    iget-object v4, v1, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 169
    .line 170
    if-eqz v0, :cond_9

    .line 171
    .line 172
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/graph/group/FileGraph;->getFilePath()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    invoke-interface {v0, v7}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    :cond_9
    if-eqz v3, :cond_b

    .line 180
    .line 181
    invoke-static {v4}, Lcom/zykj/view/board/board/BoardViewModel;->access$get_mainToolState$p(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlinx/coroutines/flow/y;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    :cond_a
    move-object v3, v0

    .line 186
    check-cast v3, Lkotlinx/coroutines/flow/n0;

    .line 187
    .line 188
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    move-object v7, v4

    .line 193
    check-cast v7, Lcom/zykj/view/board/board/MainToolState;

    .line 194
    .line 195
    sget-object v13, Lcom/zykj/view/board/board/MainToolType$Select;->INSTANCE:Lcom/zykj/view/board/board/MainToolType$Select;

    .line 196
    .line 197
    const/16 v14, 0x1f

    .line 198
    .line 199
    const/4 v15, 0x0

    .line 200
    const/4 v8, 0x0

    .line 201
    const/4 v9, 0x0

    .line 202
    const/4 v10, 0x0

    .line 203
    const/4 v11, 0x0

    .line 204
    const/4 v12, 0x0

    .line 205
    invoke-static/range {v7 .. v15}, Lcom/zykj/view/board/board/MainToolState;->copy$default(Lcom/zykj/view/board/board/MainToolState;ZZZZZLcom/zykj/view/board/board/MainToolType;ILjava/lang/Object;)Lcom/zykj/view/board/board/MainToolState;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    invoke-virtual {v3, v4, v7}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-eqz v3, :cond_a

    .line 214
    .line 215
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/graph/Graph;->getId()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-static {v0}, Lkotlin/collections/u;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-interface {v6, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->newSelectGraph(Ljava/util/List;)V

    .line 224
    .line 225
    .line 226
    :cond_b
    :goto_5
    return-object v2
.end method

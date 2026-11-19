.class final Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->L(Landroid/graphics/Bitmap;IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.evaluation.ui.detail.mistake.MistakeViewModel$saveBitmap$1"
    f = "MistakeViewModel.kt"
    i = {}
    l = {
        0xc8
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,585:1\n230#2,3:586\n233#2,2:594\n1573#3:589\n1604#3,4:590\n*S KotlinDebug\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1\n*L\n217#1:586,3\n217#1:594,2\n219#1:589\n219#1:590,4\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

.field public final synthetic c:I

.field public final synthetic d:Landroid/graphics/Bitmap;

.field public final synthetic e:J


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;ILandroid/graphics/Bitmap;JLkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;->b:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    iput p2, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;->c:I

    iput-object p3, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;->d:Landroid/graphics/Bitmap;

    iput-wide p4, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;->e:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7

    new-instance v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;->b:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    iget v2, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;->c:I

    iget-object v3, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;->d:Landroid/graphics/Bitmap;

    iget-wide v4, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;->e:J

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;-><init>(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;ILandroid/graphics/Bitmap;JLkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;->a:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    move-object/from16 v2, p1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v1

    .line 28
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    new-instance v4, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1$1;

    .line 36
    .line 37
    iget-object v5, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;->b:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    .line 38
    .line 39
    iget v6, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;->c:I

    .line 40
    .line 41
    iget-object v7, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;->d:Landroid/graphics/Bitmap;

    .line 42
    .line 43
    iget-wide v8, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;->e:J

    .line 44
    .line 45
    const/4 v10, 0x0

    .line 46
    invoke-direct/range {v4 .. v10}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1$1;-><init>(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;ILandroid/graphics/Bitmap;JLkotlin/coroutines/Continuation;)V

    .line 47
    .line 48
    .line 49
    iput v3, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;->a:I

    .line 50
    .line 51
    invoke-static {v2, v4, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    if-ne v2, v1, :cond_2

    .line 56
    .line 57
    return-object v1

    .line 58
    :cond_2
    :goto_0
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;->b:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    .line 59
    .line 60
    iget v3, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$saveBitmap$1;->c:I

    .line 61
    .line 62
    move-object v6, v2

    .line 63
    check-cast v6, Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v1}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->u(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    :cond_3
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    move-object v11, v2

    .line 74
    check-cast v11, Lz5/l1;

    .line 75
    .line 76
    invoke-virtual {v11}, Lz5/l1;->j()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    new-instance v13, Ljava/util/ArrayList;

    .line 81
    .line 82
    const/16 v5, 0xa

    .line 83
    .line 84
    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    invoke-direct {v13, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v12

    .line 95
    const/4 v4, 0x0

    .line 96
    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-eqz v5, :cond_6

    .line 101
    .line 102
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    add-int/lit8 v14, v4, 0x1

    .line 107
    .line 108
    if-gez v4, :cond_4

    .line 109
    .line 110
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 111
    .line 112
    .line 113
    :cond_4
    check-cast v5, Lz5/f;

    .line 114
    .line 115
    if-ne v4, v3, :cond_5

    .line 116
    .line 117
    const/4 v9, 0x5

    .line 118
    const/4 v10, 0x0

    .line 119
    move-object v4, v5

    .line 120
    const/4 v5, 0x0

    .line 121
    const/4 v7, 0x0

    .line 122
    const/4 v8, 0x1

    .line 123
    invoke-static/range {v4 .. v10}, Lz5/f;->b(Lz5/f;ZLjava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lz5/f;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    goto :goto_2

    .line 128
    :cond_5
    move-object v4, v5

    .line 129
    :goto_2
    invoke-interface {v13, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move v4, v14

    .line 133
    goto :goto_1

    .line 134
    :cond_6
    const/16 v20, 0x7ef

    .line 135
    .line 136
    const/16 v21, 0x0

    .line 137
    .line 138
    const/4 v8, 0x0

    .line 139
    const-wide/16 v9, 0x0

    .line 140
    .line 141
    move-object v7, v11

    .line 142
    const/4 v11, 0x0

    .line 143
    const/4 v12, 0x0

    .line 144
    const/4 v14, 0x0

    .line 145
    const/4 v15, 0x0

    .line 146
    const/16 v16, 0x0

    .line 147
    .line 148
    const/16 v17, 0x0

    .line 149
    .line 150
    const/16 v18, 0x0

    .line 151
    .line 152
    const/16 v19, 0x0

    .line 153
    .line 154
    invoke-static/range {v7 .. v21}, Lz5/l1;->b(Lz5/l1;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lz5/l1;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-interface {v1, v2, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-eqz v2, :cond_3

    .line 163
    .line 164
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 165
    .line 166
    return-object v1
.end method

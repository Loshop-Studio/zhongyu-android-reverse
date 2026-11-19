.class final Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
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
    c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailRouteKt$MistakeDetailRoute$1$1"
    f = "MistakeDetailRoute.kt"
    i = {}
    l = {
        0x27
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $args:Lu4/g;

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $initializeSession:Z

.field final synthetic $viewModel:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

.field label:I


# direct methods
.method public constructor <init>(ZLandroid/content/Context;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lu4/g;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroid/content/Context;",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;",
            "Lu4/g;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;->$initializeSession:Z

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;->$context:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;->$viewModel:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;->$args:Lu4/g;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 6
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
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;->$initializeSession:Z

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;->$context:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;->$viewModel:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;->$args:Lu4/g;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;-><init>(ZLandroid/content/Context;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lu4/g;Lh6/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;->label:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    if-ne v2, v3, :cond_0

    .line 11
    .line 12
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0

    .line 24
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-boolean v2, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;->$initializeSession:Z

    .line 28
    .line 29
    if-eqz v2, :cond_4

    .line 30
    .line 31
    iget-object v2, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;->$context:Landroid/content/Context;

    .line 32
    .line 33
    iput v3, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;->label:I

    .line 34
    .line 35
    invoke-static {v2, v1}, Lcom/zykj/mistake/utils/d;->b(Landroid/content/Context;Lh6/c;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-ne v2, v0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    :goto_0
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;->$viewModel:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 43
    .line 44
    iget-object v2, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;->$args:Lu4/g;

    .line 45
    .line 46
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/k2;

    .line 47
    .line 48
    iget v4, v2, Lu4/g;->a:I

    .line 49
    .line 50
    iget v5, v2, Lu4/g;->b:I

    .line 51
    .line 52
    iget-wide v6, v2, Lu4/g;->c:J

    .line 53
    .line 54
    iget-object v8, v2, Lu4/g;->d:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v9, v2, Lu4/g;->e:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v10, v2, Lu4/g;->f:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v11, v2, Lu4/g;->g:Ljava/lang/String;

    .line 61
    .line 62
    iget-boolean v12, v2, Lu4/g;->h:Z

    .line 63
    .line 64
    iget-boolean v13, v2, Lu4/g;->i:Z

    .line 65
    .line 66
    iget-boolean v14, v2, Lu4/g;->j:Z

    .line 67
    .line 68
    iget-object v15, v2, Lu4/g;->k:Ljava/util/List;

    .line 69
    .line 70
    sget-object v16, Lt4/h;->a:Lt4/h;

    .line 71
    .line 72
    iget-object v1, v2, Lu4/g;->l:Ljava/lang/String;

    .line 73
    .line 74
    monitor-enter v16

    .line 75
    move-object/from16 p1, v3

    .line 76
    .line 77
    :try_start_0
    const-string v3, "key"

    .line 78
    .line 79
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    sget-object v3, Lt4/h;->b:Ljava/util/LinkedHashMap;

    .line 83
    .line 84
    invoke-virtual {v3, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Ljava/util/List;

    .line 89
    .line 90
    if-nez v1, :cond_3

    .line 91
    .line 92
    sget-object v1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :catchall_0
    move-exception v0

    .line 96
    goto :goto_2

    .line 97
    :cond_3
    :goto_1
    monitor-exit v16

    .line 98
    iget v3, v2, Lu4/g;->m:I

    .line 99
    .line 100
    move-object/from16 v17, v1

    .line 101
    .line 102
    iget-object v1, v2, Lu4/g;->n:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 103
    .line 104
    move-object/from16 v18, v1

    .line 105
    .line 106
    iget-object v1, v2, Lu4/g;->o:Ljava/lang/String;

    .line 107
    .line 108
    move-object/from16 v19, v1

    .line 109
    .line 110
    iget-object v1, v2, Lu4/g;->p:Ljava/lang/String;

    .line 111
    .line 112
    move-object/from16 v20, v1

    .line 113
    .line 114
    iget-object v1, v2, Lu4/g;->q:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 115
    .line 116
    iget-object v2, v2, Lu4/g;->r:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    .line 117
    .line 118
    move-object/from16 v21, v1

    .line 119
    .line 120
    move-object/from16 v22, v2

    .line 121
    .line 122
    move-object/from16 v16, v17

    .line 123
    .line 124
    move/from16 v17, v3

    .line 125
    .line 126
    move-object/from16 v3, p1

    .line 127
    .line 128
    invoke-direct/range {v3 .. v22}, Lcom/zykj/mistake/feature/notebook/detail/k2;-><init>(IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/util/List;Ljava/util/List;ILcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->t(Lcom/zykj/mistake/feature/notebook/detail/i3;)V

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :goto_2
    :try_start_1
    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    throw v0

    .line 137
    :cond_4
    :goto_3
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 138
    .line 139
    return-object v0
.end method

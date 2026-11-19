.class final Lcom/zykj/mistake/feature/review/ReviewEffectHandlerKt$ReviewEffectHandler$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/mistake/feature/review/ReviewEffectHandlerKt$ReviewEffectHandler$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/zykj/mistake/feature/review/c;",
        "effect",
        "Ld6/s;",
        "<anonymous>",
        "(Lcom/zykj/mistake/feature/review/c;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.feature.review.ReviewEffectHandlerKt$ReviewEffectHandler$1$1$1"
    f = "ReviewEffectHandler.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $mainNavController:Lt4/e;

.field final synthetic $platformBridge:Lw4/c;

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lt4/e;Lw4/c;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/e;",
            "Lw4/c;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/review/ReviewEffectHandlerKt$ReviewEffectHandler$1$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/review/ReviewEffectHandlerKt$ReviewEffectHandler$1$1$1;->$mainNavController:Lt4/e;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/review/ReviewEffectHandlerKt$ReviewEffectHandler$1$1$1;->$platformBridge:Lw4/c;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 3
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
    new-instance v0, Lcom/zykj/mistake/feature/review/ReviewEffectHandlerKt$ReviewEffectHandler$1$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/ReviewEffectHandlerKt$ReviewEffectHandler$1$1$1;->$mainNavController:Lt4/e;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/review/ReviewEffectHandlerKt$ReviewEffectHandler$1$1$1;->$platformBridge:Lw4/c;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/mistake/feature/review/ReviewEffectHandlerKt$ReviewEffectHandler$1$1$1;-><init>(Lt4/e;Lw4/c;Lh6/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/zykj/mistake/feature/review/ReviewEffectHandlerKt$ReviewEffectHandler$1$1$1;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Lcom/zykj/mistake/feature/review/c;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/review/c;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/review/ReviewEffectHandlerKt$ReviewEffectHandler$1$1$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/review/ReviewEffectHandlerKt$ReviewEffectHandler$1$1$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/review/ReviewEffectHandlerKt$ReviewEffectHandler$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/zykj/mistake/feature/review/c;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/review/ReviewEffectHandlerKt$ReviewEffectHandler$1$1$1;->invoke(Lcom/zykj/mistake/feature/review/c;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/mistake/feature/review/ReviewEffectHandlerKt$ReviewEffectHandler$1$1$1;->L$0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lcom/zykj/mistake/feature/review/c;

    .line 6
    .line 7
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 8
    .line 9
    iget v2, v0, Lcom/zykj/mistake/feature/review/ReviewEffectHandlerKt$ReviewEffectHandler$1$1$1;->label:I

    .line 10
    .line 11
    if-nez v2, :cond_2

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    instance-of v2, v1, Lcom/zykj/mistake/feature/review/a;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    iget-object v2, v0, Lcom/zykj/mistake/feature/review/ReviewEffectHandlerKt$ReviewEffectHandler$1$1$1;->$mainNavController:Lt4/e;

    .line 21
    .line 22
    new-instance v3, Lu4/g;

    .line 23
    .line 24
    sget-object v17, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;->REVIEW_RECOMMEND:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 25
    .line 26
    check-cast v1, Lcom/zykj/mistake/feature/review/a;

    .line 27
    .line 28
    iget-object v4, v1, Lcom/zykj/mistake/feature/review/a;->a:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 29
    .line 30
    iget-object v1, v1, Lcom/zykj/mistake/feature/review/a;->b:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    .line 31
    .line 32
    const v20, 0xdfff

    .line 33
    .line 34
    .line 35
    move-object/from16 v18, v4

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    const-wide/16 v6, 0x0

    .line 40
    .line 41
    const/4 v8, 0x0

    .line 42
    const/4 v9, 0x0

    .line 43
    const/4 v10, 0x0

    .line 44
    const/4 v11, 0x0

    .line 45
    const/4 v12, 0x0

    .line 46
    const/4 v13, 0x0

    .line 47
    const/4 v14, 0x0

    .line 48
    const/4 v15, 0x0

    .line 49
    const/16 v16, 0x0

    .line 50
    .line 51
    move-object/from16 v19, v1

    .line 52
    .line 53
    invoke-direct/range {v3 .. v20}, Lu4/g;-><init>(IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/util/List;ILcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;I)V

    .line 54
    .line 55
    .line 56
    sget-object v1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 57
    .line 58
    invoke-virtual {v2, v3, v1}, Lt4/e;->c(Lu4/g;Ljava/util/List;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    instance-of v2, v1, Lcom/zykj/mistake/feature/review/b;

    .line 63
    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    iget-object v2, v0, Lcom/zykj/mistake/feature/review/ReviewEffectHandlerKt$ReviewEffectHandler$1$1$1;->$platformBridge:Lw4/c;

    .line 67
    .line 68
    check-cast v1, Lcom/zykj/mistake/feature/review/b;

    .line 69
    .line 70
    iget-object v1, v1, Lcom/zykj/mistake/feature/review/b;->a:Ljava/lang/String;

    .line 71
    .line 72
    check-cast v2, Lcom/zykj/mistake/activity/MainActivity;

    .line 73
    .line 74
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/activity/MainActivity;->b(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :goto_0
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_1
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 81
    .line 82
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 83
    .line 84
    .line 85
    throw v1

    .line 86
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 87
    .line 88
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 89
    .line 90
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v1
.end method

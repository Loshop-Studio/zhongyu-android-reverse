.class final Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lcom/zykj/mistake/feature/ask/j;",
        "effect",
        "Ld6/s;",
        "<anonymous>",
        "(Lcom/zykj/mistake/feature/ask/j;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.feature.ask.AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1"
    f = "AskMaterialEffectHandler.kt"
    i = {
        0x0
    }
    l = {
        0x2c
    }
    m = "invokeSuspend"
    n = {
        "effect"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $environment:Lz4/a;

.field final synthetic $mainNavController:Lt4/e;

.field final synthetic $platformBridge:Lw4/c;

.field final synthetic $resolveGate:Lcom/zykj/mistake/feature/ask/b;

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lt4/e;Lw4/c;Lz4/a;Lcom/zykj/mistake/feature/ask/b;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/e;",
            "Lw4/c;",
            "Lz4/a;",
            "Lcom/zykj/mistake/feature/ask/b;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;->$mainNavController:Lt4/e;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;->$platformBridge:Lw4/c;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;->$environment:Lz4/a;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;->$resolveGate:Lcom/zykj/mistake/feature/ask/b;

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
    new-instance v0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;->$mainNavController:Lt4/e;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;->$platformBridge:Lw4/c;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;->$environment:Lz4/a;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;->$resolveGate:Lcom/zykj/mistake/feature/ask/b;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;-><init>(Lt4/e;Lw4/c;Lz4/a;Lcom/zykj/mistake/feature/ask/b;Lh6/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Lcom/zykj/mistake/feature/ask/j;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/ask/j;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/zykj/mistake/feature/ask/j;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;->invoke(Lcom/zykj/mistake/feature/ask/j;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/mistake/feature/ask/j;

    .line 4
    .line 5
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 6
    .line 7
    iget v2, p0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;->label:I

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    sget-object p1, Lcom/zykj/mistake/feature/ask/g;->a:Lcom/zykj/mistake/feature/ask/g;

    .line 30
    .line 31
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    iget-object p1, p0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;->$mainNavController:Lt4/e;

    .line 38
    .line 39
    iget-object p1, p1, Lt4/e;->a:Landroidx/navigation/NavHostController;

    .line 40
    .line 41
    invoke-virtual {p1}, Landroidx/navigation/NavController;->popBackStack()Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    instance-of p1, v0, Lcom/zykj/mistake/feature/ask/i;

    .line 46
    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    iget-object p1, p0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;->$platformBridge:Lw4/c;

    .line 50
    .line 51
    check-cast v0, Lcom/zykj/mistake/feature/ask/i;

    .line 52
    .line 53
    iget-object v0, v0, Lcom/zykj/mistake/feature/ask/i;->a:Ljava/lang/String;

    .line 54
    .line 55
    check-cast p1, Lcom/zykj/mistake/activity/MainActivity;

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Lcom/zykj/mistake/activity/MainActivity;->b(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    instance-of p1, v0, Lcom/zykj/mistake/feature/ask/h;

    .line 62
    .line 63
    if-eqz p1, :cond_5

    .line 64
    .line 65
    check-cast v0, Lcom/zykj/mistake/feature/ask/h;

    .line 66
    .line 67
    iget-object p1, v0, Lcom/zykj/mistake/feature/ask/h;->a:Ljava/util/ArrayList;

    .line 68
    .line 69
    iget-object v0, p0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;->$environment:Lz4/a;

    .line 70
    .line 71
    iget-object v2, p0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;->$platformBridge:Lw4/c;

    .line 72
    .line 73
    iget-object v4, p0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;->$resolveGate:Lcom/zykj/mistake/feature/ask/b;

    .line 74
    .line 75
    const/4 v5, 0x0

    .line 76
    iput-object v5, p0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;->L$0:Ljava/lang/Object;

    .line 77
    .line 78
    iput v3, p0, Lcom/zykj/mistake/feature/ask/AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1;->label:I

    .line 79
    .line 80
    invoke-static {p1, v0, v2, v4, p0}, Lcom/zykj/mistake/feature/ask/a;->c(Ljava/util/ArrayList;Lz4/a;Lw4/c;Lcom/zykj/mistake/feature/ask/b;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-ne p1, v1, :cond_4

    .line 85
    .line 86
    return-object v1

    .line 87
    :cond_4
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 88
    .line 89
    return-object p1

    .line 90
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 91
    .line 92
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 93
    .line 94
    .line 95
    throw p1
.end method

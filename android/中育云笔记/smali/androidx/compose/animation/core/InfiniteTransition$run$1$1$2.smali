.class final Landroidx/compose/animation/core/InfiniteTransition$run$1$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/core/InfiniteTransition$run$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/a;"
    }
.end annotation


# instance fields
.field final synthetic $$this$LaunchedEffect:Lsd/i0;


# direct methods
.method public constructor <init>(Lsd/i0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/core/InfiniteTransition$run$1$1$2;->$$this$LaunchedEffect:Lsd/i0;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Float;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/InfiniteTransition$run$1$1$2;->$$this$LaunchedEffect:Lsd/i0;

    invoke-interface {v0}, Lsd/i0;->getCoroutineContext()Lkotlin/coroutines/d;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/animation/core/SuspendAnimationKt;->getDurationScale(Lkotlin/coroutines/d;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Landroidx/compose/animation/core/InfiniteTransition$run$1$1$2;->invoke()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.class final Landroidx/lifecycle/w$a;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lx2/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/w;->c(Landroidx/lifecycle/f;Landroidx/lifecycle/f$c;Lx2/p;Lq2/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lx2/p<",
        "Lf3/h0;",
        "Lq2/d<",
        "-TT;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2"
    f = "PausingDispatcher.kt"
    l = {
        0xa2
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field private synthetic b:Ljava/lang/Object;

.field c:I

.field final synthetic d:Landroidx/lifecycle/f;

.field final synthetic e:Landroidx/lifecycle/f$c;

.field final synthetic f:Lx2/p;


# direct methods
.method constructor <init>(Landroidx/lifecycle/f;Landroidx/lifecycle/f$c;Lx2/p;Lq2/d;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/w$a;->d:Landroidx/lifecycle/f;

    iput-object p2, p0, Landroidx/lifecycle/w$a;->e:Landroidx/lifecycle/f$c;

    iput-object p3, p0, Landroidx/lifecycle/w$a;->f:Lx2/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILq2/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq2/d;)Lq2/d;
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq2/d<",
            "*>;)",
            "Lq2/d<",
            "Lo2/r;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/lifecycle/w$a;

    iget-object v1, p0, Landroidx/lifecycle/w$a;->d:Landroidx/lifecycle/f;

    iget-object v2, p0, Landroidx/lifecycle/w$a;->e:Landroidx/lifecycle/f$c;

    iget-object v3, p0, Landroidx/lifecycle/w$a;->f:Lx2/p;

    invoke-direct {v0, v1, v2, v3, p2}, Landroidx/lifecycle/w$a;-><init>(Landroidx/lifecycle/f;Landroidx/lifecycle/f$c;Lx2/p;Lq2/d;)V

    iput-object p1, v0, Landroidx/lifecycle/w$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lq2/d;

    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/w$a;->create(Ljava/lang/Object;Lq2/d;)Lq2/d;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/w$a;

    sget-object p2, Lo2/r;->a:Lo2/r;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/w$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object v0

    .line 1
    iget v1, p0, Landroidx/lifecycle/w$a;->c:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/w$a;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/LifecycleController;

    :try_start_0
    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_1
    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/lifecycle/w$a;->b:Ljava/lang/Object;

    check-cast p1, Lf3/h0;

    .line 4
    invoke-interface {p1}, Lf3/h0;->e()Lq2/g;

    move-result-object p1

    sget-object v1, Lf3/m1;->P:Lf3/m1$b;

    invoke-interface {p1, v1}, Lq2/g;->get(Lq2/g$c;)Lq2/g$b;

    move-result-object p1

    check-cast p1, Lf3/m1;

    if-eqz p1, :cond_3

    .line 5
    new-instance v1, Landroidx/lifecycle/v;

    invoke-direct {v1}, Landroidx/lifecycle/v;-><init>()V

    .line 6
    new-instance v3, Landroidx/lifecycle/LifecycleController;

    iget-object v4, p0, Landroidx/lifecycle/w$a;->d:Landroidx/lifecycle/f;

    iget-object v5, p0, Landroidx/lifecycle/w$a;->e:Landroidx/lifecycle/f$c;

    iget-object v6, v1, Landroidx/lifecycle/v;->b:Landroidx/lifecycle/c;

    invoke-direct {v3, v4, v5, v6, p1}, Landroidx/lifecycle/LifecycleController;-><init>(Landroidx/lifecycle/f;Landroidx/lifecycle/f$c;Landroidx/lifecycle/c;Lf3/m1;)V

    .line 7
    :try_start_1
    iget-object p1, p0, Landroidx/lifecycle/w$a;->f:Lx2/p;

    iput-object v3, p0, Landroidx/lifecycle/w$a;->b:Ljava/lang/Object;

    iput v2, p0, Landroidx/lifecycle/w$a;->c:I

    invoke-static {v1, p1, p0}, Lf3/g;->g(Lq2/g;Lx2/p;Lq2/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, v3

    .line 8
    :goto_0
    invoke-virtual {v0}, Landroidx/lifecycle/LifecycleController;->c()V

    return-object p1

    :catchall_1
    move-exception p1

    move-object v0, v3

    :goto_1
    invoke-virtual {v0}, Landroidx/lifecycle/LifecycleController;->c()V

    throw p1

    .line 9
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "when[State] methods should have a parent job"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.class public final Li3/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li3/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Li3/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Li3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li3/b<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final b:Lx2/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/p<",
            "Li3/b<",
            "-TT;>;",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# virtual methods
.method public a(Ljava/lang/Object;Lq2/d;)Ljava/lang/Object;
    .locals 1
    .param p2    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Li3/m;->a:Li3/b;

    invoke-interface {v0, p1, p2}, Li3/b;->a(Ljava/lang/Object;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lq2/d;)Ljava/lang/Object;
    .locals 6
    .param p1    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Li3/m$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Li3/m$a;

    iget v1, v0, Li3/m$a;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Li3/m$a;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Li3/m$a;

    invoke-direct {v0, p0, p1}, Li3/m$a;-><init>(Li3/m;Lq2/d;)V

    :goto_0
    iget-object p1, v0, Li3/m$a;->c:Ljava/lang/Object;

    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Li3/m$a;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    goto :goto_2

    .line 2
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_2
    iget-object v2, v0, Li3/m$a;->b:Ljava/lang/Object;

    check-cast v2, Lj3/f;

    iget-object v4, v0, Li3/m$a;->a:Ljava/lang/Object;

    check-cast v4, Li3/m;

    :try_start_0
    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_3
    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    .line 4
    iget-object p1, p0, Li3/m;->a:Li3/b;

    .line 5
    invoke-interface {v0}, Lq2/d;->getContext()Lq2/g;

    move-result-object v2

    .line 6
    new-instance v5, Lj3/f;

    invoke-direct {v5, p1, v2}, Lj3/f;-><init>(Li3/b;Lq2/g;)V

    .line 7
    :try_start_1
    iget-object p1, p0, Li3/m;->b:Lx2/p;

    iput-object p0, v0, Li3/m$a;->a:Ljava/lang/Object;

    iput-object v5, v0, Li3/m$a;->b:Ljava/lang/Object;

    iput v4, v0, Li3/m$a;->e:I

    invoke-interface {p1, v5, v0}, Lx2/p;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v4, p0

    move-object v2, v5

    .line 8
    :goto_1
    invoke-virtual {v2}, Lj3/f;->releaseIntercepted()V

    .line 9
    iget-object p1, v4, Li3/m;->a:Li3/b;

    instance-of v2, p1, Li3/m;

    if-eqz v2, :cond_6

    check-cast p1, Li3/m;

    const/4 v2, 0x0

    iput-object v2, v0, Li3/m$a;->a:Ljava/lang/Object;

    iput-object v2, v0, Li3/m$a;->b:Ljava/lang/Object;

    iput v3, v0, Li3/m$a;->e:I

    invoke-virtual {p1, v0}, Li3/m;->c(Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    .line 10
    :cond_5
    :goto_2
    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1

    :cond_6
    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1

    :catchall_1
    move-exception p1

    move-object v2, v5

    .line 11
    :goto_3
    invoke-virtual {v2}, Lj3/f;->releaseIntercepted()V

    throw p1
.end method

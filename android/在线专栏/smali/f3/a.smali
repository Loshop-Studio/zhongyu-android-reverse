.class public abstract Lf3/a;
.super Lf3/t1;
.source "SourceFile"

# interfaces
.implements Lq2/d;
.implements Lf3/h0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lf3/t1;",
        "Lq2/d<",
        "TT;>;",
        "Lf3/h0;"
    }
.end annotation


# instance fields
.field private final b:Lq2/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lq2/g;ZZ)V
    .locals 0
    .param p1    # Lq2/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p3}, Lf3/t1;-><init>(Z)V

    if-eqz p2, :cond_0

    .line 2
    sget-object p2, Lf3/m1;->P:Lf3/m1$b;

    invoke-interface {p1, p2}, Lq2/g;->get(Lq2/g$c;)Lq2/g$b;

    move-result-object p2

    check-cast p2, Lf3/m1;

    invoke-virtual {p0, p2}, Lf3/t1;->R(Lf3/m1;)V

    .line 3
    :cond_0
    invoke-interface {p1, p0}, Lq2/g;->plus(Lq2/g;)Lq2/g;

    move-result-object p1

    iput-object p1, p0, Lf3/a;->b:Lq2/g;

    return-void
.end method


# virtual methods
.method protected A()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p0}, Lf3/l0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, " was cancelled"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final Q(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    iget-object v0, p0, Lf3/a;->b:Lq2/g;

    invoke-static {v0, p1}, Lf3/g0;->a(Lq2/g;Ljava/lang/Throwable;)V

    return-void
.end method

.method public Y()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lf3/a;->b:Lq2/g;

    invoke-static {v0}, Lf3/d0;->b(Lq2/g;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0}, Lf3/t1;->Y()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 2
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\":"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lf3/t1;->Y()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final d0(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    instance-of v0, p1, Lf3/y;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Lf3/y;

    iget-object v0, p1, Lf3/y;->a:Ljava/lang/Throwable;

    invoke-virtual {p1}, Lf3/y;->a()Z

    move-result p1

    invoke-virtual {p0, v0, p1}, Lf3/a;->u0(Ljava/lang/Throwable;Z)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0, p1}, Lf3/a;->v0(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public e()Lq2/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lf3/a;->b:Lq2/g;

    return-object v0
.end method

.method public final getContext()Lq2/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lf3/a;->b:Lq2/g;

    return-object v0
.end method

.method public isActive()Z
    .locals 1

    invoke-super {p0}, Lf3/t1;->isActive()Z

    move-result v0

    return v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-static {p1, v0, v1, v0}, Lf3/c0;->d(Ljava/lang/Object;Lx2/l;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf3/t1;->W(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 2
    sget-object v0, Lf3/u1;->b:Lkotlinx/coroutines/internal/t;

    if-ne p1, v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0, p1}, Lf3/a;->t0(Ljava/lang/Object;)V

    return-void
.end method

.method protected t0(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lf3/t1;->l(Ljava/lang/Object;)V

    return-void
.end method

.method protected u0(Ljava/lang/Throwable;Z)V
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    return-void
.end method

.method protected v0(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    return-void
.end method

.method public final w0(Lf3/j0;Ljava/lang/Object;Lx2/p;)V
    .locals 0
    .param p1    # Lf3/j0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lx2/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lf3/j0;",
            "TR;",
            "Lx2/p<",
            "-TR;-",
            "Lq2/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1, p3, p2, p0}, Lf3/j0;->b(Lx2/p;Ljava/lang/Object;Lq2/d;)V

    return-void
.end method

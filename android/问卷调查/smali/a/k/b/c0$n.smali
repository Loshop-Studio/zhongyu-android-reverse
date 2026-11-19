.class public La/k/b/c0$n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/k/b/m$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/k/b/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "n"
.end annotation


# instance fields
.field public final a:Z

.field public final b:La/k/b/a;

.field public c:I


# virtual methods
.method public a()V
    .locals 5

    iget v0, p0, La/k/b/c0$n;->c:I

    const/4 v1, 0x1

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, La/k/b/c0$n;->b:La/k/b/a;

    iget-object v2, v2, La/k/b/a;->p:La/k/b/c0;

    .line 1
    iget-object v2, v2, La/k/b/c0;->c:La/k/b/k0;

    invoke-virtual {v2}, La/k/b/k0;->i()Ljava/util/List;

    move-result-object v2

    .line 2
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/k/b/m;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, La/k/b/m;->t0(La/k/b/m$e;)V

    if-eqz v0, :cond_1

    invoke-virtual {v3}, La/k/b/m;->E()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3}, La/k/b/m;->w0()V

    goto :goto_1

    :cond_2
    iget-object v2, p0, La/k/b/c0$n;->b:La/k/b/a;

    iget-object v3, v2, La/k/b/a;->p:La/k/b/c0;

    iget-boolean v4, p0, La/k/b/c0$n;->a:Z

    xor-int/2addr v0, v1

    invoke-virtual {v3, v2, v4, v0, v1}, La/k/b/c0;->g(La/k/b/a;ZZZ)V

    return-void
.end method

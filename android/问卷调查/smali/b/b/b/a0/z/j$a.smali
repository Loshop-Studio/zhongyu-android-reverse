.class public final Lb/b/b/a0/z/j$a;
.super Lb/b/b/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/b/b/a0/z/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lb/b/b/x<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lb/b/b/a0/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/b/b/a0/t<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lb/b/b/a0/z/j$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lb/b/b/a0/t;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/b/b/a0/t<",
            "TT;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lb/b/b/a0/z/j$b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lb/b/b/x;-><init>()V

    iput-object p1, p0, Lb/b/b/a0/z/j$a;->a:Lb/b/b/a0/t;

    iput-object p2, p0, Lb/b/b/a0/z/j$a;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Lb/b/b/c0/a;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/b/b/c0/a;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1}, Lb/b/b/c0/a;->v()Lb/b/b/c0/b;

    move-result-object v0

    sget-object v1, Lb/b/b/c0/b;->j:Lb/b/b/c0/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lb/b/b/c0/a;->r()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lb/b/b/a0/z/j$a;->a:Lb/b/b/a0/t;

    invoke-interface {v0}, Lb/b/b/a0/t;->a()Ljava/lang/Object;

    move-result-object v0

    :try_start_0
    invoke-virtual {p1}, Lb/b/b/c0/a;->b()V

    :goto_0
    invoke-virtual {p1}, Lb/b/b/c0/a;->i()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lb/b/b/c0/a;->p()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lb/b/b/a0/z/j$a;->b:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/b/b/a0/z/j$b;

    if-eqz v1, :cond_2

    iget-boolean v2, v1, Lb/b/b/a0/z/j$b;->c:Z

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1, p1, v0}, Lb/b/b/a0/z/j$b;->a(Lb/b/b/c0/a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    :goto_1
    invoke-virtual {p1}, Lb/b/b/c0/a;->A()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lb/b/b/c0/a;->f()V

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :catch_1
    move-exception p1

    new-instance v0, Lb/b/b/v;

    invoke-direct {v0, p1}, Lb/b/b/v;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public b(Lb/b/b/c0/c;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/b/b/c0/c;",
            "TT;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lb/b/b/c0/c;->h()Lb/b/b/c0/c;

    return-void

    :cond_0
    invoke-virtual {p1}, Lb/b/b/c0/c;->c()Lb/b/b/c0/c;

    :try_start_0
    iget-object v0, p0, Lb/b/b/a0/z/j$a;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/b/b/a0/z/j$b;

    invoke-virtual {v1, p2}, Lb/b/b/a0/z/j$b;->c(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v1, Lb/b/b/a0/z/j$b;->a:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lb/b/b/c0/c;->g(Ljava/lang/String;)Lb/b/b/c0/c;

    invoke-virtual {v1, p1, p2}, Lb/b/b/a0/z/j$b;->b(Lb/b/b/c0/c;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lb/b/b/c0/c;->f()Lb/b/b/c0/c;

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/AssertionError;

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2
.end method

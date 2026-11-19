.class public final Lf1/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf1/p;


# instance fields
.field private final a:Landroidx/room/h0;

.field private final b:Lp0/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp0/g<",
            "Lf1/o;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lp0/l;

.field private final d:Lp0/l;


# direct methods
.method public constructor <init>(Landroidx/room/h0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf1/q;->a:Landroidx/room/h0;

    .line 3
    new-instance v0, Lf1/q$a;

    invoke-direct {v0, p0, p1}, Lf1/q$a;-><init>(Lf1/q;Landroidx/room/h0;)V

    iput-object v0, p0, Lf1/q;->b:Lp0/g;

    .line 4
    new-instance v0, Lf1/q$b;

    invoke-direct {v0, p0, p1}, Lf1/q$b;-><init>(Lf1/q;Landroidx/room/h0;)V

    iput-object v0, p0, Lf1/q;->c:Lp0/l;

    .line 5
    new-instance v0, Lf1/q$c;

    invoke-direct {v0, p0, p1}, Lf1/q$c;-><init>(Lf1/q;Landroidx/room/h0;)V

    iput-object v0, p0, Lf1/q;->d:Lp0/l;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lf1/q;->a:Landroidx/room/h0;

    invoke-virtual {v0}, Landroidx/room/h0;->d()V

    .line 2
    iget-object v0, p0, Lf1/q;->c:Lp0/l;

    invoke-virtual {v0}, Lp0/l;->a()Ls0/f;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    .line 3
    invoke-interface {v0, v1}, Ls0/d;->k(I)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {v0, v1, p1}, Ls0/d;->c(ILjava/lang/String;)V

    .line 5
    :goto_0
    iget-object p1, p0, Lf1/q;->a:Landroidx/room/h0;

    invoke-virtual {p1}, Landroidx/room/h0;->e()V

    .line 6
    :try_start_0
    invoke-interface {v0}, Ls0/f;->i()I

    .line 7
    iget-object p1, p0, Lf1/q;->a:Landroidx/room/h0;

    invoke-virtual {p1}, Landroidx/room/h0;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    iget-object p1, p0, Lf1/q;->a:Landroidx/room/h0;

    invoke-virtual {p1}, Landroidx/room/h0;->i()V

    .line 9
    iget-object p1, p0, Lf1/q;->c:Lp0/l;

    invoke-virtual {p1, v0}, Lp0/l;->f(Ls0/f;)V

    return-void

    :catchall_0
    move-exception p1

    .line 10
    iget-object v1, p0, Lf1/q;->a:Landroidx/room/h0;

    invoke-virtual {v1}, Landroidx/room/h0;->i()V

    .line 11
    iget-object v1, p0, Lf1/q;->c:Lp0/l;

    invoke-virtual {v1, v0}, Lp0/l;->f(Ls0/f;)V

    .line 12
    throw p1
.end method

.method public b(Lf1/o;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lf1/q;->a:Landroidx/room/h0;

    invoke-virtual {v0}, Landroidx/room/h0;->d()V

    .line 2
    iget-object v0, p0, Lf1/q;->a:Landroidx/room/h0;

    invoke-virtual {v0}, Landroidx/room/h0;->e()V

    .line 3
    :try_start_0
    iget-object v0, p0, Lf1/q;->b:Lp0/g;

    invoke-virtual {v0, p1}, Lp0/g;->h(Ljava/lang/Object;)V

    .line 4
    iget-object p1, p0, Lf1/q;->a:Landroidx/room/h0;

    invoke-virtual {p1}, Landroidx/room/h0;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    iget-object p1, p0, Lf1/q;->a:Landroidx/room/h0;

    invoke-virtual {p1}, Landroidx/room/h0;->i()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lf1/q;->a:Landroidx/room/h0;

    invoke-virtual {v0}, Landroidx/room/h0;->i()V

    .line 6
    throw p1
.end method

.method public c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lf1/q;->a:Landroidx/room/h0;

    invoke-virtual {v0}, Landroidx/room/h0;->d()V

    .line 2
    iget-object v0, p0, Lf1/q;->d:Lp0/l;

    invoke-virtual {v0}, Lp0/l;->a()Ls0/f;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lf1/q;->a:Landroidx/room/h0;

    invoke-virtual {v1}, Landroidx/room/h0;->e()V

    .line 4
    :try_start_0
    invoke-interface {v0}, Ls0/f;->i()I

    .line 5
    iget-object v1, p0, Lf1/q;->a:Landroidx/room/h0;

    invoke-virtual {v1}, Landroidx/room/h0;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    iget-object v1, p0, Lf1/q;->a:Landroidx/room/h0;

    invoke-virtual {v1}, Landroidx/room/h0;->i()V

    .line 7
    iget-object v1, p0, Lf1/q;->d:Lp0/l;

    invoke-virtual {v1, v0}, Lp0/l;->f(Ls0/f;)V

    return-void

    :catchall_0
    move-exception v1

    .line 8
    iget-object v2, p0, Lf1/q;->a:Landroidx/room/h0;

    invoke-virtual {v2}, Landroidx/room/h0;->i()V

    .line 9
    iget-object v2, p0, Lf1/q;->d:Lp0/l;

    invoke-virtual {v2, v0}, Lp0/l;->f(Ls0/f;)V

    .line 10
    throw v1
.end method

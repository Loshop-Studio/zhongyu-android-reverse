.class public abstract Lp0/f;
.super Lp0/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lp0/l;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroidx/room/h0;)V
    .locals 0

    invoke-direct {p0, p1}, Lp0/l;-><init>(Landroidx/room/h0;)V

    return-void
.end method


# virtual methods
.method protected abstract g(Ls0/f;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls0/f;",
            "TT;)V"
        }
    .end annotation
.end method

.method public final h(Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lp0/l;->a()Ls0/f;

    move-result-object v0

    .line 2
    :try_start_0
    invoke-virtual {p0, v0, p1}, Lp0/f;->g(Ls0/f;Ljava/lang/Object;)V

    .line 3
    invoke-interface {v0}, Ls0/f;->i()I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    invoke-virtual {p0, v0}, Lp0/l;->f(Ls0/f;)V

    return p1

    :catchall_0
    move-exception p1

    invoke-virtual {p0, v0}, Lp0/l;->f(Ls0/f;)V

    .line 5
    throw p1
.end method

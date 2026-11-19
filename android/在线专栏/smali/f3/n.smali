.class public final Lf3/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lf3/l;Lf3/w0;)V
    .locals 1
    .param p0    # Lf3/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lf3/w0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf3/l<",
            "*>;",
            "Lf3/w0;",
            ")V"
        }
    .end annotation

    new-instance v0, Lf3/x0;

    invoke-direct {v0, p1}, Lf3/x0;-><init>(Lf3/w0;)V

    invoke-interface {p0, v0}, Lf3/l;->h(Lx2/l;)V

    return-void
.end method

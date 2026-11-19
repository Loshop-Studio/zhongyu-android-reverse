.class public final Ln9/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/u$b;


# instance fields
.field public final a:Ln9/o;

.field public final b:Z


# direct methods
.method public constructor <init>(Ln9/o;)V
    .locals 1

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ln9/s;->a:Ln9/o;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Ln9/s;->b:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a()Ln9/o;
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/s;->a:Ln9/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Ljava/lang/Void;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "unexpected cancel"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public bridge synthetic c()Ln9/u$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ln9/s;->f()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ln9/u$a;

    .line 6
    .line 7
    return-object v0
.end method

.method public bridge synthetic cancel()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ln9/s;->b()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public d()Ljava/lang/Void;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "already connected"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public bridge synthetic e()Ln9/u$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ln9/s;->d()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ln9/u$a;

    .line 6
    .line 7
    return-object v0
.end method

.method public f()Ljava/lang/Void;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "already connected"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public final g()Ln9/o;
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/s;->a:Ln9/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Ljava/lang/Void;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "unexpected retry"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public isReady()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ln9/s;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic retry()Ln9/u$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ln9/s;->h()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ln9/u$b;

    .line 6
    .line 7
    return-object v0
.end method

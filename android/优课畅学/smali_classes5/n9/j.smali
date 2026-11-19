.class public final Ln9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/u$b;


# instance fields
.field public final a:Ln9/u$a;

.field public final b:Z


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 7

    .line 1
    const-string v0, "e"

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
    new-instance v1, Ln9/u$a;

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    move-object v2, p0

    .line 15
    move-object v4, p1

    .line 16
    invoke-direct/range {v1 .. v6}, Ln9/u$a;-><init>(Ln9/u$b;Ln9/u$b;Ljava/lang/Throwable;ILkotlin/jvm/internal/n;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, v2, Ln9/j;->a:Ln9/u$a;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ln9/o;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ln9/j;->f()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ln9/o;

    .line 6
    .line 7
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

.method public c()Ln9/u$a;
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/j;->a:Ln9/u$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic cancel()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ln9/j;->b()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final d()Ln9/u$a;
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/j;->a:Ln9/u$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ln9/u$a;
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/j;->a:Ln9/u$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Ljava/lang/Void;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "unexpected call"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public g()Ljava/lang/Void;
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
    iget-boolean v0, p0, Ln9/j;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic retry()Ln9/u$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ln9/j;->g()Ljava/lang/Void;

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

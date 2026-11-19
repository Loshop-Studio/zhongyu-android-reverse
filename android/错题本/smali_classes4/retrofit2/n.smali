.class public final Lretrofit2/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lretrofit2/e;


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Lretrofit2/e;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lretrofit2/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lretrofit2/n;->a:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p2, p0, Lretrofit2/n;->b:Lretrofit2/e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Lokhttp3/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Lretrofit2/n;->b:Lretrofit2/e;

    .line 2
    .line 3
    invoke-interface {v0}, Lretrofit2/e;->a()Lokhttp3/c0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final b(Lretrofit2/h;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/support/v4/media/h;

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    invoke-direct {v0, v1, p0, p1}, Landroid/support/v4/media/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lretrofit2/n;->b:Lretrofit2/e;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Lretrofit2/e;->b(Lretrofit2/h;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lretrofit2/n;->b:Lretrofit2/e;

    .line 2
    .line 3
    invoke-interface {v0}, Lretrofit2/e;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lretrofit2/n;->clone()Lretrofit2/e;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Lretrofit2/e;
    .locals 3

    .line 2
    new-instance v0, Lretrofit2/n;

    iget-object v1, p0, Lretrofit2/n;->b:Lretrofit2/e;

    invoke-interface {v1}, Lretrofit2/e;->clone()Lretrofit2/e;

    move-result-object v1

    iget-object v2, p0, Lretrofit2/n;->a:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v2, v1}, Lretrofit2/n;-><init>(Ljava/util/concurrent/Executor;Lretrofit2/e;)V

    return-object v0
.end method

.method public final d()Lretrofit2/n0;
    .locals 1

    .line 1
    iget-object v0, p0, Lretrofit2/n;->b:Lretrofit2/e;

    .line 2
    .line 3
    invoke-interface {v0}, Lretrofit2/e;->d()Lretrofit2/n0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final isCanceled()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lretrofit2/n;->b:Lretrofit2/e;

    .line 2
    .line 3
    invoke-interface {v0}, Lretrofit2/e;->isCanceled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

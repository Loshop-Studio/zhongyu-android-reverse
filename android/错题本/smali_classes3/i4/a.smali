.class public final Li4/a;
.super La6/a;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lcom/zykj/mistake/base/BasePresenter;

.field public final synthetic c:La/a;

.field public final synthetic d:Z


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/base/BasePresenter;La/a;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Li4/a;->b:Lcom/zykj/mistake/base/BasePresenter;

    .line 2
    .line 3
    iput-object p2, p0, Li4/a;->c:La/a;

    .line 4
    .line 5
    iput-boolean p3, p0, Li4/a;->d:Z

    .line 6
    .line 7
    invoke-direct {p0}, La6/a;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onComplete()V
    .locals 0

    .line 1
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lh4/a;->k(Ljava/lang/Throwable;)Lcom/zykj/mistake/network/ThrowableHandler$ResponeThrowable;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, Li4/a;->b:Lcom/zykj/mistake/base/BasePresenter;

    .line 11
    .line 12
    iget-object v1, v0, Lcom/zykj/mistake/base/BasePresenter;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/zykj/mistake/network/ThrowableHandler$ResponeThrowable;->getMessage()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    new-instance v3, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v4, "throwable.message--->"

    .line 21
    .line 22
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/zykj/mistake/network/ThrowableHandler$ResponeThrowable;->getMessage()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    const-string p1, ""

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/mistake/network/ThrowableHandler$ResponeThrowable;->getMessage()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    iget-object v1, p0, Li4/a;->c:La/a;

    .line 52
    .line 53
    invoke-virtual {v1, p1}, La/a;->m(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-boolean p1, p0, Li4/a;->d:Z

    .line 57
    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    iget-object p1, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 61
    .line 62
    if-eqz p1, :cond_1

    .line 63
    .line 64
    invoke-interface {p1}, Li4/b;->c()V

    .line 65
    .line 66
    .line 67
    :cond_1
    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/mistake/network/ApiResp;

    .line 2
    .line 3
    const-string v0, "resp"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/mistake/network/ApiResp;->getSuccess()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, Li4/a;->c:La/a;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1, p1}, La/a;->n(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/mistake/network/ApiResp;->getErrorMessage()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v1, p1}, La/a;->m(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-boolean p1, p0, Li4/a;->d:Z

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    iget-object p1, p0, Li4/a;->b:Lcom/zykj/mistake/base/BasePresenter;

    .line 32
    .line 33
    iget-object p1, p1, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 34
    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    invoke-interface {p1}, Li4/b;->c()V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method

.class public Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;
.super Landroidx/lifecycle/LiveData;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/lifecycle/LiveData<",
        "TT;>;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public d:I

.field public e:Ljava/util/Timer;

.field public f:Ljava/util/TimerTask;

.field public g:Z

.field public h:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/LiveData;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->b:Z

    .line 6
    .line 7
    const/16 v1, 0x3e8

    .line 8
    .line 9
    iput v1, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->d:I

    .line 10
    .line 11
    new-instance v1, Ljava/util/Timer;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->e:Ljava/util/Timer;

    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->h:Z

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic a(Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;Landroidx/lifecycle/Observer;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->d(Landroidx/lifecycle/Observer;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->c()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic d(Landroidx/lifecycle/Observer;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->a:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->b:Z

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->c:Z

    .line 10
    .line 11
    iput-boolean p1, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->a:Z

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-boolean v0, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->b:Z

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iput-boolean v1, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->b:Z

    .line 19
    .line 20
    iput-boolean v1, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->c:Z

    .line 21
    .line 22
    invoke-interface {p1, p2}, Landroidx/lifecycle/Observer;->onChanged(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-boolean v0, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->c:Z

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-interface {p1, p2}, Landroidx/lifecycle/Observer;->onChanged(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->h:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->a:Z

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-super {p0, v0}, Landroidx/lifecycle/LiveData;->postValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iput-boolean v1, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->b:Z

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->c:Z

    .line 17
    .line 18
    :goto_0
    return-void
.end method

.method public observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V
    .locals 1

    .line 1
    new-instance v0, Li0/a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p2}, Li0/a;-><init>(Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;Landroidx/lifecycle/Observer;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, v0}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public observeForever(Landroidx/lifecycle/Observer;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    const-string v0, "Do not use observeForever for communication between pages to avoid lifecycle security issues"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->g:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->b:Z

    .line 14
    .line 15
    iput-boolean v0, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->c:Z

    .line 16
    .line 17
    invoke-super {p0, p1}, Landroidx/lifecycle/LiveData;->setValue(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->f:Ljava/util/TimerTask;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/TimerTask;->cancel()Z

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->e:Ljava/util/Timer;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/Timer;->purge()I

    .line 30
    .line 31
    .line 32
    :cond_1
    if-eqz p1, :cond_2

    .line 33
    .line 34
    new-instance p1, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3$a;

    .line 35
    .line 36
    invoke-direct {p1, p0}, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3$a;-><init>(Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->f:Ljava/util/TimerTask;

    .line 40
    .line 41
    iget-object v0, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->e:Ljava/util/Timer;

    .line 42
    .line 43
    iget v1, p0, Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveDataV3;->d:I

    .line 44
    .line 45
    int-to-long v1, v1

    .line 46
    invoke-virtual {v0, p1, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 47
    .line 48
    .line 49
    :cond_2
    return-void
.end method

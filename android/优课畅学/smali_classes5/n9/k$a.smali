.class public final Ln9/k$a;
.super Lm9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln9/k;->g()Ln9/u$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic e:Ln9/u$b;

.field public final synthetic f:Ln9/k;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ln9/u$b;Ln9/k;)V
    .locals 1

    .line 1
    iput-object p2, p0, Ln9/k$a;->e:Ln9/u$b;

    .line 2
    .line 3
    iput-object p3, p0, Ln9/k$a;->f:Ln9/k;

    .line 4
    .line 5
    const/4 p2, 0x2

    .line 6
    const/4 p3, 0x0

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, p1, v0, p2, p3}, Lm9/a;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/n;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public f()J
    .locals 7

    .line 1
    :try_start_0
    iget-object v0, p0, Ln9/k$a;->e:Ln9/u$b;

    .line 2
    .line 3
    invoke-interface {v0}, Ln9/u$b;->e()Ln9/u$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    goto :goto_0

    .line 8
    :catchall_0
    move-exception v0

    .line 9
    move-object v4, v0

    .line 10
    new-instance v1, Ln9/u$a;

    .line 11
    .line 12
    iget-object v2, p0, Ln9/k$a;->e:Ln9/u$b;

    .line 13
    .line 14
    const/4 v5, 0x2

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct/range {v1 .. v6}, Ln9/u$a;-><init>(Ln9/u$b;Ln9/u$b;Ljava/lang/Throwable;ILkotlin/jvm/internal/n;)V

    .line 18
    .line 19
    .line 20
    move-object v0, v1

    .line 21
    :goto_0
    iget-object v1, p0, Ln9/k$a;->f:Ln9/k;

    .line 22
    .line 23
    invoke-static {v1}, Ln9/k;->d(Ln9/k;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v2, p0, Ln9/k$a;->e:Ln9/u$b;

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    iget-object v1, p0, Ln9/k$a;->f:Ln9/k;

    .line 36
    .line 37
    invoke-static {v1}, Ln9/k;->c(Ln9/k;)Ljava/util/concurrent/BlockingQueue;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v1, v0}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    const-wide/16 v0, -0x1

    .line 45
    .line 46
    return-wide v0
.end method

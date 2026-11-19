.class public final Lt/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lhd/l;

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt/b;->a:Lhd/l;

    .line 5
    .line 6
    sget-object p1, Lt/d;->a:Lt/d;

    .line 7
    .line 8
    iput-object p1, p0, Lt/b;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lt/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, Lt/d;->a:Lt/d;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    monitor-enter p0

    .line 9
    :try_start_0
    iget-object v0, p0, Lt/b;->b:Ljava/lang/Object;

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    iget-object v0, p0, Lt/b;->a:Lhd/l;

    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lt/b;->b:Ljava/lang/Object;

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    iput-object p1, p0, Lt/b;->a:Lhd/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    :goto_0
    monitor-exit p0

    .line 29
    return-object v0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    monitor-exit p0

    .line 32
    throw p1
.end method

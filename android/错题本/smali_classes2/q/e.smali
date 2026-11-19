.class public final Lq/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lq/i;

.field public final b:Ld2/c;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq/i;Ld2/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq/e;->a:Lq/i;

    .line 5
    .line 6
    iput-object p2, p0, Lq/e;->b:Ld2/c;

    .line 7
    .line 8
    new-instance p1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lq/e;->c:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lq/e;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lq/e;->a:Lq/i;

    .line 5
    .line 6
    invoke-interface {v1}, Lq/i;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lq/e;->b:Ld2/c;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iput v2, v1, Ld2/c;->b:I

    .line 13
    .line 14
    iget-object v1, v1, Ld2/c;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    monitor-exit v0

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    monitor-exit v0

    .line 25
    throw v1
.end method

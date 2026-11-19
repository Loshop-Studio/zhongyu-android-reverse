.class public Lcom/bumptech/glide/load/engine/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/load/engine/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final a:Lc0/e;

.field public final synthetic b:Lcom/bumptech/glide/load/engine/g;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/engine/g;Lc0/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bumptech/glide/load/engine/g$b;->b:Lcom/bumptech/glide/load/engine/g;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/bumptech/glide/load/engine/g$b;->a:Lc0/e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/g$b;->a:Lc0/e;

    .line 2
    .line 3
    invoke-interface {v0}, Lc0/e;->g()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/g$b;->b:Lcom/bumptech/glide/load/engine/g;

    .line 9
    .line 10
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    :try_start_1
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/g$b;->b:Lcom/bumptech/glide/load/engine/g;

    .line 12
    .line 13
    iget-object v2, v2, Lcom/bumptech/glide/load/engine/g;->a:Lcom/bumptech/glide/load/engine/g$e;

    .line 14
    .line 15
    iget-object v3, p0, Lcom/bumptech/glide/load/engine/g$b;->a:Lc0/e;

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Lcom/bumptech/glide/load/engine/g$e;->b(Lc0/e;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/g$b;->b:Lcom/bumptech/glide/load/engine/g;

    .line 24
    .line 25
    iget-object v2, v2, Lcom/bumptech/glide/load/engine/g;->v:Lcom/bumptech/glide/load/engine/h;

    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/bumptech/glide/load/engine/h;->a()V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/g$b;->b:Lcom/bumptech/glide/load/engine/g;

    .line 31
    .line 32
    iget-object v3, p0, Lcom/bumptech/glide/load/engine/g$b;->a:Lc0/e;

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Lcom/bumptech/glide/load/engine/g;->g(Lc0/e;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/g$b;->b:Lcom/bumptech/glide/load/engine/g;

    .line 38
    .line 39
    iget-object v3, p0, Lcom/bumptech/glide/load/engine/g$b;->a:Lc0/e;

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Lcom/bumptech/glide/load/engine/g;->r(Lc0/e;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/g$b;->b:Lcom/bumptech/glide/load/engine/g;

    .line 45
    .line 46
    invoke-virtual {v2}, Lcom/bumptech/glide/load/engine/g;->i()V

    .line 47
    .line 48
    .line 49
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 51
    return-void

    .line 52
    :catchall_0
    move-exception v2

    .line 53
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 54
    :try_start_4
    throw v2

    .line 55
    :catchall_1
    move-exception v1

    .line 56
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 57
    throw v1
.end method

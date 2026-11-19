.class public abstract Lx3/a;
.super Lm4/c;
.source "SourceFile"

# interfaces
.implements Lz4/c;


# instance fields
.field public volatile b:Lx4/i;

.field public final c:Ljava/lang/Object;

.field public d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lm4/c;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lx3/a;->c:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lx3/a;->d:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final f()Lx4/i;
    .locals 2

    .line 1
    iget-object v0, p0, Lx3/a;->b:Lx4/i;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lx3/a;->c:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lx3/a;->b:Lx4/i;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lx3/a;->g()Lx4/i;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, Lx3/a;->b:Lx4/i;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    monitor-exit v0

    .line 22
    goto :goto_2

    .line 23
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw v1

    .line 25
    :cond_1
    :goto_2
    iget-object v0, p0, Lx3/a;->b:Lx4/i;

    .line 26
    .line 27
    return-object v0
.end method

.method public g()Lx4/i;
    .locals 1

    .line 1
    new-instance v0, Lx4/i;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lx4/i;-><init>(Landroid/app/Service;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final generatedComponent()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx3/a;->f()Lx4/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lx4/i;->generatedComponent()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public h()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lx3/a;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lx3/a;->d:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lx3/a;->generatedComponent()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lx3/t;

    .line 13
    .line 14
    invoke-static {p0}, Lz4/e;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lcom/zykj/huiwei/launcher/server/MyService;

    .line 19
    .line 20
    invoke-interface {v0, v1}, Lx3/t;->a(Lcom/zykj/huiwei/launcher/server/MyService;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public onCreate()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lx3/a;->h()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Lm4/c;->onCreate()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

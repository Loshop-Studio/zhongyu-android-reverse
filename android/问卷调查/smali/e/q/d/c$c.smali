.class public final Le/q/d/c$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/q/d/c;-><init>(Le/q/d/c$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic b:Le/q/d/c;


# direct methods
.method public constructor <init>(Le/q/d/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Le/q/d/c$c;->b:Le/q/d/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    :cond_0
    :goto_0
    iget-object v0, p0, Le/q/d/c$c;->b:Le/q/d/c;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Le/q/d/c$c;->b:Le/q/d/c;

    invoke-virtual {v1}, Le/q/d/c;->c()Le/q/d/a;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    if-eqz v1, :cond_3

    .line 1
    iget-object v0, v1, Le/q/d/a;->a:Le/q/d/b;

    .line 2
    invoke-static {v0}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    const-wide/16 v2, -0x1

    sget-object v4, Le/q/d/c;->j:Le/q/d/c;

    .line 3
    sget-object v4, Le/q/d/c;->i:Ljava/util/logging/Logger;

    .line 4
    sget-object v5, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v4, v5}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 5
    iget-object v2, v0, Le/q/d/b;->d:Le/q/d/c;

    .line 6
    iget-object v2, v2, Le/q/d/c;->g:Le/q/d/c$a;

    .line 7
    invoke-interface {v2}, Le/q/d/c$a;->d()J

    move-result-wide v2

    const-string v5, "starting"

    invoke-static {v1, v0, v5}, Lb/c/a/a;->a(Le/q/d/a;Le/q/d/b;Ljava/lang/String;)V

    :cond_1
    :try_start_1
    iget-object v5, p0, Le/q/d/c$c;->b:Le/q/d/c;

    invoke-static {v5, v1}, Le/q/d/c;->a(Le/q/d/c;Le/q/d/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v4, :cond_0

    .line 8
    iget-object v4, v0, Le/q/d/b;->d:Le/q/d/c;

    .line 9
    iget-object v4, v4, Le/q/d/c;->g:Le/q/d/c$a;

    .line 10
    invoke-interface {v4}, Le/q/d/c$a;->d()J

    move-result-wide v4

    sub-long/2addr v4, v2

    const-string v2, "finished run in "

    invoke-static {v2}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4, v5}, Lb/c/a/a;->j(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lb/c/a/a;->a(Le/q/d/a;Le/q/d/b;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v5

    :try_start_2
    iget-object v6, p0, Le/q/d/c$c;->b:Le/q/d/c;

    .line 11
    iget-object v6, v6, Le/q/d/c;->g:Le/q/d/c$a;

    .line 12
    invoke-interface {v6, p0}, Le/q/d/c$a;->c(Ljava/lang/Runnable;)V

    throw v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v5

    if-eqz v4, :cond_2

    .line 13
    iget-object v4, v0, Le/q/d/b;->d:Le/q/d/c;

    .line 14
    iget-object v4, v4, Le/q/d/c;->g:Le/q/d/c$a;

    .line 15
    invoke-interface {v4}, Le/q/d/c$a;->d()J

    move-result-wide v6

    sub-long/2addr v6, v2

    const-string v2, "failed a run in "

    invoke-static {v2}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v6, v7}, Lb/c/a/a;->j(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lb/c/a/a;->a(Le/q/d/a;Le/q/d/b;Ljava/lang/String;)V

    :cond_2
    throw v5

    :cond_3
    return-void

    :catchall_2
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.class public Lcom/lzy/okserver/task/PriorityBlockingQueue$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lzy/okserver/task/PriorityBlockingQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public c:Lcom/lzy/okserver/task/PriorityBlockingQueue$b;

.field public d:Lcom/lzy/okserver/task/PriorityBlockingQueue$b;

.field public e:Ljava/lang/Object;

.field public final synthetic f:Lcom/lzy/okserver/task/PriorityBlockingQueue;


# direct methods
.method public constructor <init>(Lcom/lzy/okserver/task/PriorityBlockingQueue;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$a;->f:Lcom/lzy/okserver/task/PriorityBlockingQueue;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/lzy/okserver/task/PriorityBlockingQueue;->d()V

    .line 7
    .line 8
    .line 9
    :try_start_0
    iget-object v0, p1, Lcom/lzy/okserver/task/PriorityBlockingQueue;->e:Lcom/lzy/okserver/task/PriorityBlockingQueue$b;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/lzy/okserver/task/PriorityBlockingQueue$b;->c:Lcom/lzy/okserver/task/PriorityBlockingQueue$b;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$a;->c:Lcom/lzy/okserver/task/PriorityBlockingQueue$b;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/lzy/okserver/task/PriorityBlockingQueue$b;->b()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$a;->e:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/lzy/okserver/task/PriorityBlockingQueue;->e()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :goto_1
    invoke-virtual {p1}, Lcom/lzy/okserver/task/PriorityBlockingQueue;->e()V

    .line 31
    .line 32
    .line 33
    throw v0
.end method


# virtual methods
.method public final a(Lcom/lzy/okserver/task/PriorityBlockingQueue$b;)Lcom/lzy/okserver/task/PriorityBlockingQueue$b;
    .locals 1

    .line 1
    :goto_0
    iget-object v0, p1, Lcom/lzy/okserver/task/PriorityBlockingQueue$b;->c:Lcom/lzy/okserver/task/PriorityBlockingQueue$b;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$a;->f:Lcom/lzy/okserver/task/PriorityBlockingQueue;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/lzy/okserver/task/PriorityBlockingQueue;->e:Lcom/lzy/okserver/task/PriorityBlockingQueue$b;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/lzy/okserver/task/PriorityBlockingQueue$b;->c:Lcom/lzy/okserver/task/PriorityBlockingQueue$b;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/lzy/okserver/task/PriorityBlockingQueue$b;->b()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-object p1, v0

    .line 22
    goto :goto_0

    .line 23
    :cond_2
    :goto_1
    return-object v0
.end method

.method public hasNext()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$a;->c:Lcom/lzy/okserver/task/PriorityBlockingQueue$b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$a;->f:Lcom/lzy/okserver/task/PriorityBlockingQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/lzy/okserver/task/PriorityBlockingQueue;->d()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$a;->c:Lcom/lzy/okserver/task/PriorityBlockingQueue$b;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$a;->e:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$a;->d:Lcom/lzy/okserver/task/PriorityBlockingQueue$b;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/lzy/okserver/task/PriorityBlockingQueue$a;->a(Lcom/lzy/okserver/task/PriorityBlockingQueue$b;)Lcom/lzy/okserver/task/PriorityBlockingQueue$b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$a;->c:Lcom/lzy/okserver/task/PriorityBlockingQueue$b;

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v0}, Lcom/lzy/okserver/task/PriorityBlockingQueue$b;->b()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    iput-object v0, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$a;->e:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    iget-object v0, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$a;->f:Lcom/lzy/okserver/task/PriorityBlockingQueue;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/lzy/okserver/task/PriorityBlockingQueue;->e()V

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    :try_start_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 41
    .line 42
    .line 43
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    :goto_1
    iget-object v1, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$a;->f:Lcom/lzy/okserver/task/PriorityBlockingQueue;

    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/lzy/okserver/task/PriorityBlockingQueue;->e()V

    .line 47
    .line 48
    .line 49
    throw v0
.end method

.method public remove()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$a;->d:Lcom/lzy/okserver/task/PriorityBlockingQueue$b;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$a;->f:Lcom/lzy/okserver/task/PriorityBlockingQueue;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/lzy/okserver/task/PriorityBlockingQueue;->d()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget-object v0, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$a;->d:Lcom/lzy/okserver/task/PriorityBlockingQueue$b;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-object v1, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$a;->d:Lcom/lzy/okserver/task/PriorityBlockingQueue$b;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$a;->f:Lcom/lzy/okserver/task/PriorityBlockingQueue;

    .line 16
    .line 17
    iget-object v1, v1, Lcom/lzy/okserver/task/PriorityBlockingQueue;->e:Lcom/lzy/okserver/task/PriorityBlockingQueue$b;

    .line 18
    .line 19
    :cond_0
    iget-object v2, v1, Lcom/lzy/okserver/task/PriorityBlockingQueue$b;->c:Lcom/lzy/okserver/task/PriorityBlockingQueue$b;

    .line 20
    .line 21
    move-object v3, v2

    .line 22
    move-object v2, v1

    .line 23
    move-object v1, v3

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    if-ne v1, v0, :cond_0

    .line 27
    .line 28
    iget-object v0, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$a;->f:Lcom/lzy/okserver/task/PriorityBlockingQueue;

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Lcom/lzy/okserver/task/PriorityBlockingQueue;->m(Lcom/lzy/okserver/task/PriorityBlockingQueue$b;Lcom/lzy/okserver/task/PriorityBlockingQueue$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$a;->f:Lcom/lzy/okserver/task/PriorityBlockingQueue;

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/lzy/okserver/task/PriorityBlockingQueue;->e()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :goto_1
    iget-object v1, p0, Lcom/lzy/okserver/task/PriorityBlockingQueue$a;->f:Lcom/lzy/okserver/task/PriorityBlockingQueue;

    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/lzy/okserver/task/PriorityBlockingQueue;->e()V

    .line 45
    .line 46
    .line 47
    throw v0

    .line 48
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 51
    .line 52
    .line 53
    throw v0
.end method

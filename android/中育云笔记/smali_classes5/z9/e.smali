.class public abstract Lz9/e;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field public c:Lv9/c;

.field public d:Lga/d;

.field public e:Lu9/a;

.field public f:Lcom/zykj/blackboard/enums/PlayStatus;

.field public g:Lq9/e;

.field public h:Ljava/util/List;

.field public i:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->h:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 5
    .line 6
    iput-object v0, p0, Lz9/e;->f:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lz9/e;->h:Ljava/util/List;

    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lz9/e;->i:Ljava/util/List;

    .line 21
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v1, "PlayThread "

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lz9/e;->i:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lv9/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lz9/e;->c:Lv9/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lu9/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lz9/e;->e:Lu9/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lz9/e;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Lq9/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lz9/e;->g:Lq9/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Lcom/zykj/blackboard/enums/PlayStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lz9/e;->f:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Lga/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lz9/e;->d:Lga/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Lcom/zykj/blackboard/enums/PlayStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lz9/e;->f:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lz9/e;->i:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Iterable;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lz9/d;

    .line 20
    .line 21
    invoke-interface {v1, p0, p1}, Lz9/d;->a(Lz9/e;Z)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public final j(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lz9/e;->h:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Iterable;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lma/h;

    .line 20
    .line 21
    invoke-interface {v1, p1, p2}, Lma/h;->onProgress(J)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public k()V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->f:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lz9/e;->f:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lz9/e;->h:Ljava/util/List;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lma/h;

    .line 24
    .line 25
    invoke-interface {v1}, Lma/h;->onPlayPause()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method public l()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->h:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lz9/e;->f:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 4
    .line 5
    return-void
.end method

.method public m()V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->g:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lz9/e;->f:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lz9/e;->h:Ljava/util/List;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lma/h;

    .line 24
    .line 25
    invoke-interface {v1}, Lma/h;->onPlayResume()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method public final n(Lv9/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz9/e;->c:Lv9/c;

    .line 2
    .line 3
    return-void
.end method

.method public final o(Lu9/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz9/e;->e:Lu9/a;

    .line 2
    .line 3
    return-void
.end method

.method public final p(Lq9/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz9/e;->g:Lq9/e;

    .line 2
    .line 3
    return-void
.end method

.method public final q(Lcom/zykj/blackboard/enums/PlayStatus;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lz9/e;->f:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 7
    .line 8
    return-void
.end method

.method public final r(Lga/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz9/e;->d:Lga/d;

    .line 2
    .line 3
    return-void
.end method

.method public s()V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->h:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lz9/e;->f:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lz9/e;->h:Ljava/util/List;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lma/h;

    .line 24
    .line 25
    invoke-interface {v1}, Lma/h;->onPlayEnd()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, p0, Lz9/e;->h:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public t()V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->e:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lz9/e;->f:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lz9/e;->h:Ljava/util/List;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lma/h;

    .line 24
    .line 25
    invoke-interface {v1}, Lma/h;->onPlayStart()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method public u()V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->h:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lz9/e;->f:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lz9/e;->h:Ljava/util/List;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lma/h;

    .line 24
    .line 25
    invoke-interface {v1}, Lma/h;->onPlayEnd()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

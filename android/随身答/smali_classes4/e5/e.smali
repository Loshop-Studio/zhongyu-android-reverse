.class public abstract Le5/e;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field public a:La5/c;

.field public b:Ll5/e;

.field public c:Lz4/a;

.field public d:Lcom/zykj/blackboard/enums/PlayStatus;

.field public e:Lv4/e;

.field public f:Ljava/util/List;

.field public g:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->f:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 5
    .line 6
    iput-object v0, p0, Le5/e;->d:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Le5/e;->f:Ljava/util/List;

    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Le5/e;->g:Ljava/util/List;

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
    iget-object v0, p0, Le5/e;->g:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()La5/c;
    .locals 1

    .line 1
    iget-object v0, p0, Le5/e;->a:La5/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lz4/a;
    .locals 1

    .line 1
    iget-object v0, p0, Le5/e;->c:Lz4/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Le5/e;->f:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Lv4/e;
    .locals 1

    .line 1
    iget-object v0, p0, Le5/e;->e:Lv4/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Lcom/zykj/blackboard/enums/PlayStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Le5/e;->d:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Ll5/e;
    .locals 1

    .line 1
    iget-object v0, p0, Le5/e;->b:Ll5/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Lcom/zykj/blackboard/enums/PlayStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Le5/e;->d:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Le5/e;->g:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Le5/d;

    .line 18
    .line 19
    invoke-interface {v1, p0, p1}, Le5/d;->a(Le5/e;Z)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public final j(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Le5/e;->f:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ls5/h;

    .line 18
    .line 19
    invoke-interface {v1, p1, p2}, Ls5/h;->onProgress(J)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public k()V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->d:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Le5/e;->d:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Le5/e;->f:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ls5/h;

    .line 22
    .line 23
    invoke-interface {v1}, Ls5/h;->onPlayPause()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public l()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->f:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Le5/e;->d:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 4
    .line 5
    return-void
.end method

.method public m()V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->e:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Le5/e;->d:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Le5/e;->f:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ls5/h;

    .line 22
    .line 23
    invoke-interface {v1}, Ls5/h;->onPlayResume()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public final n(La5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le5/e;->a:La5/c;

    .line 2
    .line 3
    return-void
.end method

.method public final o(Lz4/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le5/e;->c:Lz4/a;

    .line 2
    .line 3
    return-void
.end method

.method public final p(Lv4/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le5/e;->e:Lv4/e;

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Le5/e;->d:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 7
    .line 8
    return-void
.end method

.method public final r(Ll5/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le5/e;->b:Ll5/e;

    .line 2
    .line 3
    return-void
.end method

.method public s()V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->f:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Le5/e;->d:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Le5/e;->f:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ls5/h;

    .line 22
    .line 23
    invoke-interface {v1}, Ls5/h;->onPlayEnd()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v0, p0, Le5/e;->f:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public t()V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->c:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Le5/e;->d:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Le5/e;->f:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ls5/h;

    .line 22
    .line 23
    invoke-interface {v1}, Ls5/h;->onPlayStart()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public u()V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->f:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Le5/e;->d:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Le5/e;->f:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ls5/h;

    .line 22
    .line 23
    invoke-interface {v1}, Ls5/h;->onPlayEnd()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

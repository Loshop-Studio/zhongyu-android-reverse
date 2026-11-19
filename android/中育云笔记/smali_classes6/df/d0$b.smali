.class public final Ldf/d0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Lje/e$a;

.field public b:Lje/r;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public e:Ljava/util/concurrent/Executor;

.field public f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ldf/d0$b;->c:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ldf/d0$b;->d:Ljava/util/List;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a(Ldf/h$a;)Ldf/d0$b;
    .locals 2

    .line 1
    iget-object v0, p0, Ldf/d0$b;->c:Ljava/util/List;

    .line 2
    .line 3
    const-string v1, "factory == null"

    .line 4
    .line 5
    invoke-static {p1, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public b(Ljava/lang/String;)Ldf/d0$b;
    .locals 1

    .line 1
    const-string v0, "baseUrl == null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lje/r;->h(Ljava/lang/String;)Lje/r;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, Ldf/d0$b;->c(Lje/r;)Ldf/d0$b;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public c(Lje/r;)Ldf/d0$b;
    .locals 3

    .line 1
    const-string v0, "baseUrl == null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lje/r;->m()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, ""

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iput-object p1, p0, Ldf/d0$b;->b:Lje/r;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v2, "baseUrl must end in /: "

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0
.end method

.method public d()Ldf/d0;
    .locals 10

    .line 1
    iget-object v0, p0, Ldf/d0$b;->b:Lje/r;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Ldf/d0$b;->a:Lje/e$a;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lje/v;

    .line 10
    .line 11
    invoke-direct {v0}, Lje/v;-><init>()V

    .line 12
    .line 13
    .line 14
    :cond_0
    move-object v2, v0

    .line 15
    iget-object v0, p0, Ldf/d0$b;->e:Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    sget-object v0, Ldf/w;->a:Ljava/util/concurrent/Executor;

    .line 20
    .line 21
    :cond_1
    move-object v8, v0

    .line 22
    sget-object v0, Ldf/w;->c:Ldf/c;

    .line 23
    .line 24
    new-instance v1, Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object v3, p0, Ldf/d0$b;->d:Ljava/util/List;

    .line 27
    .line 28
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v8}, Ldf/c;->a(Ljava/util/concurrent/Executor;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-interface {v1, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ldf/c;->b()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    new-instance v4, Ljava/util/ArrayList;

    .line 47
    .line 48
    iget-object v6, p0, Ldf/d0$b;->c:Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    add-int/lit8 v6, v6, 0x1

    .line 55
    .line 56
    add-int/2addr v6, v5

    .line 57
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 58
    .line 59
    .line 60
    new-instance v6, Ldf/b;

    .line 61
    .line 62
    invoke-direct {v6}, Ldf/b;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    iget-object v6, p0, Ldf/d0$b;->c:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v4, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 71
    .line 72
    .line 73
    invoke-interface {v4, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 74
    .line 75
    .line 76
    move-object v0, v1

    .line 77
    new-instance v1, Ldf/d0;

    .line 78
    .line 79
    move-object v6, v3

    .line 80
    iget-object v3, p0, Ldf/d0$b;->b:Lje/r;

    .line 81
    .line 82
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    iget-boolean v9, p0, Ldf/d0$b;->f:Z

    .line 95
    .line 96
    move-object v6, v0

    .line 97
    invoke-direct/range {v1 .. v9}, Ldf/d0;-><init>(Lje/e$a;Lje/r;Ljava/util/List;ILjava/util/List;ILjava/util/concurrent/Executor;Z)V

    .line 98
    .line 99
    .line 100
    return-object v1

    .line 101
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 102
    .line 103
    const-string v1, "Base URL required."

    .line 104
    .line 105
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw v0
.end method

.method public e(Lje/e$a;)Ldf/d0$b;
    .locals 1

    .line 1
    const-string v0, "factory == null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    check-cast p1, Lje/e$a;

    .line 7
    .line 8
    iput-object p1, p0, Ldf/d0$b;->a:Lje/e$a;

    .line 9
    .line 10
    return-object p0
.end method

.method public f(Lje/v;)Ldf/d0$b;
    .locals 1

    .line 1
    const-string v0, "client == null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    check-cast p1, Lje/e$a;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ldf/d0$b;->e(Lje/e$a;)Ldf/d0$b;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

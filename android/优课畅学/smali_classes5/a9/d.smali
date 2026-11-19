.class public La9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz8/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La9/d$e;,
        La9/d$d;,
        La9/d$c;,
        La9/d$a;,
        La9/d$b;
    }
.end annotation


# instance fields
.field public a:Ljava/util/Collection;

.field public b:La9/d;

.field public c:Lz8/c;

.field public d:Lz8/c;

.field public e:Lz8/c;

.field public f:Lz8/c;

.field public g:La9/d$b;

.field public h:I

.field public i:I

.field public j:La9/d$a;

.field public k:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0, v0}, La9/d;-><init>(IZ)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, La9/d;-><init>(IZ)V

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 3

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput v0, p0, La9/d;->h:I

    .line 5
    iput v0, p0, La9/d;->i:I

    if-nez p1, :cond_0

    .line 6
    new-instance v1, La9/d$c;

    invoke-direct {v1, p0, p2}, La9/d$c;-><init>(La9/d;Z)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    .line 7
    new-instance v1, La9/d$d;

    invoke-direct {v1, p0, p2}, La9/d$d;-><init>(La9/d;Z)V

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    if-ne p1, v1, :cond_2

    .line 8
    new-instance v1, La9/d$e;

    invoke-direct {v1, p0, p2}, La9/d$e;-><init>(La9/d;Z)V

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x4

    if-ne p1, v2, :cond_3

    .line 9
    new-instance p2, Ljava/util/LinkedList;

    invoke-direct {p2}, Ljava/util/LinkedList;-><init>()V

    iput-object p2, p0, La9/d;->a:Ljava/util/Collection;

    goto :goto_1

    .line 10
    :cond_3
    iput-boolean p2, p0, La9/d;->k:Z

    .line 11
    invoke-virtual {v1, p2}, La9/d$a;->b(Z)V

    .line 12
    new-instance p2, Ljava/util/TreeSet;

    invoke-direct {p2, v1}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    iput-object p2, p0, La9/d;->a:Ljava/util/Collection;

    .line 13
    iput-object v1, p0, La9/d;->j:La9/d$a;

    .line 14
    :goto_1
    iput p1, p0, La9/d;->i:I

    .line 15
    iput v0, p0, La9/d;->h:I

    .line 16
    new-instance p1, La9/d$b;

    iget-object p2, p0, La9/d;->a:Ljava/util/Collection;

    invoke-direct {p1, p0, p2}, La9/d$b;-><init>(La9/d;Ljava/util/Collection;)V

    iput-object p1, p0, La9/d;->g:La9/d$b;

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 18
    iput v0, p0, La9/d;->h:I

    .line 19
    iput v0, p0, La9/d;->i:I

    .line 20
    invoke-virtual {p0, p1}, La9/d;->i(Ljava/util/Collection;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 21
    invoke-direct {p0, v0, p1}, La9/d;-><init>(IZ)V

    return-void
.end method

.method public static synthetic f(La9/d;)I
    .locals 0

    .line 1
    iget p0, p0, La9/d;->h:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic g(La9/d;)I
    .locals 2

    .line 1
    iget v0, p0, La9/d;->h:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, -0x1

    .line 4
    .line 5
    iput v1, p0, La9/d;->h:I

    .line 6
    .line 7
    return v0
.end method


# virtual methods
.method public a(JJ)Lz8/l;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, La9/d;->j(JJ)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p2, Ljava/util/LinkedList;

    .line 15
    .line 16
    invoke-direct {p2, p1}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    new-instance p1, La9/d;

    .line 20
    .line 21
    invoke-direct {p1, p2}, La9/d;-><init>(Ljava/util/Collection;)V

    .line 22
    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 26
    return-object p1
.end method

.method public b(Lz8/c;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p1}, Lz8/c;->s()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lz8/c;->D(Z)V

    .line 12
    .line 13
    .line 14
    :cond_1
    iget-object v1, p0, La9/d;->a:Ljava/util/Collection;

    .line 15
    .line 16
    invoke-interface {v1, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    iget p1, p0, La9/d;->h:I

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    sub-int/2addr p1, v0

    .line 26
    iput p1, p0, La9/d;->h:I

    .line 27
    .line 28
    :cond_2
    return v0
.end method

.method public c(JJ)Lz8/l;
    .locals 4

    .line 1
    iget-object v0, p0, La9/d;->a:Ljava/util/Collection;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_1

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, La9/d;->b:La9/d;

    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    iget v0, p0, La9/d;->i:I

    .line 19
    .line 20
    if-ne v0, v1, :cond_1

    .line 21
    .line 22
    new-instance v0, La9/d;

    .line 23
    .line 24
    invoke-direct {v0, v1}, La9/d;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, La9/d;->b:La9/d;

    .line 28
    .line 29
    iget-object v2, p0, La9/d;->a:Ljava/util/Collection;

    .line 30
    .line 31
    invoke-virtual {v0, v2}, La9/d;->i(Ljava/util/Collection;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    new-instance v0, La9/d;

    .line 36
    .line 37
    iget-boolean v2, p0, La9/d;->k:Z

    .line 38
    .line 39
    invoke-direct {v0, v2}, La9/d;-><init>(Z)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, La9/d;->b:La9/d;

    .line 43
    .line 44
    :cond_2
    :goto_0
    iget v0, p0, La9/d;->i:I

    .line 45
    .line 46
    if-ne v0, v1, :cond_3

    .line 47
    .line 48
    iget-object p1, p0, La9/d;->b:La9/d;

    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_3
    iget-object v0, p0, La9/d;->c:Lz8/c;

    .line 52
    .line 53
    if-nez v0, :cond_4

    .line 54
    .line 55
    const-string v0, "start"

    .line 56
    .line 57
    invoke-virtual {p0, v0}, La9/d;->h(Ljava/lang/String;)Lz8/c;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, La9/d;->c:Lz8/c;

    .line 62
    .line 63
    :cond_4
    iget-object v0, p0, La9/d;->d:Lz8/c;

    .line 64
    .line 65
    if-nez v0, :cond_5

    .line 66
    .line 67
    const-string v0, "end"

    .line 68
    .line 69
    invoke-virtual {p0, v0}, La9/d;->h(Ljava/lang/String;)Lz8/c;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, La9/d;->d:Lz8/c;

    .line 74
    .line 75
    :cond_5
    iget-object v0, p0, La9/d;->b:La9/d;

    .line 76
    .line 77
    if-eqz v0, :cond_6

    .line 78
    .line 79
    iget-object v0, p0, La9/d;->c:Lz8/c;

    .line 80
    .line 81
    invoke-virtual {v0}, Lz8/c;->b()J

    .line 82
    .line 83
    .line 84
    move-result-wide v0

    .line 85
    sub-long v0, p1, v0

    .line 86
    .line 87
    const-wide/16 v2, 0x0

    .line 88
    .line 89
    cmp-long v0, v0, v2

    .line 90
    .line 91
    if-ltz v0, :cond_6

    .line 92
    .line 93
    iget-object v0, p0, La9/d;->d:Lz8/c;

    .line 94
    .line 95
    invoke-virtual {v0}, Lz8/c;->b()J

    .line 96
    .line 97
    .line 98
    move-result-wide v0

    .line 99
    cmp-long v0, p3, v0

    .line 100
    .line 101
    if-gtz v0, :cond_6

    .line 102
    .line 103
    iget-object p1, p0, La9/d;->b:La9/d;

    .line 104
    .line 105
    return-object p1

    .line 106
    :cond_6
    iget-object v0, p0, La9/d;->c:Lz8/c;

    .line 107
    .line 108
    invoke-virtual {v0, p1, p2}, Lz8/c;->B(J)V

    .line 109
    .line 110
    .line 111
    iget-object p1, p0, La9/d;->d:Lz8/c;

    .line 112
    .line 113
    invoke-virtual {p1, p3, p4}, Lz8/c;->B(J)V

    .line 114
    .line 115
    .line 116
    iget-object p1, p0, La9/d;->b:La9/d;

    .line 117
    .line 118
    iget-object p2, p0, La9/d;->a:Ljava/util/Collection;

    .line 119
    .line 120
    check-cast p2, Ljava/util/SortedSet;

    .line 121
    .line 122
    iget-object p3, p0, La9/d;->c:Lz8/c;

    .line 123
    .line 124
    iget-object p4, p0, La9/d;->d:Lz8/c;

    .line 125
    .line 126
    invoke-interface {p2, p3, p4}, Ljava/util/SortedSet;->subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    invoke-virtual {p1, p2}, La9/d;->i(Ljava/util/Collection;)V

    .line 131
    .line 132
    .line 133
    iget-object p1, p0, La9/d;->b:La9/d;

    .line 134
    .line 135
    return-object p1

    .line 136
    :cond_7
    :goto_1
    const/4 p1, 0x0

    .line 137
    return-object p1
.end method

.method public clear()V
    .locals 2

    .line 1
    iget-object v0, p0, La9/d;->a:Ljava/util/Collection;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, La9/d;->h:I

    .line 10
    .line 11
    new-instance v0, La9/d$b;

    .line 12
    .line 13
    iget-object v1, p0, La9/d;->a:Ljava/util/Collection;

    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, La9/d$b;-><init>(La9/d;Ljava/util/Collection;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La9/d;->g:La9/d$b;

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, La9/d;->b:La9/d;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, La9/d;->b:La9/d;

    .line 26
    .line 27
    const-string v0, "start"

    .line 28
    .line 29
    invoke-virtual {p0, v0}, La9/d;->h(Ljava/lang/String;)Lz8/c;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, La9/d;->c:Lz8/c;

    .line 34
    .line 35
    const-string v0, "end"

    .line 36
    .line 37
    invoke-virtual {p0, v0}, La9/d;->h(Ljava/lang/String;)Lz8/c;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, La9/d;->d:Lz8/c;

    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public d(Lz8/c;)Z
    .locals 1

    .line 1
    iget-object v0, p0, La9/d;->a:Ljava/util/Collection;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method public e(Lz8/c;)Z
    .locals 1

    .line 1
    iget-object v0, p0, La9/d;->a:Ljava/util/Collection;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget p1, p0, La9/d;->h:I

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    add-int/2addr p1, v0

    .line 15
    iput p1, p0, La9/d;->h:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    return v0

    .line 18
    :catch_0
    move-exception p1

    .line 19
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 20
    .line 21
    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    return p1
.end method

.method public first()Lz8/c;
    .locals 2

    .line 1
    iget-object v0, p0, La9/d;->a:Ljava/util/Collection;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget v0, p0, La9/d;->i:I

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, La9/d;->a:Ljava/util/Collection;

    .line 17
    .line 18
    check-cast v0, Ljava/util/LinkedList;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lz8/c;

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_0
    iget-object v0, p0, La9/d;->a:Ljava/util/Collection;

    .line 28
    .line 29
    check-cast v0, Ljava/util/SortedSet;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/SortedSet;->first()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lz8/c;

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    return-object v0
.end method

.method public final h(Ljava/lang/String;)Lz8/c;
    .locals 1

    .line 1
    new-instance v0, Lz8/d;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lz8/d;-><init>(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public i(Ljava/util/Collection;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, La9/d;->k:Z

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, La9/d;->i:I

    .line 7
    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, La9/d;->a:Ljava/util/Collection;

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La9/d;->a:Ljava/util/Collection;

    .line 16
    .line 17
    invoke-interface {v0, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, La9/d;->a:Ljava/util/Collection;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iput-object p1, p0, La9/d;->a:Ljava/util/Collection;

    .line 24
    .line 25
    :goto_0
    instance-of v0, p1, Ljava/util/List;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iput v1, p0, La9/d;->i:I

    .line 30
    .line 31
    :cond_1
    if-nez p1, :cond_2

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    :goto_1
    iput v0, p0, La9/d;->h:I

    .line 40
    .line 41
    iget-object v0, p0, La9/d;->g:La9/d$b;

    .line 42
    .line 43
    if-nez v0, :cond_3

    .line 44
    .line 45
    new-instance v0, La9/d$b;

    .line 46
    .line 47
    invoke-direct {v0, p0, p1}, La9/d$b;-><init>(La9/d;Ljava/util/Collection;)V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, La9/d;->g:La9/d$b;

    .line 51
    .line 52
    return-void

    .line 53
    :cond_3
    invoke-virtual {v0, p1}, La9/d$b;->b(Ljava/util/Collection;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, La9/d;->a:Ljava/util/Collection;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    return v0
.end method

.method public iterator()Lz8/k;
    .locals 1

    .line 1
    iget-object v0, p0, La9/d;->g:La9/d$b;

    .line 2
    .line 3
    invoke-virtual {v0}, La9/d$b;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La9/d;->g:La9/d$b;

    .line 7
    .line 8
    return-object v0
.end method

.method public final j(JJ)Ljava/util/Collection;
    .locals 2

    .line 1
    iget v0, p0, La9/d;->i:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-eq v0, v1, :cond_4

    .line 5
    .line 6
    iget-object v0, p0, La9/d;->a:Ljava/util/Collection;

    .line 7
    .line 8
    if-eqz v0, :cond_4

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, p0, La9/d;->b:La9/d;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    new-instance v0, La9/d;

    .line 22
    .line 23
    iget-boolean v1, p0, La9/d;->k:Z

    .line 24
    .line 25
    invoke-direct {v0, v1}, La9/d;-><init>(Z)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, La9/d;->b:La9/d;

    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, La9/d;->f:Lz8/c;

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    const-string v0, "start"

    .line 35
    .line 36
    invoke-virtual {p0, v0}, La9/d;->h(Ljava/lang/String;)Lz8/c;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, La9/d;->f:Lz8/c;

    .line 41
    .line 42
    :cond_2
    iget-object v0, p0, La9/d;->e:Lz8/c;

    .line 43
    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    const-string v0, "end"

    .line 47
    .line 48
    invoke-virtual {p0, v0}, La9/d;->h(Ljava/lang/String;)Lz8/c;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, La9/d;->e:Lz8/c;

    .line 53
    .line 54
    :cond_3
    iget-object v0, p0, La9/d;->f:Lz8/c;

    .line 55
    .line 56
    invoke-virtual {v0, p1, p2}, Lz8/c;->B(J)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, La9/d;->e:Lz8/c;

    .line 60
    .line 61
    invoke-virtual {p1, p3, p4}, Lz8/c;->B(J)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, La9/d;->a:Ljava/util/Collection;

    .line 65
    .line 66
    check-cast p1, Ljava/util/SortedSet;

    .line 67
    .line 68
    iget-object p2, p0, La9/d;->f:Lz8/c;

    .line 69
    .line 70
    iget-object p3, p0, La9/d;->e:Lz8/c;

    .line 71
    .line 72
    invoke-interface {p1, p2, p3}, Ljava/util/SortedSet;->subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    return-object p1

    .line 77
    :cond_4
    :goto_0
    const/4 p1, 0x0

    .line 78
    return-object p1
.end method

.method public last()Lz8/c;
    .locals 2

    .line 1
    iget-object v0, p0, La9/d;->a:Ljava/util/Collection;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget v0, p0, La9/d;->i:I

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, La9/d;->a:Ljava/util/Collection;

    .line 17
    .line 18
    move-object v1, v0

    .line 19
    check-cast v1, Ljava/util/LinkedList;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    add-int/lit8 v0, v0, -0x1

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lz8/c;

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_0
    iget-object v0, p0, La9/d;->a:Ljava/util/Collection;

    .line 35
    .line 36
    check-cast v0, Ljava/util/SortedSet;

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/SortedSet;->last()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lz8/c;

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_1
    const/4 v0, 0x0

    .line 46
    return-object v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget v0, p0, La9/d;->h:I

    .line 2
    .line 3
    return v0
.end method

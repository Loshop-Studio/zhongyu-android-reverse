.class public final Lio/objectbox/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public d:Ljava/lang/Integer;

.field public e:Ljava/lang/Long;

.field public f:Ljava/lang/Integer;

.field public g:Ljava/lang/Integer;

.field public h:Ljava/lang/Long;

.field public i:Lio/objectbox/d;

.field public j:Z

.field public final synthetic k:Lio/objectbox/e;


# direct methods
.method public constructor <init>(Lio/objectbox/e;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/objectbox/c;->k:Lio/objectbox/e;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lio/objectbox/c;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    new-instance p1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lio/objectbox/c;->c:Ljava/util/ArrayList;

    .line 19
    .line 20
    iput-object p2, p0, Lio/objectbox/c;->a:Ljava/lang/String;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    iget-object v0, p0, Lio/objectbox/c;->i:Lio/objectbox/d;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/objectbox/d;->a()V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, v0, Lio/objectbox/d;->e:Z

    .line 10
    .line 11
    iget-object v2, v0, Lio/objectbox/d;->k:Lio/objectbox/e;

    .line 12
    .line 13
    iget-object v2, v2, Lio/objectbox/e;->a:Lcom/google/flatbuffers/a;

    .line 14
    .line 15
    const/16 v3, 0x9

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Lcom/google/flatbuffers/a;->l(I)V

    .line 18
    .line 19
    .line 20
    iget v3, v0, Lio/objectbox/d;->c:I

    .line 21
    .line 22
    invoke-virtual {v2, v1, v3}, Lcom/google/flatbuffers/a;->b(II)V

    .line 23
    .line 24
    .line 25
    iget v1, v0, Lio/objectbox/d;->d:I

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    const/4 v3, 0x5

    .line 30
    invoke-virtual {v2, v3, v1}, Lcom/google/flatbuffers/a;->b(II)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget v1, v0, Lio/objectbox/d;->b:I

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    const/4 v3, 0x6

    .line 38
    invoke-virtual {v2, v3, v1}, Lcom/google/flatbuffers/a;->b(II)V

    .line 39
    .line 40
    .line 41
    :cond_1
    iget v1, v0, Lio/objectbox/d;->g:I

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    int-to-long v3, v1

    .line 46
    iget-wide v5, v0, Lio/objectbox/d;->h:J

    .line 47
    .line 48
    invoke-static {v2, v3, v4, v5, v6}, Ly1/a;->i(Lcom/google/flatbuffers/a;JJ)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-virtual {v2, v3, v1}, Lcom/google/flatbuffers/a;->d(II)V

    .line 54
    .line 55
    .line 56
    :cond_2
    iget v1, v0, Lio/objectbox/d;->i:I

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    int-to-long v3, v1

    .line 61
    iget-wide v5, v0, Lio/objectbox/d;->j:J

    .line 62
    .line 63
    invoke-static {v2, v3, v4, v5, v6}, Ly1/a;->i(Lcom/google/flatbuffers/a;JJ)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    const/4 v3, 0x4

    .line 68
    invoke-virtual {v2, v3, v1}, Lcom/google/flatbuffers/a;->d(II)V

    .line 69
    .line 70
    .line 71
    :cond_3
    iget v1, v0, Lio/objectbox/d;->a:I

    .line 72
    .line 73
    int-to-short v1, v1

    .line 74
    iget-boolean v3, v2, Lcom/google/flatbuffers/a;->l:Z

    .line 75
    .line 76
    if-nez v3, :cond_4

    .line 77
    .line 78
    if-eqz v1, :cond_5

    .line 79
    .line 80
    :cond_4
    invoke-virtual {v2, v1}, Lcom/google/flatbuffers/a;->c(S)V

    .line 81
    .line 82
    .line 83
    const/4 v1, 0x2

    .line 84
    invoke-virtual {v2, v1}, Lcom/google/flatbuffers/a;->k(I)V

    .line 85
    .line 86
    .line 87
    :cond_5
    iget v0, v0, Lio/objectbox/d;->f:I

    .line 88
    .line 89
    if-eqz v0, :cond_6

    .line 90
    .line 91
    int-to-long v0, v0

    .line 92
    const/4 v3, 0x3

    .line 93
    long-to-int v0, v0

    .line 94
    invoke-virtual {v2, v3, v0}, Lcom/google/flatbuffers/a;->a(II)V

    .line 95
    .line 96
    .line 97
    :cond_6
    invoke-virtual {v2}, Lcom/google/flatbuffers/a;->f()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-object v1, p0, Lio/objectbox/c;->b:Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    const/4 v0, 0x0

    .line 111
    iput-object v0, p0, Lio/objectbox/c;->i:Lio/objectbox/d;

    .line 112
    .line 113
    :cond_7
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lio/objectbox/c;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "Already finished"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final c()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lio/objectbox/c;->b()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lio/objectbox/c;->a()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lio/objectbox/c;->j:Z

    .line 9
    .line 10
    iget-object v1, p0, Lio/objectbox/c;->k:Lio/objectbox/e;

    .line 11
    .line 12
    iget-object v2, v1, Lio/objectbox/e;->a:Lcom/google/flatbuffers/a;

    .line 13
    .line 14
    iget-object v3, p0, Lio/objectbox/c;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v2, v3}, Lcom/google/flatbuffers/a;->e(Ljava/lang/CharSequence;)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    iget-object v4, p0, Lio/objectbox/c;->b:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v1, v4}, Lio/objectbox/e;->a(Ljava/util/List;)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    iget-object v5, p0, Lio/objectbox/c;->c:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    const/4 v7, 0x0

    .line 33
    if-eqz v6, :cond_0

    .line 34
    .line 35
    move v5, v7

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v1, v5}, Lio/objectbox/e;->a(Ljava/util/List;)I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    :goto_0
    const/4 v6, 0x7

    .line 42
    invoke-virtual {v2, v6}, Lcom/google/flatbuffers/a;->l(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v0, v3}, Lcom/google/flatbuffers/a;->b(II)V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    invoke-virtual {v2, v0, v4}, Lcom/google/flatbuffers/a;->b(II)V

    .line 50
    .line 51
    .line 52
    if-eqz v5, :cond_1

    .line 53
    .line 54
    const/4 v0, 0x4

    .line 55
    invoke-virtual {v2, v0, v5}, Lcom/google/flatbuffers/a;->b(II)V

    .line 56
    .line 57
    .line 58
    :cond_1
    iget-object v0, p0, Lio/objectbox/c;->d:Ljava/lang/Integer;

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    iget-object v3, p0, Lio/objectbox/c;->e:Ljava/lang/Long;

    .line 63
    .line 64
    if-eqz v3, :cond_2

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    int-to-long v3, v0

    .line 71
    iget-object v0, p0, Lio/objectbox/c;->e:Ljava/lang/Long;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 74
    .line 75
    .line 76
    move-result-wide v5

    .line 77
    invoke-static {v2, v3, v4, v5, v6}, Ly1/a;->i(Lcom/google/flatbuffers/a;JJ)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-virtual {v2, v7, v0}, Lcom/google/flatbuffers/a;->d(II)V

    .line 82
    .line 83
    .line 84
    :cond_2
    iget-object v0, p0, Lio/objectbox/c;->g:Ljava/lang/Integer;

    .line 85
    .line 86
    if-eqz v0, :cond_3

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    int-to-long v3, v0

    .line 93
    iget-object v0, p0, Lio/objectbox/c;->h:Ljava/lang/Long;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 96
    .line 97
    .line 98
    move-result-wide v5

    .line 99
    invoke-static {v2, v3, v4, v5, v6}, Ly1/a;->i(Lcom/google/flatbuffers/a;JJ)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    const/4 v3, 0x3

    .line 104
    invoke-virtual {v2, v3, v0}, Lcom/google/flatbuffers/a;->d(II)V

    .line 105
    .line 106
    .line 107
    :cond_3
    iget-object v0, p0, Lio/objectbox/c;->f:Ljava/lang/Integer;

    .line 108
    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    int-to-long v3, v0

    .line 116
    const/4 v0, 0x5

    .line 117
    long-to-int v3, v3

    .line 118
    invoke-virtual {v2, v0, v3}, Lcom/google/flatbuffers/a;->a(II)V

    .line 119
    .line 120
    .line 121
    :cond_4
    iget-object v0, v1, Lio/objectbox/e;->b:Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-virtual {v2}, Lcom/google/flatbuffers/a;->f()I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iput-object v0, p0, Lio/objectbox/c;->f:Ljava/lang/Integer;

    .line 7
    .line 8
    return-void
.end method

.method public final e(IJ)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/objectbox/c;->b()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lio/objectbox/c;->d:Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lio/objectbox/c;->e:Ljava/lang/Long;

    .line 15
    .line 16
    return-void
.end method

.method public final f(IJ)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/objectbox/c;->b()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lio/objectbox/c;->g:Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lio/objectbox/c;->h:Ljava/lang/Long;

    .line 15
    .line 16
    return-void
.end method

.method public final g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/objectbox/d;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lio/objectbox/c;->b()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lio/objectbox/c;->a()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lio/objectbox/d;

    .line 8
    .line 9
    iget-object v1, p0, Lio/objectbox/c;->k:Lio/objectbox/e;

    .line 10
    .line 11
    move v5, p1

    .line 12
    move-object v2, p2

    .line 13
    move-object v3, p3

    .line 14
    move-object v4, p4

    .line 15
    invoke-direct/range {v0 .. v5}, Lio/objectbox/d;-><init>(Lio/objectbox/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lio/objectbox/c;->i:Lio/objectbox/d;

    .line 19
    .line 20
    return-object v0
.end method

.method public final h(Ljava/lang/String;IJIJ)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lio/objectbox/c;->b()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lio/objectbox/c;->a()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lio/objectbox/c;->k:Lio/objectbox/e;

    .line 8
    .line 9
    iget-object v0, v0, Lio/objectbox/e;->a:Lcom/google/flatbuffers/a;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/google/flatbuffers/a;->e(Ljava/lang/CharSequence;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v1, 0x3

    .line 16
    invoke-virtual {v0, v1}, Lcom/google/flatbuffers/a;->l(I)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {v0, v1, p1}, Lcom/google/flatbuffers/a;->b(II)V

    .line 21
    .line 22
    .line 23
    int-to-long p1, p2

    .line 24
    invoke-static {v0, p1, p2, p3, p4}, Ly1/a;->i(Lcom/google/flatbuffers/a;JJ)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-virtual {v0, p2, p1}, Lcom/google/flatbuffers/a;->d(II)V

    .line 30
    .line 31
    .line 32
    int-to-long p1, p5

    .line 33
    invoke-static {v0, p1, p2, p6, p7}, Ly1/a;->i(Lcom/google/flatbuffers/a;JJ)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const/4 p2, 0x2

    .line 38
    invoke-virtual {v0, p2, p1}, Lcom/google/flatbuffers/a;->d(II)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/google/flatbuffers/a;->f()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object p2, p0, Lio/objectbox/c;->c:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    return-void
.end method

.class public Lq8/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq8/e$a;,
        Lq8/e$b;
    }
.end annotation


# instance fields
.field public final a:Lcom/google/flatbuffers/FlatBufferBuilder;

.field public final b:Ljava/util/List;

.field public c:J

.field public d:Ljava/lang/Integer;

.field public e:Ljava/lang/Long;

.field public f:Ljava/lang/Integer;

.field public g:Ljava/lang/Long;

.field public h:Ljava/lang/Integer;

.field public i:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/google/flatbuffers/FlatBufferBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lq8/e;->a:Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lq8/e;->b:Ljava/util/List;

    .line 17
    .line 18
    const-wide/16 v0, 0x1

    .line 19
    .line 20
    iput-wide v0, p0, Lq8/e;->c:J

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public a()[B
    .locals 6

    .line 1
    iget-object v0, p0, Lq8/e;->a:Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 2
    .line 3
    const-string v1, "default"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->createString(Ljava/lang/CharSequence;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lq8/e;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lq8/e;->b(Ljava/util/List;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object v2, p0, Lq8/e;->a:Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 16
    .line 17
    invoke-static {v2}, Ls8/c;->i(Lcom/google/flatbuffers/FlatBufferBuilder;)V

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, Lq8/e;->a:Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 21
    .line 22
    invoke-static {v2, v0}, Ls8/c;->f(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lq8/e;->a:Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 26
    .line 27
    const-wide/16 v2, 0x2

    .line 28
    .line 29
    invoke-static {v0, v2, v3}, Ls8/c;->e(Lcom/google/flatbuffers/FlatBufferBuilder;J)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lq8/e;->a:Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 33
    .line 34
    const-wide/16 v2, 0x1

    .line 35
    .line 36
    invoke-static {v0, v2, v3}, Ls8/c;->g(Lcom/google/flatbuffers/FlatBufferBuilder;J)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lq8/e;->a:Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 40
    .line 41
    invoke-static {v0, v1}, Ls8/c;->a(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lq8/e;->d:Ljava/lang/Integer;

    .line 45
    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    iget-object v1, p0, Lq8/e;->a:Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    int-to-long v2, v0

    .line 55
    iget-object v0, p0, Lq8/e;->e:Ljava/lang/Long;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 58
    .line 59
    .line 60
    move-result-wide v4

    .line 61
    invoke-static {v1, v2, v3, v4, v5}, Ls8/b;->a(Lcom/google/flatbuffers/FlatBufferBuilder;JJ)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iget-object v1, p0, Lq8/e;->a:Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 66
    .line 67
    invoke-static {v1, v0}, Ls8/c;->b(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 68
    .line 69
    .line 70
    :cond_0
    iget-object v0, p0, Lq8/e;->f:Ljava/lang/Integer;

    .line 71
    .line 72
    if-eqz v0, :cond_1

    .line 73
    .line 74
    iget-object v1, p0, Lq8/e;->a:Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    int-to-long v2, v0

    .line 81
    iget-object v0, p0, Lq8/e;->g:Ljava/lang/Long;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 84
    .line 85
    .line 86
    move-result-wide v4

    .line 87
    invoke-static {v1, v2, v3, v4, v5}, Ls8/b;->a(Lcom/google/flatbuffers/FlatBufferBuilder;JJ)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iget-object v1, p0, Lq8/e;->a:Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 92
    .line 93
    invoke-static {v1, v0}, Ls8/c;->c(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 94
    .line 95
    .line 96
    :cond_1
    iget-object v0, p0, Lq8/e;->h:Ljava/lang/Integer;

    .line 97
    .line 98
    if-eqz v0, :cond_2

    .line 99
    .line 100
    iget-object v1, p0, Lq8/e;->a:Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    int-to-long v2, v0

    .line 107
    iget-object v0, p0, Lq8/e;->i:Ljava/lang/Long;

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 110
    .line 111
    .line 112
    move-result-wide v4

    .line 113
    invoke-static {v1, v2, v3, v4, v5}, Ls8/b;->a(Lcom/google/flatbuffers/FlatBufferBuilder;JJ)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    iget-object v1, p0, Lq8/e;->a:Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 118
    .line 119
    invoke-static {v1, v0}, Ls8/c;->d(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    .line 120
    .line 121
    .line 122
    :cond_2
    iget-object v0, p0, Lq8/e;->a:Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 123
    .line 124
    invoke-static {v0}, Ls8/c;->h(Lcom/google/flatbuffers/FlatBufferBuilder;)I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    iget-object v1, p0, Lq8/e;->a:Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 129
    .line 130
    invoke-virtual {v1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    .line 131
    .line 132
    .line 133
    iget-object v0, p0, Lq8/e;->a:Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 134
    .line 135
    invoke-virtual {v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->sizedByteArray()[B

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    return-object v0
.end method

.method public b(Ljava/util/List;)I
    .locals 3

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v0, v0, [I

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-ge v1, v2, :cond_0

    .line 13
    .line 14
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    aput v2, v0, v1

    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object p1, p0, Lq8/e;->a:Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->createVectorOfTables([I)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    return p1
.end method

.method public c(Ljava/lang/String;)Lq8/e$a;
    .locals 1

    .line 1
    new-instance v0, Lq8/e$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lq8/e$a;-><init>(Lq8/e;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public d(IJ)Lq8/e;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lq8/e;->d:Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lq8/e;->e:Ljava/lang/Long;

    .line 12
    .line 13
    return-object p0
.end method

.method public e(IJ)Lq8/e;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lq8/e;->f:Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lq8/e;->g:Ljava/lang/Long;

    .line 12
    .line 13
    return-object p0
.end method

.method public f(IJ)Lq8/e;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lq8/e;->h:Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lq8/e;->i:Ljava/lang/Long;

    .line 12
    .line 13
    return-object p0
.end method

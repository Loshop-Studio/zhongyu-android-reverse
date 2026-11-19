.class public final Lio/objectbox/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/flatbuffers/a;

.field public final b:Ljava/util/ArrayList;

.field public c:Ljava/lang/Integer;

.field public d:Ljava/lang/Long;

.field public e:Ljava/lang/Integer;

.field public f:Ljava/lang/Long;

.field public g:Ljava/lang/Integer;

.field public h:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/flatbuffers/a;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/google/flatbuffers/a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/objectbox/e;->a:Lcom/google/flatbuffers/a;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lio/objectbox/e;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)I
    .locals 6

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v1, v0, [I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-ge v3, v4, :cond_0

    .line 14
    .line 15
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    check-cast v4, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    aput v4, v1, v3

    .line 26
    .line 27
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object p1, p0, Lio/objectbox/e;->a:Lcom/google/flatbuffers/a;

    .line 31
    .line 32
    iget-boolean v3, p1, Lcom/google/flatbuffers/a;->f:Z

    .line 33
    .line 34
    const-string v4, "FlatBuffers: object serialization must not be nested."

    .line 35
    .line 36
    if-nez v3, :cond_4

    .line 37
    .line 38
    if-nez v3, :cond_3

    .line 39
    .line 40
    iput v0, p1, Lcom/google/flatbuffers/a;->k:I

    .line 41
    .line 42
    const/4 v3, 0x4

    .line 43
    mul-int v4, v3, v0

    .line 44
    .line 45
    invoke-virtual {p1, v3, v4}, Lcom/google/flatbuffers/a;->h(II)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v3, v4}, Lcom/google/flatbuffers/a;->h(II)V

    .line 49
    .line 50
    .line 51
    const/4 v4, 0x1

    .line 52
    iput-boolean v4, p1, Lcom/google/flatbuffers/a;->f:Z

    .line 53
    .line 54
    sub-int/2addr v0, v4

    .line 55
    :goto_1
    if-ltz v0, :cond_1

    .line 56
    .line 57
    aget v4, v1, v0

    .line 58
    .line 59
    invoke-virtual {p1, v3, v2}, Lcom/google/flatbuffers/a;->h(II)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/google/flatbuffers/a;->g()I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    sub-int/2addr v5, v4

    .line 67
    add-int/2addr v5, v3

    .line 68
    invoke-virtual {p1, v5}, Lcom/google/flatbuffers/a;->i(I)V

    .line 69
    .line 70
    .line 71
    add-int/lit8 v0, v0, -0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    iget-boolean v0, p1, Lcom/google/flatbuffers/a;->f:Z

    .line 75
    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    iput-boolean v2, p1, Lcom/google/flatbuffers/a;->f:Z

    .line 79
    .line 80
    iget v0, p1, Lcom/google/flatbuffers/a;->k:I

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/a;->i(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/google/flatbuffers/a;->g()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    return p1

    .line 90
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 91
    .line 92
    const-string v0, "FlatBuffers: endVector called without startVector"

    .line 93
    .line 94
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    .line 99
    .line 100
    invoke-direct {p1, v4}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    throw p1

    .line 104
    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    .line 105
    .line 106
    invoke-direct {p1, v4}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    throw p1
.end method

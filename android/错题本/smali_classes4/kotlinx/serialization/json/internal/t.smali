.class public final Lkotlinx/serialization/json/internal/t;
.super Ll7/a;
.source "SourceFile"

# interfaces
.implements Ln7/h;


# instance fields
.field public final a:Ln7/b;

.field public final b:Lkotlinx/serialization/json/internal/WriteMode;

.field public final c:Lkotlinx/serialization/json/internal/x;

.field public final d:Lo7/e;

.field public e:I

.field public f:Le7/r;

.field public final g:Lkotlinx/serialization/json/internal/i;


# direct methods
.method public constructor <init>(Ln7/b;Lkotlinx/serialization/json/internal/WriteMode;Lkotlinx/serialization/json/internal/x;Lk7/g;Le7/r;)V
    .locals 1

    .line 1
    const-string v0, "json"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "mode"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "descriptor"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lkotlinx/serialization/json/internal/t;->a:Ln7/b;

    .line 20
    .line 21
    iput-object p2, p0, Lkotlinx/serialization/json/internal/t;->b:Lkotlinx/serialization/json/internal/WriteMode;

    .line 22
    .line 23
    iput-object p3, p0, Lkotlinx/serialization/json/internal/t;->c:Lkotlinx/serialization/json/internal/x;

    .line 24
    .line 25
    iget-object p2, p1, Ln7/b;->b:Lo7/e;

    .line 26
    .line 27
    iput-object p2, p0, Lkotlinx/serialization/json/internal/t;->d:Lo7/e;

    .line 28
    .line 29
    const/4 p2, -0x1

    .line 30
    iput p2, p0, Lkotlinx/serialization/json/internal/t;->e:I

    .line 31
    .line 32
    iput-object p5, p0, Lkotlinx/serialization/json/internal/t;->f:Le7/r;

    .line 33
    .line 34
    iget-object p1, p1, Ln7/b;->a:Ln7/g;

    .line 35
    .line 36
    iget-boolean p1, p1, Ln7/g;->c:Z

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance p1, Lkotlinx/serialization/json/internal/i;

    .line 43
    .line 44
    invoke-direct {p1, p4}, Lkotlinx/serialization/json/internal/i;-><init>(Lk7/g;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    iput-object p1, p0, Lkotlinx/serialization/json/internal/t;->g:Lkotlinx/serialization/json/internal/i;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final a()Ln7/j;
    .locals 3

    .line 1
    new-instance v0, Lkotlinx/serialization/json/internal/q;

    .line 2
    .line 3
    iget-object v1, p0, Lkotlinx/serialization/json/internal/t;->a:Ln7/b;

    .line 4
    .line 5
    iget-object v1, v1, Ln7/b;->a:Ln7/g;

    .line 6
    .line 7
    iget-object v2, p0, Lkotlinx/serialization/json/internal/t;->c:Lkotlinx/serialization/json/internal/x;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/json/internal/q;-><init>(Ln7/g;Lkotlinx/serialization/json/internal/x;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/q;->b()Ln7/j;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public final beginStructure(Lk7/g;)Ll7/c;
    .locals 9

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lkotlinx/serialization/json/internal/t;->a:Ln7/b;

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlinx/serialization/json/internal/j;->q(Lk7/g;Ln7/b;)Lkotlinx/serialization/json/internal/WriteMode;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    iget-object v4, p0, Lkotlinx/serialization/json/internal/t;->c:Lkotlinx/serialization/json/internal/x;

    .line 13
    .line 14
    iget-object v1, v4, Lkotlinx/serialization/json/internal/x;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lkotlinx/serialization/json/internal/l;

    .line 17
    .line 18
    iget v2, v1, Lkotlinx/serialization/json/internal/l;->b:I

    .line 19
    .line 20
    const/4 v5, 0x1

    .line 21
    add-int/2addr v2, v5

    .line 22
    iput v2, v1, Lkotlinx/serialization/json/internal/l;->b:I

    .line 23
    .line 24
    iget-object v6, v1, Lkotlinx/serialization/json/internal/l;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v6, [Ljava/lang/Object;

    .line 27
    .line 28
    array-length v7, v6

    .line 29
    if-ne v2, v7, :cond_0

    .line 30
    .line 31
    mul-int/lit8 v7, v2, 0x2

    .line 32
    .line 33
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    const-string v8, "copyOf(...)"

    .line 38
    .line 39
    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iput-object v6, v1, Lkotlinx/serialization/json/internal/l;->c:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v6, v1, Lkotlinx/serialization/json/internal/l;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v6, [I

    .line 47
    .line 48
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([II)[I

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iput-object v6, v1, Lkotlinx/serialization/json/internal/l;->d:Ljava/lang/Object;

    .line 56
    .line 57
    :cond_0
    iget-object v1, v1, Lkotlinx/serialization/json/internal/l;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, [Ljava/lang/Object;

    .line 60
    .line 61
    aput-object p1, v1, v2

    .line 62
    .line 63
    iget-char v1, v3, Lkotlinx/serialization/json/internal/WriteMode;->begin:C

    .line 64
    .line 65
    invoke-virtual {v4, v1}, Lkotlinx/serialization/json/internal/x;->g(C)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4}, Lkotlinx/serialization/json/internal/x;->q()B

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    const/4 v2, 0x4

    .line 73
    if-eq v1, v2, :cond_3

    .line 74
    .line 75
    sget-object v1, Lkotlinx/serialization/json/internal/s;->a:[I

    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    aget v1, v1, v2

    .line 82
    .line 83
    if-eq v1, v5, :cond_2

    .line 84
    .line 85
    const/4 v2, 0x2

    .line 86
    if-eq v1, v2, :cond_2

    .line 87
    .line 88
    const/4 v2, 0x3

    .line 89
    if-eq v1, v2, :cond_2

    .line 90
    .line 91
    iget-object v1, p0, Lkotlinx/serialization/json/internal/t;->b:Lkotlinx/serialization/json/internal/WriteMode;

    .line 92
    .line 93
    if-ne v1, v3, :cond_1

    .line 94
    .line 95
    iget-object v0, v0, Ln7/b;->a:Ln7/g;

    .line 96
    .line 97
    iget-boolean v0, v0, Ln7/g;->c:Z

    .line 98
    .line 99
    if-eqz v0, :cond_1

    .line 100
    .line 101
    return-object p0

    .line 102
    :cond_1
    new-instance v1, Lkotlinx/serialization/json/internal/t;

    .line 103
    .line 104
    iget-object v2, p0, Lkotlinx/serialization/json/internal/t;->a:Ln7/b;

    .line 105
    .line 106
    iget-object v6, p0, Lkotlinx/serialization/json/internal/t;->f:Le7/r;

    .line 107
    .line 108
    move-object v5, p1

    .line 109
    invoke-direct/range {v1 .. v6}, Lkotlinx/serialization/json/internal/t;-><init>(Ln7/b;Lkotlinx/serialization/json/internal/WriteMode;Lkotlinx/serialization/json/internal/x;Lk7/g;Le7/r;)V

    .line 110
    .line 111
    .line 112
    return-object v1

    .line 113
    :cond_2
    move-object v5, p1

    .line 114
    new-instance v1, Lkotlinx/serialization/json/internal/t;

    .line 115
    .line 116
    iget-object v2, p0, Lkotlinx/serialization/json/internal/t;->a:Ln7/b;

    .line 117
    .line 118
    iget-object v6, p0, Lkotlinx/serialization/json/internal/t;->f:Le7/r;

    .line 119
    .line 120
    invoke-direct/range {v1 .. v6}, Lkotlinx/serialization/json/internal/t;-><init>(Ln7/b;Lkotlinx/serialization/json/internal/WriteMode;Lkotlinx/serialization/json/internal/x;Lk7/g;Le7/r;)V

    .line 121
    .line 122
    .line 123
    return-object v1

    .line 124
    :cond_3
    const/4 p1, 0x0

    .line 125
    const/4 v0, 0x6

    .line 126
    const-string v1, "Unexpected leading comma"

    .line 127
    .line 128
    const/4 v2, 0x0

    .line 129
    invoke-static {v4, v1, p1, v2, v0}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 130
    .line 131
    .line 132
    throw v2
.end method

.method public final decodeBoolean()Z
    .locals 12

    .line 1
    iget-object v0, p0, Lkotlinx/serialization/json/internal/t;->c:Lkotlinx/serialization/json/internal/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->t()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, v0, Lkotlinx/serialization/json/internal/x;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const-string v4, "EOF"

    .line 16
    .line 17
    const/4 v5, 0x6

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v7, 0x0

    .line 20
    if-eq v1, v3, :cond_7

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/16 v8, 0x22

    .line 27
    .line 28
    const/4 v9, 0x1

    .line 29
    if-ne v3, v8, :cond_0

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    move v3, v9

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v3, v7

    .line 36
    :goto_0
    invoke-virtual {v0, v1}, Lkotlinx/serialization/json/internal/x;->s(I)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v10

    .line 44
    if-ge v1, v10, :cond_6

    .line 45
    .line 46
    const/4 v10, -0x1

    .line 47
    if-eq v1, v10, :cond_6

    .line 48
    .line 49
    add-int/lit8 v10, v1, 0x1

    .line 50
    .line 51
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    or-int/lit8 v1, v1, 0x20

    .line 56
    .line 57
    const/16 v11, 0x66

    .line 58
    .line 59
    if-eq v1, v11, :cond_2

    .line 60
    .line 61
    const/16 v11, 0x74

    .line 62
    .line 63
    if-ne v1, v11, :cond_1

    .line 64
    .line 65
    const-string v1, "rue"

    .line 66
    .line 67
    invoke-virtual {v0, v10, v1}, Lkotlinx/serialization/json/internal/x;->c(ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    move v1, v9

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v2, "Expected valid boolean literal prefix, but had \'"

    .line 75
    .line 76
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->j()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const/16 v2, 0x27

    .line 87
    .line 88
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-static {v0, v1, v7, v6, v5}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 96
    .line 97
    .line 98
    throw v6

    .line 99
    :cond_2
    const-string v1, "alse"

    .line 100
    .line 101
    invoke-virtual {v0, v10, v1}, Lkotlinx/serialization/json/internal/x;->c(ILjava/lang/String;)V

    .line 102
    .line 103
    .line 104
    move v1, v7

    .line 105
    :goto_1
    if-eqz v3, :cond_5

    .line 106
    .line 107
    iget v3, v0, Lkotlinx/serialization/json/internal/x;->b:I

    .line 108
    .line 109
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    if-eq v3, v10, :cond_4

    .line 114
    .line 115
    iget v3, v0, Lkotlinx/serialization/json/internal/x;->b:I

    .line 116
    .line 117
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-ne v2, v8, :cond_3

    .line 122
    .line 123
    iget v2, v0, Lkotlinx/serialization/json/internal/x;->b:I

    .line 124
    .line 125
    add-int/2addr v2, v9

    .line 126
    iput v2, v0, Lkotlinx/serialization/json/internal/x;->b:I

    .line 127
    .line 128
    return v1

    .line 129
    :cond_3
    const-string v1, "Expected closing quotation mark"

    .line 130
    .line 131
    invoke-static {v0, v1, v7, v6, v5}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 132
    .line 133
    .line 134
    throw v6

    .line 135
    :cond_4
    invoke-static {v0, v4, v7, v6, v5}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 136
    .line 137
    .line 138
    throw v6

    .line 139
    :cond_5
    return v1

    .line 140
    :cond_6
    invoke-static {v0, v4, v7, v6, v5}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 141
    .line 142
    .line 143
    throw v6

    .line 144
    :cond_7
    invoke-static {v0, v4, v7, v6, v5}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 145
    .line 146
    .line 147
    throw v6
.end method

.method public final decodeByte()B
    .locals 6

    .line 1
    iget-object v0, p0, Lkotlinx/serialization/json/internal/t;->c:Lkotlinx/serialization/json/internal/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->h()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    long-to-int v3, v1

    .line 8
    int-to-byte v3, v3

    .line 9
    int-to-long v4, v3

    .line 10
    cmp-long v4, v1, v4

    .line 11
    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    return v3

    .line 15
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v4, "Failed to parse byte for input \'"

    .line 18
    .line 19
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x27

    .line 26
    .line 27
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v2, 0x0

    .line 35
    const/4 v3, 0x6

    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-static {v0, v1, v2, v4, v3}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    throw v4
.end method

.method public final decodeChar()C
    .locals 5

    .line 1
    iget-object v0, p0, Lkotlinx/serialization/json/internal/t;->c:Lkotlinx/serialization/json/internal/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->j()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    if-ne v2, v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    :cond_0
    const-string v2, "Expected single char, but got \'"

    .line 21
    .line 22
    const/16 v3, 0x27

    .line 23
    .line 24
    invoke-static {v3, v2, v1}, Landroidx/compose/material3/c;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v2, 0x6

    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-static {v0, v1, v4, v3, v2}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    throw v3
.end method

.method public final decodeDouble()D
    .locals 9

    .line 1
    iget-object v0, p0, Lkotlinx/serialization/json/internal/t;->c:Lkotlinx/serialization/json/internal/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->j()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :try_start_0
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 9
    .line 10
    .line 11
    move-result-wide v3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    iget-object v1, p0, Lkotlinx/serialization/json/internal/t;->a:Ln7/b;

    .line 13
    .line 14
    iget-object v1, v1, Ln7/b;->a:Ln7/g;

    .line 15
    .line 16
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    const-wide v7, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    cmpg-double v1, v5, v7

    .line 26
    .line 27
    if-gtz v1, :cond_0

    .line 28
    .line 29
    return-wide v3

    .line 30
    :cond_0
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v0, v1}, Lkotlinx/serialization/json/internal/j;->r(Lkotlinx/serialization/json/internal/x;Ljava/lang/Number;)V

    .line 35
    .line 36
    .line 37
    throw v2

    .line 38
    :catch_0
    const-string v3, "Failed to parse type \'double\' for input \'"

    .line 39
    .line 40
    const/16 v4, 0x27

    .line 41
    .line 42
    invoke-static {v4, v3, v1}, Landroidx/compose/material3/c;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const/4 v3, 0x0

    .line 47
    const/4 v4, 0x6

    .line 48
    invoke-static {v0, v1, v3, v2, v4}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 49
    .line 50
    .line 51
    throw v2
.end method

.method public final decodeElementIndex(Lk7/g;)I
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lkotlinx/serialization/json/internal/t;->c:Lkotlinx/serialization/json/internal/x;

    .line 6
    .line 7
    iget-object v3, v2, Lkotlinx/serialization/json/internal/x;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Lkotlinx/serialization/json/internal/l;

    .line 10
    .line 11
    iget-object v4, v2, Lkotlinx/serialization/json/internal/x;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, Ljava/lang/String;

    .line 14
    .line 15
    const-string v5, "descriptor"

    .line 16
    .line 17
    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object v5, Lkotlinx/serialization/json/internal/s;->a:[I

    .line 21
    .line 22
    iget-object v6, v0, Lkotlinx/serialization/json/internal/t;->b:Lkotlinx/serialization/json/internal/WriteMode;

    .line 23
    .line 24
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    aget v5, v5, v7

    .line 29
    .line 30
    const/4 v7, 0x2

    .line 31
    const-string v8, "object"

    .line 32
    .line 33
    const/4 v9, 0x4

    .line 34
    const/16 v10, 0x3a

    .line 35
    .line 36
    const/4 v11, 0x0

    .line 37
    iget-object v12, v0, Lkotlinx/serialization/json/internal/t;->a:Ln7/b;

    .line 38
    .line 39
    const/4 v13, 0x1

    .line 40
    const/4 v14, -0x1

    .line 41
    const/4 v15, 0x0

    .line 42
    if-eq v5, v7, :cond_1c

    .line 43
    .line 44
    const/4 v7, 0x6

    .line 45
    if-eq v5, v9, :cond_4

    .line 46
    .line 47
    invoke-virtual {v2}, Lkotlinx/serialization/json/internal/x;->u()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-virtual {v2}, Lkotlinx/serialization/json/internal/x;->b()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_2

    .line 56
    .line 57
    iget v4, v0, Lkotlinx/serialization/json/internal/t;->e:I

    .line 58
    .line 59
    if-eq v4, v14, :cond_1

    .line 60
    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    const-string v1, "Expected end of the array or comma"

    .line 65
    .line 66
    invoke-static {v2, v1, v11, v15, v7}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    throw v15

    .line 70
    :cond_1
    :goto_0
    add-int/lit8 v14, v4, 0x1

    .line 71
    .line 72
    iput v14, v0, Lkotlinx/serialization/json/internal/t;->e:I

    .line 73
    .line 74
    goto/16 :goto_e

    .line 75
    .line 76
    :cond_2
    if-nez v1, :cond_3

    .line 77
    .line 78
    goto/16 :goto_e

    .line 79
    .line 80
    :cond_3
    iget-object v1, v12, Ln7/b;->a:Ln7/g;

    .line 81
    .line 82
    const-string v1, "array"

    .line 83
    .line 84
    invoke-static {v2, v1}, Lkotlinx/serialization/json/internal/j;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v15

    .line 88
    :cond_4
    invoke-virtual {v2}, Lkotlinx/serialization/json/internal/x;->u()Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    :goto_1
    invoke-virtual {v2}, Lkotlinx/serialization/json/internal/x;->b()Z

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    move/from16 v16, v13

    .line 97
    .line 98
    const/16 v13, 0x40

    .line 99
    .line 100
    const-wide/16 v17, 0x1

    .line 101
    .line 102
    iget-object v7, v0, Lkotlinx/serialization/json/internal/t;->g:Lkotlinx/serialization/json/internal/i;

    .line 103
    .line 104
    if-eqz v9, :cond_16

    .line 105
    .line 106
    invoke-virtual {v2}, Lkotlinx/serialization/json/internal/x;->d()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-virtual {v2, v10}, Lkotlinx/serialization/json/internal/x;->g(C)V

    .line 111
    .line 112
    .line 113
    invoke-static {v1, v12, v5}, Lkotlinx/serialization/json/internal/j;->j(Lk7/g;Ln7/b;Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    move-result v9

    .line 117
    const/4 v10, -0x3

    .line 118
    if-eq v9, v10, :cond_7

    .line 119
    .line 120
    if-eqz v7, :cond_5

    .line 121
    .line 122
    iget-object v1, v7, Lkotlinx/serialization/json/internal/i;->a:Lm7/w;

    .line 123
    .line 124
    if-ge v9, v13, :cond_6

    .line 125
    .line 126
    iget-wide v4, v1, Lm7/w;->c:J

    .line 127
    .line 128
    shl-long v7, v17, v9

    .line 129
    .line 130
    or-long/2addr v4, v7

    .line 131
    iput-wide v4, v1, Lm7/w;->c:J

    .line 132
    .line 133
    :cond_5
    :goto_2
    move v14, v9

    .line 134
    goto/16 :goto_e

    .line 135
    .line 136
    :cond_6
    ushr-int/lit8 v2, v9, 0x6

    .line 137
    .line 138
    add-int/lit8 v2, v2, -0x1

    .line 139
    .line 140
    and-int/lit8 v4, v9, 0x3f

    .line 141
    .line 142
    iget-object v1, v1, Lm7/w;->d:[J

    .line 143
    .line 144
    aget-wide v7, v1, v2

    .line 145
    .line 146
    shl-long v4, v17, v4

    .line 147
    .line 148
    or-long/2addr v4, v7

    .line 149
    aput-wide v4, v1, v2

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_7
    invoke-static {v1, v12}, Lkotlinx/serialization/json/internal/j;->l(Lk7/g;Ln7/b;)Z

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    if-nez v7, :cond_b

    .line 157
    .line 158
    iget-object v7, v0, Lkotlinx/serialization/json/internal/t;->f:Le7/r;

    .line 159
    .line 160
    if-eqz v7, :cond_8

    .line 161
    .line 162
    iget-object v9, v7, Le7/r;->b:Ljava/lang/String;

    .line 163
    .line 164
    invoke-static {v9, v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    if-eqz v9, :cond_8

    .line 169
    .line 170
    iput-object v15, v7, Le7/r;->b:Ljava/lang/String;

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_8
    iget v1, v3, Lkotlinx/serialization/json/internal/l;->b:I

    .line 174
    .line 175
    iget-object v6, v3, Lkotlinx/serialization/json/internal/l;->d:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v6, [I

    .line 178
    .line 179
    aget v7, v6, v1

    .line 180
    .line 181
    const/4 v8, -0x2

    .line 182
    if-ne v7, v8, :cond_9

    .line 183
    .line 184
    aput v14, v6, v1

    .line 185
    .line 186
    add-int/2addr v1, v14

    .line 187
    iput v1, v3, Lkotlinx/serialization/json/internal/l;->b:I

    .line 188
    .line 189
    :cond_9
    iget v1, v3, Lkotlinx/serialization/json/internal/l;->b:I

    .line 190
    .line 191
    if-eq v1, v14, :cond_a

    .line 192
    .line 193
    add-int/2addr v1, v14

    .line 194
    iput v1, v3, Lkotlinx/serialization/json/internal/l;->b:I

    .line 195
    .line 196
    :cond_a
    iget v1, v2, Lkotlinx/serialization/json/internal/x;->b:I

    .line 197
    .line 198
    invoke-virtual {v4, v11, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    const/4 v2, 0x6

    .line 207
    invoke-static {v2, v1, v5}, Lkotlin/text/p;->R(ILjava/lang/String;Ljava/lang/String;)I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    new-instance v2, Lkotlinx/serialization/json/internal/JsonDecodingException;

    .line 212
    .line 213
    new-instance v6, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    const-string v7, "Encountered an unknown key \'"

    .line 216
    .line 217
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    const-string v5, "\' at offset "

    .line 224
    .line 225
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    const-string v5, " at path: "

    .line 232
    .line 233
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v3}, Lkotlinx/serialization/json/internal/l;->a()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    const-string v3, "\nUse \'ignoreUnknownKeys = true\' in \'Json {}\' builder or \'@JsonIgnoreUnknownKeys\' annotation to ignore unknown keys.\nJSON input: "

    .line 244
    .line 245
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-static {v4, v1}, Lkotlinx/serialization/json/internal/j;->n(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-direct {v2, v1}, Lkotlinx/serialization/json/internal/JsonDecodingException;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw v2

    .line 263
    :cond_b
    :goto_3
    new-instance v9, Ljava/util/ArrayList;

    .line 264
    .line 265
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2}, Lkotlinx/serialization/json/internal/x;->q()B

    .line 269
    .line 270
    .line 271
    move-result v5

    .line 272
    const/16 v10, 0x8

    .line 273
    .line 274
    const/4 v7, 0x6

    .line 275
    if-eq v5, v10, :cond_c

    .line 276
    .line 277
    if-eq v5, v7, :cond_c

    .line 278
    .line 279
    invoke-virtual {v2}, Lkotlinx/serialization/json/internal/x;->j()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    goto/16 :goto_8

    .line 283
    .line 284
    :cond_c
    :goto_4
    invoke-virtual {v2}, Lkotlinx/serialization/json/internal/x;->q()B

    .line 285
    .line 286
    .line 287
    move-result v5

    .line 288
    move/from16 v13, v16

    .line 289
    .line 290
    if-ne v5, v13, :cond_e

    .line 291
    .line 292
    invoke-virtual {v2}, Lkotlinx/serialization/json/internal/x;->d()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    :cond_d
    const/16 v16, 0x1

    .line 296
    .line 297
    goto :goto_4

    .line 298
    :cond_e
    if-eq v5, v10, :cond_15

    .line 299
    .line 300
    if-ne v5, v7, :cond_f

    .line 301
    .line 302
    goto :goto_6

    .line 303
    :cond_f
    const/16 v7, 0x9

    .line 304
    .line 305
    if-ne v5, v7, :cond_11

    .line 306
    .line 307
    invoke-static {v9}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v5

    .line 311
    check-cast v5, Ljava/lang/Number;

    .line 312
    .line 313
    invoke-virtual {v5}, Ljava/lang/Number;->byteValue()B

    .line 314
    .line 315
    .line 316
    move-result v5

    .line 317
    if-ne v5, v10, :cond_10

    .line 318
    .line 319
    invoke-static {v9}, Lkotlin/collections/y;->b0(Ljava/util/List;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    :goto_5
    const/4 v7, 0x6

    .line 323
    goto :goto_7

    .line 324
    :cond_10
    iget v1, v2, Lkotlinx/serialization/json/internal/x;->b:I

    .line 325
    .line 326
    new-instance v2, Ljava/lang/StringBuilder;

    .line 327
    .line 328
    const-string v5, "found ] instead of } at path: "

    .line 329
    .line 330
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    invoke-static {v2, v4, v1}, Lkotlinx/serialization/json/internal/j;->e(Ljava/lang/String;Ljava/lang/CharSequence;I)Lkotlinx/serialization/json/internal/JsonDecodingException;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    throw v1

    .line 345
    :cond_11
    const/4 v7, 0x7

    .line 346
    if-ne v5, v7, :cond_13

    .line 347
    .line 348
    invoke-static {v9}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    check-cast v5, Ljava/lang/Number;

    .line 353
    .line 354
    invoke-virtual {v5}, Ljava/lang/Number;->byteValue()B

    .line 355
    .line 356
    .line 357
    move-result v5

    .line 358
    const/4 v7, 0x6

    .line 359
    if-ne v5, v7, :cond_12

    .line 360
    .line 361
    invoke-static {v9}, Lkotlin/collections/y;->b0(Ljava/util/List;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    goto :goto_5

    .line 365
    :cond_12
    iget v1, v2, Lkotlinx/serialization/json/internal/x;->b:I

    .line 366
    .line 367
    new-instance v2, Ljava/lang/StringBuilder;

    .line 368
    .line 369
    const-string v5, "found } instead of ] at path: "

    .line 370
    .line 371
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    invoke-static {v2, v4, v1}, Lkotlinx/serialization/json/internal/j;->e(Ljava/lang/String;Ljava/lang/CharSequence;I)Lkotlinx/serialization/json/internal/JsonDecodingException;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    throw v1

    .line 386
    :cond_13
    const/16 v7, 0xa

    .line 387
    .line 388
    if-eq v5, v7, :cond_14

    .line 389
    .line 390
    goto :goto_5

    .line 391
    :cond_14
    const-string v1, "Unexpected end of input due to malformed JSON during ignoring unknown keys"

    .line 392
    .line 393
    const/4 v7, 0x6

    .line 394
    invoke-static {v2, v1, v11, v15, v7}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 395
    .line 396
    .line 397
    throw v15

    .line 398
    :cond_15
    :goto_6
    invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 399
    .line 400
    .line 401
    move-result-object v5

    .line 402
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    :goto_7
    invoke-virtual {v2}, Lkotlinx/serialization/json/internal/x;->e()B

    .line 406
    .line 407
    .line 408
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 409
    .line 410
    .line 411
    move-result v5

    .line 412
    if-nez v5, :cond_d

    .line 413
    .line 414
    :goto_8
    invoke-virtual {v2}, Lkotlinx/serialization/json/internal/x;->u()Z

    .line 415
    .line 416
    .line 417
    move-result v5

    .line 418
    const/16 v10, 0x3a

    .line 419
    .line 420
    const/4 v13, 0x1

    .line 421
    goto/16 :goto_1

    .line 422
    .line 423
    :cond_16
    if-nez v5, :cond_1b

    .line 424
    .line 425
    if-eqz v7, :cond_25

    .line 426
    .line 427
    iget-object v1, v7, Lkotlinx/serialization/json/internal/i;->a:Lm7/w;

    .line 428
    .line 429
    iget-object v2, v1, Lm7/w;->b:Lr6/e;

    .line 430
    .line 431
    iget-object v4, v1, Lm7/w;->a:Lk7/g;

    .line 432
    .line 433
    invoke-interface {v4}, Lk7/g;->d()I

    .line 434
    .line 435
    .line 436
    move-result v5

    .line 437
    :cond_17
    iget-wide v7, v1, Lm7/w;->c:J

    .line 438
    .line 439
    const-wide/16 v9, -0x1

    .line 440
    .line 441
    cmp-long v12, v7, v9

    .line 442
    .line 443
    if-eqz v12, :cond_18

    .line 444
    .line 445
    not-long v7, v7

    .line 446
    invoke-static {v7, v8}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 447
    .line 448
    .line 449
    move-result v7

    .line 450
    iget-wide v8, v1, Lm7/w;->c:J

    .line 451
    .line 452
    shl-long v15, v17, v7

    .line 453
    .line 454
    or-long/2addr v8, v15

    .line 455
    iput-wide v8, v1, Lm7/w;->c:J

    .line 456
    .line 457
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 458
    .line 459
    .line 460
    move-result-object v8

    .line 461
    invoke-interface {v2, v4, v8}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v8

    .line 465
    check-cast v8, Ljava/lang/Boolean;

    .line 466
    .line 467
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 468
    .line 469
    .line 470
    move-result v8

    .line 471
    if-eqz v8, :cond_17

    .line 472
    .line 473
    move v14, v7

    .line 474
    goto/16 :goto_e

    .line 475
    .line 476
    :cond_18
    if-le v5, v13, :cond_25

    .line 477
    .line 478
    iget-object v1, v1, Lm7/w;->d:[J

    .line 479
    .line 480
    array-length v5, v1

    .line 481
    :goto_9
    if-ge v11, v5, :cond_25

    .line 482
    .line 483
    add-int/lit8 v7, v11, 0x1

    .line 484
    .line 485
    mul-int/lit8 v8, v7, 0x40

    .line 486
    .line 487
    aget-wide v12, v1, v11

    .line 488
    .line 489
    :goto_a
    cmp-long v15, v12, v9

    .line 490
    .line 491
    if-eqz v15, :cond_1a

    .line 492
    .line 493
    not-long v9, v12

    .line 494
    invoke-static {v9, v10}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 495
    .line 496
    .line 497
    move-result v9

    .line 498
    shl-long v19, v17, v9

    .line 499
    .line 500
    or-long v12, v12, v19

    .line 501
    .line 502
    add-int/2addr v9, v8

    .line 503
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 504
    .line 505
    .line 506
    move-result-object v10

    .line 507
    invoke-interface {v2, v4, v10}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v10

    .line 511
    check-cast v10, Ljava/lang/Boolean;

    .line 512
    .line 513
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 514
    .line 515
    .line 516
    move-result v10

    .line 517
    if-eqz v10, :cond_19

    .line 518
    .line 519
    aput-wide v12, v1, v11

    .line 520
    .line 521
    goto/16 :goto_2

    .line 522
    .line 523
    :cond_19
    const-wide/16 v9, -0x1

    .line 524
    .line 525
    goto :goto_a

    .line 526
    :cond_1a
    aput-wide v12, v1, v11

    .line 527
    .line 528
    move v11, v7

    .line 529
    const-wide/16 v9, -0x1

    .line 530
    .line 531
    goto :goto_9

    .line 532
    :cond_1b
    iget-object v1, v12, Ln7/b;->a:Ln7/g;

    .line 533
    .line 534
    invoke-static {v2, v8}, Lkotlinx/serialization/json/internal/j;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    throw v15

    .line 538
    :cond_1c
    iget v1, v0, Lkotlinx/serialization/json/internal/t;->e:I

    .line 539
    .line 540
    rem-int/lit8 v4, v1, 0x2

    .line 541
    .line 542
    if-eqz v4, :cond_1d

    .line 543
    .line 544
    const/4 v13, 0x1

    .line 545
    goto :goto_b

    .line 546
    :cond_1d
    move v13, v11

    .line 547
    :goto_b
    if-eqz v13, :cond_1e

    .line 548
    .line 549
    if-eq v1, v14, :cond_1f

    .line 550
    .line 551
    invoke-virtual {v2}, Lkotlinx/serialization/json/internal/x;->u()Z

    .line 552
    .line 553
    .line 554
    move-result v11

    .line 555
    goto :goto_c

    .line 556
    :cond_1e
    const/16 v1, 0x3a

    .line 557
    .line 558
    invoke-virtual {v2, v1}, Lkotlinx/serialization/json/internal/x;->g(C)V

    .line 559
    .line 560
    .line 561
    :cond_1f
    :goto_c
    invoke-virtual {v2}, Lkotlinx/serialization/json/internal/x;->b()Z

    .line 562
    .line 563
    .line 564
    move-result v1

    .line 565
    if-eqz v1, :cond_24

    .line 566
    .line 567
    if-eqz v13, :cond_23

    .line 568
    .line 569
    iget v1, v0, Lkotlinx/serialization/json/internal/t;->e:I

    .line 570
    .line 571
    if-ne v1, v14, :cond_21

    .line 572
    .line 573
    iget v1, v2, Lkotlinx/serialization/json/internal/x;->b:I

    .line 574
    .line 575
    if-nez v11, :cond_20

    .line 576
    .line 577
    goto :goto_d

    .line 578
    :cond_20
    const-string v3, "Unexpected leading comma"

    .line 579
    .line 580
    invoke-static {v2, v3, v1, v15, v9}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 581
    .line 582
    .line 583
    throw v15

    .line 584
    :cond_21
    iget v1, v2, Lkotlinx/serialization/json/internal/x;->b:I

    .line 585
    .line 586
    if-eqz v11, :cond_22

    .line 587
    .line 588
    goto :goto_d

    .line 589
    :cond_22
    const-string v3, "Expected comma after the key-value pair"

    .line 590
    .line 591
    invoke-static {v2, v3, v1, v15, v9}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 592
    .line 593
    .line 594
    throw v15

    .line 595
    :cond_23
    :goto_d
    iget v1, v0, Lkotlinx/serialization/json/internal/t;->e:I

    .line 596
    .line 597
    const/16 v16, 0x1

    .line 598
    .line 599
    add-int/lit8 v14, v1, 0x1

    .line 600
    .line 601
    iput v14, v0, Lkotlinx/serialization/json/internal/t;->e:I

    .line 602
    .line 603
    goto :goto_e

    .line 604
    :cond_24
    if-nez v11, :cond_27

    .line 605
    .line 606
    :cond_25
    :goto_e
    sget-object v1, Lkotlinx/serialization/json/internal/WriteMode;->MAP:Lkotlinx/serialization/json/internal/WriteMode;

    .line 607
    .line 608
    if-eq v6, v1, :cond_26

    .line 609
    .line 610
    iget-object v1, v3, Lkotlinx/serialization/json/internal/l;->d:Ljava/lang/Object;

    .line 611
    .line 612
    check-cast v1, [I

    .line 613
    .line 614
    iget v2, v3, Lkotlinx/serialization/json/internal/l;->b:I

    .line 615
    .line 616
    aput v14, v1, v2

    .line 617
    .line 618
    :cond_26
    return v14

    .line 619
    :cond_27
    iget-object v1, v12, Ln7/b;->a:Ln7/g;

    .line 620
    .line 621
    invoke-static {v2, v8}, Lkotlinx/serialization/json/internal/j;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    throw v15
.end method

.method public final decodeEnum(Lk7/g;)I
    .locals 4

    .line 1
    const-string v0, "enumDescriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lkotlinx/serialization/json/internal/t;->c:Lkotlinx/serialization/json/internal/x;

    .line 7
    .line 8
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->i()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v3, " at path "

    .line 15
    .line 16
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Lkotlinx/serialization/json/internal/x;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lkotlinx/serialization/json/internal/l;

    .line 22
    .line 23
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/l;->a()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v2, p0, Lkotlinx/serialization/json/internal/t;->a:Ln7/b;

    .line 35
    .line 36
    invoke-static {p1, v2, v1, v0}, Lkotlinx/serialization/json/internal/j;->k(Lk7/g;Ln7/b;Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1
.end method

.method public final decodeFloat()F
    .locals 5

    .line 1
    iget-object v0, p0, Lkotlinx/serialization/json/internal/t;->c:Lkotlinx/serialization/json/internal/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->j()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :try_start_0
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 9
    .line 10
    .line 11
    move-result v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    iget-object v3, p0, Lkotlinx/serialization/json/internal/t;->a:Ln7/b;

    .line 13
    .line 14
    iget-object v3, v3, Ln7/b;->a:Ln7/g;

    .line 15
    .line 16
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const v4, 0x7f7fffff    # Float.MAX_VALUE

    .line 21
    .line 22
    .line 23
    cmpg-float v3, v3, v4

    .line 24
    .line 25
    if-gtz v3, :cond_0

    .line 26
    .line 27
    return v1

    .line 28
    :cond_0
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v0, v1}, Lkotlinx/serialization/json/internal/j;->r(Lkotlinx/serialization/json/internal/x;Ljava/lang/Number;)V

    .line 33
    .line 34
    .line 35
    throw v2

    .line 36
    :catch_0
    const-string v3, "Failed to parse type \'float\' for input \'"

    .line 37
    .line 38
    const/16 v4, 0x27

    .line 39
    .line 40
    invoke-static {v4, v3, v1}, Landroidx/compose/material3/c;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const/4 v3, 0x0

    .line 45
    const/4 v4, 0x6

    .line 46
    invoke-static {v0, v1, v3, v2, v4}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    throw v2
.end method

.method public final decodeInline(Lk7/g;)Ll7/e;
    .locals 2

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lkotlinx/serialization/json/internal/w;->a(Lk7/g;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance p1, Lkotlinx/serialization/json/internal/h;

    .line 13
    .line 14
    iget-object v0, p0, Lkotlinx/serialization/json/internal/t;->c:Lkotlinx/serialization/json/internal/x;

    .line 15
    .line 16
    iget-object v1, p0, Lkotlinx/serialization/json/internal/t;->a:Ln7/b;

    .line 17
    .line 18
    invoke-direct {p1, v0, v1}, Lkotlinx/serialization/json/internal/h;-><init>(Lkotlinx/serialization/json/internal/x;Ln7/b;)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    invoke-super {p0, p1}, Ll7/a;->decodeInline(Lk7/g;)Ll7/e;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method public final decodeInt()I
    .locals 6

    .line 1
    iget-object v0, p0, Lkotlinx/serialization/json/internal/t;->c:Lkotlinx/serialization/json/internal/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->h()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    long-to-int v3, v1

    .line 8
    int-to-long v4, v3

    .line 9
    cmp-long v4, v1, v4

    .line 10
    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    return v3

    .line 14
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v4, "Failed to parse int for input \'"

    .line 17
    .line 18
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const/16 v1, 0x27

    .line 25
    .line 26
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x6

    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-static {v0, v1, v2, v4, v3}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    throw v4
.end method

.method public final decodeLong()J
    .locals 2

    .line 1
    iget-object v0, p0, Lkotlinx/serialization/json/internal/t;->c:Lkotlinx/serialization/json/internal/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->h()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final decodeNotNullMark()Z
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lkotlinx/serialization/json/internal/t;->g:Lkotlinx/serialization/json/internal/i;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    iget-boolean v1, v1, Lkotlinx/serialization/json/internal/i;->b:Z

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    if-nez v1, :cond_6

    .line 11
    .line 12
    iget-object v1, p0, Lkotlinx/serialization/json/internal/t;->c:Lkotlinx/serialization/json/internal/x;

    .line 13
    .line 14
    invoke-virtual {v1}, Lkotlinx/serialization/json/internal/x;->t()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {v1, v2}, Lkotlinx/serialization/json/internal/x;->s(I)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    iget-object v3, v1, Lkotlinx/serialization/json/internal/x;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    sub-int/2addr v4, v2

    .line 31
    const/4 v5, 0x1

    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v7, 0x4

    .line 34
    if-lt v4, v7, :cond_5

    .line 35
    .line 36
    const/4 v8, -0x1

    .line 37
    if-ne v2, v8, :cond_1

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    move v8, v6

    .line 41
    :goto_1
    if-ge v8, v7, :cond_3

    .line 42
    .line 43
    const-string v9, "null"

    .line 44
    .line 45
    invoke-virtual {v9, v8}, Ljava/lang/String;->charAt(I)C

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    add-int v10, v2, v8

    .line 50
    .line 51
    invoke-virtual {v3, v10}, Ljava/lang/String;->charAt(I)C

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    if-eq v9, v10, :cond_2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    add-int/lit8 v8, v8, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    if-le v4, v7, :cond_4

    .line 62
    .line 63
    add-int/lit8 v4, v2, 0x4

    .line 64
    .line 65
    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    invoke-static {v3}, Lkotlinx/serialization/json/internal/j;->g(C)B

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-nez v3, :cond_4

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    const/4 v6, 0x1

    .line 77
    add-int/2addr v2, v7

    .line 78
    iput v2, v1, Lkotlinx/serialization/json/internal/x;->b:I

    .line 79
    .line 80
    :cond_5
    :goto_2
    if-nez v6, :cond_6

    .line 81
    .line 82
    return v5

    .line 83
    :cond_6
    return v0
.end method

.method public final decodeNull()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lkotlinx/serialization/json/internal/t;->c:Lkotlinx/serialization/json/internal/x;

    .line 2
    .line 3
    iget-object v0, v0, Lkotlinx/serialization/json/internal/x;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lkotlinx/serialization/json/internal/l;

    .line 6
    .line 7
    const-string v1, "descriptor"

    .line 8
    .line 9
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "deserializer"

    .line 13
    .line 14
    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lkotlinx/serialization/json/internal/t;->b:Lkotlinx/serialization/json/internal/WriteMode;

    .line 18
    .line 19
    sget-object v2, Lkotlinx/serialization/json/internal/WriteMode;->MAP:Lkotlinx/serialization/json/internal/WriteMode;

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    if-ne v1, v2, :cond_0

    .line 23
    .line 24
    and-int/lit8 v1, p2, 0x1

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    move v1, v3

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v1, 0x0

    .line 31
    :goto_0
    const/4 v2, -0x2

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    iget-object v4, v0, Lkotlinx/serialization/json/internal/l;->d:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v4, [I

    .line 37
    .line 38
    iget v5, v0, Lkotlinx/serialization/json/internal/l;->b:I

    .line 39
    .line 40
    aget v4, v4, v5

    .line 41
    .line 42
    if-ne v4, v2, :cond_1

    .line 43
    .line 44
    iget-object v4, v0, Lkotlinx/serialization/json/internal/l;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v4, [Ljava/lang/Object;

    .line 47
    .line 48
    sget-object v6, Lkotlinx/serialization/json/internal/k;->a:Lkotlinx/serialization/json/internal/k;

    .line 49
    .line 50
    aput-object v6, v4, v5

    .line 51
    .line 52
    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, Ll7/a;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    iget-object p2, v0, Lkotlinx/serialization/json/internal/l;->d:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p2, [I

    .line 61
    .line 62
    iget p3, v0, Lkotlinx/serialization/json/internal/l;->b:I

    .line 63
    .line 64
    aget p2, p2, p3

    .line 65
    .line 66
    if-eq p2, v2, :cond_2

    .line 67
    .line 68
    add-int/2addr p3, v3

    .line 69
    iput p3, v0, Lkotlinx/serialization/json/internal/l;->b:I

    .line 70
    .line 71
    iget-object p2, v0, Lkotlinx/serialization/json/internal/l;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p2, [Ljava/lang/Object;

    .line 74
    .line 75
    array-length p4, p2

    .line 76
    if-ne p3, p4, :cond_2

    .line 77
    .line 78
    mul-int/lit8 p3, p3, 0x2

    .line 79
    .line 80
    invoke-static {p2, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    const-string p4, "copyOf(...)"

    .line 85
    .line 86
    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iput-object p2, v0, Lkotlinx/serialization/json/internal/l;->c:Ljava/lang/Object;

    .line 90
    .line 91
    iget-object p2, v0, Lkotlinx/serialization/json/internal/l;->d:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p2, [I

    .line 94
    .line 95
    invoke-static {p2, p3}, Ljava/util/Arrays;->copyOf([II)[I

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iput-object p2, v0, Lkotlinx/serialization/json/internal/l;->d:Ljava/lang/Object;

    .line 103
    .line 104
    :cond_2
    iget-object p2, v0, Lkotlinx/serialization/json/internal/l;->c:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p2, [Ljava/lang/Object;

    .line 107
    .line 108
    iget p3, v0, Lkotlinx/serialization/json/internal/l;->b:I

    .line 109
    .line 110
    aput-object p1, p2, p3

    .line 111
    .line 112
    iget-object p2, v0, Lkotlinx/serialization/json/internal/l;->d:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p2, [I

    .line 115
    .line 116
    aput v2, p2, p3

    .line 117
    .line 118
    :cond_3
    return-object p1
.end method

.method public final decodeSerializableValue(Li7/a;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lkotlinx/serialization/json/internal/t;->a:Ln7/b;

    .line 2
    .line 3
    iget-object v1, p0, Lkotlinx/serialization/json/internal/t;->c:Lkotlinx/serialization/json/internal/x;

    .line 4
    .line 5
    iget-object v2, v1, Lkotlinx/serialization/json/internal/x;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lkotlinx/serialization/json/internal/l;

    .line 8
    .line 9
    const-string v3, "Expected "

    .line 10
    .line 11
    const-string v4, "deserializer"

    .line 12
    .line 13
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    :try_start_0
    instance-of v5, p1, Lm7/b;

    .line 18
    .line 19
    if-eqz v5, :cond_5

    .line 20
    .line 21
    iget-object v5, v0, Ln7/b;->a:Ln7/g;

    .line 22
    .line 23
    move-object v5, p1

    .line 24
    check-cast v5, Lm7/b;

    .line 25
    .line 26
    check-cast v5, Li7/c;

    .line 27
    .line 28
    invoke-virtual {v5}, Li7/c;->getDescriptor()Lk7/g;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-static {v5, v0}, Lkotlinx/serialization/json/internal/j;->h(Lk7/g;Ln7/b;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v1, v5}, Lkotlinx/serialization/json/internal/x;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    const/4 v7, 0x0

    .line 41
    if-nez v6, :cond_4

    .line 42
    .line 43
    instance-of v1, p1, Lm7/b;

    .line 44
    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    iget-object v1, v0, Ln7/b;->a:Ln7/g;

    .line 48
    .line 49
    move-object v1, p1

    .line 50
    check-cast v1, Lm7/b;

    .line 51
    .line 52
    check-cast v1, Li7/c;

    .line 53
    .line 54
    invoke-virtual {v1}, Li7/c;->getDescriptor()Lk7/g;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v1, v0}, Lkotlinx/serialization/json/internal/j;->h(Lk7/g;Ln7/b;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {p0}, Lkotlinx/serialization/json/internal/t;->a()Ln7/j;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    move-object v6, p1

    .line 67
    check-cast v6, Lm7/b;

    .line 68
    .line 69
    check-cast v6, Li7/c;

    .line 70
    .line 71
    invoke-virtual {v6}, Li7/c;->getDescriptor()Lk7/g;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-interface {v6}, Lk7/g;->h()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    instance-of v8, v5, Ln7/u;

    .line 80
    .line 81
    const/4 v9, -0x1

    .line 82
    if-eqz v8, :cond_2

    .line 83
    .line 84
    check-cast v5, Ln7/u;

    .line 85
    .line 86
    invoke-virtual {v5, v1}, Ln7/u;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    check-cast v3, Ln7/j;

    .line 91
    .line 92
    if-eqz v3, :cond_1

    .line 93
    .line 94
    invoke-static {v3}, Ln7/k;->a(Ln7/j;)Ln7/y;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    instance-of v6, v3, Ln7/r;

    .line 99
    .line 100
    if-eqz v6, :cond_0

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_0
    invoke-virtual {v3}, Ln7/y;->a()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v7
    :try_end_0
    .catch Lkotlinx/serialization/MissingFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    goto :goto_0

    .line 108
    :catch_0
    move-exception p1

    .line 109
    goto/16 :goto_1

    .line 110
    .line 111
    :cond_1
    :goto_0
    :try_start_1
    check-cast p1, Lm7/b;

    .line 112
    .line 113
    invoke-static {p1, p0, v7}, Lv7/l;->i(Lm7/b;Ll7/c;Ljava/lang/String;)Li7/a;

    .line 114
    .line 115
    .line 116
    move-result-object p1
    :try_end_1
    .catch Lkotlinx/serialization/SerializationException; {:try_start_1 .. :try_end_1} :catch_1

    .line 117
    :try_start_2
    invoke-static {v0, v1, v5, p1}, Lkotlinx/serialization/json/internal/j;->p(Ln7/b;Ljava/lang/String;Ln7/u;Li7/a;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    return-object p1

    .line 122
    :catch_1
    move-exception p1

    .line 123
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v5}, Ln7/u;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-static {p1, v0, v9}, Lkotlinx/serialization/json/internal/j;->e(Ljava/lang/String;Ljava/lang/CharSequence;I)Lkotlinx/serialization/json/internal/JsonDecodingException;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    throw p1

    .line 139
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    const-class v0, Ln7/u;

    .line 145
    .line 146
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v0}, Lkotlin/jvm/internal/d;->e()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string v0, ", but had "

    .line 158
    .line 159
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {v0}, Lkotlin/jvm/internal/d;->e()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const-string v0, " as the serialized body of "

    .line 178
    .line 179
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string v0, " at element: "

    .line 186
    .line 187
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2}, Lkotlinx/serialization/json/internal/l;->a()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-static {p1, v0, v9}, Lkotlinx/serialization/json/internal/j;->e(Ljava/lang/String;Ljava/lang/CharSequence;I)Lkotlinx/serialization/json/internal/JsonDecodingException;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    throw p1

    .line 210
    :cond_3
    invoke-interface {p1, p0}, Li7/a;->deserialize(Ll7/e;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p1
    :try_end_2
    .catch Lkotlinx/serialization/MissingFieldException; {:try_start_2 .. :try_end_2} :catch_0

    .line 214
    return-object p1

    .line 215
    :cond_4
    :try_start_3
    check-cast p1, Lm7/b;

    .line 216
    .line 217
    invoke-static {p1, p0, v6}, Lv7/l;->i(Lm7/b;Ll7/c;Ljava/lang/String;)Li7/a;

    .line 218
    .line 219
    .line 220
    move-result-object p1
    :try_end_3
    .catch Lkotlinx/serialization/SerializationException; {:try_start_3 .. :try_end_3} :catch_2

    .line 221
    :try_start_4
    new-instance v0, Le7/r;

    .line 222
    .line 223
    const/4 v1, 0x1

    .line 224
    invoke-direct {v0, v1}, Le7/r;-><init>(I)V

    .line 225
    .line 226
    .line 227
    iput-object v5, v0, Le7/r;->b:Ljava/lang/String;

    .line 228
    .line 229
    iput-object v0, p0, Lkotlinx/serialization/json/internal/t;->f:Le7/r;

    .line 230
    .line 231
    invoke-interface {p1, p0}, Li7/a;->deserialize(Ll7/e;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    return-object p1

    .line 236
    :catch_2
    move-exception p1

    .line 237
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    const/16 v3, 0xa

    .line 245
    .line 246
    invoke-static {v0, v3}, Lkotlin/text/p;->f0(Ljava/lang/String;C)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    const-string v5, "."

    .line 251
    .line 252
    invoke-static {v0, v5}, Lkotlin/text/p;->X(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    const-string v5, ""

    .line 264
    .line 265
    invoke-static {v3, p1, v5}, Lkotlin/text/p;->c0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    const/4 v3, 0x2

    .line 270
    invoke-static {v1, v0, v4, p1, v3}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 271
    .line 272
    .line 273
    throw v7

    .line 274
    :cond_5
    invoke-interface {p1, p0}, Li7/a;->deserialize(Ll7/e;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object p1
    :try_end_4
    .catch Lkotlinx/serialization/MissingFieldException; {:try_start_4 .. :try_end_4} :catch_0

    .line 278
    return-object p1

    .line 279
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    const-string v1, "at path"

    .line 287
    .line 288
    invoke-static {v0, v1, v4}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-eqz v0, :cond_6

    .line 293
    .line 294
    throw p1

    .line 295
    :cond_6
    new-instance v0, Lkotlinx/serialization/MissingFieldException;

    .line 296
    .line 297
    invoke-virtual {p1}, Lkotlinx/serialization/MissingFieldException;->getMissingFields()Ljava/util/List;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    new-instance v3, Ljava/lang/StringBuilder;

    .line 302
    .line 303
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 304
    .line 305
    .line 306
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    const-string v4, " at path: "

    .line 314
    .line 315
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2}, Lkotlinx/serialization/json/internal/l;->a()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    invoke-direct {v0, v1, v2, p1}, Lkotlinx/serialization/MissingFieldException;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 330
    .line 331
    .line 332
    throw v0
.end method

.method public final decodeShort()S
    .locals 6

    .line 1
    iget-object v0, p0, Lkotlinx/serialization/json/internal/t;->c:Lkotlinx/serialization/json/internal/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->h()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    long-to-int v3, v1

    .line 8
    int-to-short v3, v3

    .line 9
    int-to-long v4, v3

    .line 10
    cmp-long v4, v1, v4

    .line 11
    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    return v3

    .line 15
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v4, "Failed to parse short for input \'"

    .line 18
    .line 19
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x27

    .line 26
    .line 27
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v2, 0x0

    .line 35
    const/4 v3, 0x6

    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-static {v0, v1, v2, v4, v3}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    throw v4
.end method

.method public final decodeString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/serialization/json/internal/t;->c:Lkotlinx/serialization/json/internal/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->i()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final endStructure(Lk7/g;)V
    .locals 5

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lk7/g;->d()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, -0x1

    .line 11
    iget-object v2, p0, Lkotlinx/serialization/json/internal/t;->a:Ln7/b;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-static {p1, v2}, Lkotlinx/serialization/json/internal/j;->l(Lk7/g;Ln7/b;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0, p1}, Lkotlinx/serialization/json/internal/t;->decodeElementIndex(Lk7/g;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-ne v0, v1, :cond_0

    .line 26
    .line 27
    :cond_1
    iget-object p1, p0, Lkotlinx/serialization/json/internal/t;->c:Lkotlinx/serialization/json/internal/x;

    .line 28
    .line 29
    invoke-virtual {p1}, Lkotlinx/serialization/json/internal/x;->u()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_4

    .line 34
    .line 35
    iget-object v0, p0, Lkotlinx/serialization/json/internal/t;->b:Lkotlinx/serialization/json/internal/WriteMode;

    .line 36
    .line 37
    iget-char v0, v0, Lkotlinx/serialization/json/internal/WriteMode;->end:C

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Lkotlinx/serialization/json/internal/x;->g(C)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p1, Lkotlinx/serialization/json/internal/x;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lkotlinx/serialization/json/internal/l;

    .line 45
    .line 46
    iget v0, p1, Lkotlinx/serialization/json/internal/l;->b:I

    .line 47
    .line 48
    iget-object v2, p1, Lkotlinx/serialization/json/internal/l;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, [I

    .line 51
    .line 52
    aget v3, v2, v0

    .line 53
    .line 54
    const/4 v4, -0x2

    .line 55
    if-ne v3, v4, :cond_2

    .line 56
    .line 57
    aput v1, v2, v0

    .line 58
    .line 59
    add-int/2addr v0, v1

    .line 60
    iput v0, p1, Lkotlinx/serialization/json/internal/l;->b:I

    .line 61
    .line 62
    :cond_2
    iget v0, p1, Lkotlinx/serialization/json/internal/l;->b:I

    .line 63
    .line 64
    if-eq v0, v1, :cond_3

    .line 65
    .line 66
    add-int/2addr v0, v1

    .line 67
    iput v0, p1, Lkotlinx/serialization/json/internal/l;->b:I

    .line 68
    .line 69
    :cond_3
    return-void

    .line 70
    :cond_4
    iget-object v0, v2, Ln7/b;->a:Ln7/g;

    .line 71
    .line 72
    const-string v0, ""

    .line 73
    .line 74
    invoke-static {p1, v0}, Lkotlinx/serialization/json/internal/j;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const/4 p1, 0x0

    .line 78
    throw p1
.end method

.method public final getSerializersModule()Lo7/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/serialization/json/internal/t;->d:Lo7/e;

    .line 2
    .line 3
    return-object v0
.end method

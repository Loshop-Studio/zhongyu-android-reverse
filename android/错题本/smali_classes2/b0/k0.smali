.class public Lb0/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq5/g;
.implements Lo7/f;


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/os/Handler;

    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lb0/j0;

    .line 4
    invoke-direct {v2}, Lb0/j0;-><init>()V

    .line 5
    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lb0/k0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ld2/c;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/k0;->b:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lb0/k0;->a:Z

    return-void
.end method

.method public constructor <init>(Ln7/g;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iget-object v0, p1, Ln7/g;->e:Ljava/lang/String;

    .line 8
    iput-object v0, p0, Lb0/k0;->b:Ljava/lang/Object;

    .line 9
    iget-object p1, p1, Ln7/g;->g:Lkotlinx/serialization/json/ClassDiscriminatorMode;

    .line 10
    sget-object v0, Lkotlinx/serialization/json/ClassDiscriminatorMode;->NONE:Lkotlinx/serialization/json/ClassDiscriminatorMode;

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lb0/k0;->a:Z

    return-void
.end method

.method public constructor <init>(Lq5/g;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lb0/k0;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lb0/k0;->a:Z

    .line 3
    .line 4
    return-void
.end method

.method public b(B)V
    .locals 3

    .line 1
    iget-object v0, p0, Lb0/k0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ld2/c;

    .line 4
    .line 5
    int-to-long v1, p1

    .line 6
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Ld2/c;->h(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public c(C)V
    .locals 4

    .line 1
    iget-object v0, p0, Lb0/k0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ld2/c;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iget v2, v0, Ld2/c;->b:I

    .line 7
    .line 8
    invoke-virtual {v0, v2, v1}, Ld2/c;->d(II)V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Ld2/c;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, [C

    .line 14
    .line 15
    iget v2, v0, Ld2/c;->b:I

    .line 16
    .line 17
    add-int/lit8 v3, v2, 0x1

    .line 18
    .line 19
    iput v3, v0, Ld2/c;->b:I

    .line 20
    .line 21
    aput-char p1, v1, v2

    .line 22
    .line 23
    return-void
.end method

.method public d(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lb0/k0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ld2/c;

    .line 4
    .line 5
    int-to-long v1, p1

    .line 6
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Ld2/c;->h(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public e(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb0/k0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ld2/c;

    .line 4
    .line 5
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p1}, Ld2/c;->h(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string/jumbo v0, "v"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lb0/k0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ld2/c;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ld2/c;->h(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public g(S)V
    .locals 3

    .line 1
    iget-object v0, p0, Lb0/k0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ld2/c;

    .line 4
    .line 5
    int-to-long v1, p1

    .line 6
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Ld2/c;->h(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 11

    .line 1
    const-string/jumbo v0, "value"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lb0/k0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ld2/c;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x2

    .line 16
    add-int/2addr v1, v2

    .line 17
    iget v3, v0, Ld2/c;->b:I

    .line 18
    .line 19
    invoke-virtual {v0, v3, v1}, Ld2/c;->d(II)V

    .line 20
    .line 21
    .line 22
    iget-object v1, v0, Ld2/c;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, [C

    .line 25
    .line 26
    iget v3, v0, Ld2/c;->b:I

    .line 27
    .line 28
    add-int/lit8 v4, v3, 0x1

    .line 29
    .line 30
    const/16 v5, 0x22

    .line 31
    .line 32
    aput-char v5, v1, v3

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const/4 v6, 0x0

    .line 39
    invoke-virtual {p1, v6, v3, v1, v4}, Ljava/lang/String;->getChars(II[CI)V

    .line 40
    .line 41
    .line 42
    add-int/2addr v3, v4

    .line 43
    move v7, v4

    .line 44
    :goto_0
    if-ge v7, v3, :cond_5

    .line 45
    .line 46
    aget-char v8, v1, v7

    .line 47
    .line 48
    sget-object v9, Lkotlinx/serialization/json/internal/y;->b:[B

    .line 49
    .line 50
    array-length v10, v9

    .line 51
    if-ge v8, v10, :cond_4

    .line 52
    .line 53
    aget-byte v8, v9, v8

    .line 54
    .line 55
    if-eqz v8, :cond_4

    .line 56
    .line 57
    sub-int v1, v7, v4

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    :goto_1
    const/4 v4, 0x1

    .line 64
    if-ge v1, v3, :cond_3

    .line 65
    .line 66
    invoke-virtual {v0, v7, v2}, Ld2/c;->d(II)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    sget-object v9, Lkotlinx/serialization/json/internal/y;->b:[B

    .line 74
    .line 75
    array-length v10, v9

    .line 76
    if-ge v8, v10, :cond_2

    .line 77
    .line 78
    aget-byte v9, v9, v8

    .line 79
    .line 80
    if-nez v9, :cond_0

    .line 81
    .line 82
    iget-object v4, v0, Ld2/c;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v4, [C

    .line 85
    .line 86
    add-int/lit8 v9, v7, 0x1

    .line 87
    .line 88
    int-to-char v8, v8

    .line 89
    aput-char v8, v4, v7

    .line 90
    .line 91
    :goto_2
    move v7, v9

    .line 92
    goto :goto_3

    .line 93
    :cond_0
    if-ne v9, v4, :cond_1

    .line 94
    .line 95
    sget-object v4, Lkotlinx/serialization/json/internal/y;->a:[Ljava/lang/String;

    .line 96
    .line 97
    aget-object v4, v4, v8

    .line 98
    .line 99
    invoke-static {v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    invoke-virtual {v0, v7, v8}, Ld2/c;->d(II)V

    .line 107
    .line 108
    .line 109
    iget-object v8, v0, Ld2/c;->c:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v8, [C

    .line 112
    .line 113
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 114
    .line 115
    .line 116
    move-result v9

    .line 117
    invoke-virtual {v4, v6, v9, v8, v7}, Ljava/lang/String;->getChars(II[CI)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    add-int/2addr v4, v7

    .line 125
    iput v4, v0, Ld2/c;->b:I

    .line 126
    .line 127
    move v7, v4

    .line 128
    goto :goto_3

    .line 129
    :cond_1
    iget-object v4, v0, Ld2/c;->c:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v4, [C

    .line 132
    .line 133
    const/16 v8, 0x5c

    .line 134
    .line 135
    aput-char v8, v4, v7

    .line 136
    .line 137
    add-int/lit8 v8, v7, 0x1

    .line 138
    .line 139
    int-to-char v9, v9

    .line 140
    aput-char v9, v4, v8

    .line 141
    .line 142
    add-int/lit8 v7, v7, 0x2

    .line 143
    .line 144
    iput v7, v0, Ld2/c;->b:I

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_2
    iget-object v4, v0, Ld2/c;->c:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v4, [C

    .line 150
    .line 151
    add-int/lit8 v9, v7, 0x1

    .line 152
    .line 153
    int-to-char v8, v8

    .line 154
    aput-char v8, v4, v7

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_3
    invoke-virtual {v0, v7, v4}, Ld2/c;->d(II)V

    .line 161
    .line 162
    .line 163
    iget-object p1, v0, Ld2/c;->c:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast p1, [C

    .line 166
    .line 167
    add-int/lit8 v1, v7, 0x1

    .line 168
    .line 169
    aput-char v5, p1, v7

    .line 170
    .line 171
    iput v1, v0, Ld2/c;->b:I

    .line 172
    .line 173
    return-void

    .line 174
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 175
    .line 176
    goto/16 :goto_0

    .line 177
    .line 178
    :cond_5
    add-int/lit8 p1, v3, 0x1

    .line 179
    .line 180
    aput-char v5, v1, v3

    .line 181
    .line 182
    iput p1, v0, Ld2/c;->b:I

    .line 183
    .line 184
    return-void
.end method

.method public declared-synchronized i(Lb0/g0;Z)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lb0/k0;->a:Z

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iput-boolean v1, p0, Lb0/k0;->a:Z

    .line 11
    .line 12
    invoke-interface {p1}, Lb0/g0;->recycle()V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-boolean p1, p0, Lb0/k0;->a:Z

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_2

    .line 21
    :cond_1
    :goto_0
    iget-object p2, p0, Lb0/k0;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p2, Landroid/os/Handler;

    .line 24
    .line 25
    invoke-virtual {p2, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    :goto_1
    monitor-exit p0

    .line 33
    return-void

    .line 34
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw p1
.end method

.method public j()V
    .locals 0

    .line 1
    return-void
.end method

.method public k()V
    .locals 0

    .line 1
    return-void
.end method

.method public l(Ly6/c;Lr6/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public m(Ly6/c;Ly6/c;Li7/b;)V
    .locals 3

    .line 1
    iget-boolean p1, p0, Lb0/k0;->a:Z

    .line 2
    .line 3
    invoke-interface {p3}, Li7/e;->getDescriptor()Lk7/g;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    invoke-interface {p3}, Lk7/g;->getKind()Lcoil3/network/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, Lk7/d;

    .line 12
    .line 13
    const-string v2, "Serializer for "

    .line 14
    .line 15
    if-nez v1, :cond_4

    .line 16
    .line 17
    sget-object v1, Lk7/j;->b:Lk7/j;

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_4

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object v1, Lk7/l;->c:Lk7/l;

    .line 29
    .line 30
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    sget-object v1, Lk7/l;->d:Lk7/l;

    .line 37
    .line 38
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_3

    .line 43
    .line 44
    instance-of v1, v0, Lk7/f;

    .line 45
    .line 46
    if-nez v1, :cond_3

    .line 47
    .line 48
    instance-of v1, v0, Lk7/k;

    .line 49
    .line 50
    if-nez v1, :cond_3

    .line 51
    .line 52
    :goto_0
    if-eqz p1, :cond_2

    .line 53
    .line 54
    invoke-interface {p3}, Lk7/g;->d()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    const/4 v0, 0x0

    .line 59
    :goto_1
    if-ge v0, p1, :cond_2

    .line 60
    .line 61
    invoke-interface {p3, v0}, Lk7/g;->e(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iget-object v2, p0, Lb0/k0;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-nez v2, :cond_1

    .line 74
    .line 75
    add-int/lit8 v0, v0, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 79
    .line 80
    new-instance p3, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v0, "Polymorphic serializer for "

    .line 83
    .line 84
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string p2, " has property \'"

    .line 91
    .line 92
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string p2, "\' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism"

    .line 99
    .line 100
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p1

    .line 111
    :cond_2
    return-void

    .line 112
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 113
    .line 114
    new-instance p3, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    check-cast p2, Lkotlin/jvm/internal/d;

    .line 120
    .line 121
    invoke-virtual {p2}, Lkotlin/jvm/internal/d;->e()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string p2, " of kind "

    .line 129
    .line 130
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string p2, " cannot be serialized polymorphically with class discriminator."

    .line 137
    .line 138
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw p1

    .line 149
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 150
    .line 151
    new-instance p3, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    check-cast p2, Lkotlin/jvm/internal/d;

    .line 157
    .line 158
    invoke-virtual {p2}, Lkotlin/jvm/internal/d;->e()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    const-string p2, " can\'t be registered as a subclass for polymorphic serialization because its kind "

    .line 166
    .line 167
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string p2, " is not concrete. To work with multiple hierarchies, register it as a base class."

    .line 174
    .line 175
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw p1
.end method

.method public o(Ly6/c;Lr6/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onComplete()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lb0/k0;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lb0/k0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lq5/g;

    .line 8
    .line 9
    invoke-interface {v0}, Lq5/g;->onComplete()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lb0/k0;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lb0/k0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lq5/g;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lq5/g;->onError(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 14
    .line 15
    const-string v1, "This should never happen! Report as a bug with the full stacktrace."

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lv7/d;->q(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p1, Lretrofit2/n0;

    .line 2
    .line 3
    iget-object v0, p0, Lb0/k0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lq5/g;

    .line 6
    .line 7
    iget-object v1, p1, Lretrofit2/n0;->a:Lokhttp3/i0;

    .line 8
    .line 9
    invoke-virtual {v1}, Lokhttp3/i0;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object p1, p1, Lretrofit2/n0;->b:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-interface {v0, p1}, Lq5/g;->onNext(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const/4 v1, 0x1

    .line 22
    iput-boolean v1, p0, Lb0/k0;->a:Z

    .line 23
    .line 24
    new-instance v2, Lretrofit2/adapter/rxjava2/HttpException;

    .line 25
    .line 26
    invoke-direct {v2, p1}, Lretrofit2/adapter/rxjava2/HttpException;-><init>(Lretrofit2/n0;)V

    .line 27
    .line 28
    .line 29
    :try_start_0
    invoke-interface {v0, v2}, Lq5/g;->onError(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    invoke-static {p1}, Lh4/a;->p(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    new-instance v0, Lio/reactivex/exceptions/CompositeException;

    .line 38
    .line 39
    const/4 v3, 0x2

    .line 40
    new-array v3, v3, [Ljava/lang/Throwable;

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    aput-object v2, v3, v4

    .line 44
    .line 45
    aput-object p1, v3, v1

    .line 46
    .line 47
    invoke-direct {v0, v3}, Lio/reactivex/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Lv7/d;->q(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public onSubscribe(Ls5/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb0/k0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq5/g;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lq5/g;->onSubscribe(Ls5/b;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public q(Ly6/c;Lr6/c;)V
    .locals 0

    .line 1
    const-string p2, "kClass"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

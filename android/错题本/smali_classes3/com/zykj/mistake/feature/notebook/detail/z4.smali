.class public final Lcom/zykj/mistake/feature/notebook/detail/z4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/a;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public final c:Ljava/util/ArrayList;

.field public d:Ljava/util/ArrayList;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/io/Serializable;

.field public i:Ljava/io/Serializable;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->f:Ljava/lang/Object;

    .line 5
    iput-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->g:Ljava/lang/Object;

    const/4 v1, -0x1

    .line 6
    iput v1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->b:I

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->c:Ljava/util/ArrayList;

    .line 8
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/a5;Lcom/zykj/mistake/feature/notebook/detail/f;Ljava/util/ArrayList;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/ArrayList;ILcom/zykj/mistake/feature/notebook/detail/f;Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->e:Ljava/lang/Object;

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->f:Ljava/lang/Object;

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->c:Ljava/util/ArrayList;

    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->h:Ljava/io/Serializable;

    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->d:Ljava/util/ArrayList;

    iput p6, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->b:I

    iput-object p7, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->g:Ljava/lang/Object;

    iput-object p8, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->i:Ljava/io/Serializable;

    return-void
.end method


# virtual methods
.method public a()Lokhttp3/r;
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->e:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v2, v0

    .line 4
    check-cast v2, Ljava/lang/String;

    .line 5
    .line 6
    if-eqz v2, :cond_6

    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/lang/String;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v3, 0x7

    .line 14
    invoke-static {v0, v1, v1, v3}, Lokhttp3/b;->e(Ljava/lang/String;III)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v4, v1, v1, v3}, Lokhttp3/b;->e(Ljava/lang/String;III)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    iget-object v5, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->h:Ljava/io/Serializable;

    .line 27
    .line 28
    check-cast v5, Ljava/lang/String;

    .line 29
    .line 30
    if-eqz v5, :cond_5

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/zykj/mistake/feature/notebook/detail/z4;->b()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    new-instance v7, Ljava/util/ArrayList;

    .line 37
    .line 38
    iget-object v8, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->c:Ljava/util/ArrayList;

    .line 39
    .line 40
    const/16 v9, 0xa

    .line 41
    .line 42
    invoke-static {v8, v9}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 43
    .line 44
    .line 45
    move-result v10

    .line 46
    invoke-direct {v7, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    move v11, v1

    .line 54
    :goto_0
    if-ge v11, v10, :cond_0

    .line 55
    .line 56
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v12

    .line 60
    add-int/lit8 v11, v11, 0x1

    .line 61
    .line 62
    check-cast v12, Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v12, v1, v1, v3}, Lokhttp3/b;->e(Ljava/lang/String;III)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v12

    .line 68
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    iget-object v8, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->d:Ljava/util/ArrayList;

    .line 73
    .line 74
    const/4 v10, 0x0

    .line 75
    if-eqz v8, :cond_3

    .line 76
    .line 77
    new-instance v11, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-static {v8, v9}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    invoke-direct {v11, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    move v12, v1

    .line 91
    :goto_1
    if-ge v12, v9, :cond_2

    .line 92
    .line 93
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v13

    .line 97
    add-int/lit8 v12, v12, 0x1

    .line 98
    .line 99
    check-cast v13, Ljava/lang/String;

    .line 100
    .line 101
    if-eqz v13, :cond_1

    .line 102
    .line 103
    const/4 v14, 0x3

    .line 104
    invoke-static {v13, v1, v1, v14}, Lokhttp3/b;->e(Ljava/lang/String;III)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v13

    .line 108
    goto :goto_2

    .line 109
    :cond_1
    move-object v13, v10

    .line 110
    :goto_2
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_2
    move-object v8, v11

    .line 115
    goto :goto_3

    .line 116
    :cond_3
    move-object v8, v10

    .line 117
    :goto_3
    iget-object v9, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->i:Ljava/io/Serializable;

    .line 118
    .line 119
    check-cast v9, Ljava/lang/String;

    .line 120
    .line 121
    if-eqz v9, :cond_4

    .line 122
    .line 123
    invoke-static {v9, v1, v1, v3}, Lokhttp3/b;->e(Ljava/lang/String;III)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    :cond_4
    move-object v9, v10

    .line 128
    invoke-virtual {p0}, Lcom/zykj/mistake/feature/notebook/detail/z4;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    new-instance v1, Lokhttp3/r;

    .line 133
    .line 134
    move-object v3, v0

    .line 135
    invoke-direct/range {v1 .. v10}, Lokhttp3/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return-object v1

    .line 139
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 140
    .line 141
    const-string v1, "host == null"

    .line 142
    .line 143
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw v0

    .line 147
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 148
    .line 149
    const-string v1, "scheme == null"

    .line 150
    .line 151
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    throw v0
.end method

.method public b()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->b:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const-string v2, "http"

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    const/16 v1, 0x50

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const-string v2, "https"

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x1bb

    .line 34
    .line 35
    :cond_2
    :goto_0
    return v1
.end method

.method public c(Ljava/lang/String;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, " \"\'<>#"

    .line 4
    .line 5
    const/16 v1, 0xd3

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {p1, v2, v0, v2, v1}, Lokhttp3/b;->b(Ljava/lang/String;ILjava/lang/String;II)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, Lokhttp3/b;->f(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->d:Ljava/util/ArrayList;

    .line 21
    .line 22
    return-void
.end method

.method public d(Lokhttp3/r;Ljava/lang/String;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "input"

    .line 8
    .line 9
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object v3, Lp7/c;->a:[B

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-static {v4, v3, v2}, Lp7/c;->l(IILjava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-static {v3, v5, v2}, Lp7/c;->m(IILjava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    sub-int v6, v5, v3

    .line 32
    .line 33
    const/16 v7, 0x5b

    .line 34
    .line 35
    const/16 v8, 0x3a

    .line 36
    .line 37
    const/4 v9, -0x1

    .line 38
    const/4 v10, 0x2

    .line 39
    if-ge v6, v10, :cond_0

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_0
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    const/16 v11, 0x61

    .line 47
    .line 48
    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->i(II)I

    .line 49
    .line 50
    .line 51
    move-result v12

    .line 52
    const/16 v13, 0x41

    .line 53
    .line 54
    if-ltz v12, :cond_1

    .line 55
    .line 56
    const/16 v12, 0x7a

    .line 57
    .line 58
    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->i(II)I

    .line 59
    .line 60
    .line 61
    move-result v12

    .line 62
    if-lez v12, :cond_2

    .line 63
    .line 64
    :cond_1
    invoke-static {v6, v13}, Lkotlin/jvm/internal/k;->i(II)I

    .line 65
    .line 66
    .line 67
    move-result v12

    .line 68
    if-ltz v12, :cond_9

    .line 69
    .line 70
    const/16 v12, 0x5a

    .line 71
    .line 72
    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->i(II)I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-lez v6, :cond_2

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    add-int/lit8 v6, v3, 0x1

    .line 80
    .line 81
    :goto_0
    if-ge v6, v5, :cond_9

    .line 82
    .line 83
    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    .line 84
    .line 85
    .line 86
    move-result v12

    .line 87
    if-gt v11, v12, :cond_3

    .line 88
    .line 89
    const/16 v14, 0x7b

    .line 90
    .line 91
    if-ge v12, v14, :cond_3

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    if-gt v13, v12, :cond_4

    .line 95
    .line 96
    if-ge v12, v7, :cond_4

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    const/16 v14, 0x30

    .line 100
    .line 101
    if-gt v14, v12, :cond_5

    .line 102
    .line 103
    if-ge v12, v8, :cond_5

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_5
    const/16 v14, 0x2b

    .line 107
    .line 108
    if-ne v12, v14, :cond_6

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_6
    const/16 v14, 0x2d

    .line 112
    .line 113
    if-ne v12, v14, :cond_7

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_7
    const/16 v14, 0x2e

    .line 117
    .line 118
    if-ne v12, v14, :cond_8

    .line 119
    .line 120
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_8
    if-ne v12, v8, :cond_9

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_9
    :goto_2
    move v6, v9

    .line 127
    :goto_3
    const-string v11, "http"

    .line 128
    .line 129
    const-string v12, "https"

    .line 130
    .line 131
    const-string v13, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    .line 132
    .line 133
    const/4 v14, 0x1

    .line 134
    if-eq v6, v9, :cond_c

    .line 135
    .line 136
    const-string v15, "https:"

    .line 137
    .line 138
    invoke-static {v2, v3, v15, v14}, Lkotlin/text/w;->B(Ljava/lang/String;ILjava/lang/String;Z)Z

    .line 139
    .line 140
    .line 141
    move-result v15

    .line 142
    if-eqz v15, :cond_a

    .line 143
    .line 144
    iput-object v12, v0, Lcom/zykj/mistake/feature/notebook/detail/z4;->e:Ljava/lang/Object;

    .line 145
    .line 146
    add-int/lit8 v3, v3, 0x6

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_a
    const-string v15, "http:"

    .line 150
    .line 151
    invoke-static {v2, v3, v15, v14}, Lkotlin/text/w;->B(Ljava/lang/String;ILjava/lang/String;Z)Z

    .line 152
    .line 153
    .line 154
    move-result v15

    .line 155
    if-eqz v15, :cond_b

    .line 156
    .line 157
    iput-object v11, v0, Lcom/zykj/mistake/feature/notebook/detail/z4;->e:Ljava/lang/Object;

    .line 158
    .line 159
    add-int/lit8 v3, v3, 0x5

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 163
    .line 164
    new-instance v3, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    const-string v5, "Expected URL scheme \'http\' or \'https\' but was \'"

    .line 167
    .line 168
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v4, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-static {v2, v13}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    const/16 v2, 0x27

    .line 182
    .line 183
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw v1

    .line 194
    :cond_c
    if-eqz v1, :cond_32

    .line 195
    .line 196
    iget-object v6, v1, Lokhttp3/r;->a:Ljava/lang/String;

    .line 197
    .line 198
    iput-object v6, v0, Lcom/zykj/mistake/feature/notebook/detail/z4;->e:Ljava/lang/Object;

    .line 199
    .line 200
    :goto_4
    move v6, v3

    .line 201
    move v15, v4

    .line 202
    :goto_5
    const/16 v4, 0x2f

    .line 203
    .line 204
    move/from16 v16, v14

    .line 205
    .line 206
    const/16 v14, 0x5c

    .line 207
    .line 208
    if-ge v6, v5, :cond_e

    .line 209
    .line 210
    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    if-eq v7, v14, :cond_d

    .line 215
    .line 216
    if-ne v7, v4, :cond_e

    .line 217
    .line 218
    :cond_d
    add-int/lit8 v15, v15, 0x1

    .line 219
    .line 220
    add-int/lit8 v6, v6, 0x1

    .line 221
    .line 222
    move/from16 v14, v16

    .line 223
    .line 224
    const/16 v7, 0x5b

    .line 225
    .line 226
    goto :goto_5

    .line 227
    :cond_e
    const-string v6, ""

    .line 228
    .line 229
    iget-object v8, v0, Lcom/zykj/mistake/feature/notebook/detail/z4;->c:Ljava/util/ArrayList;

    .line 230
    .line 231
    const/16 v7, 0x23

    .line 232
    .line 233
    if-ge v15, v10, :cond_11

    .line 234
    .line 235
    if-eqz v1, :cond_11

    .line 236
    .line 237
    iget-object v10, v1, Lokhttp3/r;->a:Ljava/lang/String;

    .line 238
    .line 239
    iget-object v14, v0, Lcom/zykj/mistake/feature/notebook/detail/z4;->e:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v14, Ljava/lang/String;

    .line 242
    .line 243
    invoke-static {v10, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v10

    .line 247
    if-nez v10, :cond_f

    .line 248
    .line 249
    goto :goto_6

    .line 250
    :cond_f
    invoke-virtual {v1}, Lokhttp3/r;->e()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v9

    .line 254
    iput-object v9, v0, Lcom/zykj/mistake/feature/notebook/detail/z4;->f:Ljava/lang/Object;

    .line 255
    .line 256
    invoke-virtual {v1}, Lokhttp3/r;->a()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v9

    .line 260
    iput-object v9, v0, Lcom/zykj/mistake/feature/notebook/detail/z4;->g:Ljava/lang/Object;

    .line 261
    .line 262
    iget-object v9, v1, Lokhttp3/r;->d:Ljava/lang/String;

    .line 263
    .line 264
    iput-object v9, v0, Lcom/zykj/mistake/feature/notebook/detail/z4;->h:Ljava/io/Serializable;

    .line 265
    .line 266
    iget v9, v1, Lokhttp3/r;->e:I

    .line 267
    .line 268
    iput v9, v0, Lcom/zykj/mistake/feature/notebook/detail/z4;->b:I

    .line 269
    .line 270
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v1}, Lokhttp3/r;->c()Ljava/util/ArrayList;

    .line 274
    .line 275
    .line 276
    move-result-object v9

    .line 277
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 278
    .line 279
    .line 280
    if-eq v3, v5, :cond_10

    .line 281
    .line 282
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    .line 283
    .line 284
    .line 285
    move-result v9

    .line 286
    if-ne v9, v7, :cond_22

    .line 287
    .line 288
    :cond_10
    invoke-virtual {v1}, Lokhttp3/r;->d()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/notebook/detail/z4;->c(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    goto/16 :goto_11

    .line 296
    .line 297
    :cond_11
    :goto_6
    add-int/2addr v3, v15

    .line 298
    const/4 v1, 0x0

    .line 299
    const/4 v10, 0x0

    .line 300
    :goto_7
    const-string v14, "@/\\?#"

    .line 301
    .line 302
    invoke-static {v3, v5, v2, v14}, Lp7/c;->e(IILjava/lang/String;Ljava/lang/String;)I

    .line 303
    .line 304
    .line 305
    move-result v14

    .line 306
    if-eq v14, v5, :cond_12

    .line 307
    .line 308
    invoke-virtual {v2, v14}, Ljava/lang/String;->charAt(I)C

    .line 309
    .line 310
    .line 311
    move-result v15

    .line 312
    goto :goto_8

    .line 313
    :cond_12
    move v15, v9

    .line 314
    :goto_8
    if-eq v15, v9, :cond_17

    .line 315
    .line 316
    if-eq v15, v7, :cond_17

    .line 317
    .line 318
    if-eq v15, v4, :cond_17

    .line 319
    .line 320
    const/16 v7, 0x5c

    .line 321
    .line 322
    if-eq v15, v7, :cond_17

    .line 323
    .line 324
    const/16 v7, 0x3f

    .line 325
    .line 326
    if-eq v15, v7, :cond_17

    .line 327
    .line 328
    const/16 v7, 0x40

    .line 329
    .line 330
    if-eq v15, v7, :cond_13

    .line 331
    .line 332
    const/16 v7, 0x23

    .line 333
    .line 334
    goto :goto_7

    .line 335
    :cond_13
    const-string v7, " \"\':;<=>@[]^`{}|/\\?#"

    .line 336
    .line 337
    const-string v15, "%40"

    .line 338
    .line 339
    if-nez v1, :cond_16

    .line 340
    .line 341
    const/16 v4, 0x3a

    .line 342
    .line 343
    invoke-static {v2, v4, v3, v14}, Lp7/c;->f(Ljava/lang/String;CII)I

    .line 344
    .line 345
    .line 346
    move-result v9

    .line 347
    const/16 v4, 0xf0

    .line 348
    .line 349
    invoke-static {v2, v3, v7, v9, v4}, Lokhttp3/b;->b(Ljava/lang/String;ILjava/lang/String;II)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    if-eqz v10, :cond_14

    .line 354
    .line 355
    new-instance v4, Ljava/lang/StringBuilder;

    .line 356
    .line 357
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 358
    .line 359
    .line 360
    iget-object v10, v0, Lcom/zykj/mistake/feature/notebook/detail/z4;->f:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v10, Ljava/lang/String;

    .line 363
    .line 364
    invoke-static {v4, v10, v15, v3}, Landroid/support/v4/media/f;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    :cond_14
    iput-object v3, v0, Lcom/zykj/mistake/feature/notebook/detail/z4;->f:Ljava/lang/Object;

    .line 369
    .line 370
    if-eq v9, v14, :cond_15

    .line 371
    .line 372
    add-int/lit8 v9, v9, 0x1

    .line 373
    .line 374
    const/16 v4, 0xf0

    .line 375
    .line 376
    invoke-static {v2, v9, v7, v14, v4}, Lokhttp3/b;->b(Ljava/lang/String;ILjava/lang/String;II)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/z4;->g:Ljava/lang/Object;

    .line 381
    .line 382
    move/from16 v1, v16

    .line 383
    .line 384
    goto :goto_9

    .line 385
    :cond_15
    const/16 v4, 0xf0

    .line 386
    .line 387
    :goto_9
    move/from16 v10, v16

    .line 388
    .line 389
    goto :goto_a

    .line 390
    :cond_16
    const/16 v4, 0xf0

    .line 391
    .line 392
    new-instance v9, Ljava/lang/StringBuilder;

    .line 393
    .line 394
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 395
    .line 396
    .line 397
    iget-object v4, v0, Lcom/zykj/mistake/feature/notebook/detail/z4;->g:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v4, Ljava/lang/String;

    .line 400
    .line 401
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    const/16 v4, 0xf0

    .line 408
    .line 409
    invoke-static {v2, v3, v7, v14, v4}, Lokhttp3/b;->b(Ljava/lang/String;ILjava/lang/String;II)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    iput-object v3, v0, Lcom/zykj/mistake/feature/notebook/detail/z4;->g:Ljava/lang/Object;

    .line 421
    .line 422
    :goto_a
    add-int/lit8 v3, v14, 0x1

    .line 423
    .line 424
    const/16 v4, 0x2f

    .line 425
    .line 426
    const/16 v7, 0x23

    .line 427
    .line 428
    const/4 v9, -0x1

    .line 429
    goto/16 :goto_7

    .line 430
    .line 431
    :cond_17
    move v1, v3

    .line 432
    :goto_b
    if-ge v1, v14, :cond_1c

    .line 433
    .line 434
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 435
    .line 436
    .line 437
    move-result v4

    .line 438
    const/16 v7, 0x5b

    .line 439
    .line 440
    if-ne v4, v7, :cond_1a

    .line 441
    .line 442
    :cond_18
    add-int/lit8 v1, v1, 0x1

    .line 443
    .line 444
    if-ge v1, v14, :cond_19

    .line 445
    .line 446
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 447
    .line 448
    .line 449
    move-result v4

    .line 450
    const/16 v9, 0x5d

    .line 451
    .line 452
    if-ne v4, v9, :cond_18

    .line 453
    .line 454
    :cond_19
    const/16 v9, 0x3a

    .line 455
    .line 456
    goto :goto_c

    .line 457
    :cond_1a
    const/16 v9, 0x3a

    .line 458
    .line 459
    if-ne v4, v9, :cond_1b

    .line 460
    .line 461
    goto :goto_d

    .line 462
    :cond_1b
    :goto_c
    add-int/lit8 v1, v1, 0x1

    .line 463
    .line 464
    goto :goto_b

    .line 465
    :cond_1c
    move v1, v14

    .line 466
    :goto_d
    add-int/lit8 v4, v1, 0x1

    .line 467
    .line 468
    const/4 v7, 0x4

    .line 469
    const/16 v9, 0x22

    .line 470
    .line 471
    if-ge v4, v14, :cond_1f

    .line 472
    .line 473
    invoke-static {v2, v3, v1, v7}, Lokhttp3/b;->e(Ljava/lang/String;III)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v7

    .line 477
    invoke-static {v7}, Lkotlin/collections/u;->M(Ljava/lang/String;)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v7

    .line 481
    iput-object v7, v0, Lcom/zykj/mistake/feature/notebook/detail/z4;->h:Ljava/io/Serializable;

    .line 482
    .line 483
    const/16 v7, 0xf8

    .line 484
    .line 485
    :try_start_0
    invoke-static {v2, v4, v6, v14, v7}, Lokhttp3/b;->b(Ljava/lang/String;ILjava/lang/String;II)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v7

    .line 489
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 490
    .line 491
    .line 492
    move-result v7
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 493
    move/from16 v10, v16

    .line 494
    .line 495
    if-gt v10, v7, :cond_1d

    .line 496
    .line 497
    const/high16 v10, 0x10000

    .line 498
    .line 499
    if-ge v7, v10, :cond_1d

    .line 500
    .line 501
    goto :goto_e

    .line 502
    :catch_0
    :cond_1d
    const/4 v7, -0x1

    .line 503
    :goto_e
    iput v7, v0, Lcom/zykj/mistake/feature/notebook/detail/z4;->b:I

    .line 504
    .line 505
    const/4 v10, -0x1

    .line 506
    if-eq v7, v10, :cond_1e

    .line 507
    .line 508
    goto :goto_10

    .line 509
    :cond_1e
    new-instance v1, Ljava/lang/StringBuilder;

    .line 510
    .line 511
    const-string v3, "Invalid URL port: \""

    .line 512
    .line 513
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v2, v4, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    invoke-static {v2, v13}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 534
    .line 535
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v1

    .line 539
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    throw v2

    .line 543
    :cond_1f
    const/4 v10, -0x1

    .line 544
    invoke-static {v2, v3, v1, v7}, Lokhttp3/b;->e(Ljava/lang/String;III)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v4

    .line 548
    invoke-static {v4}, Lkotlin/collections/u;->M(Ljava/lang/String;)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v4

    .line 552
    iput-object v4, v0, Lcom/zykj/mistake/feature/notebook/detail/z4;->h:Ljava/io/Serializable;

    .line 553
    .line 554
    iget-object v4, v0, Lcom/zykj/mistake/feature/notebook/detail/z4;->e:Ljava/lang/Object;

    .line 555
    .line 556
    check-cast v4, Ljava/lang/String;

    .line 557
    .line 558
    invoke-static {v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v4, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 562
    .line 563
    .line 564
    move-result v7

    .line 565
    if-eqz v7, :cond_20

    .line 566
    .line 567
    const/16 v4, 0x50

    .line 568
    .line 569
    goto :goto_f

    .line 570
    :cond_20
    invoke-virtual {v4, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    move-result v4

    .line 574
    if-eqz v4, :cond_21

    .line 575
    .line 576
    const/16 v4, 0x1bb

    .line 577
    .line 578
    goto :goto_f

    .line 579
    :cond_21
    move v4, v10

    .line 580
    :goto_f
    iput v4, v0, Lcom/zykj/mistake/feature/notebook/detail/z4;->b:I

    .line 581
    .line 582
    :goto_10
    iget-object v4, v0, Lcom/zykj/mistake/feature/notebook/detail/z4;->h:Ljava/io/Serializable;

    .line 583
    .line 584
    check-cast v4, Ljava/lang/String;

    .line 585
    .line 586
    if-eqz v4, :cond_31

    .line 587
    .line 588
    move v3, v14

    .line 589
    :cond_22
    :goto_11
    const-string v1, "?#"

    .line 590
    .line 591
    invoke-static {v3, v5, v2, v1}, Lp7/c;->e(IILjava/lang/String;Ljava/lang/String;)I

    .line 592
    .line 593
    .line 594
    move-result v1

    .line 595
    if-ne v3, v1, :cond_23

    .line 596
    .line 597
    goto/16 :goto_18

    .line 598
    .line 599
    :cond_23
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    .line 600
    .line 601
    .line 602
    move-result v4

    .line 603
    const/16 v7, 0x2f

    .line 604
    .line 605
    if-eq v4, v7, :cond_25

    .line 606
    .line 607
    const/16 v7, 0x5c

    .line 608
    .line 609
    if-ne v4, v7, :cond_24

    .line 610
    .line 611
    goto :goto_12

    .line 612
    :cond_24
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 613
    .line 614
    .line 615
    move-result v4

    .line 616
    const/16 v16, 0x1

    .line 617
    .line 618
    add-int/lit8 v4, v4, -0x1

    .line 619
    .line 620
    invoke-virtual {v8, v4, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    goto :goto_13

    .line 624
    :cond_25
    :goto_12
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    add-int/lit8 v3, v3, 0x1

    .line 631
    .line 632
    :goto_13
    if-ge v3, v1, :cond_2e

    .line 633
    .line 634
    const-string v4, "/\\"

    .line 635
    .line 636
    invoke-static {v3, v1, v2, v4}, Lp7/c;->e(IILjava/lang/String;Ljava/lang/String;)I

    .line 637
    .line 638
    .line 639
    move-result v4

    .line 640
    if-ge v4, v1, :cond_26

    .line 641
    .line 642
    const/4 v10, 0x1

    .line 643
    goto :goto_14

    .line 644
    :cond_26
    const/4 v10, 0x0

    .line 645
    :goto_14
    const-string v7, " \"<>^`{}|/\\?#"

    .line 646
    .line 647
    const/16 v9, 0xf0

    .line 648
    .line 649
    invoke-static {v2, v3, v7, v4, v9}, Lokhttp3/b;->b(Ljava/lang/String;ILjava/lang/String;II)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v3

    .line 653
    const-string v7, "."

    .line 654
    .line 655
    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    move-result v7

    .line 659
    if-nez v7, :cond_2c

    .line 660
    .line 661
    const-string v7, "%2e"

    .line 662
    .line 663
    const/4 v11, 0x1

    .line 664
    invoke-static {v3, v7, v11}, Lkotlin/text/w;->v(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 665
    .line 666
    .line 667
    move-result v7

    .line 668
    if-eqz v7, :cond_27

    .line 669
    .line 670
    goto :goto_17

    .line 671
    :cond_27
    const-string v7, ".."

    .line 672
    .line 673
    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 674
    .line 675
    .line 676
    move-result v7

    .line 677
    if-nez v7, :cond_2a

    .line 678
    .line 679
    const-string v7, "%2e."

    .line 680
    .line 681
    invoke-static {v3, v7, v11}, Lkotlin/text/w;->v(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 682
    .line 683
    .line 684
    move-result v7

    .line 685
    if-nez v7, :cond_2a

    .line 686
    .line 687
    const-string v7, ".%2e"

    .line 688
    .line 689
    invoke-static {v3, v7, v11}, Lkotlin/text/w;->v(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 690
    .line 691
    .line 692
    move-result v7

    .line 693
    if-nez v7, :cond_2a

    .line 694
    .line 695
    const-string v7, "%2e%2e"

    .line 696
    .line 697
    invoke-static {v3, v7, v11}, Lkotlin/text/w;->v(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 698
    .line 699
    .line 700
    move-result v7

    .line 701
    if-eqz v7, :cond_28

    .line 702
    .line 703
    goto :goto_16

    .line 704
    :cond_28
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 705
    .line 706
    .line 707
    move-result v7

    .line 708
    sub-int/2addr v7, v11

    .line 709
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    move-result-object v7

    .line 713
    check-cast v7, Ljava/lang/CharSequence;

    .line 714
    .line 715
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 716
    .line 717
    .line 718
    move-result v7

    .line 719
    if-nez v7, :cond_29

    .line 720
    .line 721
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 722
    .line 723
    .line 724
    move-result v7

    .line 725
    sub-int/2addr v7, v11

    .line 726
    invoke-virtual {v8, v7, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    goto :goto_15

    .line 730
    :cond_29
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 731
    .line 732
    .line 733
    :goto_15
    if-eqz v10, :cond_2c

    .line 734
    .line 735
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 736
    .line 737
    .line 738
    goto :goto_17

    .line 739
    :cond_2a
    :goto_16
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 740
    .line 741
    .line 742
    move-result v3

    .line 743
    const/16 v16, 0x1

    .line 744
    .line 745
    add-int/lit8 v3, v3, -0x1

    .line 746
    .line 747
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v3

    .line 751
    check-cast v3, Ljava/lang/String;

    .line 752
    .line 753
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 754
    .line 755
    .line 756
    move-result v3

    .line 757
    if-nez v3, :cond_2b

    .line 758
    .line 759
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 760
    .line 761
    .line 762
    move-result v3

    .line 763
    if-nez v3, :cond_2b

    .line 764
    .line 765
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 766
    .line 767
    .line 768
    move-result v3

    .line 769
    add-int/lit8 v3, v3, -0x1

    .line 770
    .line 771
    invoke-virtual {v8, v3, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    goto :goto_17

    .line 775
    :cond_2b
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 776
    .line 777
    .line 778
    :cond_2c
    :goto_17
    if-eqz v10, :cond_2d

    .line 779
    .line 780
    add-int/lit8 v3, v4, 0x1

    .line 781
    .line 782
    goto/16 :goto_13

    .line 783
    .line 784
    :cond_2d
    move v3, v4

    .line 785
    goto/16 :goto_13

    .line 786
    .line 787
    :cond_2e
    :goto_18
    if-ge v1, v5, :cond_2f

    .line 788
    .line 789
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 790
    .line 791
    .line 792
    move-result v3

    .line 793
    const/16 v7, 0x3f

    .line 794
    .line 795
    if-ne v3, v7, :cond_2f

    .line 796
    .line 797
    const/16 v3, 0x23

    .line 798
    .line 799
    invoke-static {v2, v3, v1, v5}, Lp7/c;->f(Ljava/lang/String;CII)I

    .line 800
    .line 801
    .line 802
    move-result v4

    .line 803
    add-int/lit8 v1, v1, 0x1

    .line 804
    .line 805
    const-string v3, " \"\'<>#"

    .line 806
    .line 807
    const/16 v7, 0xd0

    .line 808
    .line 809
    invoke-static {v2, v1, v3, v4, v7}, Lokhttp3/b;->b(Ljava/lang/String;ILjava/lang/String;II)Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v1

    .line 813
    invoke-static {v1}, Lokhttp3/b;->f(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 814
    .line 815
    .line 816
    move-result-object v1

    .line 817
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/z4;->d:Ljava/util/ArrayList;

    .line 818
    .line 819
    move v1, v4

    .line 820
    :cond_2f
    if-ge v1, v5, :cond_30

    .line 821
    .line 822
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 823
    .line 824
    .line 825
    move-result v3

    .line 826
    const/16 v4, 0x23

    .line 827
    .line 828
    if-ne v3, v4, :cond_30

    .line 829
    .line 830
    const/16 v16, 0x1

    .line 831
    .line 832
    add-int/lit8 v1, v1, 0x1

    .line 833
    .line 834
    const/16 v3, 0xb0

    .line 835
    .line 836
    invoke-static {v2, v1, v6, v5, v3}, Lokhttp3/b;->b(Ljava/lang/String;ILjava/lang/String;II)Ljava/lang/String;

    .line 837
    .line 838
    .line 839
    move-result-object v1

    .line 840
    iput-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/z4;->i:Ljava/io/Serializable;

    .line 841
    .line 842
    :cond_30
    return-void

    .line 843
    :cond_31
    new-instance v4, Ljava/lang/StringBuilder;

    .line 844
    .line 845
    const-string v5, "Invalid URL host: \""

    .line 846
    .line 847
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 848
    .line 849
    .line 850
    invoke-virtual {v2, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 851
    .line 852
    .line 853
    move-result-object v1

    .line 854
    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 855
    .line 856
    .line 857
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 858
    .line 859
    .line 860
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 861
    .line 862
    .line 863
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object v1

    .line 867
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 868
    .line 869
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 870
    .line 871
    .line 872
    move-result-object v1

    .line 873
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 874
    .line 875
    .line 876
    throw v2

    .line 877
    :cond_32
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 878
    .line 879
    .line 880
    move-result v1

    .line 881
    const/4 v3, 0x6

    .line 882
    if-le v1, v3, :cond_33

    .line 883
    .line 884
    invoke-static {v3, v2}, Lkotlin/text/p;->i0(ILjava/lang/String;)Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v1

    .line 888
    const-string v2, "..."

    .line 889
    .line 890
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 891
    .line 892
    .line 893
    move-result-object v1

    .line 894
    goto :goto_19

    .line 895
    :cond_33
    move-object v1, v2

    .line 896
    :goto_19
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 897
    .line 898
    const-string v3, "Expected URL scheme \'http\' or \'https\' but no scheme was found for "

    .line 899
    .line 900
    invoke-static {v3, v1}, Landroid/support/v4/media/f;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 901
    .line 902
    .line 903
    move-result-object v1

    .line 904
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 905
    .line 906
    .line 907
    throw v2
.end method

.method public f(Lcoil3/k;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->h:Ljava/io/Serializable;

    .line 10
    .line 11
    check-cast v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->c:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-static {p1, v0, v2, v1}, Lcom/zykj/mistake/feature/notebook/detail/a5;->a(Lcom/zykj/mistake/feature/notebook/detail/a5;Lcom/zykj/mistake/feature/notebook/detail/f;Ljava/util/ArrayList;Ljava/util/concurrent/atomic/AtomicInteger;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public m(Lcoil3/k;)V
    .locals 0

    .line 1
    return-void
.end method

.method public q(Lcoil3/k;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcoil3/o;->j(Lcoil3/k;)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->d:Ljava/util/ArrayList;

    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->b:I

    .line 8
    .line 9
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 19
    .line 20
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->i:Ljava/io/Serializable;

    .line 21
    .line 22
    check-cast v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 23
    .line 24
    invoke-static {p1, v1, v0, v2}, Lcom/zykj/mistake/feature/notebook/detail/a5;->a(Lcom/zykj/mistake/feature/notebook/detail/a5;Lcom/zykj/mistake/feature/notebook/detail/f;Ljava/util/ArrayList;Ljava/util/concurrent/atomic/AtomicInteger;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/lang/String;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, "://"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string v1, "//"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->f:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/16 v2, 0x3a

    .line 45
    .line 46
    if-lez v1, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->g:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-lez v1, :cond_3

    .line 58
    .line 59
    :goto_1
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->f:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->g:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-lez v1, :cond_2

    .line 75
    .line 76
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->g:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    :cond_2
    const/16 v1, 0x40

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    :cond_3
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->h:Ljava/io/Serializable;

    .line 92
    .line 93
    check-cast v1, Ljava/lang/String;

    .line 94
    .line 95
    if-eqz v1, :cond_5

    .line 96
    .line 97
    invoke-static {v1, v2}, Lkotlin/text/p;->G(Ljava/lang/CharSequence;C)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_4

    .line 102
    .line 103
    const/16 v1, 0x5b

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->h:Ljava/io/Serializable;

    .line 109
    .line 110
    check-cast v1, Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const/16 v1, 0x5d

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->h:Ljava/io/Serializable;

    .line 122
    .line 123
    check-cast v1, Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    :cond_5
    :goto_2
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->b:I

    .line 129
    .line 130
    const/4 v3, -0x1

    .line 131
    if-ne v1, v3, :cond_6

    .line 132
    .line 133
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->e:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v1, Ljava/lang/String;

    .line 136
    .line 137
    if-eqz v1, :cond_a

    .line 138
    .line 139
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/mistake/feature/notebook/detail/z4;->b()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->e:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v4, Ljava/lang/String;

    .line 146
    .line 147
    if-eqz v4, :cond_9

    .line 148
    .line 149
    const-string v5, "http"

    .line 150
    .line 151
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-eqz v5, :cond_7

    .line 156
    .line 157
    const/16 v3, 0x50

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_7
    const-string v5, "https"

    .line 161
    .line 162
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-eqz v4, :cond_8

    .line 167
    .line 168
    const/16 v3, 0x1bb

    .line 169
    .line 170
    :cond_8
    :goto_3
    if-eq v1, v3, :cond_a

    .line 171
    .line 172
    :cond_9
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    :cond_a
    const-string v1, "<this>"

    .line 179
    .line 180
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->c:Ljava/util/ArrayList;

    .line 181
    .line 182
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    const/4 v3, 0x0

    .line 190
    move v4, v3

    .line 191
    :goto_4
    if-ge v4, v1, :cond_b

    .line 192
    .line 193
    const/16 v5, 0x2f

    .line 194
    .line 195
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    check-cast v5, Ljava/lang/String;

    .line 203
    .line 204
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    add-int/lit8 v4, v4, 0x1

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_b
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->d:Ljava/util/ArrayList;

    .line 211
    .line 212
    if-eqz v1, :cond_10

    .line 213
    .line 214
    const/16 v1, 0x3f

    .line 215
    .line 216
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->d:Ljava/util/ArrayList;

    .line 220
    .line 221
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    invoke-static {v3, v2}, Lkotlin/collections/u;->N(II)Lx6/f;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    const/4 v3, 0x2

    .line 233
    invoke-static {v2, v3}, Lkotlin/collections/u;->J(Lx6/f;I)Lx6/d;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    iget v3, v2, Lx6/d;->a:I

    .line 238
    .line 239
    iget v4, v2, Lx6/d;->b:I

    .line 240
    .line 241
    iget v2, v2, Lx6/d;->c:I

    .line 242
    .line 243
    if-lez v2, :cond_c

    .line 244
    .line 245
    if-le v3, v4, :cond_d

    .line 246
    .line 247
    :cond_c
    if-gez v2, :cond_10

    .line 248
    .line 249
    if-gt v4, v3, :cond_10

    .line 250
    .line 251
    :cond_d
    :goto_5
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    check-cast v5, Ljava/lang/String;

    .line 256
    .line 257
    add-int/lit8 v6, v3, 0x1

    .line 258
    .line 259
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v6

    .line 263
    check-cast v6, Ljava/lang/String;

    .line 264
    .line 265
    if-lez v3, :cond_e

    .line 266
    .line 267
    const/16 v7, 0x26

    .line 268
    .line 269
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    :cond_e
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    if-eqz v6, :cond_f

    .line 276
    .line 277
    const/16 v5, 0x3d

    .line 278
    .line 279
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    :cond_f
    if-eq v3, v4, :cond_10

    .line 286
    .line 287
    add-int/2addr v3, v2

    .line 288
    goto :goto_5

    .line 289
    :cond_10
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->i:Ljava/io/Serializable;

    .line 290
    .line 291
    check-cast v1, Ljava/lang/String;

    .line 292
    .line 293
    if-eqz v1, :cond_11

    .line 294
    .line 295
    const/16 v1, 0x23

    .line 296
    .line 297
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/z4;->i:Ljava/io/Serializable;

    .line 301
    .line 302
    check-cast v1, Ljava/lang/String;

    .line 303
    .line 304
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    :cond_11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    const-string v1, "StringBuilder().apply(builderAction).toString()"

    .line 312
    .line 313
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    return-object v0

    .line 317
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

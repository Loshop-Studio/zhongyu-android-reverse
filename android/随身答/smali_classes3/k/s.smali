.class public abstract Lk/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lk/r;
    .locals 8

    .line 1
    if-nez p0, :cond_1

    .line 2
    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    if-nez p2, :cond_1

    .line 6
    .line 7
    if-nez p3, :cond_1

    .line 8
    .line 9
    if-eqz p4, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string p1, "At least one of scheme, authority, path, query, or fragment must be non-null."

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0

    .line 20
    :cond_1
    :goto_0
    new-instance v0, Lk/r;

    .line 21
    .line 22
    invoke-static {p0, p1, p2, p3, p4}, Lk/s;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    move-object v3, p0

    .line 27
    move-object v4, p1

    .line 28
    move-object v5, p2

    .line 29
    move-object v6, p3

    .line 30
    move-object v7, p4

    .line 31
    move-object v2, p5

    .line 32
    invoke-direct/range {v0 .. v7}, Lk/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public static synthetic b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lk/r;
    .locals 1

    .line 1
    and-int/lit8 p7, p6, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p7, :cond_0

    .line 5
    .line 6
    move-object p0, v0

    .line 7
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 8
    .line 9
    if-eqz p7, :cond_1

    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :cond_1
    and-int/lit8 p7, p6, 0x4

    .line 13
    .line 14
    if-eqz p7, :cond_2

    .line 15
    .line 16
    move-object p2, v0

    .line 17
    :cond_2
    and-int/lit8 p7, p6, 0x8

    .line 18
    .line 19
    if-eqz p7, :cond_3

    .line 20
    .line 21
    move-object p3, v0

    .line 22
    :cond_3
    and-int/lit8 p7, p6, 0x10

    .line 23
    .line 24
    if-eqz p7, :cond_4

    .line 25
    .line 26
    move-object p4, v0

    .line 27
    :cond_4
    and-int/lit8 p6, p6, 0x20

    .line 28
    .line 29
    if-eqz p6, :cond_5

    .line 30
    .line 31
    sget-object p5, Lokio/Path;->DIRECTORY_SEPARATOR:Ljava/lang/String;

    .line 32
    .line 33
    :cond_5
    invoke-static/range {p0 .. p5}, Lk/s;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lk/r;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public static final c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const/16 p0, 0x3a

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    :cond_0
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const-string p0, "//"

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    :cond_1
    if-eqz p2, :cond_2

    .line 27
    .line 28
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    :cond_2
    if-eqz p3, :cond_3

    .line 32
    .line 33
    const/16 p0, 0x3f

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    :cond_3
    if-eqz p4, :cond_4

    .line 42
    .line 43
    const/16 p0, 0x23

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public static final d(Lk/r;)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-static {p0}, Lk/s;->f(Lk/r;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    return-object v2

    .line 13
    :cond_0
    invoke-virtual {p0}, Lk/r;->b()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lk/r;->d()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x2

    .line 26
    invoke-static {v1, v3, v4, v5, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Lk/r;->d()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :goto_0
    move-object v2, v1

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const-string v1, ""

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :goto_1
    invoke-virtual {p0}, Lk/r;->d()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const/16 v7, 0x3c

    .line 46
    .line 47
    const/4 v8, 0x0

    .line 48
    const/4 v3, 0x0

    .line 49
    const/4 v4, 0x0

    .line 50
    const/4 v5, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    invoke-static/range {v0 .. v8}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method

.method public static final e(Ljava/lang/String;)I
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public static final f(Lk/r;)Ljava/util/List;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lk/r;->b()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v6, -0x1

    .line 18
    move v1, v6

    .line 19
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-ge v1, v2, :cond_3

    .line 24
    .line 25
    add-int/lit8 v2, v1, 0x1

    .line 26
    .line 27
    const/4 v4, 0x4

    .line 28
    const/4 v5, 0x0

    .line 29
    const/16 v1, 0x2f

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-ne v1, v6, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    :cond_2
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const-string v3, "substring(...)"

    .line 47
    .line 48
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-lez v3, :cond_1

    .line 56
    .line 57
    invoke-interface {p0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    return-object p0
.end method

.method public static final g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lk/r;
    .locals 15

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    const/4 v3, -0x1

    .line 5
    const/4 v4, 0x0

    .line 6
    move v8, v2

    .line 7
    move v6, v3

    .line 8
    move v7, v6

    .line 9
    move v9, v7

    .line 10
    move v10, v9

    .line 11
    move v11, v10

    .line 12
    move v5, v4

    .line 13
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v12

    .line 17
    if-ge v5, v12, :cond_7

    .line 18
    .line 19
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result v12

    .line 23
    const/16 v13, 0x23

    .line 24
    .line 25
    if-eq v12, v13, :cond_5

    .line 26
    .line 27
    const/16 v13, 0x2f

    .line 28
    .line 29
    if-eq v12, v13, :cond_3

    .line 30
    .line 31
    const/16 v14, 0x3a

    .line 32
    .line 33
    if-eq v12, v14, :cond_1

    .line 34
    .line 35
    const/16 v13, 0x3f

    .line 36
    .line 37
    if-eq v12, v13, :cond_0

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_0
    if-ne v9, v3, :cond_6

    .line 41
    .line 42
    if-ne v6, v3, :cond_6

    .line 43
    .line 44
    add-int/lit8 v9, v5, 0x1

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    if-eqz v8, :cond_6

    .line 48
    .line 49
    if-ne v9, v3, :cond_6

    .line 50
    .line 51
    if-ne v6, v3, :cond_6

    .line 52
    .line 53
    add-int/lit8 v12, v5, 0x2

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result v14

    .line 59
    if-ge v12, v14, :cond_2

    .line 60
    .line 61
    add-int/lit8 v14, v5, 0x1

    .line 62
    .line 63
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    .line 64
    .line 65
    .line 66
    move-result v14

    .line 67
    if-ne v14, v13, :cond_2

    .line 68
    .line 69
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    .line 70
    .line 71
    .line 72
    move-result v14

    .line 73
    if-ne v14, v13, :cond_2

    .line 74
    .line 75
    add-int/lit8 v10, v5, 0x3

    .line 76
    .line 77
    move v8, v4

    .line 78
    move v11, v5

    .line 79
    move v5, v12

    .line 80
    goto :goto_2

    .line 81
    :cond_2
    invoke-static/range {p0 .. p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v12

    .line 85
    if-eqz v12, :cond_6

    .line 86
    .line 87
    add-int/lit8 v7, v5, 0x1

    .line 88
    .line 89
    move v11, v5

    .line 90
    move v5, v7

    .line 91
    move v10, v5

    .line 92
    goto :goto_2

    .line 93
    :cond_3
    if-ne v7, v3, :cond_6

    .line 94
    .line 95
    if-ne v9, v3, :cond_6

    .line 96
    .line 97
    if-ne v6, v3, :cond_6

    .line 98
    .line 99
    if-ne v10, v3, :cond_4

    .line 100
    .line 101
    move v7, v4

    .line 102
    goto :goto_1

    .line 103
    :cond_4
    move v7, v5

    .line 104
    :goto_1
    move v8, v4

    .line 105
    goto :goto_2

    .line 106
    :cond_5
    if-ne v6, v3, :cond_6

    .line 107
    .line 108
    add-int/lit8 v6, v5, 0x1

    .line 109
    .line 110
    :cond_6
    :goto_2
    add-int/2addr v5, v2

    .line 111
    goto :goto_0

    .line 112
    :cond_7
    const v0, 0x7fffffff

    .line 113
    .line 114
    .line 115
    if-ne v6, v3, :cond_8

    .line 116
    .line 117
    move v2, v0

    .line 118
    goto :goto_3

    .line 119
    :cond_8
    add-int/lit8 v2, v6, -0x1

    .line 120
    .line 121
    :goto_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-ne v9, v3, :cond_9

    .line 130
    .line 131
    move v5, v0

    .line 132
    goto :goto_4

    .line 133
    :cond_9
    add-int/lit8 v5, v9, -0x1

    .line 134
    .line 135
    :goto_4
    invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    const-string v8, "substring(...)"

    .line 140
    .line 141
    const/4 v12, 0x0

    .line 142
    if-eq v10, v3, :cond_b

    .line 143
    .line 144
    invoke-virtual {p0, v4, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v11

    .line 148
    invoke-static {v11, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    if-ne v7, v3, :cond_a

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_a
    move v0, v7

    .line 155
    :goto_5
    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    invoke-virtual {p0, v10, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_b
    move-object v0, v12

    .line 168
    move-object v11, v0

    .line 169
    :goto_6
    if-eq v7, v3, :cond_c

    .line 170
    .line 171
    invoke-virtual {p0, v7, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    goto :goto_7

    .line 179
    :cond_c
    move-object v5, v12

    .line 180
    :goto_7
    if-eq v9, v3, :cond_d

    .line 181
    .line 182
    invoke-virtual {p0, v9, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    goto :goto_8

    .line 190
    :cond_d
    move-object v2, v12

    .line 191
    :goto_8
    if-eq v6, v3, :cond_e

    .line 192
    .line 193
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    invoke-virtual {p0, v6, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    goto :goto_9

    .line 205
    :cond_e
    move-object v3, v12

    .line 206
    :goto_9
    invoke-static {v11}, Lk/s;->e(Ljava/lang/String;)I

    .line 207
    .line 208
    .line 209
    move-result v6

    .line 210
    invoke-static {v0}, Lk/s;->e(Ljava/lang/String;)I

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    invoke-static {v5}, Lk/s;->e(Ljava/lang/String;)I

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    invoke-static {v2}, Lk/s;->e(Ljava/lang/String;)I

    .line 219
    .line 220
    .line 221
    move-result v9

    .line 222
    invoke-static {v3}, Lk/s;->e(Ljava/lang/String;)I

    .line 223
    .line 224
    .line 225
    move-result v10

    .line 226
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    .line 227
    .line 228
    .line 229
    move-result v9

    .line 230
    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    .line 231
    .line 232
    .line 233
    move-result v8

    .line 234
    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    .line 235
    .line 236
    .line 237
    move-result v7

    .line 238
    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    .line 239
    .line 240
    .line 241
    move-result v6

    .line 242
    add-int/lit8 v6, v6, -0x2

    .line 243
    .line 244
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    new-array v4, v4, [B

    .line 249
    .line 250
    new-instance v6, Lk/r;

    .line 251
    .line 252
    if-eqz v11, :cond_f

    .line 253
    .line 254
    invoke-static {v11, v4}, Lk/s;->h(Ljava/lang/String;[B)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    goto :goto_a

    .line 259
    :cond_f
    move-object v7, v12

    .line 260
    :goto_a
    if-eqz v0, :cond_10

    .line 261
    .line 262
    invoke-static {v0, v4}, Lk/s;->h(Ljava/lang/String;[B)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    goto :goto_b

    .line 267
    :cond_10
    move-object v0, v12

    .line 268
    :goto_b
    if-eqz v5, :cond_11

    .line 269
    .line 270
    invoke-static {v5, v4}, Lk/s;->h(Ljava/lang/String;[B)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v5

    .line 274
    goto :goto_c

    .line 275
    :cond_11
    move-object v5, v12

    .line 276
    :goto_c
    if-eqz v2, :cond_12

    .line 277
    .line 278
    invoke-static {v2, v4}, Lk/s;->h(Ljava/lang/String;[B)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    goto :goto_d

    .line 283
    :cond_12
    move-object v2, v12

    .line 284
    :goto_d
    if-eqz v3, :cond_13

    .line 285
    .line 286
    invoke-static {v3, v4}, Lk/s;->h(Ljava/lang/String;[B)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v12

    .line 290
    :cond_13
    move-object v1, p0

    .line 291
    move-object v4, v0

    .line 292
    move-object v0, v6

    .line 293
    move-object v3, v7

    .line 294
    move-object v7, v12

    .line 295
    move-object v6, v2

    .line 296
    move-object/from16 v2, p2

    .line 297
    .line 298
    invoke-direct/range {v0 .. v7}, Lk/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    return-object v0
.end method

.method public static final h(Ljava/lang/String;[B)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v1, v0, -0x2

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    move v5, v2

    .line 13
    :goto_0
    if-lt v2, v1, :cond_2

    .line 14
    .line 15
    if-ne v2, v5, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    if-lt v2, v0, :cond_1

    .line 19
    .line 20
    const/4 v7, 0x5

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    move-object v3, p1

    .line 25
    invoke-static/range {v3 .. v8}, Lkotlin/text/StringsKt;->decodeToString$default([BIIZILjava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_1
    move-object v3, p1

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    move-object v3, p1

    .line 33
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const/16 v4, 0x25

    .line 38
    .line 39
    if-ne p1, v4, :cond_3

    .line 40
    .line 41
    add-int/lit8 p1, v2, 0x1

    .line 42
    .line 43
    add-int/lit8 v4, v2, 0x3

    .line 44
    .line 45
    :try_start_0
    invoke-virtual {p0, p1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string v6, "substring(...)"

    .line 50
    .line 51
    invoke-static {p1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/16 v6, 0x10

    .line 55
    .line 56
    invoke-static {v6}, Lkotlin/text/CharsKt;->checkRadix(I)I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    invoke-static {p1, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    int-to-byte p1, p1

    .line 65
    aput-byte p1, v3, v5
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    .line 67
    add-int/lit8 v5, v5, 0x1

    .line 68
    .line 69
    move-object p1, v3

    .line 70
    move v2, v4

    .line 71
    goto :goto_0

    .line 72
    :catch_0
    :cond_3
    :goto_1
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    int-to-byte p1, p1

    .line 77
    aput-byte p1, v3, v5

    .line 78
    .line 79
    add-int/lit8 v5, v5, 0x1

    .line 80
    .line 81
    add-int/lit8 v2, v2, 0x1

    .line 82
    .line 83
    move-object p1, v3

    .line 84
    goto :goto_0
.end method

.method public static final i(Ljava/lang/String;Ljava/lang/String;)Lk/r;
    .locals 7

    .line 1
    const-string v0, "/"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v5, 0x4

    .line 10
    const/4 v6, 0x0

    .line 11
    const-string v3, "/"

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    move-object v1, p0

    .line 15
    move-object v2, p1

    .line 16
    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v1, p0

    .line 22
    move-object v2, p1

    .line 23
    :goto_0
    invoke-static {p0, v1, v2}, Lk/s;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lk/r;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public static synthetic j(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lk/r;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    sget-object p1, Lokio/Path;->DIRECTORY_SEPARATOR:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    invoke-static {p0, p1}, Lk/s;->i(Ljava/lang/String;Ljava/lang/String;)Lk/r;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

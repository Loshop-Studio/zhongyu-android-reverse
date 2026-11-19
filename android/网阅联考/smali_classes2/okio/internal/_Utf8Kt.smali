.class public final Lokio/internal/_Utf8Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "commonAsUtf8ToByteArray",
        "",
        "",
        "commonToUtf8String",
        "beginIndex",
        "",
        "endIndex",
        "okio"
    }
    k = 0x2
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# direct methods
.method public static final commonAsUtf8ToByteArray(Ljava/lang/String;)[B
    .locals 12

    .line 1
    const-string v0, "$this$commonAsUtf8ToByteArray"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    mul-int/lit8 v0, v0, 0x4

    .line 11
    .line 12
    new-array v0, v0, [B

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    const-string v3, "java.util.Arrays.copyOf(this, newSize)"

    .line 20
    .line 21
    if-ge v2, v1, :cond_9

    .line 22
    .line 23
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const/16 v5, 0x80

    .line 28
    .line 29
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->compare(II)I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-ltz v6, :cond_8

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    move v4, v2

    .line 40
    :goto_1
    if-ge v2, v1, :cond_7

    .line 41
    .line 42
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->compare(II)I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    if-gez v7, :cond_1

    .line 51
    .line 52
    int-to-byte v6, v6

    .line 53
    add-int/lit8 v7, v4, 0x1

    .line 54
    .line 55
    aput-byte v6, v0, v4

    .line 56
    .line 57
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    :goto_2
    if-ge v2, v1, :cond_0

    .line 60
    .line 61
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->compare(II)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-gez v4, :cond_0

    .line 70
    .line 71
    add-int/lit8 v4, v2, 0x1

    .line 72
    .line 73
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    int-to-byte v2, v2

    .line 78
    add-int/lit8 v6, v7, 0x1

    .line 79
    .line 80
    aput-byte v2, v0, v7

    .line 81
    .line 82
    move v2, v4

    .line 83
    move v7, v6

    .line 84
    goto :goto_2

    .line 85
    :cond_0
    move v4, v7

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    const/16 v7, 0x800

    .line 88
    .line 89
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->compare(II)I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    if-gez v7, :cond_2

    .line 94
    .line 95
    shr-int/lit8 v7, v6, 0x6

    .line 96
    .line 97
    or-int/lit16 v7, v7, 0xc0

    .line 98
    .line 99
    int-to-byte v7, v7

    .line 100
    add-int/lit8 v8, v4, 0x1

    .line 101
    .line 102
    aput-byte v7, v0, v4

    .line 103
    .line 104
    and-int/lit8 v4, v6, 0x3f

    .line 105
    .line 106
    or-int/2addr v4, v5

    .line 107
    int-to-byte v4, v4

    .line 108
    add-int/lit8 v6, v8, 0x1

    .line 109
    .line 110
    aput-byte v4, v0, v8

    .line 111
    .line 112
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 113
    .line 114
    :goto_4
    move v4, v6

    .line 115
    goto :goto_1

    .line 116
    :cond_2
    const v7, 0xd800

    .line 117
    .line 118
    .line 119
    const/16 v8, 0x3f

    .line 120
    .line 121
    if-gt v7, v6, :cond_6

    .line 122
    .line 123
    const v7, 0xdfff

    .line 124
    .line 125
    .line 126
    if-ge v7, v6, :cond_3

    .line 127
    .line 128
    goto :goto_6

    .line 129
    :cond_3
    const v9, 0xdbff

    .line 130
    .line 131
    .line 132
    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->compare(II)I

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-gtz v9, :cond_5

    .line 137
    .line 138
    add-int/lit8 v9, v2, 0x1

    .line 139
    .line 140
    if-le v1, v9, :cond_5

    .line 141
    .line 142
    invoke-virtual {p0, v9}, Ljava/lang/String;->charAt(I)C

    .line 143
    .line 144
    .line 145
    move-result v10

    .line 146
    const v11, 0xdc00

    .line 147
    .line 148
    .line 149
    if-gt v11, v10, :cond_5

    .line 150
    .line 151
    if-ge v7, v10, :cond_4

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_4
    shl-int/lit8 v6, v6, 0xa

    .line 155
    .line 156
    invoke-virtual {p0, v9}, Ljava/lang/String;->charAt(I)C

    .line 157
    .line 158
    .line 159
    move-result v7

    .line 160
    add-int/2addr v6, v7

    .line 161
    const v7, -0x35fdc00

    .line 162
    .line 163
    .line 164
    add-int/2addr v6, v7

    .line 165
    shr-int/lit8 v7, v6, 0x12

    .line 166
    .line 167
    or-int/lit16 v7, v7, 0xf0

    .line 168
    .line 169
    int-to-byte v7, v7

    .line 170
    add-int/lit8 v9, v4, 0x1

    .line 171
    .line 172
    aput-byte v7, v0, v4

    .line 173
    .line 174
    shr-int/lit8 v4, v6, 0xc

    .line 175
    .line 176
    and-int/2addr v4, v8

    .line 177
    or-int/2addr v4, v5

    .line 178
    int-to-byte v4, v4

    .line 179
    add-int/lit8 v7, v9, 0x1

    .line 180
    .line 181
    aput-byte v4, v0, v9

    .line 182
    .line 183
    shr-int/lit8 v4, v6, 0x6

    .line 184
    .line 185
    and-int/2addr v4, v8

    .line 186
    or-int/2addr v4, v5

    .line 187
    int-to-byte v4, v4

    .line 188
    add-int/lit8 v9, v7, 0x1

    .line 189
    .line 190
    aput-byte v4, v0, v7

    .line 191
    .line 192
    and-int/lit8 v4, v6, 0x3f

    .line 193
    .line 194
    or-int/2addr v4, v5

    .line 195
    int-to-byte v4, v4

    .line 196
    add-int/lit8 v6, v9, 0x1

    .line 197
    .line 198
    aput-byte v4, v0, v9

    .line 199
    .line 200
    add-int/lit8 v2, v2, 0x2

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_5
    :goto_5
    add-int/lit8 v6, v4, 0x1

    .line 204
    .line 205
    aput-byte v8, v0, v4

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_6
    :goto_6
    shr-int/lit8 v7, v6, 0xc

    .line 209
    .line 210
    or-int/lit16 v7, v7, 0xe0

    .line 211
    .line 212
    int-to-byte v7, v7

    .line 213
    add-int/lit8 v9, v4, 0x1

    .line 214
    .line 215
    aput-byte v7, v0, v4

    .line 216
    .line 217
    shr-int/lit8 v4, v6, 0x6

    .line 218
    .line 219
    and-int/2addr v4, v8

    .line 220
    or-int/2addr v4, v5

    .line 221
    int-to-byte v4, v4

    .line 222
    add-int/lit8 v7, v9, 0x1

    .line 223
    .line 224
    aput-byte v4, v0, v9

    .line 225
    .line 226
    and-int/lit8 v4, v6, 0x3f

    .line 227
    .line 228
    or-int/2addr v4, v5

    .line 229
    int-to-byte v4, v4

    .line 230
    add-int/lit8 v6, v7, 0x1

    .line 231
    .line 232
    aput-byte v4, v0, v7

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_7
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    return-object p0

    .line 243
    :cond_8
    int-to-byte v3, v4

    .line 244
    aput-byte v3, v0, v2

    .line 245
    .line 246
    add-int/lit8 v2, v2, 0x1

    .line 247
    .line 248
    goto/16 :goto_0

    .line 249
    .line 250
    :cond_9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 251
    .line 252
    .line 253
    move-result p0

    .line 254
    invoke-static {v0, p0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    return-object p0
.end method

.method public static final commonToUtf8String([BII)Ljava/lang/String;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "$this$commonToUtf8String"

    .line 8
    .line 9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    if-ltz v1, :cond_27

    .line 13
    .line 14
    array-length v3, v0

    .line 15
    if-gt v2, v3, :cond_27

    .line 16
    .line 17
    if-gt v1, v2, :cond_27

    .line 18
    .line 19
    sub-int v3, v2, v1

    .line 20
    .line 21
    new-array v3, v3, [C

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    move v5, v4

    .line 25
    :goto_0
    if-ge v1, v2, :cond_26

    .line 26
    .line 27
    aget-byte v6, v0, v1

    .line 28
    .line 29
    if-ltz v6, :cond_1

    .line 30
    .line 31
    int-to-char v6, v6

    .line 32
    add-int/lit8 v7, v5, 0x1

    .line 33
    .line 34
    aput-char v6, v3, v5

    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    :goto_1
    if-ge v1, v2, :cond_0

    .line 39
    .line 40
    aget-byte v5, v0, v1

    .line 41
    .line 42
    if-ltz v5, :cond_0

    .line 43
    .line 44
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    int-to-char v5, v5

    .line 47
    add-int/lit8 v6, v7, 0x1

    .line 48
    .line 49
    aput-char v5, v3, v7

    .line 50
    .line 51
    move v7, v6

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    :goto_2
    move v5, v7

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    shr-int/lit8 v7, v6, 0x5

    .line 56
    .line 57
    const/4 v8, -0x2

    .line 58
    const/16 v10, 0x80

    .line 59
    .line 60
    const v11, 0xfffd

    .line 61
    .line 62
    .line 63
    if-ne v7, v8, :cond_8

    .line 64
    .line 65
    add-int/lit8 v7, v1, 0x1

    .line 66
    .line 67
    if-gt v2, v7, :cond_3

    .line 68
    .line 69
    int-to-char v6, v11

    .line 70
    add-int/lit8 v7, v5, 0x1

    .line 71
    .line 72
    aput-char v6, v3, v5

    .line 73
    .line 74
    :goto_3
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 75
    .line 76
    :cond_2
    :goto_4
    const/4 v9, 0x1

    .line 77
    goto :goto_8

    .line 78
    :cond_3
    aget-byte v7, v0, v7

    .line 79
    .line 80
    and-int/lit16 v8, v7, 0xc0

    .line 81
    .line 82
    if-ne v8, v10, :cond_4

    .line 83
    .line 84
    const/4 v8, 0x1

    .line 85
    goto :goto_5

    .line 86
    :cond_4
    move v8, v4

    .line 87
    :goto_5
    if-nez v8, :cond_5

    .line 88
    .line 89
    int-to-char v6, v11

    .line 90
    add-int/lit8 v7, v5, 0x1

    .line 91
    .line 92
    aput-char v6, v3, v5

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_5
    xor-int/lit16 v7, v7, 0xf80

    .line 96
    .line 97
    shl-int/lit8 v6, v6, 0x6

    .line 98
    .line 99
    xor-int/2addr v6, v7

    .line 100
    if-ge v6, v10, :cond_6

    .line 101
    .line 102
    int-to-char v6, v11

    .line 103
    add-int/lit8 v7, v5, 0x1

    .line 104
    .line 105
    aput-char v6, v3, v5

    .line 106
    .line 107
    goto :goto_6

    .line 108
    :cond_6
    int-to-char v6, v6

    .line 109
    add-int/lit8 v7, v5, 0x1

    .line 110
    .line 111
    aput-char v6, v3, v5

    .line 112
    .line 113
    :goto_6
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 114
    .line 115
    :cond_7
    :goto_7
    const/4 v9, 0x2

    .line 116
    :goto_8
    add-int/2addr v1, v9

    .line 117
    goto :goto_2

    .line 118
    :cond_8
    shr-int/lit8 v7, v6, 0x4

    .line 119
    .line 120
    const v13, 0xd800

    .line 121
    .line 122
    .line 123
    const v14, 0xdfff

    .line 124
    .line 125
    .line 126
    const/4 v15, 0x3

    .line 127
    if-ne v7, v8, :cond_12

    .line 128
    .line 129
    add-int/lit8 v7, v1, 0x2

    .line 130
    .line 131
    if-gt v2, v7, :cond_a

    .line 132
    .line 133
    int-to-char v6, v11

    .line 134
    add-int/lit8 v7, v5, 0x1

    .line 135
    .line 136
    aput-char v6, v3, v5

    .line 137
    .line 138
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 139
    .line 140
    add-int/lit8 v5, v1, 0x1

    .line 141
    .line 142
    if-le v2, v5, :cond_2

    .line 143
    .line 144
    aget-byte v5, v0, v5

    .line 145
    .line 146
    and-int/lit16 v5, v5, 0xc0

    .line 147
    .line 148
    if-ne v5, v10, :cond_9

    .line 149
    .line 150
    const/4 v5, 0x1

    .line 151
    goto :goto_9

    .line 152
    :cond_9
    move v5, v4

    .line 153
    :goto_9
    if-nez v5, :cond_7

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_a
    add-int/lit8 v8, v1, 0x1

    .line 157
    .line 158
    aget-byte v8, v0, v8

    .line 159
    .line 160
    and-int/lit16 v9, v8, 0xc0

    .line 161
    .line 162
    if-ne v9, v10, :cond_b

    .line 163
    .line 164
    const/4 v9, 0x1

    .line 165
    goto :goto_a

    .line 166
    :cond_b
    move v9, v4

    .line 167
    :goto_a
    if-nez v9, :cond_c

    .line 168
    .line 169
    int-to-char v6, v11

    .line 170
    add-int/lit8 v7, v5, 0x1

    .line 171
    .line 172
    aput-char v6, v3, v5

    .line 173
    .line 174
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_c
    aget-byte v7, v0, v7

    .line 178
    .line 179
    and-int/lit16 v9, v7, 0xc0

    .line 180
    .line 181
    if-ne v9, v10, :cond_d

    .line 182
    .line 183
    const/4 v12, 0x1

    .line 184
    goto :goto_b

    .line 185
    :cond_d
    move v12, v4

    .line 186
    :goto_b
    if-nez v12, :cond_e

    .line 187
    .line 188
    int-to-char v6, v11

    .line 189
    add-int/lit8 v7, v5, 0x1

    .line 190
    .line 191
    aput-char v6, v3, v5

    .line 192
    .line 193
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 194
    .line 195
    goto :goto_7

    .line 196
    :cond_e
    const v9, -0x1e080

    .line 197
    .line 198
    .line 199
    xor-int/2addr v7, v9

    .line 200
    shl-int/lit8 v8, v8, 0x6

    .line 201
    .line 202
    xor-int/2addr v7, v8

    .line 203
    shl-int/lit8 v6, v6, 0xc

    .line 204
    .line 205
    xor-int/2addr v6, v7

    .line 206
    const/16 v7, 0x800

    .line 207
    .line 208
    if-ge v6, v7, :cond_f

    .line 209
    .line 210
    int-to-char v6, v11

    .line 211
    add-int/lit8 v7, v5, 0x1

    .line 212
    .line 213
    aput-char v6, v3, v5

    .line 214
    .line 215
    :goto_c
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 216
    .line 217
    goto :goto_e

    .line 218
    :cond_f
    if-le v13, v6, :cond_10

    .line 219
    .line 220
    goto :goto_d

    .line 221
    :cond_10
    if-lt v14, v6, :cond_11

    .line 222
    .line 223
    int-to-char v6, v11

    .line 224
    add-int/lit8 v7, v5, 0x1

    .line 225
    .line 226
    aput-char v6, v3, v5

    .line 227
    .line 228
    goto :goto_c

    .line 229
    :cond_11
    :goto_d
    int-to-char v6, v6

    .line 230
    add-int/lit8 v7, v5, 0x1

    .line 231
    .line 232
    aput-char v6, v3, v5

    .line 233
    .line 234
    goto :goto_c

    .line 235
    :goto_e
    move v9, v15

    .line 236
    goto :goto_8

    .line 237
    :cond_12
    shr-int/lit8 v7, v6, 0x3

    .line 238
    .line 239
    if-ne v7, v8, :cond_25

    .line 240
    .line 241
    add-int/lit8 v7, v1, 0x3

    .line 242
    .line 243
    if-gt v2, v7, :cond_19

    .line 244
    .line 245
    add-int/lit8 v6, v5, 0x1

    .line 246
    .line 247
    aput-char v11, v3, v5

    .line 248
    .line 249
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 250
    .line 251
    add-int/lit8 v5, v1, 0x1

    .line 252
    .line 253
    if-le v2, v5, :cond_18

    .line 254
    .line 255
    aget-byte v5, v0, v5

    .line 256
    .line 257
    and-int/lit16 v5, v5, 0xc0

    .line 258
    .line 259
    if-ne v5, v10, :cond_13

    .line 260
    .line 261
    const/4 v5, 0x1

    .line 262
    goto :goto_f

    .line 263
    :cond_13
    move v5, v4

    .line 264
    :goto_f
    if-nez v5, :cond_14

    .line 265
    .line 266
    goto :goto_13

    .line 267
    :cond_14
    add-int/lit8 v5, v1, 0x2

    .line 268
    .line 269
    if-le v2, v5, :cond_17

    .line 270
    .line 271
    aget-byte v5, v0, v5

    .line 272
    .line 273
    and-int/lit16 v5, v5, 0xc0

    .line 274
    .line 275
    if-ne v5, v10, :cond_15

    .line 276
    .line 277
    const/4 v12, 0x1

    .line 278
    goto :goto_10

    .line 279
    :cond_15
    move v12, v4

    .line 280
    :goto_10
    if-nez v12, :cond_16

    .line 281
    .line 282
    goto :goto_12

    .line 283
    :cond_16
    :goto_11
    move v9, v15

    .line 284
    goto/16 :goto_1a

    .line 285
    .line 286
    :cond_17
    :goto_12
    const/4 v9, 0x2

    .line 287
    goto/16 :goto_1a

    .line 288
    .line 289
    :cond_18
    :goto_13
    const/4 v9, 0x1

    .line 290
    goto/16 :goto_1a

    .line 291
    .line 292
    :cond_19
    add-int/lit8 v8, v1, 0x1

    .line 293
    .line 294
    aget-byte v8, v0, v8

    .line 295
    .line 296
    and-int/lit16 v9, v8, 0xc0

    .line 297
    .line 298
    if-ne v9, v10, :cond_1a

    .line 299
    .line 300
    const/4 v9, 0x1

    .line 301
    goto :goto_14

    .line 302
    :cond_1a
    move v9, v4

    .line 303
    :goto_14
    if-nez v9, :cond_1b

    .line 304
    .line 305
    add-int/lit8 v6, v5, 0x1

    .line 306
    .line 307
    aput-char v11, v3, v5

    .line 308
    .line 309
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 310
    .line 311
    goto :goto_13

    .line 312
    :cond_1b
    add-int/lit8 v9, v1, 0x2

    .line 313
    .line 314
    aget-byte v9, v0, v9

    .line 315
    .line 316
    and-int/lit16 v12, v9, 0xc0

    .line 317
    .line 318
    if-ne v12, v10, :cond_1c

    .line 319
    .line 320
    const/4 v12, 0x1

    .line 321
    goto :goto_15

    .line 322
    :cond_1c
    move v12, v4

    .line 323
    :goto_15
    if-nez v12, :cond_1d

    .line 324
    .line 325
    add-int/lit8 v6, v5, 0x1

    .line 326
    .line 327
    aput-char v11, v3, v5

    .line 328
    .line 329
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 330
    .line 331
    goto :goto_12

    .line 332
    :cond_1d
    aget-byte v7, v0, v7

    .line 333
    .line 334
    and-int/lit16 v12, v7, 0xc0

    .line 335
    .line 336
    if-ne v12, v10, :cond_1e

    .line 337
    .line 338
    const/4 v12, 0x1

    .line 339
    goto :goto_16

    .line 340
    :cond_1e
    move v12, v4

    .line 341
    :goto_16
    if-nez v12, :cond_1f

    .line 342
    .line 343
    add-int/lit8 v6, v5, 0x1

    .line 344
    .line 345
    aput-char v11, v3, v5

    .line 346
    .line 347
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 348
    .line 349
    goto :goto_11

    .line 350
    :cond_1f
    const v10, 0x381f80

    .line 351
    .line 352
    .line 353
    xor-int/2addr v7, v10

    .line 354
    shl-int/lit8 v9, v9, 0x6

    .line 355
    .line 356
    xor-int/2addr v7, v9

    .line 357
    shl-int/lit8 v8, v8, 0xc

    .line 358
    .line 359
    xor-int/2addr v7, v8

    .line 360
    shl-int/lit8 v6, v6, 0x12

    .line 361
    .line 362
    xor-int/2addr v6, v7

    .line 363
    const v7, 0x10ffff

    .line 364
    .line 365
    .line 366
    if-le v6, v7, :cond_20

    .line 367
    .line 368
    add-int/lit8 v6, v5, 0x1

    .line 369
    .line 370
    aput-char v11, v3, v5

    .line 371
    .line 372
    :goto_17
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 373
    .line 374
    goto :goto_19

    .line 375
    :cond_20
    if-le v13, v6, :cond_21

    .line 376
    .line 377
    goto :goto_18

    .line 378
    :cond_21
    if-lt v14, v6, :cond_22

    .line 379
    .line 380
    add-int/lit8 v6, v5, 0x1

    .line 381
    .line 382
    aput-char v11, v3, v5

    .line 383
    .line 384
    goto :goto_17

    .line 385
    :cond_22
    :goto_18
    const/high16 v7, 0x10000

    .line 386
    .line 387
    if-ge v6, v7, :cond_23

    .line 388
    .line 389
    add-int/lit8 v6, v5, 0x1

    .line 390
    .line 391
    aput-char v11, v3, v5

    .line 392
    .line 393
    goto :goto_17

    .line 394
    :cond_23
    if-eq v6, v11, :cond_24

    .line 395
    .line 396
    ushr-int/lit8 v7, v6, 0xa

    .line 397
    .line 398
    const v8, 0xd7c0

    .line 399
    .line 400
    .line 401
    add-int/2addr v7, v8

    .line 402
    int-to-char v7, v7

    .line 403
    add-int/lit8 v8, v5, 0x1

    .line 404
    .line 405
    aput-char v7, v3, v5

    .line 406
    .line 407
    and-int/lit16 v5, v6, 0x3ff

    .line 408
    .line 409
    const v6, 0xdc00

    .line 410
    .line 411
    .line 412
    add-int/2addr v5, v6

    .line 413
    int-to-char v5, v5

    .line 414
    add-int/lit8 v6, v8, 0x1

    .line 415
    .line 416
    aput-char v5, v3, v8

    .line 417
    .line 418
    goto :goto_17

    .line 419
    :cond_24
    add-int/lit8 v6, v5, 0x1

    .line 420
    .line 421
    aput-char v11, v3, v5

    .line 422
    .line 423
    goto :goto_17

    .line 424
    :goto_19
    const/4 v9, 0x4

    .line 425
    :goto_1a
    add-int/2addr v1, v9

    .line 426
    goto :goto_1b

    .line 427
    :cond_25
    add-int/lit8 v6, v5, 0x1

    .line 428
    .line 429
    aput-char v11, v3, v5

    .line 430
    .line 431
    add-int/lit8 v1, v1, 0x1

    .line 432
    .line 433
    :goto_1b
    move v5, v6

    .line 434
    goto/16 :goto_0

    .line 435
    .line 436
    :cond_26
    new-instance v0, Ljava/lang/String;

    .line 437
    .line 438
    invoke-direct {v0, v3, v4, v5}, Ljava/lang/String;-><init>([CII)V

    .line 439
    .line 440
    .line 441
    return-object v0

    .line 442
    :cond_27
    new-instance v3, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 443
    .line 444
    new-instance v4, Ljava/lang/StringBuilder;

    .line 445
    .line 446
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 447
    .line 448
    .line 449
    const-string v5, "size="

    .line 450
    .line 451
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    array-length v0, v0

    .line 455
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    const-string v0, " beginIndex="

    .line 459
    .line 460
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    const-string v0, " endIndex="

    .line 467
    .line 468
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    invoke-direct {v3, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    throw v3
.end method

.method public static synthetic commonToUtf8String$default([BIIILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 7
    .line 8
    if-eqz p3, :cond_1

    .line 9
    .line 10
    array-length p2, p0

    .line 11
    :cond_1
    invoke-static {p0, p1, p2}, Lokio/internal/_Utf8Kt;->commonToUtf8String([BII)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

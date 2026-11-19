.class public final Lcom/alibaba/fastjson/util/RyuDouble;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final POW5_INV_SPLIT:[[I

.field private static final POW5_SPLIT:[[I


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [I

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x4

    .line 6
    aput v3, v1, v2

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/16 v5, 0x146

    .line 10
    .line 11
    aput v5, v1, v4

    .line 12
    .line 13
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    invoke-static {v6, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, [[I

    .line 20
    .line 21
    sput-object v1, Lcom/alibaba/fastjson/util/RyuDouble;->POW5_SPLIT:[[I

    .line 22
    .line 23
    new-array v0, v0, [I

    .line 24
    .line 25
    aput v3, v0, v2

    .line 26
    .line 27
    const/16 v1, 0x123

    .line 28
    .line 29
    aput v1, v0, v4

    .line 30
    .line 31
    invoke-static {v6, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, [[I

    .line 36
    .line 37
    sput-object v0, Lcom/alibaba/fastjson/util/RyuDouble;->POW5_INV_SPLIT:[[I

    .line 38
    .line 39
    sget-object v0, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    .line 40
    .line 41
    const/16 v1, 0x1f

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-virtual {v6, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    invoke-virtual {v7, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    move v7, v4

    .line 60
    :goto_0
    if-ge v7, v5, :cond_5

    .line 61
    .line 62
    const-wide/16 v8, 0x5

    .line 63
    .line 64
    invoke-static {v8, v9}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    invoke-virtual {v8, v7}, Ljava/math/BigInteger;->pow(I)Ljava/math/BigInteger;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-virtual {v8}, Ljava/math/BigInteger;->bitLength()I

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    if-nez v7, :cond_0

    .line 77
    .line 78
    move v10, v2

    .line 79
    goto :goto_1

    .line 80
    :cond_0
    int-to-long v10, v7

    .line 81
    const-wide/32 v12, 0x1624c50

    .line 82
    .line 83
    .line 84
    mul-long/2addr v10, v12

    .line 85
    const-wide/32 v12, 0x98967f

    .line 86
    .line 87
    .line 88
    add-long/2addr v10, v12

    .line 89
    const-wide/32 v12, 0x989680

    .line 90
    .line 91
    .line 92
    div-long/2addr v10, v12

    .line 93
    long-to-int v10, v10

    .line 94
    :goto_1
    if-ne v10, v9, :cond_4

    .line 95
    .line 96
    sget-object v10, Lcom/alibaba/fastjson/util/RyuDouble;->POW5_SPLIT:[[I

    .line 97
    .line 98
    array-length v10, v10

    .line 99
    if-ge v7, v10, :cond_1

    .line 100
    .line 101
    move v10, v4

    .line 102
    :goto_2
    if-ge v10, v3, :cond_1

    .line 103
    .line 104
    sget-object v11, Lcom/alibaba/fastjson/util/RyuDouble;->POW5_SPLIT:[[I

    .line 105
    .line 106
    aget-object v11, v11, v7

    .line 107
    .line 108
    add-int/lit8 v12, v9, -0x79

    .line 109
    .line 110
    rsub-int/lit8 v13, v10, 0x3

    .line 111
    .line 112
    mul-int/2addr v13, v1

    .line 113
    add-int/2addr v12, v13

    .line 114
    invoke-virtual {v8, v12}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    .line 115
    .line 116
    .line 117
    move-result-object v12

    .line 118
    invoke-virtual {v12, v6}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 119
    .line 120
    .line 121
    move-result-object v12

    .line 122
    invoke-virtual {v12}, Ljava/math/BigInteger;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result v12

    .line 126
    aput v12, v11, v10

    .line 127
    .line 128
    add-int/lit8 v10, v10, 0x1

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_1
    sget-object v10, Lcom/alibaba/fastjson/util/RyuDouble;->POW5_INV_SPLIT:[[I

    .line 132
    .line 133
    array-length v10, v10

    .line 134
    if-ge v7, v10, :cond_3

    .line 135
    .line 136
    add-int/lit8 v9, v9, 0x79

    .line 137
    .line 138
    sget-object v10, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    .line 139
    .line 140
    invoke-virtual {v10, v9}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    invoke-virtual {v9, v8}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    invoke-virtual {v8, v10}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    move v9, v4

    .line 153
    :goto_3
    if-ge v9, v3, :cond_3

    .line 154
    .line 155
    if-nez v9, :cond_2

    .line 156
    .line 157
    sget-object v10, Lcom/alibaba/fastjson/util/RyuDouble;->POW5_INV_SPLIT:[[I

    .line 158
    .line 159
    aget-object v10, v10, v7

    .line 160
    .line 161
    rsub-int/lit8 v11, v9, 0x3

    .line 162
    .line 163
    mul-int/2addr v11, v1

    .line 164
    invoke-virtual {v8, v11}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    .line 165
    .line 166
    .line 167
    move-result-object v11

    .line 168
    invoke-virtual {v11}, Ljava/math/BigInteger;->intValue()I

    .line 169
    .line 170
    .line 171
    move-result v11

    .line 172
    aput v11, v10, v9

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_2
    sget-object v10, Lcom/alibaba/fastjson/util/RyuDouble;->POW5_INV_SPLIT:[[I

    .line 176
    .line 177
    aget-object v10, v10, v7

    .line 178
    .line 179
    rsub-int/lit8 v11, v9, 0x3

    .line 180
    .line 181
    mul-int/2addr v11, v1

    .line 182
    invoke-virtual {v8, v11}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    .line 183
    .line 184
    .line 185
    move-result-object v11

    .line 186
    invoke-virtual {v11, v0}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    invoke-virtual {v11}, Ljava/math/BigInteger;->intValue()I

    .line 191
    .line 192
    .line 193
    move-result v11

    .line 194
    aput v11, v10, v9

    .line 195
    .line 196
    :goto_4
    add-int/lit8 v9, v9, 0x1

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 200
    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 204
    .line 205
    new-instance v1, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string v2, " != "

    .line 214
    .line 215
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    throw v0

    .line 229
    :cond_5
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static toString(D[CI)I
    .locals 50

    .line 4
    invoke-static/range {p0 .. p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 v0, p3, 0x1

    const/16 v1, 0x4e

    .line 5
    aput-char v1, p2, p3

    add-int/lit8 v1, p3, 0x2

    const/16 v2, 0x61

    .line 6
    aput-char v2, p2, v0

    add-int/lit8 v0, p3, 0x3

    const/16 v2, 0x4e

    .line 7
    aput-char v2, p2, v1

    :goto_0
    sub-int v0, v0, p3

    return v0

    :cond_0
    const-wide/high16 v0, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    cmpl-double v0, p0, v0

    const/16 v1, 0x79

    const/16 v2, 0x69

    const/16 v3, 0x6e

    if-nez v0, :cond_1

    add-int/lit8 v0, p3, 0x1

    const/16 v4, 0x49

    .line 8
    aput-char v4, p2, p3

    add-int/lit8 v4, p3, 0x2

    .line 9
    aput-char v3, p2, v0

    add-int/lit8 v0, p3, 0x3

    const/16 v5, 0x66

    .line 10
    aput-char v5, p2, v4

    add-int/lit8 v4, p3, 0x4

    .line 11
    aput-char v2, p2, v0

    add-int/lit8 v0, p3, 0x5

    .line 12
    aput-char v3, p2, v4

    add-int/lit8 v3, p3, 0x6

    .line 13
    aput-char v2, p2, v0

    add-int/lit8 v0, p3, 0x7

    const/16 v2, 0x74

    .line 14
    aput-char v2, p2, v3

    add-int/lit8 v2, p3, 0x8

    .line 15
    aput-char v1, p2, v0

    sub-int v2, v2, p3

    return v2

    :cond_1
    const-wide/high16 v4, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    cmpl-double v0, p0, v4

    if-nez v0, :cond_2

    add-int/lit8 v0, p3, 0x1

    const/16 v4, 0x2d

    .line 16
    aput-char v4, p2, p3

    add-int/lit8 v4, p3, 0x2

    const/16 v5, 0x49

    .line 17
    aput-char v5, p2, v0

    add-int/lit8 v0, p3, 0x3

    .line 18
    aput-char v3, p2, v4

    add-int/lit8 v4, p3, 0x4

    const/16 v5, 0x66

    .line 19
    aput-char v5, p2, v0

    add-int/lit8 v0, p3, 0x5

    .line 20
    aput-char v2, p2, v4

    add-int/lit8 v4, p3, 0x6

    .line 21
    aput-char v3, p2, v0

    add-int/lit8 v0, p3, 0x7

    .line 22
    aput-char v2, p2, v4

    add-int/lit8 v2, p3, 0x8

    const/16 v3, 0x74

    .line 23
    aput-char v3, p2, v0

    add-int/lit8 v0, p3, 0x9

    .line 24
    aput-char v1, p2, v2

    goto :goto_0

    .line 25
    :cond_2
    invoke-static/range {p0 .. p1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    const/16 v6, 0x2e

    const/16 v7, 0x30

    if-nez v0, :cond_3

    add-int/lit8 v0, p3, 0x1

    .line 26
    aput-char v7, p2, p3

    add-int/lit8 v1, p3, 0x2

    .line 27
    aput-char v6, p2, v0

    add-int/lit8 v0, p3, 0x3

    .line 28
    aput-char v7, p2, v1

    goto/16 :goto_0

    :cond_3
    const-wide/high16 v8, -0x8000000000000000L

    cmp-long v8, v2, v8

    if-nez v8, :cond_4

    add-int/lit8 v0, p3, 0x1

    const/16 v1, 0x2d

    .line 29
    aput-char v1, p2, p3

    add-int/lit8 v1, p3, 0x2

    .line 30
    aput-char v7, p2, v0

    add-int/lit8 v0, p3, 0x3

    .line 31
    aput-char v6, p2, v1

    add-int/lit8 v1, p3, 0x4

    .line 32
    aput-char v7, p2, v0

    :goto_1
    sub-int v1, v1, p3

    return v1

    :cond_4
    const/16 v8, 0x34

    ushr-long v8, v2, v8

    const-wide/16 v10, 0x7ff

    and-long/2addr v8, v10

    long-to-int v8, v8

    const-wide v9, 0xfffffffffffffL

    and-long/2addr v2, v9

    if-nez v8, :cond_5

    const/16 v9, -0x432

    goto :goto_2

    :cond_5
    add-int/lit16 v9, v8, -0x433

    const-wide/high16 v10, 0x10000000000000L

    or-long/2addr v2, v10

    :goto_2
    const/4 v10, 0x0

    const/4 v11, 0x1

    if-gez v0, :cond_6

    move v0, v11

    goto :goto_3

    :cond_6
    move v0, v10

    :goto_3
    const-wide/16 v12, 0x1

    and-long v14, v2, v12

    cmp-long v14, v14, v4

    if-nez v14, :cond_7

    move v14, v11

    goto :goto_4

    :cond_7
    move v14, v10

    :goto_4
    const-wide/16 v15, 0x4

    mul-long/2addr v15, v2

    const-wide/16 v17, 0x2

    add-long v17, v15, v17

    const-wide/high16 v19, 0x10000000000000L

    cmp-long v2, v2, v19

    if-nez v2, :cond_9

    if-gt v8, v11, :cond_8

    goto :goto_5

    :cond_8
    move v2, v10

    goto :goto_6

    :cond_9
    :goto_5
    move v2, v11

    :goto_6
    sub-long v19, v15, v12

    move-wide/from16 p0, v4

    int-to-long v4, v2

    sub-long v19, v19, v4

    add-int/lit8 v9, v9, -0x2

    const-wide/32 v21, 0x7fffffff

    move/from16 v23, v1

    const/16 v24, 0x3

    const/16 v25, 0x2

    const/16 v26, 0x1f

    if-ltz v9, :cond_22

    const-wide/32 v27, 0x989680

    int-to-long v3, v9

    const-wide/32 v29, 0x2deefb

    mul-long v3, v3, v29

    .line 33
    div-long v3, v3, v27

    long-to-int v2, v3

    sub-int/2addr v2, v11

    invoke-static {v10, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    if-nez v2, :cond_a

    move v3, v11

    goto :goto_7

    :cond_a
    int-to-long v3, v2

    const-wide/32 v29, 0x1624c50

    mul-long v3, v3, v29

    const-wide/32 v29, 0x98967f

    add-long v3, v3, v29

    .line 34
    div-long v3, v3, v27

    long-to-int v3, v3

    :goto_7
    add-int/lit8 v3, v3, 0x79

    neg-int v4, v9

    add-int/2addr v4, v2

    add-int/2addr v4, v3

    add-int/lit8 v4, v4, -0x72

    if-ltz v4, :cond_21

    .line 35
    sget-object v3, Lcom/alibaba/fastjson/util/RyuDouble;->POW5_INV_SPLIT:[[I

    aget-object v3, v3, v2

    ushr-long v29, v15, v26

    and-long v31, v15, v21

    .line 36
    aget v9, v3, v10

    move/from16 v33, v6

    move/from16 v34, v7

    int-to-long v6, v9

    mul-long v6, v6, v29

    move-wide/from16 v35, v12

    int-to-long v12, v9

    mul-long v12, v12, v31

    .line 37
    aget v8, v3, v11

    move/from16 v37, v11

    move-wide/from16 v38, v12

    int-to-long v11, v8

    mul-long v11, v11, v29

    move-wide/from16 v40, v11

    int-to-long v10, v8

    mul-long v10, v10, v31

    .line 38
    aget v12, v3, v25

    move/from16 v42, v14

    int-to-long v13, v12

    mul-long v13, v13, v29

    move/from16 v44, v2

    const/16 v43, 0xa

    int-to-long v1, v12

    mul-long v1, v1, v31

    .line 39
    aget v3, v3, v24

    move-wide/from16 v46, v6

    const/16 v45, 0x15

    int-to-long v5, v3

    mul-long v29, v29, v5

    int-to-long v5, v3

    mul-long v31, v31, v5

    ushr-long v5, v31, v26

    add-long/2addr v5, v1

    add-long v5, v5, v29

    ushr-long v1, v5, v26

    add-long/2addr v1, v10

    add-long/2addr v1, v13

    ushr-long v1, v1, v26

    add-long v1, v1, v38

    add-long v1, v1, v40

    ushr-long v1, v1, v45

    shl-long v5, v46, v43

    add-long/2addr v1, v5

    ushr-long/2addr v1, v4

    ushr-long v5, v17, v26

    and-long v10, v17, v21

    int-to-long v13, v9

    mul-long/2addr v13, v5

    move v7, v0

    move-wide/from16 v29, v1

    int-to-long v0, v9

    mul-long/2addr v0, v10

    move-wide/from16 v31, v0

    int-to-long v0, v8

    mul-long/2addr v0, v5

    move-wide/from16 v38, v0

    int-to-long v0, v8

    mul-long/2addr v0, v10

    move-wide/from16 v40, v0

    int-to-long v0, v12

    mul-long/2addr v0, v5

    move-wide/from16 v46, v0

    int-to-long v0, v12

    mul-long/2addr v0, v10

    move-wide/from16 v48, v0

    int-to-long v0, v3

    mul-long/2addr v5, v0

    int-to-long v0, v3

    mul-long/2addr v10, v0

    ushr-long v0, v10, v26

    add-long v0, v0, v48

    add-long/2addr v0, v5

    ushr-long v0, v0, v26

    add-long v0, v0, v40

    add-long v0, v0, v46

    ushr-long v0, v0, v26

    add-long v0, v0, v31

    add-long v0, v0, v38

    ushr-long v0, v0, v45

    shl-long v5, v13, v43

    add-long/2addr v0, v5

    ushr-long/2addr v0, v4

    ushr-long v5, v19, v26

    and-long v10, v19, v21

    int-to-long v13, v9

    mul-long/2addr v13, v5

    move-wide/from16 v31, v0

    int-to-long v0, v9

    mul-long/2addr v0, v10

    move-wide/from16 v21, v0

    int-to-long v0, v8

    mul-long/2addr v0, v5

    int-to-long v8, v8

    mul-long/2addr v8, v10

    move-wide/from16 v38, v0

    int-to-long v0, v12

    mul-long/2addr v0, v5

    move-wide/from16 v40, v0

    int-to-long v0, v12

    mul-long/2addr v0, v10

    move-wide/from16 v46, v0

    int-to-long v0, v3

    mul-long/2addr v5, v0

    int-to-long v0, v3

    mul-long/2addr v10, v0

    ushr-long v0, v10, v26

    add-long v0, v0, v46

    add-long/2addr v0, v5

    ushr-long v0, v0, v26

    add-long/2addr v0, v8

    add-long v0, v0, v40

    ushr-long v0, v0, v26

    add-long v0, v0, v21

    add-long v0, v0, v38

    ushr-long v0, v0, v45

    shl-long v2, v13, v43

    add-long/2addr v0, v2

    ushr-long/2addr v0, v4

    move/from16 v2, v44

    move/from16 v3, v45

    if-gt v2, v3, :cond_20

    const-wide/16 v3, 0x5

    .line 40
    rem-long v5, v15, v3

    cmp-long v5, v5, p0

    const-wide/16 v8, 0x271

    if-nez v5, :cond_11

    if-eqz v5, :cond_b

    const/4 v5, 0x0

    goto :goto_9

    :cond_b
    const-wide/16 v5, 0x19

    .line 41
    rem-long v5, v15, v5

    cmp-long v5, v5, p0

    if-eqz v5, :cond_c

    move/from16 v5, v37

    goto :goto_9

    :cond_c
    const-wide/16 v5, 0x7d

    .line 42
    rem-long v5, v15, v5

    cmp-long v5, v5, p0

    if-eqz v5, :cond_d

    move/from16 v5, v25

    goto :goto_9

    .line 43
    :cond_d
    rem-long v5, v15, v8

    cmp-long v5, v5, p0

    if-eqz v5, :cond_e

    move/from16 v5, v24

    goto :goto_9

    .line 44
    :cond_e
    div-long/2addr v15, v8

    const/4 v5, 0x4

    :goto_8
    cmp-long v6, v15, p0

    if-lez v6, :cond_10

    .line 45
    rem-long v8, v15, v3

    cmp-long v6, v8, p0

    if-eqz v6, :cond_f

    goto :goto_9

    .line 46
    :cond_f
    div-long/2addr v15, v3

    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    :cond_10
    :goto_9
    if-lt v5, v2, :cond_20

    move/from16 v3, v37

    :goto_a
    const/4 v13, 0x0

    goto/16 :goto_10

    :cond_11
    if-eqz v42, :cond_19

    .line 47
    rem-long v5, v19, v3

    cmp-long v5, v5, p0

    if-eqz v5, :cond_12

    const/4 v5, 0x0

    goto :goto_c

    :cond_12
    const-wide/16 v5, 0x19

    .line 48
    rem-long v5, v19, v5

    cmp-long v5, v5, p0

    if-eqz v5, :cond_13

    move/from16 v5, v37

    goto :goto_c

    :cond_13
    const-wide/16 v5, 0x7d

    .line 49
    rem-long v5, v19, v5

    cmp-long v5, v5, p0

    if-eqz v5, :cond_14

    move/from16 v5, v25

    goto :goto_c

    .line 50
    :cond_14
    rem-long v5, v19, v8

    cmp-long v5, v5, p0

    if-eqz v5, :cond_15

    move/from16 v5, v24

    goto :goto_c

    .line 51
    :cond_15
    div-long v19, v19, v8

    const/4 v5, 0x4

    :goto_b
    cmp-long v6, v19, p0

    if-lez v6, :cond_17

    .line 52
    rem-long v8, v19, v3

    cmp-long v6, v8, p0

    if-eqz v6, :cond_16

    goto :goto_c

    .line 53
    :cond_16
    div-long v19, v19, v3

    add-int/lit8 v5, v5, 0x1

    goto :goto_b

    :cond_17
    :goto_c
    if-lt v5, v2, :cond_18

    move/from16 v3, v37

    goto :goto_d

    :cond_18
    const/4 v3, 0x0

    :goto_d
    move v13, v3

    const/4 v3, 0x0

    goto :goto_10

    .line 54
    :cond_19
    rem-long v5, v17, v3

    cmp-long v5, v5, p0

    if-eqz v5, :cond_1a

    const/4 v5, 0x0

    goto :goto_f

    :cond_1a
    const-wide/16 v5, 0x19

    .line 55
    rem-long v5, v17, v5

    cmp-long v5, v5, p0

    if-eqz v5, :cond_1b

    move/from16 v5, v37

    goto :goto_f

    :cond_1b
    const-wide/16 v5, 0x7d

    .line 56
    rem-long v5, v17, v5

    cmp-long v5, v5, p0

    if-eqz v5, :cond_1c

    move/from16 v5, v25

    goto :goto_f

    .line 57
    :cond_1c
    rem-long v5, v17, v8

    cmp-long v5, v5, p0

    if-eqz v5, :cond_1d

    move/from16 v5, v24

    goto :goto_f

    .line 58
    :cond_1d
    div-long v17, v17, v8

    const/4 v5, 0x4

    :goto_e
    cmp-long v6, v17, p0

    if-lez v6, :cond_1f

    .line 59
    rem-long v8, v17, v3

    cmp-long v6, v8, p0

    if-eqz v6, :cond_1e

    goto :goto_f

    .line 60
    :cond_1e
    div-long v17, v17, v3

    add-int/lit8 v5, v5, 0x1

    goto :goto_e

    :cond_1f
    :goto_f
    if-lt v5, v2, :cond_20

    sub-long v3, v31, v35

    move-wide/from16 v31, v3

    :cond_20
    const/4 v3, 0x0

    goto/16 :goto_a

    :goto_10
    move v5, v3

    move-wide/from16 v17, v29

    goto/16 :goto_16

    .line 61
    :cond_21
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_22
    move/from16 v33, v6

    move/from16 v34, v7

    move/from16 v37, v11

    move-wide/from16 v35, v12

    move/from16 v42, v14

    const-wide/32 v27, 0x989680

    const/16 v43, 0xa

    move v7, v0

    neg-int v0, v9

    int-to-long v3, v0

    const-wide/32 v5, 0x6aa784

    mul-long/2addr v3, v5

    .line 62
    div-long v3, v3, v27

    long-to-int v1, v3

    add-int/lit8 v1, v1, -0x1

    const/4 v13, 0x0

    invoke-static {v13, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    sub-int/2addr v0, v1

    if-nez v0, :cond_23

    move/from16 v3, v37

    goto :goto_11

    :cond_23
    int-to-long v3, v0

    const-wide/32 v5, 0x1624c50

    mul-long/2addr v3, v5

    const-wide/32 v5, 0x98967f

    add-long/2addr v3, v5

    .line 63
    div-long v3, v3, v27

    long-to-int v3, v3

    :goto_11
    add-int/lit8 v3, v3, -0x79

    sub-int v3, v1, v3

    add-int/lit8 v3, v3, -0x72

    if-ltz v3, :cond_5d

    .line 64
    sget-object v4, Lcom/alibaba/fastjson/util/RyuDouble;->POW5_SPLIT:[[I

    aget-object v0, v4, v0

    ushr-long v4, v15, v26

    and-long v10, v15, v21

    const/4 v13, 0x0

    .line 65
    aget v6, v0, v13

    int-to-long v13, v6

    mul-long/2addr v13, v4

    move-wide/from16 v29, v4

    int-to-long v4, v6

    mul-long/2addr v4, v10

    .line 66
    aget v8, v0, v37

    move-wide/from16 v31, v4

    int-to-long v4, v8

    mul-long v4, v4, v29

    move-wide/from16 v38, v4

    int-to-long v4, v8

    mul-long/2addr v4, v10

    .line 67
    aget v12, v0, v25

    move-wide/from16 v40, v4

    int-to-long v4, v12

    mul-long v4, v4, v29

    move-wide/from16 v46, v4

    int-to-long v4, v12

    mul-long/2addr v4, v10

    .line 68
    aget v0, v0, v24

    move-wide/from16 v48, v4

    int-to-long v4, v0

    mul-long v4, v4, v29

    move-wide/from16 v29, v4

    int-to-long v4, v0

    mul-long/2addr v10, v4

    ushr-long v4, v10, v26

    add-long v4, v4, v48

    add-long v4, v4, v29

    ushr-long v4, v4, v26

    add-long v4, v4, v40

    add-long v4, v4, v46

    ushr-long v4, v4, v26

    add-long v4, v4, v31

    add-long v4, v4, v38

    const/16 v45, 0x15

    ushr-long v4, v4, v45

    shl-long v10, v13, v43

    add-long/2addr v4, v10

    ushr-long/2addr v4, v3

    ushr-long v10, v17, v26

    and-long v13, v17, v21

    move-wide/from16 v17, v4

    int-to-long v4, v6

    mul-long/2addr v4, v10

    move-wide/from16 v29, v4

    int-to-long v4, v6

    mul-long/2addr v4, v13

    move-wide/from16 v31, v4

    int-to-long v4, v8

    mul-long/2addr v4, v10

    move-wide/from16 v38, v4

    int-to-long v4, v8

    mul-long/2addr v4, v13

    move-wide/from16 v40, v4

    int-to-long v4, v12

    mul-long/2addr v4, v10

    move-wide/from16 v46, v4

    int-to-long v4, v12

    mul-long/2addr v4, v13

    move-wide/from16 v48, v4

    int-to-long v4, v0

    mul-long/2addr v10, v4

    int-to-long v4, v0

    mul-long/2addr v13, v4

    ushr-long v4, v13, v26

    add-long v4, v4, v48

    add-long/2addr v4, v10

    ushr-long v4, v4, v26

    add-long v4, v4, v40

    add-long v4, v4, v46

    ushr-long v4, v4, v26

    add-long v4, v4, v31

    add-long v4, v4, v38

    const/16 v45, 0x15

    ushr-long v4, v4, v45

    shl-long v10, v29, v43

    add-long/2addr v4, v10

    ushr-long v31, v4, v3

    ushr-long v4, v19, v26

    and-long v10, v19, v21

    int-to-long v13, v6

    mul-long/2addr v13, v4

    move-wide/from16 v19, v4

    int-to-long v4, v6

    mul-long/2addr v4, v10

    move-wide/from16 v21, v4

    int-to-long v4, v8

    mul-long v4, v4, v19

    move-wide/from16 v29, v4

    int-to-long v4, v8

    mul-long/2addr v4, v10

    move-wide/from16 v38, v4

    int-to-long v4, v12

    mul-long v4, v4, v19

    move-wide/from16 v40, v4

    int-to-long v4, v12

    mul-long/2addr v4, v10

    move-wide/from16 v46, v4

    int-to-long v4, v0

    mul-long v4, v4, v19

    move-wide/from16 v19, v4

    int-to-long v4, v0

    mul-long/2addr v10, v4

    ushr-long v4, v10, v26

    add-long v4, v4, v46

    add-long v4, v4, v19

    ushr-long v4, v4, v26

    add-long v4, v4, v38

    add-long v4, v4, v40

    ushr-long v4, v4, v26

    add-long v4, v4, v21

    add-long v4, v4, v29

    const/16 v45, 0x15

    ushr-long v4, v4, v45

    shl-long v10, v13, v43

    add-long/2addr v4, v10

    ushr-long v3, v4, v3

    add-int v0, v1, v9

    move/from16 v5, v37

    if-gt v1, v5, :cond_26

    if-eqz v42, :cond_25

    if-ne v2, v5, :cond_24

    move/from16 v37, v5

    goto :goto_12

    :cond_24
    const/16 v37, 0x0

    :goto_12
    move v2, v0

    move-wide v0, v3

    move/from16 v13, v37

    goto :goto_16

    :cond_25
    sub-long v31, v31, v35

    move v2, v0

    :goto_13
    move-wide v0, v3

    :goto_14
    const/4 v13, 0x0

    goto :goto_16

    :cond_26
    const/16 v2, 0x3f

    if-ge v1, v2, :cond_28

    sub-int/2addr v1, v5

    shl-long v1, v35, v1

    sub-long v1, v1, v35

    and-long/2addr v1, v15

    cmp-long v1, v1, p0

    if-nez v1, :cond_27

    const/4 v1, 0x1

    goto :goto_15

    :cond_27
    const/4 v1, 0x0

    :goto_15
    move v2, v0

    move v5, v1

    goto :goto_13

    :cond_28
    move v2, v0

    move-wide v0, v3

    const/4 v5, 0x0

    goto :goto_14

    :goto_16
    const-wide v3, 0xde0b6b3a7640000L

    cmp-long v3, v31, v3

    const/4 v4, 0x7

    const/4 v6, 0x5

    const-wide/16 v8, 0xa

    if-ltz v3, :cond_29

    const/16 v24, 0x13

    goto/16 :goto_17

    :cond_29
    const-wide v10, 0x16345785d8a0000L

    cmp-long v3, v31, v10

    if-ltz v3, :cond_2a

    const/16 v24, 0x12

    goto/16 :goto_17

    :cond_2a
    const-wide v10, 0x2386f26fc10000L

    cmp-long v3, v31, v10

    if-ltz v3, :cond_2b

    const/16 v24, 0x11

    goto/16 :goto_17

    :cond_2b
    const-wide v10, 0x38d7ea4c68000L

    cmp-long v3, v31, v10

    if-ltz v3, :cond_2c

    const/16 v24, 0x10

    goto/16 :goto_17

    :cond_2c
    const-wide v10, 0x5af3107a4000L

    cmp-long v3, v31, v10

    if-ltz v3, :cond_2d

    const/16 v24, 0xf

    goto/16 :goto_17

    :cond_2d
    const-wide v10, 0x9184e72a000L

    cmp-long v3, v31, v10

    if-ltz v3, :cond_2e

    const/16 v24, 0xe

    goto/16 :goto_17

    :cond_2e
    const-wide v10, 0xe8d4a51000L

    cmp-long v3, v31, v10

    if-ltz v3, :cond_2f

    const/16 v24, 0xd

    goto/16 :goto_17

    :cond_2f
    const-wide v10, 0x174876e800L

    cmp-long v3, v31, v10

    if-ltz v3, :cond_30

    const/16 v24, 0xc

    goto/16 :goto_17

    :cond_30
    const-wide v10, 0x2540be400L

    cmp-long v3, v31, v10

    if-ltz v3, :cond_31

    const/16 v24, 0xb

    goto :goto_17

    :cond_31
    const-wide/32 v10, 0x3b9aca00

    cmp-long v3, v31, v10

    if-ltz v3, :cond_32

    move/from16 v24, v43

    goto :goto_17

    :cond_32
    const-wide/32 v10, 0x5f5e100

    cmp-long v3, v31, v10

    if-ltz v3, :cond_33

    const/16 v24, 0x9

    goto :goto_17

    :cond_33
    cmp-long v3, v31, v27

    if-ltz v3, :cond_34

    const/16 v24, 0x8

    goto :goto_17

    :cond_34
    const-wide/32 v10, 0xf4240

    cmp-long v3, v31, v10

    if-ltz v3, :cond_35

    move/from16 v24, v4

    goto :goto_17

    :cond_35
    const-wide/32 v10, 0x186a0

    cmp-long v3, v31, v10

    if-ltz v3, :cond_36

    const/16 v24, 0x6

    goto :goto_17

    :cond_36
    const-wide/16 v10, 0x2710

    cmp-long v3, v31, v10

    if-ltz v3, :cond_37

    move/from16 v24, v6

    goto :goto_17

    :cond_37
    const-wide/16 v10, 0x3e8

    cmp-long v3, v31, v10

    if-ltz v3, :cond_38

    const/16 v24, 0x4

    goto :goto_17

    :cond_38
    const-wide/16 v10, 0x64

    cmp-long v3, v31, v10

    if-ltz v3, :cond_39

    goto :goto_17

    :cond_39
    cmp-long v3, v31, v8

    if-ltz v3, :cond_3a

    move/from16 v24, v25

    goto :goto_17

    :cond_3a
    const/16 v24, 0x1

    :goto_17
    add-int v2, v2, v24

    add-int/lit8 v3, v2, -0x1

    const/4 v10, -0x3

    if-lt v3, v10, :cond_3c

    if-lt v3, v4, :cond_3b

    goto :goto_18

    :cond_3b
    const/4 v4, 0x0

    goto :goto_19

    :cond_3c
    :goto_18
    const/4 v4, 0x1

    :goto_19
    if-nez v13, :cond_42

    if-eqz v5, :cond_3d

    goto :goto_1e

    :cond_3d
    const/4 v5, 0x0

    const/4 v10, 0x0

    .line 69
    :goto_1a
    div-long v11, v31, v8

    div-long v13, v0, v8

    cmp-long v15, v11, v13

    if-lez v15, :cond_3f

    const-wide/16 v15, 0x64

    cmp-long v15, v31, v15

    if-gez v15, :cond_3e

    if-eqz v4, :cond_3e

    goto :goto_1b

    .line 70
    :cond_3e
    rem-long v0, v17, v8

    long-to-int v10, v0

    .line 71
    div-long v17, v17, v8

    add-int/lit8 v5, v5, 0x1

    move-wide/from16 v31, v11

    move-wide v0, v13

    goto :goto_1a

    :cond_3f
    :goto_1b
    cmp-long v0, v17, v0

    if-eqz v0, :cond_41

    if-lt v10, v6, :cond_40

    goto :goto_1c

    :cond_40
    const/4 v0, 0x0

    goto :goto_1d

    :cond_41
    :goto_1c
    const/4 v0, 0x1

    :goto_1d
    int-to-long v0, v0

    add-long v17, v17, v0

    goto/16 :goto_27

    :cond_42
    :goto_1e
    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 72
    :goto_1f
    div-long v14, v31, v8

    div-long v19, v0, v8

    cmp-long v12, v14, v19

    if-lez v12, :cond_46

    const-wide/16 v21, 0x64

    cmp-long v12, v31, v21

    if-gez v12, :cond_43

    if-eqz v4, :cond_43

    goto :goto_22

    .line 73
    :cond_43
    rem-long/2addr v0, v8

    cmp-long v0, v0, p0

    if-nez v0, :cond_44

    const/4 v0, 0x1

    goto :goto_20

    :cond_44
    const/4 v0, 0x0

    :goto_20
    and-int/2addr v13, v0

    if-nez v10, :cond_45

    const/4 v0, 0x1

    goto :goto_21

    :cond_45
    const/4 v0, 0x0

    :goto_21
    and-int/2addr v5, v0

    .line 74
    rem-long v0, v17, v8

    long-to-int v10, v0

    .line 75
    div-long v17, v17, v8

    add-int/lit8 v11, v11, 0x1

    move-wide/from16 v31, v14

    move-wide/from16 v0, v19

    goto :goto_1f

    :cond_46
    :goto_22
    if-eqz v13, :cond_49

    if-eqz v42, :cond_49

    .line 76
    :goto_23
    rem-long v14, v0, v8

    cmp-long v12, v14, p0

    if-nez v12, :cond_49

    const-wide/16 v14, 0x64

    cmp-long v12, v31, v14

    if-gez v12, :cond_47

    if-eqz v4, :cond_47

    goto :goto_25

    :cond_47
    if-nez v10, :cond_48

    const/4 v10, 0x1

    goto :goto_24

    :cond_48
    const/4 v10, 0x0

    :goto_24
    and-int/2addr v5, v10

    .line 77
    rem-long v14, v17, v8

    long-to-int v10, v14

    .line 78
    div-long v31, v31, v8

    .line 79
    div-long v17, v17, v8

    .line 80
    div-long/2addr v0, v8

    add-int/lit8 v11, v11, 0x1

    goto :goto_23

    :cond_49
    :goto_25
    if-eqz v5, :cond_4a

    if-ne v10, v6, :cond_4a

    const-wide/16 v14, 0x2

    .line 81
    rem-long v14, v17, v14

    cmp-long v5, v14, p0

    if-nez v5, :cond_4a

    const/4 v10, 0x4

    :cond_4a
    cmp-long v0, v17, v0

    if-nez v0, :cond_4b

    if-eqz v13, :cond_4c

    if-eqz v42, :cond_4c

    :cond_4b
    if-lt v10, v6, :cond_4d

    :cond_4c
    const/4 v0, 0x1

    goto :goto_26

    :cond_4d
    const/4 v0, 0x0

    :goto_26
    int-to-long v0, v0

    add-long v17, v17, v0

    move v5, v11

    :goto_27
    sub-int v0, v24, v5

    if-eqz v7, :cond_4e

    add-int/lit8 v1, p3, 0x1

    const/16 v5, 0x2d

    .line 82
    aput-char v5, p2, p3

    goto :goto_28

    :cond_4e
    move/from16 v1, p3

    :goto_28
    if-eqz v4, :cond_54

    const/4 v10, 0x0

    :goto_29
    add-int/lit8 v2, v0, -0x1

    if-ge v10, v2, :cond_4f

    .line 83
    rem-long v4, v17, v8

    long-to-int v2, v4

    .line 84
    div-long v17, v17, v8

    add-int v4, v1, v0

    sub-int/2addr v4, v10

    add-int/lit8 v2, v2, 0x30

    int-to-char v2, v2

    .line 85
    aput-char v2, p2, v4

    add-int/lit8 v10, v10, 0x1

    goto :goto_29

    :cond_4f
    const-wide/16 v4, 0x30

    .line 86
    rem-long v17, v17, v8

    add-long v4, v17, v4

    long-to-int v2, v4

    int-to-char v2, v2

    aput-char v2, p2, v1

    add-int/lit8 v2, v1, 0x1

    .line 87
    aput-char v33, p2, v2

    add-int/lit8 v2, v0, 0x1

    add-int/2addr v1, v2

    const/4 v5, 0x1

    if-ne v0, v5, :cond_50

    add-int/lit8 v0, v1, 0x1

    .line 88
    aput-char v34, p2, v1

    move v1, v0

    :cond_50
    add-int/lit8 v0, v1, 0x1

    const/16 v2, 0x45

    .line 89
    aput-char v2, p2, v1

    if-gez v3, :cond_51

    add-int/lit8 v1, v1, 0x2

    const/16 v2, 0x2d

    .line 90
    aput-char v2, p2, v0

    neg-int v3, v3

    move v0, v1

    :cond_51
    const/16 v1, 0x64

    if-lt v3, v1, :cond_52

    add-int/lit8 v1, v0, 0x1

    .line 91
    div-int/lit8 v2, v3, 0x64

    add-int/lit8 v2, v2, 0x30

    int-to-char v2, v2

    aput-char v2, p2, v0

    .line 92
    rem-int/lit8 v3, v3, 0x64

    add-int/lit8 v0, v0, 0x2

    .line 93
    div-int/lit8 v2, v3, 0xa

    add-int/lit8 v2, v2, 0x30

    int-to-char v2, v2

    aput-char v2, p2, v1

    goto :goto_2a

    :cond_52
    move/from16 v1, v43

    if-lt v3, v1, :cond_53

    add-int/lit8 v1, v0, 0x1

    .line 94
    div-int/lit8 v2, v3, 0xa

    add-int/lit8 v2, v2, 0x30

    int-to-char v2, v2

    aput-char v2, p2, v0

    move v0, v1

    :cond_53
    :goto_2a
    add-int/lit8 v1, v0, 0x1

    const/16 v43, 0xa

    .line 95
    rem-int/lit8 v3, v3, 0xa

    add-int/lit8 v3, v3, 0x30

    int-to-char v2, v3

    aput-char v2, p2, v0

    goto/16 :goto_1

    :cond_54
    if-gez v3, :cond_56

    add-int/lit8 v2, v1, 0x1

    .line 96
    aput-char v34, p2, v1

    add-int/lit8 v1, v1, 0x2

    .line 97
    aput-char v33, p2, v2

    const/4 v2, -0x1

    :goto_2b
    if-le v2, v3, :cond_55

    add-int/lit8 v4, v1, 0x1

    .line 98
    aput-char v34, p2, v1

    add-int/lit8 v2, v2, -0x1

    move v1, v4

    goto :goto_2b

    :cond_55
    move v2, v1

    const/4 v10, 0x0

    :goto_2c
    if-ge v10, v0, :cond_5c

    add-int v3, v1, v0

    sub-int/2addr v3, v10

    const/16 v37, 0x1

    add-int/lit8 v3, v3, -0x1

    const-wide/16 v4, 0x30

    .line 99
    rem-long v6, v17, v8

    add-long/2addr v6, v4

    long-to-int v4, v6

    int-to-char v4, v4

    aput-char v4, p2, v3

    .line 100
    div-long v17, v17, v8

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v10, v10, 0x1

    goto :goto_2c

    :cond_56
    if-lt v2, v0, :cond_59

    const/4 v10, 0x0

    :goto_2d
    if-ge v10, v0, :cond_57

    add-int v3, v1, v0

    sub-int/2addr v3, v10

    const/16 v37, 0x1

    add-int/lit8 v3, v3, -0x1

    const-wide/16 v4, 0x30

    .line 101
    rem-long v6, v17, v8

    add-long/2addr v6, v4

    long-to-int v4, v6

    int-to-char v4, v4

    aput-char v4, p2, v3

    .line 102
    div-long v17, v17, v8

    add-int/lit8 v10, v10, 0x1

    goto :goto_2d

    :cond_57
    add-int/2addr v1, v0

    :goto_2e
    if-ge v0, v2, :cond_58

    add-int/lit8 v3, v1, 0x1

    .line 103
    aput-char v34, p2, v1

    add-int/lit8 v0, v0, 0x1

    move v1, v3

    goto :goto_2e

    :cond_58
    add-int/lit8 v0, v1, 0x1

    .line 104
    aput-char v33, p2, v1

    add-int/lit8 v2, v1, 0x2

    .line 105
    aput-char v34, p2, v0

    goto :goto_30

    :cond_59
    add-int/lit8 v2, v1, 0x1

    const/4 v10, 0x0

    :goto_2f
    if-ge v10, v0, :cond_5b

    sub-int v4, v0, v10

    const/16 v37, 0x1

    add-int/lit8 v4, v4, -0x1

    if-ne v4, v3, :cond_5a

    add-int v4, v2, v0

    sub-int/2addr v4, v10

    add-int/lit8 v4, v4, -0x1

    .line 106
    aput-char v33, p2, v4

    add-int/lit8 v2, v2, -0x1

    :cond_5a
    add-int v4, v2, v0

    sub-int/2addr v4, v10

    add-int/lit8 v4, v4, -0x1

    const-wide/16 v5, 0x30

    .line 107
    rem-long v11, v17, v8

    add-long/2addr v11, v5

    long-to-int v5, v11

    int-to-char v5, v5

    aput-char v5, p2, v4

    .line 108
    div-long v17, v17, v8

    add-int/lit8 v10, v10, 0x1

    goto :goto_2f

    :cond_5b
    const/16 v37, 0x1

    add-int/lit8 v0, v0, 0x1

    add-int v2, v1, v0

    :cond_5c
    :goto_30
    sub-int v2, v2, p3

    return v2

    .line 109
    :cond_5d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static toString(D)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x18

    .line 1
    new-array v0, v0, [C

    const/4 v1, 0x0

    .line 2
    invoke-static {p0, p1, v0, v1}, Lcom/alibaba/fastjson/util/RyuDouble;->toString(D[CI)I

    move-result p0

    .line 3
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0, v1, p0}, Ljava/lang/String;-><init>([CII)V

    return-object p1
.end method

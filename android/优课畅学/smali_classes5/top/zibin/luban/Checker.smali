.class final enum Ltop/zibin/luban/Checker;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltop/zibin/luban/Checker;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Ltop/zibin/luban/Checker;

.field public static c:Ljava/util/List;

.field public static final synthetic d:[Ltop/zibin/luban/Checker;


# instance fields
.field public final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ltop/zibin/luban/Checker;

    .line 2
    .line 3
    const-string v1, "SINGLE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ltop/zibin/luban/Checker;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ltop/zibin/luban/Checker;->b:Ltop/zibin/luban/Checker;

    .line 10
    .line 11
    filled-new-array {v0}, [Ltop/zibin/luban/Checker;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Ltop/zibin/luban/Checker;->d:[Ltop/zibin/luban/Checker;

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v0, Ltop/zibin/luban/Checker;->c:Ljava/util/List;

    .line 23
    .line 24
    const-string v1, ".jpg"

    .line 25
    .line 26
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    sget-object v0, Ltop/zibin/luban/Checker;->c:Ljava/util/List;

    .line 30
    .line 31
    const-string v1, ".jpeg"

    .line 32
    .line 33
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    sget-object v0, Ltop/zibin/luban/Checker;->c:Ljava/util/List;

    .line 37
    .line 38
    const-string v1, ".png"

    .line 39
    .line 40
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    sget-object v0, Ltop/zibin/luban/Checker;->c:Ljava/util/List;

    .line 44
    .line 45
    const-string v1, ".webp"

    .line 46
    .line 47
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    sget-object v0, Ltop/zibin/luban/Checker;->c:Ljava/util/List;

    .line 51
    .line 52
    const-string v1, ".gif"

    .line 53
    .line 54
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x3

    .line 5
    new-array p1, p1, [B

    .line 6
    .line 7
    fill-array-data p1, :array_0

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Ltop/zibin/luban/Checker;->a:[B

    .line 11
    .line 12
    return-void

    .line 13
    :array_0
    .array-data 1
        -0x1t
        -0x28t
        -0x1t
    .end array-data
.end method

.method public static valueOf(Ljava/lang/String;)Ltop/zibin/luban/Checker;
    .locals 1

    .line 1
    const-class v0, Ltop/zibin/luban/Checker;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ltop/zibin/luban/Checker;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ltop/zibin/luban/Checker;
    .locals 1

    .line 1
    sget-object v0, Ltop/zibin/luban/Checker;->d:[Ltop/zibin/luban/Checker;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ltop/zibin/luban/Checker;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ltop/zibin/luban/Checker;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public a(Lga/b;)Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 8
    .line 9
    invoke-interface {p1}, Lga/b;->open()Ljava/io/InputStream;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {p1, v1, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 15
    .line 16
    .line 17
    iget-object p1, v0, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 18
    .line 19
    const-string v0, "image/"

    .line 20
    .line 21
    const-string v1, "."

    .line 22
    .line 23
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    return-object p1

    .line 28
    :catch_0
    const-string p1, ".jpg"

    .line 29
    .line 30
    return-object p1
.end method

.method public b(Ljava/io/InputStream;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ltop/zibin/luban/Checker;->i(Ljava/io/InputStream;)[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Ltop/zibin/luban/Checker;->c([B)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final c([B)I
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    move v1, v0

    .line 6
    :goto_0
    add-int/lit8 v2, v1, 0x3

    .line 7
    .line 8
    array-length v3, p1

    .line 9
    const/4 v4, 0x1

    .line 10
    const-string v5, "Luban"

    .line 11
    .line 12
    const/4 v6, 0x4

    .line 13
    const/16 v7, 0x8

    .line 14
    .line 15
    const/4 v8, 0x2

    .line 16
    if-ge v2, v3, :cond_8

    .line 17
    .line 18
    add-int/lit8 v2, v1, 0x1

    .line 19
    .line 20
    aget-byte v3, p1, v1

    .line 21
    .line 22
    const/16 v9, 0xff

    .line 23
    .line 24
    and-int/2addr v3, v9

    .line 25
    if-ne v3, v9, :cond_7

    .line 26
    .line 27
    aget-byte v3, p1, v2

    .line 28
    .line 29
    and-int/2addr v3, v9

    .line 30
    if-ne v3, v9, :cond_2

    .line 31
    .line 32
    :cond_1
    :goto_1
    move v1, v2

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    add-int/lit8 v2, v1, 0x2

    .line 35
    .line 36
    const/16 v9, 0xd8

    .line 37
    .line 38
    if-eq v3, v9, :cond_1

    .line 39
    .line 40
    if-ne v3, v4, :cond_3

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    const/16 v9, 0xd9

    .line 44
    .line 45
    if-eq v3, v9, :cond_7

    .line 46
    .line 47
    const/16 v9, 0xda

    .line 48
    .line 49
    if-ne v3, v9, :cond_4

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_4
    invoke-virtual {p0, p1, v2, v8, v0}, Ltop/zibin/luban/Checker;->h([BIIZ)I

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    if-lt v9, v8, :cond_6

    .line 57
    .line 58
    add-int/2addr v2, v9

    .line 59
    array-length v10, p1

    .line 60
    if-le v2, v10, :cond_5

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_5
    const/16 v10, 0xe1

    .line 64
    .line 65
    if-ne v3, v10, :cond_1

    .line 66
    .line 67
    if-lt v9, v7, :cond_1

    .line 68
    .line 69
    add-int/lit8 v3, v1, 0x4

    .line 70
    .line 71
    invoke-virtual {p0, p1, v3, v6, v0}, Ltop/zibin/luban/Checker;->h([BIIZ)I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    const v10, 0x45786966

    .line 76
    .line 77
    .line 78
    if-ne v3, v10, :cond_1

    .line 79
    .line 80
    add-int/lit8 v3, v1, 0x8

    .line 81
    .line 82
    invoke-virtual {p0, p1, v3, v8, v0}, Ltop/zibin/luban/Checker;->h([BIIZ)I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-nez v3, :cond_1

    .line 87
    .line 88
    add-int/lit8 v1, v1, 0xa

    .line 89
    .line 90
    add-int/lit8 v9, v9, -0x8

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_6
    :goto_2
    const-string p1, "Invalid length"

    .line 94
    .line 95
    invoke-static {v5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    return v0

    .line 99
    :cond_7
    :goto_3
    move v9, v0

    .line 100
    move v1, v2

    .line 101
    goto :goto_4

    .line 102
    :cond_8
    move v9, v0

    .line 103
    :goto_4
    if-le v9, v7, :cond_12

    .line 104
    .line 105
    invoke-virtual {p0, p1, v1, v6, v0}, Ltop/zibin/luban/Checker;->h([BIIZ)I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    const v3, 0x49492a00    # 823968.0f

    .line 110
    .line 111
    .line 112
    if-eq v2, v3, :cond_9

    .line 113
    .line 114
    const v10, 0x4d4d002a    # 2.1495875E8f

    .line 115
    .line 116
    .line 117
    if-eq v2, v10, :cond_9

    .line 118
    .line 119
    const-string p1, "Invalid byte order"

    .line 120
    .line 121
    invoke-static {v5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    return v0

    .line 125
    :cond_9
    if-ne v2, v3, :cond_a

    .line 126
    .line 127
    move v2, v4

    .line 128
    goto :goto_5

    .line 129
    :cond_a
    move v2, v0

    .line 130
    :goto_5
    add-int/lit8 v3, v1, 0x4

    .line 131
    .line 132
    invoke-virtual {p0, p1, v3, v6, v2}, Ltop/zibin/luban/Checker;->h([BIIZ)I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    add-int/2addr v3, v8

    .line 137
    const/16 v6, 0xa

    .line 138
    .line 139
    if-lt v3, v6, :cond_11

    .line 140
    .line 141
    if-le v3, v9, :cond_b

    .line 142
    .line 143
    goto :goto_7

    .line 144
    :cond_b
    add-int/2addr v1, v3

    .line 145
    sub-int/2addr v9, v3

    .line 146
    add-int/lit8 v3, v1, -0x2

    .line 147
    .line 148
    invoke-virtual {p0, p1, v3, v8, v2}, Ltop/zibin/luban/Checker;->h([BIIZ)I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    :goto_6
    add-int/lit8 v6, v3, -0x1

    .line 153
    .line 154
    if-lez v3, :cond_12

    .line 155
    .line 156
    const/16 v3, 0xc

    .line 157
    .line 158
    if-lt v9, v3, :cond_12

    .line 159
    .line 160
    invoke-virtual {p0, p1, v1, v8, v2}, Ltop/zibin/luban/Checker;->h([BIIZ)I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    const/16 v10, 0x112

    .line 165
    .line 166
    if-ne v3, v10, :cond_10

    .line 167
    .line 168
    add-int/2addr v1, v7

    .line 169
    invoke-virtual {p0, p1, v1, v8, v2}, Ltop/zibin/luban/Checker;->h([BIIZ)I

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-eq p1, v4, :cond_f

    .line 174
    .line 175
    const/4 v1, 0x3

    .line 176
    if-eq p1, v1, :cond_e

    .line 177
    .line 178
    const/4 v1, 0x6

    .line 179
    if-eq p1, v1, :cond_d

    .line 180
    .line 181
    if-eq p1, v7, :cond_c

    .line 182
    .line 183
    const-string p1, "Unsupported orientation"

    .line 184
    .line 185
    invoke-static {v5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 186
    .line 187
    .line 188
    return v0

    .line 189
    :cond_c
    const/16 p1, 0x10e

    .line 190
    .line 191
    return p1

    .line 192
    :cond_d
    const/16 p1, 0x5a

    .line 193
    .line 194
    return p1

    .line 195
    :cond_e
    const/16 p1, 0xb4

    .line 196
    .line 197
    return p1

    .line 198
    :cond_f
    return v0

    .line 199
    :cond_10
    add-int/lit8 v1, v1, 0xc

    .line 200
    .line 201
    add-int/lit8 v9, v9, -0xc

    .line 202
    .line 203
    move v3, v6

    .line 204
    goto :goto_6

    .line 205
    :cond_11
    :goto_7
    const-string p1, "Invalid offset"

    .line 206
    .line 207
    invoke-static {v5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 208
    .line 209
    .line 210
    return v0

    .line 211
    :cond_12
    const-string p1, "Orientation not found"

    .line 212
    .line 213
    invoke-static {v5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 214
    .line 215
    .line 216
    return v0
.end method

.method public d(Ljava/io/InputStream;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ltop/zibin/luban/Checker;->i(Ljava/io/InputStream;)[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Ltop/zibin/luban/Checker;->e([B)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final e([B)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    array-length v1, p1

    .line 5
    const/4 v2, 0x3

    .line 6
    if-ge v1, v2, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    aget-byte v1, p1, v0

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    aget-byte v4, p1, v3

    .line 13
    .line 14
    const/4 v5, 0x2

    .line 15
    aget-byte p1, p1, v5

    .line 16
    .line 17
    new-array v2, v2, [B

    .line 18
    .line 19
    aput-byte v1, v2, v0

    .line 20
    .line 21
    aput-byte v4, v2, v3

    .line 22
    .line 23
    aput-byte p1, v2, v5

    .line 24
    .line 25
    iget-object p1, p0, Ltop/zibin/luban/Checker;->a:[B

    .line 26
    .line 27
    invoke-static {p1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1

    .line 32
    :cond_1
    :goto_0
    return v0
.end method

.method public g(ILjava/lang/String;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lez p1, :cond_1

    .line 3
    .line 4
    new-instance v1, Ljava/io/File;

    .line 5
    .line 6
    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    shl-int/lit8 p1, p1, 0xa

    .line 20
    .line 21
    int-to-long p1, p1

    .line 22
    cmp-long p1, v1, p1

    .line 23
    .line 24
    if-lez p1, :cond_0

    .line 25
    .line 26
    return v0

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    return p1

    .line 29
    :cond_1
    return v0
.end method

.method public final h([BIIZ)I
    .locals 2

    .line 1
    if-eqz p4, :cond_0

    .line 2
    .line 3
    add-int/lit8 p4, p3, -0x1

    .line 4
    .line 5
    add-int/2addr p2, p4

    .line 6
    const/4 p4, -0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p4, 0x1

    .line 9
    :goto_0
    const/4 v0, 0x0

    .line 10
    :goto_1
    add-int/lit8 v1, p3, -0x1

    .line 11
    .line 12
    if-lez p3, :cond_1

    .line 13
    .line 14
    shl-int/lit8 p3, v0, 0x8

    .line 15
    .line 16
    aget-byte v0, p1, p2

    .line 17
    .line 18
    and-int/lit16 v0, v0, 0xff

    .line 19
    .line 20
    or-int/2addr v0, p3

    .line 21
    add-int/2addr p2, p4

    .line 22
    move p3, v1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    return v0
.end method

.method public final i(Ljava/io/InputStream;)[B
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    new-array p1, v0, [B

    .line 5
    .line 6
    return-object p1

    .line 7
    :cond_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 10
    .line 11
    .line 12
    const/16 v2, 0x1000

    .line 13
    .line 14
    new-array v3, v2, [B

    .line 15
    .line 16
    :goto_0
    :try_start_0
    invoke-virtual {p1, v3, v0, v2}, Ljava/io/InputStream;->read([BII)I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    const/4 v5, -0x1

    .line 21
    if-eq v4, v5, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1, v3, v0, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    :try_start_1
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 30
    .line 31
    .line 32
    :catch_0
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :catch_1
    :try_start_2
    new-array p1, v0, [B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 38
    .line 39
    :try_start_3
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 40
    .line 41
    .line 42
    :catch_2
    return-object p1

    .line 43
    :goto_1
    :try_start_4
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 44
    .line 45
    .line 46
    :catch_3
    throw p1
.end method

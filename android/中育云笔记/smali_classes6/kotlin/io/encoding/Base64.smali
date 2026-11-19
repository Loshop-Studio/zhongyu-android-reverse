.class public Lkotlin/io/encoding/Base64;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/io/encoding/Base64$a;,
        Lkotlin/io/encoding/Base64$PaddingOption;
    }
.end annotation


# static fields
.field public static final f:Lkotlin/io/encoding/Base64$a;

.field public static final g:[B

.field public static final h:Lkotlin/io/encoding/Base64;

.field public static final i:Lkotlin/io/encoding/Base64;

.field public static final j:Lkotlin/io/encoding/Base64;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:I

.field public final d:Lkotlin/io/encoding/Base64$PaddingOption;

.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lkotlin/io/encoding/Base64$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lkotlin/io/encoding/Base64$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lkotlin/io/encoding/Base64;->f:Lkotlin/io/encoding/Base64$a;

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    fill-array-data v0, :array_0

    .line 13
    .line 14
    .line 15
    sput-object v0, Lkotlin/io/encoding/Base64;->g:[B

    .line 16
    .line 17
    new-instance v0, Lkotlin/io/encoding/Base64;

    .line 18
    .line 19
    sget-object v1, Lkotlin/io/encoding/Base64$PaddingOption;->c:Lkotlin/io/encoding/Base64$PaddingOption;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, -0x1

    .line 24
    invoke-direct {v0, v2, v3, v4, v1}, Lkotlin/io/encoding/Base64;-><init>(ZZILkotlin/io/encoding/Base64$PaddingOption;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lkotlin/io/encoding/Base64;->h:Lkotlin/io/encoding/Base64;

    .line 28
    .line 29
    new-instance v0, Lkotlin/io/encoding/Base64;

    .line 30
    .line 31
    const/16 v4, 0x4c

    .line 32
    .line 33
    invoke-direct {v0, v3, v2, v4, v1}, Lkotlin/io/encoding/Base64;-><init>(ZZILkotlin/io/encoding/Base64$PaddingOption;)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lkotlin/io/encoding/Base64;->i:Lkotlin/io/encoding/Base64;

    .line 37
    .line 38
    new-instance v0, Lkotlin/io/encoding/Base64;

    .line 39
    .line 40
    const/16 v4, 0x40

    .line 41
    .line 42
    invoke-direct {v0, v3, v2, v4, v1}, Lkotlin/io/encoding/Base64;-><init>(ZZILkotlin/io/encoding/Base64$PaddingOption;)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lkotlin/io/encoding/Base64;->j:Lkotlin/io/encoding/Base64;

    .line 46
    .line 47
    return-void

    .line 48
    nop

    .line 49
    :array_0
    .array-data 1
        0xdt
        0xat
    .end array-data
.end method

.method public constructor <init>(ZZILkotlin/io/encoding/Base64$PaddingOption;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lkotlin/io/encoding/Base64;->a:Z

    .line 4
    iput-boolean p2, p0, Lkotlin/io/encoding/Base64;->b:Z

    .line 5
    iput p3, p0, Lkotlin/io/encoding/Base64;->c:I

    .line 6
    iput-object p4, p0, Lkotlin/io/encoding/Base64;->d:Lkotlin/io/encoding/Base64$PaddingOption;

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 8
    :cond_1
    :goto_0
    div-int/lit8 p3, p3, 0x4

    iput p3, p0, Lkotlin/io/encoding/Base64;->e:I

    return-void
.end method

.method public synthetic constructor <init>(ZZILkotlin/io/encoding/Base64$PaddingOption;Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lkotlin/io/encoding/Base64;-><init>(ZZILkotlin/io/encoding/Base64$PaddingOption;)V

    return-void
.end method

.method public static synthetic f(Lkotlin/io/encoding/Base64;Ljava/lang/CharSequence;IIILjava/lang/Object;)[B
    .locals 0

    .line 1
    if-nez p5, :cond_2

    .line 2
    .line 3
    and-int/lit8 p5, p4, 0x2

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 9
    .line 10
    if-eqz p4, :cond_1

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lkotlin/io/encoding/Base64;->d(Ljava/lang/CharSequence;II)[B

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 22
    .line 23
    const-string p1, "Super calls with default arguments not supported in this target, function: decode"

    .line 24
    .line 25
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p0
.end method

.method public static synthetic g(Lkotlin/io/encoding/Base64;[BIIILjava/lang/Object;)[B
    .locals 0

    .line 1
    if-nez p5, :cond_2

    .line 2
    .line 3
    and-int/lit8 p5, p4, 0x2

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 9
    .line 10
    if-eqz p4, :cond_1

    .line 11
    .line 12
    array-length p3, p1

    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lkotlin/io/encoding/Base64;->e([BII)[B

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 19
    .line 20
    const-string p1, "Super calls with default arguments not supported in this target, function: decode"

    .line 21
    .line 22
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;II)[B
    .locals 4

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0, v0, p2, p3}, Lkotlin/io/encoding/Base64;->c(III)V

    .line 11
    .line 12
    .line 13
    sub-int v0, p3, p2

    .line 14
    .line 15
    new-array v0, v0, [B

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    if-ge p2, p3, :cond_1

    .line 19
    .line 20
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/16 v3, 0xff

    .line 25
    .line 26
    if-gt v2, v3, :cond_0

    .line 27
    .line 28
    add-int/lit8 v3, v1, 0x1

    .line 29
    .line 30
    int-to-byte v2, v2

    .line 31
    aput-byte v2, v0, v1

    .line 32
    .line 33
    move v1, v3

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    add-int/lit8 v2, v1, 0x1

    .line 36
    .line 37
    const/16 v3, 0x3f

    .line 38
    .line 39
    aput-byte v3, v0, v1

    .line 40
    .line 41
    move v1, v2

    .line 42
    :goto_1
    add-int/lit8 p2, p2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-object v0
.end method

.method public final b(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lkotlin/io/encoding/Base64;->d:Lkotlin/io/encoding/Base64$PaddingOption;

    .line 2
    .line 3
    sget-object v1, Lkotlin/io/encoding/Base64$PaddingOption;->d:Lkotlin/io/encoding/Base64$PaddingOption;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v2, "The padding option is set to ABSENT, but the input has a pad character at index "

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0
.end method

.method public final c(III)V
    .locals 1

    .line 1
    sget-object v0, Lrc/d;->Companion:Lrc/d$a;

    .line 2
    .line 3
    invoke-virtual {v0, p2, p3, p1}, Lrc/d$a;->a(III)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Ljava/lang/CharSequence;II)[B
    .locals 6

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p1, Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p0, v0, p2, p3}, Lkotlin/io/encoding/Base64;->c(III)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string p2, "substring(...)"

    .line 24
    .line 25
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    sget-object p2, Lqd/c;->g:Ljava/nio/charset/Charset;

    .line 29
    .line 30
    const-string p3, "null cannot be cast to non-null type java.lang.String"

    .line 31
    .line 32
    invoke-static {p1, p3}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const-string p2, "getBytes(...)"

    .line 40
    .line 41
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    move-object v1, p1

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lkotlin/io/encoding/Base64;->a(Ljava/lang/CharSequence;II)[B

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    goto :goto_0

    .line 51
    :goto_1
    const/4 v4, 0x6

    .line 52
    const/4 v5, 0x0

    .line 53
    const/4 v2, 0x0

    .line 54
    const/4 v3, 0x0

    .line 55
    move-object v0, p0

    .line 56
    invoke-static/range {v0 .. v5}, Lkotlin/io/encoding/Base64;->g(Lkotlin/io/encoding/Base64;[BIIILjava/lang/Object;)[B

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1
.end method

.method public final e([BII)[B
    .locals 7

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    array-length v0, p1

    .line 7
    invoke-virtual {p0, v0, p2, p3}, Lkotlin/io/encoding/Base64;->c(III)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2, p3}, Lkotlin/io/encoding/Base64;->i([BII)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    new-array v3, v0, [B

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    move-object v1, p0

    .line 18
    move-object v2, p1

    .line 19
    move v5, p2

    .line 20
    move v6, p3

    .line 21
    invoke-virtual/range {v1 .. v6}, Lkotlin/io/encoding/Base64;->h([B[BIII)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-ne p1, v0, :cond_0

    .line 26
    .line 27
    return-object v3

    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string p2, "Check failed."

    .line 31
    .line 32
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1
.end method

.method public final h([B[BIII)I
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p5

    .line 6
    .line 7
    iget-boolean v3, v0, Lkotlin/io/encoding/Base64;->a:Z

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    invoke-static {}, Ldd/a;->b()[I

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {}, Ldd/a;->a()[I

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    :goto_0
    const/4 v5, -0x8

    .line 21
    move/from16 v9, p3

    .line 22
    .line 23
    move/from16 v6, p4

    .line 24
    .line 25
    move v7, v5

    .line 26
    const/4 v8, 0x0

    .line 27
    :goto_1
    const-string v10, ") at index "

    .line 28
    .line 29
    const-string v11, "toString(...)"

    .line 30
    .line 31
    const-string v12, "\'("

    .line 32
    .line 33
    const/4 v13, -0x2

    .line 34
    if-ge v6, v2, :cond_7

    .line 35
    .line 36
    if-ne v7, v5, :cond_1

    .line 37
    .line 38
    add-int/lit8 v4, v6, 0x3

    .line 39
    .line 40
    if-ge v4, v2, :cond_1

    .line 41
    .line 42
    add-int/lit8 v4, v6, 0x1

    .line 43
    .line 44
    const/16 p4, 0x8

    .line 45
    .line 46
    aget-byte v14, v1, v6

    .line 47
    .line 48
    and-int/lit16 v14, v14, 0xff

    .line 49
    .line 50
    aget v14, v3, v14

    .line 51
    .line 52
    add-int/lit8 v16, v6, 0x2

    .line 53
    .line 54
    aget-byte v4, v1, v4

    .line 55
    .line 56
    and-int/lit16 v4, v4, 0xff

    .line 57
    .line 58
    aget v4, v3, v4

    .line 59
    .line 60
    add-int/lit8 v17, v6, 0x3

    .line 61
    .line 62
    const/16 v18, 0x1

    .line 63
    .line 64
    aget-byte v15, v1, v16

    .line 65
    .line 66
    and-int/lit16 v15, v15, 0xff

    .line 67
    .line 68
    aget v15, v3, v15

    .line 69
    .line 70
    add-int/lit8 v16, v6, 0x4

    .line 71
    .line 72
    aget-byte v5, v1, v17

    .line 73
    .line 74
    and-int/lit16 v5, v5, 0xff

    .line 75
    .line 76
    aget v5, v3, v5

    .line 77
    .line 78
    shl-int/lit8 v14, v14, 0x12

    .line 79
    .line 80
    shl-int/lit8 v4, v4, 0xc

    .line 81
    .line 82
    or-int/2addr v4, v14

    .line 83
    shl-int/lit8 v14, v15, 0x6

    .line 84
    .line 85
    or-int/2addr v4, v14

    .line 86
    or-int/2addr v4, v5

    .line 87
    if-ltz v4, :cond_2

    .line 88
    .line 89
    add-int/lit8 v5, v9, 0x1

    .line 90
    .line 91
    shr-int/lit8 v6, v4, 0x10

    .line 92
    .line 93
    int-to-byte v6, v6

    .line 94
    aput-byte v6, p2, v9

    .line 95
    .line 96
    add-int/lit8 v6, v9, 0x2

    .line 97
    .line 98
    shr-int/lit8 v10, v4, 0x8

    .line 99
    .line 100
    int-to-byte v10, v10

    .line 101
    aput-byte v10, p2, v5

    .line 102
    .line 103
    add-int/lit8 v9, v9, 0x3

    .line 104
    .line 105
    int-to-byte v4, v4

    .line 106
    aput-byte v4, p2, v6

    .line 107
    .line 108
    move/from16 v6, v16

    .line 109
    .line 110
    :goto_2
    const/4 v5, -0x8

    .line 111
    goto :goto_1

    .line 112
    :cond_1
    const/16 p4, 0x8

    .line 113
    .line 114
    const/16 v18, 0x1

    .line 115
    .line 116
    :cond_2
    aget-byte v4, v1, v6

    .line 117
    .line 118
    and-int/lit16 v4, v4, 0xff

    .line 119
    .line 120
    aget v5, v3, v4

    .line 121
    .line 122
    if-gez v5, :cond_5

    .line 123
    .line 124
    if-ne v5, v13, :cond_3

    .line 125
    .line 126
    invoke-virtual {v0, v1, v6, v2, v7}, Lkotlin/io/encoding/Base64;->j([BIII)I

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    move/from16 v4, v18

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_3
    iget-boolean v5, v0, Lkotlin/io/encoding/Base64;->b:Z

    .line 134
    .line 135
    if-eqz v5, :cond_4

    .line 136
    .line 137
    add-int/lit8 v6, v6, 0x1

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 141
    .line 142
    new-instance v2, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    const-string v3, "Invalid symbol \'"

    .line 148
    .line 149
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    int-to-char v3, v4

    .line 153
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-static/range {p4 .. p4}, Lqd/a;->a(I)I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    invoke-static {v4, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-static {v3, v11}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw v1

    .line 187
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 188
    .line 189
    shl-int/lit8 v4, v8, 0x6

    .line 190
    .line 191
    or-int v8, v4, v5

    .line 192
    .line 193
    add-int/lit8 v4, v7, 0x6

    .line 194
    .line 195
    if-ltz v4, :cond_6

    .line 196
    .line 197
    add-int/lit8 v5, v9, 0x1

    .line 198
    .line 199
    ushr-int v10, v8, v4

    .line 200
    .line 201
    int-to-byte v10, v10

    .line 202
    aput-byte v10, p2, v9

    .line 203
    .line 204
    shl-int v4, v18, v4

    .line 205
    .line 206
    add-int/lit8 v4, v4, -0x1

    .line 207
    .line 208
    and-int/2addr v8, v4

    .line 209
    add-int/lit8 v7, v7, -0x2

    .line 210
    .line 211
    move v9, v5

    .line 212
    goto :goto_2

    .line 213
    :cond_6
    move v7, v4

    .line 214
    goto :goto_2

    .line 215
    :cond_7
    const/16 p4, 0x8

    .line 216
    .line 217
    const/16 v18, 0x1

    .line 218
    .line 219
    const/4 v4, 0x0

    .line 220
    :goto_3
    if-eq v7, v13, :cond_c

    .line 221
    .line 222
    const/4 v3, -0x8

    .line 223
    if-eq v7, v3, :cond_9

    .line 224
    .line 225
    if-nez v4, :cond_9

    .line 226
    .line 227
    iget-object v3, v0, Lkotlin/io/encoding/Base64;->d:Lkotlin/io/encoding/Base64$PaddingOption;

    .line 228
    .line 229
    sget-object v4, Lkotlin/io/encoding/Base64$PaddingOption;->c:Lkotlin/io/encoding/Base64$PaddingOption;

    .line 230
    .line 231
    if-eq v3, v4, :cond_8

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 235
    .line 236
    const-string v2, "The padding option is set to PRESENT, but the input is not properly padded"

    .line 237
    .line 238
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw v1

    .line 242
    :cond_9
    :goto_4
    if-nez v8, :cond_b

    .line 243
    .line 244
    invoke-virtual {v0, v1, v6, v2}, Lkotlin/io/encoding/Base64;->k([BII)I

    .line 245
    .line 246
    .line 247
    move-result v3

    .line 248
    if-lt v3, v2, :cond_a

    .line 249
    .line 250
    sub-int v9, v9, p3

    .line 251
    .line 252
    return v9

    .line 253
    :cond_a
    aget-byte v1, v1, v3

    .line 254
    .line 255
    and-int/lit16 v1, v1, 0xff

    .line 256
    .line 257
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 258
    .line 259
    new-instance v4, Ljava/lang/StringBuilder;

    .line 260
    .line 261
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 262
    .line 263
    .line 264
    const-string v5, "Symbol \'"

    .line 265
    .line 266
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    int-to-char v5, v1

    .line 270
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-static/range {p4 .. p4}, Lqd/a;->a(I)I

    .line 277
    .line 278
    .line 279
    move-result v5

    .line 280
    invoke-static {v1, v5}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    invoke-static {v1, v11}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    add-int/lit8 v3, v3, -0x1

    .line 294
    .line 295
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    const-string v1, " is prohibited after the pad character"

    .line 299
    .line 300
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    throw v2

    .line 311
    :cond_b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 312
    .line 313
    const-string v2, "The pad bits must be zeros"

    .line 314
    .line 315
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    throw v1

    .line 319
    :cond_c
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 320
    .line 321
    const-string v2, "The last unit of input does not have enough bits"

    .line 322
    .line 323
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    throw v1
.end method

.method public final i([BII)I
    .locals 3

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sub-int v0, p3, p2

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 v1, 0x1

    .line 13
    if-eq v0, v1, :cond_6

    .line 14
    .line 15
    iget-boolean v1, p0, Lkotlin/io/encoding/Base64;->b:Z

    .line 16
    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    :goto_0
    if-ge p2, p3, :cond_5

    .line 20
    .line 21
    aget-byte v1, p1, p2

    .line 22
    .line 23
    and-int/lit16 v1, v1, 0xff

    .line 24
    .line 25
    invoke-static {}, Ldd/a;->a()[I

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    aget v1, v2, v1

    .line 30
    .line 31
    if-gez v1, :cond_2

    .line 32
    .line 33
    const/4 v2, -0x2

    .line 34
    if-ne v1, v2, :cond_1

    .line 35
    .line 36
    sub-int/2addr p3, p2

    .line 37
    sub-int/2addr v0, p3

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 40
    .line 41
    :cond_2
    add-int/lit8 p2, p2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    add-int/lit8 p2, p3, -0x1

    .line 45
    .line 46
    aget-byte p2, p1, p2

    .line 47
    .line 48
    const/16 v1, 0x3d

    .line 49
    .line 50
    if-ne p2, v1, :cond_5

    .line 51
    .line 52
    add-int/lit8 p2, v0, -0x1

    .line 53
    .line 54
    add-int/lit8 p3, p3, -0x2

    .line 55
    .line 56
    aget-byte p1, p1, p3

    .line 57
    .line 58
    if-ne p1, v1, :cond_4

    .line 59
    .line 60
    add-int/lit8 v0, v0, -0x2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_4
    move v0, p2

    .line 64
    :cond_5
    :goto_1
    int-to-long p1, v0

    .line 65
    const/4 p3, 0x6

    .line 66
    int-to-long v0, p3

    .line 67
    mul-long/2addr p1, v0

    .line 68
    const/16 p3, 0x8

    .line 69
    .line 70
    int-to-long v0, p3

    .line 71
    div-long/2addr p1, v0

    .line 72
    long-to-int p1, p1

    .line 73
    return p1

    .line 74
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 75
    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    const-string v1, "Input should have at least 2 symbols for Base64 decoding, startIndex: "

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string p2, ", endIndex: "

    .line 90
    .line 91
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p1
.end method

.method public final j([BIII)I
    .locals 1

    .line 1
    const/4 v0, -0x8

    .line 2
    if-eq p4, v0, :cond_4

    .line 3
    .line 4
    const/4 v0, -0x6

    .line 5
    if-eq p4, v0, :cond_3

    .line 6
    .line 7
    const/4 v0, -0x4

    .line 8
    if-eq p4, v0, :cond_1

    .line 9
    .line 10
    const/4 p1, -0x2

    .line 11
    if-ne p4, p1, :cond_0

    .line 12
    .line 13
    add-int/lit8 p2, p2, 0x1

    .line 14
    .line 15
    return p2

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string p2, "Unreachable"

    .line 19
    .line 20
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-virtual {p0, p2}, Lkotlin/io/encoding/Base64;->b(I)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 p2, p2, 0x1

    .line 28
    .line 29
    invoke-virtual {p0, p1, p2, p3}, Lkotlin/io/encoding/Base64;->k([BII)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eq p2, p3, :cond_2

    .line 34
    .line 35
    aget-byte p1, p1, p2

    .line 36
    .line 37
    const/16 p3, 0x3d

    .line 38
    .line 39
    if-ne p1, p3, :cond_2

    .line 40
    .line 41
    add-int/lit8 p2, p2, 0x1

    .line 42
    .line 43
    return p2

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 45
    .line 46
    new-instance p3, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string p4, "Missing one pad character at index "

    .line 52
    .line 53
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :cond_3
    invoke-virtual {p0, p2}, Lkotlin/io/encoding/Base64;->b(I)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 p2, p2, 0x1

    .line 71
    .line 72
    return p2

    .line 73
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 74
    .line 75
    new-instance p3, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string p4, "Redundant pad character at index "

    .line 81
    .line 82
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p1
.end method

.method public final k([BII)I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lkotlin/io/encoding/Base64;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return p2

    .line 6
    :cond_0
    :goto_0
    if-ge p2, p3, :cond_2

    .line 7
    .line 8
    aget-byte v0, p1, p2

    .line 9
    .line 10
    and-int/lit16 v0, v0, 0xff

    .line 11
    .line 12
    invoke-static {}, Ldd/a;->a()[I

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    aget v0, v1, v0

    .line 17
    .line 18
    const/4 v1, -0x1

    .line 19
    if-eq v0, v1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    add-int/lit8 p2, p2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    :goto_1
    return p2
.end method

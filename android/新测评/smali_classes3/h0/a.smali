.class public abstract Lh0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Z = false

.field public static b:Ljava/lang/String;

.field public static c:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static a(Lf0/a;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, Lf0/a;->e:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move-object v3, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v3, v0

    .line 10
    :goto_0
    :try_start_0
    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-virtual {v0, v2, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    :goto_1
    move-object v4, v0

    .line 26
    goto :goto_2

    .line 27
    :catch_0
    const-string v0, "Unknown"

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :goto_2
    iget-object p0, p0, Lf0/a;->f:Ljava/lang/String;

    .line 31
    .line 32
    if-nez p0, :cond_1

    .line 33
    .line 34
    move-object v5, v1

    .line 35
    goto :goto_3

    .line 36
    :cond_1
    move-object v5, p0

    .line 37
    :goto_3
    invoke-static {p2}, Ln2/a;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    const-string p0, "ak=%s&av=%s&avsys=%s&c=%s&d=%s&sv=%s"

    .line 42
    .line 43
    const-string v7, "6.5.1.3"

    .line 44
    .line 45
    move-object v2, p1

    .line 46
    filled-new-array/range {v2 .. v7}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    new-instance p1, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string p2, "send url :"

    .line 60
    .line 61
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p1}, Lj0/e;->d(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-object p0
.end method

.method public static b(Lf0/a;Ljava/lang/String;Landroid/content/Context;Ljava/util/Map;)[B
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, p1, p2, p3, v0}, Lh0/a;->c(Lf0/a;Ljava/lang/String;Landroid/content/Context;Ljava/util/Map;I)[B

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public static c(Lf0/a;Ljava/lang/String;Landroid/content/Context;Ljava/util/Map;I)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lh0/a;->d(Lf0/a;Ljava/lang/String;Landroid/content/Context;Ljava/util/Map;)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lj0/d;->a([B)[B

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_2

    .line 10
    .line 11
    array-length p1, p0

    .line 12
    const/high16 p2, 0x1000000

    .line 13
    .line 14
    if-lt p1, p2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 20
    .line 21
    .line 22
    const/4 p2, 0x1

    .line 23
    invoke-virtual {p1, p2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 24
    .line 25
    .line 26
    array-length p2, p0

    .line 27
    invoke-static {p2}, Lj0/b;->d(I)[B

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p4}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 35
    .line 36
    .line 37
    const/16 p2, 0x9

    .line 38
    .line 39
    int-to-byte p2, p2

    .line 40
    sget-boolean p3, Lh0/a;->a:Z

    .line 41
    .line 42
    if-eqz p3, :cond_1

    .line 43
    .line 44
    or-int/lit8 p2, p2, 0x20

    .line 45
    .line 46
    int-to-byte p2, p2

    .line 47
    :cond_1
    invoke-virtual {p1, p2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 48
    .line 49
    .line 50
    const/4 p2, 0x0

    .line 51
    invoke-virtual {p1, p2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p0}, Ljava/io/OutputStream;->write([B)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    :try_start_0
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    return-object p0

    .line 68
    :catch_0
    move-exception p1

    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-static {p1}, Lj0/e;->b(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 78
    return-object p0
.end method

.method public static d(Lf0/a;Ljava/lang/String;Landroid/content/Context;Ljava/util/Map;)[B
    .locals 2

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, p2}, Lh0/a;->a(Lf0/a;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 p1, 0x0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-lez p2, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    array-length p2, p2

    .line 24
    invoke-static {p2}, Lj0/b;->c(I)[B

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {v0, p2}, Ljava/io/OutputStream;->write([B)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {p1}, Lj0/b;->c(I)[B

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    .line 44
    .line 45
    .line 46
    :goto_0
    if-eqz p3, :cond_2

    .line 47
    .line 48
    invoke-interface {p3}, Ljava/util/Map;->size()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-lez p0, :cond_2

    .line 53
    .line 54
    invoke-interface {p3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-eqz p2, :cond_2

    .line 67
    .line 68
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    check-cast p2, Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    invoke-static {v1}, Lj0/b;->e(I)[B

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 87
    .line 88
    .line 89
    invoke-interface {p3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    check-cast p2, Ljava/lang/String;

    .line 94
    .line 95
    if-eqz p2, :cond_1

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    array-length v1, v1

    .line 102
    invoke-static {v1}, Lj0/b;->e(I)[B

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    invoke-virtual {v0, p2}, Ljava/io/OutputStream;->write([B)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_1
    invoke-static {p1}, Lj0/b;->e(I)[B

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-virtual {v0, p2}, Ljava/io/OutputStream;->write([B)V

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    :try_start_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    .line 131
    .line 132
    return-object p0

    .line 133
    :catch_0
    move-exception p1

    .line 134
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {p1}, Lj0/e;->b(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return-object p0
.end method

.method public static e([B)I
    .locals 6

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eqz p0, :cond_6

    .line 3
    .line 4
    array-length v1, p0

    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    if-ge v1, v2, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    array-length v1, p0

    .line 11
    int-to-long v3, v1

    .line 12
    sput-wide v3, Lh0/a;->c:J

    .line 13
    .line 14
    const/4 v1, 0x3

    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-static {p0, v3, v1}, Lj0/b;->b([BII)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/16 v4, 0x8

    .line 21
    .line 22
    add-int/2addr v1, v4

    .line 23
    array-length v5, p0

    .line 24
    if-eq v1, v5, :cond_1

    .line 25
    .line 26
    const-string p0, "recv len error"

    .line 27
    .line 28
    invoke-static {p0}, Lj0/e;->b(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_3

    .line 32
    :cond_1
    const/4 v0, 0x5

    .line 33
    aget-byte v0, p0, v0

    .line 34
    .line 35
    and-int/2addr v0, v3

    .line 36
    const/4 v1, 0x0

    .line 37
    if-ne v3, v0, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    move v3, v1

    .line 41
    :goto_0
    const/4 v0, 0x4

    .line 42
    invoke-static {p0, v4, v0}, Lj0/b;->b([BII)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    array-length v4, p0

    .line 47
    sub-int/2addr v4, v2

    .line 48
    if-ltz v4, :cond_3

    .line 49
    .line 50
    array-length v4, p0

    .line 51
    sub-int/2addr v4, v2

    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move v4, v1

    .line 54
    :goto_1
    if-lez v4, :cond_5

    .line 55
    .line 56
    if-eqz v3, :cond_4

    .line 57
    .line 58
    new-array v3, v4, [B

    .line 59
    .line 60
    invoke-static {p0, v2, v3, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 61
    .line 62
    .line 63
    invoke-static {v3}, Lj0/d;->b([B)[B

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    new-instance v2, Ljava/lang/String;

    .line 68
    .line 69
    array-length v3, p0

    .line 70
    invoke-direct {v2, p0, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 71
    .line 72
    .line 73
    sput-object v2, Lh0/a;->b:Ljava/lang/String;

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_4
    new-instance v1, Ljava/lang/String;

    .line 77
    .line 78
    invoke-direct {v1, p0, v2, v4}, Ljava/lang/String;-><init>([BII)V

    .line 79
    .line 80
    .line 81
    sput-object v1, Lh0/a;->b:Ljava/lang/String;

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_5
    const/4 p0, 0x0

    .line 85
    sput-object p0, Lh0/a;->b:Ljava/lang/String;

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_6
    :goto_2
    const-string p0, "recv errCode UNKNOWN_ERROR"

    .line 89
    .line 90
    invoke-static {p0}, Lj0/e;->b(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :goto_3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    const-string v1, "errCode:"

    .line 99
    .line 100
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {p0}, Lj0/e;->a(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    return v0
.end method

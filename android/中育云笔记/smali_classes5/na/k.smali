.class public final Lna/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lna/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lna/k;

    .line 2
    .line 3
    invoke-direct {v0}, Lna/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lna/k;->a:Lna/k;

    .line 7
    .line 8
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


# virtual methods
.method public final a(Ljava/io/File;Ljava/io/File;)V
    .locals 8

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "dest"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {p2}, Ljava/io/File;->createNewFile()Z

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    .line 33
    .line 34
    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 38
    .line 39
    .line 40
    move-result-object v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 41
    :try_start_1
    new-instance p1, Ljava/io/FileOutputStream;

    .line 42
    .line 43
    invoke-direct {p1, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 47
    .line 48
    .line 49
    move-result-object v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 50
    :try_start_2
    invoke-virtual {v3}, Ljava/nio/channels/FileChannel;->size()J

    .line 51
    .line 52
    .line 53
    move-result-wide v6

    .line 54
    const-wide/16 v4, 0x0

    .line 55
    .line 56
    invoke-virtual/range {v2 .. v7}, Ljava/nio/channels/FileChannel;->transferFrom(Ljava/nio/channels/ReadableByteChannel;JJ)J
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :catchall_0
    move-exception v0

    .line 67
    move-object p1, v0

    .line 68
    :goto_1
    move-object v1, v3

    .line 69
    goto :goto_4

    .line 70
    :catch_0
    move-exception v0

    .line 71
    move-object p1, v0

    .line 72
    :goto_2
    move-object v1, v3

    .line 73
    goto :goto_3

    .line 74
    :catchall_1
    move-exception v0

    .line 75
    move-object p1, v0

    .line 76
    move-object v2, v1

    .line 77
    goto :goto_1

    .line 78
    :catch_1
    move-exception v0

    .line 79
    move-object p1, v0

    .line 80
    move-object v2, v1

    .line 81
    goto :goto_2

    .line 82
    :catchall_2
    move-exception v0

    .line 83
    move-object p1, v0

    .line 84
    move-object v2, v1

    .line 85
    goto :goto_4

    .line 86
    :catch_2
    move-exception v0

    .line 87
    move-object p1, v0

    .line 88
    move-object v2, v1

    .line 89
    :goto_3
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 90
    .line 91
    .line 92
    if-eqz v1, :cond_1

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    .line 95
    .line 96
    .line 97
    :cond_1
    if-eqz v2, :cond_2

    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    .line 100
    .line 101
    .line 102
    :cond_2
    return-void

    .line 103
    :catchall_3
    move-exception v0

    .line 104
    move-object p1, v0

    .line 105
    :goto_4
    if-eqz v1, :cond_3

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    .line 108
    .line 109
    .line 110
    :cond_3
    if-eqz v2, :cond_4

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    .line 113
    .line 114
    .line 115
    :cond_4
    throw p1
.end method

.method public final b(Landroid/graphics/Bitmap;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "filePath"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/io/File;

    .line 12
    .line 13
    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catch_0
    move-exception p1

    .line 35
    goto :goto_2

    .line 36
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    .line 46
    .line 47
    .line 48
    new-instance v1, Ljava/io/FileOutputStream;

    .line 49
    .line 50
    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 51
    .line 52
    .line 53
    const-string v2, "png"

    .line 54
    .line 55
    const/4 v3, 0x2

    .line 56
    const/4 v4, 0x0

    .line 57
    const/4 v5, 0x0

    .line 58
    invoke-static {p2, v2, v5, v3, v4}, Lqd/z;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    const/16 v3, 0x64

    .line 63
    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 67
    .line 68
    invoke-virtual {p1, v2, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->WEBP:Landroid/graphics/Bitmap$CompressFormat;

    .line 73
    .line 74
    invoke-virtual {p1, v2, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 75
    .line 76
    .line 77
    :goto_1
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 78
    .line 79
    .line 80
    if-eqz p3, :cond_3

    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    .line 84
    .line 85
    :cond_3
    return-object p2

    .line 86
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_4

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 96
    .line 97
    .line 98
    :cond_4
    const-string p1, ""

    .line 99
    .line 100
    return-object p1
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;
    .locals 4

    .line 1
    const-string v0, "filePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "data"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    :try_start_0
    new-instance v1, Ljava/io/File;

    .line 18
    .line 19
    new-instance v2, Ljava/io/File;

    .line 20
    .line 21
    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, v2, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_5

    .line 46
    :catch_0
    move-exception p1

    .line 47
    move-object p2, v0

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    .line 53
    .line 54
    .line 55
    :goto_0
    new-instance p1, Ljava/io/FileOutputStream;

    .line 56
    .line 57
    invoke-direct {p1, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    :try_start_1
    invoke-interface {p3, p1}, Lcom/google/protobuf/MessageLite;->writeTo(Ljava/io/OutputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 61
    .line 62
    .line 63
    :try_start_2
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 67
    .line 68
    .line 69
    return-object v1

    .line 70
    :catch_1
    move-exception p1

    .line 71
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 72
    .line 73
    .line 74
    return-object v1

    .line 75
    :catchall_1
    move-exception p2

    .line 76
    move-object v0, p1

    .line 77
    move-object p1, p2

    .line 78
    goto :goto_5

    .line 79
    :catch_2
    move-exception p2

    .line 80
    move-object v3, p2

    .line 81
    move-object p2, p1

    .line 82
    move-object p1, v3

    .line 83
    :goto_1
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 84
    .line 85
    .line 86
    if-eqz p2, :cond_1

    .line 87
    .line 88
    :try_start_4
    invoke-virtual {p2}, Ljava/io/OutputStream;->flush()V

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :catch_3
    move-exception p1

    .line 93
    goto :goto_3

    .line 94
    :cond_1
    :goto_2
    if-eqz p2, :cond_2

    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 97
    .line 98
    .line 99
    goto :goto_4

    .line 100
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 101
    .line 102
    .line 103
    :cond_2
    :goto_4
    return-object v0

    .line 104
    :catchall_2
    move-exception p1

    .line 105
    move-object v0, p2

    .line 106
    :goto_5
    if-eqz v0, :cond_3

    .line 107
    .line 108
    :try_start_5
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 109
    .line 110
    .line 111
    goto :goto_6

    .line 112
    :catch_4
    move-exception p2

    .line 113
    goto :goto_7

    .line 114
    :cond_3
    :goto_6
    if-eqz v0, :cond_4

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 117
    .line 118
    .line 119
    goto :goto_8

    .line 120
    :goto_7
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 121
    .line 122
    .line 123
    :cond_4
    :goto_8
    throw p1
.end method

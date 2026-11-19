.class public Lcom/alibaba/sdk/android/tbrest/utils/GzipUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static gzip([B)[B
    .locals 4

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_7

    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :try_start_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 12
    .line 13
    .line 14
    :try_start_1
    new-instance v2, Ljava/util/zip/GZIPOutputStream;

    .line 15
    .line 16
    array-length v3, p0

    .line 17
    invoke-direct {v2, v1, v3}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 18
    .line 19
    .line 20
    :try_start_2
    invoke-virtual {v2, p0}, Ljava/io/OutputStream;->write([B)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/util/zip/GZIPOutputStream;->finish()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 27
    .line 28
    .line 29
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 30
    :try_start_3
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catch_0
    move-exception p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 36
    .line 37
    .line 38
    :goto_0
    :try_start_4
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 39
    .line 40
    .line 41
    goto :goto_3

    .line 42
    :catch_1
    move-exception p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 44
    .line 45
    .line 46
    goto :goto_3

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    move-object v0, v2

    .line 49
    goto :goto_4

    .line 50
    :catch_2
    move-exception p0

    .line 51
    goto :goto_1

    .line 52
    :catchall_1
    move-exception p0

    .line 53
    goto :goto_4

    .line 54
    :catch_3
    move-exception p0

    .line 55
    move-object v2, v0

    .line 56
    goto :goto_1

    .line 57
    :catchall_2
    move-exception p0

    .line 58
    move-object v1, v0

    .line 59
    goto :goto_4

    .line 60
    :catch_4
    move-exception p0

    .line 61
    move-object v1, v0

    .line 62
    move-object v2, v1

    .line 63
    :goto_1
    :try_start_5
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 64
    .line 65
    .line 66
    if-eqz v2, :cond_1

    .line 67
    .line 68
    :try_start_6
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :catch_5
    move-exception p0

    .line 73
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 74
    .line 75
    .line 76
    :cond_1
    :goto_2
    if-eqz v1, :cond_2

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    :goto_3
    return-object v0

    .line 80
    :goto_4
    if-eqz v0, :cond_3

    .line 81
    .line 82
    :try_start_7
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 83
    .line 84
    .line 85
    goto :goto_5

    .line 86
    :catch_6
    move-exception v0

    .line 87
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 88
    .line 89
    .line 90
    :cond_3
    :goto_5
    if-eqz v1, :cond_4

    .line 91
    .line 92
    :try_start_8
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7

    .line 93
    .line 94
    .line 95
    goto :goto_6

    .line 96
    :catch_7
    move-exception v0

    .line 97
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 98
    .line 99
    .line 100
    :cond_4
    :goto_6
    throw p0

    .line 101
    :cond_5
    :goto_7
    return-object p0
.end method

.method public static gzipAndRc4Bytes(Ljava/lang/String;)[B
    .locals 3

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :try_start_0
    new-instance v2, Ljava/util/zip/GZIPOutputStream;

    .line 8
    .line 9
    invoke-direct {v2, v0}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    .line 11
    .line 12
    :try_start_1
    const-string v1, "UTF-8"

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {v2, p0}, Ljava/io/OutputStream;->write([B)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    :try_start_2
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    move-object v1, v2

    .line 30
    goto :goto_2

    .line 31
    :catch_0
    move-exception p0

    .line 32
    move-object v1, v2

    .line 33
    goto :goto_0

    .line 34
    :catchall_1
    move-exception p0

    .line 35
    goto :goto_2

    .line 36
    :catch_1
    move-exception p0

    .line 37
    :goto_0
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 38
    .line 39
    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    :try_start_4
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 43
    .line 44
    .line 45
    :catch_2
    :cond_0
    :goto_1
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, Lcom/alibaba/sdk/android/tbrest/utils/RC4;->rc4([B)[B

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :try_start_5
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 54
    .line 55
    .line 56
    :catch_3
    return-object p0

    .line 57
    :goto_2
    if-eqz v1, :cond_1

    .line 58
    .line 59
    :try_start_6
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    .line 60
    .line 61
    .line 62
    :catch_4
    :cond_1
    throw p0
.end method

.method public static unGzip([B)[B
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Ljava/io/ByteArrayInputStream;

    .line 3
    .line 4
    invoke-direct {v1, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 5
    .line 6
    .line 7
    :try_start_1
    new-instance p0, Ljava/util/zip/GZIPInputStream;

    .line 8
    .line 9
    invoke-direct {p0, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 10
    .line 11
    .line 12
    const/16 v2, 0x400

    .line 13
    .line 14
    :try_start_2
    new-array v3, v2, [B

    .line 15
    .line 16
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    .line 17
    .line 18
    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 19
    .line 20
    .line 21
    :goto_0
    const/4 v5, 0x0

    .line 22
    :try_start_3
    invoke-virtual {p0, v3, v5, v2}, Ljava/util/zip/GZIPInputStream;->read([BII)I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    const/4 v7, -0x1

    .line 27
    if-eq v6, v7, :cond_0

    .line 28
    .line 29
    invoke-virtual {v4, v3, v5, v6}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto/16 :goto_8

    .line 35
    .line 36
    :catch_0
    move-exception v2

    .line 37
    goto :goto_4

    .line 38
    :cond_0
    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 42
    .line 43
    .line 44
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 45
    :try_start_4
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catch_1
    move-exception v2

    .line 50
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 51
    .line 52
    .line 53
    :goto_1
    :try_start_5
    invoke-virtual {p0}, Ljava/util/zip/GZIPInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :catch_2
    move-exception p0

    .line 58
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 59
    .line 60
    .line 61
    :goto_2
    :try_start_6
    invoke-virtual {v1}, Ljava/io/ByteArrayInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 62
    .line 63
    .line 64
    goto :goto_7

    .line 65
    :catch_3
    move-exception p0

    .line 66
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 67
    .line 68
    .line 69
    goto :goto_7

    .line 70
    :catchall_1
    move-exception v2

    .line 71
    move-object v4, v0

    .line 72
    move-object v0, v2

    .line 73
    goto :goto_8

    .line 74
    :catch_4
    move-exception v2

    .line 75
    move-object v4, v0

    .line 76
    goto :goto_4

    .line 77
    :catchall_2
    move-exception p0

    .line 78
    move-object v4, v0

    .line 79
    :goto_3
    move-object v0, p0

    .line 80
    move-object p0, v4

    .line 81
    goto :goto_8

    .line 82
    :catch_5
    move-exception v2

    .line 83
    move-object p0, v0

    .line 84
    move-object v4, p0

    .line 85
    goto :goto_4

    .line 86
    :catchall_3
    move-exception p0

    .line 87
    move-object v1, v0

    .line 88
    move-object v4, v1

    .line 89
    goto :goto_3

    .line 90
    :catch_6
    move-exception v2

    .line 91
    move-object p0, v0

    .line 92
    move-object v1, p0

    .line 93
    move-object v4, v1

    .line 94
    :goto_4
    :try_start_7
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 95
    .line 96
    .line 97
    if-eqz v4, :cond_1

    .line 98
    .line 99
    :try_start_8
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    .line 100
    .line 101
    .line 102
    goto :goto_5

    .line 103
    :catch_7
    move-exception v2

    .line 104
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 105
    .line 106
    .line 107
    :cond_1
    :goto_5
    if-eqz p0, :cond_2

    .line 108
    .line 109
    :try_start_9
    invoke-virtual {p0}, Ljava/util/zip/GZIPInputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8

    .line 110
    .line 111
    .line 112
    goto :goto_6

    .line 113
    :catch_8
    move-exception p0

    .line 114
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 115
    .line 116
    .line 117
    :cond_2
    :goto_6
    if-eqz v1, :cond_3

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    :goto_7
    return-object v0

    .line 121
    :goto_8
    if-eqz v4, :cond_4

    .line 122
    .line 123
    :try_start_a
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_9

    .line 124
    .line 125
    .line 126
    goto :goto_9

    .line 127
    :catch_9
    move-exception v2

    .line 128
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 129
    .line 130
    .line 131
    :cond_4
    :goto_9
    if-eqz p0, :cond_5

    .line 132
    .line 133
    :try_start_b
    invoke-virtual {p0}, Ljava/util/zip/GZIPInputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_a

    .line 134
    .line 135
    .line 136
    goto :goto_a

    .line 137
    :catch_a
    move-exception p0

    .line 138
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 139
    .line 140
    .line 141
    :cond_5
    :goto_a
    if-eqz v1, :cond_6

    .line 142
    .line 143
    :try_start_c
    invoke-virtual {v1}, Ljava/io/ByteArrayInputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_b

    .line 144
    .line 145
    .line 146
    goto :goto_b

    .line 147
    :catch_b
    move-exception p0

    .line 148
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 149
    .line 150
    .line 151
    :cond_6
    :goto_b
    throw v0
.end method

.class public abstract Lze/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/io/Closeable;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :catch_0
    :cond_0
    return-void
.end method

.method public static b(Ljava/net/Socket;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :catch_0
    :cond_0
    return-void
.end method

.method public static c(Ljava/io/InputStream;Ljava/io/OutputStream;IJLze/c;Z)J
    .locals 11

    .line 1
    if-lez p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const/16 p2, 0x400

    .line 5
    .line 6
    :goto_0
    new-array p2, p2, [B

    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    move-wide v1, v0

    .line 11
    :goto_1
    :try_start_0
    invoke-virtual {p0, p2}, Ljava/io/InputStream;->read([B)I

    .line 12
    .line 13
    .line 14
    move-result v6

    .line 15
    const/4 v0, -0x1

    .line 16
    if-eq v6, v0, :cond_7

    .line 17
    .line 18
    if-nez v6, :cond_4

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-gez v0, :cond_1

    .line 25
    .line 26
    goto :goto_5

    .line 27
    :cond_1
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write(I)V

    .line 28
    .line 29
    .line 30
    if-eqz p6, :cond_2

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    goto :goto_2

    .line 36
    :catch_0
    move-exception v0

    .line 37
    move-object p0, v0

    .line 38
    goto :goto_6

    .line 39
    :cond_2
    :goto_2
    const-wide/16 v3, 0x1

    .line 40
    .line 41
    add-long v6, v1, v3

    .line 42
    .line 43
    if-eqz p5, :cond_3

    .line 44
    .line 45
    const/4 v8, 0x1

    .line 46
    move-wide v9, p3

    .line 47
    move-object/from16 v5, p5

    .line 48
    .line 49
    :try_start_1
    invoke-interface/range {v5 .. v10}, Lze/c;->a(JIJ)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 50
    .line 51
    .line 52
    goto :goto_3

    .line 53
    :catch_1
    move-exception v0

    .line 54
    move-object p0, v0

    .line 55
    move-wide v1, v6

    .line 56
    goto :goto_6

    .line 57
    :cond_3
    :goto_3
    move-wide v1, v6

    .line 58
    goto :goto_1

    .line 59
    :cond_4
    const/4 v0, 0x0

    .line 60
    :try_start_2
    invoke-virtual {p1, p2, v0, v6}, Ljava/io/OutputStream;->write([BII)V

    .line 61
    .line 62
    .line 63
    if-eqz p6, :cond_5

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 66
    .line 67
    .line 68
    :cond_5
    int-to-long v3, v6

    .line 69
    add-long v4, v1, v3

    .line 70
    .line 71
    if-eqz p5, :cond_6

    .line 72
    .line 73
    move-wide v7, p3

    .line 74
    move-object/from16 v3, p5

    .line 75
    .line 76
    :try_start_3
    invoke-interface/range {v3 .. v8}, Lze/c;->a(JIJ)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 77
    .line 78
    .line 79
    goto :goto_4

    .line 80
    :catch_2
    move-exception v0

    .line 81
    move-object p0, v0

    .line 82
    move-wide v1, v4

    .line 83
    goto :goto_6

    .line 84
    :cond_6
    :goto_4
    move-wide v1, v4

    .line 85
    goto :goto_1

    .line 86
    :cond_7
    :goto_5
    return-wide v1

    .line 87
    :goto_6
    new-instance p1, Lorg/apache/commons/net/io/CopyStreamException;

    .line 88
    .line 89
    const-string p2, "IOException caught while copying."

    .line 90
    .line 91
    invoke-direct {p1, p2, v1, v2, p0}, Lorg/apache/commons/net/io/CopyStreamException;-><init>(Ljava/lang/String;JLjava/io/IOException;)V

    .line 92
    .line 93
    .line 94
    throw p1
.end method

.class public Lcom/taobao/sophix/e/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result p0

    if-nez p0, :cond_0

    .line 3
    const-string p0, "fail to mkdirs"

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "FileUtils"

    const-string v1, "ensureDirCreated"

    invoke-static {p1, v1, p0}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    :cond_0
    return-object v0
.end method

.method public static a(Ljava/io/Closeable;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 26
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static a(Ljava/io/File;)V
    .locals 1

    const/4 v0, 0x0

    .line 18
    invoke-static {p0, v0}, Lcom/taobao/sophix/e/c;->a(Ljava/io/File;[Ljava/io/File;)V

    return-void
.end method

.method public static a(Ljava/io/File;Ljava/io/File;)V
    .locals 8

    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    invoke-virtual {p1}, Ljava/io/File;->createNewFile()Z

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    move-object v7, v1

    goto :goto_4

    :catch_0
    move-exception v0

    move-object p0, v0

    move-object v7, v1

    goto :goto_3

    .line 6
    :cond_0
    :goto_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {v0}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    :try_start_1
    new-instance p0, Ljava/io/FileOutputStream;

    invoke-direct {p0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {p0}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v7
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 8
    :try_start_2
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v5

    const-wide/16 v3, 0x0

    invoke-virtual/range {v2 .. v7}, Ljava/nio/channels/FileChannel;->transferTo(JJLjava/nio/channels/WritableByteChannel;)J
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 9
    invoke-static {v2}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 10
    invoke-static {v7}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    return-void

    :catchall_1
    move-exception v0

    move-object p0, v0

    :goto_1
    move-object v1, v2

    goto :goto_4

    :catch_1
    move-exception v0

    move-object p0, v0

    :goto_2
    move-object v1, v2

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object p0, v0

    move-object v7, v1

    goto :goto_1

    :catch_2
    move-exception v0

    move-object p0, v0

    move-object v7, v1

    goto :goto_2

    .line 11
    :goto_3
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :catchall_3
    move-exception v0

    move-object p0, v0

    .line 12
    :goto_4
    invoke-static {v1}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 13
    invoke-static {v7}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 14
    throw p0
.end method

.method public static a(Ljava/io/File;[Ljava/io/File;)V
    .locals 4

    if-eqz p0, :cond_4

    .line 19
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 20
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p0

    if-eqz p0, :cond_4

    .line 21
    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    aget-object v2, p0, v1

    if-eqz p1, :cond_1

    .line 22
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 23
    :cond_1
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 24
    invoke-static {v2, p1}, Lcom/taobao/sophix/e/c;->a(Ljava/io/File;[Ljava/io/File;)V

    .line 25
    :cond_2
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    return-void
.end method

.method public static a(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 3

    const/16 v0, 0xffc

    .line 15
    new-array v0, v0, [B

    .line 16
    :goto_0
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const/4 v2, 0x0

    .line 17
    invoke-virtual {p1, v0, v2, v1}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static a(Ljava/util/zip/ZipFile;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 27
    :try_start_0
    invoke-virtual {p0}, Ljava/util/zip/ZipFile;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

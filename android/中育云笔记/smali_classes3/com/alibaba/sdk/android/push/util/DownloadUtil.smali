.class public Lcom/alibaba/sdk/android/push/util/DownloadUtil;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alibaba/sdk/android/push/util/DownloadUtil$OnLargeIconDownloadListener;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static download(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    const-string v0, "image"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Lcom/alibaba/sdk/android/push/a/b;->a()Lcom/alibaba/sdk/android/push/a/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/push/a/b;->b()Lcom/alibaba/sdk/android/push/util/DownloadUtil$OnLargeIconDownloadListener;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    new-instance v3, Ljava/net/URL;

    invoke-direct {v3, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p0

    check-cast p0, Ljava/net/HttpURLConnection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    const/4 v3, 0x1

    :try_start_1
    invoke-virtual {p0, v3}, Ljava/net/URLConnection;->setDoInput(Z)V

    const/4 v3, 0x0

    invoke-virtual {p0, v3}, Ljava/net/URLConnection;->setDoOutput(Z)V

    const-string v3, "GET"

    invoke-virtual {p0, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const-string v3, "charset"

    const-string v4, "utf-8"

    invoke-virtual {p0, v3, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v3

    const/16 v4, 0xc8

    if-eq v3, v4, :cond_2

    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    new-instance p2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    const-string v4, "UTF-8"

    invoke-direct {v3, p1, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {p2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-static {p2}, Lcom/alibaba/sdk/android/push/util/DownloadUtil;->readStringFrom(Ljava/io/BufferedReader;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    if-eqz v1, :cond_1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Lcom/alibaba/sdk/android/push/util/DownloadUtil$OnLargeIconDownloadListener;->onDownloadLargeIconFailed(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v3

    move-object v7, v2

    move-object v2, p0

    move-object p0, v3

    move-object v3, v7

    goto/16 :goto_3

    :cond_0
    if-eqz v1, :cond_1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Lcom/alibaba/sdk/android/push/util/DownloadUtil$OnLargeIconDownloadListener;->onDownloadBigPictureFailed(Ljava/lang/String;)V

    :cond_1
    :goto_0
    new-instance v4, Ljava/lang/Exception;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_1
    move-exception v3

    move-object p2, v2

    :goto_1
    move-object v2, p0

    :goto_2
    move-object p0, v3

    move-object v3, p2

    goto :goto_3

    :catchall_2
    move-exception v3

    move-object p1, v2

    move-object p2, p1

    goto :goto_1

    :cond_2
    :try_start_4
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    :cond_3
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    invoke-virtual {p0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :try_start_6
    invoke-static {p1, v3, p3}, Lcom/alibaba/sdk/android/push/util/DownloadUtil;->writeToFile(Ljava/io/InputStream;Ljava/io/File;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    if-eqz p1, :cond_4

    :try_start_7
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    :catch_0
    :cond_4
    return-void

    :catchall_3
    move-exception p2

    move-object v7, v2

    move-object v2, p0

    move-object p0, p2

    move-object p2, v7

    goto :goto_3

    :catchall_4
    move-exception p1

    move-object p2, v2

    move-object v2, p0

    move-object p0, p1

    move-object p1, p2

    goto :goto_3

    :catchall_5
    move-exception v3

    move-object p1, v2

    move-object p2, p1

    goto :goto_2

    :goto_3
    :try_start_8
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/alibaba/sdk/android/push/util/DownloadUtil$OnLargeIconDownloadListener;->onDownloadLargeIconFailed(Ljava/lang/String;)V

    goto :goto_4

    :catchall_6
    move-exception p0

    goto :goto_5

    :cond_5
    if-eqz v1, :cond_6

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/alibaba/sdk/android/push/util/DownloadUtil$OnLargeIconDownloadListener;->onDownloadBigPictureFailed(Ljava/lang/String;)V

    :cond_6
    :goto_4
    const-string v0, "MPS:Download"

    invoke-static {v0}, Lcom/alibaba/sdk/android/ams/common/logger/AmsLogger;->getLogger(Ljava/lang/String;)Lcom/alibaba/sdk/android/ams/common/logger/AmsLogger;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "download failed: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ", error: "

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Lcom/alibaba/sdk/android/ams/common/logger/AmsLogger;->d(Ljava/lang/String;)V

    throw p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    :goto_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_7
    if-eqz p1, :cond_8

    :try_start_9
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1

    :catch_1
    :cond_8
    if-eqz p2, :cond_9

    :try_start_a
    invoke-virtual {p2}, Ljava/io/BufferedReader;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2

    :catch_2
    :cond_9
    if-eqz v3, :cond_a

    :try_start_b
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    :catchall_7
    :cond_a
    throw p0
.end method

.method public static downloadImage(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 2

    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p0

    const-string v1, "aliyun_push_images"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/alibaba/sdk/android/push/util/DownloadUtil;->getFileName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance p1, Ljava/io/File;

    invoke-direct {p1, v0, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_0
    :try_start_0
    invoke-static {p1, v0, p0, p2}, Lcom/alibaba/sdk/android/push/util/DownloadUtil;->download(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    new-instance p1, Ljava/io/File;

    invoke-direct {p1, v0, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getFileName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, "?"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static readStringFrom(Ljava/io/BufferedReader;)Ljava/lang/StringBuilder;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :goto_0
    invoke-virtual {p0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static writeToFile(Ljava/io/InputStream;Ljava/io/File;Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/BufferedInputStream;

    invoke-direct {v1, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    const/16 p0, 0x2800

    :try_start_1
    new-array p0, p0, [B

    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :goto_0
    :try_start_2
    invoke-virtual {v1, p0}, Ljava/io/InputStream;->read([B)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v2, p0, v0, p1}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    :goto_1
    move-object v0, v1

    goto :goto_2

    :cond_0
    :try_start_3
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    :try_start_4
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    return-void

    :catchall_3
    move-exception p0

    move-object v2, v0

    goto :goto_1

    :catchall_4
    move-exception p0

    move-object v2, v0

    :goto_2
    :try_start_5
    invoke-static {}, Lcom/alibaba/sdk/android/push/a/b;->a()Lcom/alibaba/sdk/android/push/a/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/alibaba/sdk/android/push/a/b;->b()Lcom/alibaba/sdk/android/push/util/DownloadUtil$OnLargeIconDownloadListener;

    move-result-object p1

    const-string v1, "image"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/alibaba/sdk/android/push/util/DownloadUtil$OnLargeIconDownloadListener;->onDownloadLargeIconFailed(Ljava/lang/String;)V

    goto :goto_3

    :catchall_5
    move-exception p0

    goto :goto_4

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/alibaba/sdk/android/push/util/DownloadUtil$OnLargeIconDownloadListener;->onDownloadBigPictureFailed(Ljava/lang/String;)V

    :cond_2
    :goto_3
    const-string p1, "MPS:Download"

    invoke-static {p1}, Lcom/alibaba/sdk/android/ams/common/logger/AmsLogger;->getLogger(Ljava/lang/String;)Lcom/alibaba/sdk/android/ams/common/logger/AmsLogger;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "writeToFile failed: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ", error: "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/alibaba/sdk/android/ams/common/logger/AmsLogger;->d(Ljava/lang/String;)V

    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    :goto_4
    if-eqz v0, :cond_3

    :try_start_6
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    :catchall_6
    :cond_3
    if-eqz v2, :cond_4

    :try_start_7
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    :catchall_7
    :cond_4
    throw p0
.end method

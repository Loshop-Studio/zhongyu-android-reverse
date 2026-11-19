.class public Lcom/alibaba/sdk/android/emas/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/alibaba/sdk/android/emas/Cache;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/alibaba/sdk/android/emas/Cache<",
        "Lcom/alibaba/sdk/android/emas/d;",
        ">;"
    }
.end annotation


# instance fields
.field private a:J

.field private a:Ljava/lang/String;

.field private a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/String;

.field private diskCacheLimitCapacity:I

.field private diskCacheLimitCount:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/alibaba/sdk/android/emas/c;->b:Ljava/lang/String;

    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p2, "_"

    .line 15
    .line 16
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    if-nez p3, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-string p4, "common"

    .line 34
    .line 35
    :goto_0
    new-instance p3, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    sget-object p1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, "emas-rest-log"

    .line 53
    .line 54
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, Lcom/alibaba/sdk/android/emas/c;->a:Ljava/lang/String;

    .line 74
    .line 75
    new-instance p1, Ljava/io/File;

    .line 76
    .line 77
    iget-object p2, p0, Lcom/alibaba/sdk/android/emas/c;->a:Ljava/lang/String;

    .line 78
    .line 79
    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    if-nez p2, :cond_1

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 89
    .line 90
    .line 91
    :cond_1
    return-void
.end method

.method private a(Ljava/io/File;)Ljava/lang/String;
    .locals 6

    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x1000

    .line 78
    new-array v1, v1, [B

    const/4 v2, 0x0

    .line 79
    :try_start_0
    new-instance v3, Ljava/io/BufferedInputStream;

    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v3, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 80
    :goto_0
    :try_start_1
    invoke-virtual {v3, v1}, Ljava/io/InputStream;->read([B)I

    move-result p1

    const/4 v4, -0x1

    if-eq p1, v4, :cond_0

    .line 81
    new-instance v4, Ljava/lang/String;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v5, p1}, Ljava/lang/String;-><init>([BII)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :catchall_0
    move-exception p1

    move-object v2, v3

    goto :goto_5

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_3

    .line 82
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    invoke-static {v3}, Lcom/alibaba/sdk/android/tbrest/utils/AppUtils;->closeQuietly(Ljava/io/Closeable;)V

    return-object p1

    :catchall_1
    move-exception p1

    goto :goto_5

    :catch_2
    move-exception p1

    move-object v3, v2

    goto :goto_1

    :catch_3
    move-exception p1

    move-object v3, v2

    goto :goto_3

    .line 84
    :goto_1
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 85
    :goto_2
    invoke-static {v3}, Lcom/alibaba/sdk/android/tbrest/utils/AppUtils;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_4

    .line 86
    :goto_3
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :goto_4
    return-object v2

    .line 87
    :goto_5
    invoke-static {v2}, Lcom/alibaba/sdk/android/tbrest/utils/AppUtils;->closeQuietly(Ljava/io/Closeable;)V

    throw p1
.end method

.method private a(Ljava/io/File;Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .line 69
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 70
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 71
    array-length v0, p1

    if-lez v0, :cond_2

    .line 72
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    .line 73
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 74
    invoke-direct {p0, v2, p2}, Lcom/alibaba/sdk/android/emas/c;->a(Ljava/io/File;Ljava/util/List;)Ljava/util/List;

    goto :goto_1

    .line 75
    :cond_0
    invoke-interface {p2, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 76
    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object p2
.end method

.method private a(Ljava/io/File;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    .line 88
    :try_start_0
    new-instance v1, Ljava/io/BufferedOutputStream;

    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 89
    :try_start_1
    const-string p1, "utf-8"

    invoke-virtual {p2, p1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    invoke-static {v1}, Lcom/alibaba/sdk/android/tbrest/utils/AppUtils;->closeQuietly(Ljava/io/Closeable;)V

    return-void

    :catchall_0
    move-exception p1

    move-object v0, v1

    goto :goto_5

    :catch_0
    move-exception p1

    move-object v0, v1

    goto :goto_0

    :catch_1
    move-exception p1

    move-object v0, v1

    goto :goto_2

    :catch_2
    move-exception p1

    move-object v0, v1

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_5

    :catch_3
    move-exception p1

    goto :goto_0

    :catch_4
    move-exception p1

    goto :goto_2

    :catch_5
    move-exception p1

    goto :goto_3

    .line 91
    :goto_0
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 92
    :goto_1
    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/AppUtils;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_4

    .line 93
    :goto_2
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_1

    .line 94
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :goto_4
    return-void

    .line 95
    :goto_5
    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/AppUtils;->closeQuietly(Ljava/io/Closeable;)V

    throw p1
.end method


# virtual methods
.method public declared-synchronized a()Lcom/alibaba/sdk/android/emas/d;
    .locals 6

    monitor-enter p0

    .line 25
    :try_start_0
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/alibaba/sdk/android/emas/c;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 26
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 27
    monitor-exit p0

    return-object v2

    .line 28
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_1

    .line 29
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    monitor-exit p0

    return-object v2

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    .line 31
    :cond_1
    :try_start_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/alibaba/sdk/android/emas/c;->a(Ljava/io/File;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 32
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_a

    .line 33
    new-instance v1, Lcom/alibaba/sdk/android/emas/c$1;

    invoke-direct {v1, p0}, Lcom/alibaba/sdk/android/emas/c$1;-><init>(Lcom/alibaba/sdk/android/emas/c;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 34
    iget-object v1, p0, Lcom/alibaba/sdk/android/emas/c;->a:Ljava/util/Set;

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    move v1, v3

    .line 35
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-eq v1, v4, :cond_3

    .line 36
    iget-object v4, p0, Lcom/alibaba/sdk/android/emas/c;->a:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/io/File;

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 37
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    goto :goto_1

    .line 38
    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "DiskCacheManager disk cache is in the Sending Queue. skip location: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/io/File;

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    move-object v0, v2

    goto :goto_1

    .line 39
    :cond_4
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    if-nez v0, :cond_5

    .line 40
    monitor-exit p0

    return-object v2

    .line 41
    :cond_5
    :try_start_3
    invoke-direct {p0, v0}, Lcom/alibaba/sdk/android/emas/c;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    .line 42
    iget-object v4, p0, Lcom/alibaba/sdk/android/emas/c;->b:Ljava/lang/String;

    invoke-static {v4, v1}, Lcom/alibaba/sdk/android/emas/f;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 43
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v4, :cond_6

    .line 44
    monitor-exit p0

    return-object v2

    .line 45
    :cond_6
    :try_start_4
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 46
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 47
    :goto_2
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-eq v3, v5, :cond_8

    .line 48
    invoke-virtual {v4, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 49
    invoke-static {v5}, Lcom/alibaba/sdk/android/emas/e;->a(Lorg/json/JSONObject;)Lcom/alibaba/sdk/android/emas/e;

    move-result-object v5

    if-eqz v5, :cond_7

    .line 50
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_4

    :cond_7
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 51
    :cond_8
    iget-object v3, p0, Lcom/alibaba/sdk/android/emas/c;->a:Ljava/util/Set;

    if-nez v3, :cond_9

    .line 52
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    iput-object v3, p0, Lcom/alibaba/sdk/android/emas/c;->a:Ljava/util/Set;

    .line 53
    :cond_9
    iget-object v3, p0, Lcom/alibaba/sdk/android/emas/c;->a:Ljava/util/Set;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 54
    new-instance v3, Lcom/alibaba/sdk/android/emas/d;

    sget-object v4, Lcom/alibaba/sdk/android/emas/b;->b:Lcom/alibaba/sdk/android/emas/b;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v1, v4, v0}, Lcom/alibaba/sdk/android/emas/d;-><init>(Ljava/util/List;Lcom/alibaba/sdk/android/emas/b;Ljava/lang/String;)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-object v3

    .line 55
    :goto_4
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 56
    monitor-exit p0

    return-object v2

    .line 57
    :cond_a
    monitor-exit p0

    return-object v2

    :goto_5
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v0
.end method

.method public a(III)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/alibaba/sdk/android/emas/c;->diskCacheLimitCount:I

    .line 2
    iput p2, p0, Lcom/alibaba/sdk/android/emas/c;->diskCacheLimitCapacity:I

    int-to-long p1, p3

    const-wide/32 v0, 0x5265c00

    mul-long/2addr p1, v0

    .line 3
    iput-wide p1, p0, Lcom/alibaba/sdk/android/emas/c;->a:J

    return-void
.end method

.method public declared-synchronized a(Lcom/alibaba/sdk/android/emas/d;)V
    .locals 5

    monitor-enter p0

    if-eqz p1, :cond_6

    .line 4
    :try_start_0
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/emas/d;->a()Lcom/alibaba/sdk/android/emas/b;

    move-result-object v0

    sget-object v1, Lcom/alibaba/sdk/android/emas/b;->b:Lcom/alibaba/sdk/android/emas/b;

    if-ne v0, v1, :cond_0

    goto/16 :goto_3

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/emas/d;->a()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 7
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-eq v1, v2, :cond_2

    .line 9
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/alibaba/sdk/android/emas/e;

    invoke-virtual {v2}, Lcom/alibaba/sdk/android/emas/e;->a()Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 10
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 11
    :cond_2
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p1

    .line 12
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/c;->b:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/alibaba/sdk/android/emas/f;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 13
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 14
    const-string v0, "DiskCacheManager putting into cache."

    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 15
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/alibaba/sdk/android/emas/c;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UTF-8"

    invoke-static {v3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    invoke-static {v3}, Lcom/alibaba/sdk/android/tbrest/utils/MD5Utils;->getMd5Hex([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, ".log"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 17
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 18
    :cond_3
    invoke-direct {p0, v0, p1}, Lcom/alibaba/sdk/android/emas/c;->a(Ljava/io/File;Ljava/lang/String;)V

    .line 19
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DiskCacheManager success put into "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    goto :goto_2

    .line 20
    :cond_4
    const-string p1, "DiskCacheManager failed put into cache."

    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    :cond_5
    :goto_2
    monitor-exit p0

    return-void

    :cond_6
    :goto_3
    if-nez p1, :cond_7

    .line 22
    :try_start_1
    const-string p1, "DiskCacheManager add failed. data is null"

    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    goto :goto_4

    .line 23
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DiskCacheManager add failed. cache type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/alibaba/sdk/android/emas/d;->a()Lcom/alibaba/sdk/android/emas/b;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    :goto_4
    monitor-exit p0

    return-void

    :goto_5
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public declared-synchronized a(Lcom/alibaba/sdk/android/emas/d;)Z
    .locals 3

    monitor-enter p0

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 58
    :try_start_0
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/emas/d;->a()Lcom/alibaba/sdk/android/emas/b;

    move-result-object v1

    sget-object v2, Lcom/alibaba/sdk/android/emas/b;->b:Lcom/alibaba/sdk/android/emas/b;

    if-ne v1, v2, :cond_3

    invoke-virtual {p1}, Lcom/alibaba/sdk/android/emas/d;->getLocation()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 59
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DiskCacheManager removing. cache type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/alibaba/sdk/android/emas/d;->a()Lcom/alibaba/sdk/android/emas/b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 60
    iget-object v1, p0, Lcom/alibaba/sdk/android/emas/c;->a:Ljava/util/Set;

    if-eqz v1, :cond_1

    .line 61
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/emas/d;->getLocation()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    .line 62
    :cond_1
    :goto_0
    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, Lcom/alibaba/sdk/android/emas/d;->getLocation()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 63
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 64
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    .line 65
    :cond_2
    monitor-exit p0

    return v0

    :cond_3
    :goto_1
    if-nez p1, :cond_4

    .line 66
    :try_start_1
    const-string p1, "DiskCacheManager remove failed. data is null"

    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    goto :goto_2

    .line 67
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DiskCacheManager remove failed. cache type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/alibaba/sdk/android/emas/d;->a()Lcom/alibaba/sdk/android/emas/b;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    :goto_2
    monitor-exit p0

    return v0

    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public synthetic add(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/alibaba/sdk/android/emas/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/alibaba/sdk/android/emas/c;->a(Lcom/alibaba/sdk/android/emas/d;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public declared-synchronized b(Lcom/alibaba/sdk/android/emas/d;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/c;->a:Ljava/util/Set;

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/emas/d;->getLocation()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    monitor-exit p0

    .line 24
    return-void

    .line 25
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/c;->a:Ljava/util/Set;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/emas/d;->getLocation()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    .line 34
    monitor-exit p0

    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    :goto_0
    monitor-exit p0

    .line 39
    return-void

    .line 40
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 41
    throw p1
.end method

.method public declared-synchronized clear()V
    .locals 13

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/alibaba/sdk/android/emas/c;->a:Ljava/lang/String;

    .line 5
    .line 6
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 10
    .line 11
    .line 12
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    .line 26
    monitor-exit p0

    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    goto/16 :goto_2

    .line 30
    .line 31
    :cond_1
    :try_start_2
    new-instance v1, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, v0, v1}, Lcom/alibaba/sdk/android/emas/c;->a(Ljava/io/File;Ljava/util/List;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v2, "DiskCacheManager num: "

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-lez v1, :cond_7

    .line 69
    .line 70
    new-instance v1, Lcom/alibaba/sdk/android/emas/c$2;

    .line 71
    .line 72
    invoke-direct {v1, p0}, Lcom/alibaba/sdk/android/emas/c$2;-><init>(Lcom/alibaba/sdk/android/emas/c;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 76
    .line 77
    .line 78
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 79
    .line 80
    .line 81
    move-result-wide v1

    .line 82
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    const/4 v4, 0x0

    .line 87
    const-wide/16 v5, 0x0

    .line 88
    .line 89
    move v7, v4

    .line 90
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-eqz v8, :cond_3

    .line 95
    .line 96
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    check-cast v8, Ljava/io/File;

    .line 101
    .line 102
    invoke-virtual {v8}, Ljava/io/File;->lastModified()J

    .line 103
    .line 104
    .line 105
    move-result-wide v9

    .line 106
    sub-long v9, v1, v9

    .line 107
    .line 108
    iget-wide v11, p0, Lcom/alibaba/sdk/android/emas/c;->a:J

    .line 109
    .line 110
    cmp-long v9, v9, v11

    .line 111
    .line 112
    if-ltz v9, :cond_2

    .line 113
    .line 114
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 122
    .line 123
    invoke-virtual {v8}, Ljava/io/File;->length()J

    .line 124
    .line 125
    .line 126
    move-result-wide v8

    .line 127
    add-long/2addr v5, v8

    .line 128
    goto :goto_0

    .line 129
    :cond_3
    iget v1, p0, Lcom/alibaba/sdk/android/emas/c;->diskCacheLimitCount:I

    .line 130
    .line 131
    if-gt v7, v1, :cond_4

    .line 132
    .line 133
    iget v1, p0, Lcom/alibaba/sdk/android/emas/c;->diskCacheLimitCapacity:I

    .line 134
    .line 135
    int-to-long v1, v1

    .line 136
    cmp-long v1, v5, v1

    .line 137
    .line 138
    if-lez v1, :cond_7

    .line 139
    .line 140
    :cond_4
    const-string v1, "DiskCacheManager exceed limit. start clear."

    .line 141
    .line 142
    invoke-static {v1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    iget v1, p0, Lcom/alibaba/sdk/android/emas/c;->diskCacheLimitCount:I

    .line 146
    .line 147
    int-to-double v1, v1

    .line 148
    const-wide v8, 0x3fe999999999999aL    # 0.8

    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    mul-double/2addr v1, v8

    .line 154
    double-to-int v1, v1

    .line 155
    iget v2, p0, Lcom/alibaba/sdk/android/emas/c;->diskCacheLimitCapacity:I

    .line 156
    .line 157
    int-to-double v2, v2

    .line 158
    mul-double/2addr v2, v8

    .line 159
    double-to-int v2, v2

    .line 160
    :goto_1
    if-gt v7, v1, :cond_5

    .line 161
    .line 162
    int-to-long v8, v2

    .line 163
    cmp-long v3, v5, v8

    .line 164
    .line 165
    if-lez v3, :cond_7

    .line 166
    .line 167
    :cond_5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-ge v4, v3, :cond_7

    .line 172
    .line 173
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    check-cast v3, Ljava/io/File;

    .line 178
    .line 179
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 180
    .line 181
    .line 182
    move-result v8

    .line 183
    if-eqz v8, :cond_6

    .line 184
    .line 185
    add-int/lit8 v7, v7, -0x1

    .line 186
    .line 187
    invoke-virtual {v3}, Ljava/io/File;->length()J

    .line 188
    .line 189
    .line 190
    move-result-wide v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 191
    sub-long/2addr v5, v8

    .line 192
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_7
    monitor-exit p0

    .line 196
    return-void

    .line 197
    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 198
    throw v0
.end method

.method public synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/emas/c;->a()Lcom/alibaba/sdk/android/emas/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public synthetic remove(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/alibaba/sdk/android/emas/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/alibaba/sdk/android/emas/c;->a(Lcom/alibaba/sdk/android/emas/d;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

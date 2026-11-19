.class Lcom/tendcloud/tenddata/s$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private mCached:Landroid/graphics/Bitmap;

.field private final mPaint:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Paint;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/tendcloud/tenddata/s$a;->mPaint:Landroid/graphics/Paint;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lcom/tendcloud/tenddata/s$a;->mCached:Landroid/graphics/Bitmap;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic access$000(Lcom/tendcloud/tenddata/s$a;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tendcloud/tenddata/s$a;->mCached:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public declared-synchronized recreate(IIILandroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/s$a;->mCached:Landroid/graphics/Bitmap;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-ne v0, p1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/tendcloud/tenddata/s$a;->mCached:Landroid/graphics/Bitmap;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 15
    .line 16
    .line 17
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    if-eq v0, p2, :cond_1

    .line 19
    .line 20
    :cond_0
    :try_start_1
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 21
    .line 22
    invoke-static {p1, p2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lcom/tendcloud/tenddata/s$a;->mCached:Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catch_0
    const/4 p1, 0x0

    .line 30
    :try_start_2
    iput-object p1, p0, Lcom/tendcloud/tenddata/s$a;->mCached:Landroid/graphics/Bitmap;

    .line 31
    .line 32
    :goto_0
    iget-object p1, p0, Lcom/tendcloud/tenddata/s$a;->mCached:Landroid/graphics/Bitmap;

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1, p3}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object p1, p0, Lcom/tendcloud/tenddata/s$a;->mCached:Landroid/graphics/Bitmap;

    .line 40
    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    new-instance p1, Landroid/graphics/Canvas;

    .line 44
    .line 45
    iget-object p2, p0, Lcom/tendcloud/tenddata/s$a;->mCached:Landroid/graphics/Bitmap;

    .line 46
    .line 47
    invoke-direct {p1, p2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, Lcom/tendcloud/tenddata/s$a;->mPaint:Landroid/graphics/Paint;

    .line 51
    .line 52
    const/4 p3, 0x0

    .line 53
    invoke-virtual {p1, p4, p3, p3, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 54
    .line 55
    .line 56
    :catchall_0
    :cond_2
    monitor-exit p0

    .line 57
    return-void
.end method

.method public declared-synchronized writeBitmapJSON(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Ljava/lang/String;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/s$a;->mCached:Landroid/graphics/Bitmap;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lcom/tendcloud/tenddata/s$a;->mCached:Landroid/graphics/Bitmap;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string v0, "\"data:image/jpeg;base64,"

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p3, v0}, Ljava/io/OutputStream;->write([B)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Landroid/util/Base64OutputStream;

    .line 31
    .line 32
    const/4 v1, 0x2

    .line 33
    invoke-direct {v0, p3, v1}, Landroid/util/Base64OutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lcom/tendcloud/tenddata/s$a;->mCached:Landroid/graphics/Bitmap;

    .line 37
    .line 38
    invoke-virtual {v1, p1, p2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 42
    .line 43
    .line 44
    const/16 p1, 0x22

    .line 45
    .line 46
    invoke-virtual {p3, p1}, Ljava/io/OutputStream;->write(I)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/tendcloud/tenddata/s$a;->mCached:Landroid/graphics/Bitmap;

    .line 50
    .line 51
    invoke-static {p1}, Lcom/tendcloud/tenddata/s;->a(Landroid/graphics/Bitmap;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    monitor-exit p0

    .line 56
    return-object p1

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    :goto_0
    :try_start_1
    const-string p1, "null"

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p3, p1}, Ljava/io/OutputStream;->write([B)V

    .line 66
    .line 67
    .line 68
    const-string p1, ""
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    .line 70
    monitor-exit p0

    .line 71
    return-object p1

    .line 72
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 73
    throw p1
.end method

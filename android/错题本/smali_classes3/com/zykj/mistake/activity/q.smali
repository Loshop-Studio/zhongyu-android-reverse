# RE note 本类字节码直接引用的读写或显示接口包括文件流、位图。
.class public final synthetic Lcom/zykj/mistake/activity/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

.field public final synthetic b:Landroid/net/Uri;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/activity/q;->a:Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    iput-object p2, p0, Lcom/zykj/mistake/activity/q;->b:Landroid/net/Uri;

    iput-object p3, p0, Lcom/zykj/mistake/activity/q;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/zykj/mistake/activity/q;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
# RE I/O 从数据流解码图片（BitmapFactory.decodeStream）、编码位图（Bitmap.compress）。
.method public final a(Lq5/f;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/activity/q;->c:Ljava/lang/String;

    .line 2
    .line 3
    sget v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u:I

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/mistake/activity/q;->a:Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lcom/zykj/mistake/activity/q;->b:Landroid/net/Uri;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "decodeStream(...)"

    .line 22
    .line 23
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v2, "fileName"

    .line 27
    .line 28
    iget-object v3, p0, Lcom/zykj/mistake/activity/q;->d:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :try_start_0
    new-instance v2, Ljava/io/File;

    .line 34
    .line 35
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-nez v4, :cond_0

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catch_0
    move-exception v0

    .line 49
    goto :goto_2

    .line 50
    :catch_1
    move-exception v0

    .line 51
    goto :goto_3

    .line 52
    :cond_0
    :goto_0
    new-instance v2, Ljava/io/File;

    .line 53
    .line 54
    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_1

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 68
    .line 69
    .line 70
    :goto_1
    new-instance v0, Ljava/io/FileOutputStream;

    .line 71
    .line 72
    invoke-direct {v0, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 73
    .line 74
    .line 75
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 76
    .line 77
    const/16 v4, 0x50

    .line 78
    .line 79
    invoke-virtual {v1, v3, v4, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const-string v1, "getAbsolutePath(...)"

    .line 93
    .line 94
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    .line 96
    .line 97
    goto :goto_5

    .line 98
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 99
    .line 100
    .line 101
    goto :goto_4

    .line 102
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 103
    .line 104
    .line 105
    :goto_4
    const-string v0, ""

    .line 106
    .line 107
    :goto_5
    invoke-interface {p1, v0}, Lq5/f;->onNext(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {p1}, Lq5/f;->onComplete()V

    .line 111
    .line 112
    .line 113
    return-void
.end method

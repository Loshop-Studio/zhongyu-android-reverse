.class public final Lf2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lf2/d;

.field public static b:Ljava/lang/String;

.field public static c:Landroid/content/Context;

.field public static d:Lorg/tensorflow/lite/b;

.field public static e:Z

.field public static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lf2/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lf2/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf2/d;->a:Lf2/d;

    .line 7
    .line 8
    const-string v0, "ImageSafetyHelper"

    .line 9
    .line 10
    sput-object v0, Lf2/d;->b:Ljava/lang/String;

    .line 11
    .line 12
    const/16 v0, 0x8

    .line 13
    .line 14
    sput v0, Lf2/d;->f:I

    .line 15
    .line 16
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
.method public final a(Landroid/graphics/Bitmap;)Ljava/nio/ByteBuffer;
    .locals 11

    .line 1
    const v0, 0x93000

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 14
    .line 15
    .line 16
    const v1, 0xc400

    .line 17
    .line 18
    .line 19
    new-array v3, v1, [I

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    add-int/lit16 v2, v2, -0xe0

    .line 26
    .line 27
    div-int/lit8 v2, v2, 0x2

    .line 28
    .line 29
    const/4 v10, 0x0

    .line 30
    invoke-static {v2, v10}, Lnd/o;->e(II)I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    add-int/lit16 v2, v2, -0xe0

    .line 39
    .line 40
    div-int/lit8 v2, v2, 0x2

    .line 41
    .line 42
    invoke-static {v2, v10}, Lnd/o;->e(II)I

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    const/16 v8, 0xe0

    .line 47
    .line 48
    const/16 v9, 0xe0

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    const/16 v5, 0xe0

    .line 52
    .line 53
    move-object v2, p1

    .line 54
    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 55
    .line 56
    .line 57
    :goto_0
    if-ge v10, v1, :cond_0

    .line 58
    .line 59
    aget p1, v3, v10

    .line 60
    .line 61
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    add-int/lit8 v2, v2, -0x68

    .line 66
    .line 67
    int-to-float v2, v2

    .line 68
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 69
    .line 70
    .line 71
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    add-int/lit8 v2, v2, -0x75

    .line 76
    .line 77
    int-to-float v2, v2

    .line 78
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 79
    .line 80
    .line 81
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    add-int/lit8 p1, p1, -0x7b

    .line 86
    .line 87
    int-to-float p1, p1

    .line 88
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 89
    .line 90
    .line 91
    add-int/lit8 v10, v10, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    return-object v0
.end method

.method public final b(Landroid/content/Context;)V
    .locals 9

    .line 1
    const-string v0, "app"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-boolean v0, Lf2/d;->e:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    sget-object v0, Lf2/d;->c:Landroid/content/Context;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    sput-object p1, Lf2/d;->c:Landroid/content/Context;

    .line 17
    .line 18
    new-instance p1, Lorg/tensorflow/lite/b$a;

    .line 19
    .line 20
    invoke-direct {p1}, Lorg/tensorflow/lite/b$a;-><init>()V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x4

    .line 24
    invoke-virtual {p1, v0}, Lorg/tensorflow/lite/b$a;->a(I)Lorg/tensorflow/lite/b$a;

    .line 25
    .line 26
    .line 27
    :try_start_0
    sget-object v0, Lf2/d;->c:Landroid/content/Context;

    .line 28
    .line 29
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "nsfw.tflite"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v1, Ljava/io/FileInputStream;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    sget-object v4, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    .line 58
    .line 59
    .line 60
    move-result-wide v5

    .line 61
    invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->getDeclaredLength()J

    .line 62
    .line 63
    .line 64
    move-result-wide v7

    .line 65
    invoke-virtual/range {v3 .. v8}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    new-instance v1, Lorg/tensorflow/lite/b;

    .line 70
    .line 71
    invoke-direct {v1, v0, p1}, Lorg/tensorflow/lite/b;-><init>(Ljava/nio/ByteBuffer;Lorg/tensorflow/lite/b$a;)V

    .line 72
    .line 73
    .line 74
    sput-object v1, Lf2/d;->d:Lorg/tensorflow/lite/b;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    .line 76
    return-void

    .line 77
    :catch_0
    const/4 p1, 0x0

    .line 78
    sput-object p1, Lf2/d;->c:Landroid/content/Context;

    .line 79
    .line 80
    sget-object p1, Lf2/d;->b:Ljava/lang/String;

    .line 81
    .line 82
    const-string v0, "TfLiteJudge initialize failure."

    .line 83
    .line 84
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    new-instance p1, Lcom/friday/common/helper/JudgeException;

    .line 88
    .line 89
    const-string v0, "Could not load model: nsfw.tflite"

    .line 90
    .line 91
    invoke-direct {p1, v0}, Lcom/friday/common/helper/JudgeException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p1
.end method

.method public final c(Landroid/graphics/Bitmap;)[F
    .locals 3

    .line 1
    sget-object v0, Lf2/d;->c:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lf2/d;->a:Lf2/d;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    const/16 v2, 0x100

    .line 9
    .line 10
    invoke-static {p1, v2, v2, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0, p1}, Lf2/d;->a(Landroid/graphics/Bitmap;)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/4 v1, 0x2

    .line 19
    new-array v1, v1, [F

    .line 20
    .line 21
    filled-new-array {v1}, [[F

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    monitor-enter v0

    .line 26
    :try_start_0
    sget-object v2, Lf2/d;->d:Lorg/tensorflow/lite/b;

    .line 27
    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    const-string v2, "mInterpreter"

    .line 31
    .line 32
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    :goto_0
    invoke-virtual {v2, p1, v1}, Lorg/tensorflow/lite/b;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    aget-object p1, v1, p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    monitor-exit v0

    .line 46
    return-object p1

    .line 47
    :goto_1
    monitor-exit v0

    .line 48
    throw p1

    .line 49
    :cond_1
    new-instance p1, Lcom/friday/common/helper/JudgeException;

    .line 50
    .line 51
    const-string v0, "TfLiteJudge has not initialized yet."

    .line 52
    .line 53
    invoke-direct {p1, v0}, Lcom/friday/common/helper/JudgeException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1
.end method

.method public final d(Ljava/lang/String;)[F
    .locals 1

    .line 1
    const-string v0, "filePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-boolean v0, Lf2/d;->e:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    new-array p1, p1, [F

    .line 12
    .line 13
    fill-array-data p1, :array_0

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "decodeFile(...)"

    .line 22
    .line 23
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lf2/d;->c(Landroid/graphics/Bitmap;)[F

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

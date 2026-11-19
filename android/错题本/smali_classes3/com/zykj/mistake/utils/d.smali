# RE note 本类字节码直接引用的读写或显示接口包括偏好设置。
.class public abstract Lcom/zykj/mistake/utils/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:[Ljava/lang/String;

.field public static final c:[Ljava/lang/String;

.field public static final d:[Ljava/lang/String;

.field public static e:Landroid/widget/Toast;


# direct methods
.method static constructor <clinit>()V
    .locals 29

    .line 1
    const-string v0, "\u4e00\u822c"

    .line 2
    .line 3
    const-string v1, "\u56f0\u96be"

    .line 4
    .line 5
    const-string v2, "\u7b80\u5355"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/zykj/mistake/utils/d;->a:[Ljava/lang/String;

    .line 12
    .line 13
    const-string v0, "\u57fa\u672c\u61c2"

    .line 14
    .line 15
    const-string v1, "\u5b8c\u5168\u61c2"

    .line 16
    .line 17
    const-string v2, "\u4e0d\u61c2"

    .line 18
    .line 19
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lcom/zykj/mistake/utils/d;->b:[Ljava/lang/String;

    .line 24
    .line 25
    const-string v0, "\u8fd0\u7b97"

    .line 26
    .line 27
    const-string v1, "\u7c97\u5fc3"

    .line 28
    .line 29
    const-string v2, "\u6982\u5ff5"

    .line 30
    .line 31
    const-string v3, "\u5ba1\u9898"

    .line 32
    .line 33
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Lcom/zykj/mistake/utils/d;->c:[Ljava/lang/String;

    .line 38
    .line 39
    const-string v27, "\u221a"

    .line 40
    .line 41
    const-string v28, "\u00d7"

    .line 42
    .line 43
    const-string v1, "A"

    .line 44
    .line 45
    const-string v2, "B"

    .line 46
    .line 47
    const-string v3, "C"

    .line 48
    .line 49
    const-string v4, "D"

    .line 50
    .line 51
    const-string v5, "E"

    .line 52
    .line 53
    const-string v6, "F"

    .line 54
    .line 55
    const-string v7, "G"

    .line 56
    .line 57
    const-string v8, "H"

    .line 58
    .line 59
    const-string v9, "I"

    .line 60
    .line 61
    const-string v10, "J"

    .line 62
    .line 63
    const-string v11, "K"

    .line 64
    .line 65
    const-string v12, "L"

    .line 66
    .line 67
    const-string v13, "M"

    .line 68
    .line 69
    const-string v14, "N"

    .line 70
    .line 71
    const-string v15, "O"

    .line 72
    .line 73
    const-string v16, "P"

    .line 74
    .line 75
    const-string v17, "Q"

    .line 76
    .line 77
    const-string v18, "R"

    .line 78
    .line 79
    const-string v19, "S"

    .line 80
    .line 81
    const-string v20, "T"

    .line 82
    .line 83
    const-string v21, "U"

    .line 84
    .line 85
    const-string v22, "V"

    .line 86
    .line 87
    const-string v23, "W"

    .line 88
    .line 89
    const-string v24, "X"

    .line 90
    .line 91
    const-string v25, "Y"

    .line 92
    .line 93
    const-string v26, "Z"

    .line 94
    .line 95
    filled-new-array/range {v1 .. v28}, [Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    sput-object v0, Lcom/zykj/mistake/utils/d;->d:[Ljava/lang/String;

    .line 100
    .line 101
    return-void
.end method

.method public static a(Ljava/io/File;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const-string v1, "clean"

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    invoke-virtual {p0}, Ljava/io/File;->lastModified()J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    sub-long/2addr v2, v4

    .line 25
    const-wide/32 v4, 0x240c8400

    .line 26
    .line 27
    .line 28
    cmp-long v0, v2, v4

    .line 29
    .line 30
    if-ltz v0, :cond_3

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v2, "\u5f53\u524d\u6e05\u9664\u7684\u662f\u6587\u4ef6---->"

    .line 42
    .line 43
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {v1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    array-length v2, v0

    .line 64
    const/4 v3, 0x0

    .line 65
    :goto_0
    if-ge v3, v2, :cond_2

    .line 66
    .line 67
    aget-object v4, v0, v3

    .line 68
    .line 69
    invoke-static {v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v4}, Lcom/zykj/mistake/utils/d;->a(Ljava/io/File;)V

    .line 73
    .line 74
    .line 75
    add-int/lit8 v3, v3, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    array-length v0, v0

    .line 85
    if-nez v0, :cond_3

    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v2, "\u5f53\u524d\u6e05\u9664\u7684\u662f\u6587\u4ef6\u5939---->"

    .line 97
    .line 98
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-static {v1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    :cond_3
    :goto_1
    return-void
.end method

.method public static final b(Landroid/content/Context;Lh6/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "getApplicationContext(...)"

    .line 6
    .line 7
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lcoil3/u;->a(Landroid/content/Context;)Lcoil3/n;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v0, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 15
    .line 16
    sget-object v0, Lg7/d;->a:Lg7/d;

    .line 17
    .line 18
    new-instance v1, Lcom/zykj/mistake/utils/CoilImageRequestsKt$clearCoilDiskCache$2;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v1, p0, v2}, Lcom/zykj/mistake/utils/CoilImageRequestsKt$clearCoilDiskCache$2;-><init>(Lcoil3/n;Lh6/c;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/x;->F(Lh6/h;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

# RE I/O 读取布尔偏好（SharedPreferences.getBoolean）。
.method public static c(Landroid/content/Context;Ljava/lang/String;Z)Z
    .locals 2

    .line 1
    const-string v0, "zykjMistake"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public static d(Landroid/content/Context;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const-string v0, "connectivity"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Landroid/net/ConnectivityManager;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->isAvailable()Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

# RE I/O 保存布尔偏好（SharedPreferences$Editor.putBoolean）。
.method public static e(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 2

    .line 1
    const-string v0, "zykjMistake"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 13
    .line 14
    .line 15
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

# RE I/O 保存字符串偏好（SharedPreferences$Editor.putString）。
.method public static f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "zykjMistake"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 13
    .line 14
    .line 15
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static g(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 10

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {p0, v0, v1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 18
    .line 19
    .line 20
    move-result v9

    .line 21
    mul-int p0, v5, v9

    .line 22
    .line 23
    new-array v3, p0, [I

    .line 24
    .line 25
    const/4 v6, 0x0

    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    move v8, v5

    .line 29
    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    move v1, v0

    .line 34
    :goto_0
    if-ge v1, p0, :cond_1

    .line 35
    .line 36
    aget v4, v3, v1

    .line 37
    .line 38
    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const/16 v7, 0xf5

    .line 43
    .line 44
    if-lt v6, v7, :cond_0

    .line 45
    .line 46
    invoke-static {v4}, Landroid/graphics/Color;->green(I)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-lt v6, v7, :cond_0

    .line 51
    .line 52
    invoke-static {v4}, Landroid/graphics/Color;->blue(I)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-lt v4, v7, :cond_0

    .line 57
    .line 58
    aput v0, v3, v1

    .line 59
    .line 60
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    const/4 v6, 0x0

    .line 64
    const/4 v7, 0x0

    .line 65
    const/4 v4, 0x0

    .line 66
    move v8, v5

    .line 67
    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 68
    .line 69
    .line 70
    return-object v2
.end method

# RE note 本类字节码直接引用的读写或显示接口包括文件流。
.class public final Lcom/zykj/mistake/utils/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/zykj/mistake/activity/MainActivity;

.field public final b:Landroid/widget/FrameLayout;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/activity/MainActivity;Landroid/widget/FrameLayout;)V
    .locals 1

    .line 1
    const-string v0, "webCaptureContainer"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/mistake/utils/c;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/zykj/mistake/utils/c;->b:Landroid/widget/FrameLayout;

    .line 12
    .line 13
    return-void
.end method

.method public static final a(Lcom/zykj/mistake/utils/c;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-eqz p0, :cond_3

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    cmp-long p0, v0, v2

    .line 17
    .line 18
    if-lez p0, :cond_3

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string v0, "getName(...)"

    .line 25
    .line 26
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/16 v0, 0x2e

    .line 30
    .line 31
    const-string v1, ""

    .line 32
    .line 33
    invoke-static {v0, p0, v1}, Lkotlin/text/p;->e0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 p0, 0x0

    .line 45
    :goto_0
    if-nez p0, :cond_1

    .line 46
    .line 47
    const-string p0, "jpg"

    .line 48
    .line 49
    :cond_1
    invoke-static {p2, p0}, Lcom/zykj/mistake/utils/c;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    new-instance p2, Ljava/io/FileInputStream;

    .line 54
    .line 55
    invoke-direct {p2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 56
    .line 57
    .line 58
    :try_start_0
    new-instance p1, Ljava/io/FileOutputStream;

    .line 59
    .line 60
    invoke-direct {p1, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    .line 63
    :try_start_1
    invoke-static {p2, p1}, La/a;->i(Ljava/io/FileInputStream;Ljava/io/FileOutputStream;)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 64
    .line 65
    .line 66
    :try_start_2
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/io/FileInputStream;->close()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 73
    .line 74
    .line 75
    move-result-wide p1

    .line 76
    cmp-long p1, p1, v2

    .line 77
    .line 78
    if-lez p1, :cond_2

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    const-string p1, "getAbsolutePath(...)"

    .line 85
    .line 86
    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 91
    .line 92
    const-string p1, "Copy image failed"

    .line 93
    .line 94
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p0

    .line 98
    :catchall_0
    move-exception p0

    .line 99
    goto :goto_1

    .line 100
    :catchall_1
    move-exception p0

    .line 101
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 102
    :catchall_2
    move-exception v0

    .line 103
    :try_start_4
    invoke-static {p1, p0}, Lcoil3/network/g;->e(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 107
    :goto_1
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 108
    :catchall_3
    move-exception p1

    .line 109
    invoke-static {p2, p0}, Lcoil3/network/g;->e(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    throw p1

    .line 113
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 114
    .line 115
    const-string p1, "Local file missing"

    .line 116
    .line 117
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p0
.end method

.method public static final b(Lcom/zykj/mistake/utils/c;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/utils/c;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 2
    .line 3
    instance-of v1, p3, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p3

    .line 8
    check-cast v1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;

    .line 9
    .line 10
    iget v2, v1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->label:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;

    .line 23
    .line 24
    invoke-direct {v1, p0, p3}, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;-><init>(Lcom/zykj/mistake/utils/c;Lh6/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p3, v1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 30
    .line 31
    iget v3, v1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->label:I

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x1

    .line 35
    const/4 v6, 0x0

    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    if-eq v3, v5, :cond_2

    .line 39
    .line 40
    if-ne v3, v4, :cond_1

    .line 41
    .line 42
    iget-object p0, v1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->L$3:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Ls/n;

    .line 45
    .line 46
    iget-object p0, v1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->L$2:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Ls/f;

    .line 49
    .line 50
    iget-object p0, v1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->L$1:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Ljava/lang/String;

    .line 53
    .line 54
    iget-object p0, v1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-object p3

    .line 62
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p0

    .line 70
    :cond_2
    iget-object p1, v1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->L$2:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, Ls/f;

    .line 73
    .line 74
    iget-object p1, v1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->L$1:Ljava/lang/Object;

    .line 75
    .line 76
    move-object p2, p1

    .line 77
    check-cast p2, Ljava/lang/String;

    .line 78
    .line 79
    iget-object p1, v1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->L$0:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p1, Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    new-instance p3, Ls/c;

    .line 91
    .line 92
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    const-string v7, "getApplicationContext(...)"

    .line 97
    .line 98
    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-direct {p3, v3}, Ls/c;-><init>(Landroid/content/Context;)V

    .line 102
    .line 103
    .line 104
    iput-object p1, p3, Ls/c;->c:Ljava/lang/Object;

    .line 105
    .line 106
    sget-object p1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 107
    .line 108
    invoke-static {p3}, Ls/h;->a(Ls/c;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p3}, Ls/c;->a()Ls/f;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    sget-object p3, Lcom/zykj/mistake/utils/e;->a:Lcom/zykj/mistake/utils/e;

    .line 116
    .line 117
    invoke-virtual {p3, v0}, Lcom/zykj/mistake/utils/e;->a(Landroid/content/Context;)Lcoil3/n;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    iput-object v6, v1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->L$0:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object p2, v1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->L$1:Ljava/lang/Object;

    .line 124
    .line 125
    iput-object v6, v1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->L$2:Ljava/lang/Object;

    .line 126
    .line 127
    iput v5, v1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->label:I

    .line 128
    .line 129
    check-cast p3, Lcoil3/r;

    .line 130
    .line 131
    invoke-virtual {p3, p1, v1}, Lcoil3/r;->c(Ls/f;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p3

    .line 135
    if-ne p3, v2, :cond_4

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_4
    :goto_1
    instance-of p1, p3, Ls/n;

    .line 139
    .line 140
    if-eqz p1, :cond_5

    .line 141
    .line 142
    check-cast p3, Ls/n;

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_5
    move-object p3, v6

    .line 146
    :goto_2
    if-eqz p3, :cond_7

    .line 147
    .line 148
    iget-object p1, p3, Ls/n;->a:Lcoil3/k;

    .line 149
    .line 150
    invoke-static {p1}, Lcoil3/o;->j(Lcoil3/k;)Landroid/graphics/Bitmap;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    iput-object v6, v1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->L$0:Ljava/lang/Object;

    .line 155
    .line 156
    iput-object v6, v1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->L$1:Ljava/lang/Object;

    .line 157
    .line 158
    iput-object v6, v1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->L$2:Ljava/lang/Object;

    .line 159
    .line 160
    iput-object v6, v1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->L$3:Ljava/lang/Object;

    .line 161
    .line 162
    iput v4, v1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$downloadImage$1;->label:I

    .line 163
    .line 164
    invoke-virtual {p0, p1, p2, v1}, Lcom/zykj/mistake/utils/c;->f(Landroid/graphics/Bitmap;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    if-ne p0, v2, :cond_6

    .line 169
    .line 170
    :goto_3
    return-object v2

    .line 171
    :cond_6
    return-object p0

    .line 172
    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 173
    .line 174
    const-string p1, "Download image failed"

    .line 175
    .line 176
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw p0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 6

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    sget-object v1, Landroid/os/Environment;->DIRECTORY_DOCUMENTS:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v1}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "MistakeAskMaterial"

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 21
    .line 22
    .line 23
    :cond_0
    new-instance v1, Lkotlin/text/Regex;

    .line 24
    .line 25
    const-string v2, "[^A-Za-z0-9_.-]"

    .line 26
    .line 27
    invoke-direct {v1, v2}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const-string v2, "_"

    .line 31
    .line 32
    invoke-virtual {v1, p0, v2}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance v1, Ljava/io/File;

    .line 37
    .line 38
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    new-instance v5, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p0, "."

    .line 57
    .line 58
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-direct {v1, v0, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object v1
.end method


# virtual methods
.method public final c(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$1;-><init>(Lcom/zykj/mistake/utils/c;Lh6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v4, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    iget-object p1, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$1;->L$2:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Landroid/graphics/Bitmap;

    .line 43
    .line 44
    iget-object p1, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$1;->L$1:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Ljava/lang/String;

    .line 47
    .line 48
    iget-object p1, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$1;->L$0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-object p3

    .line 56
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_2
    iget-object p1, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$1;->L$1:Ljava/lang/Object;

    .line 65
    .line 66
    move-object p2, p1

    .line 67
    check-cast p2, Ljava/lang/String;

    .line 68
    .line 69
    iget-object p1, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$1;->L$0:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-static {p1}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result p3

    .line 84
    if-nez p3, :cond_6

    .line 85
    .line 86
    sget-object p3, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 87
    .line 88
    sget-object p3, Le7/k;->a:Ld7/d;

    .line 89
    .line 90
    new-instance v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$bitmap$1;

    .line 91
    .line 92
    invoke-direct {v2, p0, p1, v5}, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$bitmap$1;-><init>(Lcom/zykj/mistake/utils/c;Ljava/lang/String;Lh6/c;)V

    .line 93
    .line 94
    .line 95
    iput-object v5, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$1;->L$0:Ljava/lang/Object;

    .line 96
    .line 97
    iput-object p2, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$1;->L$1:Ljava/lang/Object;

    .line 98
    .line 99
    iput v4, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$1;->label:I

    .line 100
    .line 101
    invoke-static {p3, v2, v0}, Lkotlinx/coroutines/x;->F(Lh6/h;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p3

    .line 105
    if-ne p3, v1, :cond_4

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_4
    :goto_1
    check-cast p3, Landroid/graphics/Bitmap;

    .line 109
    .line 110
    iput-object v5, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$1;->L$0:Ljava/lang/Object;

    .line 111
    .line 112
    iput-object v5, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$1;->L$1:Ljava/lang/Object;

    .line 113
    .line 114
    iput-object v5, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$1;->L$2:Ljava/lang/Object;

    .line 115
    .line 116
    iput v3, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$1;->label:I

    .line 117
    .line 118
    invoke-virtual {p0, p3, p2, v0}, Lcom/zykj/mistake/utils/c;->f(Landroid/graphics/Bitmap;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    if-ne p1, v1, :cond_5

    .line 123
    .line 124
    :goto_2
    return-object v1

    .line 125
    :cond_5
    return-object p1

    .line 126
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 127
    .line 128
    const-string p2, "Web url missing"

    .line 129
    .line 130
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw p1
.end method

.method public final e(Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->label:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;-><init>(Lcom/zykj/mistake/utils/c;Lh6/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 32
    .line 33
    iget v4, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->label:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x3

    .line 37
    const/4 v7, 0x2

    .line 38
    const/4 v8, 0x1

    .line 39
    if-eqz v4, :cond_4

    .line 40
    .line 41
    if-eq v4, v8, :cond_3

    .line 42
    .line 43
    if-eq v4, v7, :cond_2

    .line 44
    .line 45
    if-ne v4, v6, :cond_1

    .line 46
    .line 47
    iget v4, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->I$1:I

    .line 48
    .line 49
    iget v9, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->I$0:I

    .line 50
    .line 51
    iget-object v10, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$7:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v10, Ljava/util/Collection;

    .line 54
    .line 55
    iget-object v11, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$6:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v11, Lcom/zykj/mistake/feature/ask/y;

    .line 58
    .line 59
    iget-object v11, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$4:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v11, Ljava/util/Iterator;

    .line 62
    .line 63
    iget-object v12, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$3:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v12, Ljava/util/Collection;

    .line 66
    .line 67
    iget-object v13, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$2:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v13, Ljava/lang/Iterable;

    .line 70
    .line 71
    iget-object v13, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$1:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v13, Ljava/lang/Iterable;

    .line 74
    .line 75
    iget-object v13, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v13, Ljava/util/List;

    .line 78
    .line 79
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_4

    .line 83
    .line 84
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 87
    .line 88
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v1

    .line 92
    :cond_2
    iget v4, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->I$1:I

    .line 93
    .line 94
    iget v9, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->I$0:I

    .line 95
    .line 96
    iget-object v10, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$7:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v10, Ljava/util/Collection;

    .line 99
    .line 100
    iget-object v11, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$6:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v11, Lcom/zykj/mistake/feature/ask/y;

    .line 103
    .line 104
    iget-object v11, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$4:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v11, Ljava/util/Iterator;

    .line 107
    .line 108
    iget-object v12, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$3:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v12, Ljava/util/Collection;

    .line 111
    .line 112
    iget-object v13, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$2:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v13, Ljava/lang/Iterable;

    .line 115
    .line 116
    iget-object v13, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$1:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v13, Ljava/lang/Iterable;

    .line 119
    .line 120
    iget-object v13, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$0:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v13, Ljava/util/List;

    .line 123
    .line 124
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    move/from16 v25, v4

    .line 128
    .line 129
    move-object v4, v2

    .line 130
    move-object v2, v3

    .line 131
    goto/16 :goto_10

    .line 132
    .line 133
    :cond_3
    iget v4, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->I$1:I

    .line 134
    .line 135
    iget v9, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->I$0:I

    .line 136
    .line 137
    iget-object v10, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$7:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v10, Ljava/util/Collection;

    .line 140
    .line 141
    iget-object v11, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$6:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v11, Lcom/zykj/mistake/feature/ask/y;

    .line 144
    .line 145
    iget-object v11, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$4:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v11, Ljava/util/Iterator;

    .line 148
    .line 149
    iget-object v12, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$3:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v12, Ljava/util/Collection;

    .line 152
    .line 153
    iget-object v13, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$2:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v13, Ljava/lang/Iterable;

    .line 156
    .line 157
    iget-object v13, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$1:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v13, Ljava/lang/Iterable;

    .line 160
    .line 161
    iget-object v13, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$0:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v13, Ljava/util/List;

    .line 164
    .line 165
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    move v7, v4

    .line 169
    move-object v4, v2

    .line 170
    move-object v2, v3

    .line 171
    move-object v3, v12

    .line 172
    move v12, v8

    .line 173
    move v8, v5

    .line 174
    goto/16 :goto_12

    .line 175
    .line 176
    :cond_4
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    new-instance v1, Ljava/util/ArrayList;

    .line 180
    .line 181
    const/16 v4, 0xa

    .line 182
    .line 183
    move-object/from16 v9, p1

    .line 184
    .line 185
    invoke-static {v9, v4}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 190
    .line 191
    .line 192
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    move-object v10, v1

    .line 197
    move-object v11, v4

    .line 198
    move v4, v5

    .line 199
    move v9, v4

    .line 200
    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    if-eqz v1, :cond_1d

    .line 205
    .line 206
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    check-cast v1, Lcom/zykj/mistake/feature/ask/y;

    .line 211
    .line 212
    iget-object v12, v1, Lcom/zykj/mistake/feature/ask/y;->c:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    .line 213
    .line 214
    iget-object v13, v1, Lcom/zykj/mistake/feature/ask/y;->a:Ljava/lang/String;

    .line 215
    .line 216
    sget-object v14, Lcom/zykj/mistake/utils/a;->a:[I

    .line 217
    .line 218
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 219
    .line 220
    .line 221
    move-result v12

    .line 222
    aget v12, v14, v12

    .line 223
    .line 224
    const/4 v14, 0x0

    .line 225
    if-eq v12, v8, :cond_1b

    .line 226
    .line 227
    if-eq v12, v7, :cond_9

    .line 228
    .line 229
    if-ne v12, v6, :cond_8

    .line 230
    .line 231
    iget-object v12, v1, Lcom/zykj/mistake/feature/ask/y;->e:Ljava/lang/String;

    .line 232
    .line 233
    iget-object v1, v1, Lcom/zykj/mistake/feature/ask/y;->f:Ljava/lang/String;

    .line 234
    .line 235
    iput-object v14, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$0:Ljava/lang/Object;

    .line 236
    .line 237
    iput-object v14, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$1:Ljava/lang/Object;

    .line 238
    .line 239
    iput-object v14, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$2:Ljava/lang/Object;

    .line 240
    .line 241
    iput-object v10, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$3:Ljava/lang/Object;

    .line 242
    .line 243
    iput-object v11, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$4:Ljava/lang/Object;

    .line 244
    .line 245
    iput-object v14, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$5:Ljava/lang/Object;

    .line 246
    .line 247
    iput-object v14, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$6:Ljava/lang/Object;

    .line 248
    .line 249
    iput-object v10, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$7:Ljava/lang/Object;

    .line 250
    .line 251
    iput v9, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->I$0:I

    .line 252
    .line 253
    iput v4, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->I$1:I

    .line 254
    .line 255
    iput v5, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->I$2:I

    .line 256
    .line 257
    iput v6, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->label:I

    .line 258
    .line 259
    invoke-static {v1}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 260
    .line 261
    .line 262
    move-result v15

    .line 263
    if-nez v15, :cond_6

    .line 264
    .line 265
    new-instance v15, Ljava/io/File;

    .line 266
    .line 267
    invoke-direct {v15, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v15}, Ljava/io/File;->exists()Z

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    if-eqz v1, :cond_5

    .line 275
    .line 276
    goto :goto_2

    .line 277
    :cond_5
    move-object v15, v14

    .line 278
    :goto_2
    if-eqz v15, :cond_6

    .line 279
    .line 280
    sget-object v1, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 281
    .line 282
    sget-object v1, Lg7/d;->a:Lg7/d;

    .line 283
    .line 284
    new-instance v12, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveWeb$3$1;

    .line 285
    .line 286
    invoke-direct {v12, v0, v15, v13, v14}, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveWeb$3$1;-><init>(Lcom/zykj/mistake/utils/c;Ljava/io/File;Ljava/lang/String;Lh6/c;)V

    .line 287
    .line 288
    .line 289
    invoke-static {v1, v12, v2}, Lkotlinx/coroutines/x;->F(Lh6/h;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    goto :goto_3

    .line 294
    :cond_6
    invoke-virtual {v0, v12, v13, v2}, Lcom/zykj/mistake/utils/c;->c(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    :goto_3
    if-ne v1, v3, :cond_7

    .line 299
    .line 300
    move-object v2, v3

    .line 301
    goto/16 :goto_11

    .line 302
    .line 303
    :cond_7
    move-object v12, v10

    .line 304
    :goto_4
    check-cast v1, Ljava/lang/String;

    .line 305
    .line 306
    move v7, v4

    .line 307
    move-object v4, v2

    .line 308
    move-object v2, v3

    .line 309
    move-object v3, v12

    .line 310
    move v12, v8

    .line 311
    move v8, v5

    .line 312
    goto/16 :goto_13

    .line 313
    .line 314
    :cond_8
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 315
    .line 316
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 317
    .line 318
    .line 319
    throw v1

    .line 320
    :cond_9
    iput-object v14, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$0:Ljava/lang/Object;

    .line 321
    .line 322
    iput-object v14, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$1:Ljava/lang/Object;

    .line 323
    .line 324
    iput-object v14, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$2:Ljava/lang/Object;

    .line 325
    .line 326
    iput-object v10, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$3:Ljava/lang/Object;

    .line 327
    .line 328
    iput-object v11, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$4:Ljava/lang/Object;

    .line 329
    .line 330
    iput-object v14, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$5:Ljava/lang/Object;

    .line 331
    .line 332
    iput-object v14, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$6:Ljava/lang/Object;

    .line 333
    .line 334
    iput-object v10, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$7:Ljava/lang/Object;

    .line 335
    .line 336
    iput v9, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->I$0:I

    .line 337
    .line 338
    iput v4, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->I$1:I

    .line 339
    .line 340
    iput v5, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->I$2:I

    .line 341
    .line 342
    iput v7, v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->label:I

    .line 343
    .line 344
    iget-object v1, v1, Lcom/zykj/mistake/feature/ask/y;->g:Lcom/zykj/mistake/feature/ask/c0;

    .line 345
    .line 346
    if-eqz v1, :cond_1a

    .line 347
    .line 348
    iget-object v12, v0, Lcom/zykj/mistake/utils/c;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 349
    .line 350
    invoke-virtual {v12}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 351
    .line 352
    .line 353
    move-result-object v12

    .line 354
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 355
    .line 356
    .line 357
    move-result-object v12

    .line 358
    iget v12, v12, Landroid/util/DisplayMetrics;->density:F

    .line 359
    .line 360
    const/16 v14, 0x2d0

    .line 361
    .line 362
    int-to-float v14, v14

    .line 363
    mul-float/2addr v14, v12

    .line 364
    float-to-int v14, v14

    .line 365
    const/16 v15, 0x18

    .line 366
    .line 367
    int-to-float v15, v15

    .line 368
    mul-float/2addr v15, v12

    .line 369
    const/16 v5, 0x12

    .line 370
    .line 371
    int-to-float v5, v5

    .line 372
    mul-float/2addr v5, v12

    .line 373
    const/16 v7, 0xc

    .line 374
    .line 375
    int-to-float v7, v7

    .line 376
    mul-float/2addr v7, v12

    .line 377
    const/4 v8, 0x7

    .line 378
    int-to-float v8, v8

    .line 379
    mul-float/2addr v8, v12

    .line 380
    const/16 v6, 0x8

    .line 381
    .line 382
    int-to-float v6, v6

    .line 383
    mul-float/2addr v6, v12

    .line 384
    move/from16 p1, v5

    .line 385
    .line 386
    move/from16 v17, v6

    .line 387
    .line 388
    const/4 v5, 0x3

    .line 389
    int-to-float v6, v5

    .line 390
    mul-float/2addr v6, v12

    .line 391
    new-instance v5, Landroid/graphics/Paint;

    .line 392
    .line 393
    move/from16 v18, v7

    .line 394
    .line 395
    const/4 v7, 0x1

    .line 396
    invoke-direct {v5, v7}, Landroid/graphics/Paint;-><init>(I)V

    .line 397
    .line 398
    .line 399
    const/16 v7, 0xe

    .line 400
    .line 401
    int-to-float v7, v7

    .line 402
    mul-float/2addr v7, v12

    .line 403
    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 404
    .line 405
    .line 406
    new-instance v7, Landroid/graphics/Paint;

    .line 407
    .line 408
    const/4 v12, 0x1

    .line 409
    invoke-direct {v7, v12}, Landroid/graphics/Paint;-><init>(I)V

    .line 410
    .line 411
    .line 412
    int-to-float v12, v14

    .line 413
    move/from16 v19, v8

    .line 414
    .line 415
    move/from16 v16, v12

    .line 416
    .line 417
    const/4 v8, 0x2

    .line 418
    int-to-float v12, v8

    .line 419
    mul-float v20, v15, v12

    .line 420
    .line 421
    sub-float v16, v16, v20

    .line 422
    .line 423
    invoke-virtual {v5}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 424
    .line 425
    .line 426
    move-result-object v8

    .line 427
    move/from16 v21, v12

    .line 428
    .line 429
    iget v12, v8, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 430
    .line 431
    iget v8, v8, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 432
    .line 433
    sub-float/2addr v12, v8

    .line 434
    mul-float v8, v19, v21

    .line 435
    .line 436
    add-float/2addr v8, v12

    .line 437
    new-instance v12, Ljava/util/ArrayList;

    .line 438
    .line 439
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 440
    .line 441
    .line 442
    move/from16 v19, v8

    .line 443
    .line 444
    iget-object v8, v1, Lcom/zykj/mistake/feature/ask/c0;->b:Ljava/util/List;

    .line 445
    .line 446
    move/from16 v22, v15

    .line 447
    .line 448
    iget-boolean v15, v1, Lcom/zykj/mistake/feature/ask/c0;->e:Z

    .line 449
    .line 450
    iget-object v1, v1, Lcom/zykj/mistake/feature/ask/c0;->c:Ljava/util/List;

    .line 451
    .line 452
    move/from16 v23, v15

    .line 453
    .line 454
    new-instance v15, Ljava/util/ArrayList;

    .line 455
    .line 456
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 457
    .line 458
    .line 459
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 460
    .line 461
    .line 462
    move-result-object v24

    .line 463
    :goto_5
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->hasNext()Z

    .line 464
    .line 465
    .line 466
    move-result v25

    .line 467
    if-eqz v25, :cond_b

    .line 468
    .line 469
    move/from16 v25, v4

    .line 470
    .line 471
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v4

    .line 475
    move-object/from16 v26, v4

    .line 476
    .line 477
    check-cast v26, Ljava/lang/String;

    .line 478
    .line 479
    invoke-static/range {v26 .. v26}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 480
    .line 481
    .line 482
    move-result v26

    .line 483
    if-nez v26, :cond_a

    .line 484
    .line 485
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    :cond_a
    move/from16 v4, v25

    .line 489
    .line 490
    goto :goto_5

    .line 491
    :cond_b
    move/from16 v25, v4

    .line 492
    .line 493
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 494
    .line 495
    .line 496
    move-result v4

    .line 497
    move/from16 v24, v9

    .line 498
    .line 499
    const/4 v9, 0x0

    .line 500
    :goto_6
    if-ge v9, v4, :cond_10

    .line 501
    .line 502
    invoke-virtual {v15, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v26

    .line 506
    add-int/lit8 v9, v9, 0x1

    .line 507
    .line 508
    move/from16 v27, v4

    .line 509
    .line 510
    move-object/from16 v4, v26

    .line 511
    .line 512
    check-cast v4, Ljava/lang/String;

    .line 513
    .line 514
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 515
    .line 516
    .line 517
    move-result v26

    .line 518
    mul-float v28, v18, v21

    .line 519
    .line 520
    add-float v26, v26, v28

    .line 521
    .line 522
    invoke-static {v12}, Lkotlin/collections/t;->p0(Ljava/util/List;)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v29

    .line 526
    move/from16 v30, v9

    .line 527
    .line 528
    move-object/from16 v9, v29

    .line 529
    .line 530
    check-cast v9, Ljava/util/List;

    .line 531
    .line 532
    if-eqz v9, :cond_d

    .line 533
    .line 534
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 535
    .line 536
    .line 537
    move-result-object v29

    .line 538
    const-wide/16 v31, 0x0

    .line 539
    .line 540
    move-object/from16 v33, v10

    .line 541
    .line 542
    move-object/from16 v34, v11

    .line 543
    .line 544
    move-wide/from16 v10, v31

    .line 545
    .line 546
    :goto_7
    invoke-interface/range {v29 .. v29}, Ljava/util/Iterator;->hasNext()Z

    .line 547
    .line 548
    .line 549
    move-result v31

    .line 550
    if-eqz v31, :cond_c

    .line 551
    .line 552
    invoke-interface/range {v29 .. v29}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v31

    .line 556
    move-object/from16 v32, v15

    .line 557
    .line 558
    move-object/from16 v15, v31

    .line 559
    .line 560
    check-cast v15, Ljava/lang/String;

    .line 561
    .line 562
    invoke-virtual {v5, v15}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 563
    .line 564
    .line 565
    move-result v15

    .line 566
    add-float v15, v15, v28

    .line 567
    .line 568
    add-float v15, v15, v17

    .line 569
    .line 570
    move-object/from16 v31, v2

    .line 571
    .line 572
    move-object/from16 v35, v3

    .line 573
    .line 574
    float-to-double v2, v15

    .line 575
    add-double/2addr v10, v2

    .line 576
    move-object/from16 v2, v31

    .line 577
    .line 578
    move-object/from16 v15, v32

    .line 579
    .line 580
    move-object/from16 v3, v35

    .line 581
    .line 582
    goto :goto_7

    .line 583
    :cond_c
    move-object/from16 v31, v2

    .line 584
    .line 585
    move-object/from16 v35, v3

    .line 586
    .line 587
    move-object/from16 v32, v15

    .line 588
    .line 589
    double-to-float v2, v10

    .line 590
    goto :goto_8

    .line 591
    :cond_d
    move-object/from16 v31, v2

    .line 592
    .line 593
    move-object/from16 v35, v3

    .line 594
    .line 595
    move-object/from16 v33, v10

    .line 596
    .line 597
    move-object/from16 v34, v11

    .line 598
    .line 599
    move-object/from16 v32, v15

    .line 600
    .line 601
    const/4 v2, 0x0

    .line 602
    :goto_8
    if-eqz v9, :cond_f

    .line 603
    .line 604
    add-float v2, v2, v26

    .line 605
    .line 606
    cmpl-float v2, v2, v16

    .line 607
    .line 608
    if-lez v2, :cond_e

    .line 609
    .line 610
    goto :goto_9

    .line 611
    :cond_e
    invoke-interface {v9, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 612
    .line 613
    .line 614
    goto :goto_a

    .line 615
    :cond_f
    :goto_9
    filled-new-array {v4}, [Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v2

    .line 619
    invoke-static {v2}, Lkotlin/collections/u;->A([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 620
    .line 621
    .line 622
    move-result-object v2

    .line 623
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 624
    .line 625
    .line 626
    :goto_a
    move/from16 v4, v27

    .line 627
    .line 628
    move/from16 v9, v30

    .line 629
    .line 630
    move-object/from16 v2, v31

    .line 631
    .line 632
    move-object/from16 v15, v32

    .line 633
    .line 634
    move-object/from16 v10, v33

    .line 635
    .line 636
    move-object/from16 v11, v34

    .line 637
    .line 638
    move-object/from16 v3, v35

    .line 639
    .line 640
    goto/16 :goto_6

    .line 641
    .line 642
    :cond_10
    move-object/from16 v31, v2

    .line 643
    .line 644
    move-object/from16 v35, v3

    .line 645
    .line 646
    move-object/from16 v33, v10

    .line 647
    .line 648
    move-object/from16 v34, v11

    .line 649
    .line 650
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 651
    .line 652
    .line 653
    move-result v2

    .line 654
    const/4 v3, 0x1

    .line 655
    if-ge v2, v3, :cond_11

    .line 656
    .line 657
    move v2, v3

    .line 658
    :cond_11
    int-to-float v2, v2

    .line 659
    mul-float v2, v2, v19

    .line 660
    .line 661
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 662
    .line 663
    .line 664
    move-result v4

    .line 665
    sub-int/2addr v4, v3

    .line 666
    if-gez v4, :cond_12

    .line 667
    .line 668
    const/4 v4, 0x0

    .line 669
    :cond_12
    int-to-float v3, v4

    .line 670
    mul-float v3, v3, v17

    .line 671
    .line 672
    add-float/2addr v3, v2

    .line 673
    mul-float v2, p1, v21

    .line 674
    .line 675
    add-float/2addr v2, v3

    .line 676
    float-to-int v2, v2

    .line 677
    sget-object v3, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 678
    .line 679
    invoke-static {v14, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 680
    .line 681
    .line 682
    move-result-object v2

    .line 683
    const-string v3, "createBitmap(...)"

    .line 684
    .line 685
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    new-instance v3, Landroid/graphics/Canvas;

    .line 689
    .line 690
    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 691
    .line 692
    .line 693
    const/4 v4, -0x1

    .line 694
    invoke-virtual {v3, v4}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 695
    .line 696
    .line 697
    invoke-interface {v8, v1}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 698
    .line 699
    .line 700
    move-result v9

    .line 701
    if-eqz v9, :cond_13

    .line 702
    .line 703
    invoke-interface {v1, v8}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 704
    .line 705
    .line 706
    move-result v1

    .line 707
    if-eqz v1, :cond_13

    .line 708
    .line 709
    const/4 v1, 0x1

    .line 710
    goto :goto_b

    .line 711
    :cond_13
    const/4 v1, 0x0

    .line 712
    :goto_b
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 713
    .line 714
    .line 715
    move-result v8

    .line 716
    move/from16 v9, p1

    .line 717
    .line 718
    const/4 v10, 0x0

    .line 719
    :goto_c
    if-ge v10, v8, :cond_18

    .line 720
    .line 721
    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v11

    .line 725
    add-int/lit8 v10, v10, 0x1

    .line 726
    .line 727
    check-cast v11, Ljava/util/List;

    .line 728
    .line 729
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 730
    .line 731
    .line 732
    move-result-object v11

    .line 733
    move/from16 v14, v22

    .line 734
    .line 735
    :goto_d
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 736
    .line 737
    .line 738
    move-result v15

    .line 739
    if-eqz v15, :cond_17

    .line 740
    .line 741
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v15

    .line 745
    check-cast v15, Ljava/lang/String;

    .line 746
    .line 747
    invoke-virtual {v5, v15}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 748
    .line 749
    .line 750
    move-result v16

    .line 751
    mul-float v26, v18, v21

    .line 752
    .line 753
    add-float v26, v26, v16

    .line 754
    .line 755
    if-nez v23, :cond_14

    .line 756
    .line 757
    const/16 v4, 0xf5

    .line 758
    .line 759
    invoke-static {v4, v4, v4}, Landroid/graphics/Color;->rgb(III)I

    .line 760
    .line 761
    .line 762
    move-result v4

    .line 763
    move/from16 v16, v1

    .line 764
    .line 765
    move/from16 v27, v8

    .line 766
    .line 767
    goto :goto_e

    .line 768
    :cond_14
    const/16 v4, 0xff

    .line 769
    .line 770
    if-eqz v1, :cond_15

    .line 771
    .line 772
    move/from16 v16, v1

    .line 773
    .line 774
    const/16 v1, 0x15

    .line 775
    .line 776
    move/from16 v27, v8

    .line 777
    .line 778
    const/16 v8, 0x76

    .line 779
    .line 780
    invoke-static {v1, v8, v4}, Landroid/graphics/Color;->rgb(III)I

    .line 781
    .line 782
    .line 783
    move-result v4

    .line 784
    goto :goto_e

    .line 785
    :cond_15
    move/from16 v16, v1

    .line 786
    .line 787
    move/from16 v27, v8

    .line 788
    .line 789
    const/16 v1, 0x4d

    .line 790
    .line 791
    const/16 v8, 0x4f

    .line 792
    .line 793
    invoke-static {v4, v1, v8}, Landroid/graphics/Color;->rgb(III)I

    .line 794
    .line 795
    .line 796
    move-result v4

    .line 797
    :goto_e
    invoke-virtual {v7, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 798
    .line 799
    .line 800
    if-eqz v23, :cond_16

    .line 801
    .line 802
    const/4 v1, -0x1

    .line 803
    goto :goto_f

    .line 804
    :cond_16
    const/16 v1, 0x99

    .line 805
    .line 806
    invoke-static {v1, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 807
    .line 808
    .line 809
    move-result v1

    .line 810
    :goto_f
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 811
    .line 812
    .line 813
    new-instance v1, Landroid/graphics/RectF;

    .line 814
    .line 815
    add-float v4, v14, v26

    .line 816
    .line 817
    add-float v8, v9, v19

    .line 818
    .line 819
    invoke-direct {v1, v14, v9, v4, v8}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 820
    .line 821
    .line 822
    invoke-virtual {v3, v1, v6, v6, v7}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 823
    .line 824
    .line 825
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    .line 826
    .line 827
    .line 828
    move-result v1

    .line 829
    invoke-virtual {v5}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 830
    .line 831
    .line 832
    move-result-object v4

    .line 833
    iget v4, v4, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 834
    .line 835
    invoke-virtual {v5}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 836
    .line 837
    .line 838
    move-result-object v8

    .line 839
    iget v8, v8, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 840
    .line 841
    add-float/2addr v4, v8

    .line 842
    const/high16 v8, 0x40000000    # 2.0f

    .line 843
    .line 844
    div-float/2addr v4, v8

    .line 845
    sub-float/2addr v1, v4

    .line 846
    add-float v4, v14, v18

    .line 847
    .line 848
    invoke-virtual {v3, v15, v4, v1, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 849
    .line 850
    .line 851
    add-float v26, v26, v17

    .line 852
    .line 853
    add-float v14, v26, v14

    .line 854
    .line 855
    move/from16 v1, v16

    .line 856
    .line 857
    move/from16 v8, v27

    .line 858
    .line 859
    const/4 v4, -0x1

    .line 860
    goto :goto_d

    .line 861
    :cond_17
    move/from16 v16, v1

    .line 862
    .line 863
    move/from16 v27, v8

    .line 864
    .line 865
    add-float v8, v19, v17

    .line 866
    .line 867
    add-float/2addr v9, v8

    .line 868
    move/from16 v8, v27

    .line 869
    .line 870
    const/4 v4, -0x1

    .line 871
    goto/16 :goto_c

    .line 872
    .line 873
    :cond_18
    move-object/from16 v4, v31

    .line 874
    .line 875
    invoke-virtual {v0, v2, v13, v4}, Lcom/zykj/mistake/utils/c;->f(Landroid/graphics/Bitmap;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object v1

    .line 879
    move-object/from16 v2, v35

    .line 880
    .line 881
    if-ne v1, v2, :cond_19

    .line 882
    .line 883
    goto :goto_11

    .line 884
    :cond_19
    move/from16 v9, v24

    .line 885
    .line 886
    move-object/from16 v10, v33

    .line 887
    .line 888
    move-object v12, v10

    .line 889
    move-object/from16 v11, v34

    .line 890
    .line 891
    :goto_10
    check-cast v1, Ljava/lang/String;

    .line 892
    .line 893
    move-object v3, v12

    .line 894
    move/from16 v7, v25

    .line 895
    .line 896
    const/4 v8, 0x0

    .line 897
    const/4 v12, 0x1

    .line 898
    goto :goto_13

    .line 899
    :cond_1a
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 900
    .line 901
    const-string v2, "Text payload missing"

    .line 902
    .line 903
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 904
    .line 905
    .line 906
    throw v1

    .line 907
    :cond_1b
    move/from16 v25, v4

    .line 908
    .line 909
    move/from16 v24, v9

    .line 910
    .line 911
    move-object/from16 v33, v10

    .line 912
    .line 913
    move-object/from16 v34, v11

    .line 914
    .line 915
    move-object v4, v2

    .line 916
    move-object v2, v3

    .line 917
    iget-object v1, v1, Lcom/zykj/mistake/feature/ask/y;->d:Ljava/lang/String;

    .line 918
    .line 919
    iput-object v14, v4, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$0:Ljava/lang/Object;

    .line 920
    .line 921
    iput-object v14, v4, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$1:Ljava/lang/Object;

    .line 922
    .line 923
    iput-object v14, v4, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$2:Ljava/lang/Object;

    .line 924
    .line 925
    move-object/from16 v3, v33

    .line 926
    .line 927
    iput-object v3, v4, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$3:Ljava/lang/Object;

    .line 928
    .line 929
    move-object/from16 v5, v34

    .line 930
    .line 931
    iput-object v5, v4, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$4:Ljava/lang/Object;

    .line 932
    .line 933
    iput-object v14, v4, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$5:Ljava/lang/Object;

    .line 934
    .line 935
    iput-object v14, v4, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$6:Ljava/lang/Object;

    .line 936
    .line 937
    iput-object v3, v4, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->L$7:Ljava/lang/Object;

    .line 938
    .line 939
    move/from16 v6, v24

    .line 940
    .line 941
    iput v6, v4, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->I$0:I

    .line 942
    .line 943
    move/from16 v7, v25

    .line 944
    .line 945
    iput v7, v4, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->I$1:I

    .line 946
    .line 947
    const/4 v8, 0x0

    .line 948
    iput v8, v4, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->I$2:I

    .line 949
    .line 950
    const/4 v12, 0x1

    .line 951
    iput v12, v4, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolve$1;->label:I

    .line 952
    .line 953
    sget-object v9, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 954
    .line 955
    sget-object v9, Lg7/d;->a:Lg7/d;

    .line 956
    .line 957
    new-instance v10, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;

    .line 958
    .line 959
    invoke-direct {v10, v1, v0, v13, v14}, Lcom/zykj/mistake/utils/AskMaterialImageResolver$resolveImage$2;-><init>(Ljava/lang/String;Lcom/zykj/mistake/utils/c;Ljava/lang/String;Lh6/c;)V

    .line 960
    .line 961
    .line 962
    invoke-static {v9, v10, v4}, Lkotlinx/coroutines/x;->F(Lh6/h;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 963
    .line 964
    .line 965
    move-result-object v1

    .line 966
    if-ne v1, v2, :cond_1c

    .line 967
    .line 968
    :goto_11
    return-object v2

    .line 969
    :cond_1c
    move-object v10, v3

    .line 970
    move-object v11, v5

    .line 971
    move v9, v6

    .line 972
    :goto_12
    check-cast v1, Ljava/lang/String;

    .line 973
    .line 974
    :goto_13
    invoke-interface {v10, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 975
    .line 976
    .line 977
    move-object v10, v3

    .line 978
    move v5, v8

    .line 979
    move v8, v12

    .line 980
    const/4 v6, 0x3

    .line 981
    move-object v3, v2

    .line 982
    move-object v2, v4

    .line 983
    move v4, v7

    .line 984
    const/4 v7, 0x2

    .line 985
    goto/16 :goto_1

    .line 986
    .line 987
    :cond_1d
    move-object v3, v10

    .line 988
    move-object v10, v3

    .line 989
    check-cast v10, Ljava/util/List;

    .line 990
    .line 991
    return-object v10
.end method

.method public final f(Landroid/graphics/Bitmap;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Lcom/zykj/mistake/utils/AskMaterialImageResolver$saveBitmap$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$saveBitmap$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$saveBitmap$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$saveBitmap$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$saveBitmap$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/zykj/mistake/utils/AskMaterialImageResolver$saveBitmap$1;-><init>(Lcom/zykj/mistake/utils/c;Lh6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$saveBitmap$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$saveBitmap$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$saveBitmap$1;->L$1:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Ljava/lang/String;

    .line 39
    .line 40
    iget-object p1, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$saveBitmap$1;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Landroid/graphics/Bitmap;

    .line 43
    .line 44
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    sget-object p3, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 60
    .line 61
    sget-object p3, Lg7/d;->a:Lg7/d;

    .line 62
    .line 63
    new-instance v2, Lcom/zykj/mistake/utils/AskMaterialImageResolver$saveBitmap$2;

    .line 64
    .line 65
    const/4 v4, 0x0

    .line 66
    invoke-direct {v2, p0, p2, p1, v4}, Lcom/zykj/mistake/utils/AskMaterialImageResolver$saveBitmap$2;-><init>(Lcom/zykj/mistake/utils/c;Ljava/lang/String;Landroid/graphics/Bitmap;Lh6/c;)V

    .line 67
    .line 68
    .line 69
    iput-object v4, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$saveBitmap$1;->L$0:Ljava/lang/Object;

    .line 70
    .line 71
    iput-object v4, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$saveBitmap$1;->L$1:Ljava/lang/Object;

    .line 72
    .line 73
    iput v3, v0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$saveBitmap$1;->label:I

    .line 74
    .line 75
    invoke-static {p3, v2, v0}, Lkotlinx/coroutines/x;->F(Lh6/h;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    if-ne p3, v1, :cond_3

    .line 80
    .line 81
    return-object v1

    .line 82
    :cond_3
    :goto_1
    const-string p1, "withContext(...)"

    .line 83
    .line 84
    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-object p3
.end method

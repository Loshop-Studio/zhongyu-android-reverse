# RE note 本类字节码直接引用的读写或显示接口包括文件流、位图。
.class final Lcom/friday/paint/view/six/NewPaintFragment$saveScreenCaptureToPng$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/six/NewPaintFragment;->saveScreenCaptureToPng(Landroid/graphics/Bitmap;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.paint.view.six.NewPaintFragment$saveScreenCaptureToPng$2"
    f = "NewPaintFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Landroid/graphics/Bitmap;

.field public final synthetic g:Lcom/friday/paint/view/six/NewPaintFragment;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$saveScreenCaptureToPng$2;->e:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/view/six/NewPaintFragment$saveScreenCaptureToPng$2;->f:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/paint/view/six/NewPaintFragment$saveScreenCaptureToPng$2;->g:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 4

    .line 1
    new-instance v0, Lcom/friday/paint/view/six/NewPaintFragment$saveScreenCaptureToPng$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$saveScreenCaptureToPng$2;->e:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/friday/paint/view/six/NewPaintFragment$saveScreenCaptureToPng$2;->f:Landroid/graphics/Bitmap;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/friday/paint/view/six/NewPaintFragment$saveScreenCaptureToPng$2;->g:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, Lcom/friday/paint/view/six/NewPaintFragment$saveScreenCaptureToPng$2;-><init>(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lcom/friday/paint/view/six/NewPaintFragment$saveScreenCaptureToPng$2;->d:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$saveScreenCaptureToPng$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$saveScreenCaptureToPng$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/six/NewPaintFragment$saveScreenCaptureToPng$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$saveScreenCaptureToPng$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

# RE I/O 编码位图（Bitmap.compress）。
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$saveScreenCaptureToPng$2;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lsd/i0;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$saveScreenCaptureToPng$2;->c:I

    .line 9
    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$saveScreenCaptureToPng$2;->e:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$saveScreenCaptureToPng$2;->f:Landroid/graphics/Bitmap;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    :try_start_0
    sget-object v2, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 21
    .line 22
    new-instance v2, Ljava/io/File;

    .line 23
    .line 24
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppCachePath()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    new-instance v4, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p1, ".png"

    .line 37
    .line 38
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {v2, v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-nez p1, :cond_0

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    goto :goto_1

    .line 68
    :cond_0
    :goto_0
    new-instance p1, Ljava/io/BufferedOutputStream;

    .line 69
    .line 70
    new-instance v3, Ljava/io/FileOutputStream;

    .line 71
    .line 72
    invoke-direct {v3, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {p1, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    :try_start_1
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 79
    .line 80
    const/16 v4, 0x64

    .line 81
    .line 82
    invoke-virtual {v0, v3, v4, p1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 83
    .line 84
    .line 85
    :try_start_2
    invoke-static {p1, v1}, Lcd/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 96
    goto :goto_2

    .line 97
    :catchall_1
    move-exception v0

    .line 98
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 99
    :catchall_2
    move-exception v2

    .line 100
    :try_start_4
    invoke-static {p1, v0}, Lcd/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 104
    :goto_1
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 105
    .line 106
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    :goto_2
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$saveScreenCaptureToPng$2;->g:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 115
    .line 116
    invoke-static {p1}, Lkotlin/Result;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    if-eqz v2, :cond_1

    .line 121
    .line 122
    invoke-static {v0}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->G()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    new-instance v3, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 137
    .line 138
    .line 139
    const-string v4, "["

    .line 140
    .line 141
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v0, "] \u6dfb\u52a0\u56fe\u7247:\u5c4f\u5e55\u622a\u56fe\u4fdd\u5b58 PNG \u5931\u8d25, "

    .line 148
    .line 149
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :cond_1
    invoke-static {p1}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-eqz v0, :cond_2

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_2
    move-object v1, p1

    .line 174
    :goto_3
    return-object v1

    .line 175
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 176
    .line 177
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 178
    .line 179
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw p1
.end method

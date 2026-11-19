# RE note 本类字节码直接引用的读写或显示接口包括文件流、位图。
.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/u4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/feature/notebook/detail/a5;

.field public final synthetic b:Ljava/io/File;

.field public final synthetic c:Ljava/io/File;

.field public final synthetic d:Landroid/graphics/Bitmap;

.field public final synthetic e:Lcom/zykj/mistake/feature/notebook/detail/f;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/a5;Ljava/io/File;Ljava/io/File;Landroid/graphics/Bitmap;Lcom/zykj/mistake/feature/notebook/detail/f;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/u4;->a:Lcom/zykj/mistake/feature/notebook/detail/a5;

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/u4;->b:Ljava/io/File;

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/u4;->c:Ljava/io/File;

    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/u4;->d:Landroid/graphics/Bitmap;

    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/detail/u4;->e:Lcom/zykj/mistake/feature/notebook/detail/f;

    iput p6, p0, Lcom/zykj/mistake/feature/notebook/detail/u4;->f:I

    return-void
.end method


# virtual methods
# RE I/O 编码位图（Bitmap.compress）。
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/u4;->b:Ljava/io/File;

    .line 2
    .line 3
    iget-object v6, p0, Lcom/zykj/mistake/feature/notebook/detail/u4;->c:Ljava/io/File;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/u4;->d:Landroid/graphics/Bitmap;

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 8
    .line 9
    .line 10
    new-instance v2, Ljava/io/FileOutputStream;

    .line 11
    .line 12
    invoke-direct {v2, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    :try_start_1
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 16
    .line 17
    const/16 v3, 0x5c

    .line 18
    .line 19
    invoke-virtual {v1, v0, v3, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 20
    .line 21
    .line 22
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    :try_start_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string v1, "Save stem snapshot failed"

    .line 42
    .line 43
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 47
    :catchall_1
    move-exception v0

    .line 48
    move-object v1, v0

    .line 49
    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 50
    :catchall_2
    move-exception v0

    .line 51
    :try_start_5
    invoke-static {v2, v1}, Lcoil3/network/g;->e(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 55
    :goto_0
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    :cond_1
    move-object v5, v0

    .line 71
    check-cast v5, Ljava/lang/String;

    .line 72
    .line 73
    if-eqz v5, :cond_3

    .line 74
    .line 75
    invoke-static {v5}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_2
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/u4;->a:Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 83
    .line 84
    iget-object v0, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 85
    .line 86
    if-eqz v0, :cond_3

    .line 87
    .line 88
    new-instance v1, Lcom/zykj/mistake/feature/notebook/detail/v4;

    .line 89
    .line 90
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/u4;->e:Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 91
    .line 92
    iget v4, p0, Lcom/zykj/mistake/feature/notebook/detail/u4;->f:I

    .line 93
    .line 94
    invoke-direct/range {v1 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/v4;-><init>(Lcom/zykj/mistake/feature/notebook/detail/a5;Lcom/zykj/mistake/feature/notebook/detail/f;ILjava/lang/String;Ljava/io/File;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 98
    .line 99
    .line 100
    :cond_3
    :goto_2
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 101
    .line 102
    return-object v0
.end method

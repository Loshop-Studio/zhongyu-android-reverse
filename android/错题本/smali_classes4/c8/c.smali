.class public final Lc8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw0/c;
.implements Lh3/d;
.implements Ly/h;
.implements Lt5/c;


# static fields
.field public static a:Lc8/c;


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lb0/f0;

    .line 2
    .line 3
    invoke-direct {v0}, Lb0/f0;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    new-instance v0, Lio/reactivex/exceptions/OnErrorNotImplementedException;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lio/reactivex/exceptions/OnErrorNotImplementedException;-><init>(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lv7/d;->q(Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public g(Ly/f;)Lcom/bumptech/glide/load/EncodeStrategy;
    .locals 0

    .line 1
    sget-object p1, Lcom/bumptech/glide/load/EncodeStrategy;->SOURCE:Lcom/bumptech/glide/load/EncodeStrategy;

    .line 2
    .line 3
    return-object p1
.end method

.method public s(Ljava/lang/Object;Ljava/io/File;Ly/f;)Z
    .locals 0

    .line 1
    check-cast p1, Lb0/g0;

    .line 2
    .line 3
    invoke-interface {p1}, Lb0/g0;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    .line 8
    .line 9
    :try_start_0
    iget-object p1, p1, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->a:Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;

    .line 10
    .line 11
    iget-object p1, p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Lm0/e;

    .line 14
    .line 15
    iget-object p1, p1, Lm0/e;->a:Lx/d;

    .line 16
    .line 17
    iget-object p1, p1, Lx/d;->d:Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1, p2}, Lv0/a;->b(Ljava/nio/ByteBuffer;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    return p1

    .line 28
    :catch_0
    move-exception p1

    .line 29
    const/4 p2, 0x5

    .line 30
    const-string p3, "GifEncoder"

    .line 31
    .line 32
    invoke-static {p3, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-eqz p2, :cond_0

    .line 37
    .line 38
    const-string p2, "Failed to encode GIF drawable data"

    .line 39
    .line 40
    invoke-static {p3, p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 41
    .line 42
    .line 43
    :cond_0
    const/4 p1, 0x0

    .line 44
    return p1
.end method

.class public final Lb0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/a;
.implements Ln0/a;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lb0/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lb0/g;->a:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 17
    iput-object p1, p0, Lb0/g;->b:Ljava/lang/Object;

    .line 18
    sget-object p1, Ls/d;->o:Ls/d;

    iput-object p1, p0, Lb0/g;->c:Ljava/lang/Object;

    .line 19
    new-instance p1, Lcoil3/i;

    invoke-direct {p1}, Lcoil3/i;-><init>()V

    iput-object p1, p0, Lb0/g;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/os/ParcelFileDescriptor;Ljava/util/ArrayList;Lc0/g;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lb0/g;->a:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const-string v0, "Argument must not be null"

    invoke-static {p3, v0}, Lv7/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    iput-object p3, p0, Lb0/g;->b:Ljava/lang/Object;

    .line 12
    invoke-static {p2, v0}, Lv7/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    iput-object p2, p0, Lb0/g;->c:Ljava/lang/Object;

    .line 14
    new-instance p2, Lz/h;

    invoke-direct {p2, p1}, Lz/h;-><init>(Landroid/os/ParcelFileDescriptor;)V

    iput-object p2, p0, Lb0/g;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/load/engine/c;Lcom/bumptech/glide/request/a;Lb0/w;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lb0/g;->a:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/g;->d:Ljava/lang/Object;

    .line 21
    iput-object p2, p0, Lb0/g;->c:Ljava/lang/Object;

    .line 22
    iput-object p3, p0, Lb0/g;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Ljava/util/ArrayList;Lc0/g;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lb0/g;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const-string v0, "Argument must not be null"

    invoke-static {p3, v0}, Lv7/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iput-object p3, p0, Lb0/g;->c:Ljava/lang/Object;

    .line 6
    invoke-static {p2, v0}, Lv7/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    iput-object p2, p0, Lb0/g;->d:Ljava/lang/Object;

    .line 8
    new-instance p2, Lz/h;

    invoke-direct {p2, p1, p3}, Lz/h;-><init>(Ljava/io/InputStream;Lc0/g;)V

    iput-object p2, p0, Lb0/g;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p3, p0, Lb0/g;->a:I

    iput-object p1, p0, Lb0/g;->b:Ljava/lang/Object;

    iput-object p2, p0, Lb0/g;->c:Ljava/lang/Object;

    iput-object p4, p0, Lb0/g;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final h()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public a(Lb0/g0;Ly/f;)Lb0/g0;
    .locals 2

    .line 1
    invoke-interface {p1}, Lb0/g0;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lb0/g;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Ld2/c;

    .line 14
    .line 15
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, Lb0/g;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lc0/b;

    .line 24
    .line 25
    invoke-static {v0, v1}, Li0/c;->b(Landroid/graphics/Bitmap;Lc0/b;)Li0/c;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v0, p2}, Ld2/c;->a(Lb0/g0;Ly/f;)Lb0/g0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_0
    instance-of v0, v0, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget-object v0, p0, Lb0/g;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ln0/c;

    .line 41
    .line 42
    invoke-virtual {v0, p1, p2}, Ln0/c;->a(Lb0/g0;Ly/f;)Lb0/g0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :cond_1
    const/4 p1, 0x0

    .line 48
    return-object p1
.end method

.method public b()Lcoil3/r;
    .locals 11

    .line 1
    new-instance v0, Lcoil3/q;

    .line 2
    .line 3
    iget-object v1, p0, Lb0/g;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/Context;

    .line 6
    .line 7
    iget-object v2, p0, Lb0/g;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ls/d;

    .line 10
    .line 11
    iget-object v3, p0, Lb0/g;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Lcoil3/i;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v4, Lcoil3/j;

    .line 19
    .line 20
    iget-object v3, v3, Lcoil3/i;->a:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-static {v3}, Lt6/a;->x(Ljava/util/Map;)Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-direct {v4, v3}, Lcoil3/j;-><init>(Ljava/util/Map;)V

    .line 27
    .line 28
    .line 29
    const/16 v3, 0x1fff

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    invoke-static {v2, v5, v4, v3}, Ls/d;->a(Ls/d;Lcoil3/request/CachePolicy;Lcoil3/j;I)Ls/d;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    new-instance v3, Landroidx/navigation/b;

    .line 37
    .line 38
    const/4 v4, 0x4

    .line 39
    invoke-direct {v3, p0, v4}, Landroidx/navigation/b;-><init>(Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    invoke-static {v3}, Lkotlin/a;->b(Lr6/a;)Ld6/e;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    new-instance v4, Lcoil3/m;

    .line 47
    .line 48
    const/4 v5, 0x0

    .line 49
    invoke-direct {v4, v5}, Lcoil3/m;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-static {v4}, Lkotlin/a;->b(Lr6/a;)Ld6/e;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    new-instance v5, Lcoil3/d;

    .line 57
    .line 58
    sget-object v6, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 59
    .line 60
    move-object v7, v6

    .line 61
    move-object v8, v6

    .line 62
    move-object v9, v6

    .line 63
    move-object v10, v6

    .line 64
    invoke-direct/range {v5 .. v10}, Lcoil3/d;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 65
    .line 66
    .line 67
    invoke-direct/range {v0 .. v5}, Lcoil3/q;-><init>(Landroid/content/Context;Ls/d;Ld6/e;Ld6/e;Lcoil3/d;)V

    .line 68
    .line 69
    .line 70
    new-instance v1, Lcoil3/r;

    .line 71
    .line 72
    invoke-direct {v1, v0}, Lcoil3/r;-><init>(Lcoil3/q;)V

    .line 73
    .line 74
    .line 75
    return-object v1
.end method

.method public c(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    iget v0, p0, Lb0/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb0/g;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lz/h;

    .line 9
    .line 10
    invoke-virtual {v0}, Lz/h;->e()Landroid/os/ParcelFileDescriptor;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-static {v0, v1, p1}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :pswitch_0
    iget-object v0, p0, Lb0/g;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lz/h;

    .line 27
    .line 28
    iget-object v0, v0, Lz/h;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lcom/bumptech/glide/load/resource/bitmap/a;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/bitmap/a;->reset()V

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-static {v0, v1, p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1

    .line 41
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method

.method public d()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lb0/g;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/util/Map$Entry;

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v3, ": "

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v2, "\n"

    .line 54
    .line 55
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-static {v0}, Lcom/blankj/utilcode/util/c0;->f(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public f(Lcoil3/k;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lb0/g;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 4
    .line 5
    iget-object v0, p0, Lb0/g;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lcom/zykj/mistake/feature/notebook/detail/a5;->g(Lcom/zykj/mistake/feature/notebook/detail/f;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget-object v1, p1, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Lcom/zykj/mistake/feature/notebook/detail/a5;->d(Lcom/zykj/view/simpleBoard/SimpleBoardView;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p1, v0}, Lcom/zykj/mistake/feature/notebook/detail/a5;->j(Lcom/zykj/mistake/feature/notebook/detail/f;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public g()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 10

    .line 1
    iget v0, p0, Lb0/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb0/g;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/List;

    .line 9
    .line 10
    iget-object v1, p0, Lb0/g;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lz/h;

    .line 13
    .line 14
    iget-object v2, p0, Lb0/g;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lc0/g;

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v4, 0x0

    .line 23
    :goto_0
    if-ge v4, v3, :cond_2

    .line 24
    .line 25
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    check-cast v5, Ly/b;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    :try_start_0
    new-instance v7, Lcom/bumptech/glide/load/resource/bitmap/a;

    .line 33
    .line 34
    new-instance v8, Ljava/io/FileInputStream;

    .line 35
    .line 36
    invoke-virtual {v1}, Lz/h;->e()Landroid/os/ParcelFileDescriptor;

    .line 37
    .line 38
    .line 39
    move-result-object v9

    .line 40
    invoke-virtual {v9}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 41
    .line 42
    .line 43
    move-result-object v9

    .line 44
    invoke-direct {v8, v9}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v7, v8, v2}, Lcom/bumptech/glide/load/resource/bitmap/a;-><init>(Ljava/io/InputStream;Lc0/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 48
    .line 49
    .line 50
    :try_start_1
    invoke-interface {v5, v7}, Ly/b;->b(Ljava/io/InputStream;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 51
    .line 52
    .line 53
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    :try_start_2
    invoke-virtual {v7}, Lcom/bumptech/glide/load/resource/bitmap/a;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 55
    .line 56
    .line 57
    :catch_0
    invoke-virtual {v1}, Lz/h;->e()Landroid/os/ParcelFileDescriptor;

    .line 58
    .line 59
    .line 60
    sget-object v6, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 61
    .line 62
    if-eq v5, v6, :cond_0

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    move-object v6, v7

    .line 70
    goto :goto_1

    .line 71
    :catchall_1
    move-exception v0

    .line 72
    :goto_1
    if-eqz v6, :cond_1

    .line 73
    .line 74
    :try_start_3
    invoke-virtual {v6}, Lcom/bumptech/glide/load/resource/bitmap/a;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 75
    .line 76
    .line 77
    :catch_1
    :cond_1
    invoke-virtual {v1}, Lz/h;->e()Landroid/os/ParcelFileDescriptor;

    .line 78
    .line 79
    .line 80
    throw v0

    .line 81
    :cond_2
    sget-object v5, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 82
    .line 83
    :goto_2
    return-object v5

    .line 84
    :pswitch_0
    iget-object v0, p0, Lb0/g;->d:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Ljava/util/List;

    .line 87
    .line 88
    iget-object v1, p0, Lb0/g;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Lz/h;

    .line 91
    .line 92
    iget-object v1, v1, Lz/h;->b:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v1, Lcom/bumptech/glide/load/resource/bitmap/a;

    .line 95
    .line 96
    invoke-virtual {v1}, Lcom/bumptech/glide/load/resource/bitmap/a;->reset()V

    .line 97
    .line 98
    .line 99
    iget-object v2, p0, Lb0/g;->c:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v2, Lc0/g;

    .line 102
    .line 103
    invoke-static {v0, v1, v2}, Lt6/a;->g(Ljava/util/List;Ljava/io/InputStream;Lc0/g;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    return-object v0

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method

.method public m(Lcoil3/k;)V
    .locals 0

    .line 1
    return-void
.end method

.method public q(Lcoil3/k;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcoil3/o;->j(Lcoil3/k;)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lb0/g;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 8
    .line 9
    iget-object v1, p0, Lb0/g;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/notebook/detail/a5;->g(Lcom/zykj/mistake/feature/notebook/detail/f;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, v1, p1}, Lcom/zykj/mistake/feature/notebook/detail/a5;->l(Lcom/zykj/mistake/feature/notebook/detail/f;Landroid/graphics/Bitmap;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    .line 1
    iget v0, p0, Lb0/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v2, "************* "

    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, Lb0/g;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v2, " Head ****************\n"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object v2, p0, Lb0/g;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    const-string v4, "\n"

    .line 59
    .line 60
    if-eqz v3, :cond_0

    .line 61
    .line 62
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Ljava/util/Map$Entry;

    .line 67
    .line 68
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    check-cast v5, Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v5, ": "

    .line 78
    .line 79
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    check-cast v3, Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    const-string v2, "Rom Info           : "

    .line 96
    .line 97
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string/jumbo v2, "unknown"

    .line 101
    .line 102
    .line 103
    sget-object v3, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 104
    .line 105
    const-string v5, ""

    .line 106
    .line 107
    const/4 v6, 0x0

    .line 108
    if-eqz v3, :cond_1

    .line 109
    .line 110
    goto/16 :goto_4

    .line 111
    .line 112
    :cond_1
    new-instance v3, Landroid/support/v4/media/h;

    .line 113
    .line 114
    const/4 v7, 0x7

    .line 115
    const/4 v8, 0x0

    .line 116
    invoke-direct {v3, v7, v8}, Landroid/support/v4/media/h;-><init>(IZ)V

    .line 117
    .line 118
    .line 119
    sput-object v3, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 120
    .line 121
    :try_start_0
    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    if-nez v7, :cond_2

    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    goto :goto_1

    .line 134
    :catchall_0
    :cond_2
    move-object v3, v2

    .line 135
    :goto_1
    :try_start_1
    sget-object v7, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    if-nez v8, :cond_3

    .line 142
    .line 143
    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 147
    :catchall_1
    :cond_3
    sget-object v7, Lcom/blankj/utilcode/util/c;->b:[Ljava/lang/String;

    .line 148
    .line 149
    invoke-static {v3, v7, v2}, Lcom/blankj/utilcode/util/c;->k(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 150
    .line 151
    .line 152
    move-result v8

    .line 153
    if-eqz v8, :cond_5

    .line 154
    .line 155
    sget-object v2, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 156
    .line 157
    aget-object v3, v7, v6

    .line 158
    .line 159
    iput-object v3, v2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 160
    .line 161
    const-string/jumbo v2, "ro.build.version.emui"

    .line 162
    .line 163
    .line 164
    invoke-static {v2}, Lcom/blankj/utilcode/util/c;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    const-string v3, "_"

    .line 169
    .line 170
    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    array-length v7, v3

    .line 175
    const/4 v8, 0x1

    .line 176
    if-le v7, v8, :cond_4

    .line 177
    .line 178
    sget-object v2, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 179
    .line 180
    aget-object v3, v3, v8

    .line 181
    .line 182
    iput-object v3, v2, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_4
    sget-object v3, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 186
    .line 187
    iput-object v2, v3, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 188
    .line 189
    :goto_2
    sget-object v3, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 190
    .line 191
    goto/16 :goto_4

    .line 192
    .line 193
    :cond_5
    sget-object v7, Lcom/blankj/utilcode/util/c;->c:[Ljava/lang/String;

    .line 194
    .line 195
    invoke-static {v3, v7, v2}, Lcom/blankj/utilcode/util/c;->k(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 196
    .line 197
    .line 198
    move-result v8

    .line 199
    if-eqz v8, :cond_6

    .line 200
    .line 201
    sget-object v2, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 202
    .line 203
    aget-object v3, v7, v6

    .line 204
    .line 205
    iput-object v3, v2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 206
    .line 207
    const-string/jumbo v3, "ro.vivo.os.build.display.id"

    .line 208
    .line 209
    .line 210
    invoke-static {v3}, Lcom/blankj/utilcode/util/c;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    iput-object v3, v2, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 215
    .line 216
    sget-object v3, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 217
    .line 218
    goto/16 :goto_4

    .line 219
    .line 220
    :cond_6
    sget-object v7, Lcom/blankj/utilcode/util/c;->d:[Ljava/lang/String;

    .line 221
    .line 222
    invoke-static {v3, v7, v2}, Lcom/blankj/utilcode/util/c;->k(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 223
    .line 224
    .line 225
    move-result v8

    .line 226
    if-eqz v8, :cond_7

    .line 227
    .line 228
    sget-object v2, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 229
    .line 230
    aget-object v3, v7, v6

    .line 231
    .line 232
    iput-object v3, v2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 233
    .line 234
    const-string/jumbo v3, "ro.build.version.incremental"

    .line 235
    .line 236
    .line 237
    invoke-static {v3}, Lcom/blankj/utilcode/util/c;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    iput-object v3, v2, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 242
    .line 243
    sget-object v3, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 244
    .line 245
    goto/16 :goto_4

    .line 246
    .line 247
    :cond_7
    sget-object v7, Lcom/blankj/utilcode/util/c;->e:[Ljava/lang/String;

    .line 248
    .line 249
    invoke-static {v3, v7, v2}, Lcom/blankj/utilcode/util/c;->k(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 250
    .line 251
    .line 252
    move-result v8

    .line 253
    if-eqz v8, :cond_8

    .line 254
    .line 255
    sget-object v2, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 256
    .line 257
    aget-object v3, v7, v6

    .line 258
    .line 259
    iput-object v3, v2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 260
    .line 261
    const-string/jumbo v3, "ro.build.version.opporom"

    .line 262
    .line 263
    .line 264
    invoke-static {v3}, Lcom/blankj/utilcode/util/c;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    iput-object v3, v2, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 269
    .line 270
    sget-object v3, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 271
    .line 272
    goto/16 :goto_4

    .line 273
    .line 274
    :cond_8
    sget-object v7, Lcom/blankj/utilcode/util/c;->f:[Ljava/lang/String;

    .line 275
    .line 276
    invoke-static {v3, v7, v2}, Lcom/blankj/utilcode/util/c;->k(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 277
    .line 278
    .line 279
    move-result v8

    .line 280
    if-eqz v8, :cond_9

    .line 281
    .line 282
    sget-object v2, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 283
    .line 284
    aget-object v3, v7, v6

    .line 285
    .line 286
    iput-object v3, v2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 287
    .line 288
    const-string/jumbo v3, "ro.letv.release.version"

    .line 289
    .line 290
    .line 291
    invoke-static {v3}, Lcom/blankj/utilcode/util/c;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    iput-object v3, v2, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 296
    .line 297
    sget-object v3, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 298
    .line 299
    goto/16 :goto_4

    .line 300
    .line 301
    :cond_9
    sget-object v7, Lcom/blankj/utilcode/util/c;->g:[Ljava/lang/String;

    .line 302
    .line 303
    invoke-static {v3, v7, v2}, Lcom/blankj/utilcode/util/c;->k(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 304
    .line 305
    .line 306
    move-result v8

    .line 307
    if-eqz v8, :cond_a

    .line 308
    .line 309
    sget-object v2, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 310
    .line 311
    aget-object v3, v7, v6

    .line 312
    .line 313
    iput-object v3, v2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 314
    .line 315
    const-string/jumbo v3, "ro.build.uiversion"

    .line 316
    .line 317
    .line 318
    invoke-static {v3}, Lcom/blankj/utilcode/util/c;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    iput-object v3, v2, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 323
    .line 324
    sget-object v3, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 325
    .line 326
    goto/16 :goto_4

    .line 327
    .line 328
    :cond_a
    sget-object v7, Lcom/blankj/utilcode/util/c;->h:[Ljava/lang/String;

    .line 329
    .line 330
    invoke-static {v3, v7, v2}, Lcom/blankj/utilcode/util/c;->k(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 331
    .line 332
    .line 333
    move-result v8

    .line 334
    if-eqz v8, :cond_b

    .line 335
    .line 336
    sget-object v2, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 337
    .line 338
    aget-object v3, v7, v6

    .line 339
    .line 340
    iput-object v3, v2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 341
    .line 342
    const-string/jumbo v3, "ro.build.MiFavor_version"

    .line 343
    .line 344
    .line 345
    invoke-static {v3}, Lcom/blankj/utilcode/util/c;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    iput-object v3, v2, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 350
    .line 351
    sget-object v3, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 352
    .line 353
    goto/16 :goto_4

    .line 354
    .line 355
    :cond_b
    sget-object v7, Lcom/blankj/utilcode/util/c;->i:[Ljava/lang/String;

    .line 356
    .line 357
    invoke-static {v3, v7, v2}, Lcom/blankj/utilcode/util/c;->k(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 358
    .line 359
    .line 360
    move-result v8

    .line 361
    if-eqz v8, :cond_c

    .line 362
    .line 363
    sget-object v2, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 364
    .line 365
    aget-object v3, v7, v6

    .line 366
    .line 367
    iput-object v3, v2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 368
    .line 369
    const-string/jumbo v3, "ro.rom.version"

    .line 370
    .line 371
    .line 372
    invoke-static {v3}, Lcom/blankj/utilcode/util/c;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    iput-object v3, v2, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 377
    .line 378
    sget-object v3, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 379
    .line 380
    goto/16 :goto_4

    .line 381
    .line 382
    :cond_c
    sget-object v7, Lcom/blankj/utilcode/util/c;->j:[Ljava/lang/String;

    .line 383
    .line 384
    invoke-static {v3, v7, v2}, Lcom/blankj/utilcode/util/c;->k(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 385
    .line 386
    .line 387
    move-result v8

    .line 388
    if-eqz v8, :cond_d

    .line 389
    .line 390
    sget-object v2, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 391
    .line 392
    aget-object v3, v7, v6

    .line 393
    .line 394
    iput-object v3, v2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 395
    .line 396
    const-string/jumbo v3, "ro.build.rom.id"

    .line 397
    .line 398
    .line 399
    invoke-static {v3}, Lcom/blankj/utilcode/util/c;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v3

    .line 403
    iput-object v3, v2, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 404
    .line 405
    sget-object v3, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 406
    .line 407
    goto/16 :goto_4

    .line 408
    .line 409
    :cond_d
    sget-object v7, Lcom/blankj/utilcode/util/c;->k:[Ljava/lang/String;

    .line 410
    .line 411
    invoke-static {v3, v7, v2}, Lcom/blankj/utilcode/util/c;->k(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 412
    .line 413
    .line 414
    move-result v8

    .line 415
    if-eqz v8, :cond_e

    .line 416
    .line 417
    sget-object v2, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 418
    .line 419
    aget-object v3, v7, v6

    .line 420
    .line 421
    iput-object v3, v2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 422
    .line 423
    goto/16 :goto_3

    .line 424
    .line 425
    :cond_e
    sget-object v7, Lcom/blankj/utilcode/util/c;->l:[Ljava/lang/String;

    .line 426
    .line 427
    invoke-static {v3, v7, v2}, Lcom/blankj/utilcode/util/c;->k(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 428
    .line 429
    .line 430
    move-result v8

    .line 431
    if-eqz v8, :cond_f

    .line 432
    .line 433
    sget-object v2, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 434
    .line 435
    aget-object v3, v7, v6

    .line 436
    .line 437
    iput-object v3, v2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 438
    .line 439
    goto/16 :goto_3

    .line 440
    .line 441
    :cond_f
    sget-object v7, Lcom/blankj/utilcode/util/c;->m:[Ljava/lang/String;

    .line 442
    .line 443
    invoke-static {v3, v7, v2}, Lcom/blankj/utilcode/util/c;->k(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 444
    .line 445
    .line 446
    move-result v8

    .line 447
    if-eqz v8, :cond_10

    .line 448
    .line 449
    sget-object v2, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 450
    .line 451
    aget-object v3, v7, v6

    .line 452
    .line 453
    iput-object v3, v2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 454
    .line 455
    goto/16 :goto_3

    .line 456
    .line 457
    :cond_10
    sget-object v7, Lcom/blankj/utilcode/util/c;->n:[Ljava/lang/String;

    .line 458
    .line 459
    invoke-static {v3, v7, v2}, Lcom/blankj/utilcode/util/c;->k(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 460
    .line 461
    .line 462
    move-result v8

    .line 463
    if-eqz v8, :cond_11

    .line 464
    .line 465
    sget-object v2, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 466
    .line 467
    aget-object v3, v7, v6

    .line 468
    .line 469
    iput-object v3, v2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 470
    .line 471
    goto/16 :goto_3

    .line 472
    .line 473
    :cond_11
    sget-object v7, Lcom/blankj/utilcode/util/c;->o:[Ljava/lang/String;

    .line 474
    .line 475
    invoke-static {v3, v7, v2}, Lcom/blankj/utilcode/util/c;->k(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 476
    .line 477
    .line 478
    move-result v8

    .line 479
    if-eqz v8, :cond_12

    .line 480
    .line 481
    sget-object v2, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 482
    .line 483
    aget-object v3, v7, v6

    .line 484
    .line 485
    iput-object v3, v2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 486
    .line 487
    goto :goto_3

    .line 488
    :cond_12
    sget-object v7, Lcom/blankj/utilcode/util/c;->p:[Ljava/lang/String;

    .line 489
    .line 490
    invoke-static {v3, v7, v2}, Lcom/blankj/utilcode/util/c;->k(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 491
    .line 492
    .line 493
    move-result v8

    .line 494
    if-eqz v8, :cond_13

    .line 495
    .line 496
    sget-object v2, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 497
    .line 498
    aget-object v3, v7, v6

    .line 499
    .line 500
    iput-object v3, v2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 501
    .line 502
    goto :goto_3

    .line 503
    :cond_13
    sget-object v7, Lcom/blankj/utilcode/util/c;->q:[Ljava/lang/String;

    .line 504
    .line 505
    invoke-static {v3, v7, v2}, Lcom/blankj/utilcode/util/c;->k(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 506
    .line 507
    .line 508
    move-result v8

    .line 509
    if-eqz v8, :cond_14

    .line 510
    .line 511
    sget-object v2, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 512
    .line 513
    aget-object v3, v7, v6

    .line 514
    .line 515
    iput-object v3, v2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 516
    .line 517
    goto :goto_3

    .line 518
    :cond_14
    sget-object v7, Lcom/blankj/utilcode/util/c;->r:[Ljava/lang/String;

    .line 519
    .line 520
    invoke-static {v3, v7, v2}, Lcom/blankj/utilcode/util/c;->k(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 521
    .line 522
    .line 523
    move-result v8

    .line 524
    if-eqz v8, :cond_15

    .line 525
    .line 526
    sget-object v2, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 527
    .line 528
    aget-object v3, v7, v6

    .line 529
    .line 530
    iput-object v3, v2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 531
    .line 532
    goto :goto_3

    .line 533
    :cond_15
    sget-object v7, Lcom/blankj/utilcode/util/c;->s:[Ljava/lang/String;

    .line 534
    .line 535
    invoke-static {v3, v7, v2}, Lcom/blankj/utilcode/util/c;->k(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 536
    .line 537
    .line 538
    move-result v8

    .line 539
    if-eqz v8, :cond_16

    .line 540
    .line 541
    sget-object v2, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 542
    .line 543
    aget-object v3, v7, v6

    .line 544
    .line 545
    iput-object v3, v2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 546
    .line 547
    goto :goto_3

    .line 548
    :cond_16
    sget-object v7, Lcom/blankj/utilcode/util/c;->t:[Ljava/lang/String;

    .line 549
    .line 550
    invoke-static {v3, v7, v2}, Lcom/blankj/utilcode/util/c;->k(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 551
    .line 552
    .line 553
    move-result v8

    .line 554
    if-eqz v8, :cond_17

    .line 555
    .line 556
    sget-object v2, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 557
    .line 558
    aget-object v3, v7, v6

    .line 559
    .line 560
    iput-object v3, v2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 561
    .line 562
    goto :goto_3

    .line 563
    :cond_17
    sget-object v7, Lcom/blankj/utilcode/util/c;->u:[Ljava/lang/String;

    .line 564
    .line 565
    invoke-static {v3, v7, v2}, Lcom/blankj/utilcode/util/c;->k(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 566
    .line 567
    .line 568
    move-result v3

    .line 569
    if-eqz v3, :cond_18

    .line 570
    .line 571
    sget-object v2, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 572
    .line 573
    aget-object v3, v7, v6

    .line 574
    .line 575
    iput-object v3, v2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 576
    .line 577
    goto :goto_3

    .line 578
    :cond_18
    sget-object v3, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 579
    .line 580
    iput-object v2, v3, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 581
    .line 582
    :goto_3
    sget-object v2, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 583
    .line 584
    invoke-static {v5}, Lcom/blankj/utilcode/util/c;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object v3

    .line 588
    iput-object v3, v2, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 589
    .line 590
    sget-object v3, Lcom/blankj/utilcode/util/c;->v:Landroid/support/v4/media/h;

    .line 591
    .line 592
    :goto_4
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 593
    .line 594
    .line 595
    const-string v2, "\nDevice Manufacturer: "

    .line 596
    .line 597
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 601
    .line 602
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 603
    .line 604
    .line 605
    const-string v2, "\nDevice Model       : "

    .line 606
    .line 607
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 608
    .line 609
    .line 610
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 611
    .line 612
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 613
    .line 614
    .line 615
    const-string v2, "\nAndroid Version    : "

    .line 616
    .line 617
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 621
    .line 622
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    const-string v2, "\nAndroid SDK        : "

    .line 626
    .line 627
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 628
    .line 629
    .line 630
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 631
    .line 632
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 633
    .line 634
    .line 635
    const-string v2, "\nApp VersionName    : "

    .line 636
    .line 637
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 638
    .line 639
    .line 640
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    .line 641
    .line 642
    .line 643
    move-result-object v2

    .line 644
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v2

    .line 648
    invoke-static {v2}, Lcom/blankj/utilcode/util/c0;->f(Ljava/lang/String;)Z

    .line 649
    .line 650
    .line 651
    move-result v3

    .line 652
    if-eqz v3, :cond_19

    .line 653
    .line 654
    goto :goto_5

    .line 655
    :cond_19
    :try_start_2
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    .line 656
    .line 657
    .line 658
    move-result-object v3

    .line 659
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 660
    .line 661
    .line 662
    move-result-object v3

    .line 663
    invoke-virtual {v3, v2, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 664
    .line 665
    .line 666
    move-result-object v2

    .line 667
    if-nez v2, :cond_1a

    .line 668
    .line 669
    goto :goto_5

    .line 670
    :cond_1a
    iget-object v5, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    .line 671
    .line 672
    goto :goto_5

    .line 673
    :catch_0
    move-exception v2

    .line 674
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 675
    .line 676
    .line 677
    :goto_5
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 678
    .line 679
    .line 680
    const-string v2, "\nApp VersionCode    : "

    .line 681
    .line 682
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 683
    .line 684
    .line 685
    invoke-static {}, Lcom/blankj/utilcode/util/c;->e()I

    .line 686
    .line 687
    .line 688
    move-result v2

    .line 689
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual {p0}, Lb0/g;->d()Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v2

    .line 699
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 700
    .line 701
    .line 702
    invoke-static {v0, v1, v4}, Landroid/support/v4/media/f;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    return-object v0

    .line 707
    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 708
    .line 709
    const-string v1, "process: "

    .line 710
    .line 711
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    iget-object v1, p0, Lb0/g;->c:Ljava/lang/Object;

    .line 715
    .line 716
    check-cast v1, Ljava/lang/String;

    .line 717
    .line 718
    if-nez v1, :cond_1b

    .line 719
    .line 720
    const-string v1, ""

    .line 721
    .line 722
    goto :goto_6

    .line 723
    :cond_1b
    const-string v2, ":"

    .line 724
    .line 725
    const-string v3, "_"

    .line 726
    .line 727
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v1

    .line 731
    :goto_6
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 732
    .line 733
    .line 734
    sget-object v1, Lcom/blankj/utilcode/util/g;->b:Ljava/lang/String;

    .line 735
    .line 736
    const-string v2, "logSwitch: true"

    .line 737
    .line 738
    const-string v3, "consoleSwitch: true"

    .line 739
    .line 740
    invoke-static {v0, v1, v2, v1, v3}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 741
    .line 742
    .line 743
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 744
    .line 745
    .line 746
    const-string/jumbo v2, "tag: "

    .line 747
    .line 748
    .line 749
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 750
    .line 751
    .line 752
    invoke-virtual {p0}, Lb0/g;->e()Ljava/lang/String;

    .line 753
    .line 754
    .line 755
    const-string v2, "null"

    .line 756
    .line 757
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 758
    .line 759
    .line 760
    const-string v2, "headSwitch: true"

    .line 761
    .line 762
    const-string v3, "fileSwitch: false"

    .line 763
    .line 764
    invoke-static {v0, v1, v2, v1, v3}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 768
    .line 769
    .line 770
    const-string v2, "dir: "

    .line 771
    .line 772
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 773
    .line 774
    .line 775
    iget-object v2, p0, Lb0/g;->b:Ljava/lang/Object;

    .line 776
    .line 777
    check-cast v2, Ljava/lang/String;

    .line 778
    .line 779
    const-string v3, "filePrefix: util"

    .line 780
    .line 781
    invoke-static {v0, v2, v1, v3, v1}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    const-string v2, "borderSwitch: true"

    .line 785
    .line 786
    const-string/jumbo v3, "singleTagSwitch: true"

    .line 787
    .line 788
    .line 789
    invoke-static {v0, v2, v1, v3, v1}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 790
    .line 791
    .line 792
    const-string v2, "consoleFilter: "

    .line 793
    .line 794
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 795
    .line 796
    .line 797
    sget-object v2, Lcom/blankj/utilcode/util/g;->a:[C

    .line 798
    .line 799
    const/4 v3, 0x0

    .line 800
    aget-char v4, v2, v3

    .line 801
    .line 802
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 803
    .line 804
    .line 805
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 806
    .line 807
    .line 808
    const-string v4, "fileFilter: "

    .line 809
    .line 810
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 811
    .line 812
    .line 813
    aget-char v2, v2, v3

    .line 814
    .line 815
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 816
    .line 817
    .line 818
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 819
    .line 820
    .line 821
    const-string/jumbo v2, "stackDeep: 1"

    .line 822
    .line 823
    .line 824
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 825
    .line 826
    .line 827
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 828
    .line 829
    .line 830
    const-string/jumbo v2, "stackOffset: 0"

    .line 831
    .line 832
    .line 833
    const-string/jumbo v3, "saveDays: -1"

    .line 834
    .line 835
    .line 836
    invoke-static {v0, v2, v1, v3, v1}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 837
    .line 838
    .line 839
    const-string v2, "formatter: "

    .line 840
    .line 841
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 842
    .line 843
    .line 844
    sget-object v2, Lcom/blankj/utilcode/util/g;->e:Landroidx/collection/SimpleArrayMap;

    .line 845
    .line 846
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 847
    .line 848
    .line 849
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 850
    .line 851
    .line 852
    const-string v2, "fileWriter: null"

    .line 853
    .line 854
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 855
    .line 856
    .line 857
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 858
    .line 859
    .line 860
    const-string v2, "onConsoleOutputListener: null"

    .line 861
    .line 862
    const-string v3, "onFileOutputListener: null"

    .line 863
    .line 864
    invoke-static {v0, v2, v1, v3, v1}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 865
    .line 866
    .line 867
    const-string v1, "fileExtraHeader: "

    .line 868
    .line 869
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 870
    .line 871
    .line 872
    iget-object v1, p0, Lb0/g;->d:Ljava/lang/Object;

    .line 873
    .line 874
    check-cast v1, Lb0/g;

    .line 875
    .line 876
    invoke-virtual {v1}, Lb0/g;->d()Ljava/lang/String;

    .line 877
    .line 878
    .line 879
    move-result-object v1

    .line 880
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 881
    .line 882
    .line 883
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 884
    .line 885
    .line 886
    move-result-object v0

    .line 887
    return-object v0

    .line 888
    nop

    .line 889
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

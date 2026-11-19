.class public abstract Lcom/bumptech/glide/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/bumptech/glide/b;Ljava/util/List;Lx0/a;)Lcom/bumptech/glide/Registry;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/bumptech/glide/b;->f()Lk0/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/bumptech/glide/b;->e()Lk0/b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Lcom/bumptech/glide/b;->i()Lcom/bumptech/glide/d;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {p0}, Lcom/bumptech/glide/b;->i()Lcom/bumptech/glide/d;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3}, Lcom/bumptech/glide/d;->g()Lcom/bumptech/glide/e;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    new-instance v4, Lcom/bumptech/glide/Registry;

    .line 26
    .line 27
    invoke-direct {v4}, Lcom/bumptech/glide/Registry;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v4, v0, v1, v3}, Lcom/bumptech/glide/f;->b(Landroid/content/Context;Lcom/bumptech/glide/Registry;Lk0/d;Lk0/b;Lcom/bumptech/glide/e;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2, p0, v4, p1, p2}, Lcom/bumptech/glide/f;->c(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/Registry;Ljava/util/List;Lx0/a;)V

    .line 34
    .line 35
    .line 36
    return-object v4
.end method

.method public static b(Landroid/content/Context;Lcom/bumptech/glide/Registry;Lk0/d;Lk0/b;Lcom/bumptech/glide/e;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 1
    new-instance v4, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser;

    invoke-direct {v4}, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser;-><init>()V

    invoke-virtual {v1, v4}, Lcom/bumptech/glide/Registry;->o(Lcom/bumptech/glide/load/ImageHeaderParser;)Lcom/bumptech/glide/Registry;

    .line 2
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1b

    if-lt v4, v5, :cond_0

    .line 3
    new-instance v5, Lq0/q;

    invoke-direct {v5}, Lq0/q;-><init>()V

    invoke-virtual {v1, v5}, Lcom/bumptech/glide/Registry;->o(Lcom/bumptech/glide/load/ImageHeaderParser;)Lcom/bumptech/glide/Registry;

    .line 4
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    .line 5
    invoke-virtual {v1}, Lcom/bumptech/glide/Registry;->g()Ljava/util/List;

    move-result-object v6

    .line 6
    new-instance v7, Lu0/a;

    invoke-direct {v7, v0, v6, v2, v3}, Lu0/a;-><init>(Landroid/content/Context;Ljava/util/List;Lk0/d;Lk0/b;)V

    .line 7
    invoke-static {v2}, Lcom/bumptech/glide/load/resource/bitmap/VideoDecoder;->m(Lk0/d;)Lh0/f;

    move-result-object v8

    .line 8
    new-instance v9, Lcom/bumptech/glide/load/resource/bitmap/a;

    .line 9
    invoke-virtual {v1}, Lcom/bumptech/glide/Registry;->g()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v11

    invoke-direct {v9, v10, v11, v2, v3}, Lcom/bumptech/glide/load/resource/bitmap/a;-><init>(Ljava/util/List;Landroid/util/DisplayMetrics;Lk0/d;Lk0/b;)V

    const/16 v10, 0x1c

    if-lt v4, v10, :cond_1

    .line 10
    const-class v11, Lcom/bumptech/glide/c$b;

    move-object/from16 v12, p4

    .line 11
    invoke-virtual {v12, v11}, Lcom/bumptech/glide/e;->a(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_1

    .line 12
    new-instance v11, Lq0/t;

    invoke-direct {v11}, Lq0/t;-><init>()V

    .line 13
    new-instance v12, Lq0/i;

    invoke-direct {v12}, Lq0/i;-><init>()V

    goto :goto_0

    .line 14
    :cond_1
    new-instance v12, Lq0/h;

    invoke-direct {v12, v9}, Lq0/h;-><init>(Lcom/bumptech/glide/load/resource/bitmap/a;)V

    .line 15
    new-instance v11, Lcom/bumptech/glide/load/resource/bitmap/c;

    invoke-direct {v11, v9, v3}, Lcom/bumptech/glide/load/resource/bitmap/c;-><init>(Lcom/bumptech/glide/load/resource/bitmap/a;Lk0/b;)V

    .line 16
    :goto_0
    const-string v13, "Animation"

    const-class v14, Ljava/nio/ByteBuffer;

    const-class v15, Landroid/graphics/drawable/Drawable;

    move-object/from16 v16, v7

    const-class v7, Ljava/io/InputStream;

    if-lt v4, v10, :cond_2

    .line 17
    invoke-static {v6, v3}, Ls0/g;->f(Ljava/util/List;Lk0/b;)Lh0/f;

    move-result-object v10

    .line 18
    invoke-virtual {v1, v13, v7, v15, v10}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/f;)Lcom/bumptech/glide/Registry;

    .line 19
    invoke-static {v6, v3}, Ls0/g;->a(Ljava/util/List;Lk0/b;)Lh0/f;

    move-result-object v10

    .line 20
    invoke-virtual {v1, v13, v14, v15, v10}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/f;)Lcom/bumptech/glide/Registry;

    .line 21
    :cond_2
    new-instance v10, Ls0/k;

    invoke-direct {v10, v0}, Ls0/k;-><init>(Landroid/content/Context;)V

    move/from16 v17, v4

    .line 22
    new-instance v4, Lq0/c;

    invoke-direct {v4, v3}, Lq0/c;-><init>(Lk0/b;)V

    .line 23
    new-instance v0, Lv0/a;

    invoke-direct {v0}, Lv0/a;-><init>()V

    move-object/from16 p4, v0

    .line 24
    new-instance v0, Lv0/d;

    invoke-direct {v0}, Lv0/d;-><init>()V

    move-object/from16 v18, v0

    .line 25
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object/from16 v19, v0

    .line 26
    new-instance v0, Ln0/c;

    invoke-direct {v0}, Ln0/c;-><init>()V

    .line 27
    invoke-virtual {v1, v14, v0}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Lh0/a;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    move-object/from16 v20, v10

    new-instance v10, Ln0/u;

    invoke-direct {v10, v3}, Ln0/u;-><init>(Lk0/b;)V

    .line 28
    invoke-virtual {v0, v7, v10}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Lh0/a;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    .line 29
    const-string v10, "Bitmap"

    move-object/from16 v21, v15

    const-class v15, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v10, v14, v15, v12}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/f;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    .line 30
    invoke-virtual {v0, v10, v7, v15, v11}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/f;)Lcom/bumptech/glide/Registry;

    .line 31
    invoke-static {}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;->b()Z

    move-result v0

    move/from16 v22, v0

    const-class v0, Landroid/os/ParcelFileDescriptor;

    if-eqz v22, :cond_3

    move-object/from16 v22, v13

    .line 32
    new-instance v13, Lq0/v;

    invoke-direct {v13, v9}, Lq0/v;-><init>(Lcom/bumptech/glide/load/resource/bitmap/a;)V

    invoke-virtual {v1, v10, v0, v15, v13}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/f;)Lcom/bumptech/glide/Registry;

    goto :goto_1

    :cond_3
    move-object/from16 v22, v13

    .line 33
    :goto_1
    invoke-static {v2}, Lcom/bumptech/glide/load/resource/bitmap/VideoDecoder;->c(Lk0/d;)Lh0/f;

    move-result-object v9

    .line 34
    const-class v13, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {v1, v10, v13, v15, v9}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/f;)Lcom/bumptech/glide/Registry;

    .line 35
    invoke-virtual {v1, v10, v0, v15, v8}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/f;)Lcom/bumptech/glide/Registry;

    move-result-object v9

    move-object/from16 v23, v13

    .line 36
    invoke-static {}, Ln0/w$a;->a()Ln0/w$a;

    move-result-object v13

    invoke-virtual {v9, v15, v15, v13}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v9

    new-instance v13, Lq0/z;

    invoke-direct {v13}, Lq0/z;-><init>()V

    .line 37
    invoke-virtual {v9, v10, v15, v15, v13}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/f;)Lcom/bumptech/glide/Registry;

    move-result-object v9

    .line 38
    invoke-virtual {v9, v15, v4}, Lcom/bumptech/glide/Registry;->b(Ljava/lang/Class;Lh0/g;)Lcom/bumptech/glide/Registry;

    move-result-object v9

    new-instance v13, Lq0/a;

    invoke-direct {v13, v5, v12}, Lq0/a;-><init>(Landroid/content/res/Resources;Lh0/f;)V

    .line 39
    const-string v12, "BitmapDrawable"

    const-class v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v9, v12, v14, v1, v13}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/f;)Lcom/bumptech/glide/Registry;

    move-result-object v9

    new-instance v13, Lq0/a;

    invoke-direct {v13, v5, v11}, Lq0/a;-><init>(Landroid/content/res/Resources;Lh0/f;)V

    .line 40
    invoke-virtual {v9, v12, v7, v1, v13}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/f;)Lcom/bumptech/glide/Registry;

    move-result-object v9

    new-instance v11, Lq0/a;

    invoke-direct {v11, v5, v8}, Lq0/a;-><init>(Landroid/content/res/Resources;Lh0/f;)V

    .line 41
    invoke-virtual {v9, v12, v0, v1, v11}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/f;)Lcom/bumptech/glide/Registry;

    move-result-object v8

    new-instance v9, Lq0/b;

    invoke-direct {v9, v2, v4}, Lq0/b;-><init>(Lk0/d;Lh0/g;)V

    .line 42
    invoke-virtual {v8, v1, v9}, Lcom/bumptech/glide/Registry;->b(Ljava/lang/Class;Lh0/g;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    new-instance v8, Lu0/h;

    move-object/from16 v9, v16

    invoke-direct {v8, v6, v9, v3}, Lu0/h;-><init>(Ljava/util/List;Lh0/f;Lk0/b;)V

    .line 43
    const-class v6, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    move-object/from16 v11, v22

    invoke-virtual {v4, v11, v7, v6, v8}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/f;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    .line 44
    invoke-virtual {v4, v11, v14, v6, v9}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/f;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    new-instance v8, Lu0/c;

    invoke-direct {v8}, Lu0/c;-><init>()V

    .line 45
    invoke-virtual {v4, v6, v8}, Lcom/bumptech/glide/Registry;->b(Ljava/lang/Class;Lh0/g;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    .line 46
    invoke-static {}, Ln0/w$a;->a()Ln0/w$a;

    move-result-object v8

    .line 47
    const-class v9, Lg0/a;

    invoke-virtual {v4, v9, v9, v8}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    new-instance v8, Lu0/f;

    invoke-direct {v8, v2}, Lu0/f;-><init>(Lk0/d;)V

    .line 48
    invoke-virtual {v4, v10, v9, v15, v8}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/f;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    .line 49
    const-class v8, Landroid/net/Uri;

    move-object/from16 v9, v20

    move-object/from16 v10, v21

    invoke-virtual {v4, v8, v10, v9}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;Lh0/f;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    new-instance v11, Lq0/w;

    invoke-direct {v11, v9, v2}, Lq0/w;-><init>(Ls0/k;Lk0/d;)V

    .line 50
    invoke-virtual {v4, v8, v15, v11}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;Lh0/f;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    new-instance v9, Lr0/a$a;

    invoke-direct {v9}, Lr0/a$a;-><init>()V

    .line 51
    invoke-virtual {v4, v9}, Lcom/bumptech/glide/Registry;->p(Lcom/bumptech/glide/load/data/e$a;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    new-instance v9, Ln0/d$b;

    invoke-direct {v9}, Ln0/d$b;-><init>()V

    .line 52
    const-class v11, Ljava/io/File;

    invoke-virtual {v4, v11, v14, v9}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    new-instance v9, Ln0/g$e;

    invoke-direct {v9}, Ln0/g$e;-><init>()V

    .line 53
    invoke-virtual {v4, v11, v7, v9}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    new-instance v9, Lt0/a;

    invoke-direct {v9}, Lt0/a;-><init>()V

    .line 54
    invoke-virtual {v4, v11, v11, v9}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;Lh0/f;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    new-instance v9, Ln0/g$b;

    invoke-direct {v9}, Ln0/g$b;-><init>()V

    .line 55
    invoke-virtual {v4, v11, v0, v9}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    .line 56
    invoke-static {}, Ln0/w$a;->a()Ln0/w$a;

    move-result-object v9

    invoke-virtual {v4, v11, v11, v9}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    new-instance v9, Lcom/bumptech/glide/load/data/k$a;

    invoke-direct {v9, v3}, Lcom/bumptech/glide/load/data/k$a;-><init>(Lk0/b;)V

    .line 57
    invoke-virtual {v4, v9}, Lcom/bumptech/glide/Registry;->p(Lcom/bumptech/glide/load/data/e$a;)Lcom/bumptech/glide/Registry;

    .line 58
    invoke-static {}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;->b()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 59
    new-instance v3, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$a;

    invoke-direct {v3}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$a;-><init>()V

    move-object/from16 v4, p1

    invoke-virtual {v4, v3}, Lcom/bumptech/glide/Registry;->p(Lcom/bumptech/glide/load/data/e$a;)Lcom/bumptech/glide/Registry;

    goto :goto_2

    :cond_4
    move-object/from16 v4, p1

    .line 60
    :goto_2
    invoke-static/range {p0 .. p0}, Ln0/f;->g(Landroid/content/Context;)Ln0/o;

    move-result-object v3

    .line 61
    invoke-static/range {p0 .. p0}, Ln0/f;->c(Landroid/content/Context;)Ln0/o;

    move-result-object v9

    .line 62
    invoke-static/range {p0 .. p0}, Ln0/f;->e(Landroid/content/Context;)Ln0/o;

    move-result-object v12

    .line 63
    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    move-object/from16 v16, v6

    invoke-virtual {v4, v13, v7, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v6

    .line 64
    const-class v2, Ljava/lang/Integer;

    invoke-virtual {v6, v2, v7, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v3

    move-object/from16 v6, v23

    .line 65
    invoke-virtual {v3, v13, v6, v9}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v3

    .line 66
    invoke-virtual {v3, v2, v6, v9}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v3

    .line 67
    invoke-virtual {v3, v13, v10, v12}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v3

    .line 68
    invoke-virtual {v3, v2, v10, v12}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v3

    .line 69
    invoke-static/range {p0 .. p0}, Ln0/t;->f(Landroid/content/Context;)Ln0/o;

    move-result-object v9

    invoke-virtual {v3, v8, v7, v9}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v3

    .line 70
    invoke-static/range {p0 .. p0}, Ln0/t;->e(Landroid/content/Context;)Ln0/o;

    move-result-object v9

    .line 71
    invoke-virtual {v3, v8, v6, v9}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    .line 72
    new-instance v3, Ln0/s$c;

    invoke-direct {v3, v5}, Ln0/s$c;-><init>(Landroid/content/res/Resources;)V

    .line 73
    new-instance v9, Ln0/s$a;

    invoke-direct {v9, v5}, Ln0/s$a;-><init>(Landroid/content/res/Resources;)V

    .line 74
    new-instance v12, Ln0/s$b;

    invoke-direct {v12, v5}, Ln0/s$b;-><init>(Landroid/content/res/Resources;)V

    move-object/from16 v20, v1

    .line 75
    invoke-virtual {v4, v2, v8, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v1

    .line 76
    invoke-virtual {v1, v13, v8, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v1

    .line 77
    invoke-virtual {v1, v2, v6, v9}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v1

    .line 78
    invoke-virtual {v1, v13, v6, v9}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v1

    .line 79
    invoke-virtual {v1, v2, v7, v12}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v1

    .line 80
    invoke-virtual {v1, v13, v7, v12}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    .line 81
    new-instance v1, Ln0/e$c;

    invoke-direct {v1}, Ln0/e$c;-><init>()V

    .line 82
    const-class v2, Ljava/lang/String;

    invoke-virtual {v4, v2, v7, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v1

    new-instance v3, Ln0/e$c;

    invoke-direct {v3}, Ln0/e$c;-><init>()V

    .line 83
    invoke-virtual {v1, v8, v7, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v1

    new-instance v3, Ln0/v$c;

    invoke-direct {v3}, Ln0/v$c;-><init>()V

    .line 84
    invoke-virtual {v1, v2, v7, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v1

    new-instance v3, Ln0/v$b;

    invoke-direct {v3}, Ln0/v$b;-><init>()V

    .line 85
    invoke-virtual {v1, v2, v0, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v1

    new-instance v3, Ln0/v$a;

    invoke-direct {v3}, Ln0/v$a;-><init>()V

    .line 86
    invoke-virtual {v1, v2, v6, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v1

    new-instance v2, Ln0/a$c;

    .line 87
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    invoke-direct {v2, v3}, Ln0/a$c;-><init>(Landroid/content/res/AssetManager;)V

    invoke-virtual {v1, v8, v7, v2}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v1

    new-instance v2, Ln0/a$b;

    .line 88
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    invoke-direct {v2, v3}, Ln0/a$b;-><init>(Landroid/content/res/AssetManager;)V

    .line 89
    invoke-virtual {v1, v8, v6, v2}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v1

    new-instance v2, Lo0/b$a;

    move-object/from16 v3, p0

    invoke-direct {v2, v3}, Lo0/b$a;-><init>(Landroid/content/Context;)V

    .line 90
    invoke-virtual {v1, v8, v7, v2}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v1

    new-instance v2, Lo0/c$a;

    invoke-direct {v2, v3}, Lo0/c$a;-><init>(Landroid/content/Context;)V

    .line 91
    invoke-virtual {v1, v8, v7, v2}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    const/16 v1, 0x1d

    move/from16 v2, v17

    if-lt v2, v1, :cond_5

    .line 92
    new-instance v1, Lo0/d$c;

    invoke-direct {v1, v3}, Lo0/d$c;-><init>(Landroid/content/Context;)V

    invoke-virtual {v4, v8, v7, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    .line 93
    new-instance v1, Lo0/d$b;

    invoke-direct {v1, v3}, Lo0/d$b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v4, v8, v0, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    .line 94
    :cond_5
    new-instance v1, Ln0/x$d;

    move-object/from16 v2, v19

    invoke-direct {v1, v2}, Ln0/x$d;-><init>(Landroid/content/ContentResolver;)V

    .line 95
    invoke-virtual {v4, v8, v7, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v1

    new-instance v9, Ln0/x$b;

    invoke-direct {v9, v2}, Ln0/x$b;-><init>(Landroid/content/ContentResolver;)V

    .line 96
    invoke-virtual {v1, v8, v0, v9}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Ln0/x$a;

    invoke-direct {v1, v2}, Ln0/x$a;-><init>(Landroid/content/ContentResolver;)V

    .line 97
    invoke-virtual {v0, v8, v6, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Ln0/y$a;

    invoke-direct {v1}, Ln0/y$a;-><init>()V

    .line 98
    invoke-virtual {v0, v8, v7, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Lo0/g$a;

    invoke-direct {v1}, Lo0/g$a;-><init>()V

    .line 99
    const-class v2, Ljava/net/URL;

    invoke-virtual {v0, v2, v7, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Ln0/l$a;

    invoke-direct {v1, v3}, Ln0/l$a;-><init>(Landroid/content/Context;)V

    .line 100
    invoke-virtual {v0, v8, v11, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Lo0/a$a;

    invoke-direct {v1}, Lo0/a$a;-><init>()V

    .line 101
    const-class v2, Ln0/h;

    invoke-virtual {v0, v2, v7, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Ln0/b$a;

    invoke-direct {v1}, Ln0/b$a;-><init>()V

    .line 102
    const-class v2, [B

    invoke-virtual {v0, v2, v14, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Ln0/b$d;

    invoke-direct {v1}, Ln0/b$d;-><init>()V

    .line 103
    invoke-virtual {v0, v2, v7, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    .line 104
    invoke-static {}, Ln0/w$a;->a()Ln0/w$a;

    move-result-object v1

    invoke-virtual {v0, v8, v8, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    .line 105
    invoke-static {}, Ln0/w$a;->a()Ln0/w$a;

    move-result-object v1

    invoke-virtual {v0, v10, v10, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Ln0/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Ls0/l;

    invoke-direct {v1}, Ls0/l;-><init>()V

    .line 106
    invoke-virtual {v0, v10, v10, v1}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;Lh0/f;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Lv0/b;

    invoke-direct {v1, v5}, Lv0/b;-><init>(Landroid/content/res/Resources;)V

    move-object/from16 v3, v20

    .line 107
    invoke-virtual {v0, v15, v3, v1}, Lcom/bumptech/glide/Registry;->q(Ljava/lang/Class;Ljava/lang/Class;Lv0/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    move-object/from16 v1, p4

    .line 108
    invoke-virtual {v0, v15, v2, v1}, Lcom/bumptech/glide/Registry;->q(Ljava/lang/Class;Ljava/lang/Class;Lv0/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v6, Lv0/c;

    move-object/from16 v7, p2

    move-object/from16 v8, v18

    invoke-direct {v6, v7, v1, v8}, Lv0/c;-><init>(Lk0/d;Lv0/e;Lv0/e;)V

    .line 109
    invoke-virtual {v0, v10, v2, v6}, Lcom/bumptech/glide/Registry;->q(Ljava/lang/Class;Ljava/lang/Class;Lv0/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    move-object/from16 v1, v16

    .line 110
    invoke-virtual {v0, v1, v2, v8}, Lcom/bumptech/glide/Registry;->q(Ljava/lang/Class;Ljava/lang/Class;Lv0/e;)Lcom/bumptech/glide/Registry;

    .line 111
    invoke-static {v7}, Lcom/bumptech/glide/load/resource/bitmap/VideoDecoder;->d(Lk0/d;)Lh0/f;

    move-result-object v0

    .line 112
    invoke-virtual {v4, v14, v15, v0}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;Lh0/f;)Lcom/bumptech/glide/Registry;

    .line 113
    new-instance v1, Lq0/a;

    invoke-direct {v1, v5, v0}, Lq0/a;-><init>(Landroid/content/res/Resources;Lh0/f;)V

    invoke-virtual {v4, v14, v3, v1}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;Lh0/f;)Lcom/bumptech/glide/Registry;

    return-void
.end method

.method public static c(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/Registry;Ljava/util/List;Lx0/a;)V
    .locals 1

    .line 1
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    if-eqz p4, :cond_0

    .line 12
    .line 13
    invoke-virtual {p4, p0, p1, p2}, Lx0/c;->a(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/Registry;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void

    .line 17
    :cond_1
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Lk/r;->a(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    throw p0
.end method

.method public static d(Lcom/bumptech/glide/b;Ljava/util/List;Lx0/a;)Ld1/e$b;
    .locals 1

    .line 1
    new-instance v0, Lcom/bumptech/glide/f$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/bumptech/glide/f$a;-><init>(Lcom/bumptech/glide/b;Ljava/util/List;Lx0/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

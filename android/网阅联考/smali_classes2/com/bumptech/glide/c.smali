.class public Lcom/bumptech/glide/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/c$a;
    }
.end annotation


# static fields
.field public static volatile l:Lcom/bumptech/glide/c;

.field public static volatile m:Z


# instance fields
.field public final a:Lcom/bumptech/glide/load/engine/f;

.field public final b:Ln/d;

.field public final c:Lo/h;

.field public final d:Lcom/bumptech/glide/e;

.field public final e:Lcom/bumptech/glide/Registry;

.field public final f:Ln/b;

.field public final g:Lz/m;

.field public final h:Lz/d;

.field public final i:Ljava/util/List;

.field public final j:Lcom/bumptech/glide/c$a;

.field public k:Lcom/bumptech/glide/MemoryCategory;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bumptech/glide/load/engine/f;Lo/h;Ln/d;Ln/b;Lz/m;Lz/d;ILcom/bumptech/glide/c$a;Ljava/util/Map;Ljava/util/List;ZZ)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v1, p4

    move-object/from16 v3, p5

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v0, Lcom/bumptech/glide/c;->i:Ljava/util/List;

    .line 3
    sget-object v4, Lcom/bumptech/glide/MemoryCategory;->c:Lcom/bumptech/glide/MemoryCategory;

    iput-object v4, v0, Lcom/bumptech/glide/c;->k:Lcom/bumptech/glide/MemoryCategory;

    move-object/from16 v9, p2

    .line 4
    iput-object v9, v0, Lcom/bumptech/glide/c;->a:Lcom/bumptech/glide/load/engine/f;

    .line 5
    iput-object v1, v0, Lcom/bumptech/glide/c;->b:Ln/d;

    .line 6
    iput-object v3, v0, Lcom/bumptech/glide/c;->f:Ln/b;

    move-object/from16 v4, p3

    .line 7
    iput-object v4, v0, Lcom/bumptech/glide/c;->c:Lo/h;

    move-object/from16 v4, p6

    .line 8
    iput-object v4, v0, Lcom/bumptech/glide/c;->g:Lz/m;

    move-object/from16 v4, p7

    .line 9
    iput-object v4, v0, Lcom/bumptech/glide/c;->h:Lz/d;

    move-object/from16 v6, p9

    .line 10
    iput-object v6, v0, Lcom/bumptech/glide/c;->j:Lcom/bumptech/glide/c$a;

    .line 11
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 12
    new-instance v5, Lcom/bumptech/glide/Registry;

    invoke-direct {v5}, Lcom/bumptech/glide/Registry;-><init>()V

    iput-object v5, v0, Lcom/bumptech/glide/c;->e:Lcom/bumptech/glide/Registry;

    .line 13
    new-instance v7, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser;

    invoke-direct {v7}, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser;-><init>()V

    invoke-virtual {v5, v7}, Lcom/bumptech/glide/Registry;->o(Lcom/bumptech/glide/load/ImageHeaderParser;)Lcom/bumptech/glide/Registry;

    .line 14
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x1b

    if-lt v7, v8, :cond_0

    .line 15
    new-instance v8, Lt/t;

    invoke-direct {v8}, Lt/t;-><init>()V

    invoke-virtual {v5, v8}, Lcom/bumptech/glide/Registry;->o(Lcom/bumptech/glide/load/ImageHeaderParser;)Lcom/bumptech/glide/Registry;

    .line 16
    :cond_0
    invoke-virtual {v5}, Lcom/bumptech/glide/Registry;->g()Ljava/util/List;

    move-result-object v8

    .line 17
    new-instance v10, Lx/a;

    invoke-direct {v10, v2, v8, v1, v3}, Lx/a;-><init>(Landroid/content/Context;Ljava/util/List;Ln/d;Ln/b;)V

    .line 18
    invoke-static/range {p4 .. p4}, Lt/d0;->h(Ln/d;)Lj/e;

    move-result-object v11

    .line 19
    new-instance v12, Lcom/bumptech/glide/load/resource/bitmap/a;

    .line 20
    invoke-virtual {v5}, Lcom/bumptech/glide/Registry;->g()Ljava/util/List;

    move-result-object v13

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v14

    invoke-direct {v12, v13, v14, v1, v3}, Lcom/bumptech/glide/load/resource/bitmap/a;-><init>(Ljava/util/List;Landroid/util/DisplayMetrics;Ln/d;Ln/b;)V

    if-eqz p13, :cond_1

    const/16 v13, 0x1c

    if-lt v7, v13, :cond_1

    .line 21
    new-instance v13, Lt/w;

    invoke-direct {v13}, Lt/w;-><init>()V

    .line 22
    new-instance v14, Lt/i;

    invoke-direct {v14}, Lt/i;-><init>()V

    goto :goto_0

    .line 23
    :cond_1
    new-instance v14, Lt/g;

    invoke-direct {v14, v12}, Lt/g;-><init>(Lcom/bumptech/glide/load/resource/bitmap/a;)V

    .line 24
    new-instance v13, Lcom/bumptech/glide/load/resource/bitmap/c;

    invoke-direct {v13, v12, v3}, Lcom/bumptech/glide/load/resource/bitmap/c;-><init>(Lcom/bumptech/glide/load/resource/bitmap/a;Ln/b;)V

    .line 25
    :goto_0
    new-instance v15, Lv/d;

    invoke-direct {v15, v2}, Lv/d;-><init>(Landroid/content/Context;)V

    .line 26
    new-instance v6, Lq/r$c;

    invoke-direct {v6, v4}, Lq/r$c;-><init>(Landroid/content/res/Resources;)V

    .line 27
    new-instance v9, Lq/r$d;

    invoke-direct {v9, v4}, Lq/r$d;-><init>(Landroid/content/res/Resources;)V

    .line 28
    new-instance v0, Lq/r$b;

    invoke-direct {v0, v4}, Lq/r$b;-><init>(Landroid/content/res/Resources;)V

    move/from16 p3, v7

    .line 29
    new-instance v7, Lq/r$a;

    invoke-direct {v7, v4}, Lq/r$a;-><init>(Landroid/content/res/Resources;)V

    .line 30
    new-instance v2, Lt/c;

    invoke-direct {v2, v3}, Lt/c;-><init>(Ln/b;)V

    move-object/from16 p6, v7

    .line 31
    new-instance v7, Ly/a;

    invoke-direct {v7}, Ly/a;-><init>()V

    move-object/from16 p7, v7

    .line 32
    new-instance v7, Ly/d;

    invoke-direct {v7}, Ly/d;-><init>()V

    move-object/from16 p13, v7

    .line 33
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v7

    move-object/from16 v16, v7

    .line 34
    new-instance v7, Lq/c;

    invoke-direct {v7}, Lq/c;-><init>()V

    move-object/from16 v17, v9

    .line 35
    const-class v9, Ljava/nio/ByteBuffer;

    invoke-virtual {v5, v9, v7}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Lj/a;)Lcom/bumptech/glide/Registry;

    move-result-object v7

    move-object/from16 v18, v0

    new-instance v0, Lq/s;

    invoke-direct {v0, v3}, Lq/s;-><init>(Ln/b;)V

    move-object/from16 v19, v6

    .line 36
    const-class v6, Ljava/io/InputStream;

    invoke-virtual {v7, v6, v0}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Lj/a;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    const-string v7, "Bitmap"

    move-object/from16 v20, v15

    .line 37
    const-class v15, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v7, v9, v15, v14}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lj/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    .line 38
    invoke-virtual {v0, v7, v6, v15, v13}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lj/e;)Lcom/bumptech/glide/Registry;

    .line 39
    invoke-static {}, Lk/m;->c()Z

    move-result v0

    const-class v3, Landroid/os/ParcelFileDescriptor;

    if-eqz v0, :cond_2

    .line 40
    new-instance v0, Lt/y;

    invoke-direct {v0, v12}, Lt/y;-><init>(Lcom/bumptech/glide/load/resource/bitmap/a;)V

    invoke-virtual {v5, v7, v3, v15, v0}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lj/e;)Lcom/bumptech/glide/Registry;

    .line 41
    :cond_2
    invoke-virtual {v5, v7, v3, v15, v11}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lj/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    .line 42
    invoke-static/range {p4 .. p4}, Lt/d0;->c(Ln/d;)Lj/e;

    move-result-object v12

    move-object/from16 v21, v5

    .line 43
    const-class v5, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {v0, v7, v5, v15, v12}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lj/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    .line 44
    invoke-static {}, Lq/u$a;->a()Lq/u$a;

    move-result-object v12

    invoke-virtual {v0, v15, v15, v12}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v12, Lt/b0;

    invoke-direct {v12}, Lt/b0;-><init>()V

    .line 45
    invoke-virtual {v0, v7, v15, v15, v12}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lj/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    .line 46
    invoke-virtual {v0, v15, v2}, Lcom/bumptech/glide/Registry;->b(Ljava/lang/Class;Lj/f;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v12, Lt/a;

    invoke-direct {v12, v4, v14}, Lt/a;-><init>(Landroid/content/res/Resources;Lj/e;)V

    const-string v14, "BitmapDrawable"

    move-object/from16 v22, v5

    .line 47
    const-class v5, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0, v14, v9, v5, v12}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lj/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v12, Lt/a;

    invoke-direct {v12, v4, v13}, Lt/a;-><init>(Landroid/content/res/Resources;Lj/e;)V

    .line 48
    invoke-virtual {v0, v14, v6, v5, v12}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lj/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v12, Lt/a;

    invoke-direct {v12, v4, v11}, Lt/a;-><init>(Landroid/content/res/Resources;Lj/e;)V

    .line 49
    invoke-virtual {v0, v14, v3, v5, v12}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lj/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v11, Lt/b;

    invoke-direct {v11, v1, v2}, Lt/b;-><init>(Ln/d;Lj/f;)V

    .line 50
    invoke-virtual {v0, v5, v11}, Lcom/bumptech/glide/Registry;->b(Ljava/lang/Class;Lj/f;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, Lx/h;

    move-object v11, v3

    move-object/from16 v3, p5

    invoke-direct {v2, v8, v10, v3}, Lx/h;-><init>(Ljava/util/List;Lj/e;Ln/b;)V

    const-string v8, "Gif"

    .line 51
    const-class v12, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    invoke-virtual {v0, v8, v6, v12, v2}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lj/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    .line 52
    invoke-virtual {v0, v8, v9, v12, v10}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lj/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, Lx/c;

    invoke-direct {v2}, Lx/c;-><init>()V

    .line 53
    invoke-virtual {v0, v12, v2}, Lcom/bumptech/glide/Registry;->b(Ljava/lang/Class;Lj/f;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    .line 54
    invoke-static {}, Lq/u$a;->a()Lq/u$a;

    move-result-object v2

    .line 55
    const-class v8, Li/a;

    invoke-virtual {v0, v8, v8, v2}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, Lx/f;

    invoke-direct {v2, v1}, Lx/f;-><init>(Ln/d;)V

    .line 56
    invoke-virtual {v0, v7, v8, v15, v2}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lj/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    .line 57
    const-class v2, Landroid/net/Uri;

    const-class v7, Landroid/graphics/drawable/Drawable;

    move-object/from16 v8, v20

    invoke-virtual {v0, v2, v7, v8}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;Lj/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v10, Lt/z;

    invoke-direct {v10, v8, v1}, Lt/z;-><init>(Lv/d;Ln/d;)V

    .line 58
    invoke-virtual {v0, v2, v15, v10}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;Lj/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v8, Lu/a$a;

    invoke-direct {v8}, Lu/a$a;-><init>()V

    .line 59
    invoke-virtual {v0, v8}, Lcom/bumptech/glide/Registry;->q(Lk/e$a;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v8, Lq/d$b;

    invoke-direct {v8}, Lq/d$b;-><init>()V

    .line 60
    const-class v10, Ljava/io/File;

    invoke-virtual {v0, v10, v9, v8}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v8, Lq/f$e;

    invoke-direct {v8}, Lq/f$e;-><init>()V

    .line 61
    invoke-virtual {v0, v10, v6, v8}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v8, Lw/a;

    invoke-direct {v8}, Lw/a;-><init>()V

    .line 62
    invoke-virtual {v0, v10, v10, v8}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;Lj/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v8, Lq/f$b;

    invoke-direct {v8}, Lq/f$b;-><init>()V

    .line 63
    invoke-virtual {v0, v10, v11, v8}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    .line 64
    invoke-static {}, Lq/u$a;->a()Lq/u$a;

    move-result-object v8

    invoke-virtual {v0, v10, v10, v8}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v8, Lk/k$a;

    invoke-direct {v8, v3}, Lk/k$a;-><init>(Ln/b;)V

    .line 65
    invoke-virtual {v0, v8}, Lcom/bumptech/glide/Registry;->q(Lk/e$a;)Lcom/bumptech/glide/Registry;

    .line 66
    invoke-static {}, Lk/m;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 67
    new-instance v0, Lk/m$a;

    invoke-direct {v0}, Lk/m$a;-><init>()V

    move-object/from16 v8, v21

    invoke-virtual {v8, v0}, Lcom/bumptech/glide/Registry;->q(Lk/e$a;)Lcom/bumptech/glide/Registry;

    goto :goto_1

    :cond_3
    move-object/from16 v8, v21

    .line 68
    :goto_1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    move-object/from16 v13, v19

    .line 69
    invoke-virtual {v8, v0, v6, v13}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v14

    move-object/from16 v3, v18

    .line 70
    invoke-virtual {v14, v0, v11, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v14

    move-object/from16 v18, v12

    .line 71
    const-class v12, Ljava/lang/Integer;

    invoke-virtual {v14, v12, v6, v13}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v13

    .line 72
    invoke-virtual {v13, v12, v11, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v3

    move-object/from16 v13, v17

    .line 73
    invoke-virtual {v3, v12, v2, v13}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v3

    move-object/from16 v14, p6

    move-object/from16 v1, v22

    .line 74
    invoke-virtual {v3, v0, v1, v14}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v3

    .line 75
    invoke-virtual {v3, v12, v1, v14}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v3

    .line 76
    invoke-virtual {v3, v0, v2, v13}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v3, Lq/e$c;

    invoke-direct {v3}, Lq/e$c;-><init>()V

    .line 77
    const-class v12, Ljava/lang/String;

    invoke-virtual {v0, v12, v6, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v3, Lq/e$c;

    invoke-direct {v3}, Lq/e$c;-><init>()V

    .line 78
    invoke-virtual {v0, v2, v6, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v3, Lq/t$c;

    invoke-direct {v3}, Lq/t$c;-><init>()V

    .line 79
    invoke-virtual {v0, v12, v6, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v3, Lq/t$b;

    invoke-direct {v3}, Lq/t$b;-><init>()V

    .line 80
    invoke-virtual {v0, v12, v11, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v3, Lq/t$a;

    invoke-direct {v3}, Lq/t$a;-><init>()V

    .line 81
    invoke-virtual {v0, v12, v1, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v3, Lr/b$a;

    invoke-direct {v3}, Lr/b$a;-><init>()V

    .line 82
    invoke-virtual {v0, v2, v6, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v3, Lq/a$c;

    .line 83
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v12

    invoke-direct {v3, v12}, Lq/a$c;-><init>(Landroid/content/res/AssetManager;)V

    invoke-virtual {v0, v2, v6, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v3, Lq/a$b;

    .line 84
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v12

    invoke-direct {v3, v12}, Lq/a$b;-><init>(Landroid/content/res/AssetManager;)V

    .line 85
    invoke-virtual {v0, v2, v11, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v3, Lr/c$a;

    move-object/from16 v12, p1

    invoke-direct {v3, v12}, Lr/c$a;-><init>(Landroid/content/Context;)V

    .line 86
    invoke-virtual {v0, v2, v6, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v3, Lr/d$a;

    invoke-direct {v3, v12}, Lr/d$a;-><init>(Landroid/content/Context;)V

    .line 87
    invoke-virtual {v0, v2, v6, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    const/16 v0, 0x1d

    move/from16 v3, p3

    if-lt v3, v0, :cond_4

    .line 88
    new-instance v0, Lr/e$c;

    invoke-direct {v0, v12}, Lr/e$c;-><init>(Landroid/content/Context;)V

    invoke-virtual {v8, v2, v6, v0}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    .line 89
    new-instance v0, Lr/e$b;

    invoke-direct {v0, v12}, Lr/e$b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v8, v2, v11, v0}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    .line 90
    :cond_4
    new-instance v0, Lq/v$d;

    move-object/from16 v3, v16

    invoke-direct {v0, v3}, Lq/v$d;-><init>(Landroid/content/ContentResolver;)V

    .line 91
    invoke-virtual {v8, v2, v6, v0}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v13, Lq/v$b;

    invoke-direct {v13, v3}, Lq/v$b;-><init>(Landroid/content/ContentResolver;)V

    .line 92
    invoke-virtual {v0, v2, v11, v13}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v11, Lq/v$a;

    invoke-direct {v11, v3}, Lq/v$a;-><init>(Landroid/content/ContentResolver;)V

    .line 93
    invoke-virtual {v0, v2, v1, v11}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Lq/w$a;

    invoke-direct {v1}, Lq/w$a;-><init>()V

    .line 94
    invoke-virtual {v0, v2, v6, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Lr/h$a;

    invoke-direct {v1}, Lr/h$a;-><init>()V

    .line 95
    const-class v3, Ljava/net/URL;

    invoke-virtual {v0, v3, v6, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Lq/k$a;

    invoke-direct {v1, v12}, Lq/k$a;-><init>(Landroid/content/Context;)V

    .line 96
    invoke-virtual {v0, v2, v10, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Lr/a$a;

    invoke-direct {v1}, Lr/a$a;-><init>()V

    .line 97
    const-class v3, Lq/g;

    invoke-virtual {v0, v3, v6, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Lq/b$a;

    invoke-direct {v1}, Lq/b$a;-><init>()V

    .line 98
    const-class v3, [B

    invoke-virtual {v0, v3, v9, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Lq/b$d;

    invoke-direct {v1}, Lq/b$d;-><init>()V

    .line 99
    invoke-virtual {v0, v3, v6, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    .line 100
    invoke-static {}, Lq/u$a;->a()Lq/u$a;

    move-result-object v1

    invoke-virtual {v0, v2, v2, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    .line 101
    invoke-static {}, Lq/u$a;->a()Lq/u$a;

    move-result-object v1

    invoke-virtual {v0, v7, v7, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lq/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Lv/e;

    invoke-direct {v1}, Lv/e;-><init>()V

    .line 102
    invoke-virtual {v0, v7, v7, v1}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;Lj/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Ly/b;

    invoke-direct {v1, v4}, Ly/b;-><init>(Landroid/content/res/Resources;)V

    .line 103
    invoke-virtual {v0, v15, v5, v1}, Lcom/bumptech/glide/Registry;->p(Ljava/lang/Class;Ljava/lang/Class;Ly/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    move-object/from16 v1, p7

    .line 104
    invoke-virtual {v0, v15, v3, v1}, Lcom/bumptech/glide/Registry;->p(Ljava/lang/Class;Ljava/lang/Class;Ly/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, Ly/c;

    move-object/from16 v6, p4

    move-object/from16 v10, p13

    invoke-direct {v2, v6, v1, v10}, Ly/c;-><init>(Ln/d;Ly/e;Ly/e;)V

    .line 105
    invoke-virtual {v0, v7, v3, v2}, Lcom/bumptech/glide/Registry;->p(Ljava/lang/Class;Ljava/lang/Class;Ly/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    move-object/from16 v1, v18

    .line 106
    invoke-virtual {v0, v1, v3, v10}, Lcom/bumptech/glide/Registry;->p(Ljava/lang/Class;Ljava/lang/Class;Ly/e;)Lcom/bumptech/glide/Registry;

    .line 107
    invoke-static/range {p4 .. p4}, Lt/d0;->d(Ln/d;)Lj/e;

    move-result-object v0

    .line 108
    invoke-virtual {v8, v9, v15, v0}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;Lj/e;)Lcom/bumptech/glide/Registry;

    .line 109
    new-instance v1, Lt/a;

    invoke-direct {v1, v4, v0}, Lt/a;-><init>(Landroid/content/res/Resources;Lj/e;)V

    invoke-virtual {v8, v9, v5, v1}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;Lj/e;)Lcom/bumptech/glide/Registry;

    .line 110
    new-instance v5, Ld0/f;

    invoke-direct {v5}, Ld0/f;-><init>()V

    .line 111
    new-instance v0, Lcom/bumptech/glide/e;

    move-object v1, v0

    move-object/from16 v2, p1

    move-object/from16 v3, p5

    move-object v4, v8

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    move-object/from16 v9, p2

    move/from16 v10, p12

    move/from16 v11, p8

    invoke-direct/range {v1 .. v11}, Lcom/bumptech/glide/e;-><init>(Landroid/content/Context;Ln/b;Lcom/bumptech/glide/Registry;Ld0/f;Lcom/bumptech/glide/c$a;Ljava/util/Map;Ljava/util/List;Lcom/bumptech/glide/load/engine/f;ZI)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/bumptech/glide/c;->d:Lcom/bumptech/glide/e;

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/bumptech/glide/c;->m:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    sput-boolean v0, Lcom/bumptech/glide/c;->m:Z

    .line 7
    .line 8
    invoke-static {p0, p1}, Lcom/bumptech/glide/c;->m(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    sput-boolean p0, Lcom/bumptech/glide/c;->m:Z

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string p1, "You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead"

    .line 18
    .line 19
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p0
.end method

.method public static c(Landroid/content/Context;)Lcom/bumptech/glide/c;
    .locals 3

    .line 1
    sget-object v0, Lcom/bumptech/glide/c;->l:Lcom/bumptech/glide/c;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lcom/bumptech/glide/c;->d(Landroid/content/Context;)Lcom/bumptech/glide/GeneratedAppGlideModule;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-class v1, Lcom/bumptech/glide/c;

    .line 14
    .line 15
    monitor-enter v1

    .line 16
    :try_start_0
    sget-object v2, Lcom/bumptech/glide/c;->l:Lcom/bumptech/glide/c;

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    invoke-static {p0, v0}, Lcom/bumptech/glide/c;->a(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    monitor-exit v1

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw p0

    .line 28
    :cond_1
    :goto_0
    sget-object p0, Lcom/bumptech/glide/c;->l:Lcom/bumptech/glide/c;

    .line 29
    .line 30
    return-object p0
.end method

.method public static d(Landroid/content/Context;)Lcom/bumptech/glide/GeneratedAppGlideModule;
    .locals 5

    .line 1
    :try_start_0
    const-string v0, "com.bumptech.glide.GeneratedAppGlideModuleImpl"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    new-array v2, v1, [Ljava/lang/Class;

    .line 9
    .line 10
    const-class v3, Landroid/content/Context;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    aput-object v3, v2, v4

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-array v1, v1, [Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    aput-object p0, v1, v4

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lcom/bumptech/glide/GeneratedAppGlideModule;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :catch_0
    move-exception p0

    .line 35
    invoke-static {p0}, Lcom/bumptech/glide/c;->q(Ljava/lang/Exception;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catch_1
    move-exception p0

    .line 40
    invoke-static {p0}, Lcom/bumptech/glide/c;->q(Ljava/lang/Exception;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catch_2
    move-exception p0

    .line 45
    invoke-static {p0}, Lcom/bumptech/glide/c;->q(Ljava/lang/Exception;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catch_3
    move-exception p0

    .line 50
    invoke-static {p0}, Lcom/bumptech/glide/c;->q(Ljava/lang/Exception;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catch_4
    const/4 p0, 0x5

    .line 55
    const-string v0, "Glide"

    .line 56
    .line 57
    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_0

    .line 62
    .line 63
    const-string p0, "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored"

    .line 64
    .line 65
    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    :cond_0
    :goto_0
    const/4 p0, 0x0

    .line 69
    :goto_1
    return-object p0
.end method

.method public static l(Landroid/content/Context;)Lz/m;
    .locals 1

    .line 1
    const-string v0, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."

    .line 2
    .line 3
    invoke-static {p0, v0}, Lg0/i;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/bumptech/glide/c;->c(Landroid/content/Context;)Lcom/bumptech/glide/c;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lcom/bumptech/glide/c;->k()Lz/m;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static m(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/bumptech/glide/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/bumptech/glide/d;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0, p1}, Lcom/bumptech/glide/c;->n(Landroid/content/Context;Lcom/bumptech/glide/d;Lcom/bumptech/glide/GeneratedAppGlideModule;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static n(Landroid/content/Context;Lcom/bumptech/glide/d;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, La0/a;->c()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    :cond_0
    new-instance v0, La0/d;

    .line 18
    .line 19
    invoke-direct {v0, p0}, La0/d;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, La0/d;->a()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_1
    const/4 v1, 0x0

    .line 27
    if-eqz p2, :cond_3

    .line 28
    .line 29
    invoke-virtual {p2}, Lcom/bumptech/glide/GeneratedAppGlideModule;->d()Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_3

    .line 38
    .line 39
    invoke-virtual {p2}, Lcom/bumptech/glide/GeneratedAppGlideModule;->d()Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-nez v3, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0}, Lcom/bumptech/glide/b;->a(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    throw v1

    .line 61
    :cond_3
    :goto_0
    const-string v2, "Glide"

    .line 62
    .line 63
    const/4 v3, 0x3

    .line 64
    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_5

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-nez v3, :cond_4

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {p0}, Lcom/bumptech/glide/b;->a(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    new-instance p0, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string p1, "Discovered GlideModule from manifest: "

    .line 94
    .line 95
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    throw v1

    .line 99
    :cond_5
    :goto_1
    if-eqz p2, :cond_6

    .line 100
    .line 101
    invoke-virtual {p2}, Lcom/bumptech/glide/GeneratedAppGlideModule;->e()Lz/m$b;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    goto :goto_2

    .line 106
    :cond_6
    move-object v2, v1

    .line 107
    :goto_2
    invoke-virtual {p1, v2}, Lcom/bumptech/glide/d;->b(Lz/m$b;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-nez v3, :cond_a

    .line 119
    .line 120
    if-eqz p2, :cond_7

    .line 121
    .line 122
    invoke-virtual {p2, p0, p1}, La0/a;->b(Landroid/content/Context;Lcom/bumptech/glide/d;)V

    .line 123
    .line 124
    .line 125
    :cond_7
    invoke-virtual {p1, p0}, Lcom/bumptech/glide/d;->a(Landroid/content/Context;)Lcom/bumptech/glide/c;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-nez v2, :cond_9

    .line 138
    .line 139
    if-eqz p2, :cond_8

    .line 140
    .line 141
    iget-object v0, p1, Lcom/bumptech/glide/c;->e:Lcom/bumptech/glide/Registry;

    .line 142
    .line 143
    invoke-virtual {p2, p0, p1, v0}, La0/c;->a(Landroid/content/Context;Lcom/bumptech/glide/c;Lcom/bumptech/glide/Registry;)V

    .line 144
    .line 145
    .line 146
    :cond_8
    invoke-virtual {p0, p1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 147
    .line 148
    .line 149
    sput-object p1, Lcom/bumptech/glide/c;->l:Lcom/bumptech/glide/c;

    .line 150
    .line 151
    return-void

    .line 152
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-static {p0}, Lcom/bumptech/glide/b;->a(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :try_start_0
    iget-object p0, p1, Lcom/bumptech/glide/c;->e:Lcom/bumptech/glide/Registry;
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    .line 161
    throw v1

    .line 162
    :catch_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 163
    .line 164
    new-instance p0, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    .line 168
    .line 169
    const-string p1, "Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you\'re using Glide v4. You\'ll need to find and remove (or update) the offending dependency. The v3 module name is: "

    .line 170
    .line 171
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    throw v1

    .line 175
    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-static {p0}, Lcom/bumptech/glide/b;->a(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    throw v1
.end method

.method public static q(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 4
    .line 5
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public static t(Landroid/content/Context;)Lcom/bumptech/glide/g;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/bumptech/glide/c;->l(Landroid/content/Context;)Lz/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lz/m;->k(Landroid/content/Context;)Lcom/bumptech/glide/g;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static u(Landroid/view/View;)Lcom/bumptech/glide/g;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/bumptech/glide/c;->l(Landroid/content/Context;)Lz/m;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p0}, Lz/m;->l(Landroid/view/View;)Lcom/bumptech/glide/g;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static v(Landroidx/fragment/app/Fragment;)Lcom/bumptech/glide/g;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/bumptech/glide/c;->l(Landroid/content/Context;)Lz/m;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p0}, Lz/m;->m(Landroidx/fragment/app/Fragment;)Lcom/bumptech/glide/g;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 1
    invoke-static {}, Lg0/j;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bumptech/glide/c;->c:Lo/h;

    .line 5
    .line 6
    invoke-interface {v0}, Lo/h;->b()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/bumptech/glide/c;->b:Ln/d;

    .line 10
    .line 11
    invoke-interface {v0}, Ln/d;->b()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/bumptech/glide/c;->f:Ln/b;

    .line 15
    .line 16
    invoke-interface {v0}, Ln/b;->b()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public e()Ln/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/c;->f:Ln/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Ln/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/c;->b:Ln/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()Lz/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/c;->h:Lz/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/c;->d:Lcom/bumptech/glide/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public i()Lcom/bumptech/glide/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/c;->d:Lcom/bumptech/glide/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()Lcom/bumptech/glide/Registry;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/c;->e:Lcom/bumptech/glide/Registry;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()Lz/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/c;->g:Lz/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public o(Lcom/bumptech/glide/g;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/c;->i:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/c;->i:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/bumptech/glide/c;->i:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v1, "Cannot register already registered manager"

    .line 22
    .line 23
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw p1
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public onLowMemory()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/bumptech/glide/c;->b()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onTrimMemory(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/c;->r(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public p(Ld0/h;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/c;->i:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/c;->i:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lcom/bumptech/glide/g;

    .line 21
    .line 22
    invoke-virtual {v2, p1}, Lcom/bumptech/glide/g;->z(Ld0/h;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    monitor-exit v0

    .line 29
    const/4 p1, 0x1

    .line 30
    return p1

    .line 31
    :cond_1
    monitor-exit v0

    .line 32
    const/4 p1, 0x0

    .line 33
    return p1

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    throw p1
.end method

.method public r(I)V
    .locals 2

    .line 1
    invoke-static {}, Lg0/j;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bumptech/glide/c;->i:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcom/bumptech/glide/g;

    .line 21
    .line 22
    invoke-virtual {v1, p1}, Lcom/bumptech/glide/g;->onTrimMemory(I)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/c;->c:Lo/h;

    .line 27
    .line 28
    invoke-interface {v0, p1}, Lo/h;->a(I)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/bumptech/glide/c;->b:Ln/d;

    .line 32
    .line 33
    invoke-interface {v0, p1}, Ln/d;->a(I)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/bumptech/glide/c;->f:Ln/b;

    .line 37
    .line 38
    invoke-interface {v0, p1}, Ln/b;->a(I)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public s(Lcom/bumptech/glide/g;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/c;->i:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/c;->i:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/bumptech/glide/c;->i:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v1, "Cannot unregister not yet registered manager"

    .line 22
    .line 23
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw p1
.end method

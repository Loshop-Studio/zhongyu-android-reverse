.class public Lcom/bumptech/glide/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/b$a;
    }
.end annotation


# static fields
.field public static volatile l:Lcom/bumptech/glide/b;

.field public static volatile m:Z


# instance fields
.field public final a:Lcom/bumptech/glide/load/engine/f;

.field public final b:Ll0/d;

.field public final c:Lm0/h;

.field public final d:Lcom/bumptech/glide/d;

.field public final e:Lcom/bumptech/glide/Registry;

.field public final f:Ll0/b;

.field public final g:Lx0/m;

.field public final h:Lx0/d;

.field public final i:Ljava/util/List;

.field public final j:Lcom/bumptech/glide/b$a;

.field public k:Lcom/bumptech/glide/MemoryCategory;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bumptech/glide/load/engine/f;Lm0/h;Ll0/d;Ll0/b;Lx0/m;Lx0/d;ILcom/bumptech/glide/b$a;Ljava/util/Map;Ljava/util/List;ZZ)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v1, p4

    move-object/from16 v3, p5

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v0, Lcom/bumptech/glide/b;->i:Ljava/util/List;

    .line 3
    sget-object v4, Lcom/bumptech/glide/MemoryCategory;->c:Lcom/bumptech/glide/MemoryCategory;

    iput-object v4, v0, Lcom/bumptech/glide/b;->k:Lcom/bumptech/glide/MemoryCategory;

    move-object/from16 v9, p2

    .line 4
    iput-object v9, v0, Lcom/bumptech/glide/b;->a:Lcom/bumptech/glide/load/engine/f;

    .line 5
    iput-object v1, v0, Lcom/bumptech/glide/b;->b:Ll0/d;

    .line 6
    iput-object v3, v0, Lcom/bumptech/glide/b;->f:Ll0/b;

    move-object/from16 v4, p3

    .line 7
    iput-object v4, v0, Lcom/bumptech/glide/b;->c:Lm0/h;

    move-object/from16 v4, p6

    .line 8
    iput-object v4, v0, Lcom/bumptech/glide/b;->g:Lx0/m;

    move-object/from16 v4, p7

    .line 9
    iput-object v4, v0, Lcom/bumptech/glide/b;->h:Lx0/d;

    move-object/from16 v6, p9

    .line 10
    iput-object v6, v0, Lcom/bumptech/glide/b;->j:Lcom/bumptech/glide/b$a;

    .line 11
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 12
    new-instance v5, Lcom/bumptech/glide/Registry;

    invoke-direct {v5}, Lcom/bumptech/glide/Registry;-><init>()V

    iput-object v5, v0, Lcom/bumptech/glide/b;->e:Lcom/bumptech/glide/Registry;

    .line 13
    new-instance v7, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser;

    invoke-direct {v7}, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser;-><init>()V

    invoke-virtual {v5, v7}, Lcom/bumptech/glide/Registry;->o(Lcom/bumptech/glide/load/ImageHeaderParser;)Lcom/bumptech/glide/Registry;

    .line 14
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x1b

    if-lt v7, v8, :cond_0

    .line 15
    new-instance v8, Lr0/q;

    invoke-direct {v8}, Lr0/q;-><init>()V

    invoke-virtual {v5, v8}, Lcom/bumptech/glide/Registry;->o(Lcom/bumptech/glide/load/ImageHeaderParser;)Lcom/bumptech/glide/Registry;

    .line 16
    :cond_0
    invoke-virtual {v5}, Lcom/bumptech/glide/Registry;->g()Ljava/util/List;

    move-result-object v8

    .line 17
    new-instance v10, Lv0/a;

    invoke-direct {v10, v2, v8, v1, v3}, Lv0/a;-><init>(Landroid/content/Context;Ljava/util/List;Ll0/d;Ll0/b;)V

    .line 18
    invoke-static {v1}, Lr0/a0;->h(Ll0/d;)Lh0/e;

    move-result-object v11

    .line 19
    new-instance v12, Lcom/bumptech/glide/load/resource/bitmap/a;

    .line 20
    invoke-virtual {v5}, Lcom/bumptech/glide/Registry;->g()Ljava/util/List;

    move-result-object v13

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v14

    invoke-direct {v12, v13, v14, v1, v3}, Lcom/bumptech/glide/load/resource/bitmap/a;-><init>(Ljava/util/List;Landroid/util/DisplayMetrics;Ll0/d;Ll0/b;)V

    if-eqz p13, :cond_1

    const/16 v13, 0x1c

    if-lt v7, v13, :cond_1

    .line 21
    new-instance v13, Lr0/t;

    invoke-direct {v13}, Lr0/t;-><init>()V

    .line 22
    new-instance v14, Lr0/h;

    invoke-direct {v14}, Lr0/h;-><init>()V

    goto :goto_0

    .line 23
    :cond_1
    new-instance v14, Lr0/g;

    invoke-direct {v14, v12}, Lr0/g;-><init>(Lcom/bumptech/glide/load/resource/bitmap/a;)V

    .line 24
    new-instance v13, Lcom/bumptech/glide/load/resource/bitmap/c;

    invoke-direct {v13, v12, v3}, Lcom/bumptech/glide/load/resource/bitmap/c;-><init>(Lcom/bumptech/glide/load/resource/bitmap/a;Ll0/b;)V

    .line 25
    :goto_0
    new-instance v15, Lt0/d;

    invoke-direct {v15, v2}, Lt0/d;-><init>(Landroid/content/Context;)V

    .line 26
    new-instance v6, Lo0/r$c;

    invoke-direct {v6, v4}, Lo0/r$c;-><init>(Landroid/content/res/Resources;)V

    .line 27
    new-instance v9, Lo0/r$d;

    invoke-direct {v9, v4}, Lo0/r$d;-><init>(Landroid/content/res/Resources;)V

    .line 28
    new-instance v0, Lo0/r$b;

    invoke-direct {v0, v4}, Lo0/r$b;-><init>(Landroid/content/res/Resources;)V

    move/from16 p3, v7

    .line 29
    new-instance v7, Lo0/r$a;

    invoke-direct {v7, v4}, Lo0/r$a;-><init>(Landroid/content/res/Resources;)V

    .line 30
    new-instance v2, Lr0/c;

    invoke-direct {v2, v3}, Lr0/c;-><init>(Ll0/b;)V

    move-object/from16 p6, v7

    .line 31
    new-instance v7, Lw0/a;

    invoke-direct {v7}, Lw0/a;-><init>()V

    move-object/from16 p7, v7

    .line 32
    new-instance v7, Lw0/d;

    invoke-direct {v7}, Lw0/d;-><init>()V

    move-object/from16 p13, v7

    .line 33
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v7

    move-object/from16 v16, v7

    .line 34
    new-instance v7, Lo0/c;

    invoke-direct {v7}, Lo0/c;-><init>()V

    move-object/from16 v17, v9

    .line 35
    const-class v9, Ljava/nio/ByteBuffer;

    invoke-virtual {v5, v9, v7}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Lh0/a;)Lcom/bumptech/glide/Registry;

    move-result-object v7

    move-object/from16 v18, v0

    new-instance v0, Lo0/s;

    invoke-direct {v0, v3}, Lo0/s;-><init>(Ll0/b;)V

    move-object/from16 v19, v6

    .line 36
    const-class v6, Ljava/io/InputStream;

    invoke-virtual {v7, v6, v0}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Lh0/a;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    .line 37
    const-string v7, "Bitmap"

    move-object/from16 v20, v15

    const-class v15, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v7, v9, v15, v14}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    .line 38
    invoke-virtual {v0, v7, v6, v15, v13}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/e;)Lcom/bumptech/glide/Registry;

    .line 39
    invoke-static {}, Li0/m;->c()Z

    move-result v0

    move/from16 v21, v0

    const-class v0, Landroid/os/ParcelFileDescriptor;

    if-eqz v21, :cond_2

    .line 40
    new-instance v3, Lr0/v;

    invoke-direct {v3, v12}, Lr0/v;-><init>(Lcom/bumptech/glide/load/resource/bitmap/a;)V

    invoke-virtual {v5, v7, v0, v15, v3}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/e;)Lcom/bumptech/glide/Registry;

    .line 41
    :cond_2
    invoke-virtual {v5, v7, v0, v15, v11}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/e;)Lcom/bumptech/glide/Registry;

    move-result-object v3

    .line 42
    invoke-static {v1}, Lr0/a0;->c(Ll0/d;)Lh0/e;

    move-result-object v12

    move-object/from16 v21, v5

    .line 43
    const-class v5, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {v3, v7, v5, v15, v12}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/e;)Lcom/bumptech/glide/Registry;

    move-result-object v3

    .line 44
    invoke-static {}, Lo0/u$a;->a()Lo0/u$a;

    move-result-object v12

    invoke-virtual {v3, v15, v15, v12}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v3

    new-instance v12, Lr0/y;

    invoke-direct {v12}, Lr0/y;-><init>()V

    .line 45
    invoke-virtual {v3, v7, v15, v15, v12}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/e;)Lcom/bumptech/glide/Registry;

    move-result-object v3

    .line 46
    invoke-virtual {v3, v15, v2}, Lcom/bumptech/glide/Registry;->b(Ljava/lang/Class;Lh0/f;)Lcom/bumptech/glide/Registry;

    move-result-object v3

    new-instance v12, Lr0/a;

    invoke-direct {v12, v4, v14}, Lr0/a;-><init>(Landroid/content/res/Resources;Lh0/e;)V

    .line 47
    const-string v14, "BitmapDrawable"

    move-object/from16 v22, v5

    const-class v5, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v3, v14, v9, v5, v12}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/e;)Lcom/bumptech/glide/Registry;

    move-result-object v3

    new-instance v12, Lr0/a;

    invoke-direct {v12, v4, v13}, Lr0/a;-><init>(Landroid/content/res/Resources;Lh0/e;)V

    .line 48
    invoke-virtual {v3, v14, v6, v5, v12}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/e;)Lcom/bumptech/glide/Registry;

    move-result-object v3

    new-instance v12, Lr0/a;

    invoke-direct {v12, v4, v11}, Lr0/a;-><init>(Landroid/content/res/Resources;Lh0/e;)V

    .line 49
    invoke-virtual {v3, v14, v0, v5, v12}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/e;)Lcom/bumptech/glide/Registry;

    move-result-object v3

    new-instance v11, Lr0/b;

    invoke-direct {v11, v1, v2}, Lr0/b;-><init>(Ll0/d;Lh0/f;)V

    .line 50
    invoke-virtual {v3, v5, v11}, Lcom/bumptech/glide/Registry;->b(Ljava/lang/Class;Lh0/f;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    new-instance v3, Lv0/h;

    move-object/from16 v11, p5

    invoke-direct {v3, v8, v10, v11}, Lv0/h;-><init>(Ljava/util/List;Lh0/e;Ll0/b;)V

    .line 51
    const-string v8, "Gif"

    const-class v12, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    invoke-virtual {v2, v8, v6, v12, v3}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/e;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    .line 52
    invoke-virtual {v2, v8, v9, v12, v10}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/e;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    new-instance v3, Lv0/c;

    invoke-direct {v3}, Lv0/c;-><init>()V

    .line 53
    invoke-virtual {v2, v12, v3}, Lcom/bumptech/glide/Registry;->b(Ljava/lang/Class;Lh0/f;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    .line 54
    invoke-static {}, Lo0/u$a;->a()Lo0/u$a;

    move-result-object v3

    .line 55
    const-class v8, Lg0/a;

    invoke-virtual {v2, v8, v8, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    new-instance v3, Lv0/f;

    invoke-direct {v3, v1}, Lv0/f;-><init>(Ll0/d;)V

    .line 56
    invoke-virtual {v2, v7, v8, v15, v3}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh0/e;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    .line 57
    const-class v3, Landroid/net/Uri;

    const-class v7, Landroid/graphics/drawable/Drawable;

    move-object/from16 v8, v20

    invoke-virtual {v2, v3, v7, v8}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;Lh0/e;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    new-instance v10, Lr0/w;

    invoke-direct {v10, v8, v1}, Lr0/w;-><init>(Lt0/d;Ll0/d;)V

    .line 58
    invoke-virtual {v2, v3, v15, v10}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;Lh0/e;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    new-instance v8, Ls0/a$a;

    invoke-direct {v8}, Ls0/a$a;-><init>()V

    .line 59
    invoke-virtual {v2, v8}, Lcom/bumptech/glide/Registry;->p(Li0/e$a;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    new-instance v8, Lo0/d$b;

    invoke-direct {v8}, Lo0/d$b;-><init>()V

    .line 60
    const-class v10, Ljava/io/File;

    invoke-virtual {v2, v10, v9, v8}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    new-instance v8, Lo0/f$e;

    invoke-direct {v8}, Lo0/f$e;-><init>()V

    .line 61
    invoke-virtual {v2, v10, v6, v8}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    new-instance v8, Lu0/a;

    invoke-direct {v8}, Lu0/a;-><init>()V

    .line 62
    invoke-virtual {v2, v10, v10, v8}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;Lh0/e;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    new-instance v8, Lo0/f$b;

    invoke-direct {v8}, Lo0/f$b;-><init>()V

    .line 63
    invoke-virtual {v2, v10, v0, v8}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    .line 64
    invoke-static {}, Lo0/u$a;->a()Lo0/u$a;

    move-result-object v8

    invoke-virtual {v2, v10, v10, v8}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    new-instance v8, Li0/k$a;

    invoke-direct {v8, v11}, Li0/k$a;-><init>(Ll0/b;)V

    .line 65
    invoke-virtual {v2, v8}, Lcom/bumptech/glide/Registry;->p(Li0/e$a;)Lcom/bumptech/glide/Registry;

    .line 66
    invoke-static {}, Li0/m;->c()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 67
    new-instance v2, Li0/m$a;

    invoke-direct {v2}, Li0/m$a;-><init>()V

    move-object/from16 v8, v21

    invoke-virtual {v8, v2}, Lcom/bumptech/glide/Registry;->p(Li0/e$a;)Lcom/bumptech/glide/Registry;

    goto :goto_1

    :cond_3
    move-object/from16 v8, v21

    .line 68
    :goto_1
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    move-object/from16 v13, v19

    invoke-virtual {v8, v2, v6, v13}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v14

    move-object/from16 v11, v18

    .line 69
    invoke-virtual {v14, v2, v0, v11}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v14

    move-object/from16 v18, v12

    .line 70
    const-class v12, Ljava/lang/Integer;

    invoke-virtual {v14, v12, v6, v13}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v13

    .line 71
    invoke-virtual {v13, v12, v0, v11}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v11

    move-object/from16 v13, v17

    .line 72
    invoke-virtual {v11, v12, v3, v13}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v11

    move-object/from16 v14, p6

    move-object/from16 v1, v22

    .line 73
    invoke-virtual {v11, v2, v1, v14}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v11

    .line 74
    invoke-virtual {v11, v12, v1, v14}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v11

    .line 75
    invoke-virtual {v11, v2, v3, v13}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    new-instance v11, Lo0/e$c;

    invoke-direct {v11}, Lo0/e$c;-><init>()V

    .line 76
    const-class v12, Ljava/lang/String;

    invoke-virtual {v2, v12, v6, v11}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    new-instance v11, Lo0/e$c;

    invoke-direct {v11}, Lo0/e$c;-><init>()V

    .line 77
    invoke-virtual {v2, v3, v6, v11}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    new-instance v11, Lo0/t$c;

    invoke-direct {v11}, Lo0/t$c;-><init>()V

    .line 78
    invoke-virtual {v2, v12, v6, v11}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    new-instance v11, Lo0/t$b;

    invoke-direct {v11}, Lo0/t$b;-><init>()V

    .line 79
    invoke-virtual {v2, v12, v0, v11}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    new-instance v11, Lo0/t$a;

    invoke-direct {v11}, Lo0/t$a;-><init>()V

    .line 80
    invoke-virtual {v2, v12, v1, v11}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    new-instance v11, Lp0/b$a;

    invoke-direct {v11}, Lp0/b$a;-><init>()V

    .line 81
    invoke-virtual {v2, v3, v6, v11}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    new-instance v11, Lo0/a$c;

    .line 82
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v12

    invoke-direct {v11, v12}, Lo0/a$c;-><init>(Landroid/content/res/AssetManager;)V

    invoke-virtual {v2, v3, v6, v11}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    new-instance v11, Lo0/a$b;

    .line 83
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v12

    invoke-direct {v11, v12}, Lo0/a$b;-><init>(Landroid/content/res/AssetManager;)V

    .line 84
    invoke-virtual {v2, v3, v0, v11}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    new-instance v11, Lp0/c$a;

    move-object/from16 v12, p1

    invoke-direct {v11, v12}, Lp0/c$a;-><init>(Landroid/content/Context;)V

    .line 85
    invoke-virtual {v2, v3, v6, v11}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    new-instance v11, Lp0/d$a;

    invoke-direct {v11, v12}, Lp0/d$a;-><init>(Landroid/content/Context;)V

    .line 86
    invoke-virtual {v2, v3, v6, v11}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    const/16 v2, 0x1d

    move/from16 v11, p3

    if-lt v11, v2, :cond_4

    .line 87
    new-instance v2, Lp0/e$c;

    invoke-direct {v2, v12}, Lp0/e$c;-><init>(Landroid/content/Context;)V

    invoke-virtual {v8, v3, v6, v2}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    .line 88
    new-instance v2, Lp0/e$b;

    invoke-direct {v2, v12}, Lp0/e$b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v8, v3, v0, v2}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    .line 89
    :cond_4
    new-instance v2, Lo0/v$d;

    move-object/from16 v11, v16

    invoke-direct {v2, v11}, Lo0/v$d;-><init>(Landroid/content/ContentResolver;)V

    .line 90
    invoke-virtual {v8, v3, v6, v2}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    new-instance v13, Lo0/v$b;

    invoke-direct {v13, v11}, Lo0/v$b;-><init>(Landroid/content/ContentResolver;)V

    .line 91
    invoke-virtual {v2, v3, v0, v13}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, Lo0/v$a;

    invoke-direct {v2, v11}, Lo0/v$a;-><init>(Landroid/content/ContentResolver;)V

    .line 92
    invoke-virtual {v0, v3, v1, v2}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Lo0/w$a;

    invoke-direct {v1}, Lo0/w$a;-><init>()V

    .line 93
    invoke-virtual {v0, v3, v6, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Lp0/h$a;

    invoke-direct {v1}, Lp0/h$a;-><init>()V

    .line 94
    const-class v2, Ljava/net/URL;

    invoke-virtual {v0, v2, v6, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Lo0/k$a;

    invoke-direct {v1, v12}, Lo0/k$a;-><init>(Landroid/content/Context;)V

    .line 95
    invoke-virtual {v0, v3, v10, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Lp0/a$a;

    invoke-direct {v1}, Lp0/a$a;-><init>()V

    .line 96
    const-class v2, Lo0/g;

    invoke-virtual {v0, v2, v6, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Lo0/b$a;

    invoke-direct {v1}, Lo0/b$a;-><init>()V

    .line 97
    const-class v2, [B

    invoke-virtual {v0, v2, v9, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Lo0/b$d;

    invoke-direct {v1}, Lo0/b$d;-><init>()V

    .line 98
    invoke-virtual {v0, v2, v6, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    .line 99
    invoke-static {}, Lo0/u$a;->a()Lo0/u$a;

    move-result-object v1

    invoke-virtual {v0, v3, v3, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    .line 100
    invoke-static {}, Lo0/u$a;->a()Lo0/u$a;

    move-result-object v1

    invoke-virtual {v0, v7, v7, v1}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;Lo0/n;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Lt0/e;

    invoke-direct {v1}, Lt0/e;-><init>()V

    .line 101
    invoke-virtual {v0, v7, v7, v1}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;Lh0/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v1, Lw0/b;

    invoke-direct {v1, v4}, Lw0/b;-><init>(Landroid/content/res/Resources;)V

    .line 102
    invoke-virtual {v0, v15, v5, v1}, Lcom/bumptech/glide/Registry;->q(Ljava/lang/Class;Ljava/lang/Class;Lw0/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    move-object/from16 v1, p7

    .line 103
    invoke-virtual {v0, v15, v2, v1}, Lcom/bumptech/glide/Registry;->q(Ljava/lang/Class;Ljava/lang/Class;Lw0/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v3, Lw0/c;

    move-object/from16 v6, p4

    move-object/from16 v10, p13

    invoke-direct {v3, v6, v1, v10}, Lw0/c;-><init>(Ll0/d;Lw0/e;Lw0/e;)V

    .line 104
    invoke-virtual {v0, v7, v2, v3}, Lcom/bumptech/glide/Registry;->q(Ljava/lang/Class;Ljava/lang/Class;Lw0/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    move-object/from16 v1, v18

    .line 105
    invoke-virtual {v0, v1, v2, v10}, Lcom/bumptech/glide/Registry;->q(Ljava/lang/Class;Ljava/lang/Class;Lw0/e;)Lcom/bumptech/glide/Registry;

    .line 106
    invoke-static {v6}, Lr0/a0;->d(Ll0/d;)Lh0/e;

    move-result-object v0

    .line 107
    invoke-virtual {v8, v9, v15, v0}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;Lh0/e;)Lcom/bumptech/glide/Registry;

    .line 108
    new-instance v1, Lr0/a;

    invoke-direct {v1, v4, v0}, Lr0/a;-><init>(Landroid/content/res/Resources;Lh0/e;)V

    invoke-virtual {v8, v9, v5, v1}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;Lh0/e;)Lcom/bumptech/glide/Registry;

    .line 109
    new-instance v5, Lb1/f;

    invoke-direct {v5}, Lb1/f;-><init>()V

    .line 110
    new-instance v1, Lcom/bumptech/glide/d;

    move-object/from16 v9, p2

    move-object/from16 v3, p5

    move/from16 v11, p8

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move/from16 v10, p12

    move-object v4, v8

    move-object v2, v12

    move-object/from16 v8, p11

    invoke-direct/range {v1 .. v11}, Lcom/bumptech/glide/d;-><init>(Landroid/content/Context;Ll0/b;Lcom/bumptech/glide/Registry;Lb1/f;Lcom/bumptech/glide/b$a;Ljava/util/Map;Ljava/util/List;Lcom/bumptech/glide/load/engine/f;ZI)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/bumptech/glide/b;->d:Lcom/bumptech/glide/d;

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/bumptech/glide/b;->m:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    sput-boolean v0, Lcom/bumptech/glide/b;->m:Z

    .line 7
    .line 8
    invoke-static {p0, p1}, Lcom/bumptech/glide/b;->m(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    sput-boolean p0, Lcom/bumptech/glide/b;->m:Z

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

.method public static c(Landroid/content/Context;)Lcom/bumptech/glide/b;
    .locals 3

    .line 1
    sget-object v0, Lcom/bumptech/glide/b;->l:Lcom/bumptech/glide/b;

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
    invoke-static {v0}, Lcom/bumptech/glide/b;->d(Landroid/content/Context;)Lcom/bumptech/glide/GeneratedAppGlideModule;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-class v1, Lcom/bumptech/glide/b;

    .line 14
    .line 15
    monitor-enter v1

    .line 16
    :try_start_0
    sget-object v2, Lcom/bumptech/glide/b;->l:Lcom/bumptech/glide/b;

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    invoke-static {p0, v0}, Lcom/bumptech/glide/b;->a(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    monitor-exit v1

    .line 27
    goto :goto_2

    .line 28
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw p0

    .line 30
    :cond_1
    :goto_2
    sget-object p0, Lcom/bumptech/glide/b;->l:Lcom/bumptech/glide/b;

    .line 31
    .line 32
    return-object p0
.end method

.method public static d(Landroid/content/Context;)Lcom/bumptech/glide/GeneratedAppGlideModule;
    .locals 2

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
    const-class v1, Landroid/content/Context;

    .line 8
    .line 9
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Lcom/bumptech/glide/GeneratedAppGlideModule;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    return-object p0

    .line 32
    :catch_0
    move-exception p0

    .line 33
    invoke-static {p0}, Lcom/bumptech/glide/b;->q(Ljava/lang/Exception;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catch_1
    move-exception p0

    .line 38
    invoke-static {p0}, Lcom/bumptech/glide/b;->q(Ljava/lang/Exception;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catch_2
    move-exception p0

    .line 43
    invoke-static {p0}, Lcom/bumptech/glide/b;->q(Ljava/lang/Exception;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catch_3
    move-exception p0

    .line 48
    invoke-static {p0}, Lcom/bumptech/glide/b;->q(Ljava/lang/Exception;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catch_4
    const/4 p0, 0x5

    .line 53
    const-string v0, "Glide"

    .line 54
    .line 55
    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-eqz p0, :cond_0

    .line 60
    .line 61
    const-string p0, "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored"

    .line 62
    .line 63
    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    :cond_0
    :goto_0
    const/4 p0, 0x0

    .line 67
    return-object p0
.end method

.method public static l(Landroid/content/Context;)Lx0/m;
    .locals 1

    .line 1
    const-string v0, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."

    .line 2
    .line 3
    invoke-static {p0, v0}, Le1/i;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lcom/bumptech/glide/b;->k()Lx0/m;

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
    new-instance v0, Lcom/bumptech/glide/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/bumptech/glide/c;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0, p1}, Lcom/bumptech/glide/b;->n(Landroid/content/Context;Lcom/bumptech/glide/c;Lcom/bumptech/glide/GeneratedAppGlideModule;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static n(Landroid/content/Context;Lcom/bumptech/glide/c;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2}, Ly0/a;->c()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    :cond_0
    new-instance v0, Ly0/d;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Ly0/d;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ly0/d;->a()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    const/4 v1, 0x0

    .line 25
    if-eqz p2, :cond_3

    .line 26
    .line 27
    invoke-virtual {p2}, Lcom/bumptech/glide/GeneratedAppGlideModule;->d()Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_3

    .line 36
    .line 37
    invoke-virtual {p2}, Lcom/bumptech/glide/GeneratedAppGlideModule;->d()Ljava/util/Set;

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, Lq/a;->a(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    throw v1

    .line 59
    :cond_3
    :goto_0
    const-string v2, "Glide"

    .line 60
    .line 61
    const/4 v3, 0x3

    .line 62
    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_5

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-nez v3, :cond_4

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {p0}, Lq/a;->a(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    throw v1

    .line 87
    :cond_5
    :goto_1
    if-eqz p2, :cond_6

    .line 88
    .line 89
    invoke-virtual {p2}, Lcom/bumptech/glide/GeneratedAppGlideModule;->e()Lx0/m$b;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    goto :goto_2

    .line 94
    :cond_6
    move-object v2, v1

    .line 95
    :goto_2
    invoke-virtual {p1, v2}, Lcom/bumptech/glide/c;->b(Lx0/m$b;)V

    .line 96
    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-nez v3, :cond_a

    .line 107
    .line 108
    if-eqz p2, :cond_7

    .line 109
    .line 110
    invoke-virtual {p2, p0, p1}, Ly0/a;->b(Landroid/content/Context;Lcom/bumptech/glide/c;)V

    .line 111
    .line 112
    .line 113
    :cond_7
    invoke-virtual {p1, p0}, Lcom/bumptech/glide/c;->a(Landroid/content/Context;)Lcom/bumptech/glide/b;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-nez v2, :cond_9

    .line 126
    .line 127
    if-eqz p2, :cond_8

    .line 128
    .line 129
    iget-object v0, p1, Lcom/bumptech/glide/b;->e:Lcom/bumptech/glide/Registry;

    .line 130
    .line 131
    invoke-virtual {p2, p0, p1, v0}, Ly0/c;->a(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/Registry;)V

    .line 132
    .line 133
    .line 134
    :cond_8
    invoke-virtual {p0, p1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 135
    .line 136
    .line 137
    sput-object p1, Lcom/bumptech/glide/b;->l:Lcom/bumptech/glide/b;

    .line 138
    .line 139
    return-void

    .line 140
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-static {p0}, Lq/a;->a(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    :try_start_0
    iget-object p0, p1, Lcom/bumptech/glide/b;->e:Lcom/bumptech/glide/Registry;
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    .line 149
    throw v1

    .line 150
    :catch_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 151
    .line 152
    new-instance p0, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 155
    .line 156
    .line 157
    const-string p1, "Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you\'re using Glide v4. You\'ll need to find and remove (or update) the offending dependency. The v3 module name is: "

    .line 158
    .line 159
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    throw v1

    .line 163
    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-static {p0}, Lq/a;->a(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
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

.method public static t(Landroid/content/Context;)Lcom/bumptech/glide/f;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/bumptech/glide/b;->l(Landroid/content/Context;)Lx0/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lx0/m;->k(Landroid/content/Context;)Lcom/bumptech/glide/f;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static u(Landroid/view/View;)Lcom/bumptech/glide/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/bumptech/glide/b;->l(Landroid/content/Context;)Lx0/m;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p0}, Lx0/m;->l(Landroid/view/View;)Lcom/bumptech/glide/f;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static v(Landroidx/fragment/app/Fragment;)Lcom/bumptech/glide/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/bumptech/glide/b;->l(Landroid/content/Context;)Lx0/m;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p0}, Lx0/m;->m(Landroidx/fragment/app/Fragment;)Lcom/bumptech/glide/f;

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
    invoke-static {}, Le1/j;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bumptech/glide/b;->c:Lm0/h;

    .line 5
    .line 6
    invoke-interface {v0}, Lm0/h;->b()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/bumptech/glide/b;->b:Ll0/d;

    .line 10
    .line 11
    invoke-interface {v0}, Ll0/d;->b()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/bumptech/glide/b;->f:Ll0/b;

    .line 15
    .line 16
    invoke-interface {v0}, Ll0/b;->b()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public e()Ll0/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/b;->f:Ll0/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Ll0/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/b;->b:Ll0/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()Lx0/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/b;->h:Lx0/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/b;->d:Lcom/bumptech/glide/d;

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

.method public i()Lcom/bumptech/glide/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/b;->d:Lcom/bumptech/glide/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()Lcom/bumptech/glide/Registry;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/b;->e:Lcom/bumptech/glide/Registry;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()Lx0/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/b;->g:Lx0/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public o(Lcom/bumptech/glide/f;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/b;->i:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/b;->i:Ljava/util/List;

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
    iget-object v1, p0, Lcom/bumptech/glide/b;->i:Ljava/util/List;

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
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v1, "Cannot register already registered manager"

    .line 24
    .line 25
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw p1
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public onLowMemory()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/bumptech/glide/b;->b()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onTrimMemory(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/b;->r(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public p(Lb1/h;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/b;->i:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/b;->i:Ljava/util/List;

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
    check-cast v2, Lcom/bumptech/glide/f;

    .line 21
    .line 22
    invoke-virtual {v2, p1}, Lcom/bumptech/glide/f;->y(Lb1/h;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    monitor-exit v0

    .line 30
    return p1

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    monitor-exit v0

    .line 34
    const/4 p1, 0x0

    .line 35
    return p1

    .line 36
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    throw p1
.end method

.method public r(I)V
    .locals 2

    .line 1
    invoke-static {}, Le1/j;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bumptech/glide/b;->i:Ljava/util/List;

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
    check-cast v1, Lcom/bumptech/glide/f;

    .line 21
    .line 22
    invoke-virtual {v1, p1}, Lcom/bumptech/glide/f;->onTrimMemory(I)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/b;->c:Lm0/h;

    .line 27
    .line 28
    invoke-interface {v0, p1}, Lm0/h;->a(I)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/bumptech/glide/b;->b:Ll0/d;

    .line 32
    .line 33
    invoke-interface {v0, p1}, Ll0/d;->a(I)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/bumptech/glide/b;->f:Ll0/b;

    .line 37
    .line 38
    invoke-interface {v0, p1}, Ll0/b;->a(I)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public s(Lcom/bumptech/glide/f;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/b;->i:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/b;->i:Ljava/util/List;

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
    iget-object v1, p0, Lcom/bumptech/glide/b;->i:Ljava/util/List;

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
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v1, "Cannot unregister not yet registered manager"

    .line 24
    .line 25
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw p1
.end method

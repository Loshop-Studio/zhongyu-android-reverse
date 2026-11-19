.class public final Lcom/canhub/cropper/BitmapCroppingWorkerJob;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li8/b0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/ref/WeakReference;

.field public final c:Landroid/net/Uri;

.field public final d:Landroid/graphics/Bitmap;

.field public final e:[F

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:Z

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:I

.field public final n:Z

.field public final o:Z

.field public final p:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

.field public final q:Landroid/graphics/Bitmap$CompressFormat;

.field public final r:I

.field public final s:Landroid/net/Uri;

.field public t:Lkotlinx/coroutines/n;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/ref/WeakReference;Landroid/net/Uri;Landroid/graphics/Bitmap;[FIIIZIIIIZZLcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)V
    .locals 3

    move-object/from16 v0, p16

    move-object/from16 v1, p17

    const-string v2, "context"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "cropImageViewReference"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "cropPoints"

    invoke-static {p5, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "options"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "saveCompressFormat"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->b:Ljava/lang/ref/WeakReference;

    .line 4
    iput-object p3, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->c:Landroid/net/Uri;

    .line 5
    iput-object p4, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->d:Landroid/graphics/Bitmap;

    .line 6
    iput-object p5, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->e:[F

    .line 7
    iput p6, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->f:I

    .line 8
    iput p7, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->g:I

    .line 9
    iput p8, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->h:I

    .line 10
    iput-boolean p9, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->i:Z

    .line 11
    iput p10, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->j:I

    .line 12
    iput p11, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->k:I

    .line 13
    iput p12, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->l:I

    move/from16 p1, p13

    .line 14
    iput p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->m:I

    move/from16 p1, p14

    .line 15
    iput-boolean p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->n:Z

    move/from16 p1, p15

    .line 16
    iput-boolean p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->o:Z

    .line 17
    iput-object v0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->p:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 18
    iput-object v1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->q:Landroid/graphics/Bitmap$CompressFormat;

    move/from16 p1, p18

    .line 19
    iput p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->r:I

    move-object/from16 p1, p19

    .line 20
    iput-object p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->s:Landroid/net/Uri;

    const/4 p1, 0x0

    const/4 p2, 0x1

    .line 21
    invoke-static {p1, p2, p1}, Li8/b1;->b(Lkotlinx/coroutines/n;ILjava/lang/Object;)Li8/u;

    move-result-object p1

    iput-object p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->t:Lkotlinx/coroutines/n;

    return-void
.end method

.method public static final synthetic a(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->j:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic b(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->k:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic c(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->d:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->b:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)[F
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->e:[F

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->s:Landroid/net/Uri;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic i(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->i:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic j(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->n:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic k(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->o:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic l(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Lcom/canhub/cropper/CropImageView$RequestSizeOptions;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->p:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic m(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->h:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic n(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->g:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic o(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->m:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic p(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->l:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic q(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Landroid/graphics/Bitmap$CompressFormat;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->q:Landroid/graphics/Bitmap$CompressFormat;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic r(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->r:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic s(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->c:Landroid/net/Uri;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic t(Lcom/canhub/cropper/BitmapCroppingWorkerJob;Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->v(Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;Lm7/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public getCoroutineContext()Lkotlin/coroutines/d;
    .locals 2

    .line 1
    invoke-static {}, Li8/i0;->c()Li8/h1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->t:Lkotlinx/coroutines/n;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lkotlin/coroutines/a;->plus(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final u()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->t:Lkotlinx/coroutines/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/n$a;->a(Lkotlinx/coroutines/n;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final v(Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;Lm7/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Li8/i0;->c()Li8/h1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;-><init>(Lcom/canhub/cropper/BitmapCroppingWorkerJob;Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;Lm7/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, Li8/f;->g(Lkotlin/coroutines/d;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-ne p1, p2, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 23
    .line 24
    return-object p1
.end method

.method public final w()V
    .locals 6

    .line 1
    invoke-static {}, Li8/i0;->a()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    new-instance v3, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-direct {v3, p0, v0}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;-><init>(Lcom/canhub/cropper/BitmapCroppingWorkerJob;Lm7/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x2

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    move-object v0, p0

    .line 15
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iput-object v1, v0, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->t:Lkotlinx/coroutines/n;

    .line 20
    .line 21
    return-void
.end method

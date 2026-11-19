.class public final Lcom/canhub/cropper/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/v;


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

.field public t:Lkotlinx/coroutines/c1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/ref/WeakReference;Landroid/net/Uri;Landroid/graphics/Bitmap;[FIIIZIIIIZZLcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)V
    .locals 3

    move-object/from16 v0, p16

    move-object/from16 v1, p17

    const-string v2, "cropPoints"

    invoke-static {p5, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "options"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "saveCompressFormat"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/canhub/cropper/b;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lcom/canhub/cropper/b;->b:Ljava/lang/ref/WeakReference;

    .line 4
    iput-object p3, p0, Lcom/canhub/cropper/b;->c:Landroid/net/Uri;

    .line 5
    iput-object p4, p0, Lcom/canhub/cropper/b;->d:Landroid/graphics/Bitmap;

    .line 6
    iput-object p5, p0, Lcom/canhub/cropper/b;->e:[F

    .line 7
    iput p6, p0, Lcom/canhub/cropper/b;->f:I

    .line 8
    iput p7, p0, Lcom/canhub/cropper/b;->g:I

    .line 9
    iput p8, p0, Lcom/canhub/cropper/b;->h:I

    .line 10
    iput-boolean p9, p0, Lcom/canhub/cropper/b;->i:Z

    .line 11
    iput p10, p0, Lcom/canhub/cropper/b;->j:I

    .line 12
    iput p11, p0, Lcom/canhub/cropper/b;->k:I

    .line 13
    iput p12, p0, Lcom/canhub/cropper/b;->l:I

    move/from16 p1, p13

    .line 14
    iput p1, p0, Lcom/canhub/cropper/b;->m:I

    move/from16 p1, p14

    .line 15
    iput-boolean p1, p0, Lcom/canhub/cropper/b;->n:Z

    move/from16 p1, p15

    .line 16
    iput-boolean p1, p0, Lcom/canhub/cropper/b;->o:Z

    .line 17
    iput-object v0, p0, Lcom/canhub/cropper/b;->p:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 18
    iput-object v1, p0, Lcom/canhub/cropper/b;->q:Landroid/graphics/Bitmap$CompressFormat;

    move/from16 p1, p18

    .line 19
    iput p1, p0, Lcom/canhub/cropper/b;->r:I

    move-object/from16 p1, p19

    .line 20
    iput-object p1, p0, Lcom/canhub/cropper/b;->s:Landroid/net/Uri;

    .line 21
    invoke-static {}, Lkotlinx/coroutines/x;->b()Lkotlinx/coroutines/x0;

    move-result-object p1

    iput-object p1, p0, Lcom/canhub/cropper/b;->t:Lkotlinx/coroutines/c1;

    return-void
.end method

.method public static final a(Lcom/canhub/cropper/b;Lcom/canhub/cropper/a;Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 5
    .line 6
    sget-object v0, Le7/k;->a:Ld7/d;

    .line 7
    .line 8
    new-instance v1, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, p0, p1, v2}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;-><init>(Lcom/canhub/cropper/b;Lcom/canhub/cropper/a;Lh6/c;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/x;->F(Lh6/h;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 19
    .line 20
    if-ne p0, p1, :cond_0

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 24
    .line 25
    return-object p0
.end method


# virtual methods
.method public final getCoroutineContext()Lh6/h;
    .locals 2

    .line 1
    sget-object v0, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 2
    .line 3
    sget-object v0, Le7/k;->a:Ld7/d;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/canhub/cropper/b;->t:Lkotlinx/coroutines/c1;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lh6/a;->plus(Lh6/h;)Lh6/h;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

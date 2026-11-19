.class final Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.canhub.cropper.BitmapCroppingWorkerJob$onPostExecute$2"
    f = "BitmapCroppingWorkerJob.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $result:Lcom/canhub/cropper/a;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/canhub/cropper/b;


# direct methods
.method public constructor <init>(Lcom/canhub/cropper/b;Lcom/canhub/cropper/a;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/canhub/cropper/b;",
            "Lcom/canhub/cropper/a;",
            "Lh6/c<",
            "-",
            "Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->this$0:Lcom/canhub/cropper/b;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->$result:Lcom/canhub/cropper/a;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->this$0:Lcom/canhub/cropper/b;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->$result:Lcom/canhub/cropper/a;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;-><init>(Lcom/canhub/cropper/b;Lcom/canhub/cropper/a;Lh6/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lkotlinx/coroutines/v;

    .line 13
    .line 14
    new-instance v0, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 15
    .line 16
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lkotlinx/coroutines/x;->s(Lkotlinx/coroutines/v;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->this$0:Lcom/canhub/cropper/b;

    .line 26
    .line 27
    iget-object p1, p1, Lcom/canhub/cropper/b;->b:Ljava/lang/ref/WeakReference;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lcom/canhub/cropper/CropImageView;

    .line 34
    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    iget-object v1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->$result:Lcom/canhub/cropper/a;

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    iput-boolean v2, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 41
    .line 42
    const-string/jumbo v2, "result"

    .line 43
    .line 44
    .line 45
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    iput-object v2, p1, Lcom/canhub/cropper/CropImageView;->L:Ljava/lang/ref/WeakReference;

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/canhub/cropper/CropImageView;->i()V

    .line 52
    .line 53
    .line 54
    iget-object v2, p1, Lcom/canhub/cropper/CropImageView;->B:Lcom/canhub/cropper/v;

    .line 55
    .line 56
    if-eqz v2, :cond_0

    .line 57
    .line 58
    new-instance v3, Lcom/canhub/cropper/u;

    .line 59
    .line 60
    iget-object v4, p1, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 61
    .line 62
    iget-object v5, v1, Lcom/canhub/cropper/a;->b:Landroid/net/Uri;

    .line 63
    .line 64
    iget-object v6, v1, Lcom/canhub/cropper/a;->c:Ljava/lang/Exception;

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/canhub/cropper/CropImageView;->getCropPoints()[F

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-virtual {p1}, Lcom/canhub/cropper/CropImageView;->getCropRect()Landroid/graphics/Rect;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-virtual {p1}, Lcom/canhub/cropper/CropImageView;->getWholeImageRect()Landroid/graphics/Rect;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    invoke-virtual {p1}, Lcom/canhub/cropper/CropImageView;->getRotatedDegrees()I

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    iget v11, v1, Lcom/canhub/cropper/a;->d:I

    .line 83
    .line 84
    invoke-direct/range {v3 .. v11}, Lcom/canhub/cropper/u;-><init>(Landroid/net/Uri;Landroid/net/Uri;Ljava/lang/Exception;[FLandroid/graphics/Rect;Landroid/graphics/Rect;II)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v2, p1, v3}, Lcom/canhub/cropper/v;->onCropImageComplete(Lcom/canhub/cropper/CropImageView;Lcom/canhub/cropper/u;)V

    .line 88
    .line 89
    .line 90
    :cond_0
    iget-boolean p1, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 91
    .line 92
    if-nez p1, :cond_1

    .line 93
    .line 94
    iget-object p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->$result:Lcom/canhub/cropper/a;

    .line 95
    .line 96
    iget-object p1, p1, Lcom/canhub/cropper/a;->a:Landroid/graphics/Bitmap;

    .line 97
    .line 98
    if-eqz p1, :cond_1

    .line 99
    .line 100
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 101
    .line 102
    .line 103
    :cond_1
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 104
    .line 105
    return-object p1

    .line 106
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 107
    .line 108
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 109
    .line 110
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1
.end method

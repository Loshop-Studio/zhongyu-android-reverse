.class final Lcom/canhub/cropper/BitmapLoadingWorkerJob$onPostExecute$2;
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
    c = "com.canhub.cropper.BitmapLoadingWorkerJob$onPostExecute$2"
    f = "BitmapLoadingWorkerJob.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $result:Lcom/canhub/cropper/c;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/canhub/cropper/d;


# direct methods
.method public constructor <init>(Lcom/canhub/cropper/d;Lcom/canhub/cropper/c;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/canhub/cropper/d;",
            "Lcom/canhub/cropper/c;",
            "Lh6/c<",
            "-",
            "Lcom/canhub/cropper/BitmapLoadingWorkerJob$onPostExecute$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$onPostExecute$2;->this$0:Lcom/canhub/cropper/d;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$onPostExecute$2;->$result:Lcom/canhub/cropper/c;

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
    new-instance v0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$onPostExecute$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$onPostExecute$2;->this$0:Lcom/canhub/cropper/d;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$onPostExecute$2;->$result:Lcom/canhub/cropper/c;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$onPostExecute$2;-><init>(Lcom/canhub/cropper/d;Lcom/canhub/cropper/c;Lh6/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$onPostExecute$2;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$onPostExecute$2;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$onPostExecute$2;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/canhub/cropper/BitmapLoadingWorkerJob$onPostExecute$2;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$onPostExecute$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$onPostExecute$2;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$onPostExecute$2;->L$0:Ljava/lang/Object;

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
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object p1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$onPostExecute$2;->this$0:Lcom/canhub/cropper/d;

    .line 26
    .line 27
    iget-object p1, p1, Lcom/canhub/cropper/d;->e:Ljava/lang/ref/WeakReference;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    move-object v1, p1

    .line 34
    check-cast v1, Lcom/canhub/cropper/CropImageView;

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    iget-object p1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$onPostExecute$2;->$result:Lcom/canhub/cropper/c;

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    iput-boolean v2, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 42
    .line 43
    const-string/jumbo v2, "result"

    .line 44
    .line 45
    .line 46
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v4, p1, Lcom/canhub/cropper/c;->a:Landroid/net/Uri;

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    iput-object v2, v1, Lcom/canhub/cropper/CropImageView;->K:Ljava/lang/ref/WeakReference;

    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/canhub/cropper/CropImageView;->i()V

    .line 55
    .line 56
    .line 57
    iget-object v7, p1, Lcom/canhub/cropper/c;->g:Ljava/lang/Exception;

    .line 58
    .line 59
    if-nez v7, :cond_0

    .line 60
    .line 61
    iget v6, p1, Lcom/canhub/cropper/c;->d:I

    .line 62
    .line 63
    iput v6, v1, Lcom/canhub/cropper/CropImageView;->j:I

    .line 64
    .line 65
    iget-boolean v2, p1, Lcom/canhub/cropper/c;->e:Z

    .line 66
    .line 67
    iput-boolean v2, v1, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 68
    .line 69
    iget-boolean v2, p1, Lcom/canhub/cropper/c;->f:Z

    .line 70
    .line 71
    iput-boolean v2, v1, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 72
    .line 73
    iget-object v2, p1, Lcom/canhub/cropper/c;->b:Landroid/graphics/Bitmap;

    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    iget v5, p1, Lcom/canhub/cropper/c;->c:I

    .line 77
    .line 78
    invoke-virtual/range {v1 .. v6}, Lcom/canhub/cropper/CropImageView;->g(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V

    .line 79
    .line 80
    .line 81
    :cond_0
    iget-object p1, v1, Lcom/canhub/cropper/CropImageView;->A:Lcom/canhub/cropper/z;

    .line 82
    .line 83
    if-eqz p1, :cond_1

    .line 84
    .line 85
    invoke-interface {p1, v1, v4, v7}, Lcom/canhub/cropper/z;->onSetImageUriComplete(Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V

    .line 86
    .line 87
    .line 88
    :cond_1
    iget-boolean p1, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 89
    .line 90
    if-nez p1, :cond_2

    .line 91
    .line 92
    iget-object p1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$onPostExecute$2;->$result:Lcom/canhub/cropper/c;

    .line 93
    .line 94
    iget-object p1, p1, Lcom/canhub/cropper/c;->b:Landroid/graphics/Bitmap;

    .line 95
    .line 96
    if-eqz p1, :cond_2

    .line 97
    .line 98
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 99
    .line 100
    .line 101
    :cond_2
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 102
    .line 103
    return-object p1

    .line 104
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 105
    .line 106
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 107
    .line 108
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p1
.end method

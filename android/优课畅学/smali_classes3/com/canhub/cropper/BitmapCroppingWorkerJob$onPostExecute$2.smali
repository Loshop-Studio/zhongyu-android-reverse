.class final Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/canhub/cropper/BitmapCroppingWorkerJob;->v(Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.canhub.cropper.BitmapCroppingWorkerJob$onPostExecute$2"
    f = "BitmapCroppingWorkerJob.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/canhub/cropper/BitmapCroppingWorkerJob;

.field public final synthetic d:Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;


# direct methods
.method public constructor <init>(Lcom/canhub/cropper/BitmapCroppingWorkerJob;Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->c:Lcom/canhub/cropper/BitmapCroppingWorkerJob;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->d:Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance v0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->c:Lcom/canhub/cropper/BitmapCroppingWorkerJob;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->d:Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;-><init>(Lcom/canhub/cropper/BitmapCroppingWorkerJob;Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->b:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Li8/b0;

    .line 14
    .line 15
    new-instance v0, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 16
    .line 17
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lkotlinx/coroutines/e;->g(Li8/b0;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    iget-object p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->c:Lcom/canhub/cropper/BitmapCroppingWorkerJob;

    .line 27
    .line 28
    invoke-static {p1}, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->e(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lcom/canhub/cropper/CropImageView;

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    iget-object v1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->d:Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    iput-boolean v2, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->a:Z

    .line 44
    .line 45
    invoke-virtual {p1, v1}, Lcom/canhub/cropper/CropImageView;->l(Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    iget-boolean p1, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->a:Z

    .line 49
    .line 50
    if-nez p1, :cond_1

    .line 51
    .line 52
    iget-object p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->d:Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;->a()Landroid/graphics/Bitmap;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    iget-object p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$onPostExecute$2;->d:Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;->a()Landroid/graphics/Bitmap;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 67
    .line 68
    .line 69
    :cond_1
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 75
    .line 76
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p1
.end method

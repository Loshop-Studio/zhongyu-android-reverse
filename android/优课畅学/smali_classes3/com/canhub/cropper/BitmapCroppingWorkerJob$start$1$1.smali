.class final Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.canhub.cropper.BitmapCroppingWorkerJob$start$1$1"
    f = "BitmapCroppingWorkerJob.kt"
    l = {
        0x68
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/canhub/cropper/BitmapCroppingWorkerJob;

.field public final synthetic c:Landroid/graphics/Bitmap;

.field public final synthetic d:Lcom/canhub/cropper/a$a;


# direct methods
.method public constructor <init>(Lcom/canhub/cropper/BitmapCroppingWorkerJob;Landroid/graphics/Bitmap;Lcom/canhub/cropper/a$a;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;->b:Lcom/canhub/cropper/BitmapCroppingWorkerJob;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;->c:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;->d:Lcom/canhub/cropper/a$a;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;->b:Lcom/canhub/cropper/BitmapCroppingWorkerJob;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;->c:Landroid/graphics/Bitmap;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;->d:Lcom/canhub/cropper/a$a;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;-><init>(Lcom/canhub/cropper/BitmapCroppingWorkerJob;Landroid/graphics/Bitmap;Lcom/canhub/cropper/a$a;Lm7/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object v3, Lcom/canhub/cropper/a;->a:Lcom/canhub/cropper/a;

    .line 28
    .line 29
    iget-object p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;->b:Lcom/canhub/cropper/BitmapCroppingWorkerJob;

    .line 30
    .line 31
    invoke-static {p1}, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->d(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget-object v5, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;->c:Landroid/graphics/Bitmap;

    .line 36
    .line 37
    iget-object p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;->b:Lcom/canhub/cropper/BitmapCroppingWorkerJob;

    .line 38
    .line 39
    invoke-static {p1}, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->q(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Landroid/graphics/Bitmap$CompressFormat;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    iget-object p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;->b:Lcom/canhub/cropper/BitmapCroppingWorkerJob;

    .line 44
    .line 45
    invoke-static {p1}, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->r(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    iget-object p1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;->b:Lcom/canhub/cropper/BitmapCroppingWorkerJob;

    .line 50
    .line 51
    invoke-static {p1}, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->g(Lcom/canhub/cropper/BitmapCroppingWorkerJob;)Landroid/net/Uri;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    invoke-virtual/range {v3 .. v8}, Lcom/canhub/cropper/a;->J(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)Landroid/net/Uri;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object v1, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;->b:Lcom/canhub/cropper/BitmapCroppingWorkerJob;

    .line 60
    .line 61
    iget-object v3, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;->d:Lcom/canhub/cropper/a$a;

    .line 62
    .line 63
    invoke-virtual {v3}, Lcom/canhub/cropper/a$a;->b()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    new-instance v4, Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;

    .line 68
    .line 69
    iget-object v5, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;->c:Landroid/graphics/Bitmap;

    .line 70
    .line 71
    const/4 v6, 0x0

    .line 72
    invoke-direct {v4, v5, p1, v6, v3}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;-><init>(Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;I)V

    .line 73
    .line 74
    .line 75
    iput v2, p0, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1$1;->a:I

    .line 76
    .line 77
    invoke-static {v1, v4, p0}, Lcom/canhub/cropper/BitmapCroppingWorkerJob;->t(Lcom/canhub/cropper/BitmapCroppingWorkerJob;Lcom/canhub/cropper/BitmapCroppingWorkerJob$a;Lm7/c;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-ne p1, v0, :cond_2

    .line 82
    .line 83
    return-object v0

    .line 84
    :cond_2
    :goto_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 85
    .line 86
    return-object p1
.end method

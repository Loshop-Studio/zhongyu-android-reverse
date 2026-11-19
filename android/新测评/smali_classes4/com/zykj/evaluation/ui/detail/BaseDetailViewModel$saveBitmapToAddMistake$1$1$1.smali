.class final Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljava/lang/Boolean;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.evaluation.ui.detail.BaseDetailViewModel$saveBitmapToAddMistake$1$1$1"
    f = "BaseDetailViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

.field public final synthetic c:Landroid/graphics/Bitmap;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Landroid/graphics/Bitmap;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1$1;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1$1;->c:Landroid/graphics/Bitmap;

    iput-object p3, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1$1;->d:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance p1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1$1;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1$1;->c:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1$1;->d:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1$1;-><init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Landroid/graphics/Bitmap;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1$1;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1$1;->c:Landroid/graphics/Bitmap;

    .line 14
    .line 15
    invoke-static {p1, v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->m(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1$1;->d:Ljava/lang/String;

    .line 20
    .line 21
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->WEBP:Landroid/graphics/Bitmap$CompressFormat;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-static {p1, v0, v1, v2}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;Z)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
.end method

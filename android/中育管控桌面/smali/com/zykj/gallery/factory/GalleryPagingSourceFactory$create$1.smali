.class final Lcom/zykj/gallery/factory/GalleryPagingSourceFactory$create$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;->d(Lkotlin/Unit;)Landroidx/paging/PagingSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/zykj/gallery/bean/PagedData<",
        "Lcom/zykj/gallery/bean/GalleryImgBean;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/zykj/gallery/bean/PagedData;",
        "Lcom/zykj/gallery/bean/GalleryImgBean;",
        "skipCount",
        "",
        "maxResultCount"
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
    c = "com.zykj.gallery.factory.GalleryPagingSourceFactory$create$1"
    f = "GalleryPagingSourceFactory.kt"
    i = {
        0x0,
        0x0,
        0x0
    }
    l = {
        0x15
    }
    m = "invokeSuspend"
    n = {
        "skipCount",
        "maxResultCount",
        "isRecycleBin"
    }
    s = {
        "I$0",
        "I$1",
        "Z$0"
    }
.end annotation


# instance fields
.field public a:Z

.field public b:I

.field public synthetic c:I

.field public synthetic d:I

.field public final synthetic e:Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;


# direct methods
.method public constructor <init>(Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory$create$1;->e:Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory$create$1;

    iget-object v1, p0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory$create$1;->e:Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;

    invoke-direct {v0, v1, p3}, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory$create$1;-><init>(Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;Lkotlin/coroutines/Continuation;)V

    iput p1, v0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory$create$1;->c:I

    iput p2, v0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory$create$1;->d:I

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory$create$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory$create$1;->a(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory$create$1;->c:I

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory$create$1;->d:I

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget v3, p0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory$create$1;->b:I

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    if-eqz v3, :cond_1

    .line 13
    .line 14
    if-ne v3, v4, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory$create$1;->e:Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;

    .line 33
    .line 34
    invoke-static {p1}, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;->c(Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;)Lkotlin/jvm/functions/Function0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    iget-object v3, p0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory$create$1;->e:Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;

    .line 49
    .line 50
    invoke-static {v3}, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;->b(Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;)Lcom/zykj/gallery/repository/GalleryRepository;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    iput v0, p0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory$create$1;->c:I

    .line 55
    .line 56
    iput v1, p0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory$create$1;->d:I

    .line 57
    .line 58
    iput-boolean p1, p0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory$create$1;->a:Z

    .line 59
    .line 60
    iput v4, p0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory$create$1;->b:I

    .line 61
    .line 62
    invoke-virtual {v3, v0, v1, p1, p0}, Lcom/zykj/gallery/repository/GalleryRepository;->e(IIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v2, :cond_2

    .line 67
    .line 68
    return-object v2

    .line 69
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory$create$1;->e:Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;

    .line 70
    .line 71
    move-object v1, p1

    .line 72
    check-cast v1, Lcom/zykj/gallery/bean/PagedData;

    .line 73
    .line 74
    invoke-static {v0}, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;->a(Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;)Lkotlin/jvm/functions/Function1;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v1}, Lcom/zykj/gallery/bean/PagedData;->getTotalCount()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    return-object p1
.end method

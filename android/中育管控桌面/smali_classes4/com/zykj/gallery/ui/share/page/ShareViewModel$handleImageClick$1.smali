.class final Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/gallery/ui/share/page/ShareViewModel;->g(Landroid/content/Context;Ljava/lang/String;)V
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
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
    c = "com.zykj.gallery.ui.share.page.ShareViewModel$handleImageClick$1"
    f = "ShareViewModel.kt"
    i = {
        0x1,
        0x1
    }
    l = {
        0x39,
        0x40
    }
    m = "invokeSuspend"
    n = {
        "file",
        "fileUri"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:I

.field public final synthetic d:Landroid/content/Context;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lcom/zykj/gallery/ui/share/page/ShareViewModel;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/zykj/gallery/ui/share/page/ShareViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;->d:Landroid/content/Context;

    iput-object p2, p0, Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;->e:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;->f:Lcom/zykj/gallery/ui/share/page/ShareViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance p1, Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;

    iget-object v0, p0, Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;->f:Lcom/zykj/gallery/ui/share/page/ShareViewModel;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/zykj/gallery/ui/share/page/ShareViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroid/net/Uri;

    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/io/File;

    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    sget-object p1, Lcom/zykj/gallery/utils/Coil3ImageCacheUtil;->a:Lcom/zykj/gallery/utils/Coil3ImageCacheUtil;

    .line 43
    .line 44
    iget-object v1, p0, Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;->d:Landroid/content/Context;

    .line 45
    .line 46
    iget-object v4, p0, Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;->e:Ljava/lang/String;

    .line 47
    .line 48
    iput v3, p0, Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;->c:I

    .line 49
    .line 50
    invoke-virtual {p1, v1, v4, p0}, Lcom/zykj/gallery/utils/Coil3ImageCacheUtil;->b(Landroid/content/Context;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-ne p1, v0, :cond_3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    :goto_0
    check-cast p1, Ljava/io/File;

    .line 58
    .line 59
    if-eqz p1, :cond_4

    .line 60
    .line 61
    iget-object v1, p0, Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;->d:Landroid/content/Context;

    .line 62
    .line 63
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    new-instance v4, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v3, ".fileprovider"

    .line 76
    .line 77
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-static {v1, v3, p1}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iget-object v3, p0, Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;->f:Lcom/zykj/gallery/ui/share/page/ShareViewModel;

    .line 89
    .line 90
    invoke-static {v3}, Lcom/zykj/gallery/ui/share/page/ShareViewModel;->b(Lcom/zykj/gallery/ui/share/page/ShareViewModel;)Lkotlinx/coroutines/channels/Channel;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    new-instance v4, Lcom/zykj/gallery/ui/share/page/b$b;

    .line 95
    .line 96
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-direct {v4, v1}, Lcom/zykj/gallery/ui/share/page/b$b;-><init>(Landroid/net/Uri;)V

    .line 100
    .line 101
    .line 102
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iput-object p1, p0, Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;->a:Ljava/lang/Object;

    .line 107
    .line 108
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iput-object p1, p0, Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;->b:Ljava/lang/Object;

    .line 113
    .line 114
    iput v2, p0, Lcom/zykj/gallery/ui/share/page/ShareViewModel$handleImageClick$1;->c:I

    .line 115
    .line 116
    invoke-interface {v3, v4, p0}, Lkotlinx/coroutines/channels/SendChannel;->send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-ne p1, v0, :cond_4

    .line 121
    .line 122
    :goto_1
    return-object v0

    .line 123
    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 124
    .line 125
    return-object p1
.end method

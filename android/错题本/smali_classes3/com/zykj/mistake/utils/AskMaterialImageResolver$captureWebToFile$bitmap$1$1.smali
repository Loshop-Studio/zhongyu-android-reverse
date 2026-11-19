.class final Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$bitmap$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$bitmap$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

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
        "Landroid/graphics/Bitmap;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)Landroid/graphics/Bitmap;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.utils.AskMaterialImageResolver$captureWebToFile$bitmap$1$1"
    f = "AskMaterialImageResolver.kt"
    i = {}
    l = {
        0x46
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $url:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/utils/c;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/utils/c;Ljava/lang/String;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/utils/c;",
            "Ljava/lang/String;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$bitmap$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$bitmap$1$1;->this$0:Lcom/zykj/mistake/utils/c;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$bitmap$1$1;->$url:Ljava/lang/String;

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
    .locals 2
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
    new-instance p1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$bitmap$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$bitmap$1$1;->this$0:Lcom/zykj/mistake/utils/c;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$bitmap$1$1;->$url:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$bitmap$1$1;-><init>(Lcom/zykj/mistake/utils/c;Ljava/lang/String;Lh6/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$bitmap$1$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$bitmap$1$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$bitmap$1$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$bitmap$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$bitmap$1$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$bitmap$1$1;->this$0:Lcom/zykj/mistake/utils/c;

    .line 26
    .line 27
    iget-object v1, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$bitmap$1$1;->$url:Ljava/lang/String;

    .line 28
    .line 29
    iput v2, p0, Lcom/zykj/mistake/utils/AskMaterialImageResolver$captureWebToFile$bitmap$1$1;->label:I

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v3, Lkotlinx/coroutines/g;

    .line 35
    .line 36
    invoke-static {p0}, Lv7/l;->n(Lh6/c;)Lh6/c;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-direct {v3, v2, v4}, Lkotlinx/coroutines/g;-><init>(ILh6/c;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Lkotlinx/coroutines/g;->u()V

    .line 44
    .line 45
    .line 46
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 47
    .line 48
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 49
    .line 50
    .line 51
    new-instance v4, Lcom/zykj/mistake/widget/StemWebView;

    .line 52
    .line 53
    iget-object v5, p1, Lcom/zykj/mistake/utils/c;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 54
    .line 55
    const/4 v6, 0x0

    .line 56
    const/4 v7, 0x6

    .line 57
    const/4 v8, 0x0

    .line 58
    invoke-direct {v4, v5, v6, v7, v8}, Lcom/zykj/mistake/widget/StemWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 59
    .line 60
    .line 61
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    .line 62
    .line 63
    const/4 v6, -0x1

    .line 64
    invoke-direct {v5, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v8}, Lcom/zykj/mistake/widget/StemWebView;->setScaleButtonsVisible(Z)V

    .line 71
    .line 72
    .line 73
    new-instance v5, Lcom/zykj/mistake/feature/collection/list/a0;

    .line 74
    .line 75
    invoke-direct {v5, v4, v3, v2, p1}, Lcom/zykj/mistake/feature/collection/list/a0;-><init>(Lcom/zykj/mistake/widget/StemWebView;Lkotlinx/coroutines/g;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/mistake/utils/c;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4, v5}, Lcom/zykj/mistake/widget/StemWebView;->setPageFinishListener(Lr6/a;)V

    .line 79
    .line 80
    .line 81
    iput-object v4, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 82
    .line 83
    iget-object v5, p1, Lcom/zykj/mistake/utils/c;->b:Landroid/widget/FrameLayout;

    .line 84
    .line 85
    invoke-virtual {v5}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 89
    .line 90
    .line 91
    new-instance v5, Lcoil3/network/okhttp/internal/b;

    .line 92
    .line 93
    const/4 v6, 0x1

    .line 94
    invoke-direct {v5, v6, v2, p1}, Lcoil3/network/okhttp/internal/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v5}, Lkotlinx/coroutines/g;->m(Lr6/c;)V

    .line 98
    .line 99
    .line 100
    new-instance p1, Lcom/blankj/utilcode/util/a0;

    .line 101
    .line 102
    const/4 v2, 0x5

    .line 103
    invoke-direct {p1, v2, v4, v1}, Lcom/blankj/utilcode/util/a0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3}, Lkotlinx/coroutines/g;->t()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-ne p1, v0, :cond_2

    .line 114
    .line 115
    return-object v0

    .line 116
    :cond_2
    return-object p1
.end method

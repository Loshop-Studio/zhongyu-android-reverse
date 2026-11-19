.class final Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onError$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1;->onError(Landroidx/camera/core/ImageCaptureException;)V
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
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.view.ui.camera.ImagePickFragment$takePic$1$onError$1"
    f = "ImagePickFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $exception:Landroidx/camera/core/ImageCaptureException;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/zykj/view/ui/camera/ImagePickFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/ui/camera/ImagePickFragment;Landroidx/camera/core/ImageCaptureException;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/ui/camera/ImagePickFragment;",
            "Landroidx/camera/core/ImageCaptureException;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onError$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onError$1;->this$0:Lcom/zykj/view/ui/camera/ImagePickFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onError$1;->$exception:Landroidx/camera/core/ImageCaptureException;

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
    new-instance v0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onError$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onError$1;->this$0:Lcom/zykj/view/ui/camera/ImagePickFragment;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onError$1;->$exception:Landroidx/camera/core/ImageCaptureException;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onError$1;-><init>(Lcom/zykj/view/ui/camera/ImagePickFragment;Landroidx/camera/core/ImageCaptureException;Lh6/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onError$1;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onError$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onError$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onError$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onError$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onError$1;->L$0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lkotlinx/coroutines/v;

    .line 6
    .line 7
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 8
    .line 9
    iget v1, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onError$1;->label:I

    .line 10
    .line 11
    if-nez v1, :cond_6

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onError$1;->this$0:Lcom/zykj/view/ui/camera/ImagePickFragment;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onError$1;->$exception:Landroidx/camera/core/ImageCaptureException;

    .line 19
    .line 20
    :try_start_0
    invoke-static {p1}, Lcom/zykj/view/ui/camera/ImagePickFragment;->access$getMBindView$p(Lcom/zykj/view/ui/camera/ImagePickFragment;)Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v2, :cond_5

    .line 25
    .line 26
    iget-object v2, v2, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;->capture:Landroid/widget/ImageView;

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    invoke-virtual {v2, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Landroidx/camera/core/ImageCaptureException;->getImageCaptureError()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_4

    .line 37
    .line 38
    if-eq v1, v3, :cond_3

    .line 39
    .line 40
    const/4 v2, 0x2

    .line 41
    if-eq v1, v2, :cond_2

    .line 42
    .line 43
    const/4 v2, 0x3

    .line 44
    if-eq v1, v2, :cond_1

    .line 45
    .line 46
    const/4 v2, 0x4

    .line 47
    if-eq v1, v2, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const-string v1, "\u6307\u793a\u6b64ImageCapture\u672a\u7ed1\u5b9a\u5230\u6709\u6548\u76f8\u673a\u7684\u9519\u8bef"

    .line 55
    .line 56
    invoke-static {p1, v1}, Lcom/zykj/sketch/utils/ToastUtils;->showShort(Landroid/content/Context;Ljava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception p1

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    const-string v1, "\u9519\u8bef\u6d88\u606f\uff0c\u8868\u660e\u7531\u4e8e\u76f8\u673a\u5173\u95ed\uff0c\u65e0\u6cd5\u5b8c\u6210\u8bf7\u6c42"

    .line 67
    .line 68
    invoke-static {p1, v1}, Lcom/zykj/sketch/utils/ToastUtils;->showShort(Landroid/content/Context;Ljava/lang/CharSequence;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    const-string v1, "\u76f8\u673a\u6846\u67b6\u62a5\u544a\u7684\u9519\u8bef\uff0c\u6307\u793a\u6355\u83b7\u8bf7\u6c42\u5931\u8d25"

    .line 77
    .line 78
    invoke-static {p1, v1}, Lcom/zykj/sketch/utils/ToastUtils;->showShort(Landroid/content/Context;Ljava/lang/CharSequence;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    const-string v1, "\u62cd\u7167\u5199\u5165\u6587\u4ef6\u5931\u8d25"

    .line 87
    .line 88
    invoke-static {p1, v1}, Lcom/zykj/sketch/utils/ToastUtils;->showShort(Landroid/content/Context;Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_4
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const-string v1, "\u62cd\u7167\uff0c\u56fe\u7247\u5904\u7406\u672a\u77e5\u5f02\u5e38"

    .line 97
    .line 98
    invoke-static {p1, v1}, Lcom/zykj/sketch/utils/ToastUtils;->showShort(Landroid/content/Context;Ljava/lang/CharSequence;)V

    .line 99
    .line 100
    .line 101
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    return-object v0

    .line 105
    :cond_5
    const-string p1, "mBindView"

    .line 106
    .line 107
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    const/4 p1, 0x0

    .line 111
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    :goto_1
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    return-object v0

    .line 120
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 121
    .line 122
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 123
    .line 124
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p1
.end method

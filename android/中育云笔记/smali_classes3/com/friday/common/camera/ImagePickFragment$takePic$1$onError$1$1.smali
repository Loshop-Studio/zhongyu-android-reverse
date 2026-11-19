.class final Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/camera/ImagePickFragment$takePic$1;->onError(Landroidx/camera/core/ImageCaptureException;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.common.camera.ImagePickFragment$takePic$1$onError$1$1"
    f = "ImagePickFragment.kt"
    l = {
        0xc0
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/common/camera/ImagePickFragment;

.field public final synthetic e:Landroidx/camera/core/ImageCaptureException;


# direct methods
.method public constructor <init>(Lcom/friday/common/camera/ImagePickFragment;Landroidx/camera/core/ImageCaptureException;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1;->d:Lcom/friday/common/camera/ImagePickFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1;->e:Landroidx/camera/core/ImageCaptureException;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1;->d:Lcom/friday/common/camera/ImagePickFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1;->e:Landroidx/camera/core/ImageCaptureException;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1;-><init>(Lcom/friday/common/camera/ImagePickFragment;Landroidx/camera/core/ImageCaptureException;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1;->c:I

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
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1;->d:Lcom/friday/common/camera/ImagePickFragment;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/friday/common/camera/ImagePickFragment;->z(Lcom/friday/common/camera/ImagePickFragment;)Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const/4 v1, 0x0

    .line 34
    if-nez p1, :cond_2

    .line 35
    .line 36
    const-string p1, "mBindView"

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    move-object p1, v1

    .line 42
    :cond_2
    iget-object p1, p1, Lcom/friday/common/databinding/FragmentImagePickBinding;->d:Landroid/widget/ImageView;

    .line 43
    .line 44
    invoke-virtual {p1, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1;->d:Lcom/friday/common/camera/ImagePickFragment;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string v3, "getViewLifecycleOwner(...)"

    .line 54
    .line 55
    invoke-static {p1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    new-instance v3, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1$1;

    .line 59
    .line 60
    iget-object v4, p0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1;->e:Landroidx/camera/core/ImageCaptureException;

    .line 61
    .line 62
    invoke-direct {v3, v4, v1}, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1$1;-><init>(Landroidx/camera/core/ImageCaptureException;Lvc/c;)V

    .line 63
    .line 64
    .line 65
    iput v2, p0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1;->c:I

    .line 66
    .line 67
    invoke-static {p1, v3, p0}, Landroidx/lifecycle/PausingDispatcherKt;->whenResumed(Landroidx/lifecycle/LifecycleOwner;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, v0, :cond_3

    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_3
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 75
    .line 76
    return-object p1
.end method

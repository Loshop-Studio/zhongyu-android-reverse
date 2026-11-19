.class final Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onImageSaved$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1;->onImageSaved(Landroidx/camera/core/ImageCapture$OutputFileResults;)V
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
    c = "com.zykj.view.ui.camera.ImagePickFragment$takePic$1$onImageSaved$1"
    f = "ImagePickFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/zykj/view/ui/camera/ImagePickFragment;

.field public final synthetic f:Landroidx/camera/core/ImageCapture$OutputFileResults;


# direct methods
.method public constructor <init>(Lcom/zykj/view/ui/camera/ImagePickFragment;Landroidx/camera/core/ImageCapture$OutputFileResults;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onImageSaved$1;->e:Lcom/zykj/view/ui/camera/ImagePickFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onImageSaved$1;->f:Landroidx/camera/core/ImageCapture$OutputFileResults;

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
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onImageSaved$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onImageSaved$1;->e:Lcom/zykj/view/ui/camera/ImagePickFragment;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onImageSaved$1;->f:Landroidx/camera/core/ImageCapture$OutputFileResults;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onImageSaved$1;-><init>(Lcom/zykj/view/ui/camera/ImagePickFragment;Landroidx/camera/core/ImageCapture$OutputFileResults;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onImageSaved$1;->d:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onImageSaved$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onImageSaved$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onImageSaved$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onImageSaved$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onImageSaved$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lsd/i0;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onImageSaved$1;->c:I

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onImageSaved$1;->e:Lcom/zykj/view/ui/camera/ImagePickFragment;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onImageSaved$1;->f:Landroidx/camera/core/ImageCapture$OutputFileResults;

    .line 18
    .line 19
    :try_start_0
    sget-object v1, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v2, Landroid/content/Intent;

    .line 26
    .line 27
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v3, "ResultUri"

    .line 31
    .line 32
    invoke-virtual {v0}, Landroidx/camera/core/ImageCapture$OutputFileResults;->getSavedUri()Landroid/net/Uri;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 37
    .line 38
    .line 39
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 40
    .line 41
    const/4 v0, -0x1

    .line 42
    invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Lcom/zykj/view/ui/camera/ImagePickFragment;->u(Lcom/zykj/view/ui/camera/ImagePickFragment;)Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-nez p1, :cond_0

    .line 57
    .line 58
    const-string p1, "mBindView"

    .line 59
    .line 60
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception p1

    .line 66
    goto :goto_1

    .line 67
    :cond_0
    :goto_0
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;->d:Landroid/widget/ImageView;

    .line 68
    .line 69
    const/4 v0, 0x1

    .line 70
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 71
    .line 72
    .line 73
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 74
    .line 75
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :goto_1
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 80
    .line 81
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    :goto_2
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 89
    .line 90
    return-object p1

    .line 91
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 92
    .line 93
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 94
    .line 95
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p1
.end method

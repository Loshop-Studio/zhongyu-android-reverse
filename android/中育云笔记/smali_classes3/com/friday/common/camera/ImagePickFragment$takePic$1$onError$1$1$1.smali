.class final Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.common.camera.ImagePickFragment$takePic$1$onError$1$1$1"
    f = "ImagePickFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Landroidx/camera/core/ImageCaptureException;


# direct methods
.method public constructor <init>(Landroidx/camera/core/ImageCaptureException;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1$1;->d:Landroidx/camera/core/ImageCaptureException;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1$1;->d:Landroidx/camera/core/ImageCaptureException;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1$1;-><init>(Landroidx/camera/core/ImageCaptureException;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_5

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1$1;->d:Landroidx/camera/core/ImageCaptureException;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/camera/core/ImageCaptureException;->getImageCaptureError()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v0, 0x0

    .line 18
    if-eqz p1, :cond_4

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    if-eq p1, v1, :cond_3

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    if-eq p1, v1, :cond_2

    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    if-eq p1, v1, :cond_1

    .line 28
    .line 29
    const/4 v1, 0x4

    .line 30
    if-eq p1, v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-string p1, "\u6307\u793a\u6b64ImageCapture\u672a\u7ed1\u5b9a\u5230\u6709\u6548\u76f8\u673a\u7684\u9519\u8bef"

    .line 34
    .line 35
    new-array v0, v0, [Ljava/lang/Object;

    .line 36
    .line 37
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const-string p1, "\u9519\u8bef\u6d88\u606f\uff0c\u8868\u660e\u7531\u4e8e\u76f8\u673a\u5173\u95ed\uff0c\u65e0\u6cd5\u5b8c\u6210\u8bf7\u6c42"

    .line 42
    .line 43
    new-array v0, v0, [Ljava/lang/Object;

    .line 44
    .line 45
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const-string p1, "\u76f8\u673a\u6846\u67b6\u62a5\u544a\u7684\u9519\u8bef\uff0c\u6307\u793a\u6355\u83b7\u8bf7\u6c42\u5931\u8d25"

    .line 50
    .line 51
    new-array v0, v0, [Ljava/lang/Object;

    .line 52
    .line 53
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    const-string p1, "\u62cd\u7167\u5199\u5165\u6587\u4ef6\u5931\u8d25"

    .line 58
    .line 59
    new-array v0, v0, [Ljava/lang/Object;

    .line 60
    .line 61
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_4
    const-string p1, "\u62cd\u7167\uff0c\u56fe\u7247\u5904\u7406\u672a\u77e5\u5f02\u5e38"

    .line 66
    .line 67
    new-array v0, v0, [Ljava/lang/Object;

    .line 68
    .line 69
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 76
    .line 77
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 78
    .line 79
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1
.end method

.class final Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/camera/ImagePickFragment;->D()V
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
    c = "com.friday.common.camera.ImagePickFragment$bindCameraUseCases$3"
    f = "ImagePickFragment.kt"
    l = {
        0x128
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/common/camera/ImagePickFragment;


# direct methods
.method public constructor <init>(Lcom/friday/common/camera/ImagePickFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3;->d:Lcom/friday/common/camera/ImagePickFragment;

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

.method public static synthetic g(Lb2/a;Lb2/a;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3;->m(Lb2/a;Lb2/a;)Z

    move-result p0

    return p0
.end method

.method public static final m(Lb2/a;Lb2/a;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lb2/a;->a()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0}, Lb2/a;->a()J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    sub-long/2addr v0, p0

    .line 10
    const-wide/16 p0, 0x3e8

    .line 11
    .line 12
    cmp-long p0, v0, p0

    .line 13
    .line 14
    if-gez p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3;->d:Lcom/friday/common/camera/ImagePickFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3;-><init>(Lcom/friday/common/camera/ImagePickFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3;->c:I

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
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3;->d:Lcom/friday/common/camera/ImagePickFragment;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/friday/common/camera/ImagePickFragment;->A(Lcom/friday/common/camera/ImagePickFragment;)Lcom/friday/common/camera/CameraViewModel;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lcom/friday/common/camera/CameraViewModel;->c()Lvd/k;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v1, Lcom/friday/common/camera/a;

    .line 38
    .line 39
    invoke-direct {v1}, Lcom/friday/common/camera/a;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v1}, Lvd/e;->o(Lvd/c;Lhd/p;)Lvd/c;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance v1, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3$2;

    .line 47
    .line 48
    iget-object v3, p0, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3;->d:Lcom/friday/common/camera/ImagePickFragment;

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-direct {v1, v3, v4}, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3$2;-><init>(Lcom/friday/common/camera/ImagePickFragment;Lvc/c;)V

    .line 52
    .line 53
    .line 54
    iput v2, p0, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3;->c:I

    .line 55
    .line 56
    invoke-static {p1, v1, p0}, Lvd/e;->i(Lvd/c;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v0, :cond_2

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 64
    .line 65
    return-object p1
.end method

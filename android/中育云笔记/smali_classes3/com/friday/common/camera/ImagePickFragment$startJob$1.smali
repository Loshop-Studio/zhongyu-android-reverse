.class final Lcom/friday/common/camera/ImagePickFragment$startJob$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/camera/ImagePickFragment;->Q(J)V
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
    c = "com.friday.common.camera.ImagePickFragment$startJob$1"
    f = "ImagePickFragment.kt"
    l = {
        0x1a2
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:J

.field public final synthetic e:Lcom/friday/common/camera/ImagePickFragment;


# direct methods
.method public constructor <init>(JLcom/friday/common/camera/ImagePickFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/friday/common/camera/ImagePickFragment$startJob$1;->d:J

    .line 2
    .line 3
    iput-object p3, p0, Lcom/friday/common/camera/ImagePickFragment$startJob$1;->e:Lcom/friday/common/camera/ImagePickFragment;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/friday/common/camera/ImagePickFragment$startJob$1;

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/friday/common/camera/ImagePickFragment$startJob$1;->d:J

    .line 4
    .line 5
    iget-object v2, p0, Lcom/friday/common/camera/ImagePickFragment$startJob$1;->e:Lcom/friday/common/camera/ImagePickFragment;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/common/camera/ImagePickFragment$startJob$1;-><init>(JLcom/friday/common/camera/ImagePickFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/common/camera/ImagePickFragment$startJob$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/camera/ImagePickFragment$startJob$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/common/camera/ImagePickFragment$startJob$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/common/camera/ImagePickFragment$startJob$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/common/camera/ImagePickFragment$startJob$1;->c:I

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
    iget-wide v3, p0, Lcom/friday/common/camera/ImagePickFragment$startJob$1;->d:J

    .line 28
    .line 29
    iput v2, p0, Lcom/friday/common/camera/ImagePickFragment$startJob$1;->c:I

    .line 30
    .line 31
    invoke-static {v3, v4, p0}, Lkotlinx/coroutines/DelayKt;->b(JLvc/c;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-ne p1, v0, :cond_2

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$startJob$1;->e:Lcom/friday/common/camera/ImagePickFragment;

    .line 39
    .line 40
    invoke-static {p1}, Lcom/friday/common/camera/ImagePickFragment;->z(Lcom/friday/common/camera/ImagePickFragment;)Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const/4 v0, 0x0

    .line 45
    const-string v1, "mBindView"

    .line 46
    .line 47
    if-nez p1, :cond_3

    .line 48
    .line 49
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    move-object p1, v0

    .line 53
    :cond_3
    iget-object p1, p1, Lcom/friday/common/databinding/FragmentImagePickBinding;->f:Landroidx/cardview/widget/CardView;

    .line 54
    .line 55
    const-string v2, "cvZoomValue"

    .line 56
    .line 57
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$startJob$1;->e:Lcom/friday/common/camera/ImagePickFragment;

    .line 65
    .line 66
    invoke-static {p1}, Lcom/friday/common/camera/ImagePickFragment;->z(Lcom/friday/common/camera/ImagePickFragment;)Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-nez p1, :cond_4

    .line 71
    .line 72
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    move-object v0, p1

    .line 77
    :goto_1
    iget-object p1, v0, Lcom/friday/common/databinding/FragmentImagePickBinding;->g:Lcom/friday/common/camera/ZoomControlView;

    .line 78
    .line 79
    const-string v0, "dbView"

    .line 80
    .line 81
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const/16 v0, 0x8

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$startJob$1;->e:Lcom/friday/common/camera/ImagePickFragment;

    .line 90
    .line 91
    invoke-static {p1}, Lcom/friday/common/camera/ImagePickFragment;->C(Lcom/friday/common/camera/ImagePickFragment;)V

    .line 92
    .line 93
    .line 94
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 95
    .line 96
    return-object p1
.end method

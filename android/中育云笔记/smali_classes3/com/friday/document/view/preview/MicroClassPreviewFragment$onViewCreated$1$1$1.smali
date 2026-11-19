.class final Lcom/friday/document/view/preview/MicroClassPreviewFragment$onViewCreated$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/preview/MicroClassPreviewFragment$onViewCreated$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.document.view.preview.MicroClassPreviewFragment$onViewCreated$1$1$1"
    f = "MicroClassPreviewFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Z

.field public final synthetic e:Lcom/friday/document/view/preview/MicroClassPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/preview/MicroClassPreviewFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onViewCreated$1$1$1;->e:Lcom/friday/document/view/preview/MicroClassPreviewFragment;

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
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onViewCreated$1$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onViewCreated$1$1$1;->e:Lcom/friday/document/view/preview/MicroClassPreviewFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onViewCreated$1$1$1;-><init>(Lcom/friday/document/view/preview/MicroClassPreviewFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput-boolean p1, v0, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onViewCreated$1$1$1;->d:Z

    .line 15
    .line 16
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onViewCreated$1$1$1;->invoke(ZLvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(ZLvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onViewCreated$1$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onViewCreated$1$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onViewCreated$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onViewCreated$1$1$1;->d:Z

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onViewCreated$1$1$1;->c:I

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onViewCreated$1$1$1;->e:Lcom/friday/document/view/preview/MicroClassPreviewFragment;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/friday/document/view/preview/MicroClassPreviewFragment;->t(Lcom/friday/document/view/preview/MicroClassPreviewFragment;)Lcom/friday/document/databinding/FragmentPreviewMicroClassBinding;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p1, p1, Lcom/friday/document/databinding/FragmentPreviewMicroClassBinding;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 22
    .line 23
    const-string v0, "ivCover"

    .line 24
    .line 25
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onViewCreated$1$1$1;->e:Lcom/friday/document/view/preview/MicroClassPreviewFragment;

    .line 29
    .line 30
    invoke-static {v0}, Lcom/friday/document/view/preview/MicroClassPreviewFragment;->r(Lcom/friday/document/view/preview/MicroClassPreviewFragment;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1}, Lcoil3/l;->a(Landroid/content/Context;)Lcoil3/e;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    new-instance v2, Lw/g$a;

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-direct {v2, v3}, Lw/g$a;-><init>(Landroid/content/Context;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v0}, Lw/g$a;->d(Ljava/lang/Object;)Lw/g$a;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0, p1}, Lw/j;->q(Lw/g$a;Landroid/widget/ImageView;)Lw/g$a;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    sget-object v0, Lcoil3/request/CachePolicy;->h:Lcoil3/request/CachePolicy;

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Lw/g$a;->k(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0}, Lw/g$a;->f(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0}, Lw/g$a;->l(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 68
    .line 69
    .line 70
    sget v0, Lcom/friday/document/R$drawable;->icon_micor_class_normal:I

    .line 71
    .line 72
    invoke-static {p1, v0}, Lw/j;->b(Lw/g$a;I)Lw/g$a;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Lw/g$a;->c()Lw/g;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-interface {v1, p1}, Lcoil3/e;->c(Lw/g;)Lw/c;

    .line 80
    .line 81
    .line 82
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 83
    .line 84
    return-object p1

    .line 85
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 86
    .line 87
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 88
    .line 89
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p1
.end method

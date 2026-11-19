.class public final Lcom/zykj/study/ui/ImageFragment;
.super Lcom/zykj/study/ui/Hilt_ImageFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/Hilt_ImageFragment<",
        "Lcom/zykj/study/databinding/FragmentImageShowBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Landroidx/navigation/NavArgsLazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/Hilt_ImageFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/study/ui/ImageFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/study/ui/ImageFragment$a;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/ImageFragment$a;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/study/ui/ImageFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final g()Lcom/zykj/study/ui/ImageFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/ImageFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/ImageFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/study/ui/ImageFragment;->g()Lcom/zykj/study/ui/ImageFragmentArgs;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2}, Lcom/zykj/study/ui/ImageFragmentArgs;->a()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Lcom/bumptech/glide/b;->t(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0}, Lcom/zykj/study/ui/ImageFragment;->g()Lcom/zykj/study/ui/ImageFragmentArgs;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p2}, Lcom/zykj/study/ui/ImageFragmentArgs;->a()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/h;->u(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget p2, Lcom/zykj/study/R$drawable;->ic_loading:I

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Ld0/a;->X(I)Ld0/a;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lcom/bumptech/glide/g;

    .line 41
    .line 42
    sget p2, Lcom/zykj/study/R$drawable;->ic_image_error:I

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Ld0/a;->l(I)Ld0/a;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lcom/bumptech/glide/g;

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    check-cast p2, Lcom/zykj/study/databinding/FragmentImageShowBinding;

    .line 55
    .line 56
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentImageShowBinding;->ivPrev:Landroid/widget/ImageView;

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/g;->w0(Landroid/widget/ImageView;)Le0/j;

    .line 59
    .line 60
    .line 61
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 62
    .line 63
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_image_show:I

    .line 2
    .line 3
    return v0
.end method

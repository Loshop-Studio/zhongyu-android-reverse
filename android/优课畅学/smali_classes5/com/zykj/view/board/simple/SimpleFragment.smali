.class public final Lcom/zykj/view/board/simple/SimpleFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/simple/SimpleFragment$a;
    }
.end annotation

.annotation runtime Lh7/a;
.end annotation


# static fields
.field public static final d:Lcom/zykj/view/board/simple/SimpleFragment$a;


# instance fields
.field public final a:Lh7/d;

.field public final b:La6/l;

.field public c:Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/view/board/simple/SimpleFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/view/board/simple/SimpleFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/view/board/simple/SimpleFragment;->d:Lcom/zykj/view/board/simple/SimpleFragment$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lt5/a;

    .line 5
    .line 6
    invoke-direct {v0}, Lt5/a;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/zykj/view/board/simple/SimpleFragment;->a:Lh7/d;

    .line 14
    .line 15
    new-instance v0, La6/l;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x2

    .line 19
    invoke-direct {v0, p0, v1, v2, v1}, La6/l;-><init>(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;ILkotlin/jvm/internal/n;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/zykj/view/board/simple/SimpleFragment;->b:La6/l;

    .line 23
    .line 24
    return-void
.end method

.method private final A()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleFragment;->c:Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "mBinding"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->c:Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeEraserBinding;->d:Landroid/widget/RadioGroup;

    .line 14
    .line 15
    const-string v1, "rgEraserSize"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Landroidx/core/view/ViewGroupKt;->getChildren(Landroid/view/ViewGroup;)Lf8/g;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, Lf8/g;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x0

    .line 29
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    add-int/lit8 v3, v1, 0x1

    .line 40
    .line 41
    if-gez v1, :cond_1

    .line 42
    .line 43
    invoke-static {}, Li7/v;->w()V

    .line 44
    .line 45
    .line 46
    :cond_1
    check-cast v2, Landroid/view/View;

    .line 47
    .line 48
    new-instance v4, Lt5/g;

    .line 49
    .line 50
    invoke-direct {v4, p0, v1}, Lt5/g;-><init>(Lcom/zykj/view/board/simple/SimpleFragment;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    .line 55
    .line 56
    move v1, v3

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    return-void
.end method

.method public static final B(Lcom/zykj/view/board/simple/SimpleFragment;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->w()Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->k(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final C()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleFragment;->c:Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->h:Landroidx/appcompat/widget/AppCompatImageView;

    .line 13
    .line 14
    new-instance v3, Lt5/l;

    .line 15
    .line 16
    invoke-direct {v3}, Lt5/l;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleFragment;->c:Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object v1, v0

    .line 31
    :goto_0
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->i:Landroidx/appcompat/widget/AppCompatImageView;

    .line 32
    .line 33
    new-instance v1, Lt5/b;

    .line 34
    .line 35
    invoke-direct {v1, p0}, Lt5/b;-><init>(Lcom/zykj/view/board/simple/SimpleFragment;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static final D(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static final E(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->w()Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/board/simple/SimpleViewModel;->f()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final F()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleFragment;->c:Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "mBinding"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->e:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 12
    .line 13
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->j:Landroidx/appcompat/widget/AppCompatImageView;

    .line 14
    .line 15
    new-instance v2, Lt5/h;

    .line 16
    .line 17
    invoke-direct {v2, p0}, Lt5/h;-><init>(Lcom/zykj/view/board/simple/SimpleFragment;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->f:Landroidx/appcompat/widget/AppCompatImageView;

    .line 24
    .line 25
    new-instance v2, Lt5/i;

    .line 26
    .line 27
    invoke-direct {v2, p0}, Lt5/i;-><init>(Lcom/zykj/view/board/simple/SimpleFragment;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 34
    .line 35
    new-instance v2, Lt5/j;

    .line 36
    .line 37
    invoke-direct {v2, p0}, Lt5/j;-><init>(Lcom/zykj/view/board/simple/SimpleFragment;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 44
    .line 45
    new-instance v1, Lt5/k;

    .line 46
    .line 47
    invoke-direct {v1, p0}, Lt5/k;-><init>(Lcom/zykj/view/board/simple/SimpleFragment;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public static final G(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->w()Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x1

    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {p0, v1, p1, v0}, Lcom/zykj/view/board/simple/SimpleViewModel;->r(Lcom/zykj/view/board/simple/SimpleViewModel;ZILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static final H(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->w()Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Lcom/zykj/view/board/board/q$c;->e:Lcom/zykj/view/board/board/q$c;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/zykj/view/board/simple/SimpleViewModel;->m(Lcom/zykj/view/board/board/q;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->w()Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Lcom/zykj/view/board/simple/SimpleViewModel;->h()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static final I(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->w()Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Lcom/zykj/view/board/board/q$a;->e:Lcom/zykj/view/board/board/q$a;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/zykj/view/board/simple/SimpleViewModel;->m(Lcom/zykj/view/board/board/q;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->w()Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Lcom/zykj/view/board/simple/SimpleViewModel;->g()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static final J(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "requireContext(...)"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Lt5/c;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lt5/c;-><init>(Lcom/zykj/view/board/simple/SimpleFragment;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0}, Lp5/w1;->f(Landroid/content/Context;Lx7/a;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static final K(Lcom/zykj/view/board/simple/SimpleFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->w()Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/board/simple/SimpleViewModel;->c()V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 9
    .line 10
    return-object p0
.end method

.method private final L()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getViewLifecycleOwner(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v5, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v5, p0, v0}, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1;-><init>(Lcom/zykj/view/board/simple/SimpleFragment;Lm7/c;)V

    .line 18
    .line 19
    .line 20
    const/4 v6, 0x3

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-static/range {v2 .. v7}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private final M()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleFragment;->c:Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->f:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludePenBinding;->k:Landroid/widget/RadioGroup;

    .line 15
    .line 16
    const-string v3, "rgPenType"

    .line 17
    .line 18
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Landroidx/core/view/ViewGroupKt;->getChildren(Landroid/view/ViewGroup;)Lf8/g;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Lf8/g;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Landroid/view/View;

    .line 40
    .line 41
    new-instance v4, Lt5/d;

    .line 42
    .line 43
    invoke-direct {v4, p0}, Lt5/d;-><init>(Lcom/zykj/view/board/simple/SimpleFragment;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleFragment;->c:Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 51
    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    move-object v0, v1

    .line 58
    :cond_2
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->f:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 59
    .line 60
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludePenBinding;->j:Landroid/widget/RadioGroup;

    .line 61
    .line 62
    const-string v3, "rgPenSize"

    .line 63
    .line 64
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Landroidx/core/view/ViewGroupKt;->getChildren(Landroid/view/ViewGroup;)Lf8/g;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-interface {v0}, Lf8/g;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const/4 v3, 0x0

    .line 76
    move v4, v3

    .line 77
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-eqz v5, :cond_4

    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    add-int/lit8 v6, v4, 0x1

    .line 88
    .line 89
    if-gez v4, :cond_3

    .line 90
    .line 91
    invoke-static {}, Li7/v;->w()V

    .line 92
    .line 93
    .line 94
    :cond_3
    check-cast v5, Landroid/view/View;

    .line 95
    .line 96
    new-instance v7, Lt5/e;

    .line 97
    .line 98
    invoke-direct {v7, p0, v4}, Lt5/e;-><init>(Lcom/zykj/view/board/simple/SimpleFragment;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 102
    .line 103
    .line 104
    move v4, v6

    .line 105
    goto :goto_1

    .line 106
    :cond_4
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleFragment;->c:Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 107
    .line 108
    if-nez v0, :cond_5

    .line 109
    .line 110
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    move-object v1, v0

    .line 115
    :goto_2
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->f:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 116
    .line 117
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludePenBinding;->i:Landroid/widget/RadioGroup;

    .line 118
    .line 119
    const-string v1, "rgPenColor"

    .line 120
    .line 121
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-static {v0}, Landroidx/core/view/ViewGroupKt;->getChildren(Landroid/view/ViewGroup;)Lf8/g;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-interface {v0}, Lf8/g;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_7

    .line 137
    .line 138
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    add-int/lit8 v2, v3, 0x1

    .line 143
    .line 144
    if-gez v3, :cond_6

    .line 145
    .line 146
    invoke-static {}, Li7/v;->w()V

    .line 147
    .line 148
    .line 149
    :cond_6
    check-cast v1, Landroid/view/View;

    .line 150
    .line 151
    new-instance v4, Lt5/f;

    .line 152
    .line 153
    invoke-direct {v4, p0, v3}, Lt5/f;-><init>(Lcom/zykj/view/board/simple/SimpleFragment;I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 157
    .line 158
    .line 159
    move v3, v2

    .line 160
    goto :goto_3

    .line 161
    :cond_7
    return-void
.end method

.method public static final N(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sget v0, Lcom/zykj/view/R$id;->rb_pen_custom:I

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->w()Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object p1, Lcom/zykj/view/board/simple/d$a;->d:Lcom/zykj/view/board/simple/d$a;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->p(Lcom/zykj/view/board/simple/d;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    sget v0, Lcom/zykj/view/R$id;->rb_pen_line:I

    .line 20
    .line 21
    if-ne p1, v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->w()Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    sget-object p1, Lcom/zykj/view/board/simple/d$c;->d:Lcom/zykj/view/board/simple/d$c;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->p(Lcom/zykj/view/board/simple/d;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    sget v0, Lcom/zykj/view/R$id;->rb_pen_dotted_line:I

    .line 34
    .line 35
    if-ne p1, v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->w()Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    sget-object p1, Lcom/zykj/view/board/simple/d$b;->d:Lcom/zykj/view/board/simple/d$b;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->p(Lcom/zykj/view/board/simple/d;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    return-void
.end method

.method public static final O(Lcom/zykj/view/board/simple/SimpleFragment;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->w()Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->o(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final P(Lcom/zykj/view/board/simple/SimpleFragment;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->w()Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->n(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final Q()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->z()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->L()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static final R()Lcom/zykj/view/board/simple/SimpleViewModel;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/view/board/simple/SimpleViewModel;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private final S(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleFragment;->c:Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->i:Landroidx/appcompat/widget/AppCompatImageView;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {v0, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 21
    .line 22
    .line 23
    const-wide/16 v4, 0x1f4

    .line 24
    .line 25
    invoke-virtual {v0, v4, v5}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 26
    .line 27
    .line 28
    new-instance v4, Lcom/zykj/view/board/simple/SimpleFragment$b;

    .line 29
    .line 30
    invoke-direct {v4, p0, p1}, Lcom/zykj/view/board/simple/SimpleFragment$b;-><init>(Lcom/zykj/view/board/simple/SimpleFragment;Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 34
    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget-object v5, p0, Lcom/zykj/view/board/simple/SimpleFragment;->c:Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 40
    .line 41
    if-nez v5, :cond_1

    .line 42
    .line 43
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    move-object v5, v1

    .line 47
    :cond_1
    iget-object v5, v5, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->e:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 48
    .line 49
    invoke-virtual {v5}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    int-to-float v5, v5

    .line 58
    neg-float v5, v5

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    move v5, v4

    .line 61
    :goto_0
    if-eqz p1, :cond_3

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment;->c:Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 65
    .line 66
    if-nez p1, :cond_4

    .line 67
    .line 68
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    move-object p1, v1

    .line 72
    :cond_4
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->e:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 73
    .line 74
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    int-to-float p1, p1

    .line 83
    neg-float v4, p1

    .line 84
    :goto_1
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment;->c:Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 85
    .line 86
    if-nez p1, :cond_5

    .line 87
    .line 88
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    move-object p1, v1

    .line 92
    :cond_5
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->e:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 93
    .line 94
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    const/4 v6, 0x2

    .line 99
    new-array v7, v6, [F

    .line 100
    .line 101
    aput v5, v7, v3

    .line 102
    .line 103
    const/4 v8, 0x1

    .line 104
    aput v4, v7, v8

    .line 105
    .line 106
    const-string v9, "translationX"

    .line 107
    .line 108
    invoke-static {p1, v9, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iget-object v7, p0, Lcom/zykj/view/board/simple/SimpleFragment;->c:Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 117
    .line 118
    if-nez v7, :cond_6

    .line 119
    .line 120
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    move-object v7, v1

    .line 124
    :cond_6
    iget-object v7, v7, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->m:Landroid/widget/FrameLayout;

    .line 125
    .line 126
    new-array v10, v6, [F

    .line 127
    .line 128
    aput v5, v10, v3

    .line 129
    .line 130
    aput v4, v10, v8

    .line 131
    .line 132
    invoke-static {v7, v9, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    invoke-virtual {p1, v7}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    iget-object v7, p0, Lcom/zykj/view/board/simple/SimpleFragment;->c:Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 141
    .line 142
    if-nez v7, :cond_7

    .line 143
    .line 144
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_7
    move-object v1, v7

    .line 149
    :goto_2
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->i:Landroidx/appcompat/widget/AppCompatImageView;

    .line 150
    .line 151
    new-array v2, v6, [F

    .line 152
    .line 153
    aput v5, v2, v3

    .line 154
    .line 155
    aput v4, v2, v8

    .line 156
    .line 157
    invoke-static {v1, v9, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {p1, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 165
    .line 166
    .line 167
    return-void
.end method

.method public static synthetic f(Lcom/zykj/view/board/simple/SimpleFragment;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleFragment;->B(Lcom/zykj/view/board/simple/SimpleFragment;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic g(Lcom/zykj/view/board/simple/SimpleFragment;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleFragment;->P(Lcom/zykj/view/board/simple/SimpleFragment;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Lcom/zykj/view/board/simple/SimpleFragment;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleFragment;->O(Lcom/zykj/view/board/simple/SimpleFragment;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/simple/SimpleFragment;->H(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j()Lcom/zykj/view/board/simple/SimpleViewModel;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/view/board/simple/SimpleFragment;->R()Lcom/zykj/view/board/simple/SimpleViewModel;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic k(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/simple/SimpleFragment;->G(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic l(Lcom/zykj/view/board/simple/SimpleFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->K(Lcom/zykj/view/board/simple/SimpleFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/simple/SimpleFragment;->I(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic n(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->D(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic o(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/simple/SimpleFragment;->J(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic p(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/simple/SimpleFragment;->E(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic q(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/simple/SimpleFragment;->N(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic r(Lcom/zykj/view/board/simple/SimpleFragment;)Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/simple/SimpleFragment;->c:Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic s(Lcom/zykj/view/board/simple/SimpleFragment;)Lcom/zykj/view/board/simple/SimpleViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->w()Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic t(Lcom/zykj/view/board/simple/SimpleFragment;)Lv5/c;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->x()Lv5/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic u(Lcom/zykj/view/board/simple/SimpleFragment;)Lcom/zykj/view/simpleBoard/SimpleBoardView;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->y()Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic v(Lcom/zykj/view/board/simple/SimpleFragment;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/board/simple/SimpleFragment;->S(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final z()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->F()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->M()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->A()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->C()V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .line 1
    const-string p3, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p3, 0x0

    .line 7
    invoke-static {p1, p2, p3}, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment;->c:Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 15
    .line 16
    iget-object p2, p1, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->e:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 17
    .line 18
    iget-object p3, p2, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->k:Landroidx/appcompat/widget/AppCompatImageView;

    .line 19
    .line 20
    const-string v0, "ivWithdraw"

    .line 21
    .line 22
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/16 v0, 0x8

    .line 26
    .line 27
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    iget-object p3, p2, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 31
    .line 32
    const-string v1, "ivRecover"

    .line 33
    .line 34
    invoke-static {p3, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    iget-object p3, p2, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->i:Landroidx/appcompat/widget/AppCompatImageView;

    .line 41
    .line 42
    const-string v1, "ivSelect"

    .line 43
    .line 44
    invoke-static {p3, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    iget-object p3, p2, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 51
    .line 52
    const-string v1, "ivEnlarge"

    .line 53
    .line 54
    invoke-static {p3, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 58
    .line 59
    .line 60
    iget-object p3, p2, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->h:Landroidx/appcompat/widget/AppCompatImageView;

    .line 61
    .line 62
    const-string v1, "ivReduce"

    .line 63
    .line 64
    invoke-static {p3, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 68
    .line 69
    .line 70
    iget-object p3, p2, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->e:Landroidx/appcompat/widget/AppCompatImageView;

    .line 71
    .line 72
    const-string v1, "ivImageAdd"

    .line 73
    .line 74
    invoke-static {p3, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    iget-object p2, p2, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->a:Landroidx/appcompat/widget/AppCompatImageView;

    .line 81
    .line 82
    const-string p3, "ivBackgroundColor"

    .line 83
    .line 84
    invoke-static {p2, p3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 88
    .line 89
    .line 90
    iget-object p2, p1, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->f:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 91
    .line 92
    iget-object p3, p2, Lcom/zykj/view/databinding/ViewIncludePenBinding;->a:Landroid/widget/RadioButton;

    .line 93
    .line 94
    const-string v1, "rbPenCursor"

    .line 95
    .line 96
    invoke-static {p3, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 100
    .line 101
    .line 102
    iget-object p2, p2, Lcom/zykj/view/databinding/ViewIncludePenBinding;->d:Landroid/widget/RadioButton;

    .line 103
    .line 104
    const-string p3, "rbPenHighlighter"

    .line 105
    .line 106
    invoke-static {p2, p3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    const-string p2, "getRoot(...)"

    .line 117
    .line 118
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/zykj/view/board/simple/SimpleFragment;->Q()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final w()Lcom/zykj/view/board/simple/SimpleViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleFragment;->a:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final x()Lv5/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleFragment;->c:Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "mBinding"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->l:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->getSimpleBoardConfig()Lv5/c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public final y()Lcom/zykj/view/simpleBoard/SimpleBoardView;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleFragment;->c:Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "mBinding"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->l:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 12
    .line 13
    const-string v1, "sketchView"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

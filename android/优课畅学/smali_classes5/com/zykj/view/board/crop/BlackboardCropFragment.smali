.class public final Lcom/zykj/view/board/crop/BlackboardCropFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/crop/BlackboardCropFragment$a;
    }
.end annotation


# instance fields
.field public a:Z

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Lcom/zykj/blackboard/crop/CropManager;

.field public e:Lu5/d;

.field public f:Lq5/a;

.field public g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

.field public h:Ljava/lang/String;

.field public i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

.field public j:Landroid/app/ProgressDialog;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "00:00"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->c:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method public static final synthetic A(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic B(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic C(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/merge/sketch/view/MergeSketchPlayView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic D(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic E(Lcom/zykj/view/board/crop/BlackboardCropFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method private final G()V
    .locals 11

    .line 1
    new-instance v0, Lu5/d;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "requireContext(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x2

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-direct {v0, v1, v2, v3, v4}, Lu5/d;-><init>(Landroid/content/Context;IILkotlin/jvm/internal/n;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->e:Lu5/d;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 21
    .line 22
    const-string v1, "mBinding"

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object v0, v4

    .line 30
    :cond_0
    iget-object v5, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->a:Landroid/widget/ImageView;

    .line 31
    .line 32
    const-string v0, "ivBack"

    .line 33
    .line 34
    invoke-static {v5, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    new-instance v8, Lq5/b;

    .line 38
    .line 39
    invoke-direct {v8, p0}, Lq5/b;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 40
    .line 41
    .line 42
    const/4 v9, 0x1

    .line 43
    const/4 v10, 0x0

    .line 44
    const-wide/16 v6, 0x0

    .line 45
    .line 46
    invoke-static/range {v5 .. v10}, La6/a;->d(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 50
    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    move-object v0, v4

    .line 57
    :cond_1
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->b:Landroid/widget/ImageView;

    .line 58
    .line 59
    new-instance v2, Lq5/m;

    .line 60
    .line 61
    invoke-direct {v2, p0}, Lq5/m;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 68
    .line 69
    if-nez v0, :cond_2

    .line 70
    .line 71
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    move-object v0, v4

    .line 75
    :cond_2
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->c:Lcom/zykj/view/widget/DoubleSeekBar;

    .line 76
    .line 77
    new-instance v2, Lcom/zykj/view/board/crop/BlackboardCropFragment$b;

    .line 78
    .line 79
    invoke-direct {v2, p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment$b;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v2}, Lcom/zykj/view/widget/DoubleSeekBar;->setSeekChangeListener(Lcom/zykj/view/widget/DoubleSeekBar$b;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 86
    .line 87
    if-nez v0, :cond_3

    .line 88
    .line 89
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    move-object v0, v4

    .line 93
    :cond_3
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->c:Lcom/zykj/view/widget/DoubleSeekBar;

    .line 94
    .line 95
    new-instance v2, Lcom/zykj/view/board/crop/BlackboardCropFragment$c;

    .line 96
    .line 97
    invoke-direct {v2, p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment$c;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v2}, Lcom/zykj/view/widget/DoubleSeekBar;->setMaskChangeListener(Lcom/zykj/view/widget/DoubleSeekBar$a;)V

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 104
    .line 105
    if-nez v0, :cond_4

    .line 106
    .line 107
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_4
    move-object v4, v0

    .line 112
    :goto_0
    iget-object v5, v4, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->e:Landroid/widget/TextView;

    .line 113
    .line 114
    const-string v0, "tvConfirm"

    .line 115
    .line 116
    invoke-static {v5, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    new-instance v8, Lq5/n;

    .line 120
    .line 121
    invoke-direct {v8, p0}, Lq5/n;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 122
    .line 123
    .line 124
    const/4 v9, 0x1

    .line 125
    const/4 v10, 0x0

    .line 126
    const-wide/16 v6, 0x0

    .line 127
    .line 128
    invoke-static/range {v5 .. v10}, La6/a;->d(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public static final H(Lcom/zykj/view/board/crop/BlackboardCropFragment;Landroid/view/View;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const-string p1, "mBinding"

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :cond_0
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->c:Lcom/zykj/view/widget/DoubleSeekBar;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/zykj/view/widget/DoubleSeekBar;->getMaskProgress()F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    float-to-long v1, p1

    .line 19
    const-wide/16 v3, 0x0

    .line 20
    .line 21
    cmp-long p1, v1, v3

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    move p1, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    :goto_0
    if-eqz p1, :cond_2

    .line 30
    .line 31
    const-string v2, "\u786e\u5b9a\u8981\u5220\u9664\u5168\u90e8\u5fae\u8bfe\u5417\uff0c\u5220\u9664\u540e\u65e0\u6cd5\u6062\u590d"

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    const-string v2, "\u5373\u5c06\u5220\u9664\u9009\u4e2d\u5185\u5bb9\uff0c\u5220\u9664\u540e\u65e0\u6cd5\u6062\u590d"

    .line 35
    .line 36
    :goto_1
    iget-object v3, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->e:Lu5/d;

    .line 37
    .line 38
    if-nez v3, :cond_3

    .line 39
    .line 40
    const-string v3, "tipDialog"

    .line 41
    .line 42
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_3
    move-object v0, v3

    .line 47
    :goto_2
    new-instance v3, Lq5/o;

    .line 48
    .line 49
    invoke-direct {v3, p0, p1}, Lq5/o;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v2, v1, v3, v1}, Lu5/d;->g(Ljava/lang/String;ZLx7/a;Z)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public static final I(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)Lh7/p;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-static {p0, v2, v0, v1, v2}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->e0(Lcom/zykj/view/board/crop/BlackboardCropFragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->d:Lcom/zykj/blackboard/crop/CropManager;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "cropManager"

    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object v0, v2

    .line 17
    :cond_0
    iget-object v1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    const-string v1, "mBinding"

    .line 22
    .line 23
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object v2, v1

    .line 28
    :goto_0
    iget-object v1, v2, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->c:Lcom/zykj/view/widget/DoubleSeekBar;

    .line 29
    .line 30
    invoke-virtual {v1}, Lcom/zykj/view/widget/DoubleSeekBar;->getMaskProgress()F

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    float-to-long v1, v1

    .line 35
    new-instance v3, Lq5/e;

    .line 36
    .line 37
    invoke-direct {v3, p0, p1}, Lq5/e;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1, v2, v3}, Lcom/zykj/blackboard/crop/CropManager;->cropByTime(JLx7/l;)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 44
    .line 45
    return-object p0
.end method

.method public static final J(Lcom/zykj/view/board/crop/BlackboardCropFragment;ZLjava/lang/String;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    new-array v0, v0, [Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {p2, v0}, Lcom/blankj/utilcode/util/ToastUtils;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object p2, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 19
    .line 20
    if-nez p2, :cond_1

    .line 21
    .line 22
    const-string p2, "mBinding"

    .line 23
    .line 24
    invoke-static {p2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p2, 0x0

    .line 28
    :cond_1
    iget-object p2, p2, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->e:Landroid/widget/TextView;

    .line 29
    .line 30
    new-instance v0, Lq5/j;

    .line 31
    .line 32
    invoke-direct {v0, p0, p1}, Lq5/j;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 36
    .line 37
    .line 38
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 39
    .line 40
    return-object p0
.end method

.method public static final K(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->F()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->f:Lq5/a;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lq5/a;->b()Lx7/l;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public static final L(Lcom/zykj/view/board/crop/BlackboardCropFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->f:Lq5/a;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lq5/a;->a()Lx7/a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    :cond_0
    new-instance p1, Lq5/p;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Lq5/p;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-interface {p1}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static final M(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method

.method public static final N(Lcom/zykj/view/board/crop/BlackboardCropFragment;Landroid/view/View;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->p()Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p1, v0

    .line 12
    :goto_0
    if-nez p1, :cond_1

    .line 13
    .line 14
    const/4 p1, -0x1

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    sget-object v1, Lcom/zykj/view/board/crop/BlackboardCropFragment$a;->a:[I

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    aget p1, v1, p1

    .line 23
    .line 24
    :goto_1
    const/4 v1, 0x1

    .line 25
    const-string v2, "mBinding"

    .line 26
    .line 27
    if-eq p1, v1, :cond_c

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    if-eq p1, v1, :cond_9

    .line 31
    .line 32
    const/4 v1, 0x3

    .line 33
    if-eq p1, v1, :cond_6

    .line 34
    .line 35
    const/4 v3, 0x4

    .line 36
    if-eq p1, v3, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    const/4 p1, 0x0

    .line 40
    invoke-static {p0, v0, p1, v1, v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->e0(Lcom/zykj/view/board/crop/BlackboardCropFragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 44
    .line 45
    if-eqz p1, :cond_4

    .line 46
    .line 47
    iget-object v1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 48
    .line 49
    if-nez v1, :cond_3

    .line 50
    .line 51
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    move-object v1, v0

    .line 55
    :cond_3
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->c:Lcom/zykj/view/widget/DoubleSeekBar;

    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/zykj/view/widget/DoubleSeekBar;->getMaskProgress()F

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    float-to-int v1, v1

    .line 62
    new-instance v3, Lq5/q;

    .line 63
    .line 64
    invoke-direct {v3, p0}, Lq5/q;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 65
    .line 66
    .line 67
    new-instance v4, Lq5/r;

    .line 68
    .line 69
    invoke-direct {v4}, Lq5/r;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v1, v3, v4}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->m(ILx7/l;Lx7/l;)V

    .line 73
    .line 74
    .line 75
    :cond_4
    iget-object p0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 76
    .line 77
    if-nez p0, :cond_5

    .line 78
    .line 79
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_5
    move-object v0, p0

    .line 84
    :goto_2
    iget-object p0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->b:Landroid/widget/ImageView;

    .line 85
    .line 86
    sget p1, Lcom/zykj/view/R$drawable;->icon_record_start:I

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_6
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 93
    .line 94
    if-eqz p1, :cond_7

    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->l()V

    .line 97
    .line 98
    .line 99
    :cond_7
    iget-object p0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 100
    .line 101
    if-nez p0, :cond_8

    .line 102
    .line 103
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_8
    move-object v0, p0

    .line 108
    :goto_3
    iget-object p0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->b:Landroid/widget/ImageView;

    .line 109
    .line 110
    sget p1, Lcom/zykj/view/R$drawable;->view_icon_record_stop:I

    .line 111
    .line 112
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_9
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 117
    .line 118
    if-eqz p1, :cond_a

    .line 119
    .line 120
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->i()V

    .line 121
    .line 122
    .line 123
    :cond_a
    iget-object p0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 124
    .line 125
    if-nez p0, :cond_b

    .line 126
    .line 127
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_b
    move-object v0, p0

    .line 132
    :goto_4
    iget-object p0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->b:Landroid/widget/ImageView;

    .line 133
    .line 134
    sget p1, Lcom/zykj/view/R$drawable;->icon_record_start:I

    .line 135
    .line 136
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_c
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 141
    .line 142
    if-eqz p1, :cond_d

    .line 143
    .line 144
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->i()V

    .line 145
    .line 146
    .line 147
    :cond_d
    iget-object p0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 148
    .line 149
    if-nez p0, :cond_e

    .line 150
    .line 151
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_e
    move-object v0, p0

    .line 156
    :goto_5
    iget-object p0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->b:Landroid/widget/ImageView;

    .line 157
    .line 158
    sget p1, Lcom/zykj/view/R$drawable;->icon_record_start:I

    .line 159
    .line 160
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 161
    .line 162
    .line 163
    return-void
.end method

.method public static final O(Lcom/zykj/view/board/crop/BlackboardCropFragment;I)Lh7/p;
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    new-instance v0, Lq5/c;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lq5/c;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 14
    .line 15
    return-object p0
.end method

.method public static final P(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->F()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->l()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public static final Q(Ljava/lang/Throwable;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 7
    .line 8
    return-object p0
.end method

.method public static final S(Lcom/zykj/view/board/crop/BlackboardCropFragment;I)Lh7/p;
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/blackboard/crop/CropManager;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->getPath()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v1, v2

    .line 14
    :goto_0
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Lcom/zykj/blackboard/crop/CropManager;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->d:Lcom/zykj/blackboard/crop/CropManager;

    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 23
    .line 24
    const-string v1, "mBinding"

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    move-object v0, v2

    .line 32
    :cond_1
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->c:Lcom/zykj/view/widget/DoubleSeekBar;

    .line 33
    .line 34
    iget-object v3, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->d:Lcom/zykj/blackboard/crop/CropManager;

    .line 35
    .line 36
    if-nez v3, :cond_2

    .line 37
    .line 38
    const-string v3, "cropManager"

    .line 39
    .line 40
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    move-object v3, v2

    .line 44
    :cond_2
    invoke-virtual {v3}, Lcom/zykj/blackboard/crop/CropManager;->getCommandDelayTimeList()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v0, v3}, Lcom/zykj/view/widget/DoubleSeekBar;->setKeyPointList(Ljava/util/List;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 52
    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    move-object v2, v0

    .line 60
    :goto_1
    iget-object v0, v2, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->f:Landroid/widget/TextView;

    .line 61
    .line 62
    new-instance v1, Lq5/f;

    .line 63
    .line 64
    invoke-direct {v1, p1, p0}, Lq5/f;-><init>(ILcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 68
    .line 69
    .line 70
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 71
    .line 72
    return-object p0
.end method

.method public static final T(ILcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-lez p0, :cond_d

    .line 3
    .line 4
    iget-object v1, p1, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 5
    .line 6
    const-string v2, "mBinding"

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    move-object v1, v0

    .line 14
    :cond_0
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->c:Lcom/zykj/view/widget/DoubleSeekBar;

    .line 15
    .line 16
    int-to-float v3, p0

    .line 17
    invoke-virtual {v1, v3}, Lcom/zykj/view/widget/DoubleSeekBar;->setMax(F)V

    .line 18
    .line 19
    .line 20
    sget-object v1, La6/o;->a:La6/o;

    .line 21
    .line 22
    int-to-long v3, p0

    .line 23
    invoke-virtual {v1, v3, v4}, La6/o;->a(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    iput-object p0, p1, Lcom/zykj/view/board/crop/BlackboardCropFragment;->c:Ljava/lang/String;

    .line 28
    .line 29
    iget-object p0, p1, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 30
    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    move-object p0, v0

    .line 37
    :cond_1
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->f:Landroid/widget/TextView;

    .line 38
    .line 39
    iget-object v3, p1, Lcom/zykj/view/board/crop/BlackboardCropFragment;->b:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v4, p1, Lcom/zykj/view/board/crop/BlackboardCropFragment;->c:Ljava/lang/String;

    .line 42
    .line 43
    new-instance v5, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v3, "/"

    .line 52
    .line 53
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {p0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    .line 65
    .line 66
    iget-object p0, p1, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 67
    .line 68
    if-eqz p0, :cond_2

    .line 69
    .line 70
    new-instance v4, Lcom/zykj/view/board/crop/BlackboardCropFragment$d;

    .line 71
    .line 72
    invoke-direct {v4, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment$d;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v4}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->a(Lx3/c;)V

    .line 76
    .line 77
    .line 78
    :cond_2
    const/4 p0, 0x1

    .line 79
    iput-boolean p0, p1, Lcom/zykj/view/board/crop/BlackboardCropFragment;->a:Z

    .line 80
    .line 81
    iget-object p0, p1, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 82
    .line 83
    if-nez p0, :cond_3

    .line 84
    .line 85
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    move-object p0, v0

    .line 89
    :cond_3
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->b:Landroid/widget/ImageView;

    .line 90
    .line 91
    sget v4, Lcom/zykj/view/R$drawable;->selector_btn_music_play:I

    .line 92
    .line 93
    invoke-virtual {p0, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 94
    .line 95
    .line 96
    iget-object p0, p1, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 97
    .line 98
    if-eqz p0, :cond_4

    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->i()V

    .line 101
    .line 102
    .line 103
    :cond_4
    iget-object p0, p1, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 104
    .line 105
    if-nez p0, :cond_5

    .line 106
    .line 107
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    move-object p0, v0

    .line 111
    :cond_5
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->c:Lcom/zykj/view/widget/DoubleSeekBar;

    .line 112
    .line 113
    iget-object v4, p1, Lcom/zykj/view/board/crop/BlackboardCropFragment;->d:Lcom/zykj/blackboard/crop/CropManager;

    .line 114
    .line 115
    if-nez v4, :cond_6

    .line 116
    .line 117
    const-string v4, "cropManager"

    .line 118
    .line 119
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    move-object v4, v0

    .line 123
    :cond_6
    const-wide/16 v5, 0x0

    .line 124
    .line 125
    invoke-virtual {v4, v5, v6}, Lcom/zykj/blackboard/crop/CropManager;->calculateRecentTime(J)J

    .line 126
    .line 127
    .line 128
    move-result-wide v4

    .line 129
    long-to-float v4, v4

    .line 130
    invoke-virtual {p0, v4}, Lcom/zykj/view/widget/DoubleSeekBar;->setMaskProgress(F)V

    .line 131
    .line 132
    .line 133
    iget-object p0, p1, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 134
    .line 135
    if-nez p0, :cond_7

    .line 136
    .line 137
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    move-object p0, v0

    .line 141
    :cond_7
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->c:Lcom/zykj/view/widget/DoubleSeekBar;

    .line 142
    .line 143
    iget-object v4, p1, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 144
    .line 145
    if-nez v4, :cond_8

    .line 146
    .line 147
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    move-object v4, v0

    .line 151
    :cond_8
    iget-object v4, v4, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->c:Lcom/zykj/view/widget/DoubleSeekBar;

    .line 152
    .line 153
    invoke-virtual {v4}, Lcom/zykj/view/widget/DoubleSeekBar;->getMaskProgress()F

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    invoke-virtual {p0, v4}, Lcom/zykj/view/widget/DoubleSeekBar;->setProgress(F)V

    .line 158
    .line 159
    .line 160
    iget-object p0, p1, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 161
    .line 162
    if-nez p0, :cond_9

    .line 163
    .line 164
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    move-object p0, v0

    .line 168
    :cond_9
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->c:Lcom/zykj/view/widget/DoubleSeekBar;

    .line 169
    .line 170
    invoke-virtual {p0}, Lcom/zykj/view/widget/DoubleSeekBar;->getMaskProgress()F

    .line 171
    .line 172
    .line 173
    move-result p0

    .line 174
    float-to-long v4, p0

    .line 175
    invoke-virtual {v1, v4, v5}, La6/o;->a(J)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    iput-object p0, p1, Lcom/zykj/view/board/crop/BlackboardCropFragment;->b:Ljava/lang/String;

    .line 180
    .line 181
    iget-object p0, p1, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 182
    .line 183
    if-nez p0, :cond_a

    .line 184
    .line 185
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    move-object p0, v0

    .line 189
    :cond_a
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->f:Landroid/widget/TextView;

    .line 190
    .line 191
    iget-object v1, p1, Lcom/zykj/view/board/crop/BlackboardCropFragment;->b:Ljava/lang/String;

    .line 192
    .line 193
    iget-object v4, p1, Lcom/zykj/view/board/crop/BlackboardCropFragment;->c:Ljava/lang/String;

    .line 194
    .line 195
    new-instance v5, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 214
    .line 215
    .line 216
    iget-object p0, p1, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 217
    .line 218
    if-eqz p0, :cond_c

    .line 219
    .line 220
    iget-object v1, p1, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 221
    .line 222
    if-nez v1, :cond_b

    .line 223
    .line 224
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    goto :goto_0

    .line 228
    :cond_b
    move-object v0, v1

    .line 229
    :goto_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->c:Lcom/zykj/view/widget/DoubleSeekBar;

    .line 230
    .line 231
    invoke-virtual {v0}, Lcom/zykj/view/widget/DoubleSeekBar;->getProgress()F

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    float-to-int v0, v0

    .line 236
    new-instance v1, Lq5/g;

    .line 237
    .line 238
    invoke-direct {v1, p1}, Lq5/g;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 239
    .line 240
    .line 241
    new-instance v2, Lq5/h;

    .line 242
    .line 243
    invoke-direct {v2, p1}, Lq5/h;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p0, v0, v1, v2}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->m(ILx7/l;Lx7/l;)V

    .line 247
    .line 248
    .line 249
    :cond_c
    return-void

    .line 250
    :cond_d
    iget-object p0, p1, Lcom/zykj/view/board/crop/BlackboardCropFragment;->e:Lu5/d;

    .line 251
    .line 252
    if-nez p0, :cond_e

    .line 253
    .line 254
    const-string p0, "tipDialog"

    .line 255
    .line 256
    invoke-static {p0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    move-object v1, v0

    .line 260
    goto :goto_1

    .line 261
    :cond_e
    move-object v1, p0

    .line 262
    :goto_1
    sget p0, Lcom/zykj/view/R$string;->crop_duration_no_support:I

    .line 263
    .line 264
    invoke-virtual {p1, p0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    const-string p0, "getString(...)"

    .line 269
    .line 270
    invoke-static {v2, p0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    new-instance v4, Lq5/i;

    .line 274
    .line 275
    invoke-direct {v4, p1}, Lq5/i;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 276
    .line 277
    .line 278
    const/16 v6, 0x8

    .line 279
    .line 280
    const/4 v7, 0x0

    .line 281
    const/4 v3, 0x0

    .line 282
    const/4 v5, 0x0

    .line 283
    invoke-static/range {v1 .. v7}, Lu5/d;->h(Lu5/d;Ljava/lang/String;ZLx7/a;ZILjava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->F()V

    .line 287
    .line 288
    .line 289
    return-void
.end method

.method public static final U(Lcom/zykj/view/board/crop/BlackboardCropFragment;I)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->F()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final V(Lcom/zykj/view/board/crop/BlackboardCropFragment;Ljava/lang/Throwable;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->F()V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 10
    .line 11
    return-object p0
.end method

.method public static final W(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lh7/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->f:Lq5/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lq5/a;->d()Lx7/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :cond_0
    new-instance v0, Lq5/l;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lq5/l;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-interface {v0}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 20
    .line 21
    return-object p0
.end method

.method public static final X(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method

.method public static final Y(Ljava/lang/Throwable;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 7
    .line 8
    return-object p0
.end method

.method public static final Z(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->e:Lu5/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "tipDialog"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    move-object v1, v0

    .line 12
    sget v0, Lcom/zykj/view/R$string;->crop_version_no_support:I

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-string v0, "getString(...)"

    .line 19
    .line 20
    invoke-static {v2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v4, Lq5/d;

    .line 24
    .line 25
    invoke-direct {v4, p0}, Lq5/d;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 26
    .line 27
    .line 28
    const/16 v6, 0x8

    .line 29
    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v5, 0x0

    .line 33
    invoke-static/range {v1 .. v7}, Lu5/d;->h(Lu5/d;Ljava/lang/String;ZLx7/a;ZILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static final a0(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lh7/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->f:Lq5/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lq5/a;->c()Lx7/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :cond_0
    new-instance v0, Lq5/k;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lq5/k;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-interface {v0}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 20
    .line 21
    return-object p0
.end method

.method public static final b0(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method

.method public static synthetic e0(Lcom/zykj/view/board/crop/BlackboardCropFragment;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    sget p1, Lcom/zykj/view/R$string;->progress_content:I

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string p4, "getString(...)"

    .line 12
    .line 13
    invoke-static {p1, p4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 17
    .line 18
    if-eqz p3, :cond_1

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->d0(Ljava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static synthetic f(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->K(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)V

    return-void
.end method

.method public static synthetic g(Lcom/zykj/view/board/crop/BlackboardCropFragment;I)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->S(Lcom/zykj/view/board/crop/BlackboardCropFragment;I)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/view/board/crop/BlackboardCropFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->L(Lcom/zykj/view/board/crop/BlackboardCropFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/view/board/crop/BlackboardCropFragment;ZLjava/lang/String;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->J(Lcom/zykj/view/board/crop/BlackboardCropFragment;ZLjava/lang/String;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->Z(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    return-void
.end method

.method public static synthetic k(Ljava/lang/Throwable;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->Y(Ljava/lang/Throwable;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/zykj/view/board/crop/BlackboardCropFragment;I)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->U(Lcom/zykj/view/board/crop/BlackboardCropFragment;I)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/view/board/crop/BlackboardCropFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->H(Lcom/zykj/view/board/crop/BlackboardCropFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic n(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->P(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    return-void
.end method

.method public static synthetic o(Lcom/zykj/view/board/crop/BlackboardCropFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->N(Lcom/zykj/view/board/crop/BlackboardCropFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic p(ILcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->T(ILcom/zykj/view/board/crop/BlackboardCropFragment;)V

    return-void
.end method

.method public static synthetic q(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->X(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->M(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->b0(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Ljava/lang/Throwable;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->Q(Ljava/lang/Throwable;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lcom/zykj/view/board/crop/BlackboardCropFragment;Ljava/lang/Throwable;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->V(Lcom/zykj/view/board/crop/BlackboardCropFragment;Ljava/lang/Throwable;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->W(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->a0(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->I(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lcom/zykj/view/board/crop/BlackboardCropFragment;I)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->O(Lcom/zykj/view/board/crop/BlackboardCropFragment;I)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic z(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/blackboard/crop/CropManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->d:Lcom/zykj/blackboard/crop/CropManager;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final F()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->j:Landroid/app/ProgressDialog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->j:Landroid/app/ProgressDialog;

    .line 10
    .line 11
    return-void
.end method

.method public final R(Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->h:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "requireContext(...)"

    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v0, v1, v2}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 24
    .line 25
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 26
    .line 27
    const-string v1, "mBinding"

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    move-object v0, v2

    .line 35
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->d:Landroid/widget/RelativeLayout;

    .line 36
    .line 37
    iget-object v3, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 38
    .line 39
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 43
    .line 44
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v3, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 48
    .line 49
    invoke-static {v3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    const/4 v4, -0x1

    .line 57
    iput v4, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 58
    .line 59
    iput v4, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 60
    .line 61
    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 65
    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    move-object v0, v2

    .line 72
    :cond_1
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->d:Landroid/widget/RelativeLayout;

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    const/4 v3, 0x2

    .line 79
    const/4 v4, 0x0

    .line 80
    if-ne v0, v3, :cond_3

    .line 81
    .line 82
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 83
    .line 84
    if-nez v0, :cond_2

    .line 85
    .line 86
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    move-object v0, v2

    .line 90
    :cond_2
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->d:Landroid/widget/RelativeLayout;

    .line 91
    .line 92
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 93
    .line 94
    .line 95
    :cond_3
    new-instance v0, Ljava/io/File;

    .line 96
    .line 97
    const-string v1, "page_router.bin"

    .line 98
    .line 99
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_4

    .line 107
    .line 108
    const/4 v0, 0x3

    .line 109
    invoke-static {p0, v2, v4, v0, v2}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->e0(Lcom/zykj/view/board/crop/BlackboardCropFragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 113
    .line 114
    if-eqz v0, :cond_5

    .line 115
    .line 116
    new-instance v1, Lq5/s;

    .line 117
    .line 118
    invoke-direct {v1, p0}, Lq5/s;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 119
    .line 120
    .line 121
    new-instance v2, Lq5/t;

    .line 122
    .line 123
    invoke-direct {v2}, Lq5/t;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, p1, v1, v2}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->h(Ljava/lang/String;Lx7/l;Lx7/l;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_4
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 131
    .line 132
    if-eqz p1, :cond_5

    .line 133
    .line 134
    new-instance v0, Lq5/u;

    .line 135
    .line 136
    invoke-direct {v0, p0}, Lq5/u;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 140
    .line 141
    .line 142
    :cond_5
    return-void
.end method

.method public final c0(Lq5/a;)V
    .locals 1

    .line 1
    const-string v0, "blackboardCropConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->f:Lq5/a;

    .line 7
    .line 8
    return-void
.end method

.method public final d0(Ljava/lang/String;Z)V
    .locals 3

    .line 1
    const-string v0, "tips"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->j:Landroid/app/ProgressDialog;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, ""

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static {v0, v1, p1, v2, p2}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->j:Landroid/app/ProgressDialog;

    .line 25
    .line 26
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->G()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    const-string p2, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->a(Landroid/view/LayoutInflater;)Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string p2, "getRoot(...)"

    .line 20
    .line 21
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->F()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->a:Z

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->i()V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->j()V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->g()V

    .line 27
    .line 28
    .line 29
    :cond_2
    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->a:Z

    .line 31
    .line 32
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public onHiddenChanged(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onHiddenChanged(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->i()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->a:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->i()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->a:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->i()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->setUserVisibleHint(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->i()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

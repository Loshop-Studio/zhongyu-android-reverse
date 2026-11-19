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
.field public d:Z

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Lpb/d;

.field public h:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

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
    iput-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->e:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->f:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method public static final synthetic A(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic B(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/merge/sketch/view/MergeSketchPlayView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->h:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic C(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic D(Lcom/zykj/view/board/crop/BlackboardCropFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public static final F(Lcom/zykj/view/board/crop/BlackboardCropFragment;Landroid/view/View;)V
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
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->e:Lcom/zykj/view/widget/DoubleSeekBar;

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
    iget-object v3, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lpb/d;

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
    new-instance v3, Llb/d;

    .line 48
    .line 49
    invoke-direct {v3, p0, p1}, Llb/d;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v2, v1, v3, v1}, Lpb/d;->g(Ljava/lang/String;ZLhd/a;Z)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public static final G(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)Lqc/q;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-static {p0, v2, v0, v1, v2}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->Q(Lcom/zykj/view/board/crop/BlackboardCropFragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string v0, "cropManager"

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const-string v0, "mBinding"

    .line 20
    .line 21
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    move-object v0, v2

    .line 25
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->e:Lcom/zykj/view/widget/DoubleSeekBar;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/zykj/view/widget/DoubleSeekBar;->getMaskProgress()F

    .line 28
    .line 29
    .line 30
    new-instance v0, Llb/i;

    .line 31
    .line 32
    invoke-direct {v0, p0, p1}, Llb/i;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)V

    .line 33
    .line 34
    .line 35
    throw v2
.end method

.method public static final H(Lcom/zykj/view/board/crop/BlackboardCropFragment;ZLjava/lang/String;)Lqc/q;
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
    invoke-static {p2, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

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
    iget-object p2, p2, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->g:Landroid/widget/TextView;

    .line 29
    .line 30
    new-instance v0, Llb/j;

    .line 31
    .line 32
    invoke-direct {v0, p0, p1}, Llb/j;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 36
    .line 37
    .line 38
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 39
    .line 40
    return-object p0
.end method

.method public static final I(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->E()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final J(Lcom/zykj/view/board/crop/BlackboardCropFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Llb/e;

    .line 5
    .line 6
    invoke-direct {p1, p0}, Llb/e;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static final K(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lqc/q;
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
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method

.method public static final L(Lcom/zykj/view/board/crop/BlackboardCropFragment;Landroid/view/View;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->h:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->status()Lcom/zykj/merge/sketch/constant/PlayStatus;

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
    invoke-static {p0, v0, p1, v1, v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->Q(Lcom/zykj/view/board/crop/BlackboardCropFragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->h:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

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
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->e:Lcom/zykj/view/widget/DoubleSeekBar;

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
    new-instance v3, Llb/f;

    .line 63
    .line 64
    invoke-direct {v3, p0}, Llb/f;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 65
    .line 66
    .line 67
    new-instance v4, Llb/g;

    .line 68
    .line 69
    invoke-direct {v4}, Llb/g;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v1, v3, v4}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->seekTo(ILhd/l;Lhd/l;)V

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
    iget-object p0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->d:Landroid/widget/ImageView;

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
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->h:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 93
    .line 94
    if-eqz p1, :cond_7

    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->resume()V

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
    iget-object p0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->d:Landroid/widget/ImageView;

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
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->h:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 117
    .line 118
    if-eqz p1, :cond_a

    .line 119
    .line 120
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->pause()V

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
    iget-object p0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->d:Landroid/widget/ImageView;

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
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->h:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 141
    .line 142
    if-eqz p1, :cond_d

    .line 143
    .line 144
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->pause()V

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
    iget-object p0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->d:Landroid/widget/ImageView;

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

.method public static final M(Lcom/zykj/view/board/crop/BlackboardCropFragment;I)Lqc/q;
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->h:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    new-instance v0, Llb/h;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Llb/h;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 14
    .line 15
    return-object p0
.end method

.method public static final N(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->E()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->h:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->resume()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public static final O(Ljava/lang/Throwable;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 7
    .line 8
    return-object p0
.end method

.method public static synthetic Q(Lcom/zykj/view/board/crop/BlackboardCropFragment;Ljava/lang/String;ZILjava/lang/Object;)V
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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->P(Ljava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private final initView()V
    .locals 11

    .line 1
    new-instance v0, Lpb/d;

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
    invoke-direct {v0, v1, v2, v3, v4}, Lpb/d;-><init>(Landroid/content/Context;IILkotlin/jvm/internal/n;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g:Lpb/d;

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
    iget-object v5, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->c:Landroid/widget/ImageView;

    .line 31
    .line 32
    const-string v0, "ivBack"

    .line 33
    .line 34
    invoke-static {v5, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    new-instance v8, Llb/a;

    .line 38
    .line 39
    invoke-direct {v8, p0}, Llb/a;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

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
    invoke-static/range {v5 .. v10}, Lvb/a;->d(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->d:Landroid/widget/ImageView;

    .line 58
    .line 59
    new-instance v2, Llb/b;

    .line 60
    .line 61
    invoke-direct {v2, p0}, Llb/b;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->e:Lcom/zykj/view/widget/DoubleSeekBar;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->e:Lcom/zykj/view/widget/DoubleSeekBar;

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
    iget-object v5, v4, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->g:Landroid/widget/TextView;

    .line 113
    .line 114
    const-string v0, "tvConfirm"

    .line 115
    .line 116
    invoke-static {v5, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    new-instance v8, Llb/c;

    .line 120
    .line 121
    invoke-direct {v8, p0}, Llb/c;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

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
    invoke-static/range {v5 .. v10}, Lvb/a;->d(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public static synthetic o(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->I(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)V

    return-void
.end method

.method public static synthetic p(Lcom/zykj/view/board/crop/BlackboardCropFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->J(Lcom/zykj/view/board/crop/BlackboardCropFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic q(Lcom/zykj/view/board/crop/BlackboardCropFragment;ZLjava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->H(Lcom/zykj/view/board/crop/BlackboardCropFragment;ZLjava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lcom/zykj/view/board/crop/BlackboardCropFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->F(Lcom/zykj/view/board/crop/BlackboardCropFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic s(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->N(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    return-void
.end method

.method public static synthetic t(Lcom/zykj/view/board/crop/BlackboardCropFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->L(Lcom/zykj/view/board/crop/BlackboardCropFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic u(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->K(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Ljava/lang/Throwable;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->O(Ljava/lang/Throwable;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->G(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Lcom/zykj/view/board/crop/BlackboardCropFragment;I)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->M(Lcom/zykj/view/board/crop/BlackboardCropFragment;I)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic y(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lka/a;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method public static final synthetic z(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->i:Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final E()V
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

.method public final P(Ljava/lang/String;Z)V
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
    invoke-direct {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->initView()V

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
    invoke-virtual {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->E()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->d:Z

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->h:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->pause()V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->h:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->release()V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->h:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->destroy()V

    .line 27
    .line 28
    .line 29
    :cond_2
    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->d:Z

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
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->h:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->pause()V

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
    iget-boolean v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->d:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->h:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->pause()V

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
    iget-boolean v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->d:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->h:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->pause()V

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
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment;->h:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->pause()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

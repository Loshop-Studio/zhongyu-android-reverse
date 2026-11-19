.class public final Lcom/zykj/view/board/crop/BlackboardCropFragment$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/view/widget/DoubleSeekBar$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/crop/BlackboardCropFragment;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/crop/BlackboardCropFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$b;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic d(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment$b;->i(Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment$b;->h(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    return-void
.end method

.method public static synthetic f(Lcom/zykj/view/board/crop/BlackboardCropFragment;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment$b;->g(Lcom/zykj/view/board/crop/BlackboardCropFragment;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lcom/zykj/view/board/crop/BlackboardCropFragment;I)Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lr7/m;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lr7/m;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 13
    .line 14
    .line 15
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0
.end method

.method public static final h(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->hideProgress()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final i(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p0
.end method


# virtual methods
.method public a(Lcom/zykj/view/widget/DoubleSeekBar;)V
    .locals 5

    .line 1
    const-string v0, "seekBar"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/view/widget/DoubleSeekBar;->getProgress()F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p1}, Lcom/zykj/view/widget/DoubleSeekBar;->getMaskProgress()F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    cmpg-float v0, v0, v1

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-ltz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$b;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 20
    .line 21
    sget-object v2, Lb8/w;->a:Lb8/w;

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/zykj/view/widget/DoubleSeekBar;->getMaskProgress()F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    float-to-long v3, v3

    .line 28
    invoke-virtual {v2, v3, v4}, Lb8/w;->a(J)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v0, v2}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->r(Lcom/zykj/view/board/crop/BlackboardCropFragment;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$b;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 36
    .line 37
    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->n(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-nez v0, :cond_0

    .line 42
    .line 43
    const-string v0, "mBinding"

    .line 44
    .line 45
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    move-object v0, v1

    .line 49
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->f:Landroid/widget/TextView;

    .line 50
    .line 51
    iget-object v2, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$b;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 52
    .line 53
    invoke-static {v2}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->o(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    iget-object v3, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$b;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 58
    .line 59
    invoke-static {v3}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->q(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    new-instance v4, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v2, "/"

    .line 72
    .line 73
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$b;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 87
    .line 88
    const/4 v2, 0x0

    .line 89
    const/4 v3, 0x3

    .line 90
    invoke-static {v0, v1, v2, v3, v1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->E(Lcom/zykj/view/board/crop/BlackboardCropFragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$b;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 94
    .line 95
    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-eqz v0, :cond_1

    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/zykj/view/widget/DoubleSeekBar;->getProgress()F

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    float-to-int p1, p1

    .line 106
    iget-object v1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$b;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 107
    .line 108
    new-instance v2, Lr7/k;

    .line 109
    .line 110
    invoke-direct {v2, v1}, Lr7/k;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 111
    .line 112
    .line 113
    new-instance v1, Lr7/l;

    .line 114
    .line 115
    invoke-direct {v1}, Lr7/l;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, p1, v2, v1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->seekTo(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 119
    .line 120
    .line 121
    :cond_1
    return-void

    .line 122
    :cond_2
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$b;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 123
    .line 124
    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->m(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lz4/a;

    .line 125
    .line 126
    .line 127
    const-string v0, "cropManager"

    .line 128
    .line 129
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1}, Lcom/zykj/view/widget/DoubleSeekBar;->getProgress()F

    .line 133
    .line 134
    .line 135
    throw v1
.end method

.method public b(Lcom/zykj/view/widget/DoubleSeekBar;F)V
    .locals 3

    .line 1
    const-string v0, "seekBar"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$b;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 7
    .line 8
    sget-object v0, Lb8/w;->a:Lb8/w;

    .line 9
    .line 10
    float-to-long v1, p2

    .line 11
    invoke-virtual {v0, v1, v2}, Lb8/w;->a(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-static {p1, p2}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->r(Lcom/zykj/view/board/crop/BlackboardCropFragment;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$b;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 19
    .line 20
    invoke-static {p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->n(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    const-string p1, "mBinding"

    .line 27
    .line 28
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    :cond_0
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->f:Landroid/widget/TextView;

    .line 33
    .line 34
    iget-object p2, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$b;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 35
    .line 36
    invoke-static {p2}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->o(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$b;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 41
    .line 42
    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->q(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v1, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p2, "/"

    .line 55
    .line 56
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public c(Lcom/zykj/view/widget/DoubleSeekBar;)V
    .locals 1

    .line 1
    const-string v0, "seekBar"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$b;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->pause()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

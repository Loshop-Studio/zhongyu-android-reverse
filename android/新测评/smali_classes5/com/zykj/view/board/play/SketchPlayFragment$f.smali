.class public final Lcom/zykj/view/board/play/SketchPlayFragment$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/play/SketchPlayFragment;->P()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public a:Lcom/zykj/merge/sketch/constant/PlayStatus;

.field public final synthetic b:Lcom/zykj/view/board/play/SketchPlayFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$f;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Lcom/zykj/view/board/play/SketchPlayFragment$f;Lcom/zykj/view/board/play/SketchPlayFragment;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$f;->c(Lcom/zykj/view/board/play/SketchPlayFragment$f;Lcom/zykj/view/board/play/SketchPlayFragment;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment$f;->d(Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/zykj/view/board/play/SketchPlayFragment$f;Lcom/zykj/view/board/play/SketchPlayFragment;I)Lkotlin/Unit;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$f;->a:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    if-eqz p0, :cond_3

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_START:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 6
    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_RESUME:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 10
    .line 11
    if-ne p0, v0, :cond_3

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Landroidx/lifecycle/Lifecycle;->getCurrentState()Landroidx/lifecycle/Lifecycle$State;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object v0, Landroidx/lifecycle/Lifecycle$State;->RESUMED:Landroidx/lifecycle/Lifecycle$State;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroidx/lifecycle/Lifecycle$State;->isAtLeast(Landroidx/lifecycle/Lifecycle$State;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_3

    .line 32
    .line 33
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->q(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-nez p0, :cond_1

    .line 38
    .line 39
    const-string p0, "mBinding"

    .line 40
    .line 41
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    :cond_1
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->h:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->status()Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_PAUSE:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 52
    .line 53
    if-ne p0, v0, :cond_2

    .line 54
    .line 55
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->D(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    if-nez p2, :cond_3

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->j0()V

    .line 62
    .line 63
    .line 64
    :cond_3
    :goto_0
    invoke-virtual {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->hideProgress()V

    .line 65
    .line 66
    .line 67
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0
.end method

.method public static final d(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    new-array p0, p0, [Ljava/lang/Object;

    .line 8
    .line 9
    const-string v0, "\u64cd\u4f5c\u5931\u8d25"

    .line 10
    .line 11
    invoke-static {v0, p0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    .line 16
    return-object p0
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 2

    .line 1
    const-string p3, "seekBar"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$f;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 7
    .line 8
    sget-object p3, Lcom/zykj/view/board/play/SketchPlayFragment;->s:Lcom/zykj/view/board/play/SketchPlayFragment$a;

    .line 9
    .line 10
    int-to-long v0, p2

    .line 11
    invoke-virtual {p3, v0, v1}, Lcom/zykj/view/board/play/SketchPlayFragment$a;->a(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-static {p1, p3}, Lcom/zykj/view/board/play/SketchPlayFragment;->B(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$f;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 19
    .line 20
    invoke-static {p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment;->A(Lcom/zykj/view/board/play/SketchPlayFragment;I)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$f;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 24
    .line 25
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->q(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    const-string p1, "mBinding"

    .line 32
    .line 33
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    :cond_0
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->b:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 38
    .line 39
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->f:Landroid/widget/TextView;

    .line 40
    .line 41
    iget-object p2, p0, Lcom/zykj/view/board/play/SketchPlayFragment$f;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 42
    .line 43
    invoke-static {p2}, Lcom/zykj/view/board/play/SketchPlayFragment;->t(Lcom/zykj/view/board/play/SketchPlayFragment;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    iget-object p3, p0, Lcom/zykj/view/board/play/SketchPlayFragment$f;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 48
    .line 49
    invoke-static {p3}, Lcom/zykj/view/board/play/SketchPlayFragment;->u(Lcom/zykj/view/board/play/SketchPlayFragment;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string p2, "/"

    .line 62
    .line 63
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .line 1
    const-string v0, "seekBar"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$f;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->q(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    const-string v1, "mBinding"

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    move-object p1, v0

    .line 21
    :cond_0
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->h:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->status()Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$f;->a:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 28
    .line 29
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$f;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 30
    .line 31
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->q(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-nez p1, :cond_1

    .line 36
    .line 37
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v0, p1

    .line 42
    :goto_0
    iget-object p1, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->h:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->waiting()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 4

    .line 1
    const-string v0, "seekBar"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$f;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x3

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {v0, v3, v1, v2, v3}, Lcom/zykj/view/board/play/SketchPlayFragment;->g0(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$f;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 15
    .line 16
    invoke-static {v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->q(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const-string v0, "mBinding"

    .line 23
    .line 24
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v3, v0

    .line 29
    :goto_0
    iget-object v0, v3, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->h:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$f;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 36
    .line 37
    new-instance v2, Lt7/v;

    .line 38
    .line 39
    invoke-direct {v2, p0, v1}, Lt7/v;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment$f;Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 40
    .line 41
    .line 42
    new-instance v1, Lt7/w;

    .line 43
    .line 44
    invoke-direct {v1}, Lt7/w;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1, v2, v1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->seekTo(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

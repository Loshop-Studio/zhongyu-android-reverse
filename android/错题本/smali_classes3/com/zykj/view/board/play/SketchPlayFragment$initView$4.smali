.class public final Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/play/SketchPlayFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\'\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000cR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "com/zykj/view/board/play/SketchPlayFragment$initView$4",
        "Landroid/widget/SeekBar$OnSeekBarChangeListener;",
        "Landroid/widget/SeekBar;",
        "seekBar",
        "",
        "progress",
        "",
        "fromUser",
        "Ld6/s;",
        "onProgressChanged",
        "(Landroid/widget/SeekBar;IZ)V",
        "onStartTrackingTouch",
        "(Landroid/widget/SeekBar;)V",
        "onStopTrackingTouch",
        "Lcom/zykj/merge/sketch/constant/PlayStatus;",
        "lastPlayStatus",
        "Lcom/zykj/merge/sketch/constant/PlayStatus;",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private lastPlayStatus:Lcom/zykj/merge/sketch/constant/PlayStatus;

.field final synthetic this$0:Lcom/zykj/view/board/play/SketchPlayFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;Lcom/zykj/view/board/play/SketchPlayFragment;I)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;->onStopTrackingTouch$lambda$0(Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;Lcom/zykj/view/board/play/SketchPlayFragment;I)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Throwable;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;->onStopTrackingTouch$lambda$1(Ljava/lang/Throwable;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method private static final onStopTrackingTouch$lambda$0(Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;Lcom/zykj/view/board/play/SketchPlayFragment;I)Ld6/s;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;->lastPlayStatus:Lcom/zykj/merge/sketch/constant/PlayStatus;

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
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-eqz p0, :cond_2

    .line 38
    .line 39
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->status()Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_PAUSE:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 46
    .line 47
    if-ne p0, v0, :cond_1

    .line 48
    .line 49
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$sketchResumePlaying(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    if-nez p2, :cond_3

    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->sketchStartPlaying()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    const-string p0, "mBinding"

    .line 60
    .line 61
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    throw p0

    .line 66
    :cond_3
    :goto_0
    invoke-virtual {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->hideProgress()V

    .line 67
    .line 68
    .line 69
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 70
    .line 71
    return-object p0
.end method

.method private static final onStopTrackingTouch$lambda$1(Ljava/lang/Throwable;)Ld6/s;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v0, p0}, Lcom/blankj/utilcode/util/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 15
    .line 16
    return-object p0
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    .line 1
    const-string p3, "seekBar"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 7
    .line 8
    sget-object p3, Lcom/zykj/view/board/play/SketchPlayFragment;->Companion:Lcom/zykj/view/board/play/SketchPlayFragment$Companion;

    .line 9
    .line 10
    int-to-long v0, p2

    .line 11
    invoke-virtual {p3, v0, v1}, Lcom/zykj/view/board/play/SketchPlayFragment$Companion;->formatTime(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-static {p1, p3}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$setProgressTime$p(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 19
    .line 20
    invoke-static {p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$setProgress$p(Lcom/zykj/view/board/play/SketchPlayFragment;I)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 24
    .line 25
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 32
    .line 33
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->tvTime:Landroid/widget/TextView;

    .line 34
    .line 35
    iget-object p2, p0, Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 36
    .line 37
    invoke-static {p2}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getProgressTime$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iget-object p3, p0, Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 42
    .line 43
    invoke-static {p3}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getTotalTime$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p2, "/"

    .line 56
    .line 57
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_0
    const-string p1, "mBinding"

    .line 72
    .line 73
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const/4 p1, 0x0

    .line 77
    throw p1
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .line 1
    const-string v0, "seekBar"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

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
    if-eqz p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->status()Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;->lastPlayStatus:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 24
    .line 25
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 26
    .line 27
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->waiting()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 4

    .line 1
    const-string v0, "seekBar"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x3

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {v0, v3, v1, v2, v3}, Lcom/zykj/view/board/play/SketchPlayFragment;->showProgress$default(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 15
    .line 16
    invoke-static {v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 29
    .line 30
    new-instance v2, Landroidx/navigation/d;

    .line 31
    .line 32
    const/16 v3, 0x10

    .line 33
    .line 34
    invoke-direct {v2, v3, p0, v1}, Landroidx/navigation/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    new-instance v1, Lcom/zykj/mistake/feature/notebook/list/k1;

    .line 38
    .line 39
    const/16 v3, 0x15

    .line 40
    .line 41
    invoke-direct {v1, v3}, Lcom/zykj/mistake/feature/notebook/list/k1;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p1, v2, v1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->seekTo(ILr6/c;Lr6/c;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    const-string p1, "mBinding"

    .line 49
    .line 50
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v3
.end method

.class public final Lcom/zykj/view/board/crop/BlackboardCropFragment$initView$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/crop/BlackboardCropFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "com/zykj/view/board/crop/BlackboardCropFragment$initView$4",
        "Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;",
        "Lcom/zykj/view/widget/DoubleSeekBar;",
        "seekBar",
        "",
        "progress",
        "Ld6/s;",
        "onSeeking",
        "(Lcom/zykj/view/widget/DoubleSeekBar;F)V",
        "onStartTrackingTouch",
        "(Lcom/zykj/view/widget/DoubleSeekBar;)V",
        "onStopTrackingTouch",
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
.field final synthetic this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$initView$4;->this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Ljava/lang/Throwable;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment$initView$4;->onStopTrackingTouch$lambda$2(Ljava/lang/Throwable;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment$initView$4;->onStopTrackingTouch$lambda$1$lambda$0(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    return-void
.end method

.method public static synthetic c(ILcom/zykj/view/board/crop/BlackboardCropFragment;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment$initView$4;->onStopTrackingTouch$lambda$1(Lcom/zykj/view/board/crop/BlackboardCropFragment;I)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method private static final onStopTrackingTouch$lambda$1(Lcom/zykj/view/board/crop/BlackboardCropFragment;I)Ld6/s;
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$getSketchView$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lcom/zykj/view/board/crop/c;

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    invoke-direct {v0, v1, p0}, Lcom/zykj/view/board/crop/c;-><init>(ILcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 17
    .line 18
    return-object p0
.end method

.method private static final onStopTrackingTouch$lambda$1$lambda$0(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->hideProgress()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final onStopTrackingTouch$lambda$2(Ljava/lang/Throwable;)Ld6/s;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 7
    .line 8
    return-object p0
.end method


# virtual methods
.method public onSeeking(Lcom/zykj/view/widget/DoubleSeekBar;F)V
    .locals 0

    const-string p2, "seekBar"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onStartTrackingTouch(Lcom/zykj/view/widget/DoubleSeekBar;)V
    .locals 2

    .line 1
    const-string v0, "seekBar"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$initView$4;->this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$getSketchView$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->status()Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object p1, v0

    .line 21
    :goto_0
    sget-object v1, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_START:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 22
    .line 23
    if-eq p1, v1, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$initView$4;->this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 26
    .line 27
    invoke-static {p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$getSketchView$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->status()Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_1
    sget-object p1, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_RESUME:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 38
    .line 39
    if-ne v0, p1, :cond_3

    .line 40
    .line 41
    :cond_2
    iget-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$initView$4;->this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 42
    .line 43
    invoke-static {p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$getSketchView$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->pause()V

    .line 50
    .line 51
    .line 52
    :cond_3
    return-void
.end method

.method public onStopTrackingTouch(Lcom/zykj/view/widget/DoubleSeekBar;)V
    .locals 5

    .line 1
    const-string v0, "seekBar"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$initView$4;->this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$getCropManager$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/blackboard/crop/CropManager;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/view/widget/DoubleSeekBar;->getMaskProgress()F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    float-to-long v2, v2

    .line 20
    invoke-virtual {v0, v2, v3}, Lcom/zykj/blackboard/crop/CropManager;->calculateRecentTime(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    long-to-float v0, v2

    .line 25
    invoke-virtual {p1, v0}, Lcom/zykj/view/widget/DoubleSeekBar;->setMaskProgress(F)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/zykj/view/widget/DoubleSeekBar;->getProgress()F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p1}, Lcom/zykj/view/widget/DoubleSeekBar;->getMaskProgress()F

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    cmpg-float v0, v0, v2

    .line 37
    .line 38
    if-gez v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/zykj/view/widget/DoubleSeekBar;->getMaskProgress()F

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {p1, v0}, Lcom/zykj/view/widget/DoubleSeekBar;->setProgress(F)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$initView$4;->this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 48
    .line 49
    sget-object v2, Lcom/zykj/view/utils/TimeFormatUtils;->INSTANCE:Lcom/zykj/view/utils/TimeFormatUtils;

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/zykj/view/widget/DoubleSeekBar;->getMaskProgress()F

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    float-to-long v3, v3

    .line 56
    invoke-virtual {v2, v3, v4}, Lcom/zykj/view/utils/TimeFormatUtils;->formatTime(J)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-static {v0, v2}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$setProgressTime$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$initView$4;->this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 64
    .line 65
    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$getMBinding$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-eqz v0, :cond_0

    .line 70
    .line 71
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->tvTime:Landroid/widget/TextView;

    .line 72
    .line 73
    iget-object v2, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$initView$4;->this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 74
    .line 75
    invoke-static {v2}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$getProgressTime$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    iget-object v3, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$initView$4;->this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 80
    .line 81
    invoke-static {v3}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$getTotalTime$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    new-instance v4, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v2, "/"

    .line 94
    .line 95
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$initView$4;->this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 109
    .line 110
    const/4 v2, 0x0

    .line 111
    const/4 v3, 0x3

    .line 112
    invoke-static {v0, v1, v2, v3, v1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->showProgress$default(Lcom/zykj/view/board/crop/BlackboardCropFragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$initView$4;->this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 116
    .line 117
    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$getSketchView$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-eqz v0, :cond_1

    .line 122
    .line 123
    invoke-virtual {p1}, Lcom/zykj/view/widget/DoubleSeekBar;->getProgress()F

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    float-to-int p1, p1

    .line 128
    iget-object v1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$initView$4;->this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 129
    .line 130
    new-instance v2, Lcom/zykj/view/board/crop/b;

    .line 131
    .line 132
    const/4 v3, 0x5

    .line 133
    invoke-direct {v2, v3, v1}, Lcom/zykj/view/board/crop/b;-><init>(ILcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 134
    .line 135
    .line 136
    new-instance v1, Lcom/zykj/mistake/feature/notebook/list/k1;

    .line 137
    .line 138
    const/16 v3, 0x12

    .line 139
    .line 140
    invoke-direct {v1, v3}, Lcom/zykj/mistake/feature/notebook/list/k1;-><init>(I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, p1, v2, v1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->seekTo(ILr6/c;Lr6/c;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_0
    const-string p1, "mBinding"

    .line 148
    .line 149
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v1

    .line 153
    :cond_1
    return-void

    .line 154
    :cond_2
    const-string p1, "cropManager"

    .line 155
    .line 156
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw v1
.end method

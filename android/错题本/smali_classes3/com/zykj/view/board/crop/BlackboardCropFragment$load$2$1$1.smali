.class public final Lcom/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/merge/sketch/listener/PlayStatusListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/crop/BlackboardCropFragment;->load(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "com/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1",
        "Lcom/zykj/merge/sketch/listener/PlayStatusListener;",
        "Ld6/s;",
        "onPlayEnd",
        "()V",
        "onPlayPause",
        "onPlayStart",
        "onPlayWait",
        "",
        "progress",
        "onProgress",
        "(J)V",
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
    iput-object p1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1;->this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1;->onPlayPause$lambda$1(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    return-void
.end method

.method public static synthetic b(Lcom/zykj/view/board/crop/BlackboardCropFragment;J)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1;->onProgress$lambda$4(Lcom/zykj/view/board/crop/BlackboardCropFragment;J)V

    return-void
.end method

.method public static synthetic c(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1;->onPlayEnd$lambda$0(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    return-void
.end method

.method public static synthetic d(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1;->onPlayStart$lambda$2(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    return-void
.end method

.method public static synthetic e(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1;->onPlayWait$lambda$3(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    return-void
.end method

.method private static final onPlayEnd$lambda$0(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$getMBinding$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->ivRecord:Landroid/widget/ImageView;

    .line 8
    .line 9
    sget v0, Lcom/zykj/view/R$drawable;->selector_btn_music_play:I

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p0, "mBinding"

    .line 16
    .line 17
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    throw p0
.end method

.method private static final onPlayPause$lambda$1(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$getMBinding$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->ivRecord:Landroid/widget/ImageView;

    .line 8
    .line 9
    sget v0, Lcom/zykj/view/R$drawable;->selector_btn_music_play:I

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p0, "mBinding"

    .line 16
    .line 17
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    throw p0
.end method

.method private static final onPlayStart$lambda$2(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$getMBinding$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->ivRecord:Landroid/widget/ImageView;

    .line 8
    .line 9
    sget v0, Lcom/zykj/view/R$drawable;->selector_btn_music_pause:I

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p0, "mBinding"

    .line 16
    .line 17
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    throw p0
.end method

.method private static final onPlayWait$lambda$3(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$getMBinding$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->ivRecord:Landroid/widget/ImageView;

    .line 8
    .line 9
    sget v0, Lcom/zykj/view/R$drawable;->selector_btn_music_pause:I

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p0, "mBinding"

    .line 16
    .line 17
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    throw p0
.end method

.method private static final onProgress$lambda$4(Lcom/zykj/view/board/crop/BlackboardCropFragment;J)V
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$getMBinding$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "mBinding"

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->seekBar:Lcom/zykj/view/widget/DoubleSeekBar;

    .line 11
    .line 12
    long-to-float v3, p1

    .line 13
    invoke-virtual {v0, v3}, Lcom/zykj/view/widget/DoubleSeekBar;->setProgress(F)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/zykj/view/utils/TimeFormatUtils;->INSTANCE:Lcom/zykj/view/utils/TimeFormatUtils;

    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Lcom/zykj/view/utils/TimeFormatUtils;->formatTime(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p0, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$setProgressTime$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$getMBinding$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->tvTime:Landroid/widget/TextView;

    .line 32
    .line 33
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$getProgressTime$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-static {p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$getTotalTime$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p2, "/"

    .line 50
    .line 51
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v1

    .line 69
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v1
.end method


# virtual methods
.method public onPlayEnd()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1;->this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$getMBinding$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->ivRecord:Landroid/widget/ImageView;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1;->this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 12
    .line 13
    new-instance v2, Lcom/zykj/view/board/crop/c;

    .line 14
    .line 15
    const/4 v3, 0x6

    .line 16
    invoke-direct {v2, v3, v1}, Lcom/zykj/view/board/crop/c;-><init>(ILcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string v0, "mBinding"

    .line 24
    .line 25
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    throw v0
.end method

.method public onPlayPause()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1;->this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$getMBinding$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->ivRecord:Landroid/widget/ImageView;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1;->this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 12
    .line 13
    new-instance v2, Lcom/zykj/view/board/crop/c;

    .line 14
    .line 15
    const/4 v3, 0x5

    .line 16
    invoke-direct {v2, v3, v1}, Lcom/zykj/view/board/crop/c;-><init>(ILcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string v0, "mBinding"

    .line 24
    .line 25
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    throw v0
.end method

.method public onPlayStart()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1;->this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$getMBinding$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->ivRecord:Landroid/widget/ImageView;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1;->this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 12
    .line 13
    new-instance v2, Lcom/zykj/view/board/crop/c;

    .line 14
    .line 15
    const/4 v3, 0x7

    .line 16
    invoke-direct {v2, v3, v1}, Lcom/zykj/view/board/crop/c;-><init>(ILcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string v0, "mBinding"

    .line 24
    .line 25
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    throw v0
.end method

.method public onPlayWait()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1;->this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$getMBinding$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->ivRecord:Landroid/widget/ImageView;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1;->this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 12
    .line 13
    new-instance v2, Lcom/zykj/view/board/crop/c;

    .line 14
    .line 15
    const/4 v3, 0x4

    .line 16
    invoke-direct {v2, v3, v1}, Lcom/zykj/view/board/crop/c;-><init>(ILcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string v0, "mBinding"

    .line 24
    .line 25
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    throw v0
.end method

.method public onProgress(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1;->this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->access$getMBinding$p(Lcom/zykj/view/board/crop/BlackboardCropFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardCropBinding;->tvTime:Landroid/widget/TextView;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lcom/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1;->this$0:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 14
    .line 15
    new-instance v2, Lcom/zykj/view/board/crop/f;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v1, p1, p2, v3}, Lcom/zykj/view/board/crop/f;-><init>(Landroidx/fragment/app/Fragment;JI)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void

    .line 25
    :cond_1
    const-string p1, "mBinding"

    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    throw p1
.end method

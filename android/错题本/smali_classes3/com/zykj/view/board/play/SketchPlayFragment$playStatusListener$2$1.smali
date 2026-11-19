.class public final Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/merge/sketch/listener/PlayStatusListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/play/SketchPlayFragment;-><init>()V
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
        "com/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1",
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
.field final synthetic this$0:Lcom/zykj/view/board/play/SketchPlayFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;->onPlayPause$lambda$1(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    return-void
.end method

.method public static synthetic b(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;->onPlayEnd$lambda$0(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    return-void
.end method

.method public static synthetic c(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;->onPlayWait$lambda$3(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    return-void
.end method

.method public static synthetic d(Lcom/zykj/view/board/play/SketchPlayFragment;J)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;->onProgress$lambda$4(Lcom/zykj/view/board/play/SketchPlayFragment;J)V

    return-void
.end method

.method public static synthetic e(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;->onPlayStart$lambda$2(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    return-void
.end method

.method private static final onPlayEnd$lambda$0(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->ivRecord:Landroid/widget/ImageView;

    .line 10
    .line 11
    sget v1, Lcom/zykj/view/R$drawable;->selector_btn_music_play:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMNewPlayerConfig$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/board/play/NewPlayerConfig;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/zykj/view/board/play/NewPlayerConfig;->getPlayActionListener()Lcom/zykj/view/board/play/PlayActionListener;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/zykj/view/board/play/PlayActionListener;->getCallbackForEnd()Lr6/a;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    invoke-interface {p0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void

    .line 38
    :cond_1
    const-string p0, "mBinding"

    .line 39
    .line 40
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    :catch_0
    move-exception p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method private static final onPlayPause$lambda$1(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->ivRecord:Landroid/widget/ImageView;

    .line 10
    .line 11
    sget v1, Lcom/zykj/view/R$drawable;->selector_btn_music_play:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMNewPlayerConfig$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/board/play/NewPlayerConfig;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/zykj/view/board/play/NewPlayerConfig;->getPlayActionListener()Lcom/zykj/view/board/play/PlayActionListener;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/zykj/view/board/play/PlayActionListener;->getCallbackForPause()Lr6/a;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    invoke-interface {p0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void

    .line 38
    :cond_1
    const-string p0, "mBinding"

    .line 39
    .line 40
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    :catch_0
    move-exception p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method private static final onPlayStart$lambda$2(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->ivRecord:Landroid/widget/ImageView;

    .line 10
    .line 11
    sget v1, Lcom/zykj/view/R$drawable;->selector_btn_music_pause:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMNewPlayerConfig$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/board/play/NewPlayerConfig;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/zykj/view/board/play/NewPlayerConfig;->getPlayActionListener()Lcom/zykj/view/board/play/PlayActionListener;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/zykj/view/board/play/PlayActionListener;->getCallbackForStart()Lr6/a;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    invoke-interface {p0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void

    .line 38
    :cond_1
    const-string p0, "mBinding"

    .line 39
    .line 40
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    :catch_0
    move-exception p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method private static final onPlayWait$lambda$3(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 8
    .line 9
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->ivRecord:Landroid/widget/ImageView;

    .line 10
    .line 11
    sget v0, Lcom/zykj/view/R$drawable;->selector_btn_music_pause:I

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "mBinding"

    .line 18
    .line 19
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    throw p0
.end method

.method private static final onProgress$lambda$4(Lcom/zykj/view/board/play/SketchPlayFragment;J)V
    .locals 4

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "mBinding"

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    :try_start_1
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->seekBar:Landroid/widget/SeekBar;

    .line 13
    .line 14
    long-to-int v3, p1

    .line 15
    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 16
    .line 17
    .line 18
    sget-object v0, Lcom/zykj/view/board/play/SketchPlayFragment;->Companion:Lcom/zykj/view/board/play/SketchPlayFragment$Companion;

    .line 19
    .line 20
    invoke-virtual {v0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$Companion;->formatTime(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {p0, v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$setProgressTime$p(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 34
    .line 35
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->tvTime:Landroid/widget/TextView;

    .line 36
    .line 37
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getProgressTime$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getTotalTime$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    new-instance v3, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, "/"

    .line 54
    .line 55
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMNewPlayerConfig$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/board/play/NewPlayerConfig;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-eqz p0, :cond_0

    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/zykj/view/board/play/NewPlayerConfig;->getPlayActionListener()Lcom/zykj/view/board/play/PlayActionListener;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-eqz p0, :cond_0

    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/zykj/view/board/play/PlayActionListener;->getCallbackForRunning()Lr6/c;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    if-eqz p0, :cond_0

    .line 85
    .line 86
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-interface {p0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    :cond_0
    return-void

    .line 94
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw v1

    .line 98
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 102
    :catch_0
    move-exception p0

    .line 103
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 104
    .line 105
    .line 106
    return-void
.end method


# virtual methods
.method public onPlayEnd()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$setContinueWhenResume$p(Lcom/zykj/view/board/play/SketchPlayFragment;Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->ivRecord:Landroid/widget/ImageView;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 20
    .line 21
    new-instance v2, Lcom/zykj/view/board/play/j;

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    invoke-direct {v2, v1, v3}, Lcom/zykj/view/board/play/j;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const-string v0, "mBinding"

    .line 32
    .line 33
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    throw v0
.end method

.method public onPlayPause()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->ivRecord:Landroid/widget/ImageView;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 14
    .line 15
    new-instance v2, Lcom/zykj/view/board/play/j;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v1, v3}, Lcom/zykj/view/board/play/j;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const-string v0, "mBinding"

    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    throw v0
.end method

.method public onPlayStart()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->ivRecord:Landroid/widget/ImageView;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 14
    .line 15
    new-instance v2, Lcom/zykj/view/board/play/j;

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    invoke-direct {v2, v1, v3}, Lcom/zykj/view/board/play/j;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const-string v0, "mBinding"

    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    throw v0
.end method

.method public onPlayWait()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->ivRecord:Landroid/widget/ImageView;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 14
    .line 15
    new-instance v2, Lcom/zykj/view/board/play/j;

    .line 16
    .line 17
    const/4 v3, 0x3

    .line 18
    invoke-direct {v2, v1, v3}, Lcom/zykj/view/board/play/j;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const-string v0, "mBinding"

    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    throw v0
.end method

.method public onProgress(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->controlBar:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->tvTime:Landroid/widget/TextView;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 14
    .line 15
    new-instance v2, Lcom/zykj/view/board/crop/f;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-direct {v2, v1, p1, p2, v3}, Lcom/zykj/view/board/crop/f;-><init>(Landroidx/fragment/app/Fragment;JI)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
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

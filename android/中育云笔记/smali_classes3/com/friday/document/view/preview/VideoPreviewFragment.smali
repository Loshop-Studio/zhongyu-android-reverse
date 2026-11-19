.class public final Lcom/friday/document/view/preview/VideoPreviewFragment;
.super Lcom/friday/document/view/preview/Hilt_VideoPreviewFragment;
.source "SourceFile"

# interfaces
.implements Lw2/b;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/document/view/preview/VideoPreviewFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/document/view/preview/Hilt_VideoPreviewFragment<",
        "Lcom/friday/document/databinding/FragmentPreviewVideoBinding;",
        ">;",
        "Lw2/b;"
    }
.end annotation


# static fields
.field public static final j:Lcom/friday/document/view/preview/VideoPreviewFragment$a;

.field public static final k:I


# instance fields
.field public i:Lc2/g2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/document/view/preview/VideoPreviewFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/document/view/preview/VideoPreviewFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/document/view/preview/VideoPreviewFragment;->j:Lcom/friday/document/view/preview/VideoPreviewFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/document/view/preview/VideoPreviewFragment;->k:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/preview/Hilt_VideoPreviewFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic r(Lcom/friday/document/view/preview/VideoPreviewFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/preview/VideoPreviewFragment;->t()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final t()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const-string v1, "fileId"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object v0

    .line 17
    :cond_1
    :goto_0
    const-string v0, ""

    .line 18
    .line 19
    return-object v0
.end method

.method private final v()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const-string v1, "title"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object v0

    .line 17
    :cond_1
    :goto_0
    const-string v0, ""

    .line 18
    .line 19
    return-object v0
.end method

.method private final w()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const-string v1, "url"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object v0

    .line 17
    :cond_1
    :goto_0
    const-string v0, ""

    .line 18
    .line 19
    return-object v0
.end method


# virtual methods
.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/document/R$layout;->fragment_preview_video:I

    .line 2
    .line 3
    return v0
.end method

.method public i()V
    .locals 7

    .line 1
    sget-object v0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/friday/document/view/preview/VideoPreviewFragment;->v()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {p0}, Lcom/friday/document/view/preview/VideoPreviewFragment;->w()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {p0}, Lcom/friday/document/view/preview/VideoPreviewFragment;->t()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lcom/friday/document/databinding/FragmentPreviewVideoBinding;

    .line 20
    .line 21
    iget-object v3, v3, Lcom/friday/document/databinding/FragmentPreviewVideoBinding;->c:Lcom/shuyu/gsyvideoplayer/video/NormalGSYVideoPlayer;

    .line 22
    .line 23
    invoke-virtual {v3}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoView;->getCurrentPositionWhenPlaying()J

    .line 24
    .line 25
    .line 26
    move-result-wide v5

    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-virtual/range {v0 .. v6}, Lcom/friday/common/helper/c;->r(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;J)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public initData()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/FragmentPreviewVideoBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentPreviewVideoBinding;->c:Lcom/shuyu/gsyvideoplayer/video/NormalGSYVideoPlayer;

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/friday/document/view/preview/VideoPreviewFragment;->w()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ljava/io/File;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/friday/document/view/preview/VideoPreviewFragment;->s()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v3, ""

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    invoke-virtual {v0, v1, v4, v2, v3}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoControlView;->setUp(Ljava/lang/String;ZLjava/io/File;Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lcom/friday/document/databinding/FragmentPreviewVideoBinding;

    .line 33
    .line 34
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentPreviewVideoBinding;->c:Lcom/shuyu/gsyvideoplayer/video/NormalGSYVideoPlayer;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoControlView;->getTitleTextView()Landroid/widget/TextView;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "getTitleTextView(...)"

    .line 41
    .line 42
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/16 v1, 0x8

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Lcom/friday/document/databinding/FragmentPreviewVideoBinding;

    .line 55
    .line 56
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentPreviewVideoBinding;->c:Lcom/shuyu/gsyvideoplayer/video/NormalGSYVideoPlayer;

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoControlView;->getBackButton()Landroid/widget/ImageView;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v2, "getBackButton(...)"

    .line 63
    .line 64
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Lcom/friday/document/databinding/FragmentPreviewVideoBinding;

    .line 75
    .line 76
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentPreviewVideoBinding;->c:Lcom/shuyu/gsyvideoplayer/video/NormalGSYVideoPlayer;

    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoControlView;->getFullscreenButton()Landroid/widget/ImageView;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const-string v2, "getFullscreenButton(...)"

    .line 83
    .line 84
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Lcom/friday/document/databinding/FragmentPreviewVideoBinding;

    .line 95
    .line 96
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentPreviewVideoBinding;->c:Lcom/shuyu/gsyvideoplayer/video/NormalGSYVideoPlayer;

    .line 97
    .line 98
    new-instance v1, Lcom/friday/document/view/preview/VideoPreviewFragment$initData$1;

    .line 99
    .line 100
    invoke-direct {v1, p0}, Lcom/friday/document/view/preview/VideoPreviewFragment$initData$1;-><init>(Lcom/friday/document/view/preview/VideoPreviewFragment;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v1}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoView;->setVideoAllCallBack(Ll7/h;)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public needHideLoadingOnDestroy()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseFragment;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lcom/friday/document/databinding/FragmentPreviewVideoBinding;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentPreviewVideoBinding;->c:Lcom/shuyu/gsyvideoplayer/video/NormalGSYVideoPlayer;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoView;->setVideoAllCallBack(Ll7/h;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lk7/c;->r()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lcom/friday/document/databinding/FragmentPreviewVideoBinding;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentPreviewVideoBinding;->c:Lcom/shuyu/gsyvideoplayer/video/NormalGSYVideoPlayer;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoView;->onVideoPause()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final s()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const-string v1, "cachePath"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object v0

    .line 17
    :cond_1
    :goto_0
    const-string v0, ""

    .line 18
    .line 19
    return-object v0
.end method

.method public final u()Lc2/g2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/preview/VideoPreviewFragment;->i:Lc2/g2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "shareCacheDao"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.class public final Lcom/friday/document/view/viewer/VideoPlayerActivity;
.super Lcom/friday/document/view/viewer/Hilt_VideoPlayerActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Lcom/alibaba/android/arouter/facade/annotation/Route;
    path = "/document/VideoPlayerActivity"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/document/view/viewer/Hilt_VideoPlayerActivity<",
        "Lcom/friday/document/databinding/ActivityVideoPlayerBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final g:Lqc/d;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:J

.field public l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/viewer/Hilt_VideoPlayerActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/friday/document/view/viewer/VideoPlayerActivity$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/friday/document/view/viewer/VideoPlayerActivity$special$$inlined$viewModels$default$1;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 10
    .line 11
    const-class v2, Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Lcom/friday/document/view/viewer/VideoPlayerActivity$special$$inlined$viewModels$default$2;

    .line 18
    .line 19
    invoke-direct {v3, p0}, Lcom/friday/document/view/viewer/VideoPlayerActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Lcom/friday/document/view/viewer/VideoPlayerActivity$special$$inlined$viewModels$default$3;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v4, v5, p0}, Lcom/friday/document/view/viewer/VideoPlayerActivity$special$$inlined$viewModels$default$3;-><init>(Lhd/a;Landroidx/activity/ComponentActivity;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lod/c;Lhd/a;Lhd/a;Lhd/a;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/friday/document/view/viewer/VideoPlayerActivity;->g:Lqc/d;

    .line 32
    .line 33
    const-string v0, ""

    .line 34
    .line 35
    iput-object v0, p0, Lcom/friday/document/view/viewer/VideoPlayerActivity;->h:Ljava/lang/String;

    .line 36
    .line 37
    iput-object v0, p0, Lcom/friday/document/view/viewer/VideoPlayerActivity;->i:Ljava/lang/String;

    .line 38
    .line 39
    iput-object v0, p0, Lcom/friday/document/view/viewer/VideoPlayerActivity;->j:Ljava/lang/String;

    .line 40
    .line 41
    return-void
.end method

.method public static synthetic N(Lcom/friday/document/view/viewer/VideoPlayerActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/viewer/VideoPlayerActivity;->P(Lcom/friday/document/view/viewer/VideoPlayerActivity;Landroid/view/View;)V

    return-void
.end method

.method public static final P(Lcom/friday/document/view/viewer/VideoPlayerActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/viewer/VideoPlayerActivity;->onBackPressed()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final O()Lcom/friday/document/viewmodel/ShareBaseViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/viewer/VideoPlayerActivity;->g:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    # RE layout layout/activity_video_player (0x7f0c0026), APK res/WA.xml
    sget v0, Lcom/friday/document/R$layout;->activity_video_player:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 6

    .line 1
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lcom/alibaba/android/arouter/launcher/ARouter;->inject(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 13
    .line 14
    sget-object v2, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 15
    .line 16
    invoke-virtual {v2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Lcom/friday/common/helper/b;->t()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    iget-object v4, p0, Lcom/friday/document/view/viewer/VideoPlayerActivity;->j:Ljava/lang/String;

    .line 25
    .line 26
    new-instance v5, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v0, "share"

    .line 38
    .line 39
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-boolean v1, p0, Lcom/friday/document/view/viewer/VideoPlayerActivity;->l:Z

    .line 59
    .line 60
    const/4 v2, 0x1

    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->isDir(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_1

    .line 68
    .line 69
    sget-object v1, Lf2/c;->a:Lf2/c;

    .line 70
    .line 71
    invoke-virtual {v1}, Lf2/c;->e()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_0

    .line 76
    .line 77
    sget v0, Lcom/friday/document/R$string;->connect_network_please:I

    .line 78
    .line 79
    invoke-static {v0}, Lz1/b;->h(I)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_0
    invoke-virtual {p0}, Lcom/friday/document/view/viewer/VideoPlayerActivity;->O()Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iget-object v3, p0, Lcom/friday/document/view/viewer/VideoPlayerActivity;->j:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v1, v3}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->E(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    invoke-virtual {p0}, Lcom/friday/document/view/viewer/VideoPlayerActivity;->O()Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    iget-object v3, p0, Lcom/friday/document/view/viewer/VideoPlayerActivity;->j:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {v1, v3}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->I(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :goto_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;

    .line 107
    .line 108
    iget-object v1, v1, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;->c:Lcom/shuyu/gsyvideoplayer/video/NormalGSYVideoPlayer;

    .line 109
    .line 110
    iget-object v3, p0, Lcom/friday/document/view/viewer/VideoPlayerActivity;->h:Ljava/lang/String;

    .line 111
    .line 112
    new-instance v4, Ljava/io/File;

    .line 113
    .line 114
    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, Lcom/friday/document/view/viewer/VideoPlayerActivity;->i:Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v1, v3, v2, v4, v0}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoControlView;->setUp(Ljava/lang/String;ZLjava/io/File;Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_2
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;

    .line 128
    .line 129
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;->c:Lcom/shuyu/gsyvideoplayer/video/NormalGSYVideoPlayer;

    .line 130
    .line 131
    iget-object v1, p0, Lcom/friday/document/view/viewer/VideoPlayerActivity;->h:Ljava/lang/String;

    .line 132
    .line 133
    iget-object v3, p0, Lcom/friday/document/view/viewer/VideoPlayerActivity;->i:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v0, v1, v2, v3}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoControlView;->setUp(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 136
    .line 137
    .line 138
    :goto_1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    check-cast v0, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;

    .line 143
    .line 144
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;->c:Lcom/shuyu/gsyvideoplayer/video/NormalGSYVideoPlayer;

    .line 145
    .line 146
    invoke-virtual {v0}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoControlView;->getTitleTextView()Landroid/widget/TextView;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    const/4 v1, 0x0

    .line 151
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;

    .line 159
    .line 160
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;->c:Lcom/shuyu/gsyvideoplayer/video/NormalGSYVideoPlayer;

    .line 161
    .line 162
    invoke-virtual {v0}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoControlView;->getBackButton()Landroid/widget/ImageView;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    check-cast v0, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;

    .line 174
    .line 175
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;->c:Lcom/shuyu/gsyvideoplayer/video/NormalGSYVideoPlayer;

    .line 176
    .line 177
    invoke-virtual {v0}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoControlView;->getFullscreenButton()Landroid/widget/ImageView;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    const-string v1, "getFullscreenButton(...)"

    .line 182
    .line 183
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    const/16 v1, 0x8

    .line 187
    .line 188
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    check-cast v0, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;

    .line 196
    .line 197
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;->c:Lcom/shuyu/gsyvideoplayer/video/NormalGSYVideoPlayer;

    .line 198
    .line 199
    invoke-virtual {v0, v2}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoControlView;->setIsTouchWiget(Z)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    check-cast v0, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;

    .line 207
    .line 208
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;->c:Lcom/shuyu/gsyvideoplayer/video/NormalGSYVideoPlayer;

    .line 209
    .line 210
    invoke-virtual {v0}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoControlView;->getBackButton()Landroid/widget/ImageView;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    new-instance v1, Ly2/s;

    .line 215
    .line 216
    invoke-direct {v1, p0}, Ly2/s;-><init>(Lcom/friday/document/view/viewer/VideoPlayerActivity;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    check-cast v0, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;

    .line 227
    .line 228
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;->c:Lcom/shuyu/gsyvideoplayer/video/NormalGSYVideoPlayer;

    .line 229
    .line 230
    iget-wide v1, p0, Lcom/friday/document/view/viewer/VideoPlayerActivity;->k:J

    .line 231
    .line 232
    invoke-virtual {v0, v1, v2}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoView;->setSeekOnStart(J)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    check-cast v0, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;

    .line 240
    .line 241
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;->c:Lcom/shuyu/gsyvideoplayer/video/NormalGSYVideoPlayer;

    .line 242
    .line 243
    invoke-virtual {v0}, Lcom/shuyu/gsyvideoplayer/video/StandardGSYVideoPlayer;->startPlayLogic()V

    .line 244
    .line 245
    .line 246
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;->c:Lcom/shuyu/gsyvideoplayer/video/NormalGSYVideoPlayer;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoView;->setVideoAllCallBack(Ll7/h;)V

    .line 11
    .line 12
    .line 13
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/friday/document/view/viewer/Hilt_VideoPlayerActivity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lk7/c;->r()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseActivity;->onPause()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;->c:Lcom/shuyu/gsyvideoplayer/video/NormalGSYVideoPlayer;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoView;->onVideoPause()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseActivity;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityVideoPlayerBinding;->c:Lcom/shuyu/gsyvideoplayer/video/NormalGSYVideoPlayer;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoView;->onVideoResume()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

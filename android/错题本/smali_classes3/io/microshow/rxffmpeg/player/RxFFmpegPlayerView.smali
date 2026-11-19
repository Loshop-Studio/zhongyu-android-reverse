.class public Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lkotlinx/serialization/json/internal/x;

.field public final c:Landroid/widget/FrameLayout;

.field public d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 3
    iput p2, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->d:I

    .line 4
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->a:Landroid/content/Context;

    .line 5
    new-instance p2, Lkotlinx/serialization/json/internal/x;

    invoke-direct {p2, p0, p0}, Lkotlinx/serialization/json/internal/x;-><init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;)V

    iput-object p2, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->b:Lkotlinx/serialization/json/internal/x;

    .line 6
    new-instance p2, Landroid/widget/FrameLayout;

    invoke-direct {p2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->c:Landroid/widget/FrameLayout;

    const/high16 p1, -0x1000000

    .line 7
    invoke-virtual {p2, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 8
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 p2, -0x1

    invoke-direct {p1, p2, p2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 9
    iget-object p2, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->c:Landroid/widget/FrameLayout;

    invoke-virtual {p0, p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p1, 0x1

    .line 10
    invoke-virtual {p0, p1}, Landroid/view/View;->setKeepScreenOn(Z)V

    return-void
.end method


# virtual methods
.method public getContainerView()Landroid/widget/FrameLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->c:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMuteSolo()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getTextureView()Landroid/view/TextureView;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getVolume()I
    .locals 1

    const/16 v0, 0x64

    return v0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->b:Lkotlinx/serialization/json/internal/x;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->b:Lkotlinx/serialization/json/internal/x;

    .line 13
    .line 14
    iget-object v1, v0, Lkotlinx/serialization/json/internal/x;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;

    .line 17
    .line 18
    sget-object v2, Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;->FM_DEFAULT:Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;

    .line 19
    .line 20
    if-eq v1, v2, :cond_0

    .line 21
    .line 22
    sget-object v2, Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;->FM_FULL_SCREEN_HEIGHT:Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;

    .line 23
    .line 24
    if-ne v1, v2, :cond_1

    .line 25
    .line 26
    :cond_0
    iget p2, v0, Lkotlinx/serialization/json/internal/x;->b:I

    .line 27
    .line 28
    :cond_1
    filled-new-array {p1, p2}, [I

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/4 p2, 0x0

    .line 33
    aget p2, p1, p2

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    aget p1, p1, v0

    .line 37
    .line 38
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public setFitModel(Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->b:Lkotlinx/serialization/json/internal/x;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    if-eqz p1, :cond_7

    .line 6
    .line 7
    iput-object p1, v0, Lkotlinx/serialization/json/internal/x;->e:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->o()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    instance-of v1, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 14
    .line 15
    if-eqz v1, :cond_7

    .line 16
    .line 17
    move-object v1, p1

    .line 18
    check-cast v1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget p1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 33
    .line 34
    mul-int/lit8 v2, p1, 0x9

    .line 35
    .line 36
    div-int/lit8 v2, v2, 0x10

    .line 37
    .line 38
    new-instance v3, Ll5/b;

    .line 39
    .line 40
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    iput p1, v3, Ll5/b;->a:I

    .line 44
    .line 45
    iput v2, v3, Ll5/b;->b:I

    .line 46
    .line 47
    iput-object v3, v0, Lkotlinx/serialization/json/internal/x;->d:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-virtual {v1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->getTextureView()Landroid/view/TextureView;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {v1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->getContainerView()Landroid/widget/FrameLayout;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-eqz p1, :cond_7

    .line 58
    .line 59
    if-eqz v1, :cond_7

    .line 60
    .line 61
    iget-object v2, v0, Lkotlinx/serialization/json/internal/x;->d:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, Ll5/b;

    .line 64
    .line 65
    if-nez v2, :cond_0

    .line 66
    .line 67
    goto/16 :goto_3

    .line 68
    .line 69
    :cond_0
    iget v3, v2, Ll5/b;->a:I

    .line 70
    .line 71
    iget v2, v2, Ll5/b;->b:I

    .line 72
    .line 73
    int-to-float v4, v3

    .line 74
    int-to-float v5, v2

    .line 75
    div-float/2addr v4, v5

    .line 76
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->o()Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 93
    .line 94
    iget-object v6, v0, Lkotlinx/serialization/json/internal/x;->f:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v6, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 97
    .line 98
    iget v6, v6, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->d:I

    .line 99
    .line 100
    const/4 v7, 0x1

    .line 101
    if-ne v6, v7, :cond_1

    .line 102
    .line 103
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->o()Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    iget v5, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 120
    .line 121
    :goto_0
    int-to-float v2, v5

    .line 122
    mul-float/2addr v2, v4

    .line 123
    float-to-int v2, v2

    .line 124
    move v8, v5

    .line 125
    move v5, v2

    .line 126
    move v2, v8

    .line 127
    goto :goto_2

    .line 128
    :cond_1
    iget-object v6, v0, Lkotlinx/serialization/json/internal/x;->e:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v6, Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;

    .line 131
    .line 132
    sget-object v7, Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;->FM_FULL_SCREEN_WIDTH:Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;

    .line 133
    .line 134
    if-ne v6, v7, :cond_2

    .line 135
    .line 136
    :goto_1
    int-to-float v2, v5

    .line 137
    div-float/2addr v2, v4

    .line 138
    float-to-int v2, v2

    .line 139
    goto :goto_2

    .line 140
    :cond_2
    sget-object v7, Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;->FM_FULL_SCREEN_HEIGHT:Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;

    .line 141
    .line 142
    if-ne v6, v7, :cond_3

    .line 143
    .line 144
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->o()Landroid/view/View;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    new-instance v3, Landroid/util/DisplayMetrics;

    .line 153
    .line 154
    invoke-direct {v3}, Landroid/util/DisplayMetrics;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-static {v2}, Lt6/a;->s(Landroid/content/Context;)Landroid/app/Activity;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-virtual {v2}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {v2, v3}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 170
    .line 171
    .line 172
    iget v5, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_3
    sget-object v7, Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;->FM_WH_16X9:Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;

    .line 176
    .line 177
    if-ne v6, v7, :cond_4

    .line 178
    .line 179
    mul-int/lit8 v5, v5, 0x9

    .line 180
    .line 181
    div-int/lit8 v5, v5, 0x10

    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_4
    if-le v3, v2, :cond_5

    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_5
    if-ge v3, v2, :cond_6

    .line 188
    .line 189
    goto :goto_0

    .line 190
    :cond_6
    move v2, v5

    .line 191
    :goto_2
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 192
    .line 193
    invoke-direct {v3, v5, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 194
    .line 195
    .line 196
    const/16 v4, 0x11

    .line 197
    .line 198
    iput v4, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 199
    .line 200
    invoke-virtual {p1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 201
    .line 202
    .line 203
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 204
    .line 205
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->o()Landroid/view/View;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 222
    .line 223
    invoke-direct {p1, v3, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 227
    .line 228
    .line 229
    iput v2, v0, Lkotlinx/serialization/json/internal/x;->b:I

    .line 230
    .line 231
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->o()Landroid/view/View;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 236
    .line 237
    .line 238
    :cond_7
    :goto_3
    return-void
.end method

.method public setMuteSolo(I)V
    .locals 0

    return-void
.end method

.method public setOnCompleteListener(Ll5/a;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setPlayerBackgroundColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->c:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setTextureViewEnabledTouch(Z)V
    .locals 0

    return-void
.end method

.method public setVolume(I)V
    .locals 0

    return-void
.end method

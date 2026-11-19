.class public Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# static fields
.field public static final synthetic h:I


# instance fields
.field public a:Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;

.field public b:Z

.field public c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

.field public d:Landroid/view/View;

.field public e:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;

.field public f:Li2/c;

.field public g:Landroid/widget/ImageView;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->b:Z

    .line 6
    .line 7
    return-void
.end method

.method public static synthetic f(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic g(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->o()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static i(FI)I
    .locals 1

    .line 1
    const/high16 v0, 0x437f0000    # 255.0f

    .line 2
    .line 3
    mul-float/2addr p0, v0

    .line 4
    float-to-int p0, p0

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    const/16 v0, 0xff

    .line 11
    .line 12
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    shl-int/lit8 p0, p0, 0x18

    .line 17
    .line 18
    const v0, 0xffffff

    .line 19
    .line 20
    .line 21
    and-int/2addr p1, v0

    .line 22
    add-int/2addr p0, p1

    .line 23
    return p0
.end method

.method private j()V
    .locals 5

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
    const-string v1, "com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR"

    .line 8
    .line 9
    sget v2, Lcom/xuexiang/xui/R$color;->xui_config_color_main_theme:I

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->e:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {v3, v1}, Lcom/xuexiang/xui/utils/e;->e(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v2, v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setSupportIndeterminateTintList(Landroid/content/res/ColorStateList;)V

    .line 26
    .line 27
    .line 28
    const-string v1, "com.xuexiang.xui.widget.preview.KEY_SING_FILING"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const-string v2, "com.xuexiang.xui.widget.preview.KEY_PREVIEW_ITEM"

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;

    .line 41
    .line 42
    iput-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;

    .line 43
    .line 44
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 45
    .line 46
    const-string v3, "com.xuexiang.xui.widget.preview.KEY_DRAG"

    .line 47
    .line 48
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const-string v4, "com.xuexiang.xui.widget.preview.KEY_SENSITIVITY"

    .line 53
    .line 54
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-virtual {v2, v3, v4}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->o(ZF)V

    .line 59
    .line 60
    .line 61
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 62
    .line 63
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;

    .line 64
    .line 65
    invoke-interface {v3}, Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;->getBounds()Landroid/graphics/Rect;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v2, v3}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setThumbRect(Landroid/graphics/Rect;)V

    .line 70
    .line 71
    .line 72
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->d:Landroid/view/View;

    .line 73
    .line 74
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;

    .line 75
    .line 76
    invoke-interface {v3}, Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;->getUrl()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    const-string v2, "com.xuexiang.xui.widget.preview.KEY_TRANS_PHOTO"

    .line 84
    .line 85
    const/4 v3, 0x0

    .line 86
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->b:Z

    .line 91
    .line 92
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;

    .line 93
    .line 94
    invoke-interface {v0}, Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;->getUrl()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const-string v2, ".gif"

    .line 103
    .line 104
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_0

    .line 109
    .line 110
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 111
    .line 112
    invoke-virtual {v0, v3}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setZoomable(Z)V

    .line 113
    .line 114
    .line 115
    invoke-static {}, Lh2/a;->e()Lh2/a;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;

    .line 120
    .line 121
    invoke-interface {v2}, Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;->getUrl()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 126
    .line 127
    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->f:Li2/c;

    .line 128
    .line 129
    invoke-virtual {v0, p0, v2, v3, v4}, Lh2/a;->c(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/widget/ImageView;Li2/c;)V

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_0
    invoke-static {}, Lh2/a;->e()Lh2/a;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;

    .line 138
    .line 139
    invoke-interface {v2}, Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;->getUrl()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 144
    .line 145
    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->f:Li2/c;

    .line 146
    .line 147
    invoke-virtual {v0, p0, v2, v3, v4}, Lh2/a;->d(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/widget/ImageView;Li2/c;)V

    .line 148
    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_1
    const/4 v1, 0x1

    .line 152
    :goto_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->b:Z

    .line 153
    .line 154
    if-nez v0, :cond_2

    .line 155
    .line 156
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->d:Landroid/view/View;

    .line 157
    .line 158
    const/high16 v2, -0x1000000

    .line 159
    .line 160
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 165
    .line 166
    const v2, 0x3f333333    # 0.7f

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v2}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setMinimumScale(F)V

    .line 170
    .line 171
    .line 172
    :goto_1
    if-eqz v1, :cond_3

    .line 173
    .line 174
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 175
    .line 176
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$c;

    .line 177
    .line 178
    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$c;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setOnViewTapListener(Lcom/xuexiang/xui/widget/imageview/photoview/c$i;)V

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 186
    .line 187
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$d;

    .line 188
    .line 189
    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$d;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setOnPhotoTapListener(Lcom/xuexiang/xui/widget/imageview/photoview/c$f;)V

    .line 193
    .line 194
    .line 195
    :goto_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 196
    .line 197
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$e;

    .line 198
    .line 199
    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$e;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setAlphaChangeListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;)V

    .line 203
    .line 204
    .line 205
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 206
    .line 207
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$f;

    .line 208
    .line 209
    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$f;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setTransformOutListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;)V

    .line 213
    .line 214
    .line 215
    return-void
.end method

.method public static l(Ljava/lang/Class;Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;ZZZFI)Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :catch_0
    new-instance p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;-><init>()V

    .line 11
    .line 12
    .line 13
    :goto_0
    new-instance v0, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v1, "com.xuexiang.xui.widget.preview.KEY_PREVIEW_ITEM"

    .line 19
    .line 20
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 21
    .line 22
    .line 23
    const-string p1, "com.xuexiang.xui.widget.preview.KEY_TRANS_PHOTO"

    .line 24
    .line 25
    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string p1, "com.xuexiang.xui.widget.preview.KEY_SING_FILING"

    .line 29
    .line 30
    invoke-virtual {v0, p1, p3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string p1, "com.xuexiang.xui.widget.preview.KEY_DRAG"

    .line 34
    .line 35
    invoke-virtual {v0, p1, p4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string p1, "com.xuexiang.xui.widget.preview.KEY_SENSITIVITY"

    .line 39
    .line 40
    invoke-virtual {v0, p1, p5}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 41
    .line 42
    .line 43
    const-string p1, "com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR"

    .line 44
    .line 45
    invoke-virtual {v0, p1, p6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 49
    .line 50
    .line 51
    return-object p0
.end method

.method private o()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->z()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method


# virtual methods
.method public h(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->g:Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/core/view/ViewCompat;->animate(Landroid/view/View;)Landroidx/core/view/ViewPropertyAnimatorCompat;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroidx/core/view/ViewPropertyAnimatorCompat;->alpha(F)Landroidx/core/view/ViewPropertyAnimatorCompat;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-wide/16 v1, 0x1f4

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Landroidx/core/view/ViewPropertyAnimatorCompat;->setDuration(J)Landroidx/core/view/ViewPropertyAnimatorCompat;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Landroidx/core/view/ViewPropertyAnimatorCompat;->start()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->d:Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final k(Landroid/view/View;)V
    .locals 1

    .line 1
    sget v0, Lcom/xuexiang/xui/R$id;->loading:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->e:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;

    .line 10
    .line 11
    sget v0, Lcom/xuexiang/xui/R$id;->photoView:I

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 20
    .line 21
    sget v0, Lcom/xuexiang/xui/R$id;->btnVideo:I

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Landroid/widget/ImageView;

    .line 28
    .line 29
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->g:Landroid/widget/ImageView;

    .line 30
    .line 31
    sget v0, Lcom/xuexiang/xui/R$id;->rootView:I

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->d:Landroid/view/View;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-virtual {p1, v0}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->g:Landroid/widget/ImageView;

    .line 49
    .line 50
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$a;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$a;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    .line 57
    .line 58
    new-instance p1, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$b;

    .line 59
    .line 60
    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$b;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->f:Li2/c;

    .line 64
    .line 65
    return-void
.end method

.method public m()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->f:Li2/c;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setOnViewTapListener(Lcom/xuexiang/xui/widget/imageview/photoview/c$i;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setOnPhotoTapListener(Lcom/xuexiang/xui/widget/imageview/photoview/c$f;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setAlphaChangeListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setTransformOutListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->q(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$j;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->r(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$j;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->g:Landroid/widget/ImageView;

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 52
    .line 53
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->d:Landroid/view/View;

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->b:Z

    .line 57
    .line 58
    :cond_0
    return-void
.end method

.method public n()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 2
    .line 3
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$g;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$g;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->q(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$j;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    sget p3, Lcom/xuexiang/xui/R$layout;->preview_fragment_image_photo:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lh2/a;->e()Lh2/a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Lh2/a;->a(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public onDestroyView()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->m()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onStop()V
    .locals 1

    .line 1
    invoke-static {}, Lh2/a;->e()Lh2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lh2/a;->b(Landroidx/fragment/app/Fragment;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onStop()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->k(Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->j()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public p(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$j;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->r(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$j;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->setUserVisibleHint(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

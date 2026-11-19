.class public Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# instance fields
.field public a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

.field public b:Landroid/view/View;

.field public c:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
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

.method public final onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lu2/a;->a()Lu2/a;

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
    iget-object v0, v0, Lu2/a;->a:Lio/reactivex/internal/operators/observable/c;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/bumptech/glide/b;->b()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method public final onDestroyView()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setOnViewTapListener(Lr2/j;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setOnPhotoTapListener(Lr2/g;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setAlphaChangeListener(Lx2/c;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setTransformOutListener(Lx2/d;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setOnTransformListener(Lcom/xuexiang/xui/widget/imageview/preview/view/b;)V

    .line 32
    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    iput-boolean v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Z

    .line 36
    .line 37
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_IN:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 38
    .line 39
    iput-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f(Lcom/xuexiang/xui/widget/imageview/preview/view/b;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Landroid/widget/ImageView;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 60
    .line 61
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->b:Landroid/view/View;

    .line 62
    .line 63
    :cond_0
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final onStop()V
    .locals 1

    .line 1
    invoke-static {}, Lu2/a;->a()Lu2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lu2/a;->a:Lio/reactivex/internal/operators/observable/c;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lcom/bumptech/glide/b;->f(Landroidx/fragment/app/Fragment;)Lcom/bumptech/glide/h;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/bumptech/glide/h;->onStop()V

    .line 15
    .line 16
    .line 17
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onStop()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    sget p2, Lcom/xuexiang/xui/R$id;->loading:I

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    check-cast p2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;

    .line 11
    .line 12
    sget p2, Lcom/xuexiang/xui/R$id;->photoView:I

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    check-cast p2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 19
    .line 20
    iput-object p2, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 21
    .line 22
    sget p2, Lcom/xuexiang/xui/R$id;->btnVideo:I

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    check-cast p2, Landroid/widget/ImageView;

    .line 29
    .line 30
    iput-object p2, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Landroid/widget/ImageView;

    .line 31
    .line 32
    sget p2, Lcom/xuexiang/xui/R$id;->rootView:I

    .line 33
    .line 34
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->b:Landroid/view/View;

    .line 39
    .line 40
    const/4 p2, 0x0

    .line 41
    invoke-virtual {p1, p2}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->c:Landroid/widget/ImageView;

    .line 50
    .line 51
    new-instance p2, Lb2/c;

    .line 52
    .line 53
    invoke-direct {p2, p0}, Lb2/c;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-nez p1, :cond_0

    .line 64
    .line 65
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->b:Landroid/view/View;

    .line 66
    .line 67
    const/high16 p2, -0x1000000

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 73
    .line 74
    new-instance p2, Lw2/a;

    .line 75
    .line 76
    invoke-direct {p2, p0}, Lw2/a;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setOnViewTapListener(Lr2/j;)V

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 83
    .line 84
    new-instance p2, Lw2/a;

    .line 85
    .line 86
    invoke-direct {p2, p0}, Lw2/a;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setAlphaChangeListener(Lx2/c;)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 93
    .line 94
    new-instance p2, Lw2/a;

    .line 95
    .line 96
    invoke-direct {p2, p0}, Lw2/a;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setTransformOutListener(Lx2/d;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_0
    const-string p2, "com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR"

    .line 104
    .line 105
    sget v0, Lcom/xuexiang/xui/R$color;->xui_config_color_main_theme:I

    .line 106
    .line 107
    invoke-virtual {p1, p2, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 108
    .line 109
    .line 110
    invoke-static {}, Lt1/a;->a()V

    .line 111
    .line 112
    .line 113
    const/4 p1, 0x0

    .line 114
    throw p1
.end method

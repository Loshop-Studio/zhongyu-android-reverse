.class public Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field private static final GIF:Ljava/lang/String; = ".gif"

.field public static final KEY_DRAG:Ljava/lang/String; = "com.xuexiang.xui.widget.preview.KEY_DRAG"

.field public static final KEY_PREVIEW_ITEM:Ljava/lang/String; = "com.xuexiang.xui.widget.preview.KEY_PREVIEW_ITEM"

.field public static final KEY_PROGRESS_COLOR:Ljava/lang/String; = "com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR"

.field public static final KEY_SENSITIVITY:Ljava/lang/String; = "com.xuexiang.xui.widget.preview.KEY_SENSITIVITY"

.field public static final KEY_SING_FILING:Ljava/lang/String; = "com.xuexiang.xui.widget.preview.KEY_SING_FILING"

.field public static final KEY_TRANS_PHOTO:Ljava/lang/String; = "com.xuexiang.xui.widget.preview.KEY_TRANS_PHOTO"

.field public static listener:Lcom/xuexiang/xui/widget/imageview/preview/loader/OnVideoClickListener;


# instance fields
.field private isTransPhoto:Z

.field protected mBtnVideo:Landroid/widget/ImageView;

.field protected mISimpleTarget:Lcom/xuexiang/xui/widget/imageview/preview/loader/ISimpleTarget;

.field protected mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

.field protected mLoadingView:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;

.field private mPreviewInfo:Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;

.field protected mRootView:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->isTransPhoto:Z

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mPreviewInfo:Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;

    return-object p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->transformOut()V

    return-void
.end method

.method public static getColorWithAlpha(FI)I
    .locals 1

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float p0, p0, v0

    float-to-int p0, p0

    const/4 v0, 0x0

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    const/16 v0, 0xff

    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    shl-int/lit8 p0, p0, 0x18

    const v0, 0xffffff

    and-int/2addr p1, v0

    add-int/2addr p0, p1

    return p0
.end method

.method private initArgs()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    sget v1, Lcom/xuexiang/xui/R$color;->xui_config_color_main_theme:I

    const-string v2, "com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mLoadingView:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;

    invoke-static {v1}, Lcom/xuexiang/xui/utils/ResUtils;->getColors(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setSupportIndeterminateTintList(Landroid/content/res/ColorStateList;)V

    const-string v1, "com.xuexiang.xui.widget.preview.KEY_SING_FILING"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "com.xuexiang.xui.widget.preview.KEY_PREVIEW_ITEM"

    .line 5
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;

    iput-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mPreviewInfo:Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;

    .line 6
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    const-string v3, "com.xuexiang.xui.widget.preview.KEY_DRAG"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v3

    const-string v4, "com.xuexiang.xui.widget.preview.KEY_SENSITIVITY"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v4

    invoke-virtual {v2, v3, v4}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setDrag(ZF)V

    .line 7
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mPreviewInfo:Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;

    invoke-interface {v3}, Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setThumbRect(Landroid/graphics/Rect;)V

    .line 8
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mRootView:Landroid/view/View;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mPreviewInfo:Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;

    invoke-interface {v3}, Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;->getUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const-string v2, "com.xuexiang.xui.widget.preview.KEY_TRANS_PHOTO"

    const/4 v3, 0x0

    .line 9
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->isTransPhoto:Z

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mPreviewInfo:Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;

    invoke-interface {v0}, Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v2, ".gif"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {v0, v3}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setZoomable(Z)V

    .line 12
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;->get()Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;

    move-result-object v0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mPreviewInfo:Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;

    invoke-interface {v2}, Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;->getUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mISimpleTarget:Lcom/xuexiang/xui/widget/imageview/preview/loader/ISimpleTarget;

    invoke-virtual {v0, p0, v2, v3, v4}, Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;->displayGifImage(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/widget/ImageView;Lcom/xuexiang/xui/widget/imageview/preview/loader/ISimpleTarget;)V

    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;->get()Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;

    move-result-object v0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mPreviewInfo:Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;

    invoke-interface {v2}, Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;->getUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mISimpleTarget:Lcom/xuexiang/xui/widget/imageview/preview/loader/ISimpleTarget;

    invoke-virtual {v0, p0, v2, v3, v4}, Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;->displayImage(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/widget/ImageView;Lcom/xuexiang/xui/widget/imageview/preview/loader/ISimpleTarget;)V

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    .line 14
    :goto_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->isTransPhoto:Z

    if-nez v0, :cond_2

    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mRootView:Landroid/view/View;

    const/high16 v2, -0x1000000

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_1

    .line 16
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    const v2, 0x3f333333    # 0.7f

    invoke-virtual {v0, v2}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setMinimumScale(F)V

    :goto_1
    if-eqz v1, :cond_3

    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    new-instance v1, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$3;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$3;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)V

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setOnViewTapListener(Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher$OnViewTapListener;)V

    goto :goto_2

    .line 18
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    new-instance v1, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$4;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$4;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)V

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setOnPhotoTapListener(Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher$OnPhotoTapListener;)V

    .line 19
    :goto_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    new-instance v1, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$5;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$5;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)V

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setAlphaChangeListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$OnAlphaChangeListener;)V

    .line 20
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    new-instance v1, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$6;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$6;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)V

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setTransformOutListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$OnTransformOutListener;)V

    return-void
.end method

.method private initView(Landroid/view/View;)V
    .locals 1

    .line 1
    sget v0, Lcom/xuexiang/xui/R$id;->loading:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mLoadingView:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;

    .line 2
    sget v0, Lcom/xuexiang/xui/R$id;->photoView:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 3
    sget v0, Lcom/xuexiang/xui/R$id;->btnVideo:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mBtnVideo:Landroid/widget/ImageView;

    .line 4
    sget v0, Lcom/xuexiang/xui/R$id;->rootView:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mRootView:Landroid/view/View;

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setDrawingCacheEnabled(Z)V

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mBtnVideo:Landroid/widget/ImageView;

    new-instance v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$1;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    new-instance p1, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$2;

    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$2;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mISimpleTarget:Lcom/xuexiang/xui/widget/imageview/preview/loader/ISimpleTarget;

    return-void
.end method

.method public static newInstance(Ljava/lang/Class;Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;ZZZFI)Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;",
            ">;",
            "Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;",
            "ZZZFI)",
            "Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 2
    :catch_0
    new-instance p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;-><init>()V

    .line 3
    :goto_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "com.xuexiang.xui.widget.preview.KEY_PREVIEW_ITEM"

    .line 4
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "com.xuexiang.xui.widget.preview.KEY_TRANS_PHOTO"

    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p1, "com.xuexiang.xui.widget.preview.KEY_SING_FILING"

    .line 6
    invoke-virtual {v0, p1, p3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p1, "com.xuexiang.xui.widget.preview.KEY_DRAG"

    .line 7
    invoke-virtual {v0, p1, p4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p1, "com.xuexiang.xui.widget.preview.KEY_SENSITIVITY"

    .line 8
    invoke-virtual {v0, p1, p5}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    const-string p1, "com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR"

    .line 9
    invoke-virtual {v0, p1, p6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 10
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    return-object p0
.end method

.method private transformOut()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->transformOut()V

    :cond_0
    return-void
.end method


# virtual methods
.method public changeBg(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mBtnVideo:Landroid/widget/ImageView;

    invoke-static {v0}, Landroidx/core/view/u;->c(Landroid/view/View;)Landroidx/core/view/y;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/core/view/y;->a(F)Landroidx/core/view/y;

    move-result-object v0

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Landroidx/core/view/y;->d(J)Landroidx/core/view/y;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/core/view/y;->j()V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mRootView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public getPreviewInfo()Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mPreviewInfo:Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    sget p3, Lcom/xuexiang/xui/R$layout;->preview_fragment_image_photo:I

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 2
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;->get()Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;->clearMemory(Landroid/content/Context;)V

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 4
    sput-object v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->listener:Lcom/xuexiang/xui/widget/imageview/preview/loader/OnVideoClickListener;

    :cond_0
    return-void
.end method

.method public onDestroyView()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->release()V

    .line 2
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    return-void
.end method

.method public onStop()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;->get()Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;->onStop(Landroidx/fragment/app/Fragment;)V

    .line 2
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onStop()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->initView(Landroid/view/View;)V

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->initArgs()V

    return-void
.end method

.method public release()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mISimpleTarget:Lcom/xuexiang/xui/widget/imageview/preview/loader/ISimpleTarget;

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setOnViewTapListener(Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher$OnViewTapListener;)V

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setOnPhotoTapListener(Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher$OnPhotoTapListener;)V

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setAlphaChangeListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$OnAlphaChangeListener;)V

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setTransformOutListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$OnTransformOutListener;)V

    .line 8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->transformIn(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$onTransformListener;)V

    .line 9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->transformOut(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$onTransformListener;)V

    .line 10
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 11
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mBtnVideo:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 13
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mRootView:Landroid/view/View;

    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->isTransPhoto:Z

    :cond_0
    return-void
.end method

.method public resetMatrix()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->resetMatrix()V

    :cond_0
    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->setUserVisibleHint(Z)V

    return-void
.end method

.method public transformIn()V
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    new-instance v1, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$7;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment$7;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;)V

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->transformIn(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$onTransformListener;)V

    return-void
.end method

.method public transformOut(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$onTransformListener;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->mImageView:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->transformOut(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$onTransformListener;)V

    return-void
.end method

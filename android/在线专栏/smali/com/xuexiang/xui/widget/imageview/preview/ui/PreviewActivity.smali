.class public Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$PhotoPagerAdapter;
    }
.end annotation


# static fields
.field public static final KEY_CLASSNAME:Ljava/lang/String; = "com.xuexiang.xui.widget.preview.KEY_CLASSNAME"

.field public static final KEY_DURATION:Ljava/lang/String; = "com.xuexiang.xui.widget.preview.KEY_DURATION"

.field public static final KEY_IMAGE_PATHS:Ljava/lang/String; = "com.xuexiang.xui.widget.preview.KEY_IMAGE_PATHS"

.field public static final KEY_IS_FULLSCREEN:Ljava/lang/String; = "com.xuexiang.xui.widget.preview.KEY_IS_FULLSCREEN"

.field public static final KEY_IS_SHOW:Ljava/lang/String; = "com.xuexiang.xui.widget.preview.KEY_IS_SHOW"

.field public static final KEY_POSITION:Ljava/lang/String; = "com.xuexiang.xui.widget.preview.KEY_POSITION"

.field public static final KEY_TYPE:Ljava/lang/String; = "com.xuexiang.xui.widget.preview.KEY_TYPE"


# instance fields
.field private fragments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;",
            ">;"
        }
    .end annotation
.end field

.field private mBezierBannerView:Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;

.field private mCurrentIndex:I

.field private mImgUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;",
            ">;"
        }
    .end annotation
.end field

.field private mIsShow:Z

.field private mIsTransformOut:Z

.field private mTvIndex:Landroid/widget/TextView;

.field private mType:Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;

.field private mViewPager:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mIsTransformOut:Z

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->fragments:Ljava/util/List;

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mIsShow:Z

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mTvIndex:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)I
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->getImgSize()I

    move-result p0

    return p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mCurrentIndex:I

    return p0
.end method

.method static synthetic access$202(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;I)I
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mCurrentIndex:I

    return p1
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mViewPager:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    return-object p0
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->fragments:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->exit()V

    return-void
.end method

.method private exit()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->finish()V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method private getImgSize()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mImgUrls:Ljava/util/List;

    invoke-static {v0}, Lcom/xuexiang/xui/utils/CollectionUtils;->getSize(Ljava/util/Collection;)I

    move-result v0

    return v0
.end method

.method private initArgs()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "com.xuexiang.xui.widget.preview.KEY_IMAGE_PATHS"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mImgUrls:Ljava/util/List;

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "com.xuexiang.xui.widget.preview.KEY_POSITION"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mCurrentIndex:I

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "com.xuexiang.xui.widget.preview.KEY_TYPE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mType:Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "com.xuexiang.xui.widget.preview.KEY_IS_SHOW"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mIsShow:Z

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "com.xuexiang.xui.widget.preview.KEY_DURATION"

    const/16 v2, 0x12c

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "com.xuexiang.xui.widget.preview.KEY_IS_FULLSCREEN"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const v1, 0x1030011

    .line 7
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->setTheme(I)V

    .line 8
    :cond_0
    :try_start_0
    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setDuration(I)V

    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "com.xuexiang.xui.widget.preview.KEY_CLASSNAME"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 10
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mImgUrls:Ljava/util/List;

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mCurrentIndex:I

    invoke-virtual {p0, v1, v2, v0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->initFragment(Ljava/util/List;ILjava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 11
    :catch_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mImgUrls:Ljava/util/List;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mCurrentIndex:I

    const-class v2, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;

    invoke-virtual {p0, v0, v1, v2}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->initFragment(Ljava/util/List;ILjava/lang/Class;)V

    :goto_0
    return-void
.end method

.method private initView()V
    .locals 6

    .line 1
    sget v0, Lcom/xuexiang/xui/R$id;->viewPager:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mViewPager:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$PhotoPagerAdapter;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$PhotoPagerAdapter;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;Landroidx/fragment/app/FragmentManager;)V

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mViewPager:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    invoke-virtual {v1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/a;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mViewPager:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mCurrentIndex:I

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mViewPager:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 6
    sget v0, Lcom/xuexiang/xui/R$id;->bezierBannerView:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mBezierBannerView:Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;

    .line 7
    sget v0, Lcom/xuexiang/xui/R$id;->tv_index:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mTvIndex:Landroid/widget/TextView;

    .line 8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mType:Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;

    sget-object v2, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;->Dot:Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v2, :cond_0

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mBezierBannerView:Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mBezierBannerView:Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mViewPager:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->attachToViewpager(Landroidx/viewpager/widget/ViewPager;)V

    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mTvIndex:Landroid/widget/TextView;

    sget v1, Lcom/xuexiang/xui/R$string;->xui_preview_count_string:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mCurrentIndex:I

    add-int/2addr v5, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v2, v4

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->getImgSize()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {p0, v1, v2}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mViewPager:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    new-instance v1, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$1;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$1;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)V

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$i;)V

    .line 14
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->fragments:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v3, :cond_1

    .line 15
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mIsShow:Z

    if-nez v0, :cond_1

    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mBezierBannerView:Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mTvIndex:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 18
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mViewPager:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$2;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$2;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method


# virtual methods
.method public finish()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    sput-object v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->listener:Lcom/xuexiang/xui/widget/imageview/preview/loader/OnVideoClickListener;

    .line 2
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public getFragments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->fragments:Ljava/util/List;

    return-object v0
.end method

.method public getLayoutId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getViewPager()Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mViewPager:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    return-object v0
.end method

.method protected initFragment(Ljava/util/List;ILjava/lang/Class;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;",
            ">;I",
            "Ljava/lang/Class<",
            "+",
            "Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 2
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->fragments:Ljava/util/List;

    .line 3
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;

    if-ne p2, v2, :cond_0

    const/4 v4, 0x1

    const/4 v7, 0x1

    goto :goto_1

    :cond_0
    const/4 v7, 0x0

    .line 4
    :goto_1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    const-string v5, "com.xuexiang.xui.widget.preview.KEY_SING_FILING"

    invoke-virtual {v4, v5, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v8

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    const-string v5, "com.xuexiang.xui.widget.preview.KEY_DRAG"

    invoke-virtual {v4, v5, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v9

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    const/high16 v5, 0x3f000000    # 0.5f

    const-string v10, "com.xuexiang.xui.widget.preview.KEY_SENSITIVITY"

    invoke-virtual {v4, v10, v5}, Landroid/content/Intent;->getFloatExtra(Ljava/lang/String;F)F

    move-result v10

    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    sget v5, Lcom/xuexiang/xui/R$color;->xui_config_color_main_theme:I

    const-string v11, "com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR"

    invoke-virtual {v4, v11, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v11

    move-object v5, p3

    .line 8
    invoke-static/range {v5 .. v11}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->newInstance(Ljava/lang/Class;Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;ZZZFI)Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;

    move-result-object v4

    .line 9
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->finish()V

    :cond_2
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->transformOut()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->initArgs()V

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->getLayoutId()I

    move-result p1

    if-nez p1, :cond_0

    .line 4
    # RE layout layout/preview_activity_image_photo (0x7f0c0068), APK res/FA.xml
    sget p1, Lcom/xuexiang/xui/R$layout;->preview_activity_image_photo:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->getLayoutId()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    .line 6
    :goto_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->initView()V

    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;->get()Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/xuexiang/xui/widget/imageview/preview/MediaLoader;->clearMemory(Landroid/content/Context;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mViewPager:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/a;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mViewPager:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->clearOnPageChangeListeners()V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mViewPager:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 6
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mViewPager:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->fragments:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->fragments:Ljava/util/List;

    .line 10
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mImgUrls:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 11
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 12
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mImgUrls:Ljava/util/List;

    .line 13
    :cond_2
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    return-void
.end method

.method public transformOut()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mIsTransformOut:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mIsTransformOut:Z

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mViewPager:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->getImgSize()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->fragments:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mTvIndex:Landroid/widget/TextView;

    const/16 v2, 0x8

    if-eqz v1, :cond_1

    .line 7
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 8
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->mBezierBannerView:Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->changeBg(I)V

    .line 10
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$3;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$3;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)V

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->transformOut(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$onTransformListener;)V

    goto :goto_1

    .line 11
    :cond_2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->exit()V

    :goto_1
    return-void
.end method

.class public Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# static fields
.field private static final BRUSH_SRC_ID:I = 0x2

.field private static final GL_FILTER_ID:I = 0x3

.field private static final IMG_SRC_ID:I = 0x1

.field private static final TAG:Ljava/lang/String; = "PhotoEditorView"


# instance fields
.field private mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

.field private mImageFilterView:Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;

.field private mImgSource:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 8
    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;)Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mImageFilterView:Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;

    return-object p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;)Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mImgSource:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;

    return-object p0
.end method

.method private init(Landroid/util/AttributeSet;)V
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "Recycle"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mImgSource:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setId(I)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mImgSource:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAdjustViewBounds(Z)V

    .line 4
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v0, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v4, 0xd

    .line 5
    invoke-virtual {v0, v4, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    if-eqz p1, :cond_0

    .line 6
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v5

    sget-object v6, Lcom/xuexiang/xui/R$styleable;->PhotoEditorView:[I

    invoke-virtual {v5, p1, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 7
    sget v5, Lcom/xuexiang/xui/R$styleable;->PhotoEditorView_photo_src:I

    invoke-virtual {p1, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 8
    iget-object v5, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mImgSource:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;

    invoke-virtual {v5, p1}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 9
    :cond_0
    new-instance p1, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {p1, v5}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    const/16 v5, 0x8

    .line 10
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 11
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    const/4 v6, 0x2

    invoke-virtual {p1, v6}, Landroid/view/View;->setId(I)V

    .line 12
    new-instance p1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {p1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 13
    invoke-virtual {p1, v4, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/4 v6, 0x6

    .line 14
    invoke-virtual {p1, v6, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 15
    invoke-virtual {p1, v5, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 16
    new-instance v7, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v7, v8}, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;-><init>(Landroid/content/Context;)V

    iput-object v7, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mImageFilterView:Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;

    const/4 v8, 0x3

    .line 17
    invoke-virtual {v7, v8}, Landroid/opengl/GLSurfaceView;->setId(I)V

    .line 18
    iget-object v7, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mImageFilterView:Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;

    invoke-virtual {v7, v5}, Landroid/opengl/GLSurfaceView;->setVisibility(I)V

    .line 19
    new-instance v7, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v7, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 20
    invoke-virtual {v7, v4, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 21
    invoke-virtual {v7, v6, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 22
    invoke-virtual {v7, v5, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 23
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mImgSource:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;

    new-instance v2, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView$1;

    invoke-direct {v2, p0}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView$1;-><init>(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->setOnImageChangedListener(Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;)V

    .line 24
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mImgSource:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;

    invoke-virtual {p0, v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mImageFilterView:Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;

    invoke-virtual {p0, v0, v7}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 26
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    invoke-virtual {p0, v0, p1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method getBrushDrawingView()Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    return-object v0
.end method

.method public getSource()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mImgSource:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;

    return-object v0
.end method

.method saveFilter(Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mImageFilterView:Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;

    invoke-virtual {v0}, Landroid/opengl/GLSurfaceView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mImageFilterView:Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;

    new-instance v1, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView$2;

    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView$2;-><init>(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;)V

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->saveBitmap(Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mImgSource:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;->onBitmapReady(Landroid/graphics/Bitmap;)V

    :goto_0
    return-void
.end method

.method setFilterEffect(Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect;)V
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mImageFilterView:Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/opengl/GLSurfaceView;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mImageFilterView:Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mImgSource:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->setSourceBitmap(Landroid/graphics/Bitmap;)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mImageFilterView:Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->setFilterEffect(Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect;)V

    return-void
.end method

.method setFilterEffect(Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mImageFilterView:Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/opengl/GLSurfaceView;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mImageFilterView:Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mImgSource:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->setSourceBitmap(Landroid/graphics/Bitmap;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->mImageFilterView:Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->setFilterEffect(Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;)V

    return-void
.end method

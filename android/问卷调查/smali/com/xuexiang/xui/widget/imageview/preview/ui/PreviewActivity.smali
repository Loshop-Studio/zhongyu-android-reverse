.class public Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;
.super La/b/c/g;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$b;
    }
.end annotation


# static fields
.field public static final synthetic x:I


# instance fields
.field public o:Z

.field public p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lb/c/a/e/f/c/c/a;",
            ">;"
        }
    .end annotation
.end field

.field public q:I

.field public r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lb/c/a/e/f/c/e/h;",
            ">;"
        }
    .end annotation
.end field

.field public s:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

.field public t:Landroid/widget/TextView;

.field public u:Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;

.field public v:Lb/c/a/e/f/c/b;

.field public w:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, La/b/c/g;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->o:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->r:Ljava/util/List;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->w:Z

    return-void
.end method


# virtual methods
.method public finish()V
    .locals 1

    sget v0, Lb/c/a/e/f/c/e/h;->c0:I

    invoke-super {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->x()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    invoke-super {p0, p1}, La/k/b/p;->onCreate(Landroid/os/Bundle;)V

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "com.xuexiang.xui.widget.preview.KEY_IMAGE_PATHS"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->p:Ljava/util/List;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    const-string v1, "com.xuexiang.xui.widget.preview.KEY_POSITION"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->q:I

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "com.xuexiang.xui.widget.preview.KEY_TYPE"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lb/c/a/e/f/c/b;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->v:Lb/c/a/e/f/c/b;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "com.xuexiang.xui.widget.preview.KEY_IS_SHOW"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->w:Z

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const/16 v0, 0x12c

    const-string v2, "com.xuexiang.xui.widget.preview.KEY_DURATION"

    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "com.xuexiang.xui.widget.preview.KEY_IS_FULLSCREEN"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x1030011

    invoke-virtual {p0, v0}, La/b/c/g;->setTheme(I)V

    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setDuration(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "com.xuexiang.xui.widget.preview.KEY_CLASSNAME"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->p:Ljava/util/List;

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->q:I

    invoke-virtual {p0, v0, v2, p1}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->w(Ljava/util/List;ILjava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->p:Ljava/util/List;

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->q:I

    const-class v2, Lb/c/a/e/f/c/e/h;

    invoke-virtual {p0, p1, v0, v2}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->w(Ljava/util/List;ILjava/lang/Class;)V

    :goto_0
    # RE layout layout/preview_activity_image_photo (0x7f0c005b), APK res/layout/preview_activity_image_photo.xml
    const p1, 0x7f0c005b

    .line 2
    invoke-virtual {p0, p1}, La/b/c/g;->setContentView(I)V

    const p1, 0x7f09024d

    .line 3
    invoke-virtual {p0, p1}, La/b/c/g;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->s:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    new-instance p1, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$b;

    .line 4
    iget-object v0, p0, La/k/b/p;->i:La/k/b/x;

    .line 5
    iget-object v0, v0, La/k/b/x;->a:La/k/b/z;

    iget-object v0, v0, La/k/b/z;->e:La/k/b/c0;

    .line 6
    invoke-direct {p1, p0, v0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$b;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;La/k/b/c0;)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->s:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    invoke-virtual {v0, p1}, La/t/a/b;->setAdapter(La/t/a/a;)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->s:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->q:I

    invoke-virtual {p1, v0}, La/t/a/b;->setCurrentItem(I)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->s:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, La/t/a/b;->setOffscreenPageLimit(I)V

    const p1, 0x7f090074

    invoke-virtual {p0, p1}, La/b/c/g;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->u:Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;

    const p1, 0x7f09023b

    invoke-virtual {p0, p1}, La/b/c/g;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->t:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->v:Lb/c/a/e/f/c/b;

    sget-object v2, Lb/c/a/e/f/c/b;->b:Lb/c/a/e/f/c/b;

    const/4 v4, 0x2

    if-ne v0, v2, :cond_2

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->u:Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->u:Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->s:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    .line 7
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p1}, La/t/a/b;->b(La/t/a/b$i;)V

    invoke-virtual {v0}, La/t/a/b;->getAdapter()La/t/a/a;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, La/t/a/b;->getAdapter()La/t/a/a;

    move-result-object v2

    invoke-virtual {v2}, La/t/a/a;->c()I

    move-result v2

    iput v2, p1, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->A:I

    :cond_1
    invoke-virtual {v0}, La/t/a/b;->getCurrentItem()I

    move-result v0

    iput v0, p1, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h()V

    iput v4, p1, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->J:I

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    goto :goto_1

    .line 8
    :cond_2
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->t:Landroid/widget/TextView;

    const v0, 0x7f0f007b

    new-array v2, v4, [Ljava/lang/Object;

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->q:I

    add-int/2addr v4, v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->v()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-virtual {p0, v0, v2}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->s:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    new-instance v0, Lb/c/a/e/f/c/e/i;

    invoke-direct {v0, p0}, Lb/c/a/e/f/c/e/i;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)V

    invoke-virtual {p1, v0}, La/t/a/b;->b(La/t/a/b$i;)V

    :goto_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->r:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-ne p1, v1, :cond_3

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->w:Z

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->u:Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->t:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->s:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    new-instance v0, Lb/c/a/e/f/c/e/j;

    invoke-direct {v0, p0}, Lb/c/a/e/f/c/e/j;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-static {}, Lb/c/a/e/f/c/a;->e()Lb/c/a/e/f/c/a;

    move-result-object v0

    .line 1
    iget-object v0, v0, Lb/c/a/e/f/c/a;->a:Lb/c/a/e/f/c/d/b;

    invoke-interface {v0, p0}, Lb/c/a/e/f/c/d/b;->b(Landroid/content/Context;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->s:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, La/t/a/b;->setAdapter(La/t/a/a;)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->s:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    .line 3
    iget-object v0, v0, La/t/a/b;->S:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->s:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->s:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->r:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->r:Ljava/util/List;

    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->p:Ljava/util/List;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->p:Ljava/util/List;

    :cond_3
    invoke-super {p0}, La/b/c/g;->onDestroy()V

    return-void
.end method

.method public final v()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->p:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 1
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public w(Ljava/util/List;ILjava/lang/Class;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lb/c/a/e/f/c/c/a;",
            ">;I",
            "Ljava/lang/Class<",
            "+",
            "Lb/c/a/e/f/c/e/h;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p1

    if-eqz v0, :cond_1

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    move-object/from16 v4, p0

    iget-object v5, v4, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->r:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lb/c/a/e/f/c/c/a;

    move/from16 v7, p2

    if-ne v7, v3, :cond_0

    const/4 v8, 0x1

    goto :goto_1

    :cond_0
    move v8, v2

    :goto_1
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v9

    const-string v10, "com.xuexiang.xui.widget.preview.KEY_SING_FILING"

    invoke-virtual {v9, v10, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v9

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v11

    const-string v12, "com.xuexiang.xui.widget.preview.KEY_DRAG"

    invoke-virtual {v11, v12, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v11

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v13

    const/high16 v14, 0x3f000000    # 0.5f

    const-string v15, "com.xuexiang.xui.widget.preview.KEY_SENSITIVITY"

    invoke-virtual {v13, v15, v14}, Landroid/content/Intent;->getFloatExtra(Ljava/lang/String;F)F

    move-result v13

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v14

    const v2, 0x7f060141

    const-string v0, "com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR"

    invoke-virtual {v14, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    .line 1
    sget v14, Lb/c/a/e/f/c/e/h;->c0:I

    :try_start_0
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lb/c/a/e/f/c/e/h;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    new-instance v14, Lb/c/a/e/f/c/e/h;

    invoke-direct {v14}, Lb/c/a/e/f/c/e/h;-><init>()V

    :goto_2
    move/from16 v16, v1

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v4, "com.xuexiang.xui.widget.preview.KEY_PREVIEW_ITEM"

    invoke-virtual {v1, v4, v6}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v4, "com.xuexiang.xui.widget.preview.KEY_TRANS_PHOTO"

    invoke-virtual {v1, v4, v8}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-virtual {v1, v10, v9}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-virtual {v1, v12, v11}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-virtual {v1, v15, v13}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v14, v1}, La/k/b/m;->p0(Landroid/os/Bundle;)V

    .line 2
    invoke-interface {v5, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v0, p1

    move/from16 v1, v16

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->finish()V

    :cond_2
    return-void
.end method

.method public x()V
    .locals 5

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->o:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->o:Z

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->s:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    invoke-virtual {v0}, La/t/a/b;->getCurrentItem()I

    move-result v0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->v()I

    move-result v1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_3

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->r:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/c/a/e/f/c/e/h;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->t:Landroid/widget/TextView;

    const/16 v3, 0x8

    if-eqz v1, :cond_1

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->u:Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1
    :goto_0
    iget-object v1, v0, Lb/c/a/e/f/c/e/h;->b0:Landroid/widget/ImageView;

    invoke-static {v1}, La/h/j/o;->a(Landroid/view/View;)La/h/j/v;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, La/h/j/v;->a(F)La/h/j/v;

    const-wide/16 v3, 0x1f4

    invoke-virtual {v1, v3, v4}, La/h/j/v;->c(J)La/h/j/v;

    .line 2
    iget-object v1, v1, La/h/j/v;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 3
    :cond_2
    iget-object v1, v0, Lb/c/a/e/f/c/e/h;->Y:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 4
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$a;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$a;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)V

    .line 5
    iget-object v0, v0, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;)V

    goto :goto_1

    .line 6
    :cond_3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->finish()V

    invoke-virtual {p0, v2, v2}, Landroid/app/Activity;->overridePendingTransition(II)V

    :goto_1
    return-void
.end method

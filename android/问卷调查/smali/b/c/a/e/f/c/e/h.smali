.class public Lb/c/a/e/f/c/e/h;
.super La/k/b/m;
.source ""


# static fields
.field public static final synthetic c0:I


# instance fields
.field public V:Lb/c/a/e/f/c/c/a;

.field public W:Z

.field public X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

.field public Y:Landroid/view/View;

.field public Z:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;

.field public a0:Lb/c/a/e/f/c/d/c;

.field public b0:Landroid/widget/ImageView;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lb/c/a/e/f/c/e/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, La/k/b/m;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lb/c/a/e/f/c/e/h;->W:Z

    return-void
.end method

.method public static x0(Lb/c/a/e/f/c/e/h;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/k/b/m;->h()La/k/b/p;

    move-result-object p0

    check-cast p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->x()V

    :cond_0
    return-void
.end method


# virtual methods
.method public P(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c005d

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public Q()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, La/k/b/m;->E:Z

    .line 2
    invoke-static {}, Lb/c/a/e/f/c/a;->e()Lb/c/a/e/f/c/a;

    move-result-object v0

    invoke-virtual {p0}, La/k/b/m;->h()La/k/b/p;

    move-result-object v1

    .line 3
    iget-object v0, v0, Lb/c/a/e/f/c/a;->a:Lb/c/a/e/f/c/d/b;

    invoke-interface {v0, v1}, Lb/c/a/e/f/c/d/b;->b(Landroid/content/Context;)V

    .line 4
    invoke-virtual {p0}, La/k/b/m;->h()La/k/b/p;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, La/k/b/m;->h()La/k/b/p;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    :cond_0
    return-void
.end method

.method public R()V
    .locals 4

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lb/c/a/e/f/c/e/h;->a0:Lb/c/a/e/f/c/d/c;

    iget-object v1, p0, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object v1, p0, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {v1, v0}, Lb/c/a/e/f/b/c;->setOnViewTapListener(Lb/c/a/e/f/b/e$h;)V

    iget-object v1, p0, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {v1, v0}, Lb/c/a/e/f/b/c;->setOnPhotoTapListener(Lb/c/a/e/f/b/e$e;)V

    iget-object v1, p0, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setAlphaChangeListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$e;)V

    iget-object v1, p0, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setTransformOutListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$f;)V

    iget-object v1, p0, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 2
    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setOnTransformListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;)V

    iput-boolean v2, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->m:Z

    sget-object v3, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    iput-object v3, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    invoke-virtual {v1}, Landroid/widget/ImageView;->invalidate()V

    .line 3
    iget-object v1, p0, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;)V

    iget-object v1, p0, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {v1, v0}, Lb/c/a/e/f/b/c;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    iget-object v1, p0, Lb/c/a/e/f/c/e/h;->b0:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iput-object v0, p0, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    iput-object v0, p0, Lb/c/a/e/f/c/e/h;->Y:Landroid/view/View;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lb/c/a/e/f/c/e/h;->W:Z

    .line 4
    :cond_0
    iput-boolean v2, p0, La/k/b/m;->E:Z

    return-void
.end method

.method public d0()V
    .locals 1

    invoke-static {}, Lb/c/a/e/f/c/a;->e()Lb/c/a/e/f/c/a;

    move-result-object v0

    .line 1
    iget-object v0, v0, Lb/c/a/e/f/c/a;->a:Lb/c/a/e/f/c/d/b;

    invoke-interface {v0, p0}, Lb/c/a/e/f/c/d/b;->a(La/k/b/m;)V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/k/b/m;->E:Z

    return-void
.end method

.method public e0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 4

    const p2, 0x7f090138

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;

    iput-object p2, p0, Lb/c/a/e/f/c/e/h;->Z:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;

    const p2, 0x7f090194

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    iput-object p2, p0, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    const p2, 0x7f090085

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lb/c/a/e/f/c/e/h;->b0:Landroid/widget/ImageView;

    const p2, 0x7f0901a6

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lb/c/a/e/f/c/e/h;->Y:Landroid/view/View;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    iget-object p1, p0, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setDrawingCacheEnabled(Z)V

    iget-object p1, p0, Lb/c/a/e/f/c/e/h;->b0:Landroid/widget/ImageView;

    new-instance v0, Lb/c/a/e/f/c/e/a;

    invoke-direct {v0, p0}, Lb/c/a/e/f/c/e/a;-><init>(Lb/c/a/e/f/c/e/h;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p1, Lb/c/a/e/f/c/e/b;

    invoke-direct {p1, p0}, Lb/c/a/e/f/c/e/b;-><init>(Lb/c/a/e/f/c/e/h;)V

    iput-object p1, p0, Lb/c/a/e/f/c/e/h;->a0:Lb/c/a/e/f/c/d/c;

    .line 2
    iget-object p1, p0, La/k/b/m;->h:Landroid/os/Bundle;

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    const v0, 0x7f060141

    const-string v1, "com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR"

    .line 3
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iget-object v1, p0, Lb/c/a/e/f/c/e/h;->Z:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;

    .line 4
    invoke-static {}, Lb/c/a/a;->p()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    .line 5
    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setSupportIndeterminateTintList(Landroid/content/res/ColorStateList;)V

    const-string v0, "com.xuexiang.xui.widget.preview.KEY_SING_FILING"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "com.xuexiang.xui.widget.preview.KEY_PREVIEW_ITEM"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lb/c/a/e/f/c/c/a;

    iput-object v1, p0, Lb/c/a/e/f/c/e/h;->V:Lb/c/a/e/f/c/c/a;

    iget-object v1, p0, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    const-string v2, "com.xuexiang.xui.widget.preview.KEY_DRAG"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    const-string v3, "com.xuexiang.xui.widget.preview.KEY_SENSITIVITY"

    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v3

    .line 6
    iput-boolean v2, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->p:Z

    iput v3, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->r:F

    .line 7
    iget-object v1, p0, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    iget-object v2, p0, Lb/c/a/e/f/c/e/h;->V:Lb/c/a/e/f/c/c/a;

    invoke-interface {v2}, Lb/c/a/e/f/c/c/a;->f()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setThumbRect(Landroid/graphics/Rect;)V

    iget-object v1, p0, Lb/c/a/e/f/c/e/h;->Y:Landroid/view/View;

    iget-object v2, p0, Lb/c/a/e/f/c/e/h;->V:Lb/c/a/e/f/c/c/a;

    invoke-interface {v2}, Lb/c/a/e/f/c/c/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const-string v1, "com.xuexiang.xui.widget.preview.KEY_TRANS_PHOTO"

    invoke-virtual {p1, v1, p2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lb/c/a/e/f/c/e/h;->W:Z

    iget-object p1, p0, Lb/c/a/e/f/c/e/h;->V:Lb/c/a/e/f/c/c/a;

    invoke-interface {p1}, Lb/c/a/e/f/c/c/a;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v1, ".gif"

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {p1, p2}, Lb/c/a/e/f/b/c;->setZoomable(Z)V

    invoke-static {}, Lb/c/a/e/f/c/a;->e()Lb/c/a/e/f/c/a;

    move-result-object p1

    iget-object p2, p0, Lb/c/a/e/f/c/e/h;->V:Lb/c/a/e/f/c/c/a;

    invoke-interface {p2}, Lb/c/a/e/f/c/c/a;->c()Ljava/lang/String;

    move-result-object p2

    iget-object v1, p0, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    iget-object v2, p0, Lb/c/a/e/f/c/e/h;->a0:Lb/c/a/e/f/c/d/c;

    .line 8
    iget-object p1, p1, Lb/c/a/e/f/c/a;->a:Lb/c/a/e/f/c/d/b;

    invoke-interface {p1, p0, p2, v1, v2}, Lb/c/a/e/f/c/d/b;->d(La/k/b/m;Ljava/lang/String;Landroid/widget/ImageView;Lb/c/a/e/f/c/d/c;)V

    goto :goto_0

    .line 9
    :cond_0
    invoke-static {}, Lb/c/a/e/f/c/a;->e()Lb/c/a/e/f/c/a;

    move-result-object p1

    iget-object p2, p0, Lb/c/a/e/f/c/e/h;->V:Lb/c/a/e/f/c/c/a;

    invoke-interface {p2}, Lb/c/a/e/f/c/c/a;->c()Ljava/lang/String;

    move-result-object p2

    iget-object v1, p0, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    iget-object v2, p0, Lb/c/a/e/f/c/e/h;->a0:Lb/c/a/e/f/c/d/c;

    .line 10
    iget-object p1, p1, Lb/c/a/e/f/c/a;->a:Lb/c/a/e/f/c/d/b;

    invoke-interface {p1, p0, p2, v1, v2}, Lb/c/a/e/f/c/d/b;->c(La/k/b/m;Ljava/lang/String;Landroid/widget/ImageView;Lb/c/a/e/f/c/d/c;)V

    .line 11
    :cond_1
    :goto_0
    iget-boolean p1, p0, Lb/c/a/e/f/c/e/h;->W:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lb/c/a/e/f/c/e/h;->Y:Landroid/view/View;

    const/high16 p2, -0x1000000

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    const p2, 0x3f333333    # 0.7f

    invoke-virtual {p1, p2}, Lb/c/a/e/f/b/c;->setMinimumScale(F)V

    :goto_1
    iget-object p1, p0, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    if-eqz v0, :cond_3

    new-instance p2, Lb/c/a/e/f/c/e/c;

    invoke-direct {p2, p0}, Lb/c/a/e/f/c/e/c;-><init>(Lb/c/a/e/f/c/e/h;)V

    invoke-virtual {p1, p2}, Lb/c/a/e/f/b/c;->setOnViewTapListener(Lb/c/a/e/f/b/e$h;)V

    goto :goto_2

    :cond_3
    new-instance p2, Lb/c/a/e/f/c/e/d;

    invoke-direct {p2, p0}, Lb/c/a/e/f/c/e/d;-><init>(Lb/c/a/e/f/c/e/h;)V

    invoke-virtual {p1, p2}, Lb/c/a/e/f/b/c;->setOnPhotoTapListener(Lb/c/a/e/f/b/e$e;)V

    :goto_2
    iget-object p1, p0, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    new-instance p2, Lb/c/a/e/f/c/e/e;

    invoke-direct {p2, p0}, Lb/c/a/e/f/c/e/e;-><init>(Lb/c/a/e/f/c/e/h;)V

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setAlphaChangeListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$e;)V

    iget-object p1, p0, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    new-instance p2, Lb/c/a/e/f/c/e/f;

    invoke-direct {p2, p0}, Lb/c/a/e/f/c/e/f;-><init>(Lb/c/a/e/f/c/e/h;)V

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setTransformOutListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$f;)V

    return-void
.end method

.method public v0(Z)V
    .locals 0

    invoke-super {p0, p1}, La/k/b/m;->v0(Z)V

    return-void
.end method

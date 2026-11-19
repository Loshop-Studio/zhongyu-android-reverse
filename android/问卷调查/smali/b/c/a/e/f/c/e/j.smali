.class public Lb/c/a/e/f/c/e/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic b:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)V
    .locals 0

    iput-object p1, p0, Lb/c/a/e/f/c/e/j;->b:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 4

    iget-object v0, p0, Lb/c/a/e/f/c/e/j;->b:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 1
    iget-object v0, v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->s:Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    .line 2
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    iget-object v0, p0, Lb/c/a/e/f/c/e/j;->b:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 3
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->r:Ljava/util/List;

    .line 4
    iget v0, v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    if-ltz v0, :cond_0

    .line 5
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v3

    if-ge v0, v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    .line 6
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 7
    :goto_1
    check-cast v0, Lb/c/a/e/f/c/e/h;

    if-eqz v0, :cond_2

    .line 8
    iget-object v1, v0, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    new-instance v3, Lb/c/a/e/f/c/e/g;

    invoke-direct {v3, v0}, Lb/c/a/e/f/c/e/g;-><init>(Lb/c/a/e/f/c/e/h;)V

    .line 9
    invoke-virtual {v1, v3}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setOnTransformListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;)V

    iput-boolean v2, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->m:Z

    sget-object v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    iput-object v0, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    invoke-virtual {v1}, Landroid/widget/ImageView;->invalidate()V

    :cond_2
    return-void
.end method

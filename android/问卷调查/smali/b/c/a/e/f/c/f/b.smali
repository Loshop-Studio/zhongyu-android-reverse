.class public Lb/c/a/e/f/c/f/b;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V
    .locals 0

    iput-object p1, p0, Lb/c/a/e/f/c/f/b;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget-object p1, p0, Lb/c/a/e/f/c/f/b;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 1
    iget-object v0, p1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->A:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    .line 3
    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->a(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;)V

    :cond_0
    iget-object p1, p0, Lb/c/a/e/f/c/f/b;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 4
    iget-object v0, p1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    .line 5
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    if-ne v0, v1, :cond_1

    sget-object v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;->b:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    .line 6
    iput-object v0, p1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    :cond_1
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    iget-object p1, p0, Lb/c/a/e/f/c/f/b;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    const v0, 0x7f090120

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lb/c/a/e/f/c/f/b;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/widget/ImageView;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, Lb/c/a/e/f/c/f/b;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {p1, v1}, Lb/c/a/e/f/b/c;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_0
    return-void
.end method

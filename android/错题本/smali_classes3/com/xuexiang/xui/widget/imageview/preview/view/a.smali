.class public final Lcom/xuexiang/xui/widget/imageview/preview/view/a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/a;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/a;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 2
    .line 3
    iget-object v0, p1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->w:Lcom/xuexiang/xui/widget/imageview/preview/view/b;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/b;->a()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 11
    .line 12
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_IN:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 13
    .line 14
    if-ne v0, v1, :cond_1

    .line 15
    .line 16
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_NORMAL:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 17
    .line 18
    iput-object v0, p1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    sget p1, Lcom/xuexiang/xui/R$id;->item_image_key:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/a;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    sget p1, Lcom/xuexiang/xui/R$id;->item_image_key:I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, p1, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

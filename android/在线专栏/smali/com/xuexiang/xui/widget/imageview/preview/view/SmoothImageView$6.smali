.class Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$6;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->startTransform()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$6;->this$0:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$6;->this$0:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->access$200(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$onTransformListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$6;->this$0:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->access$200(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$onTransformListener;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$6;->this$0:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->access$300(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$onTransformListener;->onTransformCompleted(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$6;->this$0:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->access$300(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    move-result-object p1

    sget-object v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_IN:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    if-ne p1, v0, :cond_1

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$6;->this$0:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    sget-object v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_NORMAL:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->access$302(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;)Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    :cond_1
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$6;->this$0:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    sget v0, Lcom/xuexiang/xui/R$id;->item_image_key:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$6;->this$0:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/widget/ImageView;->setTag(ILjava/lang/Object;)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$6;->this$0:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {p1, v1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_0
    return-void
.end method

.class Lcom/xuexiang/xui/widget/guidview/GuideCaseView$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/guidview/OnViewInflateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->inflatePicture()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$4;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onViewInflated(Landroid/view/View;)V
    .locals 2

    .line 1
    sget v0, Lcom/xuexiang/xui/R$id;->gcv_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$4;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$4500(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 3
    invoke-virtual {p1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$4;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$4600(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$4;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$4700(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$4;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$4700(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 7
    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$4;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$4800(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v1

    if-eqz v1, :cond_1

    .line 8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$4;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$4800(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 9
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$4;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$4900(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v1

    if-lez v1, :cond_2

    .line 10
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$4;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$4900(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    goto :goto_0

    .line 11
    :cond_2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$4;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$4900(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v1

    neg-int v1, v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 12
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$4;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$5000(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v1

    if-lez v1, :cond_3

    .line 13
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$4;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$5000(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    goto :goto_1

    .line 14
    :cond_3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$4;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$5000(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v1

    neg-int v1, v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 15
    :goto_1
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

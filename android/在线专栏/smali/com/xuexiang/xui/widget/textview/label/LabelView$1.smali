.class Lcom/xuexiang/xui/widget/textview/label/LabelView$1;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/textview/label/LabelView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/textview/label/LabelView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/textview/label/LabelView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView$1;->this$0:Lcom/xuexiang/xui/widget/textview/label/LabelView;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method protected applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/view/animation/Transformation;->getMatrix()Landroid/graphics/Matrix;

    move-result-object p1

    .line 2
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView$1;->this$0:Lcom/xuexiang/xui/widget/textview/label/LabelView;

    invoke-static {p2}, Lcom/xuexiang/xui/widget/textview/label/LabelView;->access$000(Lcom/xuexiang/xui/widget/textview/label/LabelView;)F

    move-result p2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView$1;->this$0:Lcom/xuexiang/xui/widget/textview/label/LabelView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/textview/label/LabelView;->access$100(Lcom/xuexiang/xui/widget/textview/label/LabelView;)F

    move-result v0

    invoke-virtual {p1, p2, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 3
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView$1;->this$0:Lcom/xuexiang/xui/widget/textview/label/LabelView;

    invoke-static {p2}, Lcom/xuexiang/xui/widget/textview/label/LabelView;->access$200(Lcom/xuexiang/xui/widget/textview/label/LabelView;)F

    move-result p2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView$1;->this$0:Lcom/xuexiang/xui/widget/textview/label/LabelView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/textview/label/LabelView;->access$300(Lcom/xuexiang/xui/widget/textview/label/LabelView;)F

    move-result v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView$1;->this$0:Lcom/xuexiang/xui/widget/textview/label/LabelView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/textview/label/LabelView;->access$400(Lcom/xuexiang/xui/widget/textview/label/LabelView;)F

    move-result v1

    invoke-virtual {p1, p2, v0, v1}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    return-void
.end method

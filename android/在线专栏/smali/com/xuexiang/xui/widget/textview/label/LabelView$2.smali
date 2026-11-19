.class Lcom/xuexiang/xui/widget/textview/label/LabelView$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/textview/label/LabelView;->setTargetView(Landroid/view/View;ILcom/xuexiang/xui/widget/textview/label/LabelView$Gravity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/textview/label/LabelView;

.field final synthetic val$d:I

.field final synthetic val$g:Lcom/xuexiang/xui/widget/textview/label/LabelView$Gravity;

.field final synthetic val$v:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/textview/label/LabelView;ILcom/xuexiang/xui/widget/textview/label/LabelView$Gravity;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView$2;->this$0:Lcom/xuexiang/xui/widget/textview/label/LabelView;

    iput p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView$2;->val$d:I

    iput-object p3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView$2;->val$g:Lcom/xuexiang/xui/widget/textview/label/LabelView$Gravity;

    iput-object p4, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView$2;->val$v:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView$2;->this$0:Lcom/xuexiang/xui/widget/textview/label/LabelView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView$2;->this$0:Lcom/xuexiang/xui/widget/textview/label/LabelView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView$2;->val$d:I

    iget-object v4, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView$2;->val$g:Lcom/xuexiang/xui/widget/textview/label/LabelView$Gravity;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelView$2;->val$v:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lcom/xuexiang/xui/widget/textview/label/LabelView;->access$500(Lcom/xuexiang/xui/widget/textview/label/LabelView;IILcom/xuexiang/xui/widget/textview/label/LabelView$Gravity;IZ)V

    return-void
.end method

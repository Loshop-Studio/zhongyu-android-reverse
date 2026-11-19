.class Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultLeftViewClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

.field final synthetic val$baseTextView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$1;->this$0:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$1;->val$baseTextView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$1;->this$0:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->access$000(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftTopTvClickListener;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$1;->val$baseTextView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getTopTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftTopTvClickListener;->onClick(Landroid/widget/TextView;)V

    return-void
.end method

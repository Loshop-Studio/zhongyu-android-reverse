.class Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->setCenterViewIsClickable(Z)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$6;->this$0:Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$6;->this$0:Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->access$000(Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$OnCommonTextViewClickListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$6;->this$0:Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->access$000(Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$OnCommonTextViewClickListener;

    move-result-object p1

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$OnCommonTextViewClickListener;->onCenterViewClick()V

    :cond_0
    return-void
.end method

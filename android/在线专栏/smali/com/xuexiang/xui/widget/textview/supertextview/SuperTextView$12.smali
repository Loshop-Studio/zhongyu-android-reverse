.class Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setRightImageViewClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightImageViewClickListener;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$12;->this$0:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$12;->this$0:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->access$1300(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightImageViewClickListener;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$12;->this$0:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->access$1200(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightImageViewClickListener;->onClick(Landroid/widget/ImageView;)V

    return-void
.end method

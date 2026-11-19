.class Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$OnGestureControl;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->addText(Ljava/lang/String;Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;

.field final synthetic val$frmBorder:Landroid/widget/FrameLayout;

.field final synthetic val$imgClose:Landroid/widget/ImageView;

.field final synthetic val$textInputTv:Landroid/widget/TextView;

.field final synthetic val$textRootView:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;Landroid/widget/FrameLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$2;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$2;->val$frmBorder:Landroid/widget/FrameLayout;

    iput-object p3, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$2;->val$imgClose:Landroid/widget/ImageView;

    iput-object p4, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$2;->val$textInputTv:Landroid/widget/TextView;

    iput-object p5, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$2;->val$textRootView:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$2;->val$frmBorder:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getTag()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$2;->val$frmBorder:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$2;->val$frmBorder:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_1

    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    sget v4, Lcom/xuexiang/xui/R$drawable;->pe_rounded_border_tv:I

    :goto_1
    invoke-virtual {v3, v4}, Landroid/widget/FrameLayout;->setBackgroundResource(I)V

    .line 3
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$2;->val$imgClose:Landroid/widget/ImageView;

    if-eqz v0, :cond_2

    const/16 v2, 0x8

    :cond_2
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$2;->val$frmBorder:Landroid/widget/FrameLayout;

    xor-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    return-void
.end method

.method public onLongClick()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$2;->val$textInputTv:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$2;->val$textInputTv:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result v1

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$2;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->access$800(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;)Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$2;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->access$800(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;)Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;

    move-result-object v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$2;->val$textRootView:Landroid/view/View;

    invoke-interface {v2, v3, v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;->onEditTextChangeListener(Landroid/view/View;Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.class Lcom/xuexiang/xui/widget/guidview/GuideCaseView$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/guidview/OnViewInflateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->inflateTitleView()V
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

    iput-object p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$3;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onViewInflated(Landroid/view/View;)V
    .locals 2

    .line 1
    sget v0, Lcom/xuexiang/xui/R$id;->gcv_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$3;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$3800(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextAppearance(I)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$3;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$3900(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$3;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$3800(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 5
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$3;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$4000(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$3;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$4100(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$3;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$4000(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$3;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$4200(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 8
    invoke-static {}, Lcom/xuexiang/xui/XUI;->getDefaultTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$3;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$4300(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)Landroid/text/Spanned;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$3;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$4300(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 11
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$3;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$4400(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    return-void
.end method

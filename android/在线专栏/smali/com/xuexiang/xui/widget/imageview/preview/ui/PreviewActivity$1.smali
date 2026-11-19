.class Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$1;->this$0:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$1;->this$0:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->access$000(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$1;->this$0:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->access$000(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$1;->this$0:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    sget v3, Lcom/xuexiang/xui/R$string;->xui_preview_count_string:I

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    add-int/lit8 v6, p1, 0x1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    iget-object v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$1;->this$0:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    invoke-static {v5}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->access$100(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-virtual {v2, v3, v4}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$1;->this$0:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->access$202(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;I)I

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$1;->this$0:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->access$300(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$1;->this$0:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->access$200(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)I

    move-result v0

    invoke-virtual {p1, v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    return-void
.end method

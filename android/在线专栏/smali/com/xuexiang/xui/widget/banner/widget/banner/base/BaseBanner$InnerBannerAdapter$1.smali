.class Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$InnerBannerAdapter$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$InnerBannerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$InnerBannerAdapter;

.field final synthetic val$position:I


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$InnerBannerAdapter;I)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$InnerBannerAdapter$1;->this$1:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$InnerBannerAdapter;

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$InnerBannerAdapter$1;->val$position:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$InnerBannerAdapter$1;->this$1:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$InnerBannerAdapter;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$InnerBannerAdapter;->this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->access$700(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$OnItemClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$InnerBannerAdapter$1;->this$1:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$InnerBannerAdapter;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$InnerBannerAdapter;->this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->access$700(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$OnItemClickListener;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$InnerBannerAdapter$1;->this$1:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$InnerBannerAdapter;

    iget-object v1, v1, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$InnerBannerAdapter;->this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    iget v2, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$InnerBannerAdapter$1;->val$position:I

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$InnerBannerAdapter$1;->val$position:I

    invoke-interface {v0, p1, v1, v2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$OnItemClickListener;->onItemClick(Landroid/view/View;Ljava/lang/Object;I)V

    :cond_0
    return-void
.end method

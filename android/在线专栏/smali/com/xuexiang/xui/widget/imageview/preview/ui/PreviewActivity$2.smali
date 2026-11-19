.class Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


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

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$2;->this$0:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$2;->this$0:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->access$300(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)Lcom/xuexiang/xui/widget/imageview/preview/view/PhotoViewPager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$2;->this$0:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->access$400(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$2;->this$0:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->access$200(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/CollectionUtils;->getListItem(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->transformIn()V

    :cond_0
    return-void
.end method

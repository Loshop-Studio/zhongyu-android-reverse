.class Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->getImageView(I)Landroid/widget/ImageView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;

.field final synthetic val$position:I


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;I)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$1;->this$0:Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$1;->val$position:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$1;->this$0:Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->access$100(Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;)Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageViewAdapter;

    move-result-object v0

    check-cast p1, Landroid/widget/ImageView;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$1;->val$position:I

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$1;->this$0:Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->access$000(Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageViewAdapter;->onItemImageClick(Landroid/widget/ImageView;ILjava/util/List;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$1;->this$0:Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->access$200(Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;)Lcom/xuexiang/xui/widget/imageview/nine/ItemImageClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$1;->this$0:Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->access$200(Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;)Lcom/xuexiang/xui/widget/imageview/nine/ItemImageClickListener;

    move-result-object v0

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$1;->val$position:I

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$1;->this$0:Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->access$000(Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Lcom/xuexiang/xui/widget/imageview/nine/ItemImageClickListener;->onItemImageClick(Landroid/widget/ImageView;ILjava/util/List;)V

    :cond_0
    return-void
.end method

.class Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


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

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$2;->this$0:Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$2;->val$position:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$2;->this$0:Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->access$100(Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;)Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageViewAdapter;

    move-result-object v0

    check-cast p1, Landroid/widget/ImageView;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$2;->val$position:I

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$2;->this$0:Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->access$000(Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageViewAdapter;->onItemImageLongClick(Landroid/widget/ImageView;ILjava/util/List;)Z

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$2;->this$0:Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->access$300(Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;)Lcom/xuexiang/xui/widget/imageview/nine/ItemImageLongClickListener;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$2;->this$0:Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->access$300(Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;)Lcom/xuexiang/xui/widget/imageview/nine/ItemImageLongClickListener;

    move-result-object v1

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$2;->val$position:I

    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView$2;->this$0:Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;

    invoke-static {v3}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->access$000(Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, p1, v2, v3}, Lcom/xuexiang/xui/widget/imageview/nine/ItemImageLongClickListener;->onItemImageLongClick(Landroid/widget/ImageView;ILjava/util/List;)Z

    move-result p1

    if-nez p1, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    const/4 v0, 0x1

    :cond_2
    :goto_1
    return v0
.end method

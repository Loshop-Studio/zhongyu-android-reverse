.class Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;->registerOnItemClick()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;

.field final synthetic val$viewHolder:Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$ViewHolder;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$ViewHolder;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$1;->this$0:Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$1;->val$viewHolder:Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$ViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$1;->this$0:Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;->mOnItemClickListener:Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$OnItemClickListener;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$1;->val$viewHolder:Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$ViewHolder;

    invoke-interface {v0, p1, v1}, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$OnItemClickListener;->onItemClick(Landroid/view/View;Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$ViewHolder;)V

    return-void
.end method

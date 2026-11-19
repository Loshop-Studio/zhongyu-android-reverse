.class Lcom/xuexiang/xui/widget/textview/ExpandableTextView$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->onMeasure(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$2;->this$0:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$2;->this$0:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getHeight()I

    move-result v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$2;->this$0:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;

    iget-object v2, v2, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mTv:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->access$502(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;I)I

    return-void
.end method

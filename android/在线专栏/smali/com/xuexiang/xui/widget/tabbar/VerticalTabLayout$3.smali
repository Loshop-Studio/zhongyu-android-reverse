.class Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->setTabSelected(IZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

.field final synthetic val$callListener:Z

.field final synthetic val$position:I

.field final synthetic val$updateIndicator:Z


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;IZZ)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$3;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    iput p2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$3;->val$position:I

    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$3;->val$updateIndicator:Z

    iput-boolean p4, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$3;->val$callListener:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$3;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    iget v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$3;->val$position:I

    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$3;->val$updateIndicator:Z

    iget-boolean v3, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$3;->val$callListener:Z

    invoke-static {v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$100(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;IZZ)V

    return-void
.end method

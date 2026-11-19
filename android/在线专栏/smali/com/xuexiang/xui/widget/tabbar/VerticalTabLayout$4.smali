.class Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->setTabMode(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$4;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$4;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$000(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->updateIndicator()V

    return-void
.end method

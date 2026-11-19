.class Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView$1;->this$0:Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .line 1
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView$1;->this$0:Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;

    invoke-static {p2}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->access$000(Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;)Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView$OnMultiTabSelectionChangedListener;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView$1;->this$0:Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->access$100(Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView$1;->this$0:Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->access$000(Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;)Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView$OnMultiTabSelectionChangedListener;

    move-result-object v1

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    invoke-interface {v1, p2, v0, p1}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView$OnMultiTabSelectionChangedListener;->newSelection(Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_0
    return-void
.end method

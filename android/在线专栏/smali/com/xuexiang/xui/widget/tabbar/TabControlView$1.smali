.class Lcom/xuexiang/xui/widget/tabbar/TabControlView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/tabbar/TabControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/tabbar/TabControlView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/tabbar/TabControlView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView$1;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabControlView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView$1;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabControlView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->access$000(Lcom/xuexiang/xui/widget/tabbar/TabControlView;)Lcom/xuexiang/xui/widget/tabbar/TabControlView$OnTabSelectionChangedListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1, p2}, Landroid/widget/RadioGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RadioButton;

    invoke-virtual {p1}, Landroid/widget/RadioButton;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    .line 3
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView$1;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabControlView;

    invoke-static {p2}, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->access$100(Lcom/xuexiang/xui/widget/tabbar/TabControlView;)Ljava/util/LinkedHashMap;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView$1;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabControlView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->access$000(Lcom/xuexiang/xui/widget/tabbar/TabControlView;)Lcom/xuexiang/xui/widget/tabbar/TabControlView$OnTabSelectionChangedListener;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/xuexiang/xui/widget/tabbar/TabControlView$OnTabSelectionChangedListener;->newSelection(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

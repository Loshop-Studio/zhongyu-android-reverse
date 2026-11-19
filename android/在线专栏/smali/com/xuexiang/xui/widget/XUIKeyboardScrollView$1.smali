.class Lcom/xuexiang/xui/widget/XUIKeyboardScrollView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;->onToggleSoftKeyboard(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView$1;->this$0:Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView$1;->this$0:Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;

    invoke-virtual {v0}, Landroid/widget/ScrollView;->getScrollY()I

    move-result v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView$1;->this$0:Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;->access$000(Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;)I

    move-result v2

    add-int/2addr v1, v2

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    return-void
.end method

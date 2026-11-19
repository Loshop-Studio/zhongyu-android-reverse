.class Lcom/xuexiang/xui/widget/edittext/MultiLineEditText$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setSelected(Z)V

    return-void
.end method

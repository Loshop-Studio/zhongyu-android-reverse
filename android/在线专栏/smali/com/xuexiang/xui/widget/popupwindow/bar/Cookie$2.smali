.class Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->setParams(Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;

.field final synthetic val$params:Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$2;->this$0:Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$2;->val$params:Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$2;->val$params:Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->onActionClickListener:Landroid/view/View$OnClickListener;

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$2;->this$0:Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->dismiss()V

    return-void
.end method

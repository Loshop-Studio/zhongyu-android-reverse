.class Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;->onCreateItemView(I)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;->access$000(Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;)Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$OnJumpClickListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;->access$000(Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;)Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$OnJumpClickListener;

    move-result-object p1

    invoke-interface {p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$OnJumpClickListener;->onJumpClick()V

    :cond_0
    return-void
.end method

.class Lcom/xuexiang/xui/widget/textview/LoggerTextView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/textview/LoggerTextView;->appendLogInMainThread(Landroid/text/SpannableString;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/textview/LoggerTextView;

.field final synthetic val$spannableString:Landroid/text/SpannableString;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/textview/LoggerTextView;Landroid/text/SpannableString;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/LoggerTextView$1;->this$0:Lcom/xuexiang/xui/widget/textview/LoggerTextView;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/textview/LoggerTextView$1;->val$spannableString:Landroid/text/SpannableString;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/LoggerTextView$1;->this$0:Lcom/xuexiang/xui/widget/textview/LoggerTextView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/LoggerTextView$1;->val$spannableString:Landroid/text/SpannableString;

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->access$000(Lcom/xuexiang/xui/widget/textview/LoggerTextView;Landroid/text/SpannableString;)V

    return-void
.end method

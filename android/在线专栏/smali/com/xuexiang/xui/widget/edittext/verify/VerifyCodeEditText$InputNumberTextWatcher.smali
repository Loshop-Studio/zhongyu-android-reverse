.class Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$InputNumberTextWatcher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "InputNumberTextWatcher"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;


# direct methods
.method private constructor <init>(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$InputNumberTextWatcher;->this$0:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$InputNumberTextWatcher;-><init>(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;)V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, ""

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 4
    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_1

    .line 5
    iget-object v3, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$InputNumberTextWatcher;->this$0:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;

    invoke-static {v3}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->access$400(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;)I

    move-result v3

    if-le v2, v3, :cond_0

    goto :goto_1

    .line 6
    :cond_0
    iget-object v3, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$InputNumberTextWatcher;->this$0:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;

    aget-object v4, p1, v2

    invoke-static {v3, v4, v1}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->access$500(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;Ljava/lang/String;Z)V

    .line 7
    iget-object v3, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$InputNumberTextWatcher;->this$0:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;

    invoke-static {v3}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->access$600(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;)Lcom/xuexiang/xui/widget/edittext/verify/PwdEditText;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.class public Lcom/xuexiang/xui/widget/textview/LoggerTextView$DefaultLogDecorator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogDecorator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/textview/LoggerTextView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DefaultLogDecorator"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public decorate(Ljava/lang/String;Lcom/xuexiang/xui/widget/textview/LoggerTextView$LogType;)Landroid/text/SpannableString;
    .locals 4

    .line 1
    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 2
    sget-object v1, Lcom/xuexiang/xui/widget/textview/LoggerTextView$3;->$SwitchMap$com$xuexiang$xui$widget$textview$LoggerTextView$LogType:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v1, p2

    const/4 v1, 0x1

    const/16 v2, 0x21

    const/4 v3, 0x0

    if-eq p2, v1, :cond_2

    const/4 v1, 0x2

    if-eq p2, v1, :cond_1

    const/4 v1, 0x3

    if-eq p2, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance p2, Landroid/text/style/ForegroundColorSpan;

    sget v1, Lcom/xuexiang/xui/R$color;->xui_config_color_waring:I

    invoke-static {v1}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result v1

    invoke-direct {p2, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    .line 5
    invoke-virtual {v0, p2, v3, p1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    .line 6
    :cond_1
    new-instance p2, Landroid/text/style/ForegroundColorSpan;

    sget v1, Lcom/xuexiang/xui/R$color;->xui_config_color_success:I

    invoke-static {v1}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result v1

    invoke-direct {p2, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    .line 8
    invoke-virtual {v0, p2, v3, p1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    .line 9
    :cond_2
    new-instance p2, Landroid/text/style/ForegroundColorSpan;

    sget v1, Lcom/xuexiang/xui/R$color;->xui_config_color_error:I

    invoke-static {v1}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result v1

    invoke-direct {p2, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    .line 11
    invoke-virtual {v0, p2, v3, p1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    :goto_0
    return-object v0
.end method

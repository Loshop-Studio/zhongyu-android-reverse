.class public Lcom/xuexiang/xui/widget/textview/LoggerTextView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/textview/LoggerTextView$c;,
        Lcom/xuexiang/xui/widget/textview/LoggerTextView$a;,
        Lcom/xuexiang/xui/widget/textview/LoggerTextView$d;,
        Lcom/xuexiang/xui/widget/textview/LoggerTextView$b;
    }
.end annotation


# instance fields
.field public b:Lcom/xuexiang/xui/widget/textview/LoggerTextView$d;

.field public c:Lcom/xuexiang/xui/widget/textview/LoggerTextView$c;


# direct methods
.method private getTextRealHeight()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/widget/TextView;->getLineCount()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineTop(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    add-int/2addr v0, v1

    .line 22
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    add-int/2addr v0, v1

    .line 27
    return v0
.end method


# virtual methods
.method public getLogDecorator()Lcom/xuexiang/xui/widget/textview/LoggerTextView$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->c:Lcom/xuexiang/xui/widget/textview/LoggerTextView$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/xuexiang/xui/widget/textview/LoggerTextView$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/xuexiang/xui/widget/textview/LoggerTextView$a;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->c:Lcom/xuexiang/xui/widget/textview/LoggerTextView$c;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->c:Lcom/xuexiang/xui/widget/textview/LoggerTextView$c;

    .line 13
    .line 14
    return-object v0
.end method

.method public getLogFormatter()Lcom/xuexiang/xui/widget/textview/LoggerTextView$d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->b:Lcom/xuexiang/xui/widget/textview/LoggerTextView$d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/xuexiang/xui/widget/textview/LoggerTextView$b;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/xuexiang/xui/widget/textview/LoggerTextView$b;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->b:Lcom/xuexiang/xui/widget/textview/LoggerTextView$d;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->b:Lcom/xuexiang/xui/widget/textview/LoggerTextView$d;

    .line 13
    .line 14
    return-object v0
.end method

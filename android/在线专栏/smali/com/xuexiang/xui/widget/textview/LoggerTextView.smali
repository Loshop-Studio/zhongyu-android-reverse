.class public Lcom/xuexiang/xui/widget/textview/LoggerTextView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/textview/LoggerTextView$LogType;,
        Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogDecorator;,
        Lcom/xuexiang/xui/widget/textview/LoggerTextView$DefaultLogDecorator;,
        Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogFormatter;,
        Lcom/xuexiang/xui/widget/textview/LoggerTextView$DefaultLogFormatter;
    }
.end annotation


# instance fields
.field private mLogDecorator:Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogDecorator;

.field private mLogFormatter:Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogFormatter;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/textview/LoggerTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->LoggerTextViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/textview/LoggerTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p1, Lcom/xuexiang/xui/widget/textview/LoggerTextView$DefaultLogFormatter;

    invoke-direct {p1}, Lcom/xuexiang/xui/widget/textview/LoggerTextView$DefaultLogFormatter;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->mLogFormatter:Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogFormatter;

    .line 5
    new-instance p1, Lcom/xuexiang/xui/widget/textview/LoggerTextView$DefaultLogDecorator;

    invoke-direct {p1}, Lcom/xuexiang/xui/widget/textview/LoggerTextView$DefaultLogDecorator;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->mLogDecorator:Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogDecorator;

    .line 6
    new-instance p1, Landroid/text/method/ScrollingMovementMethod;

    invoke-direct {p1}, Landroid/text/method/ScrollingMovementMethod;-><init>()V

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/textview/LoggerTextView;Landroid/text/SpannableString;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->appendLog(Landroid/text/SpannableString;)V

    return-void
.end method

.method private appendLog(Landroid/text/SpannableString;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    const-string p1, "\r\n"

    .line 2
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->scrollToEnd()V

    return-void
.end method

.method private appendLogInMainThread(Landroid/text/SpannableString;)V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->appendLog(Landroid/text/SpannableString;)V

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Lcom/xuexiang/xui/widget/textview/LoggerTextView$1;

    invoke-direct {v0, p0, p1}, Lcom/xuexiang/xui/widget/textview/LoggerTextView$1;-><init>(Lcom/xuexiang/xui/widget/textview/LoggerTextView;Landroid/text/SpannableString;)V

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method

.method private getTextRealHeight()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/widget/TextView;->getLineCount()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineTop(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method private scrollToEnd()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->getTextRealHeight()I

    move-result v0

    .line 2
    invoke-virtual {p0}, Landroid/widget/TextView;->getHeight()I

    move-result v1

    if-le v0, v1, :cond_0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0}, Landroid/widget/TextView;->getHeight()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p0, v1, v0}, Landroid/widget/TextView;->scrollTo(II)V

    :cond_0
    return-void
.end method


# virtual methods
.method public addLog(Ljava/lang/String;Lcom/xuexiang/xui/widget/textview/LoggerTextView$LogType;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->getLogDecorator()Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogDecorator;

    move-result-object v0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->getLogFormatter()Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogFormatter;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogFormatter;->format(Ljava/lang/String;Lcom/xuexiang/xui/widget/textview/LoggerTextView$LogType;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogDecorator;->decorate(Ljava/lang/String;Lcom/xuexiang/xui/widget/textview/LoggerTextView$LogType;)Landroid/text/SpannableString;

    move-result-object p1

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->appendLogInMainThread(Landroid/text/SpannableString;)V

    return-void
.end method

.method public clearLog()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const-string v0, ""

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0, v0}, Landroid/widget/TextView;->scrollTo(II)V

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Lcom/xuexiang/xui/widget/textview/LoggerTextView$2;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/textview/LoggerTextView$2;-><init>(Lcom/xuexiang/xui/widget/textview/LoggerTextView;)V

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method

.method public getLogDecorator()Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogDecorator;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->mLogDecorator:Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogDecorator;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/textview/LoggerTextView$DefaultLogDecorator;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/textview/LoggerTextView$DefaultLogDecorator;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->mLogDecorator:Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogDecorator;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->mLogDecorator:Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogDecorator;

    return-object v0
.end method

.method public getLogFormatter()Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogFormatter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->mLogFormatter:Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogFormatter;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/textview/LoggerTextView$DefaultLogFormatter;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/textview/LoggerTextView$DefaultLogFormatter;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->mLogFormatter:Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogFormatter;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->mLogFormatter:Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogFormatter;

    return-object v0
.end method

.method public logCustom(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/xuexiang/xui/widget/textview/LoggerTextView$LogType;->CUSTOM:Lcom/xuexiang/xui/widget/textview/LoggerTextView$LogType;

    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->addLog(Ljava/lang/String;Lcom/xuexiang/xui/widget/textview/LoggerTextView$LogType;)V

    return-void
.end method

.method public logError(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/xuexiang/xui/widget/textview/LoggerTextView$LogType;->ERROR:Lcom/xuexiang/xui/widget/textview/LoggerTextView$LogType;

    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->addLog(Ljava/lang/String;Lcom/xuexiang/xui/widget/textview/LoggerTextView$LogType;)V

    return-void
.end method

.method public logNormal(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/xuexiang/xui/widget/textview/LoggerTextView$LogType;->NORMAL:Lcom/xuexiang/xui/widget/textview/LoggerTextView$LogType;

    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->addLog(Ljava/lang/String;Lcom/xuexiang/xui/widget/textview/LoggerTextView$LogType;)V

    return-void
.end method

.method public logSuccess(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/xuexiang/xui/widget/textview/LoggerTextView$LogType;->SUCCESS:Lcom/xuexiang/xui/widget/textview/LoggerTextView$LogType;

    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->addLog(Ljava/lang/String;Lcom/xuexiang/xui/widget/textview/LoggerTextView$LogType;)V

    return-void
.end method

.method public logWarning(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/xuexiang/xui/widget/textview/LoggerTextView$LogType;->WARNING:Lcom/xuexiang/xui/widget/textview/LoggerTextView$LogType;

    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->addLog(Ljava/lang/String;Lcom/xuexiang/xui/widget/textview/LoggerTextView$LogType;)V

    return-void
.end method

.method public setLogDecorator(Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogDecorator;)Lcom/xuexiang/xui/widget/textview/LoggerTextView;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->mLogDecorator:Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogDecorator;

    return-object p0
.end method

.method public setLogFormatter(Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogFormatter;)Lcom/xuexiang/xui/widget/textview/LoggerTextView;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/LoggerTextView;->mLogFormatter:Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogFormatter;

    return-object p0
.end method

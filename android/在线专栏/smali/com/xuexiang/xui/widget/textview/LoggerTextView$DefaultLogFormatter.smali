.class public Lcom/xuexiang/xui/widget/textview/LoggerTextView$DefaultLogFormatter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/textview/LoggerTextView$ILogFormatter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/textview/LoggerTextView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DefaultLogFormatter"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public format(Ljava/lang/String;Lcom/xuexiang/xui/widget/textview/LoggerTextView$LogType;)Ljava/lang/String;
    .locals 0

    return-object p1
.end method

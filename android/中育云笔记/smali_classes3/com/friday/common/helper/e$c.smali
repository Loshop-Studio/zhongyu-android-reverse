.class public final Lcom/friday/common/helper/e$c;
.super Landroid/os/CountDownTimer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/helper/e;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/common/helper/e;


# direct methods
.method public constructor <init>(Lcom/friday/common/helper/e;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lcom/friday/common/helper/e$c;->a:Lcom/friday/common/helper/e;

    .line 2
    .line 3
    const-wide/16 v0, 0xbb8

    .line 4
    .line 5
    const-wide/16 v2, 0x3e8

    .line 6
    .line 7
    invoke-direct {p0, v0, v1, v2, v3}, Landroid/os/CountDownTimer;-><init>(JJ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/common/helper/e$c;->a:Lcom/friday/common/helper/e;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/friday/common/helper/e;->e(Lcom/friday/common/helper/e;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x14

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const-string v0, "\u7f51\u7edc\u4e0d\u4f73\uff0c\u8bf7\u91cd\u542f\u5e73\u677f\u7684wifi\u540e\u518d\u8bd5"

    .line 12
    .line 13
    invoke-static {v0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/os/CountDownTimer;->cancel()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public onTick(J)V
    .locals 0

    return-void
.end method

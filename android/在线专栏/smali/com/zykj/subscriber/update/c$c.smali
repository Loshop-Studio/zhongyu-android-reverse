.class Lcom/zykj/subscriber/update/c$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "HandlerLeak"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/subscriber/update/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field private a:Lcom/zykj/subscriber/update/c$d;

.field private b:I

.field final synthetic c:Lcom/zykj/subscriber/update/c;


# direct methods
.method public constructor <init>(Lcom/zykj/subscriber/update/c;Lcom/zykj/subscriber/update/c$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/subscriber/update/c$c;->c:Lcom/zykj/subscriber/update/c;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/zykj/subscriber/update/c$c;->a:Lcom/zykj/subscriber/update/c$d;

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/zykj/subscriber/update/c$c;->b:I

    goto :goto_0

    .line 3
    :cond_1
    iget v0, p0, Lcom/zykj/subscriber/update/c$c;->b:I

    if-lez v0, :cond_3

    .line 4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 5
    iget-object v0, p0, Lcom/zykj/subscriber/update/c$c;->a:Lcom/zykj/subscriber/update/c$d;

    int-to-float p1, p1

    iget v1, p0, Lcom/zykj/subscriber/update/c$c;->b:I

    int-to-float v1, v1

    div-float/2addr p1, v1

    invoke-interface {v0, p1}, Lcom/zykj/subscriber/update/c$d;->a(F)V

    goto :goto_0

    .line 6
    :cond_2
    iget-object p1, p0, Lcom/zykj/subscriber/update/c$c;->c:Lcom/zykj/subscriber/update/c;

    invoke-static {p1}, Lcom/zykj/subscriber/update/c;->c(Lcom/zykj/subscriber/update/c;)Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f0f003c

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_3
    :goto_0
    return-void
.end method

.class public Lb/d/b/i/f$a;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "HandlerLeak"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/d/b/i/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:Lb/d/b/i/f$b;

.field public b:I

.field public final synthetic c:Lb/d/b/i/f;


# direct methods
.method public constructor <init>(Lb/d/b/i/f;Lb/d/b/i/f$b;)V
    .locals 0

    iput-object p1, p0, Lb/d/b/i/f$a;->c:Lb/d/b/i/f;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    iput-object p2, p0, Lb/d/b/i/f$a;->a:Lb/d/b/i/f$b;

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lb/d/b/i/f$a;->b:I

    goto :goto_0

    :cond_1
    iget v0, p0, Lb/d/b/i/f$a;->b:I

    if-lez v0, :cond_3

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lb/d/b/i/f$a;->a:Lb/d/b/i/f$b;

    int-to-float p1, p1

    iget v1, p0, Lb/d/b/i/f$a;->b:I

    int-to-float v1, v1

    div-float/2addr p1, v1

    check-cast v0, Lb/d/b/i/a;

    .line 1
    iget-object v0, v0, Lb/d/b/i/a;->a:Lcom/zykj/satisfaction/update/PercentCircleView;

    invoke-virtual {v0, p1}, Lcom/zykj/satisfaction/update/PercentCircleView;->setTargetPercent(F)V

    goto :goto_0

    .line 2
    :cond_2
    iget-object p1, p0, Lb/d/b/i/f$a;->c:Lb/d/b/i/f;

    .line 3
    iget-object p1, p1, Lb/d/b/i/f;->a:Landroid/content/Context;

    const v0, 0x7f0f002b

    const/4 v1, 0x0

    .line 4
    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_3
    :goto_0
    return-void
.end method

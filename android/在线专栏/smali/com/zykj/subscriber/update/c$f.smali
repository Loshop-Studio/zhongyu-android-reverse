.class Lcom/zykj/subscriber/update/c$f;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/subscriber/update/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "f"
.end annotation


# instance fields
.field private a:Lcom/zykj/subscriber/update/c$e;


# direct methods
.method public constructor <init>(Lcom/zykj/subscriber/update/c$e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/zykj/subscriber/update/c$f;->a:Lcom/zykj/subscriber/update/c$e;

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 3
    iget-object v0, p0, Lcom/zykj/subscriber/update/c$f;->a:Lcom/zykj/subscriber/update/c$e;

    invoke-interface {v0, p1}, Lcom/zykj/subscriber/update/c$e;->a(Z)V

    :cond_0
    return-void
.end method

.class public final synthetic Lf2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic c:Lcom/friday/common/helper/e;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/helper/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf2/l;->c:Lcom/friday/common/helper/e;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lf2/l;->c:Lcom/friday/common/helper/e;

    invoke-static {v0, p1}, Lcom/friday/common/helper/e;->a(Lcom/friday/common/helper/e;Landroid/os/Message;)Z

    move-result p1

    return p1
.end method

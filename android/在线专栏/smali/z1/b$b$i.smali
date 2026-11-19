.class final Lz1/b$b$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz1/b$b;-><init>(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz1/b$b;


# direct methods
.method constructor <init>(Lz1/b$b;)V
    .locals 0

    iput-object p1, p0, Lz1/b$b$i;->a:Lz1/b$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 2

    .line 1
    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lz1/b$b$i;->a:Lz1/b$b;

    invoke-static {p1}, Lz1/b$b;->m(Lz1/b$b;)Landroid/app/Application;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lz1/b$b;->u(Landroid/content/Context;Z)V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

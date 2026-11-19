.class public final synthetic Lx3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;

.field public final synthetic b:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx3/q;->a:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;

    iput-object p2, p0, Lx3/q;->b:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx3/q;->a:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;

    iget-object v1, p0, Lx3/q;->b:Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;

    invoke-static {v0, v1}, Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;->a(Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;)V

    return-void
.end method

.class public final synthetic Lcom/zykj/sketch/core/graph/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/sketch/core/graph/WebViewGraph;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/sketch/core/graph/WebViewGraph;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/sketch/core/graph/a;->a:I

    iput-object p1, p0, Lcom/zykj/sketch/core/graph/a;->b:Lcom/zykj/sketch/core/graph/WebViewGraph;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/core/graph/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/sketch/core/graph/a;->b:Lcom/zykj/sketch/core/graph/WebViewGraph;

    invoke-static {v0}, Lcom/zykj/sketch/core/graph/WebViewGraph;->c(Lcom/zykj/sketch/core/graph/WebViewGraph;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/a;->b:Lcom/zykj/sketch/core/graph/WebViewGraph;

    invoke-static {v0}, Lcom/zykj/sketch/core/graph/WebViewGraph;->b(Lcom/zykj/sketch/core/graph/WebViewGraph;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/a;->b:Lcom/zykj/sketch/core/graph/WebViewGraph;

    invoke-static {v0}, Lcom/zykj/sketch/core/graph/WebViewGraph;->a(Lcom/zykj/sketch/core/graph/WebViewGraph;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

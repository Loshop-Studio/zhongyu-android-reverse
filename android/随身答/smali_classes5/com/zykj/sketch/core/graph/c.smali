.class public final synthetic Lcom/zykj/sketch/core/graph/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/sketch/core/graph/WebViewGraph;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/sketch/core/graph/WebViewGraph;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/sketch/core/graph/c;->a:Lcom/zykj/sketch/core/graph/WebViewGraph;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/c;->a:Lcom/zykj/sketch/core/graph/WebViewGraph;

    invoke-static {v0}, Lcom/zykj/sketch/core/graph/WebViewGraph;->c(Lcom/zykj/sketch/core/graph/WebViewGraph;)V

    return-void
.end method

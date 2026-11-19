.class public final synthetic Ly3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx7/l;

.field public final synthetic b:Lcom/zykj/merge/sketch/view/OldSketchProxyView;


# direct methods
.method public synthetic constructor <init>(Lx7/l;Lcom/zykj/merge/sketch/view/OldSketchProxyView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly3/i;->a:Lx7/l;

    iput-object p2, p0, Ly3/i;->b:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly3/i;->a:Lx7/l;

    iget-object v1, p0, Ly3/i;->b:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    invoke-static {v0, v1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->j(Lx7/l;Lcom/zykj/merge/sketch/view/OldSketchProxyView;)V

    return-void
.end method

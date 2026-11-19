.class public final synthetic Lcom/zykj/merge/sketch/view/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

.field public final synthetic d:Lhd/l;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/merge/sketch/view/m;->c:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    iput-object p2, p0, Lcom/zykj/merge/sketch/view/m;->d:Lhd/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/m;->c:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    iget-object v1, p0, Lcom/zykj/merge/sketch/view/m;->d:Lhd/l;

    invoke-static {v0, v1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->a(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lhd/l;)V

    return-void
.end method

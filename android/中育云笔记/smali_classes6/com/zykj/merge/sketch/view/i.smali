.class public final synthetic Lcom/zykj/merge/sketch/view/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

.field public final synthetic d:I

.field public final synthetic e:Lhd/l;

.field public final synthetic f:Lhd/l;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;ILhd/l;Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/merge/sketch/view/i;->c:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    iput p2, p0, Lcom/zykj/merge/sketch/view/i;->d:I

    iput-object p3, p0, Lcom/zykj/merge/sketch/view/i;->e:Lhd/l;

    iput-object p4, p0, Lcom/zykj/merge/sketch/view/i;->f:Lhd/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/i;->c:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    iget v1, p0, Lcom/zykj/merge/sketch/view/i;->d:I

    iget-object v2, p0, Lcom/zykj/merge/sketch/view/i;->e:Lhd/l;

    iget-object v3, p0, Lcom/zykj/merge/sketch/view/i;->f:Lhd/l;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->e(Lcom/zykj/merge/sketch/view/OldSketchProxyView;ILhd/l;Lhd/l;)V

    return-void
.end method

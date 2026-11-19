.class public final synthetic Lcom/zykj/merge/sketch/view/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

.field public final synthetic d:Lhd/l;

.field public final synthetic e:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lhd/l;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/merge/sketch/view/k;->c:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    iput-object p2, p0, Lcom/zykj/merge/sketch/view/k;->d:Lhd/l;

    iput-object p3, p0, Lcom/zykj/merge/sketch/view/k;->e:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/k;->c:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    iget-object v1, p0, Lcom/zykj/merge/sketch/view/k;->d:Lhd/l;

    iget-object v2, p0, Lcom/zykj/merge/sketch/view/k;->e:Ljava/lang/Exception;

    invoke-static {v0, v1, v2}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->h(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lhd/l;Ljava/lang/Exception;)V

    return-void
.end method

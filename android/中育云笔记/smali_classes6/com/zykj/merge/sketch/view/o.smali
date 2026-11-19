.class public final synthetic Lcom/zykj/merge/sketch/view/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lhd/l;

.field public final synthetic d:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lhd/l;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/merge/sketch/view/o;->c:Lhd/l;

    iput-object p2, p0, Lcom/zykj/merge/sketch/view/o;->d:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/o;->c:Lhd/l;

    iget-object v1, p0, Lcom/zykj/merge/sketch/view/o;->d:Ljava/lang/Exception;

    invoke-static {v0, v1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->j(Lhd/l;Ljava/lang/Exception;)V

    return-void
.end method

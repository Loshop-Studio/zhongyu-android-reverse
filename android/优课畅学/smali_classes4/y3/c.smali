.class public final synthetic Ly3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

.field public final synthetic b:I

.field public final synthetic c:Lx7/l;

.field public final synthetic d:Lx7/l;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;ILx7/l;Lx7/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly3/c;->a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    iput p2, p0, Ly3/c;->b:I

    iput-object p3, p0, Ly3/c;->c:Lx7/l;

    iput-object p4, p0, Ly3/c;->d:Lx7/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Ly3/c;->a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    iget v1, p0, Ly3/c;->b:I

    iget-object v2, p0, Ly3/c;->c:Lx7/l;

    iget-object v3, p0, Ly3/c;->d:Lx7/l;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->h(Lcom/zykj/merge/sketch/view/OldSketchProxyView;ILx7/l;Lx7/l;)V

    return-void
.end method

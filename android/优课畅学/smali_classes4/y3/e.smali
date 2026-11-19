.class public final synthetic Ly3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

.field public final synthetic b:Lx7/l;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lx7/l;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly3/e;->a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    iput-object p2, p0, Ly3/e;->b:Lx7/l;

    iput p3, p0, Ly3/e;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Ly3/e;->a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    iget-object v1, p0, Ly3/e;->b:Lx7/l;

    iget v2, p0, Ly3/e;->c:I

    invoke-static {v0, v1, v2}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->f(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lx7/l;I)V

    return-void
.end method

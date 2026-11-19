.class public final synthetic Lcom/zykj/merge/sketch/view/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

.field public final synthetic c:Lr6/c;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lcom/zykj/merge/sketch/view/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/zykj/merge/sketch/view/e;->c:Lr6/c;

    iput-object p1, p0, Lcom/zykj/merge/sketch/view/e;->b:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;I)V
    .locals 0

    .line 2
    iput p3, p0, Lcom/zykj/merge/sketch/view/e;->a:I

    iput-object p1, p0, Lcom/zykj/merge/sketch/view/e;->b:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    iput-object p2, p0, Lcom/zykj/merge/sketch/view/e;->c:Lr6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/merge/sketch/view/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/merge/sketch/view/e;->b:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    iget-object v1, p0, Lcom/zykj/merge/sketch/view/e;->c:Lr6/c;

    invoke-static {v0, v1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->a(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/e;->b:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    iget-object v1, p0, Lcom/zykj/merge/sketch/view/e;->c:Lr6/c;

    invoke-static {v0, v1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->f(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/e;->c:Lr6/c;

    iget-object v1, p0, Lcom/zykj/merge/sketch/view/e;->b:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    invoke-static {v1, v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->g(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

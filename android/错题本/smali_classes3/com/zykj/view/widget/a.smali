.class public final synthetic Lcom/zykj/view/widget/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/widget/SketchProgressView;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/widget/SketchProgressView;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/view/widget/a;->a:I

    iput-object p1, p0, Lcom/zykj/view/widget/a;->b:Lcom/zykj/view/widget/SketchProgressView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/view/widget/a;->b:Lcom/zykj/view/widget/SketchProgressView;

    invoke-static {v0}, Lcom/zykj/view/widget/SketchProgressView$showView$1;->e(Lcom/zykj/view/widget/SketchProgressView;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/view/widget/a;->b:Lcom/zykj/view/widget/SketchProgressView;

    invoke-static {v0}, Lcom/zykj/view/widget/SketchProgressView$hideView$1;->e(Lcom/zykj/view/widget/SketchProgressView;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

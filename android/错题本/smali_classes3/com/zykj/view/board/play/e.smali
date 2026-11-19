.class public final synthetic Lcom/zykj/view/board/play/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/board/play/SketchPlayFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/view/board/play/e;->a:I

    iput-object p1, p0, Lcom/zykj/view/board/play/e;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/view/board/play/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/view/board/play/e;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    check-cast p1, Lcom/zykj/view/board/play/SpeedRate;

    invoke-static {v0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->l(Lcom/zykj/view/board/play/SketchPlayFragment;Lcom/zykj/view/board/play/SpeedRate;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iget-object p1, p0, Lcom/zykj/view/board/play/e;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    invoke-static {p1, v0, v1}, Lcom/zykj/view/board/play/SketchPlayFragment;->o(Lcom/zykj/view/board/play/SketchPlayFragment;D)Ld6/s;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

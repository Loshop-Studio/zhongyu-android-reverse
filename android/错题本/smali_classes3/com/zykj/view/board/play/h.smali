.class public final synthetic Lcom/zykj/view/board/play/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Lcom/zykj/view/board/play/SketchPlayFragment;

.field public final synthetic d:Ld6/d;


# direct methods
.method public synthetic constructor <init>(ZLcom/zykj/view/board/play/SketchPlayFragment;Ld6/d;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/zykj/view/board/play/h;->a:I

    iput-boolean p1, p0, Lcom/zykj/view/board/play/h;->b:Z

    iput-object p2, p0, Lcom/zykj/view/board/play/h;->c:Lcom/zykj/view/board/play/SketchPlayFragment;

    iput-object p3, p0, Lcom/zykj/view/board/play/h;->d:Ld6/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/view/board/play/h;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/view/board/play/h;->d:Ld6/d;

    check-cast v0, Lr6/a;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-boolean v1, p0, Lcom/zykj/view/board/play/h;->b:Z

    iget-object v2, p0, Lcom/zykj/view/board/play/h;->c:Lcom/zykj/view/board/play/SketchPlayFragment;

    invoke-static {v1, v2, v0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->e(ZLcom/zykj/view/board/play/SketchPlayFragment;Lr6/a;I)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/view/board/play/h;->d:Ld6/d;

    check-cast v0, Lr6/c;

    check-cast p1, Ljava/lang/Throwable;

    iget-boolean v1, p0, Lcom/zykj/view/board/play/h;->b:Z

    iget-object v2, p0, Lcom/zykj/view/board/play/h;->c:Lcom/zykj/view/board/play/SketchPlayFragment;

    invoke-static {v1, v2, v0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->e(ZLcom/zykj/view/board/play/SketchPlayFragment;Lr6/c;Ljava/lang/Throwable;)Ld6/s;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

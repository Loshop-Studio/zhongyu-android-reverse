.class public final synthetic Lcom/zykj/view/board/crop/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Landroidx/fragment/app/Fragment;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/Fragment;JI)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/zykj/view/board/crop/f;->a:I

    iput-object p1, p0, Lcom/zykj/view/board/crop/f;->c:Landroidx/fragment/app/Fragment;

    iput-wide p2, p0, Lcom/zykj/view/board/crop/f;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/view/board/crop/f;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/view/board/crop/f;->c:Landroidx/fragment/app/Fragment;

    check-cast v0, Lcom/zykj/view/board/play/SketchPlayFragment;

    iget-wide v1, p0, Lcom/zykj/view/board/crop/f;->b:J

    invoke-static {v0, v1, v2}, Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;->d(Lcom/zykj/view/board/play/SketchPlayFragment;J)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/view/board/crop/f;->c:Landroidx/fragment/app/Fragment;

    check-cast v0, Lcom/zykj/view/board/crop/BlackboardCropFragment;

    iget-wide v1, p0, Lcom/zykj/view/board/crop/f;->b:J

    invoke-static {v0, v1, v2}, Lcom/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1;->b(Lcom/zykj/view/board/crop/BlackboardCropFragment;J)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

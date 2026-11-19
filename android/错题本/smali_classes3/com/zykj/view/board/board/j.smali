.class public final synthetic Lcom/zykj/view/board/board/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/databinding/ViewDataBinding;


# direct methods
.method public synthetic constructor <init>(Landroidx/databinding/ViewDataBinding;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/view/board/board/j;->a:I

    iput-object p1, p0, Lcom/zykj/view/board/board/j;->b:Landroidx/databinding/ViewDataBinding;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/j;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/view/board/board/j;->b:Landroidx/databinding/ViewDataBinding;

    check-cast v0, Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    invoke-static {v0}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$4$1$1$1;->e(Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;)Ld6/s;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/view/board/board/j;->b:Landroidx/databinding/ViewDataBinding;

    check-cast v0, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    invoke-static {v0}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$1;->e(Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;)Ld6/s;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

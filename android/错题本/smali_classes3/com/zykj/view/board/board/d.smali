.class public final synthetic Lcom/zykj/view/board/board/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/board/board/BoardFragment;

.field public final synthetic c:Landroidx/databinding/ViewDataBinding;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardFragment;Landroidx/databinding/ViewDataBinding;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/zykj/view/board/board/d;->a:I

    iput-object p1, p0, Lcom/zykj/view/board/board/d;->b:Lcom/zykj/view/board/board/BoardFragment;

    iput-object p2, p0, Lcom/zykj/view/board/board/d;->c:Landroidx/databinding/ViewDataBinding;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/d;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/view/board/board/d;->c:Landroidx/databinding/ViewDataBinding;

    check-cast v0, Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    iget-object v1, p0, Lcom/zykj/view/board/board/d;->b:Lcom/zykj/view/board/board/BoardFragment;

    invoke-static {v1, v0, p1}, Lcom/zykj/view/board/board/BoardFragment;->Y(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/view/board/board/d;->c:Landroidx/databinding/ViewDataBinding;

    check-cast v0, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    iget-object v1, p0, Lcom/zykj/view/board/board/d;->b:Lcom/zykj/view/board/board/BoardFragment;

    invoke-static {v1, v0, p1}, Lcom/zykj/view/board/board/BoardFragment;->D(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroid/view/View;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/zykj/view/board/board/d;->c:Landroidx/databinding/ViewDataBinding;

    check-cast v0, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    iget-object v1, p0, Lcom/zykj/view/board/board/d;->b:Lcom/zykj/view/board/board/BoardFragment;

    invoke-static {v1, v0, p1}, Lcom/zykj/view/board/board/BoardFragment;->x(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroid/view/View;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lcom/zykj/view/board/board/d;->c:Landroidx/databinding/ViewDataBinding;

    check-cast v0, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    iget-object v1, p0, Lcom/zykj/view/board/board/d;->b:Lcom/zykj/view/board/board/BoardFragment;

    invoke-static {v1, v0, p1}, Lcom/zykj/view/board/board/BoardFragment;->O(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

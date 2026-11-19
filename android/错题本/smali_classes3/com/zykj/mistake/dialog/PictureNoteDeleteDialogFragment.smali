.class public final Lcom/zykj/mistake/dialog/PictureNoteDeleteDialogFragment;
.super Lcom/zykj/mistake/dialog/BaseDialogFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/mistake/dialog/BaseDialogFragment<",
        "Lcom/zykj/mistake/databinding/DialogFragmentPictureNoteDeleteBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/zykj/mistake/dialog/PictureNoteDeleteDialogFragment;",
        "Lcom/zykj/mistake/dialog/BaseDialogFragment;",
        "Lcom/zykj/mistake/databinding/DialogFragmentPictureNoteDeleteBinding;",
        "<init>",
        "()V",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public c:Lr6/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final e()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/mistake/R$drawable;->bg_top_year:I

    .line 2
    .line 3
    return v0
.end method

.method public final f()I
    .locals 1

    .line 1
    const/4 v0, -0x2

    return v0
.end method

.method public final g()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/mistake/R$layout;->dialog_fragment_picture_note_delete:I

    .line 2
    .line 3
    return v0
.end method

.method public final h()I
    .locals 1

    .line 1
    const/4 v0, -0x2

    return v0
.end method

.method public final j(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/mistake/databinding/DialogFragmentPictureNoteDeleteBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogFragmentPictureNoteDeleteBinding;->a:Landroid/widget/TextView;

    .line 8
    .line 9
    new-instance v0, Ll4/j;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, p0, v1}, Ll4/j;-><init>(Lcom/zykj/mistake/dialog/PictureNoteDeleteDialogFragment;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lcom/zykj/mistake/databinding/DialogFragmentPictureNoteDeleteBinding;

    .line 23
    .line 24
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogFragmentPictureNoteDeleteBinding;->b:Landroid/widget/TextView;

    .line 25
    .line 26
    new-instance v0, Ll4/j;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, v1}, Ll4/j;-><init>(Lcom/zykj/mistake/dialog/PictureNoteDeleteDialogFragment;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

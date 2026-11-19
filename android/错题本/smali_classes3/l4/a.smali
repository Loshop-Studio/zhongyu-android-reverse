.class public final Ll4/a;
.super Ls0/g;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lcom/zykj/mistake/dialog/AnswerDialogFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/dialog/AnswerDialogFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll4/a;->b:Lcom/zykj/mistake/dialog/AnswerDialogFragment;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    iget-object v0, p0, Ll4/a;->b:Lcom/zykj/mistake/dialog/AnswerDialogFragment;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/zykj/mistake/databinding/DialogFragmentAnswerBinding;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/zykj/mistake/databinding/DialogFragmentAnswerBinding;->c:Lcom/zykj/mistake/widget/IntrinsicWidthImageView;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

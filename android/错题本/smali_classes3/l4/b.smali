.class public final Ll4/b;
.super Ls0/c;
.source "SourceFile"


# instance fields
.field public final synthetic d:Lcom/zykj/mistake/dialog/AnswerDialogFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/dialog/AnswerDialogFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll4/b;->d:Lcom/zykj/mistake/dialog/AnswerDialogFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ls0/c;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Landroid/graphics/Bitmap;

    .line 2
    .line 3
    iget-object v0, p0, Ll4/b;->d:Lcom/zykj/mistake/dialog/AnswerDialogFragment;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lcom/zykj/mistake/databinding/DialogFragmentAnswerBinding;

    .line 10
    .line 11
    iget-object v1, v1, Lcom/zykj/mistake/databinding/DialogFragmentAnswerBinding;->b:Lcom/zykj/mistake/widget/IntrinsicWidthImageView;

    .line 12
    .line 13
    iget-object v2, v0, Lcom/zykj/mistake/dialog/AnswerDialogFragment;->c:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v2, 0x0

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    const/4 v2, 0x1

    .line 27
    :goto_1
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/widget/IntrinsicWidthImageView;->setForceOrigin(Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lcom/zykj/mistake/databinding/DialogFragmentAnswerBinding;

    .line 35
    .line 36
    iget-object v1, v1, Lcom/zykj/mistake/databinding/DialogFragmentAnswerBinding;->b:Lcom/zykj/mistake/widget/IntrinsicWidthImageView;

    .line 37
    .line 38
    iget-boolean v0, v0, Lcom/zykj/mistake/dialog/AnswerDialogFragment;->e:Z

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-static {p1}, Lcom/zykj/mistake/utils/d;->g(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :cond_2
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final f(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    return-void
.end method

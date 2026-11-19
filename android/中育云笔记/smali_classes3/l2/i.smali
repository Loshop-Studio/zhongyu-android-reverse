.class public final synthetic Ll2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/common/databinding/DialogWithEditTextBinding;

.field public final synthetic d:Lhd/l;

.field public final synthetic e:Landroid/app/Dialog;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/databinding/DialogWithEditTextBinding;Lhd/l;Landroid/app/Dialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll2/i;->c:Lcom/friday/common/databinding/DialogWithEditTextBinding;

    iput-object p2, p0, Ll2/i;->d:Lhd/l;

    iput-object p3, p0, Ll2/i;->e:Landroid/app/Dialog;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ll2/i;->c:Lcom/friday/common/databinding/DialogWithEditTextBinding;

    iget-object v1, p0, Ll2/i;->d:Lhd/l;

    iget-object v2, p0, Ll2/i;->e:Landroid/app/Dialog;

    invoke-static {v0, v1, v2, p1}, Lcom/friday/common/widget/dialog/a;->o(Lcom/friday/common/databinding/DialogWithEditTextBinding;Lhd/l;Landroid/app/Dialog;Landroid/view/View;)V

    return-void
.end method

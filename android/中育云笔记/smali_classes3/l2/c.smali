.class public final synthetic Ll2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/common/databinding/DialogWithEditTextBinding;

.field public final synthetic d:Landroid/app/Dialog;

.field public final synthetic e:Lhd/l;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/databinding/DialogWithEditTextBinding;Landroid/app/Dialog;Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll2/c;->c:Lcom/friday/common/databinding/DialogWithEditTextBinding;

    iput-object p2, p0, Ll2/c;->d:Landroid/app/Dialog;

    iput-object p3, p0, Ll2/c;->e:Lhd/l;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ll2/c;->c:Lcom/friday/common/databinding/DialogWithEditTextBinding;

    iget-object v1, p0, Ll2/c;->d:Landroid/app/Dialog;

    iget-object v2, p0, Ll2/c;->e:Lhd/l;

    invoke-static {v0, v1, v2, p1}, Lcom/friday/common/widget/dialog/a;->l(Lcom/friday/common/databinding/DialogWithEditTextBinding;Landroid/app/Dialog;Lhd/l;Landroid/view/View;)V

    return-void
.end method

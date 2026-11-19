.class public final synthetic Ll2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lhd/a;

.field public final synthetic d:Landroid/app/Dialog;


# direct methods
.method public synthetic constructor <init>(Lhd/a;Landroid/app/Dialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll2/p;->c:Lhd/a;

    iput-object p2, p0, Ll2/p;->d:Landroid/app/Dialog;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ll2/p;->c:Lhd/a;

    iget-object v1, p0, Ll2/p;->d:Landroid/app/Dialog;

    invoke-static {v0, v1, p1}, Lcom/friday/common/widget/dialog/a;->k(Lhd/a;Landroid/app/Dialog;Landroid/view/View;)V

    return-void
.end method

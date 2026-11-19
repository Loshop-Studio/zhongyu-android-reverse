.class public final synthetic Ll2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/common/widget/dialog/FBIWarningDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/widget/dialog/FBIWarningDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll2/s;->c:Lcom/friday/common/widget/dialog/FBIWarningDialog;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll2/s;->c:Lcom/friday/common/widget/dialog/FBIWarningDialog;

    invoke-static {v0, p1}, Lcom/friday/common/widget/dialog/FBIWarningDialog;->o(Lcom/friday/common/widget/dialog/FBIWarningDialog;Landroid/view/View;)V

    return-void
.end method

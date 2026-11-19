.class public final synthetic Lh7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh7/c;->a:Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh7/c;->a:Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;

    invoke-static {v0, p1}, Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;->c(Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;Landroid/view/View;)V

    return-void
.end method

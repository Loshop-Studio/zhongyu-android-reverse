.class public abstract Lcom/friday/common/base/SimpleFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"

# interfaces
.implements Lcom/friday/common/base/IView;
.implements Lcom/friday/common/base/b;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final e:I = 0x8


# instance fields
.field public d:Lcom/friday/common/widget/dialog/BaseDialog;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final o()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/friday/common/base/SimpleFragment;->d:Lcom/friday/common/widget/dialog/BaseDialog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    :catch_0
    :cond_0
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/friday/common/base/b;->onClick(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/common/base/SimpleFragment;->o()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

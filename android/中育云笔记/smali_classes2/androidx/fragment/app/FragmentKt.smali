.class public final Landroidx/fragment/app/FragmentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lhd/p;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/fragment/app/FragmentKt;->setFragmentResultListener$lambda$0(Lhd/p;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public static final clearFragmentResult(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager;->clearFragmentResult(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final clearFragmentResultListener(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager;->clearFragmentResultListener(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final setFragmentResult(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/FragmentManager;->setFragmentResult(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final setFragmentResultListener(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lhd/p;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/Fragment;",
            "Ljava/lang/String;",
            "Lhd/p;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroidx/fragment/app/p;

    .line 6
    .line 7
    invoke-direct {v1, p2}, Landroidx/fragment/app/p;-><init>(Lhd/p;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, p0, v1}, Landroidx/fragment/app/FragmentManager;->setFragmentResultListener(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/fragment/app/FragmentResultListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private static final setFragmentResultListener$lambda$0(Lhd/p;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1, p2}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

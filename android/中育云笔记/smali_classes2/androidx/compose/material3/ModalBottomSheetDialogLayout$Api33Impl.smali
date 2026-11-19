.class final Landroidx/compose/material3/ModalBottomSheetDialogLayout$Api33Impl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x21
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/material3/ModalBottomSheetDialogLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Api33Impl"
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/material3/ModalBottomSheetDialogLayout$Api33Impl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/material3/ModalBottomSheetDialogLayout$Api33Impl;

    invoke-direct {v0}, Landroidx/compose/material3/ModalBottomSheetDialogLayout$Api33Impl;-><init>()V

    sput-object v0, Landroidx/compose/material3/ModalBottomSheetDialogLayout$Api33Impl;->INSTANCE:Landroidx/compose/material3/ModalBottomSheetDialogLayout$Api33Impl;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Lhd/a;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/material3/ModalBottomSheetDialogLayout$Api33Impl;->createBackCallback$lambda$0(Lhd/a;)V

    return-void
.end method

.method public static final createBackCallback(Lhd/a;)Landroid/window/OnBackInvokedCallback;
    .locals 1
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/a;",
            ")",
            "Landroid/window/OnBackInvokedCallback;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/material3/d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/compose/material3/d;-><init>(Lhd/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final createBackCallback$lambda$0(Lhd/a;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final maybeRegisterBackCallback(Landroid/view/View;Ljava/lang/Object;)V
    .locals 1
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .line 1
    instance-of v0, p1, Landroid/window/OnBackInvokedCallback;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->findOnBackInvokedDispatcher()Landroid/window/OnBackInvokedDispatcher;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    check-cast p1, Landroid/window/OnBackInvokedCallback;

    .line 13
    .line 14
    invoke-interface {p0, v0, p1}, Landroid/window/OnBackInvokedDispatcher;->registerOnBackInvokedCallback(ILandroid/window/OnBackInvokedCallback;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public static final maybeUnregisterBackCallback(Landroid/view/View;Ljava/lang/Object;)V
    .locals 1
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .line 1
    instance-of v0, p1, Landroid/window/OnBackInvokedCallback;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->findOnBackInvokedDispatcher()Landroid/window/OnBackInvokedDispatcher;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    check-cast p1, Landroid/window/OnBackInvokedCallback;

    .line 12
    .line 13
    invoke-interface {p0, p1}, Landroid/window/OnBackInvokedDispatcher;->unregisterOnBackInvokedCallback(Landroid/window/OnBackInvokedCallback;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

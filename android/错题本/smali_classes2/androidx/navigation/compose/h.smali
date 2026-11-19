.class public final synthetic Landroidx/navigation/compose/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/runtime/saveable/SaverScope;

    check-cast p2, Landroidx/navigation/NavHostController;

    invoke-static {p1, p2}, Landroidx/navigation/compose/NavHostControllerKt__NavHostController_androidKt;->c(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/navigation/NavHostController;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

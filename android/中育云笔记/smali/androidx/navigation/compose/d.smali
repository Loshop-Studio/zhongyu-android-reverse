.class public final synthetic Landroidx/navigation/compose/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Landroidx/navigation/compose/DialogNavigator;

.field public final synthetic d:Landroidx/navigation/NavBackStackEntry;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/compose/DialogNavigator;Landroidx/navigation/NavBackStackEntry;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/d;->c:Landroidx/navigation/compose/DialogNavigator;

    iput-object p2, p0, Landroidx/navigation/compose/d;->d:Landroidx/navigation/NavBackStackEntry;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/d;->c:Landroidx/navigation/compose/DialogNavigator;

    iget-object v1, p0, Landroidx/navigation/compose/d;->d:Landroidx/navigation/NavBackStackEntry;

    invoke-static {v0, v1}, Landroidx/navigation/compose/DialogHostKt;->d(Landroidx/navigation/compose/DialogNavigator;Landroidx/navigation/NavBackStackEntry;)Lqc/q;

    move-result-object v0

    return-object v0
.end method

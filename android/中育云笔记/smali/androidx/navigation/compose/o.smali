.class public final synthetic Landroidx/navigation/compose/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Landroidx/compose/runtime/State;

.field public final synthetic d:Landroidx/navigation/compose/ComposeNavigator;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/State;Landroidx/navigation/compose/ComposeNavigator;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/o;->c:Landroidx/compose/runtime/State;

    iput-object p2, p0, Landroidx/navigation/compose/o;->d:Landroidx/navigation/compose/ComposeNavigator;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/o;->c:Landroidx/compose/runtime/State;

    iget-object v1, p0, Landroidx/navigation/compose/o;->d:Landroidx/navigation/compose/ComposeNavigator;

    check-cast p1, Landroidx/compose/runtime/DisposableEffectScope;

    invoke-static {v0, v1, p1}, Landroidx/navigation/compose/NavHostKt;->r(Landroidx/compose/runtime/State;Landroidx/navigation/compose/ComposeNavigator;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    move-result-object p1

    return-object p1
.end method

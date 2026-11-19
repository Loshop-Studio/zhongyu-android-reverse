.class public final synthetic Landroidx/navigation/compose/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Landroidx/navigation/NavBackStackEntry;

.field public final synthetic d:Z

.field public final synthetic e:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavBackStackEntry;ZLjava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/a;->c:Landroidx/navigation/NavBackStackEntry;

    iput-boolean p2, p0, Landroidx/navigation/compose/a;->d:Z

    iput-object p3, p0, Landroidx/navigation/compose/a;->e:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/a;->c:Landroidx/navigation/NavBackStackEntry;

    iget-boolean v1, p0, Landroidx/navigation/compose/a;->d:Z

    iget-object v2, p0, Landroidx/navigation/compose/a;->e:Ljava/util/List;

    check-cast p1, Landroidx/compose/runtime/DisposableEffectScope;

    invoke-static {v0, v1, v2, p1}, Landroidx/navigation/compose/DialogHostKt;->a(Landroidx/navigation/NavBackStackEntry;ZLjava/util/List;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    move-result-object p1

    return-object p1
.end method

.class public final synthetic Landroidx/navigation/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Landroidx/navigation/Navigator;

.field public final synthetic b:Landroidx/navigation/NavOptions;

.field public final synthetic c:Landroidx/navigation/Navigator$Extras;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/Navigator;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/j0;->a:Landroidx/navigation/Navigator;

    iput-object p2, p0, Landroidx/navigation/j0;->b:Landroidx/navigation/NavOptions;

    iput-object p3, p0, Landroidx/navigation/j0;->c:Landroidx/navigation/Navigator$Extras;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/navigation/j0;->a:Landroidx/navigation/Navigator;

    iget-object v1, p0, Landroidx/navigation/j0;->b:Landroidx/navigation/NavOptions;

    iget-object v2, p0, Landroidx/navigation/j0;->c:Landroidx/navigation/Navigator$Extras;

    check-cast p1, Landroidx/navigation/NavBackStackEntry;

    invoke-static {v0, v1, v2, p1}, Landroidx/navigation/Navigator;->b(Landroidx/navigation/Navigator;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;Landroidx/navigation/NavBackStackEntry;)Landroidx/navigation/NavBackStackEntry;

    move-result-object p1

    return-object p1
.end method

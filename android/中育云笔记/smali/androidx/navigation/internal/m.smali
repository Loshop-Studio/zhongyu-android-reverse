.class public final synthetic Landroidx/navigation/internal/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lkotlin/jvm/internal/Ref$BooleanRef;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Lkotlin/jvm/internal/Ref$IntRef;

.field public final synthetic f:Landroidx/navigation/internal/NavControllerImpl;

.field public final synthetic g:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/Ref$BooleanRef;Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Landroidx/navigation/internal/NavControllerImpl;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/internal/m;->c:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-object p2, p0, Landroidx/navigation/internal/m;->d:Ljava/util/List;

    iput-object p3, p0, Landroidx/navigation/internal/m;->e:Lkotlin/jvm/internal/Ref$IntRef;

    iput-object p4, p0, Landroidx/navigation/internal/m;->f:Landroidx/navigation/internal/NavControllerImpl;

    iput-object p5, p0, Landroidx/navigation/internal/m;->g:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/navigation/internal/m;->c:Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-object v1, p0, Landroidx/navigation/internal/m;->d:Ljava/util/List;

    iget-object v2, p0, Landroidx/navigation/internal/m;->e:Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v3, p0, Landroidx/navigation/internal/m;->f:Landroidx/navigation/internal/NavControllerImpl;

    iget-object v4, p0, Landroidx/navigation/internal/m;->g:Landroid/os/Bundle;

    move-object v5, p1

    check-cast v5, Landroidx/navigation/NavBackStackEntry;

    invoke-static/range {v0 .. v5}, Landroidx/navigation/internal/NavControllerImpl;->i(Lkotlin/jvm/internal/Ref$BooleanRef;Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Landroidx/navigation/internal/NavControllerImpl;Landroid/os/Bundle;Landroidx/navigation/NavBackStackEntry;)Lqc/q;

    move-result-object p1

    return-object p1
.end method

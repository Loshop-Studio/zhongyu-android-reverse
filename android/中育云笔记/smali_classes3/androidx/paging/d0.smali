.class public final synthetic Landroidx/paging/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Landroidx/paging/LoadStates;

.field public final synthetic d:Landroidx/paging/LoadStates;


# direct methods
.method public synthetic constructor <init>(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/paging/d0;->c:Landroidx/paging/LoadStates;

    iput-object p2, p0, Landroidx/paging/d0;->d:Landroidx/paging/LoadStates;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/paging/d0;->c:Landroidx/paging/LoadStates;

    iget-object v1, p0, Landroidx/paging/d0;->d:Landroidx/paging/LoadStates;

    check-cast p1, Landroidx/paging/CombinedLoadStates;

    invoke-static {v0, v1, p1}, Landroidx/paging/MutableCombinedLoadStateCollection;->a(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;Landroidx/paging/CombinedLoadStates;)Landroidx/paging/CombinedLoadStates;

    move-result-object p1

    return-object p1
.end method

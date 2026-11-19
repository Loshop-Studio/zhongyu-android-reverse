.class public final synthetic Landroidx/paging/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Z

.field public final synthetic d:Landroidx/paging/LoadType;

.field public final synthetic e:Landroidx/paging/LoadState;


# direct methods
.method public synthetic constructor <init>(ZLandroidx/paging/LoadType;Landroidx/paging/LoadState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Landroidx/paging/c0;->c:Z

    iput-object p2, p0, Landroidx/paging/c0;->d:Landroidx/paging/LoadType;

    iput-object p3, p0, Landroidx/paging/c0;->e:Landroidx/paging/LoadState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/paging/c0;->c:Z

    iget-object v1, p0, Landroidx/paging/c0;->d:Landroidx/paging/LoadType;

    iget-object v2, p0, Landroidx/paging/c0;->e:Landroidx/paging/LoadState;

    check-cast p1, Landroidx/paging/CombinedLoadStates;

    invoke-static {v0, v1, v2, p1}, Landroidx/paging/MutableCombinedLoadStateCollection;->b(ZLandroidx/paging/LoadType;Landroidx/paging/LoadState;Landroidx/paging/CombinedLoadStates;)Landroidx/paging/CombinedLoadStates;

    move-result-object p1

    return-object p1
.end method

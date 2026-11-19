.class final Landroidx/paging/PagingData$Companion$empty$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/PagingData$Companion;->empty(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PagingData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/a;"
    }
.end annotation


# instance fields
.field final synthetic $mediatorLoadStates:Landroidx/paging/LoadStates;

.field final synthetic $sourceLoadStates:Landroidx/paging/LoadStates;


# direct methods
.method public constructor <init>(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V
    .locals 0

    iput-object p1, p0, Landroidx/paging/PagingData$Companion$empty$2;->$sourceLoadStates:Landroidx/paging/LoadStates;

    iput-object p2, p0, Landroidx/paging/PagingData$Companion$empty$2;->$mediatorLoadStates:Landroidx/paging/LoadStates;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/paging/PageEvent$Insert;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/paging/PageEvent$Insert<",
            "TT;>;"
        }
    .end annotation

    .line 2
    sget-object v0, Landroidx/paging/PageEvent$Insert;->Companion:Landroidx/paging/PageEvent$Insert$Companion;

    .line 3
    new-instance v1, Landroidx/paging/TransformablePage;

    const/4 v2, 0x0

    .line 4
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    move-result-object v3

    .line 5
    invoke-direct {v1, v2, v3}, Landroidx/paging/TransformablePage;-><init>(ILjava/util/List;)V

    .line 6
    invoke-static {v1}, Li7/u;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 7
    iget-object v4, p0, Landroidx/paging/PagingData$Companion$empty$2;->$sourceLoadStates:Landroidx/paging/LoadStates;

    .line 8
    iget-object v5, p0, Landroidx/paging/PagingData$Companion$empty$2;->$mediatorLoadStates:Landroidx/paging/LoadStates;

    const/4 v3, 0x0

    .line 9
    invoke-virtual/range {v0 .. v5}, Landroidx/paging/PageEvent$Insert$Companion;->Refresh(Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/paging/PagingData$Companion$empty$2;->invoke()Landroidx/paging/PageEvent$Insert;

    move-result-object v0

    return-object v0
.end method

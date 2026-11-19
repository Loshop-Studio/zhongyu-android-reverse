.class public final synthetic Landroidx/paging/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Landroidx/paging/AsyncPagingDataDiffer;


# direct methods
.method public synthetic constructor <init>(Landroidx/paging/AsyncPagingDataDiffer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/paging/e;->c:Landroidx/paging/AsyncPagingDataDiffer;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/e;->c:Landroidx/paging/AsyncPagingDataDiffer;

    check-cast p1, Landroidx/paging/CombinedLoadStates;

    invoke-static {v0, p1}, Landroidx/paging/AsyncPagingDataDiffer;->b(Landroidx/paging/AsyncPagingDataDiffer;Landroidx/paging/CombinedLoadStates;)Lqc/q;

    move-result-object p1

    return-object p1
.end method

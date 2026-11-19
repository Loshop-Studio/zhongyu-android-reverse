.class final synthetic Landroidx/paging/LegacyPagingSource$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/paging/DataSource$InvalidatedCallback;
.implements Lkotlin/jvm/internal/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/LegacyPagingSource;-><init>(Lkotlin/coroutines/d;Landroidx/paging/DataSource;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation


# instance fields
.field final synthetic $tmp0:Landroidx/paging/LegacyPagingSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/LegacyPagingSource<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/paging/LegacyPagingSource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/LegacyPagingSource<",
            "TKey;TValue;>;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/paging/LegacyPagingSource$2$1;->$tmp0:Landroidx/paging/LegacyPagingSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Landroidx/paging/DataSource$InvalidatedCallback;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    instance-of v0, p1, Lkotlin/jvm/internal/q;

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lkotlin/jvm/internal/q;->getFunctionDelegate()Lqc/c;

    move-result-object v0

    check-cast p1, Lkotlin/jvm/internal/q;

    invoke-interface {p1}, Lkotlin/jvm/internal/q;->getFunctionDelegate()Lqc/c;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    return v1
.end method

.method public final getFunctionDelegate()Lqc/c;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lqc/c;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkotlin/jvm/internal/FunctionReferenceImpl;

    .line 2
    .line 3
    iget-object v2, p0, Landroidx/paging/LegacyPagingSource$2$1;->$tmp0:Landroidx/paging/LegacyPagingSource;

    .line 4
    .line 5
    const-string v5, "invalidate()V"

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    const/4 v1, 0x0

    .line 9
    const-class v3, Landroidx/paging/LegacyPagingSource;

    .line 10
    .line 11
    const-string v4, "invalidate"

    .line 12
    .line 13
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-interface {p0}, Lkotlin/jvm/internal/q;->getFunctionDelegate()Lqc/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final onInvalidated()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/LegacyPagingSource$2$1;->$tmp0:Landroidx/paging/LegacyPagingSource;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/PagingSource;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

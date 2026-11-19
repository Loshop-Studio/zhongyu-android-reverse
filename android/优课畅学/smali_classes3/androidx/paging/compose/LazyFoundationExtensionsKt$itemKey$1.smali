.class final Landroidx/paging/compose/LazyFoundationExtensionsKt$itemKey$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/compose/LazyFoundationExtensionsKt;->itemKey(Landroidx/paging/compose/LazyPagingItems;Lx7/l;)Lx7/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/l;"
    }
.end annotation


# instance fields
.field final synthetic $key:Lx7/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx7/l;"
        }
    .end annotation
.end field

.field final synthetic $this_itemKey:Landroidx/paging/compose/LazyPagingItems;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/compose/LazyPagingItems<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lx7/l;Landroidx/paging/compose/LazyPagingItems;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            "Landroidx/paging/compose/LazyPagingItems<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/compose/LazyFoundationExtensionsKt$itemKey$1;->$key:Lx7/l;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/paging/compose/LazyFoundationExtensionsKt$itemKey$1;->$this_itemKey:Landroidx/paging/compose/LazyPagingItems;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(I)Ljava/lang/Object;
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/paging/compose/LazyFoundationExtensionsKt$itemKey$1;->$key:Lx7/l;

    if-nez v0, :cond_0

    .line 3
    invoke-static {p1}, Landroidx/paging/compose/PagingPlaceholderKey_androidKt;->getPagingPlaceholderKey(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/paging/compose/LazyFoundationExtensionsKt$itemKey$1;->$this_itemKey:Landroidx/paging/compose/LazyPagingItems;

    invoke-virtual {v0, p1}, Landroidx/paging/compose/LazyPagingItems;->peek(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 5
    invoke-static {p1}, Landroidx/paging/compose/PagingPlaceholderKey_androidKt;->getPagingPlaceholderKey(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p1, p0, Landroidx/paging/compose/LazyFoundationExtensionsKt$itemKey$1;->$key:Lx7/l;

    invoke-interface {p1, v0}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/paging/compose/LazyFoundationExtensionsKt$itemKey$1;->invoke(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

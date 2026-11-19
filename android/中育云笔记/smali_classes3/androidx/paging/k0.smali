.class public final synthetic Landroidx/paging/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Landroidx/paging/PagedList$Callback;


# direct methods
.method public synthetic constructor <init>(Landroidx/paging/PagedList$Callback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/paging/k0;->c:Landroidx/paging/PagedList$Callback;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/k0;->c:Landroidx/paging/PagedList$Callback;

    check-cast p1, Ljava/lang/ref/WeakReference;

    invoke-static {v0, p1}, Landroidx/paging/PagedList;->b(Landroidx/paging/PagedList$Callback;Ljava/lang/ref/WeakReference;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

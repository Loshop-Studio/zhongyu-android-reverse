.class public final synthetic Lz4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/g;->a:Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lz4/g;->a:Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;

    invoke-static {v0}, Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;->g(Lcom/zykj/study/ui/home/find/search/SearchHistoryFragment;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object v0

    return-object v0
.end method

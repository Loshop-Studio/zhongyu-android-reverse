.class public final Lcom/friday/main/viewmodel/SearchViewModel$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/viewmodel/SearchViewModel;-><init>(Lcom/friday/common/dao/FileDao;Lj2/d;Lu3/b;Lcom/friday/common/dao/ResourceDao;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/friday/main/viewmodel/SearchViewModel;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/friday/main/viewmodel/SearchViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/friday/main/viewmodel/SearchViewModel$a;->c:Ljava/lang/String;

    iput-object p2, p0, Lcom/friday/main/viewmodel/SearchViewModel$a;->d:Lcom/friday/main/viewmodel/SearchViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/paging/PagingSource;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/SearchViewModel$a;->c:Ljava/lang/String;

    invoke-static {v0}, Lqd/c0;->h0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/friday/main/viewmodel/SearchViewModel$a;->d:Lcom/friday/main/viewmodel/SearchViewModel;

    invoke-static {v0}, Lcom/friday/main/viewmodel/SearchViewModel;->f(Lcom/friday/main/viewmodel/SearchViewModel;)Lcom/friday/common/dao/FileDao;

    move-result-object v0

    invoke-interface {v0}, Lcom/friday/common/dao/FileDao;->O()Landroidx/paging/PagingSource;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/friday/main/viewmodel/SearchViewModel$a;->d:Lcom/friday/main/viewmodel/SearchViewModel;

    invoke-static {v0}, Lcom/friday/main/viewmodel/SearchViewModel;->f(Lcom/friday/main/viewmodel/SearchViewModel;)Lcom/friday/common/dao/FileDao;

    move-result-object v0

    iget-object v1, p0, Lcom/friday/main/viewmodel/SearchViewModel$a;->c:Ljava/lang/String;

    sget-object v2, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    invoke-virtual {v2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/friday/common/helper/b;->t()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/friday/common/dao/FileDao;->F(Ljava/lang/String;J)Landroidx/paging/PagingSource;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/friday/main/viewmodel/SearchViewModel$a;->invoke()Landroidx/paging/PagingSource;

    move-result-object v0

    return-object v0
.end method

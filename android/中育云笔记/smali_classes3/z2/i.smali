.class public final synthetic Lz2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/friday/common/dao/FileDao;

.field public final synthetic d:Lcom/friday/document/viewmodel/NewestViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/dao/FileDao;Lcom/friday/document/viewmodel/NewestViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/i;->c:Lcom/friday/common/dao/FileDao;

    iput-object p2, p0, Lz2/i;->d:Lcom/friday/document/viewmodel/NewestViewModel;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lz2/i;->c:Lcom/friday/common/dao/FileDao;

    iget-object v1, p0, Lz2/i;->d:Lcom/friday/document/viewmodel/NewestViewModel;

    invoke-static {v0, v1}, Lcom/friday/document/viewmodel/NewestViewModel;->D0(Lcom/friday/common/dao/FileDao;Lcom/friday/document/viewmodel/NewestViewModel;)Landroidx/paging/PagingSource;

    move-result-object v0

    return-object v0
.end method

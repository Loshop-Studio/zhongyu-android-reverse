.class public final synthetic Lz2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/friday/common/dao/FileDao;

.field public final synthetic d:Lcom/friday/document/viewmodel/RecycleBinViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/dao/FileDao;Lcom/friday/document/viewmodel/RecycleBinViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/q;->c:Lcom/friday/common/dao/FileDao;

    iput-object p2, p0, Lz2/q;->d:Lcom/friday/document/viewmodel/RecycleBinViewModel;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lz2/q;->c:Lcom/friday/common/dao/FileDao;

    iget-object v1, p0, Lz2/q;->d:Lcom/friday/document/viewmodel/RecycleBinViewModel;

    invoke-static {v0, v1}, Lcom/friday/document/viewmodel/RecycleBinViewModel;->D0(Lcom/friday/common/dao/FileDao;Lcom/friday/document/viewmodel/RecycleBinViewModel;)Landroidx/paging/PagingSource;

    move-result-object v0

    return-object v0
.end method

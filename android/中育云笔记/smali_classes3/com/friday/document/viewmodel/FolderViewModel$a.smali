.class public final Lcom/friday/document/viewmodel/FolderViewModel$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/FolderViewModel;->I0(Lvd/u;)Lvd/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lkotlin/Pair;

.field public final synthetic d:Lcom/friday/document/viewmodel/FolderViewModel;


# direct methods
.method public constructor <init>(Lkotlin/Pair;Lcom/friday/document/viewmodel/FolderViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/friday/document/viewmodel/FolderViewModel$a;->c:Lkotlin/Pair;

    iput-object p2, p0, Lcom/friday/document/viewmodel/FolderViewModel$a;->d:Lcom/friday/document/viewmodel/FolderViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/paging/PagingSource;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/FolderViewModel$a;->c:Lkotlin/Pair;

    invoke-virtual {v0}, Lkotlin/Pair;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "0"

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/friday/document/viewmodel/FolderViewModel$a;->c:Lkotlin/Pair;

    invoke-virtual {v1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-nez v1, :cond_1

    .line 3
    iget-object v1, p0, Lcom/friday/document/viewmodel/FolderViewModel$a;->d:Lcom/friday/document/viewmodel/FolderViewModel;

    invoke-virtual {v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->M()Lcom/friday/common/dao/FileDao;

    move-result-object v1

    .line 4
    iget-object v2, p0, Lcom/friday/document/viewmodel/FolderViewModel$a;->d:Lcom/friday/document/viewmodel/FolderViewModel;

    invoke-virtual {v2}, Lcom/friday/document/viewmodel/BaseFileViewModel;->X()J

    move-result-wide v2

    .line 5
    invoke-interface {v1, v0, v2, v3}, Lcom/friday/common/dao/FileDao;->w(Ljava/lang/String;J)Landroidx/paging/PagingSource;

    move-result-object v0

    return-object v0

    .line 6
    :cond_1
    iget-object v1, p0, Lcom/friday/document/viewmodel/FolderViewModel$a;->d:Lcom/friday/document/viewmodel/FolderViewModel;

    invoke-virtual {v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->M()Lcom/friday/common/dao/FileDao;

    move-result-object v1

    iget-object v2, p0, Lcom/friday/document/viewmodel/FolderViewModel$a;->d:Lcom/friday/document/viewmodel/FolderViewModel;

    invoke-virtual {v2}, Lcom/friday/document/viewmodel/BaseFileViewModel;->X()J

    move-result-wide v2

    invoke-interface {v1, v0, v2, v3}, Lcom/friday/common/dao/FileDao;->C(Ljava/lang/String;J)Landroidx/paging/PagingSource;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 7
    invoke-virtual {p0}, Lcom/friday/document/viewmodel/FolderViewModel$a;->invoke()Landroidx/paging/PagingSource;

    move-result-object v0

    return-object v0
.end method

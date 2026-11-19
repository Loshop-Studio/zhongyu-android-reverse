.class final Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/viewmodel/FolderMoveViewModel;->t(Lcom/friday/common/entity/FileEntity;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.main.viewmodel.FolderMoveViewModel"
    f = "FolderMoveViewModel.kt"
    l = {
        0xd2,
        0xd4
    }
    m = "folderList"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic g:Lcom/friday/main/viewmodel/FolderMoveViewModel;

.field public h:I


# direct methods
.method public constructor <init>(Lcom/friday/main/viewmodel/FolderMoveViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;->g:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lvc/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;->f:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;->h:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;->h:I

    iget-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;->g:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->f(Lcom/friday/main/viewmodel/FolderMoveViewModel;Lcom/friday/common/entity/FileEntity;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

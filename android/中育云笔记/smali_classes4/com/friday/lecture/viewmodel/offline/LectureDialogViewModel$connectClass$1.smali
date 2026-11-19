.class public final Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/friday/common/helper/e$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->j(Lhd/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;

.field public final synthetic b:Lhd/l;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;Lhd/l;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1;->a:Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1;->b:Lhd/l;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(Li2/a;)V
    .locals 8

    .line 1
    const-string v0, "info"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1;->a:Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;

    .line 7
    .line 8
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1$onReceive$1;

    .line 13
    .line 14
    iget-object v4, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1;->b:Lhd/l;

    .line 15
    .line 16
    iget-object v5, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1;->c:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v6, p0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1;->a:Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    move-object v3, p1

    .line 22
    invoke-direct/range {v2 .. v7}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel$connectClass$1$onReceive$1;-><init>(Li2/a;Lhd/l;Ljava/lang/String;Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x3

    .line 26
    const/4 v6, 0x0

    .line 27
    move-object v4, v2

    .line 28
    const/4 v2, 0x0

    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 31
    .line 32
    .line 33
    return-void
.end method

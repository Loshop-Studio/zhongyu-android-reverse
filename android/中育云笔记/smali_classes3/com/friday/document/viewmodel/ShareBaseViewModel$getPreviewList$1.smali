.class final Lcom/friday/document/viewmodel/ShareBaseViewModel$getPreviewList$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/ShareBaseViewModel;->D(Lcom/friday/document/model/ShareFile;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.viewmodel.ShareBaseViewModel"
    f = "ShareBaseViewModel.kt"
    l = {
        0x8a
    }
    m = "getPreviewList"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/friday/document/viewmodel/ShareBaseViewModel;

.field public f:I


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$getPreviewList$1;->e:Lcom/friday/document/viewmodel/ShareBaseViewModel;

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

    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$getPreviewList$1;->d:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$getPreviewList$1;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$getPreviewList$1;->f:I

    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$getPreviewList$1;->e:Lcom/friday/document/viewmodel/ShareBaseViewModel;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->D(Lcom/friday/document/model/ShareFile;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

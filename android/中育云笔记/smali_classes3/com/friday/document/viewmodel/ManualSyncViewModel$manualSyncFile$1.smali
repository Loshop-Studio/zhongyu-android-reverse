.class final Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/ManualSyncViewModel;->n(Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.viewmodel.ManualSyncViewModel"
    f = "ManualSyncViewModel.kt"
    l = {
        0x39
    }
    m = "manualSyncFile"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:I

.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lcom/friday/document/viewmodel/ManualSyncViewModel;

.field public k:I


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/ManualSyncViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;->j:Lcom/friday/document/viewmodel/ManualSyncViewModel;

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

    iput-object p1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;->i:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;->k:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;->k:I

    iget-object p1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$manualSyncFile$1;->j:Lcom/friday/document/viewmodel/ManualSyncViewModel;

    invoke-virtual {p1, p0}, Lcom/friday/document/viewmodel/ManualSyncViewModel;->n(Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

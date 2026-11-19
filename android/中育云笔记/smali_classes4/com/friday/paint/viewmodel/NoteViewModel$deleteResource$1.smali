.class final Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/viewmodel/NoteViewModel;->r(Ljava/lang/String;ILvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.paint.viewmodel.NoteViewModel"
    f = "NoteViewModel.kt"
    l = {
        0xc9,
        0xcc,
        0xcf
    }
    m = "deleteResource"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:I

.field public j:I

.field public k:I

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lcom/friday/paint/viewmodel/NoteViewModel;

.field public n:I


# direct methods
.method public constructor <init>(Lcom/friday/paint/viewmodel/NoteViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->m:Lcom/friday/paint/viewmodel/NoteViewModel;

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
    .locals 2

    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->l:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->n:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->n:I

    iget-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->m:Lcom/friday/paint/viewmodel/NoteViewModel;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, p0}, Lcom/friday/paint/viewmodel/NoteViewModel;->e(Lcom/friday/paint/viewmodel/NoteViewModel;Ljava/lang/String;ILvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

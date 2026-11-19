.class final Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/viewmodel/NewNoteViewModel;->Q(Ljava/lang/String;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.paint.viewmodel.NewNoteViewModel"
    f = "NewNoteViewModel.kt"
    l = {
        0xe0,
        0xe2,
        0xfc,
        0x108
    }
    m = "handleSaveExitImage"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:I

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lcom/friday/paint/viewmodel/NewNoteViewModel;

.field public y:I


# direct methods
.method public constructor <init>(Lcom/friday/paint/viewmodel/NewNoteViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->x:Lcom/friday/paint/viewmodel/NewNoteViewModel;

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

    iput-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->w:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->y:I

    iget-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->x:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->Q(Ljava/lang/String;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

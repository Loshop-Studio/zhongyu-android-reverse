.class public final Lcom/friday/document/viewmodel/ShareFileViewModel$special$$inlined$map$1$2$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/ShareFileViewModel$special$$inlined$map$1$2;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.viewmodel.ShareFileViewModel$special$$inlined$map$1$2"
    f = "ShareFileViewModel.kt"
    l = {
        0x32
    }
    m = "emit"
.end annotation


# instance fields
.field public synthetic c:Ljava/lang/Object;

.field public d:I

.field public e:Ljava/lang/Object;

.field public final synthetic f:Lcom/friday/document/viewmodel/ShareFileViewModel$special$$inlined$map$1$2;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:I


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/ShareFileViewModel$special$$inlined$map$1$2;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$special$$inlined$map$1$2$1;->f:Lcom/friday/document/viewmodel/ShareFileViewModel$special$$inlined$map$1$2;

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

    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$special$$inlined$map$1$2$1;->c:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$special$$inlined$map$1$2$1;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$special$$inlined$map$1$2$1;->d:I

    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareFileViewModel$special$$inlined$map$1$2$1;->f:Lcom/friday/document/viewmodel/ShareFileViewModel$special$$inlined$map$1$2;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/friday/document/viewmodel/ShareFileViewModel$special$$inlined$map$1$2;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

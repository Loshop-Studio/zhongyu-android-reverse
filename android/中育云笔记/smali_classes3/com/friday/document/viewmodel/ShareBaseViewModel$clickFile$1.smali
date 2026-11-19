.class final Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/ShareBaseViewModel;->n(Lcom/friday/document/model/ShareFile;Lhd/p;Lhd/p;Lhd/p;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.viewmodel.ShareBaseViewModel"
    f = "ShareBaseViewModel.kt"
    l = {
        0x52,
        0x53,
        0x58,
        0x5b
    }
    m = "clickFile"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Z

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lcom/friday/document/viewmodel/ShareBaseViewModel;

.field public j:I


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->i:Lcom/friday/document/viewmodel/ShareBaseViewModel;

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
    .locals 6

    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->h:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->j:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->j:I

    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->i:Lcom/friday/document/viewmodel/ShareBaseViewModel;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->e(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lcom/friday/document/model/ShareFile;Lhd/p;Lhd/p;Lhd/p;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.class public final Lcom/friday/document/viewmodel/PdfViewerViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:Lc2/a1;

.field public final b:Lvd/l;

.field public final c:Lvd/u;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lc2/a1;)V
    .locals 2

    .line 1
    const-string v0, "pdfDao"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/friday/document/viewmodel/PdfViewerViewModel;->a:Lc2/a1;

    .line 10
    .line 11
    new-instance p1, Lz2/m;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {p1, v0, v1, v0}, Lz2/m;-><init>(Lcom/friday/common/entity/PdfEntity;ILkotlin/jvm/internal/n;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/friday/document/viewmodel/PdfViewerViewModel;->b:Lvd/l;

    .line 23
    .line 24
    iput-object p1, p0, Lcom/friday/document/viewmodel/PdfViewerViewModel;->c:Lvd/u;

    .line 25
    .line 26
    return-void
.end method

.method public static final synthetic a(Lcom/friday/document/viewmodel/PdfViewerViewModel;)Lc2/a1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/PdfViewerViewModel;->a:Lc2/a1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lcom/friday/document/viewmodel/PdfViewerViewModel;)Lvd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/PdfViewerViewModel;->b:Lvd/l;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final c(Lcom/friday/document/viewmodel/a;)V
    .locals 7

    .line 1
    const-string v0, "pdfAction"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p1, p0, v0}, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;-><init>(Lcom/friday/document/viewmodel/a;Lcom/friday/document/viewmodel/PdfViewerViewModel;Lvc/c;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final d()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/PdfViewerViewModel;->c:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method

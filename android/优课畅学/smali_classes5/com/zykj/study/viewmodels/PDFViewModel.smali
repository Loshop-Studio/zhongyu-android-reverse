.class public final Lcom/zykj/study/viewmodels/PDFViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/data/PdfDao;

.field public final b:Ll8/g;

.field public final c:Ll8/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/data/PdfDao;)V
    .locals 2

    .line 1
    const-string v0, "pdfDao"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/study/viewmodels/PDFViewModel;->a:Lcom/zykj/study/data/PdfDao;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    const/4 v0, 0x7

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {v1, v1, p1, v0, p1}, Ll8/m;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Ll8/g;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lcom/zykj/study/viewmodels/PDFViewModel;->b:Ll8/g;

    .line 19
    .line 20
    iput-object p1, p0, Lcom/zykj/study/viewmodels/PDFViewModel;->c:Ll8/l;

    .line 21
    .line 22
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/study/viewmodels/PDFViewModel;)Lcom/zykj/study/data/PdfDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/viewmodels/PDFViewModel;->a:Lcom/zykj/study/data/PdfDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lcom/zykj/study/viewmodels/PDFViewModel;)Ll8/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/viewmodels/PDFViewModel;->b:Ll8/g;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final c(Lcom/zykj/study/viewmodels/a;)V
    .locals 7

    .line 1
    const-string v0, "pdfAction"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p1, p0, v0}, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;-><init>(Lcom/zykj/study/viewmodels/a;Lcom/zykj/study/viewmodels/PDFViewModel;Lm7/c;)V

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
    invoke-static/range {v1 .. v6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final d()Ll8/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/PDFViewModel;->c:Ll8/l;

    .line 2
    .line 3
    return-object v0
.end method

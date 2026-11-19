.class public Lcom/github/barteksc/pdfviewer/PDFView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/github/barteksc/pdfviewer/PDFView$b;,
        Lcom/github/barteksc/pdfviewer/PDFView$d;,
        Lcom/github/barteksc/pdfviewer/PDFView$c;
    }
.end annotation


# static fields
.field private static final g0:Ljava/lang/String;


# instance fields
.field private A:Ln1/c;

.field private B:Ln1/b;

.field private C:Ln1/d;

.field private D:Ln1/f;

.field private E:Ln1/a;

.field private F:Ln1/a;

.field private G:Ln1/g;

.field private H:Ln1/h;

.field private I:Ln1/e;

.field private J:Landroid/graphics/Paint;

.field private K:Landroid/graphics/Paint;

.field private L:I

.field private M:I

.field private N:Z

.field private S:Lcom/shockwave/pdfium/PdfiumCore;

.field private T:Lcom/shockwave/pdfium/a;

.field private U:Lp1/a;

.field private V:Z

.field private W:Z

.field private a:F

.field private a0:Z

.field private b:F

.field private b0:Z

.field private c:F

.field private c0:Z

.field private d:Lcom/github/barteksc/pdfviewer/PDFView$c;

.field private d0:Landroid/graphics/PaintFlagsDrawFilter;

.field e:Lcom/github/barteksc/pdfviewer/b;

.field private e0:I

.field private f:Lcom/github/barteksc/pdfviewer/a;

.field private f0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/github/barteksc/pdfviewer/d;

.field private h:[I

.field private i:[I

.field private j:[I

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:F

.field private q:F

.field private r:F

.field private s:F

.field private t:F

.field private u:Z

.field private v:Lcom/github/barteksc/pdfviewer/PDFView$d;

.field private w:Lcom/github/barteksc/pdfviewer/c;

.field private final x:Landroid/os/HandlerThread;

.field y:Lcom/github/barteksc/pdfviewer/f;

.field private z:Lcom/github/barteksc/pdfviewer/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/github/barteksc/pdfviewer/PDFView;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/github/barteksc/pdfviewer/PDFView;->g0:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 p2, 0x3f800000    # 1.0f

    .line 2
    iput p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->a:F

    const/high16 v0, 0x3fe00000    # 1.75f

    .line 3
    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->b:F

    const/high16 v0, 0x40400000    # 3.0f

    .line 4
    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->c:F

    .line 5
    sget-object v0, Lcom/github/barteksc/pdfviewer/PDFView$c;->a:Lcom/github/barteksc/pdfviewer/PDFView$c;

    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->d:Lcom/github/barteksc/pdfviewer/PDFView$c;

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    .line 7
    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    .line 8
    iput p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->t:F

    const/4 p2, 0x1

    .line 9
    iput-boolean p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->u:Z

    .line 10
    sget-object v0, Lcom/github/barteksc/pdfviewer/PDFView$d;->a:Lcom/github/barteksc/pdfviewer/PDFView$d;

    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->v:Lcom/github/barteksc/pdfviewer/PDFView$d;

    const/4 v0, -0x1

    .line 11
    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->L:I

    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->M:I

    .line 13
    iput-boolean p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->N:Z

    .line 14
    iput-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->V:Z

    .line 15
    iput-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->W:Z

    .line 16
    iput-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->a0:Z

    .line 17
    iput-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->b0:Z

    .line 18
    iput-boolean p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->c0:Z

    .line 19
    new-instance p2, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v1, 0x3

    invoke-direct {p2, v0, v1}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->d0:Landroid/graphics/PaintFlagsDrawFilter;

    .line 20
    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->e0:I

    .line 21
    new-instance p2, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->f0:Ljava/util/List;

    .line 22
    new-instance p2, Landroid/os/HandlerThread;

    const-string v1, "PDF renderer"

    invoke-direct {p2, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->x:Landroid/os/HandlerThread;

    .line 23
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->isInEditMode()Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    .line 24
    :cond_0
    new-instance p2, Lcom/github/barteksc/pdfviewer/b;

    invoke-direct {p2}, Lcom/github/barteksc/pdfviewer/b;-><init>()V

    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->e:Lcom/github/barteksc/pdfviewer/b;

    .line 25
    new-instance p2, Lcom/github/barteksc/pdfviewer/a;

    invoke-direct {p2, p0}, Lcom/github/barteksc/pdfviewer/a;-><init>(Lcom/github/barteksc/pdfviewer/PDFView;)V

    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->f:Lcom/github/barteksc/pdfviewer/a;

    .line 26
    new-instance v1, Lcom/github/barteksc/pdfviewer/d;

    invoke-direct {v1, p0, p2}, Lcom/github/barteksc/pdfviewer/d;-><init>(Lcom/github/barteksc/pdfviewer/PDFView;Lcom/github/barteksc/pdfviewer/a;)V

    iput-object v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->g:Lcom/github/barteksc/pdfviewer/d;

    .line 27
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->J:Landroid/graphics/Paint;

    .line 28
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->K:Landroid/graphics/Paint;

    .line 29
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 30
    new-instance p2, Lcom/shockwave/pdfium/PdfiumCore;

    invoke-direct {p2, p1}, Lcom/shockwave/pdfium/PdfiumCore;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->S:Lcom/shockwave/pdfium/PdfiumCore;

    .line 31
    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->setWillNotDraw(Z)V

    return-void
.end method

.method private I(Lq1/a;Ljava/lang/String;Ln1/c;Ln1/b;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/github/barteksc/pdfviewer/PDFView;->J(Lq1/a;Ljava/lang/String;Ln1/c;Ln1/b;[I)V

    return-void
.end method

.method private J(Lq1/a;Ljava/lang/String;Ln1/c;Ln1/b;[I)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->u:Z

    if-eqz v0, :cond_2

    if-eqz p5, :cond_0

    .line 2
    iput-object p5, p0, Lcom/github/barteksc/pdfviewer/PDFView;->h:[I

    .line 3
    invoke-static {p5}, Lr1/a;->b([I)[I

    move-result-object p5

    iput-object p5, p0, Lcom/github/barteksc/pdfviewer/PDFView;->i:[I

    .line 4
    iget-object p5, p0, Lcom/github/barteksc/pdfviewer/PDFView;->h:[I

    invoke-static {p5}, Lr1/a;->a([I)[I

    move-result-object p5

    iput-object p5, p0, Lcom/github/barteksc/pdfviewer/PDFView;->j:[I

    .line 5
    :cond_0
    iput-object p3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->A:Ln1/c;

    .line 6
    iput-object p4, p0, Lcom/github/barteksc/pdfviewer/PDFView;->B:Ln1/b;

    .line 7
    iget-object p3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->h:[I

    const/4 p4, 0x0

    if-eqz p3, :cond_1

    .line 8
    aget p3, p3, p4

    move v5, p3

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    .line 9
    :goto_0
    iput-boolean p4, p0, Lcom/github/barteksc/pdfviewer/PDFView;->u:Z

    .line 10
    new-instance p3, Lcom/github/barteksc/pdfviewer/c;

    iget-object v4, p0, Lcom/github/barteksc/pdfviewer/PDFView;->S:Lcom/shockwave/pdfium/PdfiumCore;

    move-object v0, p3

    move-object v1, p1

    move-object v2, p2

    move-object v3, p0

    invoke-direct/range {v0 .. v5}, Lcom/github/barteksc/pdfviewer/c;-><init>(Lq1/a;Ljava/lang/String;Lcom/github/barteksc/pdfviewer/PDFView;Lcom/shockwave/pdfium/PdfiumCore;I)V

    iput-object p3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->w:Lcom/github/barteksc/pdfviewer/c;

    .line 11
    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array p2, p4, [Ljava/lang/Void;

    invoke-virtual {p3, p1, p2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void

    .line 12
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Don\'t call load on a PDF View without recycling it first."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic a(Lcom/github/barteksc/pdfviewer/PDFView;Ln1/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->setOnDrawListener(Ln1/a;)V

    return-void
.end method

.method static synthetic b(Lcom/github/barteksc/pdfviewer/PDFView;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->setSpacing(I)V

    return-void
.end method

.method static synthetic c(Lcom/github/barteksc/pdfviewer/PDFView;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->setInvalidPageColor(I)V

    return-void
.end method

.method static synthetic d(Lcom/github/barteksc/pdfviewer/PDFView;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->N:Z

    return p0
.end method

.method static synthetic e(Lcom/github/barteksc/pdfviewer/PDFView;)Lcom/github/barteksc/pdfviewer/d;
    .locals 0

    iget-object p0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->g:Lcom/github/barteksc/pdfviewer/d;

    return-object p0
.end method

.method static synthetic f(Lcom/github/barteksc/pdfviewer/PDFView;Lq1/a;Ljava/lang/String;Ln1/c;Ln1/b;[I)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/github/barteksc/pdfviewer/PDFView;->J(Lq1/a;Ljava/lang/String;Ln1/c;Ln1/b;[I)V

    return-void
.end method

.method static synthetic g(Lcom/github/barteksc/pdfviewer/PDFView;Ln1/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->setOnDrawAllListener(Ln1/a;)V

    return-void
.end method

.method static synthetic h(Lcom/github/barteksc/pdfviewer/PDFView;Lq1/a;Ljava/lang/String;Ln1/c;Ln1/b;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/github/barteksc/pdfviewer/PDFView;->I(Lq1/a;Ljava/lang/String;Ln1/c;Ln1/b;)V

    return-void
.end method

.method static synthetic i(Lcom/github/barteksc/pdfviewer/PDFView;Ln1/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->setOnPageChangeListener(Ln1/d;)V

    return-void
.end method

.method static synthetic j(Lcom/github/barteksc/pdfviewer/PDFView;Ln1/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->setOnPageScrollListener(Ln1/f;)V

    return-void
.end method

.method static synthetic k(Lcom/github/barteksc/pdfviewer/PDFView;Ln1/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->setOnRenderListener(Ln1/g;)V

    return-void
.end method

.method static synthetic l(Lcom/github/barteksc/pdfviewer/PDFView;Ln1/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->setOnTapListener(Ln1/h;)V

    return-void
.end method

.method static synthetic m(Lcom/github/barteksc/pdfviewer/PDFView;Ln1/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->setOnPageErrorListener(Ln1/e;)V

    return-void
.end method

.method static synthetic n(Lcom/github/barteksc/pdfviewer/PDFView;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->setDefaultPage(I)V

    return-void
.end method

.method static synthetic o(Lcom/github/barteksc/pdfviewer/PDFView;Lp1/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->setScrollHandle(Lp1/a;)V

    return-void
.end method

.method private q()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->v:Lcom/github/barteksc/pdfviewer/PDFView$d;

    sget-object v1, Lcom/github/barteksc/pdfviewer/PDFView$d;->a:Lcom/github/barteksc/pdfviewer/PDFView$d;

    if-eq v0, v1, :cond_2

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v1

    int-to-float v1, v1

    .line 3
    iget v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->n:I

    int-to-float v2, v2

    iget v3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->o:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    div-float v3, v0, v2

    float-to-double v3, v3

    .line 4
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    move-result-wide v3

    double-to-float v3, v3

    cmpl-float v4, v3, v1

    if-lez v4, :cond_1

    mul-float v2, v2, v1

    float-to-double v2, v2

    .line 5
    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-float v0, v2

    goto :goto_0

    :cond_1
    move v1, v3

    .line 6
    :goto_0
    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    .line 7
    iput v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    :cond_2
    :goto_1
    return-void
.end method

.method private r(I)F
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->N:Z

    if-eqz v0, :cond_0

    int-to-float v0, p1

    .line 2
    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    mul-float v0, v0, v1

    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->e0:I

    mul-int p1, p1, v1

    int-to-float p1, p1

    add-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->Y(F)F

    move-result p1

    return p1

    :cond_0
    int-to-float v0, p1

    .line 3
    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    mul-float v0, v0, v1

    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->e0:I

    mul-int p1, p1, v1

    int-to-float p1, p1

    add-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->Y(F)F

    move-result p1

    return p1
.end method

.method private s(I)I
    .locals 2

    if-gtz p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->h:[I

    if-eqz v0, :cond_1

    .line 2
    array-length v1, v0

    if-lt p1, v1, :cond_2

    .line 3
    array-length p1, v0

    add-int/lit8 p1, p1, -0x1

    return p1

    .line 4
    :cond_1
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->k:I

    if-lt p1, v0, :cond_2

    add-int/lit8 v0, v0, -0x1

    return v0

    :cond_2
    return p1
.end method

.method private setDefaultPage(I)V
    .locals 0

    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->M:I

    return-void
.end method

.method private setInvalidPageColor(I)V
    .locals 0

    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->L:I

    return-void
.end method

.method private setOnDrawAllListener(Ln1/a;)V
    .locals 0

    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->F:Ln1/a;

    return-void
.end method

.method private setOnDrawListener(Ln1/a;)V
    .locals 0

    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->E:Ln1/a;

    return-void
.end method

.method private setOnPageChangeListener(Ln1/d;)V
    .locals 0

    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->C:Ln1/d;

    return-void
.end method

.method private setOnPageErrorListener(Ln1/e;)V
    .locals 0

    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->I:Ln1/e;

    return-void
.end method

.method private setOnPageScrollListener(Ln1/f;)V
    .locals 0

    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->D:Ln1/f;

    return-void
.end method

.method private setOnRenderListener(Ln1/g;)V
    .locals 0

    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->G:Ln1/g;

    return-void
.end method

.method private setOnTapListener(Ln1/h;)V
    .locals 0

    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->H:Ln1/h;

    return-void
.end method

.method private setScrollHandle(Lp1/a;)V
    .locals 0

    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->U:Lp1/a;

    return-void
.end method

.method private setSpacing(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lr1/d;->a(Landroid/content/Context;I)I

    move-result p1

    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->e0:I

    return-void
.end method

.method private v(Landroid/graphics/Canvas;Lo1/a;)V
    .locals 12

    .line 1
    invoke-virtual {p2}, Lo1/a;->d()Landroid/graphics/RectF;

    move-result-object v0

    .line 2
    invoke-virtual {p2}, Lo1/a;->e()Landroid/graphics/Bitmap;

    move-result-object v1

    .line 3
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    .line 4
    :cond_0
    iget-boolean v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->N:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {p2}, Lo1/a;->f()I

    move-result v2

    invoke-direct {p0, v2}, Lcom/github/barteksc/pdfviewer/PDFView;->r(I)F

    move-result v2

    move v4, v2

    const/4 v2, 0x0

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p2}, Lo1/a;->f()I

    move-result v2

    invoke-direct {p0, v2}, Lcom/github/barteksc/pdfviewer/PDFView;->r(I)F

    move-result v2

    const/4 v4, 0x0

    .line 7
    :goto_0
    invoke-virtual {p1, v2, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 8
    new-instance v5, Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    .line 9
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    const/4 v8, 0x0

    invoke-direct {v5, v8, v8, v6, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 10
    iget v6, v0, Landroid/graphics/RectF;->left:F

    iget v7, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    mul-float v6, v6, v7

    invoke-virtual {p0, v6}, Lcom/github/barteksc/pdfviewer/PDFView;->Y(F)F

    move-result v6

    .line 11
    iget v7, v0, Landroid/graphics/RectF;->top:F

    iget v8, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    mul-float v7, v7, v8

    invoke-virtual {p0, v7}, Lcom/github/barteksc/pdfviewer/PDFView;->Y(F)F

    move-result v7

    .line 12
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v8

    iget v9, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    mul-float v8, v8, v9

    invoke-virtual {p0, v8}, Lcom/github/barteksc/pdfviewer/PDFView;->Y(F)F

    move-result v8

    .line 13
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    iget v9, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    mul-float v0, v0, v9

    invoke-virtual {p0, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->Y(F)F

    move-result v0

    .line 14
    new-instance v9, Landroid/graphics/RectF;

    float-to-int v10, v6

    int-to-float v10, v10

    float-to-int v11, v7

    int-to-float v11, v11

    add-float/2addr v6, v8

    float-to-int v6, v6

    int-to-float v6, v6

    add-float/2addr v7, v0

    float-to-int v0, v7

    int-to-float v0, v0

    invoke-direct {v9, v10, v11, v6, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 15
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    add-float/2addr v0, v2

    .line 16
    iget v6, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    add-float/2addr v6, v4

    .line 17
    iget v7, v9, Landroid/graphics/RectF;->left:F

    add-float/2addr v7, v0

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v8

    int-to-float v8, v8

    cmpl-float v7, v7, v8

    if-gez v7, :cond_5

    iget v7, v9, Landroid/graphics/RectF;->right:F

    add-float/2addr v0, v7

    cmpg-float v0, v0, v3

    if-lez v0, :cond_5

    iget v0, v9, Landroid/graphics/RectF;->top:F

    add-float/2addr v0, v6

    .line 18
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v7

    int-to-float v7, v7

    cmpl-float v0, v0, v7

    if-gez v0, :cond_5

    iget v0, v9, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v6, v0

    cmpg-float v0, v6, v3

    if-gtz v0, :cond_2

    goto :goto_2

    .line 19
    :cond_2
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->J:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v5, v9, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 20
    sget-boolean v0, Lr1/b;->a:Z

    if-eqz v0, :cond_4

    .line 21
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->K:Landroid/graphics/Paint;

    invoke-virtual {p2}, Lo1/a;->f()I

    move-result p2

    rem-int/lit8 p2, p2, 0x2

    if-nez p2, :cond_3

    const/high16 p2, -0x10000

    goto :goto_1

    :cond_3
    const p2, -0xffff01

    :goto_1
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 22
    iget-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->K:Landroid/graphics/Paint;

    invoke-virtual {p1, v9, p2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :cond_4
    neg-float p2, v2

    neg-float v0, v4

    .line 23
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->translate(FF)V

    return-void

    :cond_5
    :goto_2
    neg-float p2, v2

    neg-float v0, v4

    .line 24
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->translate(FF)V

    return-void
.end method

.method private w(Landroid/graphics/Canvas;ILn1/a;)V
    .locals 4

    if-eqz p3, :cond_1

    .line 1
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->N:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0, p2}, Lcom/github/barteksc/pdfviewer/PDFView;->r(I)F

    move-result v0

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0, p2}, Lcom/github/barteksc/pdfviewer/PDFView;->r(I)F

    move-result v0

    move v1, v0

    const/4 v0, 0x0

    .line 4
    :goto_0
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 5
    iget v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    .line 6
    invoke-virtual {p0, v2}, Lcom/github/barteksc/pdfviewer/PDFView;->Y(F)F

    move-result v2

    iget v3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    .line 7
    invoke-virtual {p0, v3}, Lcom/github/barteksc/pdfviewer/PDFView;->Y(F)F

    move-result v3

    .line 8
    invoke-interface {p3, p1, v2, v3, p2}, Ln1/a;->a(Landroid/graphics/Canvas;FFI)V

    neg-float p2, v1

    neg-float p3, v0

    .line 9
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->translate(FF)V

    :cond_1
    return-void
.end method


# virtual methods
.method public A(Z)V
    .locals 1

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->g:Lcom/github/barteksc/pdfviewer/d;

    invoke-virtual {v0, p1}, Lcom/github/barteksc/pdfviewer/d;->e(Z)V

    return-void
.end method

.method public B(Ljava/io/File;)Lcom/github/barteksc/pdfviewer/PDFView$b;
    .locals 2

    new-instance v0, Lcom/github/barteksc/pdfviewer/PDFView$b;

    new-instance v1, Lq1/b;

    invoke-direct {v1, p1}, Lq1/b;-><init>(Ljava/io/File;)V

    const/4 p1, 0x0

    invoke-direct {v0, p0, v1, p1}, Lcom/github/barteksc/pdfviewer/PDFView$b;-><init>(Lcom/github/barteksc/pdfviewer/PDFView;Lq1/a;Lcom/github/barteksc/pdfviewer/PDFView$a;)V

    return-object v0
.end method

.method public C()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->a0:Z

    return v0
.end method

.method public D()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->W:Z

    return v0
.end method

.method public E()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->N:Z

    return v0
.end method

.method public F()Z
    .locals 2

    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->t:F

    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->a:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public G(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->H(IZ)V

    return-void
.end method

.method public H(IZ)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->r(I)F

    move-result v0

    neg-float v0, v0

    .line 2
    iget-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->N:Z

    if-eqz v1, :cond_1

    if-eqz p2, :cond_0

    .line 3
    iget-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->f:Lcom/github/barteksc/pdfviewer/a;

    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    invoke-virtual {p2, v1, v0}, Lcom/github/barteksc/pdfviewer/a;->g(FF)V

    goto :goto_0

    .line 4
    :cond_0
    iget p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    invoke-virtual {p0, p2, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->P(FF)V

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    .line 5
    iget-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->f:Lcom/github/barteksc/pdfviewer/a;

    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    invoke-virtual {p2, v1, v0}, Lcom/github/barteksc/pdfviewer/a;->f(FF)V

    goto :goto_0

    .line 6
    :cond_2
    iget p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    invoke-virtual {p0, v0, p2}, Lcom/github/barteksc/pdfviewer/PDFView;->P(FF)V

    .line 7
    :goto_0
    invoke-virtual {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->X(I)V

    return-void
.end method

.method K(Lcom/shockwave/pdfium/a;II)V
    .locals 1

    .line 1
    sget-object v0, Lcom/github/barteksc/pdfviewer/PDFView$d;->b:Lcom/github/barteksc/pdfviewer/PDFView$d;

    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->v:Lcom/github/barteksc/pdfviewer/PDFView$d;

    .line 2
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->S:Lcom/shockwave/pdfium/PdfiumCore;

    invoke-virtual {v0, p1}, Lcom/shockwave/pdfium/PdfiumCore;->d(Lcom/shockwave/pdfium/a;)I

    move-result v0

    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->k:I

    .line 3
    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->T:Lcom/shockwave/pdfium/a;

    .line 4
    iput p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->n:I

    .line 5
    iput p3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->o:I

    .line 6
    invoke-direct {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->q()V

    .line 7
    new-instance p2, Lcom/github/barteksc/pdfviewer/e;

    invoke-direct {p2, p0}, Lcom/github/barteksc/pdfviewer/e;-><init>(Lcom/github/barteksc/pdfviewer/PDFView;)V

    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->z:Lcom/github/barteksc/pdfviewer/e;

    .line 8
    iget-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->x:Landroid/os/HandlerThread;

    invoke-virtual {p2}, Landroid/os/HandlerThread;->isAlive()Z

    move-result p2

    if-nez p2, :cond_0

    .line 9
    iget-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->x:Landroid/os/HandlerThread;

    invoke-virtual {p2}, Landroid/os/HandlerThread;->start()V

    .line 10
    :cond_0
    new-instance p2, Lcom/github/barteksc/pdfviewer/f;

    iget-object p3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->x:Landroid/os/HandlerThread;

    invoke-virtual {p3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p3

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->S:Lcom/shockwave/pdfium/PdfiumCore;

    invoke-direct {p2, p3, p0, v0, p1}, Lcom/github/barteksc/pdfviewer/f;-><init>(Landroid/os/Looper;Lcom/github/barteksc/pdfviewer/PDFView;Lcom/shockwave/pdfium/PdfiumCore;Lcom/shockwave/pdfium/a;)V

    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->y:Lcom/github/barteksc/pdfviewer/f;

    .line 11
    invoke-virtual {p2}, Lcom/github/barteksc/pdfviewer/f;->e()V

    .line 12
    iget-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->U:Lp1/a;

    if-eqz p1, :cond_1

    .line 13
    invoke-interface {p1, p0}, Lp1/a;->d(Lcom/github/barteksc/pdfviewer/PDFView;)V

    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->V:Z

    .line 15
    :cond_1
    iget-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->A:Ln1/c;

    if-eqz p1, :cond_2

    .line 16
    iget p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->k:I

    invoke-interface {p1, p2}, Ln1/c;->a(I)V

    .line 17
    :cond_2
    iget p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->M:I

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lcom/github/barteksc/pdfviewer/PDFView;->H(IZ)V

    return-void
.end method

.method L(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/github/barteksc/pdfviewer/PDFView$d;->d:Lcom/github/barteksc/pdfviewer/PDFView$d;

    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->v:Lcom/github/barteksc/pdfviewer/PDFView$d;

    .line 2
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->T()V

    .line 3
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->invalidate()V

    .line 4
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->B:Ln1/b;

    if-eqz v0, :cond_0

    .line 5
    invoke-interface {v0, p1}, Ln1/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    const-string v0, "PDFView"

    const-string v1, "load pdf error"

    .line 6
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method M()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->getPageCount()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->e0:I

    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->getPageCount()I

    move-result v1

    div-int v1, v0, v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    .line 3
    iget-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->N:Z

    const/high16 v2, 0x40000000    # 2.0f

    if-eqz v1, :cond_1

    .line 4
    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    .line 5
    iget v3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    add-float/2addr v3, v0

    .line 6
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v0

    goto :goto_0

    .line 7
    :cond_1
    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    .line 8
    iget v3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    add-float/2addr v3, v0

    .line 9
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v0

    :goto_0
    int-to-float v0, v0

    div-float/2addr v0, v2

    .line 10
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    add-float/2addr v1, v0

    invoke-virtual {p0, v3}, Lcom/github/barteksc/pdfviewer/PDFView;->Y(F)F

    move-result v0

    div-float/2addr v1, v0

    float-to-double v0, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v0, v0

    if-ltz v0, :cond_2

    .line 11
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->getPageCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-gt v0, v1, :cond_2

    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->getCurrentPage()I

    move-result v1

    if-eq v0, v1, :cond_2

    .line 12
    invoke-virtual {p0, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->X(I)V

    goto :goto_1

    .line 13
    :cond_2
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->N()V

    :goto_1
    return-void
.end method

.method public N()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->y:Lcom/github/barteksc/pdfviewer/f;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 3
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->e:Lcom/github/barteksc/pdfviewer/b;

    invoke-virtual {v0}, Lcom/github/barteksc/pdfviewer/b;->h()V

    .line 4
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->z:Lcom/github/barteksc/pdfviewer/e;

    invoke-virtual {v0}, Lcom/github/barteksc/pdfviewer/e;->e()V

    .line 5
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->U()V

    :cond_1
    :goto_0
    return-void
.end method

.method public O(FF)V
    .locals 1

    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    add-float/2addr v0, p1

    iget p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    add-float/2addr p1, p2

    invoke-virtual {p0, v0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->P(FF)V

    return-void
.end method

.method public P(FF)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->Q(FFZ)V

    return-void
.end method

.method public Q(FFZ)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->N:Z

    const/high16 v1, 0x40000000    # 2.0f

    const/4 v2, 0x0

    if-eqz v0, :cond_8

    .line 2
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    invoke-virtual {p0, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->Y(F)F

    move-result v0

    .line 3
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v3

    int-to-float v3, v3

    cmpg-float v3, v0, v3

    if-gez v3, :cond_0

    .line 4
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    int-to-float p1, p1

    div-float/2addr v0, v1

    :goto_0
    sub-float/2addr p1, v0

    goto :goto_1

    :cond_0
    cmpl-float v3, p1, v2

    if-lez v3, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    add-float v3, p1, v0

    .line 5
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v4

    int-to-float v4, v4

    cmpg-float v3, v3, v4

    if-gez v3, :cond_2

    .line 6
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result p1

    int-to-float p1, p1

    goto :goto_0

    .line 7
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->p()F

    move-result v0

    .line 8
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v3

    int-to-float v3, v3

    cmpg-float v3, v0, v3

    if-gez v3, :cond_3

    .line 9
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result p2

    int-to-float p2, p2

    sub-float/2addr p2, v0

    div-float/2addr p2, v1

    goto :goto_2

    :cond_3
    cmpl-float v1, p2, v2

    if-lez v1, :cond_4

    const/4 p2, 0x0

    goto :goto_2

    :cond_4
    add-float v1, p2, v0

    .line 10
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v2

    int-to-float v2, v2

    cmpg-float v1, v1, v2

    if-gez v1, :cond_5

    neg-float p2, v0

    .line 11
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr p2, v0

    .line 12
    :cond_5
    :goto_2
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    cmpg-float v1, p2, v0

    if-gez v1, :cond_6

    .line 13
    sget-object v0, Lcom/github/barteksc/pdfviewer/PDFView$c;->c:Lcom/github/barteksc/pdfviewer/PDFView$c;

    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->d:Lcom/github/barteksc/pdfviewer/PDFView$c;

    goto/16 :goto_6

    :cond_6
    cmpl-float v0, p2, v0

    if-lez v0, :cond_7

    .line 14
    sget-object v0, Lcom/github/barteksc/pdfviewer/PDFView$c;->b:Lcom/github/barteksc/pdfviewer/PDFView$c;

    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->d:Lcom/github/barteksc/pdfviewer/PDFView$c;

    goto/16 :goto_6

    .line 15
    :cond_7
    sget-object v0, Lcom/github/barteksc/pdfviewer/PDFView$c;->a:Lcom/github/barteksc/pdfviewer/PDFView$c;

    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->d:Lcom/github/barteksc/pdfviewer/PDFView$c;

    goto/16 :goto_6

    .line 16
    :cond_8
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    invoke-virtual {p0, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->Y(F)F

    move-result v0

    .line 17
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v3

    int-to-float v3, v3

    cmpg-float v3, v0, v3

    if-gez v3, :cond_9

    .line 18
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result p2

    div-int/lit8 p2, p2, 0x2

    int-to-float p2, p2

    div-float/2addr v0, v1

    :goto_3
    sub-float/2addr p2, v0

    goto :goto_4

    :cond_9
    cmpl-float v3, p2, v2

    if-lez v3, :cond_a

    const/4 p2, 0x0

    goto :goto_4

    :cond_a
    add-float v3, p2, v0

    .line 19
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v4

    int-to-float v4, v4

    cmpg-float v3, v3, v4

    if-gez v3, :cond_b

    .line 20
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result p2

    int-to-float p2, p2

    goto :goto_3

    .line 21
    :cond_b
    :goto_4
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->p()F

    move-result v0

    .line 22
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v3

    int-to-float v3, v3

    cmpg-float v3, v0, v3

    if-gez v3, :cond_c

    .line 23
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result p1

    int-to-float p1, p1

    sub-float/2addr p1, v0

    div-float/2addr p1, v1

    goto :goto_5

    :cond_c
    cmpl-float v1, p1, v2

    if-lez v1, :cond_d

    const/4 p1, 0x0

    goto :goto_5

    :cond_d
    add-float v1, p1, v0

    .line 24
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v2

    int-to-float v2, v2

    cmpg-float v1, v1, v2

    if-gez v1, :cond_e

    neg-float p1, v0

    .line 25
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr p1, v0

    .line 26
    :cond_e
    :goto_5
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    cmpg-float v1, p1, v0

    if-gez v1, :cond_f

    .line 27
    sget-object v0, Lcom/github/barteksc/pdfviewer/PDFView$c;->c:Lcom/github/barteksc/pdfviewer/PDFView$c;

    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->d:Lcom/github/barteksc/pdfviewer/PDFView$c;

    goto :goto_6

    :cond_f
    cmpl-float v0, p1, v0

    if-lez v0, :cond_10

    .line 28
    sget-object v0, Lcom/github/barteksc/pdfviewer/PDFView$c;->b:Lcom/github/barteksc/pdfviewer/PDFView$c;

    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->d:Lcom/github/barteksc/pdfviewer/PDFView$c;

    goto :goto_6

    .line 29
    :cond_10
    sget-object v0, Lcom/github/barteksc/pdfviewer/PDFView$c;->a:Lcom/github/barteksc/pdfviewer/PDFView$c;

    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->d:Lcom/github/barteksc/pdfviewer/PDFView$c;

    .line 30
    :goto_6
    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    .line 31
    iput p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    .line 32
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->getPositionOffset()F

    move-result p1

    if-eqz p3, :cond_11

    .line 33
    iget-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->U:Lp1/a;

    if-eqz p2, :cond_11

    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->u()Z

    move-result p2

    if-nez p2, :cond_11

    .line 34
    iget-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->U:Lp1/a;

    invoke-interface {p2, p1}, Lp1/a;->f(F)V

    .line 35
    :cond_11
    iget-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->D:Ln1/f;

    if-eqz p2, :cond_12

    .line 36
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->getCurrentPage()I

    move-result p3

    invoke-interface {p2, p3, p1}, Ln1/f;->a(IF)V

    .line 37
    :cond_12
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->U()V

    return-void
.end method

.method public R(Lo1/a;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->v:Lcom/github/barteksc/pdfviewer/PDFView$d;

    sget-object v1, Lcom/github/barteksc/pdfviewer/PDFView$d;->b:Lcom/github/barteksc/pdfviewer/PDFView$d;

    if-ne v0, v1, :cond_0

    .line 2
    sget-object v0, Lcom/github/barteksc/pdfviewer/PDFView$d;->c:Lcom/github/barteksc/pdfviewer/PDFView$d;

    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->v:Lcom/github/barteksc/pdfviewer/PDFView$d;

    .line 3
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->G:Ln1/g;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->getPageCount()I

    move-result v1

    iget v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    iget v3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    invoke-interface {v0, v1, v2, v3}, Ln1/g;->a(IFF)V

    .line 5
    :cond_0
    invoke-virtual {p1}, Lo1/a;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->e:Lcom/github/barteksc/pdfviewer/b;

    invoke-virtual {v0, p1}, Lcom/github/barteksc/pdfviewer/b;->b(Lo1/a;)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->e:Lcom/github/barteksc/pdfviewer/b;

    invoke-virtual {v0, p1}, Lcom/github/barteksc/pdfviewer/b;->a(Lo1/a;)V

    .line 8
    :goto_0
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->U()V

    return-void
.end method

.method S(Lm1/a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->I:Ln1/e;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lm1/a;->a()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ln1/e;->a(ILjava/lang/Throwable;)V

    goto :goto_0

    .line 3
    :cond_0
    sget-object v0, Lcom/github/barteksc/pdfviewer/PDFView;->g0:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot open page "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lm1/a;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public T()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->f:Lcom/github/barteksc/pdfviewer/a;

    invoke-virtual {v0}, Lcom/github/barteksc/pdfviewer/a;->i()V

    .line 2
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->y:Lcom/github/barteksc/pdfviewer/f;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/github/barteksc/pdfviewer/f;->f()V

    .line 4
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->y:Lcom/github/barteksc/pdfviewer/f;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->w:Lcom/github/barteksc/pdfviewer/c;

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->e:Lcom/github/barteksc/pdfviewer/b;

    invoke-virtual {v0}, Lcom/github/barteksc/pdfviewer/b;->i()V

    .line 8
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->U:Lp1/a;

    if-eqz v0, :cond_2

    iget-boolean v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->V:Z

    if-eqz v2, :cond_2

    .line 9
    invoke-interface {v0}, Lp1/a;->c()V

    .line 10
    :cond_2
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->S:Lcom/shockwave/pdfium/PdfiumCore;

    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->T:Lcom/shockwave/pdfium/a;

    if-eqz v2, :cond_3

    .line 11
    invoke-virtual {v0, v2}, Lcom/shockwave/pdfium/PdfiumCore;->a(Lcom/shockwave/pdfium/a;)V

    :cond_3
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->y:Lcom/github/barteksc/pdfviewer/f;

    .line 13
    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->h:[I

    .line 14
    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->i:[I

    .line 15
    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->j:[I

    .line 16
    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->T:Lcom/shockwave/pdfium/a;

    .line 17
    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->U:Lp1/a;

    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->V:Z

    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    const/high16 v0, 0x3f800000    # 1.0f

    .line 20
    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->t:F

    .line 21
    iput-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->u:Z

    .line 22
    sget-object v0, Lcom/github/barteksc/pdfviewer/PDFView$d;->a:Lcom/github/barteksc/pdfviewer/PDFView$d;

    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->v:Lcom/github/barteksc/pdfviewer/PDFView$d;

    return-void
.end method

.method U()V
    .locals 0

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->invalidate()V

    return-void
.end method

.method public V()V
    .locals 1

    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->a:F

    invoke-virtual {p0, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->c0(F)V

    return-void
.end method

.method public W(FZ)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->N:Z

    if-eqz v0, :cond_0

    .line 2
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->p()F

    move-result v1

    neg-float v1, v1

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    mul-float v1, v1, p1

    invoke-virtual {p0, v0, v1, p2}, Lcom/github/barteksc/pdfviewer/PDFView;->Q(FFZ)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->p()F

    move-result v0

    neg-float v0, v0

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    mul-float v0, v0, p1

    iget p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    invoke-virtual {p0, v0, p1, p2}, Lcom/github/barteksc/pdfviewer/PDFView;->Q(FFZ)V

    .line 4
    :goto_0
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->M()V

    return-void
.end method

.method X(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->u:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->s(I)I

    move-result p1

    .line 3
    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->l:I

    .line 4
    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->m:I

    .line 5
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->j:[I

    if-eqz v0, :cond_1

    if-ltz p1, :cond_1

    .line 6
    array-length v1, v0

    if-ge p1, v1, :cond_1

    .line 7
    aget p1, v0, p1

    .line 8
    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->m:I

    .line 9
    :cond_1
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->N()V

    .line 10
    iget-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->U:Lp1/a;

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->u()Z

    move-result p1

    if-nez p1, :cond_2

    .line 11
    iget-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->U:Lp1/a;

    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->l:I

    add-int/lit8 v0, v0, 0x1

    invoke-interface {p1, v0}, Lp1/a;->a(I)V

    .line 12
    :cond_2
    iget-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->C:Ln1/d;

    if-eqz p1, :cond_3

    .line 13
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->l:I

    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->getPageCount()I

    move-result v1

    invoke-interface {p1, v0, v1}, Ln1/d;->a(II)V

    :cond_3
    return-void
.end method

.method public Y(F)F
    .locals 1

    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->t:F

    mul-float p1, p1, v0

    return p1
.end method

.method public Z(FLandroid/graphics/PointF;)V
    .locals 1

    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->t:F

    mul-float v0, v0, p1

    invoke-virtual {p0, v0, p2}, Lcom/github/barteksc/pdfviewer/PDFView;->a0(FLandroid/graphics/PointF;)V

    return-void
.end method

.method public a0(FLandroid/graphics/PointF;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->t:F

    div-float v0, p1, v0

    .line 2
    invoke-virtual {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->b0(F)V

    .line 3
    iget p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    mul-float p1, p1, v0

    .line 4
    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    mul-float v1, v1, v0

    .line 5
    iget v2, p2, Landroid/graphics/PointF;->x:F

    mul-float v3, v2, v0

    sub-float/2addr v2, v3

    add-float/2addr p1, v2

    .line 6
    iget p2, p2, Landroid/graphics/PointF;->y:F

    mul-float v0, v0, p2

    sub-float/2addr p2, v0

    add-float/2addr v1, p2

    .line 7
    invoke-virtual {p0, p1, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->P(FF)V

    return-void
.end method

.method public b0(F)V
    .locals 0

    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->t:F

    return-void
.end method

.method public c0(F)V
    .locals 4

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->f:Lcom/github/barteksc/pdfviewer/a;

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    iget v3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->t:F

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/github/barteksc/pdfviewer/a;->h(FFFF)V

    return-void
.end method

.method public canScrollHorizontally(I)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->N:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    if-gez p1, :cond_0

    .line 2
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    return v2

    :cond_0
    if-lez p1, :cond_3

    .line 3
    iget p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    invoke-virtual {p0, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->Y(F)F

    move-result v0

    add-float/2addr p1, v0

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v0

    int-to-float v0, v0

    cmpl-float p1, p1, v0

    if-lez p1, :cond_3

    return v2

    :cond_1
    if-gez p1, :cond_2

    .line 4
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    return v2

    :cond_2
    if-lez p1, :cond_3

    .line 5
    iget p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->p()F

    move-result v0

    add-float/2addr p1, v0

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v0

    int-to-float v0, v0

    cmpl-float p1, p1, v0

    if-lez p1, :cond_3

    return v2

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public canScrollVertically(I)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->N:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    if-gez p1, :cond_0

    .line 2
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    return v2

    :cond_0
    if-lez p1, :cond_3

    .line 3
    iget p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->p()F

    move-result v0

    add-float/2addr p1, v0

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v0

    int-to-float v0, v0

    cmpl-float p1, p1, v0

    if-lez p1, :cond_3

    return v2

    :cond_1
    if-gez p1, :cond_2

    .line 4
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    return v2

    :cond_2
    if-lez p1, :cond_3

    .line 5
    iget p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    invoke-virtual {p0, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->Y(F)F

    move-result v0

    add-float/2addr p1, v0

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v0

    int-to-float v0, v0

    cmpl-float p1, p1, v0

    if-lez p1, :cond_3

    return v2

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public computeScroll()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/RelativeLayout;->computeScroll()V

    .line 2
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->f:Lcom/github/barteksc/pdfviewer/a;

    invoke-virtual {v0}, Lcom/github/barteksc/pdfviewer/a;->c()V

    return-void
.end method

.method public d0(FFF)V
    .locals 2

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->f:Lcom/github/barteksc/pdfviewer/a;

    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->t:F

    invoke-virtual {v0, p1, p2, v1, p3}, Lcom/github/barteksc/pdfviewer/a;->h(FFFF)V

    return-void
.end method

.method public getCurrentPage()I
    .locals 1

    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->l:I

    return v0
.end method

.method public getCurrentXOffset()F
    .locals 1

    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    return v0
.end method

.method public getCurrentYOffset()F
    .locals 1

    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    return v0
.end method

.method public getDocumentMeta()Lcom/shockwave/pdfium/a$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->T:Lcom/shockwave/pdfium/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->S:Lcom/shockwave/pdfium/PdfiumCore;

    invoke-virtual {v1, v0}, Lcom/shockwave/pdfium/PdfiumCore;->b(Lcom/shockwave/pdfium/a;)Lcom/shockwave/pdfium/a$b;

    move-result-object v0

    return-object v0
.end method

.method getDocumentPageCount()I
    .locals 1

    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->k:I

    return v0
.end method

.method getFilteredUserPageIndexes()[I
    .locals 1

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->j:[I

    return-object v0
.end method

.method getFilteredUserPages()[I
    .locals 1

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->i:[I

    return-object v0
.end method

.method public getInvalidPageColor()I
    .locals 1

    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->L:I

    return v0
.end method

.method public getMaxZoom()F
    .locals 1

    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->c:F

    return v0
.end method

.method public getMidZoom()F
    .locals 1

    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->b:F

    return v0
.end method

.method public getMinZoom()F
    .locals 1

    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->a:F

    return v0
.end method

.method getOnPageChangeListener()Ln1/d;
    .locals 1

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->C:Ln1/d;

    return-object v0
.end method

.method getOnPageScrollListener()Ln1/f;
    .locals 1

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->D:Ln1/f;

    return-object v0
.end method

.method getOnRenderListener()Ln1/g;
    .locals 1

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->G:Ln1/g;

    return-object v0
.end method

.method getOnTapListener()Ln1/h;
    .locals 1

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->H:Ln1/h;

    return-object v0
.end method

.method public getOptimalPageHeight()F
    .locals 1

    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    return v0
.end method

.method public getOptimalPageWidth()F
    .locals 1

    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    return v0
.end method

.method getOriginalUserPages()[I
    .locals 1

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->h:[I

    return-object v0
.end method

.method public getPageCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->h:[I

    if-eqz v0, :cond_0

    .line 2
    array-length v0, v0

    return v0

    .line 3
    :cond_0
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->k:I

    return v0
.end method

.method public getPositionOffset()F
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->N:Z

    if-eqz v0, :cond_0

    .line 2
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    neg-float v0, v0

    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->p()F

    move-result v1

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v2

    goto :goto_0

    .line 3
    :cond_0
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    neg-float v0, v0

    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->p()F

    move-result v1

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v2

    :goto_0
    int-to-float v2, v2

    sub-float/2addr v1, v2

    div-float/2addr v0, v1

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    .line 4
    invoke-static {v0, v1, v2}, Lr1/c;->c(FFF)F

    move-result v0

    return v0
.end method

.method getScrollDir()Lcom/github/barteksc/pdfviewer/PDFView$c;
    .locals 1

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->d:Lcom/github/barteksc/pdfviewer/PDFView$c;

    return-object v0
.end method

.method getScrollHandle()Lp1/a;
    .locals 1

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->U:Lp1/a;

    return-object v0
.end method

.method getSpacingPx()I
    .locals 1

    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->e0:I

    return v0
.end method

.method public getTableOfContents()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/shockwave/pdfium/a$a;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->T:Lcom/shockwave/pdfium/a;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->S:Lcom/shockwave/pdfium/PdfiumCore;

    invoke-virtual {v1, v0}, Lcom/shockwave/pdfium/PdfiumCore;->g(Lcom/shockwave/pdfium/a;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getZoom()F
    .locals 1

    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->t:F

    return v0
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->T()V

    .line 2
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onDetachedFromWindow()V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->c0:Z

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->d0:Landroid/graphics/PaintFlagsDrawFilter;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 4
    :cond_1
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_2

    const/4 v0, -0x1

    .line 5
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    goto :goto_0

    .line 6
    :cond_2
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 7
    :goto_0
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->u:Z

    if-eqz v0, :cond_3

    return-void

    .line 8
    :cond_3
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->v:Lcom/github/barteksc/pdfviewer/PDFView$d;

    sget-object v1, Lcom/github/barteksc/pdfviewer/PDFView$d;->c:Lcom/github/barteksc/pdfviewer/PDFView$d;

    if-eq v0, v1, :cond_4

    return-void

    .line 9
    :cond_4
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    .line 10
    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    .line 11
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 12
    iget-object v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->e:Lcom/github/barteksc/pdfviewer/b;

    invoke-virtual {v2}, Lcom/github/barteksc/pdfviewer/b;->f()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo1/a;

    .line 13
    invoke-direct {p0, p1, v3}, Lcom/github/barteksc/pdfviewer/PDFView;->v(Landroid/graphics/Canvas;Lo1/a;)V

    goto :goto_1

    .line 14
    :cond_5
    iget-object v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->e:Lcom/github/barteksc/pdfviewer/b;

    invoke-virtual {v2}, Lcom/github/barteksc/pdfviewer/b;->e()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo1/a;

    .line 15
    invoke-direct {p0, p1, v3}, Lcom/github/barteksc/pdfviewer/PDFView;->v(Landroid/graphics/Canvas;Lo1/a;)V

    .line 16
    iget-object v4, p0, Lcom/github/barteksc/pdfviewer/PDFView;->F:Ln1/a;

    if-eqz v4, :cond_6

    iget-object v4, p0, Lcom/github/barteksc/pdfviewer/PDFView;->f0:Ljava/util/List;

    invoke-virtual {v3}, Lo1/a;->f()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    .line 17
    iget-object v4, p0, Lcom/github/barteksc/pdfviewer/PDFView;->f0:Ljava/util/List;

    invoke-virtual {v3}, Lo1/a;->f()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 18
    :cond_7
    iget-object v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->f0:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    .line 19
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, Lcom/github/barteksc/pdfviewer/PDFView;->F:Ln1/a;

    invoke-direct {p0, p1, v3, v4}, Lcom/github/barteksc/pdfviewer/PDFView;->w(Landroid/graphics/Canvas;ILn1/a;)V

    goto :goto_3

    .line 20
    :cond_8
    iget-object v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->f0:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 21
    iget v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->l:I

    iget-object v3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->E:Ln1/a;

    invoke-direct {p0, p1, v2, v3}, Lcom/github/barteksc/pdfviewer/PDFView;->w(Landroid/graphics/Canvas;ILn1/a;)V

    neg-float v0, v0

    neg-float v1, v1

    .line 22
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->isInEditMode()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->v:Lcom/github/barteksc/pdfviewer/PDFView$d;

    sget-object p2, Lcom/github/barteksc/pdfviewer/PDFView$d;->c:Lcom/github/barteksc/pdfviewer/PDFView$d;

    if-eq p1, p2, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->f:Lcom/github/barteksc/pdfviewer/a;

    invoke-virtual {p1}, Lcom/github/barteksc/pdfviewer/a;->i()V

    .line 3
    invoke-direct {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->q()V

    .line 4
    iget-boolean p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->N:Z

    if-eqz p1, :cond_1

    .line 5
    iget p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    iget p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->l:I

    invoke-direct {p0, p2}, Lcom/github/barteksc/pdfviewer/PDFView;->r(I)F

    move-result p2

    neg-float p2, p2

    invoke-virtual {p0, p1, p2}, Lcom/github/barteksc/pdfviewer/PDFView;->P(FF)V

    goto :goto_0

    .line 6
    :cond_1
    iget p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->l:I

    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->r(I)F

    move-result p1

    neg-float p1, p1

    iget p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    invoke-virtual {p0, p1, p2}, Lcom/github/barteksc/pdfviewer/PDFView;->P(FF)V

    .line 7
    :goto_0
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->M()V

    :cond_2
    :goto_1
    return-void
.end method

.method p()F
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->getPageCount()I

    move-result v0

    .line 2
    iget-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->N:Z

    if-eqz v1, :cond_0

    int-to-float v1, v0

    .line 3
    iget v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    mul-float v1, v1, v2

    add-int/lit8 v0, v0, -0x1

    iget v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->e0:I

    mul-int v0, v0, v2

    int-to-float v0, v0

    add-float/2addr v1, v0

    invoke-virtual {p0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->Y(F)F

    move-result v0

    return v0

    :cond_0
    int-to-float v1, v0

    .line 4
    iget v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    mul-float v1, v1, v2

    add-int/lit8 v0, v0, -0x1

    iget v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->e0:I

    mul-int v0, v0, v2

    int-to-float v0, v0

    add-float/2addr v1, v0

    invoke-virtual {p0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->Y(F)F

    move-result v0

    return v0
.end method

.method public setMaxZoom(F)V
    .locals 0

    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->c:F

    return-void
.end method

.method public setMidZoom(F)V
    .locals 0

    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->b:F

    return-void
.end method

.method public setMinZoom(F)V
    .locals 0

    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->a:F

    return-void
.end method

.method public setPositionOffset(F)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->W(FZ)V

    return-void
.end method

.method public setSwipeVertical(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->N:Z

    return-void
.end method

.method public t()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->b0:Z

    return v0
.end method

.method public u()Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->getPageCount()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    .line 2
    iget v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->e0:I

    mul-int v1, v1, v2

    .line 3
    iget-boolean v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->N:Z

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    int-to-float v0, v0

    .line 4
    iget v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    mul-float v0, v0, v2

    int-to-float v1, v1

    add-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    const/4 v3, 0x1

    :cond_0
    return v3

    :cond_1
    int-to-float v0, v0

    .line 5
    iget v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    mul-float v0, v0, v2

    int-to-float v1, v1

    add-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    const/4 v3, 0x1

    :cond_2
    return v3
.end method

.method public x(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->a0:Z

    return-void
.end method

.method public y(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->c0:Z

    return-void
.end method

.method public z(Z)V
    .locals 1

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->g:Lcom/github/barteksc/pdfviewer/d;

    invoke-virtual {v0, p1}, Lcom/github/barteksc/pdfviewer/d;->a(Z)V

    return-void
.end method

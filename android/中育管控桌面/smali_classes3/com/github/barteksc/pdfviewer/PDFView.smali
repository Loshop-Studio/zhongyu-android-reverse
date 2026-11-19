.class public Lcom/github/barteksc/pdfviewer/PDFView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/github/barteksc/pdfviewer/PDFView$b;,
        Lcom/github/barteksc/pdfviewer/PDFView$State;,
        Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;
    }
.end annotation


# static fields
.field public static final U:Ljava/lang/String; = "PDFView"


# instance fields
.field public A:Li1/c;

.field public B:Li1/b;

.field public C:Li1/d;

.field public D:Li1/f;

.field public E:Li1/e;

.field public F:Landroid/graphics/Paint;

.field public G:Landroid/graphics/Paint;

.field public H:I

.field public I:I

.field public J:Z

.field public K:Lcom/shockwave/pdfium/PdfiumCore;

.field public L:Lcom/shockwave/pdfium/a;

.field public M:Z

.field public N:Z

.field public O:Z

.field public P:Z

.field public Q:Z

.field public R:Landroid/graphics/PaintFlagsDrawFilter;

.field public S:I

.field public T:Ljava/util/List;

.field public a:F

.field public b:F

.field public c:F

.field public d:Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;

.field public e:Lh1/b;

.field public f:Lh1/a;

.field public g:Lh1/d;

.field public h:[I

.field public i:[I

.field public j:[I

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:F

.field public q:F

.field public r:F

.field public s:F

.field public t:F

.field public u:Z

.field public v:Lcom/github/barteksc/pdfviewer/PDFView$State;

.field public w:Lh1/c;

.field public final x:Landroid/os/HandlerThread;

.field public y:Lh1/e;

.field public z:Lcom/github/barteksc/pdfviewer/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/high16 p2, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->a:F

    .line 7
    .line 8
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 9
    .line 10
    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->b:F

    .line 11
    .line 12
    const/high16 v0, 0x40400000    # 3.0f

    .line 13
    .line 14
    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->c:F

    .line 15
    .line 16
    sget-object v0, Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;->a:Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->d:Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    .line 22
    .line 23
    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    .line 24
    .line 25
    iput p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->t:F

    .line 26
    .line 27
    const/4 p2, 0x1

    .line 28
    iput-boolean p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->u:Z

    .line 29
    .line 30
    sget-object v0, Lcom/github/barteksc/pdfviewer/PDFView$State;->a:Lcom/github/barteksc/pdfviewer/PDFView$State;

    .line 31
    .line 32
    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->v:Lcom/github/barteksc/pdfviewer/PDFView$State;

    .line 33
    .line 34
    const/4 v0, -0x1

    .line 35
    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->H:I

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->I:I

    .line 39
    .line 40
    iput-boolean p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->J:Z

    .line 41
    .line 42
    iput-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->M:Z

    .line 43
    .line 44
    iput-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->N:Z

    .line 45
    .line 46
    iput-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->O:Z

    .line 47
    .line 48
    iput-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->P:Z

    .line 49
    .line 50
    iput-boolean p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->Q:Z

    .line 51
    .line 52
    new-instance p2, Landroid/graphics/PaintFlagsDrawFilter;

    .line 53
    .line 54
    const/4 v1, 0x3

    .line 55
    invoke-direct {p2, v0, v1}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    .line 56
    .line 57
    .line 58
    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->R:Landroid/graphics/PaintFlagsDrawFilter;

    .line 59
    .line 60
    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->S:I

    .line 61
    .line 62
    new-instance p2, Ljava/util/ArrayList;

    .line 63
    .line 64
    const/16 v1, 0xa

    .line 65
    .line 66
    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 67
    .line 68
    .line 69
    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->T:Ljava/util/List;

    .line 70
    .line 71
    new-instance p2, Landroid/os/HandlerThread;

    .line 72
    .line 73
    const-string v1, "PDF renderer"

    .line 74
    .line 75
    invoke-direct {p2, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->x:Landroid/os/HandlerThread;

    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    if-eqz p2, :cond_0

    .line 85
    .line 86
    return-void

    .line 87
    :cond_0
    new-instance p2, Lh1/b;

    .line 88
    .line 89
    invoke-direct {p2}, Lh1/b;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->e:Lh1/b;

    .line 93
    .line 94
    new-instance p2, Lh1/a;

    .line 95
    .line 96
    invoke-direct {p2, p0}, Lh1/a;-><init>(Lcom/github/barteksc/pdfviewer/PDFView;)V

    .line 97
    .line 98
    .line 99
    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->f:Lh1/a;

    .line 100
    .line 101
    new-instance v1, Lh1/d;

    .line 102
    .line 103
    invoke-direct {v1, p0, p2}, Lh1/d;-><init>(Lcom/github/barteksc/pdfviewer/PDFView;Lh1/a;)V

    .line 104
    .line 105
    .line 106
    iput-object v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->g:Lh1/d;

    .line 107
    .line 108
    new-instance p2, Landroid/graphics/Paint;

    .line 109
    .line 110
    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 111
    .line 112
    .line 113
    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->F:Landroid/graphics/Paint;

    .line 114
    .line 115
    new-instance p2, Landroid/graphics/Paint;

    .line 116
    .line 117
    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 118
    .line 119
    .line 120
    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->G:Landroid/graphics/Paint;

    .line 121
    .line 122
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 123
    .line 124
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 125
    .line 126
    .line 127
    new-instance p2, Lcom/shockwave/pdfium/PdfiumCore;

    .line 128
    .line 129
    invoke-direct {p2, p1}, Lcom/shockwave/pdfium/PdfiumCore;-><init>(Landroid/content/Context;)V

    .line 130
    .line 131
    .line 132
    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->K:Lcom/shockwave/pdfium/PdfiumCore;

    .line 133
    .line 134
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 135
    .line 136
    .line 137
    return-void
.end method

.method public static synthetic a(Lcom/github/barteksc/pdfviewer/PDFView;Li1/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->setOnDrawListener(Li1/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lcom/github/barteksc/pdfviewer/PDFView;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->setSpacing(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lcom/github/barteksc/pdfviewer/PDFView;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->setInvalidPageColor(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Lcom/github/barteksc/pdfviewer/PDFView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->J:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic e(Lcom/github/barteksc/pdfviewer/PDFView;)Lh1/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->g:Lh1/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic f(Lcom/github/barteksc/pdfviewer/PDFView;Ll1/a;Ljava/lang/String;Li1/c;Li1/b;[I)V
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcom/github/barteksc/pdfviewer/PDFView;->I(Ll1/a;Ljava/lang/String;Li1/c;Li1/b;[I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Lcom/github/barteksc/pdfviewer/PDFView;Li1/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->setOnDrawAllListener(Li1/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h(Lcom/github/barteksc/pdfviewer/PDFView;Ll1/a;Ljava/lang/String;Li1/c;Li1/b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/github/barteksc/pdfviewer/PDFView;->H(Ll1/a;Ljava/lang/String;Li1/c;Li1/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i(Lcom/github/barteksc/pdfviewer/PDFView;Li1/d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->setOnPageChangeListener(Li1/d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic j(Lcom/github/barteksc/pdfviewer/PDFView;Li1/f;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->setOnPageScrollListener(Li1/f;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic k(Lcom/github/barteksc/pdfviewer/PDFView;Li1/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->setOnRenderListener(Li1/g;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic l(Lcom/github/barteksc/pdfviewer/PDFView;Li1/h;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->setOnTapListener(Li1/h;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic m(Lcom/github/barteksc/pdfviewer/PDFView;Li1/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->setOnPageErrorListener(Li1/e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic n(Lcom/github/barteksc/pdfviewer/PDFView;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->setDefaultPage(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic o(Lcom/github/barteksc/pdfviewer/PDFView;Lk1/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->setScrollHandle(Lk1/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private setDefaultPage(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->I:I

    .line 2
    .line 3
    return-void
.end method

.method private setInvalidPageColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->H:I

    .line 2
    .line 3
    return-void
.end method

.method private setOnDrawAllListener(Li1/a;)V
    .locals 0

    .line 1
    return-void
.end method

.method private setOnDrawListener(Li1/a;)V
    .locals 0

    .line 1
    return-void
.end method

.method private setOnPageChangeListener(Li1/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->C:Li1/d;

    .line 2
    .line 3
    return-void
.end method

.method private setOnPageErrorListener(Li1/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->E:Li1/e;

    .line 2
    .line 3
    return-void
.end method

.method private setOnPageScrollListener(Li1/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->D:Li1/f;

    .line 2
    .line 3
    return-void
.end method

.method private setOnRenderListener(Li1/g;)V
    .locals 0

    .line 1
    return-void
.end method

.method private setOnTapListener(Li1/h;)V
    .locals 0

    .line 1
    return-void
.end method

.method private setScrollHandle(Lk1/a;)V
    .locals 0

    .line 1
    return-void
.end method

.method private setSpacing(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lm1/d;->a(Landroid/content/Context;I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->S:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public A(Ljava/io/File;)Lcom/github/barteksc/pdfviewer/PDFView$b;
    .locals 2

    .line 1
    new-instance v0, Lcom/github/barteksc/pdfviewer/PDFView$b;

    .line 2
    .line 3
    new-instance v1, Ll1/b;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ll1/b;-><init>(Ljava/io/File;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-direct {v0, p0, v1, p1}, Lcom/github/barteksc/pdfviewer/PDFView$b;-><init>(Lcom/github/barteksc/pdfviewer/PDFView;Ll1/a;Lcom/github/barteksc/pdfviewer/PDFView$a;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public B()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->O:Z

    .line 2
    .line 3
    return v0
.end method

.method public C()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->N:Z

    .line 2
    .line 3
    return v0
.end method

.method public D()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->J:Z

    .line 2
    .line 3
    return v0
.end method

.method public E()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->t:F

    .line 2
    .line 3
    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->a:F

    .line 4
    .line 5
    cmpl-float v0, v0, v1

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public F(I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->G(IZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public G(IZ)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->r(I)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    neg-float v0, v0

    .line 6
    iget-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->J:Z

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    iget-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->f:Lh1/a;

    .line 13
    .line 14
    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    .line 15
    .line 16
    invoke-virtual {p2, v1, v0}, Lh1/a;->g(FF)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    .line 21
    .line 22
    invoke-virtual {p0, p2, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->O(FF)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    if-eqz p2, :cond_2

    .line 27
    .line 28
    iget-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->f:Lh1/a;

    .line 29
    .line 30
    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    .line 31
    .line 32
    invoke-virtual {p2, v1, v0}, Lh1/a;->f(FF)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    iget p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    .line 37
    .line 38
    invoke-virtual {p0, v0, p2}, Lcom/github/barteksc/pdfviewer/PDFView;->O(FF)V

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-virtual {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->W(I)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final H(Ll1/a;Ljava/lang/String;Li1/c;Li1/b;)V
    .locals 6

    .line 1
    const/4 v5, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v4, p4

    .line 7
    invoke-virtual/range {v0 .. v5}, Lcom/github/barteksc/pdfviewer/PDFView;->I(Ll1/a;Ljava/lang/String;Li1/c;Li1/b;[I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final I(Ll1/a;Ljava/lang/String;Li1/c;Li1/b;[I)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    iput-object p5, p0, Lcom/github/barteksc/pdfviewer/PDFView;->h:[I

    .line 8
    .line 9
    invoke-static {p5}, Lm1/a;->b([I)[I

    .line 10
    .line 11
    .line 12
    move-result-object p5

    .line 13
    iput-object p5, p0, Lcom/github/barteksc/pdfviewer/PDFView;->i:[I

    .line 14
    .line 15
    iget-object p5, p0, Lcom/github/barteksc/pdfviewer/PDFView;->h:[I

    .line 16
    .line 17
    invoke-static {p5}, Lm1/a;->a([I)[I

    .line 18
    .line 19
    .line 20
    move-result-object p5

    .line 21
    iput-object p5, p0, Lcom/github/barteksc/pdfviewer/PDFView;->j:[I

    .line 22
    .line 23
    :cond_0
    iput-object p3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->A:Li1/c;

    .line 24
    .line 25
    iput-object p4, p0, Lcom/github/barteksc/pdfviewer/PDFView;->B:Li1/b;

    .line 26
    .line 27
    iget-object p3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->h:[I

    .line 28
    .line 29
    const/4 p4, 0x0

    .line 30
    if-eqz p3, :cond_1

    .line 31
    .line 32
    aget p3, p3, p4

    .line 33
    .line 34
    move v5, p3

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move v5, p4

    .line 37
    :goto_0
    iput-boolean p4, p0, Lcom/github/barteksc/pdfviewer/PDFView;->u:Z

    .line 38
    .line 39
    new-instance v0, Lh1/c;

    .line 40
    .line 41
    iget-object v4, p0, Lcom/github/barteksc/pdfviewer/PDFView;->K:Lcom/shockwave/pdfium/PdfiumCore;

    .line 42
    .line 43
    move-object v3, p0

    .line 44
    move-object v1, p1

    .line 45
    move-object v2, p2

    .line 46
    invoke-direct/range {v0 .. v5}, Lh1/c;-><init>(Ll1/a;Ljava/lang/String;Lcom/github/barteksc/pdfviewer/PDFView;Lcom/shockwave/pdfium/PdfiumCore;I)V

    .line 47
    .line 48
    .line 49
    iput-object v0, v3, Lcom/github/barteksc/pdfviewer/PDFView;->w:Lh1/c;

    .line 50
    .line 51
    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 52
    .line 53
    new-array p2, p4, [Ljava/lang/Void;

    .line 54
    .line 55
    invoke-virtual {v0, p1, p2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    move-object v3, p0

    .line 60
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string p2, "Don\'t call load on a PDF View without recycling it first."

    .line 63
    .line 64
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1
.end method

.method public J(Lcom/shockwave/pdfium/a;II)V
    .locals 1

    .line 1
    sget-object v0, Lcom/github/barteksc/pdfviewer/PDFView$State;->b:Lcom/github/barteksc/pdfviewer/PDFView$State;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->v:Lcom/github/barteksc/pdfviewer/PDFView$State;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->K:Lcom/shockwave/pdfium/PdfiumCore;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/shockwave/pdfium/PdfiumCore;->d(Lcom/shockwave/pdfium/a;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->k:I

    .line 12
    .line 13
    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->L:Lcom/shockwave/pdfium/a;

    .line 14
    .line 15
    iput p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->n:I

    .line 16
    .line 17
    iput p3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->o:I

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->q()V

    .line 20
    .line 21
    .line 22
    new-instance p2, Lcom/github/barteksc/pdfviewer/a;

    .line 23
    .line 24
    invoke-direct {p2, p0}, Lcom/github/barteksc/pdfviewer/a;-><init>(Lcom/github/barteksc/pdfviewer/PDFView;)V

    .line 25
    .line 26
    .line 27
    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->z:Lcom/github/barteksc/pdfviewer/a;

    .line 28
    .line 29
    iget-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->x:Landroid/os/HandlerThread;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Thread;->isAlive()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-nez p2, :cond_0

    .line 36
    .line 37
    iget-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->x:Landroid/os/HandlerThread;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 40
    .line 41
    .line 42
    :cond_0
    new-instance p2, Lh1/e;

    .line 43
    .line 44
    iget-object p3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->x:Landroid/os/HandlerThread;

    .line 45
    .line 46
    invoke-virtual {p3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->K:Lcom/shockwave/pdfium/PdfiumCore;

    .line 51
    .line 52
    invoke-direct {p2, p3, p0, v0, p1}, Lh1/e;-><init>(Landroid/os/Looper;Lcom/github/barteksc/pdfviewer/PDFView;Lcom/shockwave/pdfium/PdfiumCore;Lcom/shockwave/pdfium/a;)V

    .line 53
    .line 54
    .line 55
    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->y:Lh1/e;

    .line 56
    .line 57
    invoke-virtual {p2}, Lh1/e;->e()V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->A:Li1/c;

    .line 61
    .line 62
    if-eqz p1, :cond_1

    .line 63
    .line 64
    iget p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->k:I

    .line 65
    .line 66
    invoke-interface {p1, p2}, Li1/c;->a(I)V

    .line 67
    .line 68
    .line 69
    :cond_1
    iget p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->I:I

    .line 70
    .line 71
    const/4 p2, 0x0

    .line 72
    invoke-virtual {p0, p1, p2}, Lcom/github/barteksc/pdfviewer/PDFView;->G(IZ)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public K(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/github/barteksc/pdfviewer/PDFView$State;->d:Lcom/github/barteksc/pdfviewer/PDFView$State;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->v:Lcom/github/barteksc/pdfviewer/PDFView$State;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->S()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->B:Li1/b;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0, p1}, Li1/b;->onError(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string v0, "PDFView"

    .line 20
    .line 21
    const-string v1, "load pdf error"

    .line 22
    .line 23
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public L()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->getPageCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->S:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->getPageCount()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    div-int v1, v0, v1

    .line 15
    .line 16
    sub-int/2addr v0, v1

    .line 17
    int-to-float v0, v0

    .line 18
    iget-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->J:Z

    .line 19
    .line 20
    const/high16 v2, 0x40000000    # 2.0f

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    .line 25
    .line 26
    iget v3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    .line 27
    .line 28
    add-float/2addr v3, v0

    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    :goto_0
    int-to-float v0, v0

    .line 34
    div-float/2addr v0, v2

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    .line 37
    .line 38
    iget v3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    .line 39
    .line 40
    add-float/2addr v3, v0

    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    goto :goto_0

    .line 46
    :goto_1
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    add-float/2addr v1, v0

    .line 51
    invoke-virtual {p0, v3}, Lcom/github/barteksc/pdfviewer/PDFView;->X(F)F

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    div-float/2addr v1, v0

    .line 56
    float-to-double v0, v1

    .line 57
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    .line 58
    .line 59
    .line 60
    move-result-wide v0

    .line 61
    double-to-int v0, v0

    .line 62
    if-ltz v0, :cond_2

    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->getPageCount()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    add-int/lit8 v1, v1, -0x1

    .line 69
    .line 70
    if-gt v0, v1, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->getCurrentPage()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eq v0, v1, :cond_2

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->W(I)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_2
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->M()V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public M()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpl-float v0, v0, v1

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    .line 9
    .line 10
    cmpl-float v0, v0, v1

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->y:Lh1/e;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x1

    .line 20
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->e:Lh1/b;

    .line 24
    .line 25
    invoke-virtual {v0}, Lh1/b;->h()V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->z:Lcom/github/barteksc/pdfviewer/a;

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/github/barteksc/pdfviewer/a;->e()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->T()V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void
.end method

.method public N(FF)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    .line 2
    .line 3
    add-float/2addr v0, p1

    .line 4
    iget p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    .line 5
    .line 6
    add-float/2addr p1, p2

    .line 7
    invoke-virtual {p0, v0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->O(FF)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public O(FF)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->P(FFZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public P(FFZ)V
    .locals 4

    .line 1
    iget-boolean p3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->J:Z

    .line 2
    .line 3
    const/high16 v0, 0x40000000    # 2.0f

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz p3, :cond_8

    .line 7
    .line 8
    iget p3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    .line 9
    .line 10
    invoke-virtual {p0, p3}, Lcom/github/barteksc/pdfviewer/PDFView;->X(F)F

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    int-to-float v2, v2

    .line 19
    cmpg-float v2, p3, v2

    .line 20
    .line 21
    if-gez v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    div-int/lit8 p1, p1, 0x2

    .line 28
    .line 29
    int-to-float p1, p1

    .line 30
    div-float/2addr p3, v0

    .line 31
    :goto_0
    sub-float/2addr p1, p3

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    cmpl-float v2, p1, v1

    .line 34
    .line 35
    if-lez v2, :cond_1

    .line 36
    .line 37
    move p1, v1

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    add-float v2, p1, p3

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    int-to-float v3, v3

    .line 46
    cmpg-float v2, v2, v3

    .line 47
    .line 48
    if-gez v2, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    int-to-float p1, p1

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->p()F

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    int-to-float v2, v2

    .line 65
    cmpg-float v2, p3, v2

    .line 66
    .line 67
    if-gez v2, :cond_3

    .line 68
    .line 69
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    int-to-float p2, p2

    .line 74
    sub-float/2addr p2, p3

    .line 75
    div-float/2addr p2, v0

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    cmpl-float v0, p2, v1

    .line 78
    .line 79
    if-lez v0, :cond_4

    .line 80
    .line 81
    move p2, v1

    .line 82
    goto :goto_2

    .line 83
    :cond_4
    add-float v0, p2, p3

    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    int-to-float v1, v1

    .line 90
    cmpg-float v0, v0, v1

    .line 91
    .line 92
    if-gez v0, :cond_5

    .line 93
    .line 94
    neg-float p2, p3

    .line 95
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 96
    .line 97
    .line 98
    move-result p3

    .line 99
    int-to-float p3, p3

    .line 100
    add-float/2addr p2, p3

    .line 101
    :cond_5
    :goto_2
    iget p3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    .line 102
    .line 103
    cmpg-float v0, p2, p3

    .line 104
    .line 105
    if-gez v0, :cond_6

    .line 106
    .line 107
    sget-object p3, Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;->c:Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;

    .line 108
    .line 109
    iput-object p3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->d:Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;

    .line 110
    .line 111
    goto/16 :goto_6

    .line 112
    .line 113
    :cond_6
    cmpl-float p3, p2, p3

    .line 114
    .line 115
    if-lez p3, :cond_7

    .line 116
    .line 117
    sget-object p3, Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;->b:Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;

    .line 118
    .line 119
    iput-object p3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->d:Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;

    .line 120
    .line 121
    goto/16 :goto_6

    .line 122
    .line 123
    :cond_7
    sget-object p3, Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;->a:Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;

    .line 124
    .line 125
    iput-object p3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->d:Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;

    .line 126
    .line 127
    goto/16 :goto_6

    .line 128
    .line 129
    :cond_8
    iget p3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    .line 130
    .line 131
    invoke-virtual {p0, p3}, Lcom/github/barteksc/pdfviewer/PDFView;->X(F)F

    .line 132
    .line 133
    .line 134
    move-result p3

    .line 135
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    int-to-float v2, v2

    .line 140
    cmpg-float v2, p3, v2

    .line 141
    .line 142
    if-gez v2, :cond_9

    .line 143
    .line 144
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 145
    .line 146
    .line 147
    move-result p2

    .line 148
    div-int/lit8 p2, p2, 0x2

    .line 149
    .line 150
    int-to-float p2, p2

    .line 151
    div-float/2addr p3, v0

    .line 152
    :goto_3
    sub-float/2addr p2, p3

    .line 153
    goto :goto_4

    .line 154
    :cond_9
    cmpl-float v2, p2, v1

    .line 155
    .line 156
    if-lez v2, :cond_a

    .line 157
    .line 158
    move p2, v1

    .line 159
    goto :goto_4

    .line 160
    :cond_a
    add-float v2, p2, p3

    .line 161
    .line 162
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    int-to-float v3, v3

    .line 167
    cmpg-float v2, v2, v3

    .line 168
    .line 169
    if-gez v2, :cond_b

    .line 170
    .line 171
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 172
    .line 173
    .line 174
    move-result p2

    .line 175
    int-to-float p2, p2

    .line 176
    goto :goto_3

    .line 177
    :cond_b
    :goto_4
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->p()F

    .line 178
    .line 179
    .line 180
    move-result p3

    .line 181
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    int-to-float v2, v2

    .line 186
    cmpg-float v2, p3, v2

    .line 187
    .line 188
    if-gez v2, :cond_c

    .line 189
    .line 190
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    int-to-float p1, p1

    .line 195
    sub-float/2addr p1, p3

    .line 196
    div-float/2addr p1, v0

    .line 197
    goto :goto_5

    .line 198
    :cond_c
    cmpl-float v0, p1, v1

    .line 199
    .line 200
    if-lez v0, :cond_d

    .line 201
    .line 202
    move p1, v1

    .line 203
    goto :goto_5

    .line 204
    :cond_d
    add-float v0, p1, p3

    .line 205
    .line 206
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    int-to-float v1, v1

    .line 211
    cmpg-float v0, v0, v1

    .line 212
    .line 213
    if-gez v0, :cond_e

    .line 214
    .line 215
    neg-float p1, p3

    .line 216
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 217
    .line 218
    .line 219
    move-result p3

    .line 220
    int-to-float p3, p3

    .line 221
    add-float/2addr p1, p3

    .line 222
    :cond_e
    :goto_5
    iget p3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    .line 223
    .line 224
    cmpg-float v0, p1, p3

    .line 225
    .line 226
    if-gez v0, :cond_f

    .line 227
    .line 228
    sget-object p3, Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;->c:Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;

    .line 229
    .line 230
    iput-object p3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->d:Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;

    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_f
    cmpl-float p3, p1, p3

    .line 234
    .line 235
    if-lez p3, :cond_10

    .line 236
    .line 237
    sget-object p3, Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;->b:Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;

    .line 238
    .line 239
    iput-object p3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->d:Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_10
    sget-object p3, Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;->a:Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;

    .line 243
    .line 244
    iput-object p3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->d:Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;

    .line 245
    .line 246
    :goto_6
    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    .line 247
    .line 248
    iput p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    .line 249
    .line 250
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->getPositionOffset()F

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    iget-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->D:Li1/f;

    .line 255
    .line 256
    if-eqz p2, :cond_11

    .line 257
    .line 258
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->getCurrentPage()I

    .line 259
    .line 260
    .line 261
    move-result p3

    .line 262
    invoke-interface {p2, p3, p1}, Li1/f;->a(IF)V

    .line 263
    .line 264
    .line 265
    :cond_11
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->T()V

    .line 266
    .line 267
    .line 268
    return-void
.end method

.method public Q(Lj1/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->v:Lcom/github/barteksc/pdfviewer/PDFView$State;

    .line 2
    .line 3
    sget-object v1, Lcom/github/barteksc/pdfviewer/PDFView$State;->b:Lcom/github/barteksc/pdfviewer/PDFView$State;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcom/github/barteksc/pdfviewer/PDFView$State;->c:Lcom/github/barteksc/pdfviewer/PDFView$State;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->v:Lcom/github/barteksc/pdfviewer/PDFView$State;

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Lj1/a;->h()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->e:Lh1/b;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lh1/b;->b(Lj1/a;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->e:Lh1/b;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lh1/b;->a(Lj1/a;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->T()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public R(Lcom/github/barteksc/pdfviewer/exception/PageRenderingException;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->E:Li1/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/github/barteksc/pdfviewer/exception/PageRenderingException;->a()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {v0, v1, p1}, Li1/e;->a(ILjava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    sget-object v0, Lcom/github/barteksc/pdfviewer/PDFView;->U:Ljava/lang/String;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v2, "Cannot open page "

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/github/barteksc/pdfviewer/exception/PageRenderingException;->a()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public S()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->f:Lh1/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh1/a;->i()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->y:Lh1/e;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lh1/e;->f()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->y:Lh1/e;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->w:Lh1/c;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->e:Lh1/b;

    .line 27
    .line 28
    invoke-virtual {v0}, Lh1/b;->i()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->K:Lcom/shockwave/pdfium/PdfiumCore;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->L:Lcom/shockwave/pdfium/a;

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Lcom/shockwave/pdfium/PdfiumCore;->a(Lcom/shockwave/pdfium/a;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    const/4 v0, 0x0

    .line 43
    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->y:Lh1/e;

    .line 44
    .line 45
    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->h:[I

    .line 46
    .line 47
    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->i:[I

    .line 48
    .line 49
    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->j:[I

    .line 50
    .line 51
    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->L:Lcom/shockwave/pdfium/a;

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    iput-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->M:Z

    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    .line 58
    .line 59
    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    .line 60
    .line 61
    const/high16 v0, 0x3f800000    # 1.0f

    .line 62
    .line 63
    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->t:F

    .line 64
    .line 65
    iput-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->u:Z

    .line 66
    .line 67
    sget-object v0, Lcom/github/barteksc/pdfviewer/PDFView$State;->a:Lcom/github/barteksc/pdfviewer/PDFView$State;

    .line 68
    .line 69
    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->v:Lcom/github/barteksc/pdfviewer/PDFView$State;

    .line 70
    .line 71
    return-void
.end method

.method public T()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public U()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->a:F

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->b0(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public V(FZ)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->J:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->p()F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    neg-float v1, v1

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    int-to-float v2, v2

    .line 17
    add-float/2addr v1, v2

    .line 18
    mul-float/2addr v1, p1

    .line 19
    invoke-virtual {p0, v0, v1, p2}, Lcom/github/barteksc/pdfviewer/PDFView;->P(FFZ)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->p()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    neg-float v0, v0

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    int-to-float v1, v1

    .line 33
    add-float/2addr v0, v1

    .line 34
    mul-float/2addr v0, p1

    .line 35
    iget p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    .line 36
    .line 37
    invoke-virtual {p0, v0, p1, p2}, Lcom/github/barteksc/pdfviewer/PDFView;->P(FFZ)V

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->L()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public W(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->s(I)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->l:I

    .line 11
    .line 12
    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->m:I

    .line 13
    .line 14
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->j:[I

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    if-ltz p1, :cond_1

    .line 19
    .line 20
    array-length v1, v0

    .line 21
    if-ge p1, v1, :cond_1

    .line 22
    .line 23
    aget p1, v0, p1

    .line 24
    .line 25
    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->m:I

    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->M()V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->C:Li1/d;

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->l:I

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->getPageCount()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-interface {p1, v0, v1}, Li1/d;->a(II)V

    .line 41
    .line 42
    .line 43
    :cond_2
    :goto_0
    return-void
.end method

.method public X(F)F
    .locals 1

    .line 1
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->t:F

    .line 2
    .line 3
    mul-float/2addr p1, v0

    .line 4
    return p1
.end method

.method public Y(FLandroid/graphics/PointF;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->t:F

    .line 2
    .line 3
    mul-float/2addr v0, p1

    .line 4
    invoke-virtual {p0, v0, p2}, Lcom/github/barteksc/pdfviewer/PDFView;->Z(FLandroid/graphics/PointF;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public Z(FLandroid/graphics/PointF;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->t:F

    .line 2
    .line 3
    div-float v0, p1, v0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->a0(F)V

    .line 6
    .line 7
    .line 8
    iget p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    .line 9
    .line 10
    mul-float/2addr p1, v0

    .line 11
    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    .line 12
    .line 13
    mul-float/2addr v1, v0

    .line 14
    iget v2, p2, Landroid/graphics/PointF;->x:F

    .line 15
    .line 16
    mul-float v3, v2, v0

    .line 17
    .line 18
    sub-float/2addr v2, v3

    .line 19
    add-float/2addr p1, v2

    .line 20
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 21
    .line 22
    mul-float/2addr v0, p2

    .line 23
    sub-float/2addr p2, v0

    .line 24
    add-float/2addr v1, p2

    .line 25
    invoke-virtual {p0, p1, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->O(FF)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public a0(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->t:F

    .line 2
    .line 3
    return-void
.end method

.method public b0(F)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->f:Lh1/a;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    div-int/lit8 v1, v1, 0x2

    .line 8
    .line 9
    int-to-float v1, v1

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    div-int/lit8 v2, v2, 0x2

    .line 15
    .line 16
    int-to-float v2, v2

    .line 17
    iget v3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->t:F

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2, v3, p1}, Lh1/a;->h(FFFF)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public c0(FFF)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->f:Lh1/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->t:F

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, v1, p3}, Lh1/a;->h(FFFF)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public canScrollHorizontally(I)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->J:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-gez p1, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    .line 10
    .line 11
    cmpg-float v0, v0, v1

    .line 12
    .line 13
    if-gez v0, :cond_0

    .line 14
    .line 15
    return v2

    .line 16
    :cond_0
    if-lez p1, :cond_3

    .line 17
    .line 18
    iget p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    .line 19
    .line 20
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->X(F)F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-float/2addr p1, v0

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    int-to-float v0, v0

    .line 32
    cmpl-float p1, p1, v0

    .line 33
    .line 34
    if-lez p1, :cond_3

    .line 35
    .line 36
    return v2

    .line 37
    :cond_1
    if-gez p1, :cond_2

    .line 38
    .line 39
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    .line 40
    .line 41
    cmpg-float v0, v0, v1

    .line 42
    .line 43
    if-gez v0, :cond_2

    .line 44
    .line 45
    return v2

    .line 46
    :cond_2
    if-lez p1, :cond_3

    .line 47
    .line 48
    iget p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->p()F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    add-float/2addr p1, v0

    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    int-to-float v0, v0

    .line 60
    cmpl-float p1, p1, v0

    .line 61
    .line 62
    if-lez p1, :cond_3

    .line 63
    .line 64
    return v2

    .line 65
    :cond_3
    const/4 p1, 0x0

    .line 66
    return p1
.end method

.method public canScrollVertically(I)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->J:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-gez p1, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    .line 10
    .line 11
    cmpg-float v0, v0, v1

    .line 12
    .line 13
    if-gez v0, :cond_0

    .line 14
    .line 15
    return v2

    .line 16
    :cond_0
    if-lez p1, :cond_3

    .line 17
    .line 18
    iget p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->p()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-float/2addr p1, v0

    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    int-to-float v0, v0

    .line 30
    cmpl-float p1, p1, v0

    .line 31
    .line 32
    if-lez p1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_1
    if-gez p1, :cond_2

    .line 36
    .line 37
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    .line 38
    .line 39
    cmpg-float v0, v0, v1

    .line 40
    .line 41
    if-gez v0, :cond_2

    .line 42
    .line 43
    return v2

    .line 44
    :cond_2
    if-lez p1, :cond_3

    .line 45
    .line 46
    iget p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    .line 47
    .line 48
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->X(F)F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    add-float/2addr p1, v0

    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    int-to-float v0, v0

    .line 60
    cmpl-float p1, p1, v0

    .line 61
    .line 62
    if-lez p1, :cond_3

    .line 63
    .line 64
    return v2

    .line 65
    :cond_3
    const/4 p1, 0x0

    .line 66
    return p1
.end method

.method public computeScroll()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->computeScroll()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->f:Lh1/a;

    .line 12
    .line 13
    invoke-virtual {v0}, Lh1/a;->c()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public getCurrentPage()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public getCurrentXOffset()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    .line 2
    .line 3
    return v0
.end method

.method public getCurrentYOffset()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    .line 2
    .line 3
    return v0
.end method

.method public getDocumentMeta()Lcom/shockwave/pdfium/a$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->L:Lcom/shockwave/pdfium/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-object v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->K:Lcom/shockwave/pdfium/PdfiumCore;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lcom/shockwave/pdfium/PdfiumCore;->b(Lcom/shockwave/pdfium/a;)Lcom/shockwave/pdfium/a$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public getDocumentPageCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public getFilteredUserPageIndexes()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->j:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public getFilteredUserPages()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->i:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public getInvalidPageColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->H:I

    .line 2
    .line 3
    return v0
.end method

.method public getMaxZoom()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->c:F

    .line 2
    .line 3
    return v0
.end method

.method public getMidZoom()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->b:F

    .line 2
    .line 3
    return v0
.end method

.method public getMinZoom()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->a:F

    .line 2
    .line 3
    return v0
.end method

.method public getOnPageChangeListener()Li1/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->C:Li1/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public getOnPageScrollListener()Li1/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->D:Li1/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public getOnRenderListener()Li1/g;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public getOnTapListener()Li1/h;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public getOptimalPageHeight()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    .line 2
    .line 3
    return v0
.end method

.method public getOptimalPageWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    .line 2
    .line 3
    return v0
.end method

.method public getOriginalUserPages()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->h:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public getPageCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->h:[I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->k:I

    .line 8
    .line 9
    return v0
.end method

.method public getPositionOffset()F
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->J:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    .line 6
    .line 7
    neg-float v0, v0

    .line 8
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->p()F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    :goto_0
    int-to-float v2, v2

    .line 17
    sub-float/2addr v1, v2

    .line 18
    div-float/2addr v0, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    .line 21
    .line 22
    neg-float v0, v0

    .line 23
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->p()F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    goto :goto_0

    .line 32
    :goto_1
    const/4 v1, 0x0

    .line 33
    const/high16 v2, 0x3f800000    # 1.0f

    .line 34
    .line 35
    invoke-static {v0, v1, v2}, Lm1/c;->c(FFF)F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    return v0
.end method

.method public getScrollDir()Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->d:Lcom/github/barteksc/pdfviewer/PDFView$ScrollDir;

    .line 2
    .line 3
    return-object v0
.end method

.method public getScrollHandle()Lk1/a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public getSpacingPx()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->S:I

    .line 2
    .line 3
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
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->L:Lcom/shockwave/pdfium/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    iget-object v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->K:Lcom/shockwave/pdfium/PdfiumCore;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lcom/shockwave/pdfium/PdfiumCore;->g(Lcom/shockwave/pdfium/a;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public getZoom()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->t:F

    .line 2
    .line 3
    return v0
.end method

.method public onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->S()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->Q:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->R:Landroid/graphics/PaintFlagsDrawFilter;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    const/4 v0, -0x1

    .line 24
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->u:Z

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_3
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->v:Lcom/github/barteksc/pdfviewer/PDFView$State;

    .line 37
    .line 38
    sget-object v1, Lcom/github/barteksc/pdfviewer/PDFView$State;->c:Lcom/github/barteksc/pdfviewer/PDFView$State;

    .line 39
    .line 40
    if-eq v0, v1, :cond_4

    .line 41
    .line 42
    :goto_1
    return-void

    .line 43
    :cond_4
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    .line 44
    .line 45
    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    .line 46
    .line 47
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 48
    .line 49
    .line 50
    iget-object v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->e:Lh1/b;

    .line 51
    .line 52
    invoke-virtual {v2}, Lh1/b;->f()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_5

    .line 65
    .line 66
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Lj1/a;

    .line 71
    .line 72
    invoke-virtual {p0, p1, v3}, Lcom/github/barteksc/pdfviewer/PDFView;->u(Landroid/graphics/Canvas;Lj1/a;)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_5
    iget-object v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->e:Lh1/b;

    .line 77
    .line 78
    invoke-virtual {v2}, Lh1/b;->e()Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_6

    .line 91
    .line 92
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, Lj1/a;

    .line 97
    .line 98
    invoke-virtual {p0, p1, v3}, Lcom/github/barteksc/pdfviewer/PDFView;->u(Landroid/graphics/Canvas;Lj1/a;)V

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_6
    iget-object v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->T:Ljava/util/List;

    .line 103
    .line 104
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    const/4 v4, 0x0

    .line 113
    if-eqz v3, :cond_7

    .line 114
    .line 115
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    check-cast v3, Ljava/lang/Integer;

    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    invoke-virtual {p0, p1, v3, v4}, Lcom/github/barteksc/pdfviewer/PDFView;->v(Landroid/graphics/Canvas;ILi1/a;)V

    .line 126
    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_7
    iget-object v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->T:Ljava/util/List;

    .line 130
    .line 131
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 132
    .line 133
    .line 134
    iget v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->l:I

    .line 135
    .line 136
    invoke-virtual {p0, p1, v2, v4}, Lcom/github/barteksc/pdfviewer/PDFView;->v(Landroid/graphics/Canvas;ILi1/a;)V

    .line 137
    .line 138
    .line 139
    neg-float v0, v0

    .line 140
    neg-float v1, v1

    .line 141
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 142
    .line 143
    .line 144
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_2

    .line 6
    .line 7
    iget-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->v:Lcom/github/barteksc/pdfviewer/PDFView$State;

    .line 8
    .line 9
    sget-object p2, Lcom/github/barteksc/pdfviewer/PDFView$State;->c:Lcom/github/barteksc/pdfviewer/PDFView$State;

    .line 10
    .line 11
    if-eq p1, p2, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->f:Lh1/a;

    .line 15
    .line 16
    invoke-virtual {p1}, Lh1/a;->i()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->q()V

    .line 20
    .line 21
    .line 22
    iget-boolean p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->J:Z

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    .line 27
    .line 28
    iget p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->l:I

    .line 29
    .line 30
    invoke-virtual {p0, p2}, Lcom/github/barteksc/pdfviewer/PDFView;->r(I)F

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    neg-float p2, p2

    .line 35
    invoke-virtual {p0, p1, p2}, Lcom/github/barteksc/pdfviewer/PDFView;->O(FF)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->l:I

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->r(I)F

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    neg-float p1, p1

    .line 46
    iget p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    .line 47
    .line 48
    invoke-virtual {p0, p1, p2}, Lcom/github/barteksc/pdfviewer/PDFView;->O(FF)V

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->L()V

    .line 52
    .line 53
    .line 54
    :cond_2
    :goto_1
    return-void
.end method

.method public p()F
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/github/barteksc/pdfviewer/PDFView;->getPageCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->J:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    int-to-float v1, v0

    .line 10
    iget v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    .line 11
    .line 12
    mul-float/2addr v1, v2

    .line 13
    add-int/lit8 v0, v0, -0x1

    .line 14
    .line 15
    iget v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->S:I

    .line 16
    .line 17
    mul-int/2addr v0, v2

    .line 18
    int-to-float v0, v0

    .line 19
    add-float/2addr v1, v0

    .line 20
    invoke-virtual {p0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->X(F)F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    return v0

    .line 25
    :cond_0
    int-to-float v1, v0

    .line 26
    iget v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    .line 27
    .line 28
    mul-float/2addr v1, v2

    .line 29
    add-int/lit8 v0, v0, -0x1

    .line 30
    .line 31
    iget v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->S:I

    .line 32
    .line 33
    mul-int/2addr v0, v2

    .line 34
    int-to-float v0, v0

    .line 35
    add-float/2addr v1, v0

    .line 36
    invoke-virtual {p0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->X(F)F

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    return v0
.end method

.method public final q()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->v:Lcom/github/barteksc/pdfviewer/PDFView$State;

    .line 2
    .line 3
    sget-object v1, Lcom/github/barteksc/pdfviewer/PDFView$State;->a:Lcom/github/barteksc/pdfviewer/PDFView$State;

    .line 4
    .line 5
    if-eq v0, v1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    int-to-float v0, v0

    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    int-to-float v1, v1

    .line 24
    iget v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->n:I

    .line 25
    .line 26
    int-to-float v2, v2

    .line 27
    iget v3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->o:I

    .line 28
    .line 29
    int-to-float v3, v3

    .line 30
    div-float/2addr v2, v3

    .line 31
    div-float v3, v0, v2

    .line 32
    .line 33
    float-to-double v3, v3

    .line 34
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    double-to-float v3, v3

    .line 39
    cmpl-float v4, v3, v1

    .line 40
    .line 41
    if-lez v4, :cond_1

    .line 42
    .line 43
    mul-float/2addr v2, v1

    .line 44
    float-to-double v2, v2

    .line 45
    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    .line 46
    .line 47
    .line 48
    move-result-wide v2

    .line 49
    double-to-float v0, v2

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v1, v3

    .line 52
    :goto_0
    iput v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    .line 53
    .line 54
    iput v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    .line 55
    .line 56
    :cond_2
    :goto_1
    return-void
.end method

.method public final r(I)F
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->J:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    int-to-float v0, p1

    .line 6
    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    .line 7
    .line 8
    mul-float/2addr v0, v1

    .line 9
    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->S:I

    .line 10
    .line 11
    mul-int/2addr p1, v1

    .line 12
    int-to-float p1, p1

    .line 13
    add-float/2addr v0, p1

    .line 14
    invoke-virtual {p0, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->X(F)F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_0
    int-to-float v0, p1

    .line 20
    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    .line 21
    .line 22
    mul-float/2addr v0, v1

    .line 23
    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->S:I

    .line 24
    .line 25
    mul-int/2addr p1, v1

    .line 26
    int-to-float p1, p1

    .line 27
    add-float/2addr v0, p1

    .line 28
    invoke-virtual {p0, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->X(F)F

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1
.end method

.method public final s(I)I
    .locals 2

    .line 1
    if-gtz p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->h:[I

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    array-length v1, v0

    .line 10
    if-lt p1, v1, :cond_2

    .line 11
    .line 12
    array-length p1, v0

    .line 13
    add-int/lit8 p1, p1, -0x1

    .line 14
    .line 15
    return p1

    .line 16
    :cond_1
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->k:I

    .line 17
    .line 18
    if-lt p1, v0, :cond_2

    .line 19
    .line 20
    add-int/lit8 v0, v0, -0x1

    .line 21
    .line 22
    return v0

    .line 23
    :cond_2
    return p1
.end method

.method public setMaxZoom(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->c:F

    .line 2
    .line 3
    return-void
.end method

.method public setMidZoom(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->b:F

    .line 2
    .line 3
    return-void
.end method

.method public setMinZoom(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->a:F

    .line 2
    .line 3
    return-void
.end method

.method public setPositionOffset(F)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->V(FZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public setSwipeVertical(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->J:Z

    .line 2
    .line 3
    return-void
.end method

.method public t()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->P:Z

    .line 2
    .line 3
    return v0
.end method

.method public final u(Landroid/graphics/Canvas;Lj1/a;)V
    .locals 12

    .line 1
    invoke-virtual {p2}, Lj1/a;->d()Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p2}, Lj1/a;->e()Landroid/graphics/Bitmap;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-boolean v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->J:Z

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p2}, Lj1/a;->f()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {p0, v2}, Lcom/github/barteksc/pdfviewer/PDFView;->r(I)F

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    move v4, v2

    .line 30
    move v2, v3

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {p2}, Lj1/a;->f()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p0, v2}, Lcom/github/barteksc/pdfviewer/PDFView;->r(I)F

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    move v4, v3

    .line 41
    :goto_0
    invoke-virtual {p1, v2, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 42
    .line 43
    .line 44
    new-instance v5, Landroid/graphics/Rect;

    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    const/4 v8, 0x0

    .line 55
    invoke-direct {v5, v8, v8, v6, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 56
    .line 57
    .line 58
    iget v6, v0, Landroid/graphics/RectF;->left:F

    .line 59
    .line 60
    iget v7, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    .line 61
    .line 62
    mul-float/2addr v6, v7

    .line 63
    invoke-virtual {p0, v6}, Lcom/github/barteksc/pdfviewer/PDFView;->X(F)F

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    iget v7, v0, Landroid/graphics/RectF;->top:F

    .line 68
    .line 69
    iget v8, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    .line 70
    .line 71
    mul-float/2addr v7, v8

    .line 72
    invoke-virtual {p0, v7}, Lcom/github/barteksc/pdfviewer/PDFView;->X(F)F

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    iget v9, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    .line 81
    .line 82
    mul-float/2addr v8, v9

    .line 83
    invoke-virtual {p0, v8}, Lcom/github/barteksc/pdfviewer/PDFView;->X(F)F

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iget v9, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    .line 92
    .line 93
    mul-float/2addr v0, v9

    .line 94
    invoke-virtual {p0, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->X(F)F

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    new-instance v9, Landroid/graphics/RectF;

    .line 99
    .line 100
    float-to-int v10, v6

    .line 101
    int-to-float v10, v10

    .line 102
    float-to-int v11, v7

    .line 103
    int-to-float v11, v11

    .line 104
    add-float/2addr v6, v8

    .line 105
    float-to-int v6, v6

    .line 106
    int-to-float v6, v6

    .line 107
    add-float/2addr v7, v0

    .line 108
    float-to-int v0, v7

    .line 109
    int-to-float v0, v0

    .line 110
    invoke-direct {v9, v10, v11, v6, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 111
    .line 112
    .line 113
    iget v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->r:F

    .line 114
    .line 115
    add-float/2addr v0, v2

    .line 116
    iget v6, p0, Lcom/github/barteksc/pdfviewer/PDFView;->s:F

    .line 117
    .line 118
    add-float/2addr v6, v4

    .line 119
    iget v7, v9, Landroid/graphics/RectF;->left:F

    .line 120
    .line 121
    add-float/2addr v7, v0

    .line 122
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    int-to-float v8, v8

    .line 127
    cmpl-float v7, v7, v8

    .line 128
    .line 129
    if-gez v7, :cond_5

    .line 130
    .line 131
    iget v7, v9, Landroid/graphics/RectF;->right:F

    .line 132
    .line 133
    add-float/2addr v0, v7

    .line 134
    cmpg-float v0, v0, v3

    .line 135
    .line 136
    if-lez v0, :cond_5

    .line 137
    .line 138
    iget v0, v9, Landroid/graphics/RectF;->top:F

    .line 139
    .line 140
    add-float/2addr v0, v6

    .line 141
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    int-to-float v7, v7

    .line 146
    cmpl-float v0, v0, v7

    .line 147
    .line 148
    if-gez v0, :cond_5

    .line 149
    .line 150
    iget v0, v9, Landroid/graphics/RectF;->bottom:F

    .line 151
    .line 152
    add-float/2addr v6, v0

    .line 153
    cmpg-float v0, v6, v3

    .line 154
    .line 155
    if-gtz v0, :cond_2

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_2
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->F:Landroid/graphics/Paint;

    .line 159
    .line 160
    invoke-virtual {p1, v1, v5, v9, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 161
    .line 162
    .line 163
    sget-boolean v0, Lm1/b;->a:Z

    .line 164
    .line 165
    if-eqz v0, :cond_4

    .line 166
    .line 167
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->G:Landroid/graphics/Paint;

    .line 168
    .line 169
    invoke-virtual {p2}, Lj1/a;->f()I

    .line 170
    .line 171
    .line 172
    move-result p2

    .line 173
    rem-int/lit8 p2, p2, 0x2

    .line 174
    .line 175
    if-nez p2, :cond_3

    .line 176
    .line 177
    const/high16 p2, -0x10000

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_3
    const p2, -0xffff01

    .line 181
    .line 182
    .line 183
    :goto_1
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 184
    .line 185
    .line 186
    iget-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->G:Landroid/graphics/Paint;

    .line 187
    .line 188
    invoke-virtual {p1, v9, p2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 189
    .line 190
    .line 191
    :cond_4
    neg-float p2, v2

    .line 192
    neg-float v0, v4

    .line 193
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 194
    .line 195
    .line 196
    return-void

    .line 197
    :cond_5
    :goto_2
    neg-float p2, v2

    .line 198
    neg-float v0, v4

    .line 199
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 200
    .line 201
    .line 202
    return-void
.end method

.method public final v(Landroid/graphics/Canvas;ILi1/a;)V
    .locals 5

    .line 1
    if-eqz p3, :cond_1

    .line 2
    .line 3
    iget-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->J:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lcom/github/barteksc/pdfviewer/PDFView;->r(I)F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0, p2}, Lcom/github/barteksc/pdfviewer/PDFView;->r(I)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    move v4, v1

    .line 18
    move v1, v0

    .line 19
    move v0, v4

    .line 20
    :goto_0
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 21
    .line 22
    .line 23
    iget v2, p0, Lcom/github/barteksc/pdfviewer/PDFView;->p:F

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Lcom/github/barteksc/pdfviewer/PDFView;->X(F)F

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iget v3, p0, Lcom/github/barteksc/pdfviewer/PDFView;->q:F

    .line 30
    .line 31
    invoke-virtual {p0, v3}, Lcom/github/barteksc/pdfviewer/PDFView;->X(F)F

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-interface {p3, p1, v2, v3, p2}, Li1/a;->a(Landroid/graphics/Canvas;FFI)V

    .line 36
    .line 37
    .line 38
    neg-float p2, v1

    .line 39
    neg-float p3, v0

    .line 40
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public w(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->O:Z

    .line 2
    .line 3
    return-void
.end method

.method public x(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/github/barteksc/pdfviewer/PDFView;->Q:Z

    .line 2
    .line 3
    return-void
.end method

.method public y(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->g:Lh1/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lh1/d;->a(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public z(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView;->g:Lh1/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lh1/d;->e(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

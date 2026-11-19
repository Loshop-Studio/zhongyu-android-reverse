.class public Lcom/github/barteksc/pdfviewer/PDFView$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/github/barteksc/pdfviewer/PDFView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field private final a:Lq1/a;

.field private b:[I

.field private c:Z

.field private d:Z

.field private e:Ln1/a;

.field private f:Ln1/a;

.field private g:Ln1/c;

.field private h:Ln1/b;

.field private i:Ln1/d;

.field private j:Ln1/f;

.field private k:Ln1/g;

.field private l:Ln1/h;

.field private m:Ln1/e;

.field private n:I

.field private o:Z

.field private p:Z

.field private q:Ljava/lang/String;

.field private r:Lp1/a;

.field private s:Z

.field private t:I

.field private u:I

.field final synthetic v:Lcom/github/barteksc/pdfviewer/PDFView;


# direct methods
.method private constructor <init>(Lcom/github/barteksc/pdfviewer/PDFView;Lq1/a;)V
    .locals 2

    .line 2
    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->b:[I

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->c:Z

    .line 5
    iput-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->d:Z

    const/4 v1, 0x0

    .line 6
    iput v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->n:I

    .line 7
    iput-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->o:Z

    .line 8
    iput-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->p:Z

    .line 9
    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->q:Ljava/lang/String;

    .line 10
    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->r:Lp1/a;

    .line 11
    iput-boolean v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->s:Z

    .line 12
    iput v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->t:I

    const/4 p1, -0x1

    .line 13
    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->u:I

    .line 14
    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->a:Lq1/a;

    return-void
.end method

.method synthetic constructor <init>(Lcom/github/barteksc/pdfviewer/PDFView;Lq1/a;Lcom/github/barteksc/pdfviewer/PDFView$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/github/barteksc/pdfviewer/PDFView$b;-><init>(Lcom/github/barteksc/pdfviewer/PDFView;Lq1/a;)V

    return-void
.end method

.method static synthetic a(Lcom/github/barteksc/pdfviewer/PDFView$b;)[I
    .locals 0

    iget-object p0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->b:[I

    return-object p0
.end method

.method static synthetic b(Lcom/github/barteksc/pdfviewer/PDFView$b;)Lq1/a;
    .locals 0

    iget-object p0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->a:Lq1/a;

    return-object p0
.end method

.method static synthetic c(Lcom/github/barteksc/pdfviewer/PDFView$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->q:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic d(Lcom/github/barteksc/pdfviewer/PDFView$b;)Ln1/c;
    .locals 0

    iget-object p0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->g:Ln1/c;

    return-object p0
.end method

.method static synthetic e(Lcom/github/barteksc/pdfviewer/PDFView$b;)Ln1/b;
    .locals 0

    iget-object p0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->h:Ln1/b;

    return-object p0
.end method


# virtual methods
.method public f(I)Lcom/github/barteksc/pdfviewer/PDFView$b;
    .locals 0

    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->n:I

    return-object p0
.end method

.method public g(Z)Lcom/github/barteksc/pdfviewer/PDFView$b;
    .locals 0

    iput-boolean p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->p:Z

    return-object p0
.end method

.method public h(Z)Lcom/github/barteksc/pdfviewer/PDFView$b;
    .locals 0

    iput-boolean p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->d:Z

    return-object p0
.end method

.method public i(Z)Lcom/github/barteksc/pdfviewer/PDFView$b;
    .locals 0

    iput-boolean p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->c:Z

    return-object p0
.end method

.method public j()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    invoke-virtual {v0}, Lcom/github/barteksc/pdfviewer/PDFView;->T()V

    .line 2
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    iget-object v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->e:Ln1/a;

    invoke-static {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->a(Lcom/github/barteksc/pdfviewer/PDFView;Ln1/a;)V

    .line 3
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    iget-object v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->f:Ln1/a;

    invoke-static {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->g(Lcom/github/barteksc/pdfviewer/PDFView;Ln1/a;)V

    .line 4
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    iget-object v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->i:Ln1/d;

    invoke-static {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->i(Lcom/github/barteksc/pdfviewer/PDFView;Ln1/d;)V

    .line 5
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    iget-object v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->j:Ln1/f;

    invoke-static {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->j(Lcom/github/barteksc/pdfviewer/PDFView;Ln1/f;)V

    .line 6
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    iget-object v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->k:Ln1/g;

    invoke-static {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->k(Lcom/github/barteksc/pdfviewer/PDFView;Ln1/g;)V

    .line 7
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    iget-object v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->l:Ln1/h;

    invoke-static {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->l(Lcom/github/barteksc/pdfviewer/PDFView;Ln1/h;)V

    .line 8
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    iget-object v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->m:Ln1/e;

    invoke-static {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->m(Lcom/github/barteksc/pdfviewer/PDFView;Ln1/e;)V

    .line 9
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    iget-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->c:Z

    invoke-virtual {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->A(Z)V

    .line 10
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    iget-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->d:Z

    invoke-virtual {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->z(Z)V

    .line 11
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->n:I

    invoke-static {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->n(Lcom/github/barteksc/pdfviewer/PDFView;I)V

    .line 12
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    iget-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->o:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->setSwipeVertical(Z)V

    .line 13
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    iget-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->p:Z

    invoke-virtual {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->x(Z)V

    .line 14
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    iget-object v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->r:Lp1/a;

    invoke-static {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->o(Lcom/github/barteksc/pdfviewer/PDFView;Lp1/a;)V

    .line 15
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    iget-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->s:Z

    invoke-virtual {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->y(Z)V

    .line 16
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->t:I

    invoke-static {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->b(Lcom/github/barteksc/pdfviewer/PDFView;I)V

    .line 17
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->u:I

    invoke-static {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->c(Lcom/github/barteksc/pdfviewer/PDFView;I)V

    .line 18
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    invoke-static {v0}, Lcom/github/barteksc/pdfviewer/PDFView;->e(Lcom/github/barteksc/pdfviewer/PDFView;)Lcom/github/barteksc/pdfviewer/d;

    move-result-object v0

    iget-object v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    invoke-static {v1}, Lcom/github/barteksc/pdfviewer/PDFView;->d(Lcom/github/barteksc/pdfviewer/PDFView;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/github/barteksc/pdfviewer/d;->f(Z)V

    .line 19
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    new-instance v1, Lcom/github/barteksc/pdfviewer/PDFView$b$a;

    invoke-direct {v1, p0}, Lcom/github/barteksc/pdfviewer/PDFView$b$a;-><init>(Lcom/github/barteksc/pdfviewer/PDFView$b;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public k(Ln1/b;)Lcom/github/barteksc/pdfviewer/PDFView$b;
    .locals 0

    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->h:Ln1/b;

    return-object p0
.end method

.method public l(Ln1/c;)Lcom/github/barteksc/pdfviewer/PDFView$b;
    .locals 0

    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->g:Ln1/c;

    return-object p0
.end method

.method public m(Ln1/d;)Lcom/github/barteksc/pdfviewer/PDFView$b;
    .locals 0

    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->i:Ln1/d;

    return-object p0
.end method

.method public n(Ln1/e;)Lcom/github/barteksc/pdfviewer/PDFView$b;
    .locals 0

    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->m:Ln1/e;

    return-object p0
.end method

.method public o(Ln1/f;)Lcom/github/barteksc/pdfviewer/PDFView$b;
    .locals 0

    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->j:Ln1/f;

    return-object p0
.end method

.method public p(Z)Lcom/github/barteksc/pdfviewer/PDFView$b;
    .locals 0

    iput-boolean p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->o:Z

    return-object p0
.end method

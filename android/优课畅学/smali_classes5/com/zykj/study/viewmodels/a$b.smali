.class public final Lcom/zykj/study/viewmodels/a$b;
.super Lcom/zykj/study/viewmodels/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/viewmodels/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/data/PdfEntity;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/data/PdfEntity;)V
    .locals 1

    .line 1
    const-string v0, "pdfEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, Lcom/zykj/study/viewmodels/a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/zykj/study/viewmodels/a$b;->a:Lcom/zykj/study/data/PdfEntity;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()Lcom/zykj/study/data/PdfEntity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/a$b;->a:Lcom/zykj/study/data/PdfEntity;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/viewmodels/a$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/viewmodels/a$b;

    iget-object v1, p0, Lcom/zykj/study/viewmodels/a$b;->a:Lcom/zykj/study/data/PdfEntity;

    iget-object p1, p1, Lcom/zykj/study/viewmodels/a$b;->a:Lcom/zykj/study/data/PdfEntity;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/viewmodels/a$b;->a:Lcom/zykj/study/data/PdfEntity;

    invoke-virtual {v0}, Lcom/zykj/study/data/PdfEntity;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/zykj/study/viewmodels/a$b;->a:Lcom/zykj/study/data/PdfEntity;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SavePage(pdfEntity="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public interface abstract Lcom/zykj/study/data/PdfDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation


# virtual methods
.method public abstract insertPdf(Lcom/zykj/study/data/PdfEntity;Lm7/c;)Ljava/lang/Object;
    .annotation build Landroidx/room/Insert;
        onConflict = 0x1
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/study/data/PdfEntity;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract queryPdf(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM PdfEntity WHERE id = :id"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lm7/c<",
            "-",
            "Lcom/zykj/study/data/PdfEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

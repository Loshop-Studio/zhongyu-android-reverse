.class public final Ld/i/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld/h/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld/h/a<",
        "Ld/g/c;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/CharSequence;

.field public final b:I

.field public final c:I

.field public final d:Ld/f/a/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld/f/a/c<",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/Integer;",
            "Ld/b<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;IILd/f/a/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "II",
            "Ld/f/a/c<",
            "-",
            "Ljava/lang/CharSequence;",
            "-",
            "Ljava/lang/Integer;",
            "Ld/b<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getNextMatch"

    invoke-static {p4, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld/i/b;->a:Ljava/lang/CharSequence;

    iput p2, p0, Ld/i/b;->b:I

    iput p3, p0, Ld/i/b;->c:I

    iput-object p4, p0, Ld/i/b;->d:Ld/f/a/c;

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ld/g/c;",
            ">;"
        }
    .end annotation

    new-instance v0, Ld/i/b$a;

    invoke-direct {v0, p0}, Ld/i/b$a;-><init>(Ld/i/b;)V

    return-object v0
.end method

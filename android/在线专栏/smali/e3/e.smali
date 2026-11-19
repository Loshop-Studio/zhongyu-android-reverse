.class final Le3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld3/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld3/d<",
        "Lb3/c;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/CharSequence;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final b:I

.field private final c:I

.field private final d:Lx2/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/p<",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/Integer;",
            "Lo2/k<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;IILx2/p;)V
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lx2/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "II",
            "Lx2/p<",
            "-",
            "Ljava/lang/CharSequence;",
            "-",
            "Ljava/lang/Integer;",
            "Lo2/k<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getNextMatch"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le3/e;->a:Ljava/lang/CharSequence;

    .line 3
    iput p2, p0, Le3/e;->b:I

    .line 4
    iput p3, p0, Le3/e;->c:I

    .line 5
    iput-object p4, p0, Le3/e;->d:Lx2/p;

    return-void
.end method

.method public static final synthetic b(Le3/e;)Lx2/p;
    .locals 0

    iget-object p0, p0, Le3/e;->d:Lx2/p;

    return-object p0
.end method

.method public static final synthetic c(Le3/e;)Ljava/lang/CharSequence;
    .locals 0

    iget-object p0, p0, Le3/e;->a:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public static final synthetic d(Le3/e;)I
    .locals 0

    iget p0, p0, Le3/e;->c:I

    return p0
.end method

.method public static final synthetic e(Le3/e;)I
    .locals 0

    iget p0, p0, Le3/e;->b:I

    return p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lb3/c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Le3/e$a;

    invoke-direct {v0, p0}, Le3/e$a;-><init>(Le3/e;)V

    return-object v0
.end method

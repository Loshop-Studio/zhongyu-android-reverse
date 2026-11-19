.class public La/n/a/b$b;
.super La/m/p;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/n/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final c:La/m/q;


# instance fields
.field public b:La/e/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/e/i<",
            "La/n/a/b$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, La/n/a/b$b$a;

    invoke-direct {v0}, La/n/a/b$b$a;-><init>()V

    sput-object v0, La/n/a/b$b;->c:La/m/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, La/m/p;-><init>()V

    new-instance v0, La/e/i;

    invoke-direct {v0}, La/e/i;-><init>()V

    iput-object v0, p0, La/n/a/b$b;->b:La/e/i;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    iget-object v0, p0, La/n/a/b$b;->b:La/e/i;

    invoke-virtual {v0}, La/e/i;->g()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-gtz v0, :cond_1

    iget-object v0, p0, La/n/a/b$b;->b:La/e/i;

    .line 1
    iget v3, v0, La/e/i;->d:I

    iget-object v4, v0, La/e/i;->c:[Ljava/lang/Object;

    move v5, v2

    :goto_0
    if-ge v5, v3, :cond_0

    aput-object v1, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    iput v2, v0, La/e/i;->d:I

    return-void

    .line 2
    :cond_1
    iget-object v0, p0, La/n/a/b$b;->b:La/e/i;

    invoke-virtual {v0, v2}, La/e/i;->h(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/n/a/b$a;

    .line 3
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    throw v1
.end method

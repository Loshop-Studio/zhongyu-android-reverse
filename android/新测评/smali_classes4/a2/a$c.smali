.class public abstract La2/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La2/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:I

.field public b:Ls1/c;

.field public c:J

.field public d:Landroid/util/SparseArray;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La2/a$c;->a:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ls1/c;)V
    .locals 5

    .line 1
    iput-object p1, p0, La2/a$c;->b:Ls1/c;

    .line 2
    .line 3
    invoke-virtual {p1}, Ls1/c;->k()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, La2/a$c;->c:J

    .line 8
    .line 9
    new-instance v0, Landroid/util/SparseArray;

    .line 10
    .line 11
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ls1/c;->d()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    if-ge v2, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1, v2}, Ls1/c;->c(I)Ls1/a;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3}, Ls1/a;->c()J

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iput-object v0, p0, La2/a$c;->d:Landroid/util/SparseArray;

    .line 40
    .line 41
    return-void
.end method

.method public getId()I
    .locals 1

    .line 1
    iget v0, p0, La2/a$c;->a:I

    .line 2
    .line 3
    return v0
.end method

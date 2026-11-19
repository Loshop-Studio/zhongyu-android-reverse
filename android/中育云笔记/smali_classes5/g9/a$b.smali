.class public Lg9/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final h:I


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "#4d000000"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sput v0, Lg9/a$b;->h:I

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lg9/a$b;->a:I

    .line 6
    .line 7
    const/16 v1, 0xa

    .line 8
    .line 9
    iput v1, p0, Lg9/a$b;->b:I

    .line 10
    .line 11
    sget v1, Lg9/a$b;->h:I

    .line 12
    .line 13
    iput v1, p0, Lg9/a$b;->c:I

    .line 14
    .line 15
    const/16 v1, 0x10

    .line 16
    .line 17
    iput v1, p0, Lg9/a$b;->d:I

    .line 18
    .line 19
    iput v0, p0, Lg9/a$b;->e:I

    .line 20
    .line 21
    iput v0, p0, Lg9/a$b;->f:I

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    new-array v1, v1, [I

    .line 25
    .line 26
    iput-object v1, p0, Lg9/a$b;->g:[I

    .line 27
    .line 28
    aput v0, v1, v0

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public a()Lg9/a;
    .locals 9

    .line 1
    new-instance v0, Lg9/a;

    .line 2
    .line 3
    iget v1, p0, Lg9/a$b;->a:I

    .line 4
    .line 5
    iget-object v2, p0, Lg9/a$b;->g:[I

    .line 6
    .line 7
    iget v3, p0, Lg9/a$b;->b:I

    .line 8
    .line 9
    iget v4, p0, Lg9/a$b;->c:I

    .line 10
    .line 11
    iget v5, p0, Lg9/a$b;->d:I

    .line 12
    .line 13
    iget v6, p0, Lg9/a$b;->e:I

    .line 14
    .line 15
    iget v7, p0, Lg9/a$b;->f:I

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    invoke-direct/range {v0 .. v8}, Lg9/a;-><init>(I[IIIIIILg9/a$a;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public b(I)Lg9/a$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lg9/a$b;->g:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aput p1, v0, v1

    .line 5
    .line 6
    return-object p0
.end method

.method public c([I)Lg9/a$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lg9/a$b;->g:[I

    .line 2
    .line 3
    return-object p0
.end method

.method public d(I)Lg9/a$b;
    .locals 0

    .line 1
    iput p1, p0, Lg9/a$b;->e:I

    .line 2
    .line 3
    return-object p0
.end method

.method public e(I)Lg9/a$b;
    .locals 0

    .line 1
    iput p1, p0, Lg9/a$b;->f:I

    .line 2
    .line 3
    return-object p0
.end method

.method public f(I)Lg9/a$b;
    .locals 0

    .line 1
    iput p1, p0, Lg9/a$b;->c:I

    .line 2
    .line 3
    return-object p0
.end method

.method public g(I)Lg9/a$b;
    .locals 0

    .line 1
    iput p1, p0, Lg9/a$b;->d:I

    .line 2
    .line 3
    return-object p0
.end method

.method public h(I)Lg9/a$b;
    .locals 0

    .line 1
    iput p1, p0, Lg9/a$b;->a:I

    .line 2
    .line 3
    return-object p0
.end method

.method public i(I)Lg9/a$b;
    .locals 0

    .line 1
    iput p1, p0, Lg9/a$b;->b:I

    .line 2
    .line 3
    return-object p0
.end method

.class public Lm7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lm7/c;->b:I

    .line 5
    .line 6
    iput-object p2, p0, Lm7/c;->d:Ljava/lang/String;

    .line 7
    .line 8
    iput p3, p0, Lm7/c;->c:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lm7/c;->a:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lm7/c;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/c;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lm7/c;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/c;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, Lm7/c;->a:I

    .line 2
    .line 3
    return v0
.end method

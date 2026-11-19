.class public final Lq9/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq9/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:[Lq9/q$a;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    .line 2
    new-array v0, v0, [Lq9/q$a;

    iput-object v0, p0, Lq9/q$a;->a:[Lq9/q$a;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lq9/q$a;->b:I

    .line 4
    iput v0, p0, Lq9/q$a;->c:I

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lq9/q$a;->a:[Lq9/q$a;

    .line 7
    iput p1, p0, Lq9/q$a;->b:I

    and-int/lit8 p1, p2, 0x7

    if-nez p1, :cond_0

    const/16 p1, 0x8

    .line 8
    :cond_0
    iput p1, p0, Lq9/q$a;->c:I

    return-void
.end method


# virtual methods
.method public final a()[Lq9/q$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/q$a;->a:[Lq9/q$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lq9/q$a;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, Lq9/q$a;->c:I

    .line 2
    .line 3
    return v0
.end method

.class public Lt7/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public a:[S

.field public b:I

.field public final synthetic c:Lt7/b;


# direct methods
.method public constructor <init>(Lt7/b;[SI)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt7/b$b;->c:Lt7/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, [S->clone()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [S

    .line 11
    .line 12
    iput-object p1, p0, Lt7/b$b;->a:[S

    .line 13
    .line 14
    iput p3, p0, Lt7/b$b;->b:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a()[S
    .locals 1

    .line 1
    iget-object v0, p0, Lt7/b$b;->a:[S

    .line 2
    .line 3
    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lt7/b$b;->b:I

    .line 2
    .line 3
    return v0
.end method

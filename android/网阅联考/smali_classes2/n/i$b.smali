.class public final Ln/i$b;
.super Ln/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ln/c;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ln/l;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ln/i$b;->d()Ln/i$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public d()Ln/i$a;
    .locals 1

    .line 1
    new-instance v0, Ln/i$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ln/i$a;-><init>(Ln/i$b;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public e(ILjava/lang/Class;)Ln/i$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ln/c;->b()Ln/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ln/i$a;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Ln/i$a;->b(ILjava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

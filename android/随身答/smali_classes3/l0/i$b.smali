.class public final Ll0/i$b;
.super Ll0/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll0/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ll0/c;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ll0/l;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ll0/i$b;->d()Ll0/i$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public d()Ll0/i$a;
    .locals 1

    .line 1
    new-instance v0, Ll0/i$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ll0/i$a;-><init>(Ll0/i$b;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public e(ILjava/lang/Class;)Ll0/i$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ll0/c;->b()Ll0/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ll0/i$a;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Ll0/i$a;->b(ILjava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

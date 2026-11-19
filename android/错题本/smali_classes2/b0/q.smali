.class public final Lb0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lb0/t;

.field public final b:Lw0/d;

.field public c:I


# direct methods
.method public constructor <init>(Lb0/t;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lb0/p;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lb0/p;-><init>(Lb0/q;)V

    .line 7
    .line 8
    .line 9
    const/16 v1, 0x96

    .line 10
    .line 11
    invoke-static {v1, v0}, Lw0/g;->a(ILw0/c;)Lw0/d;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lb0/q;->b:Lw0/d;

    .line 16
    .line 17
    iput-object p1, p0, Lb0/q;->a:Lb0/t;

    .line 18
    .line 19
    return-void
.end method

.class public final Lf0/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lf0/x;

.field public final b:Lb0/d0;


# direct methods
.method public constructor <init>(Lw0/d;)V
    .locals 2

    .line 1
    new-instance v0, Lf0/x;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lf0/x;-><init>(Lw0/d;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lb0/d0;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {p1, v1}, Lb0/d0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lf0/s;->b:Lb0/d0;

    .line 16
    .line 17
    iput-object v0, p0, Lf0/s;->a:Lf0/x;

    .line 18
    .line 19
    return-void
.end method

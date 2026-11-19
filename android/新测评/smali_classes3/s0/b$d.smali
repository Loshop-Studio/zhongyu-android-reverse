.class public Ls0/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public d(Ls0/r;)Ls0/n;
    .locals 1

    .line 1
    new-instance p1, Ls0/b;

    .line 2
    .line 3
    new-instance v0, Ls0/b$d$a;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Ls0/b$d$a;-><init>(Ls0/b$d;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p1, v0}, Ls0/b;-><init>(Ls0/b$b;)V

    .line 9
    .line 10
    .line 11
    return-object p1
.end method

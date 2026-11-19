.class public Lq/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lq/q;)Lq/m;
    .locals 1

    .line 1
    new-instance p1, Lq/b;

    .line 2
    .line 3
    new-instance v0, Lq/b$d$a;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lq/b$d$a;-><init>(Lq/b$d;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p1, v0}, Lq/b;-><init>(Lq/b$b;)V

    .line 9
    .line 10
    .line 11
    return-object p1
.end method

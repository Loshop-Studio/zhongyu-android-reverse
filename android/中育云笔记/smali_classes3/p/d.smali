.class public final Lp/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp/c;


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
.method public bridge synthetic a(Ljava/lang/Object;Lw/n;)Ljava/lang/String;
    .locals 0

    .line 1
    check-cast p1, Lk/t;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lp/d;->b(Lk/t;Lw/n;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public b(Lk/t;Lw/n;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lk/t;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

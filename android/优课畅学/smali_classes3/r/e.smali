.class public final Lr/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/e$a;,
        Lr/e$b;,
        Lr/e$c;
    }
.end annotation


# instance fields
.field public final a:Lr/e$a;


# direct methods
.method public constructor <init>(Lr/e$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/e;->a:Lr/e$a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "data:image"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public b(Ljava/lang/Object;IILl/d;)Lr/n$a;
    .locals 1

    .line 1
    new-instance p2, Lr/n$a;

    .line 2
    .line 3
    new-instance p3, Lg0/b;

    .line 4
    .line 5
    invoke-direct {p3, p1}, Lg0/b;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance p4, Lr/e$b;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v0, p0, Lr/e;->a:Lr/e$a;

    .line 15
    .line 16
    invoke-direct {p4, p1, v0}, Lr/e$b;-><init>(Ljava/lang/String;Lr/e$a;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p2, p3, p4}, Lr/n$a;-><init>(Ll/b;Lcom/bumptech/glide/load/data/d;)V

    .line 20
    .line 21
    .line 22
    return-object p2
.end method

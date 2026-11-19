.class public final Lk/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ln/b;


# direct methods
.method public constructor <init>(Ln/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk/k$a;->a:Ln/b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Ljava/io/InputStream;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Lk/e;
    .locals 0

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lk/k$a;->c(Ljava/io/InputStream;)Lk/e;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Ljava/io/InputStream;)Lk/e;
    .locals 2

    .line 1
    new-instance v0, Lk/k;

    .line 2
    .line 3
    iget-object v1, p0, Lk/k$a;->a:Ln/b;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Lk/k;-><init>(Ljava/io/InputStream;Ln/b;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.class public final Li0/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li0/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ll0/b;


# direct methods
.method public constructor <init>(Ll0/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li0/k$a;->a:Ll0/b;

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

.method public bridge synthetic b(Ljava/lang/Object;)Li0/e;
    .locals 0

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Li0/k$a;->c(Ljava/io/InputStream;)Li0/e;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Ljava/io/InputStream;)Li0/e;
    .locals 2

    .line 1
    new-instance v0, Li0/k;

    .line 2
    .line 3
    iget-object v1, p0, Li0/k$a;->a:Ll0/b;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Li0/k;-><init>(Ljava/io/InputStream;Ll0/b;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

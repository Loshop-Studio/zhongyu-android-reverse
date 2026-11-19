.class public final Lretrofit2/KotlinExtensions$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldf/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lretrofit2/KotlinExtensions;->c(Ldf/d;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lsd/j;


# direct methods
.method public constructor <init>(Lsd/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lretrofit2/KotlinExtensions$f;->a:Lsd/j;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ldf/d;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "t"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lretrofit2/KotlinExtensions$f;->a:Lsd/j;

    .line 12
    .line 13
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 14
    .line 15
    invoke-static {p2}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-static {p2}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-interface {p1, p2}, Lvc/c;->resumeWith(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public b(Ldf/d;Ldf/c0;)V
    .locals 1

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "response"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lretrofit2/KotlinExtensions$f;->a:Lsd/j;

    .line 12
    .line 13
    invoke-static {p2}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-interface {p1, p2}, Lvc/c;->resumeWith(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

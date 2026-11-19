.class public final Ld8/a;
.super Lretrofit2/l;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/gson/g;


# direct methods
.method public constructor <init>(Lcom/google/gson/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld8/a;->a:Lcom/google/gson/g;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/reflect/Type;)Lretrofit2/m;
    .locals 2

    .line 1
    new-instance v0, Lk1/a;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lk1/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ld8/a;->a:Lcom/google/gson/g;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcom/google/gson/g;->d(Lk1/a;)Lcom/google/gson/p;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Ld8/b;

    .line 13
    .line 14
    invoke-direct {v1, p1, v0}, Ld8/b;-><init>(Lcom/google/gson/g;Lcom/google/gson/p;)V

    .line 15
    .line 16
    .line 17
    return-object v1
.end method

.method public final b(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/p0;)Lretrofit2/m;
    .locals 0

    .line 1
    new-instance p2, Lk1/a;

    .line 2
    .line 3
    invoke-direct {p2, p1}, Lk1/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ld8/a;->a:Lcom/google/gson/g;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lcom/google/gson/g;->d(Lk1/a;)Lcom/google/gson/p;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    new-instance p3, Lo2/a;

    .line 13
    .line 14
    invoke-direct {p3, p1, p2}, Lo2/a;-><init>(Lcom/google/gson/g;Lcom/google/gson/p;)V

    .line 15
    .line 16
    .line 17
    return-object p3
.end method
